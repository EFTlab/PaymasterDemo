package bp.eftlab.demo.paymastergui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.TextNode;

public class App extends JFrame {
	private static final long serialVersionUID = -3561241504107993042L;
	private JComboBox<String> terminal_;
	private JComboBox<String> bill_;
	private JTextField scale_ = new JTextField("100");
	private JTextField value_ = new JTextField("2000");
	private JTextArea request_ = new JTextArea();
	private JTextArea response_ = new JTextArea();
	private JButton balance_ = new JButton("Get Bill Amount");
	private JButton txn_ = new JButton("Pay Bill");

	public static void main(String[] args) {
		new App();
	}

	private App() {
		super("Paymaster Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setupComponents();
		layoutFrame();
		eventHandlers();
		setVisible(true);
		setSize(1100, 500);
	}

	private void eventHandlers() {
		balance_.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getBalance();
			}
		});
		txn_.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				processTxn();
			}
		});
	}

	private void getBalance() {
		ObjectMapper mapper = new ObjectMapper();
		try {
			ObjectNode balanceNode = mapper.readValue(BasicMessages.BALANCE_ENQUIRY, ObjectNode.class);
			updateWithDateTimeEtc(balanceNode);
			request_.setText(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(balanceNode));
			exchangeRequest();
		} catch (Exception e) {
			request_.setText(e.getMessage());
			e.printStackTrace();
		}
	}

	private void exchangeRequest() {
		try {
			Socket messageExchange = new Socket("localhost", 7987);
			int lenBytes = 4;
			int length[] = new int[lenBytes];
			long len = request_.getText().length();
			for (int i=lenBytes - 1; i>=0; --i) {
				length[i] = (int) (len % 256);
				len -= length[i];
				len /= 256;
			}
			OutputStream out = messageExchange.getOutputStream();
			for (int i=0; i<lenBytes; ++i) {
				out.write(length[i]);
			}
			out.write(request_.getText().getBytes());
			out.flush();
			
			InputStream in = messageExchange.getInputStream();
			len = 0;
			for (int i=0; i<lenBytes; ++i) {
				length[i] = in.read();
				len *= 256;
				len += length[i];
			}
			byte data[] = new byte[(int)len];
			int offset = 0;
			while (offset != len)
				offset += in.read(data, offset, (int) len - offset);
			response_.setText(new String(data));
		} catch (Exception e) {
			response_.setText(e.getMessage());
			e.printStackTrace();
		}
	}

	private void updateWithDateTimeEtc(ObjectNode balanceNode) {
		String midtid = terminal_.getSelectedItem().toString();
		String mid = midtid.substring(4, 19);
		String tid = midtid.substring(24);
		Set(balanceNode, new String[] {"environment", "merchant", "id", "id" }, mid);
		Set(balanceNode, new String[] {"environment", "pointOfInteraction", "components", "[0]", "id", "id" }, tid);
		Set(balanceNode, new String[] {"environment", "components", "[0]", "id", "id" }, tid);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSS00 XXX");
		String now = sdf.format(new Date());
		Set(balanceNode, new String[] {"creationDateTime" }, now);
		Set(balanceNode, new String[] {"transactionRequestDetails", "transactionIdentification", "transactionDateTime" }, now);
		Set(balanceNode, new String[] {"transactionRequestDetails", "transactionIdentification", "transactionReference" }, String.valueOf(new Date().getTime()));
	}

	private void Set(JsonNode node, String[] path, String data) {
		Set(node, path, 0, data);
	}
	
	private void Set(JsonNode node, String[] path, int i, String data) {
		if (i >= path.length) {
			return;
		}
		if (path[i].startsWith("[") && path[i].endsWith("]")) {
			ArrayNode nodeObj;
			try {
				nodeObj = (ArrayNode) node;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(this, path[i] + ": " + String.join(",", path) + " at " + i + "; " + e.getMessage());
				e.printStackTrace();
				return;
			}
			if (nodeObj == null)
				return;
			int ix = Integer.parseInt(path[i].substring(1, path[i].length() - 1));
			if (i == path.length - 1) {
				nodeObj.set(ix, new TextNode(data));
			} else {
				Set(nodeObj.get(ix), path, i+1, data);
			}
		}  else {
			ObjectNode nodeObj = null;
			try {
				nodeObj = (ObjectNode) node;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(this, path[i] + ": " + String.join(",", path) + " at " + i + "; " + e.getMessage());
				e.printStackTrace();
				return;
			}
			if (nodeObj == null)
				return;	
			if (i == path.length - 1) {
				nodeObj.set(path[i], new TextNode(data));
			} else {
				Set(nodeObj.get(path[i]), path, i+1, data);
			}
		}
	}

	boolean tryParseLong(String value) {
		try {
			Long.parseLong(value);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	private void processTxn() {
		if (!tryParseLong(scale_.getText())) {
			JOptionPane.showMessageDialog(this, "Invalid scale (NAN)");
			return;
		}
		if (!tryParseLong(value_.getText())) {
			JOptionPane.showMessageDialog(this, "Invalid scale (NAN)");
			return;
		}
		long scale = Long.parseLong(scale_.getText());
		long value = Long.parseLong(value_.getText());
		if (scale < 1) {
			JOptionPane.showMessageDialog(this, "Invalid scale must be 1 or greater");
			return;
		}
		if (value < 0) {
			JOptionPane.showMessageDialog(this, "Invalid value, must be 0 or greater");
			return;
		}
	}

	private void setupComponents() {
		ArrayList<String> midtid = new ArrayList<String>();
		ArrayList<String> bills = new ArrayList<String>();
		for (int i = 0; i < 100; ++i) {
			midtid.add("MID_" + String.format("%15s", String.valueOf(i / 5)).replace(' ', '0') + "_TID_"
					+ String.format("%8s", String.valueOf(i % 5)).replace(' ', '0'));
			bills.add("ELEC_" + i);
			bills.add("WAT_" + i);
		}
		terminal_ = new JComboBox<String>(midtid.toArray(new String[0]));
		bill_ = new JComboBox<String>(bills.toArray(new String[0]));
	}

	private void layoutFrame() {
		setLayout(new BorderLayout());

		JPanel left = new JPanel(new GridLayout(5, 2));
		left.add(new JLabel("Terminal"));
		left.add(terminal_);
		left.add(new JLabel("Bill"));
		left.add(bill_);
		left.add(new JLabel("Scale"));
		left.add(scale_);
		left.add(new JLabel("Value"));
		left.add(value_);
		left.add(balance_);
		left.add(txn_);

		JSplitPane right = new JSplitPane(JSplitPane.VERTICAL_SPLIT, new JScrollPane(request_),
				new JScrollPane(response_));

		this.add(new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, left, right), BorderLayout.CENTER);
	}
}
