package bp.eftlab.demo.paymastergui;

import java.util.UUID;

public class GenerateDemoData {
	private static final String text[] = { "echo \"{\\\"associatedData\\\":{},\\\"balance\\\":{\\\"dbId\\\":\\\"",
			"\\\",\\\"scale\\\":100,\\\"value\\\":",
			"},\\\"currency\\\":\\\"JMD\\\",\\\"deltas\\\":[],\\\"financiallyResponsible\\\":",
			",\\\"identifiers\\\":[{\\\"encryptionType\\\":\\\"NONE\\\",\\\"encryptionTypeExtended\\\":null,\\\"financialInstrumentId\\\":\\\"",
			"\\\",\\\"id\\\":\\\"",
			"\\\",\\\"subIdentifier\\\":[],\\\"type\\\":\\\"",
			"\\\",\\\"value\\\":\\\"",
			"\\\"}],\\\"inheritProcessingPipelinesFromParent\\\":",
			",\\\"instrumentId\\\":\\\"",
			"\\\",\\\"parentAccountId\\\":",
			",\\\"pipelines\\\":[]}\" ",
			" " };
	private static final String ELECTRICITY_FILE = "/tmp/incoming/test_file/electricity.bills.json";
	private static final String WATER_FILE = "/tmp/incoming/test_file/water.bills.json";
	private static final String PAYMASTER_FILE = "/tmp/incoming/test_file/paymaster.json";
	
	private static String NewId() {
		return UUID.randomUUID().toString();
	}
	
	public static void main(String[] args) {
		Generate("My Electric Company", ELECTRICITY_FILE, "ELEC_", -1);
		Generate("My Water Company", WATER_FILE, "WAT_", -1);
		Generate("Paymaster", PAYMASTER_FILE, "MID", 10000);
	}
	
	private static void Generate(String brand, String file, String prefix, int multiplier) {
		String parentId = NewId();
		Generate(NewId(), 0, "false", parentId, NewId(), "BRAND", brand, "false", "null", ">", file);
		for (int i=0; i<100; ++i) {
			String id = prefix + i;
			if (prefix.equals("MID")) {
				id = "MID_" + String.format("%15s", String.valueOf(i / 5)).replace(' ', '0') + "_TID_" + String.format("%8s", String.valueOf(i % 5)).replace(' ', '0'); 
			}
			Generate(NewId(), i*100 * multiplier, "true", NewId(), NewId(), "ACCOUNT_NUMBER", id, "true",
					"\\\"" + parentId + "\\\"", ">>", file);
		}
	}

	private static void Generate(String dbId, int balance, String financiallyResponsible, String financialInstrumentId, String idId, String idType,
			String idValue, String inheritPipelies, String parent, String outputMode, String file) {
		System.out.println(text[0] + dbId + text[1] + balance + text[2] + financiallyResponsible + text[3] + financialInstrumentId + text[4] + idId + text[5] +
				idType + text[6] + idValue + text[7] + inheritPipelies + text[8] + financialInstrumentId + text[9] + parent + text[10] + outputMode + text[11] + file);
		
	}
}
