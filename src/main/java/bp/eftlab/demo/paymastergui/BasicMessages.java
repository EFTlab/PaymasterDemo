package bp.eftlab.demo.paymastergui;

public class BasicMessages {
	public static final String BALANCE_ENQUIRY = "{" +
			"   \"batchTransfer\" : null," +
			"   \"context\" : {" +
			"      \"payment\" : {" +
			"         \"additionalData\" : null," +
			"         \"attendanceContext\" : \"ATTD\"," +
			"         \"attendantLanguage\" : \"UNKNOWN\"," +
			"         \"attendantMessageCapable\" : true," +
			"         \"cardDataEntryMode\" : \"PHYS\"," +
			"         \"cardPresent\" : true," +
			"         \"cardholderPresent\" : true," +
			"         \"fallbackIndicator\" : false," +
			"         \"onLine\" : true," +
			"         \"serviceData\" : null," +
			"         \"supportedPaymentOption\" : null," +
			"         \"transactionChannel\" : \"BRAN\"," +
			"         \"transactionEnvironment\" : \"PUBL\"" +
			"      }," +
			"      \"sale\" : {" +
			"         \"additionalSaleData\" : null," +
			"         \"cashierIdentification\" : null," +
			"         \"cashierIdentificationOriginal\" : null," +
			"         \"deliveryNoteNumber\" : null," +
			"         \"invoiceNumber\" : null," +
			"         \"purchaseOrderNumber\" : null," +
			"         \"remainingAmount\" : null," +
			"         \"saleIdentification\" : null," +
			"         \"saleReconciliationIdentification\" : null," +
			"         \"saleReferenceNumber\" : \"BPUnitTest\"," +
			"         \"shiftNumber\" : null," +
			"         \"splitPayment\" : null," +
			"         \"sponsoredMerchant\" : null" +
			"      }" +
			"   }," +
			"   \"creationDateTime\" : \"2014-08-12 07:28:34.1000000 -05:00\"," +
			"   \"eftlabIdentifier\" : null," +
			"   \"environment\" : {" +
			"      \"acquirerId\" : null," +
			"      \"acquirerIdVersion\" : null," +
			"      \"financialInstrumentPresenters\" : [" +
			"         {" +
			"            \"addressVerification\" : null," +
			"            \"authentication\" : null," +
			"            \"identifications\" : null," +
			"            \"language\" : null," +
			"            \"names\" : null," +
			"            \"personalData\" : null," +
			"            \"vehicle\" : null" +
			"         }" +
			"      ]," +
			"      \"merchant\" : {" +
			"         \"address\" : {" +
			"            \"addressAdditionalLines\" : null," +
			"            \"addressLine1\" : \"1 Great George St, London SW1P 3AA\"," +
			"            \"country\" : null," +
			"            \"latitude\" : null," +
			"            \"longitude\" : null," +
			"            \"postZip\" : null," +
			"            \"stateCounty\" : null," +
			"            \"townCityLocality\" : null" +
			"         }," +
			"         \"commonName\" : \"EFTlab PTY\"," +
			"         \"countryCode\" : \"388_JAMAICA\"," +
			"         \"id\" : {" +
			"            \"createdBy\" : \"Internal\"," +
			"            \"id\" : \"012345678901234\"," +
			"            \"shortName\" : \"EFTlabPTY\"," +
			"            \"type\" : \"MERCHANT\"" +
			"         }," +
			"         \"locationCategory\" : \"FIXED\"," +
			"         \"schemeData\" : null" +
			"      }," +
			"      \"pointOfInteraction\" : {" +
			"         \"additionalData\" : null," +
			"         \"capabilities\" : {" +
			"            \"additionalTextData\" : null," +
			"            \"cardReadingCapabilities\" : [ \"PHYSICAL\", \"MAGNETIC_STRIPE\", \"ICC\", \"PROXIMITY_READER_EMV\" ]," +
			"            \"cardholderVerificationCapabilities\" : [" +
			"               \"MANUAL_SIGNATURE\"," +
			"               \"ONLINE_PIN\"," +
			"               \"OFFLINE_PIN\"," +
			"               \"OFFLINE_PIN_ENCRYPTED\"" +
			"            ]," +
			"            \"displayCapabilities\" : null," +
			"            \"onLineCapabilities\" : \"ONLINE\"," +
			"            \"printLineWidth\" : 40" +
			"         }," +
			"         \"components\" : [" +
			"            {" +
			"               \"assessments\" : null," +
			"               \"characteristics\" : null," +
			"               \"componentType\" : \"TERMINAL\"," +
			"               \"id\" : {" +
			"                  \"createdBy\" : \"EFTlabPTY\"," +
			"                  \"id\" : \"01234567\"," +
			"                  \"shortName\" : \"My first terminal\"," +
			"                  \"type\" : \"ORIGINATING_POI\"" +
			"               }," +
			"               \"standardCompliance\" : null," +
			"               \"status\" : \"IN_OPERATION\"," +
			"               \"statusVersion\" : \"1.12\"" +
			"            }" +
			"         ]," +
			"         \"groupId\" : \"EFTlab\"," +
			"         \"id\" : {" +
			"            \"createdBy\" : \"EFTlabPTY\"," +
			"            \"id\" : \"01234567\"," +
			"            \"shortName\" : \"My first terminal\"," +
			"            \"type\" : \"ORIGINATING_POI\"" +
			"         }," +
			"         \"serviceData\" : null," +
			"         \"systemName\" : \"EFTlabICC\"" +
			"      }" +
			"   }," +
			"   \"initiatedBy\" : null," +
			"   \"messageClass\" : \"AUTHORIZATION\"," +
			"   \"messageFunction\" : \"REQUEST\"," +
			"   \"messageOrigin\" : \"Other\"," +
			"   \"messageRelayInformation\" : null," +
			"   \"networkMgmtInformation\" : null," +
			"   \"originatingProtocol\" : \"EFTlabJSON 1.0.0\"," +
			"   \"repeat\" : false," +
			"   \"securityTrailer\" : null," +
			"   \"sentTo\" : {" +
			"      \"createdBy\" : \"EFTlab\"," +
			"      \"id\" : \"BP-SimIso1993Host\"," +
			"      \"shortName\" : \"BP-Sim\"," +
			"      \"type\" : \"DELEGATE_ISSUER\"" +
			"   }," +
			"   \"transactionRequestDetails\" : {" +
			"      \"additionalService\" : null," +
			"      \"additionalTransactionData\" : null," +
			"      \"draftCaptureFlag\" : null," +
			"      \"failureReason\" : null," +
			"      \"initiatorTransactionIdentification\" : \"1\"," +
			"      \"interchangeData\" : null," +
			"      \"merchantCategoryCode\" : \"5994\"," +
			"      \"merchantOverride\" : false," +
			"      \"originalTransaction\" : null," +
			"      \"reconciliationIdentification\" : null," +
			"      \"requestResponse\" : null," +
			"      \"requestResult\" : null," +
			"      \"reverseLinkedTransactions\" : false," +
			"      \"serviceAttribute\" : null," +
			"      \"transactionDetails\" : {" +
			"         \"accountType\" : null," +
			"         \"additionalData\" : null," +
			"         \"additionalDataMap\" : null," +
			"         \"amountQualifier\" : \"ACTUAL\"," +
			"         \"currency\" : \"JMD\"," +
			"         \"currencyConversionResult\" : null," +
			"         \"detailedAmounts\" : null," +
			"         \"exchangeRates\" : null," +
			"         \"fees\" : null," +
			"         \"iccData\" : null," +
			"         \"onLineReason\" : null," +
			"         \"products\" : [" +
			"            {" +
			"               \"additionalProductInformation\" : null," +
			"               \"productAmount\" : null," +
			"               \"productCode\" : \"ELEC_12345\"," +
			"               \"productQuantity\" : null," +
			"               \"taxType\" : null," +
			"               \"unitOfMeasure\" : null," +
			"               \"unitPrice\" : null," +
			"               \"vat\" : null" +
			"            }" +
			"         ]," +
			"         \"recurringTransaction\" : null," +
			"         \"totalAmount\" : null," +
			"         \"unattendedLevelCategory\" : null," +
			"         \"validityDate\" : null" +
			"      }," +
			"      \"transactionIdentification\" : {" +
			"         \"transactionDateTime\" : \"2014-08-10 06:57:43.1350050 -07:00\"," +
			"         \"transactionReference\" : \"12345\"" +
			"      }," +
			"      \"transactionType\" : \"BALANCE\"" +
			"   }," +
			"   \"transactionResponseDetails\" : null" +
			"}";
	
	public static final String PROCESS_TXN = "{" +
			"   \"batchTransfer\" : null," +
			"   \"context\" : {" +
			"      \"payment\" : {" +
			"         \"additionalData\" : null," +
			"         \"attendanceContext\" : \"ATTD\"," +
			"         \"attendantLanguage\" : \"UNKNOWN\"," +
			"         \"attendantMessageCapable\" : true," +
			"         \"cardDataEntryMode\" : \"PHYS\"," +
			"         \"cardPresent\" : true," +
			"         \"cardholderPresent\" : true," +
			"         \"fallbackIndicator\" : false," +
			"         \"onLine\" : true," +
			"         \"serviceData\" : null," +
			"         \"supportedPaymentOption\" : null," +
			"         \"transactionChannel\" : \"BRAN\"," +
			"         \"transactionEnvironment\" : \"PUBL\"" +
			"      }," +
			"      \"sale\" : {" +
			"         \"additionalSaleData\" : null," +
			"         \"cashierIdentification\" : null," +
			"         \"cashierIdentificationOriginal\" : null," +
			"         \"deliveryNoteNumber\" : null," +
			"         \"invoiceNumber\" : null," +
			"         \"purchaseOrderNumber\" : null," +
			"         \"remainingAmount\" : null," +
			"         \"saleIdentification\" : null," +
			"         \"saleReconciliationIdentification\" : null," +
			"         \"saleReferenceNumber\" : \"BPUnitTest\"," +
			"         \"shiftNumber\" : null," +
			"         \"splitPayment\" : null," +
			"         \"sponsoredMerchant\" : null" +
			"      }" +
			"   }," +
			"   \"creationDateTime\" : \"2014-08-12 07:28:34.1000000 -05:00\"," +
			"   \"eftlabIdentifier\" : null," +
			"   \"environment\" : {" +
			"      \"acquirerId\" : null," +
			"      \"acquirerIdVersion\" : null," +
			"      \"financialInstrumentPresenters\" : [" +
			"         {" +
			"            \"addressVerification\" : null," +
			"            \"authentication\" : null," +
			"            \"identifications\" : null," +
			"            \"language\" : null," +
			"            \"names\" : null," +
			"            \"personalData\" : null," +
			"            \"vehicle\" : null" +
			"         }" +
			"      ]," +
			"      \"financialInstruments\" : [" +
			"         {" +
			"            \"identifiers\" : [" +
			"               {" +
			"                  \"data\" : null," +
			"                  \"encryptionKey\" : null," +
			"                  \"encryptionType\" : null," +
			"                  \"encryptionTypeExtended\" : null," +
			"                  \"fieldType\" : \"PAN\"," +
			"                  \"fieldTypeExtended\" : null," +
			"                  \"id\" : \"4444333322221111\"" +
			"               }," +
			"               {" +
			"                  \"data\" : null," +
			"                  \"encryptionKey\" : null," +
			"                  \"encryptionType\" : null," +
			"                  \"encryptionTypeExtended\" : null," +
			"                  \"fieldType\" : \"START_DATE\"," +
			"                  \"fieldTypeExtended\" : null," +
			"                  \"id\" : \"2014-01-01\"" +
			"               }," +
			"               {" +
			"                  \"data\" : null," +
			"                  \"encryptionKey\" : null," +
			"                  \"encryptionType\" : null," +
			"                  \"encryptionTypeExtended\" : null," +
			"                  \"fieldType\" : \"EXPIRY_DATE\"," +
			"                  \"fieldTypeExtended\" : null," +
			"                  \"id\" : \"2020-12-31\"" +
			"               }," +
			"               {" +
			"                  \"data\" : null," +
			"                  \"encryptionKey\" : null," +
			"                  \"encryptionType\" : null," +
			"                  \"encryptionTypeExtended\" : null," +
			"                  \"fieldType\" : \"SECURITY_CODE\"," +
			"                  \"fieldTypeExtended\" : null," +
			"                  \"id\" : \"123\"" +
			"               }," +
			"               {" +
			"                  \"data\" : null," +
			"                  \"encryptionKey\" : null," +
			"                  \"encryptionType\" : null," +
			"                  \"encryptionTypeExtended\" : null," +
			"                  \"fieldType\" : \"SERVICE_CODE\"," +
			"                  \"fieldTypeExtended\" : null," +
			"                  \"id\" : \"101\"" +
			"               }," +
			"               {" +
			"                  \"data\" : null," +
			"                  \"encryptionKey\" : null," +
			"                  \"encryptionType\" : null," +
			"                  \"encryptionTypeExtended\" : null," +
			"                  \"fieldType\" : \"CARD_SEQUENCE_NUMBER\"," +
			"                  \"fieldTypeExtended\" : null," +
			"                  \"id\" : \"1\"" +
			"               }" +
			"            ]," +
			"            \"reference\" : \"MyFirstCard\"," +
			"            \"type\" : \"CARD\"" +
			"         }" +
			"      ]," +
			"      \"merchant\" : {" +
			"         \"address\" : {" +
			"            \"addressAdditionalLines\" : null," +
			"            \"addressLine1\" : \"1 Great George St, London SW1P 3AA\"," +
			"            \"country\" : null," +
			"            \"latitude\" : null," +
			"            \"longitude\" : null," +
			"            \"postZip\" : null," +
			"            \"stateCounty\" : null," +
			"            \"townCityLocality\" : null" +
			"         }," +
			"         \"commonName\" : \"EFTlab PTY\"," +
			"         \"countryCode\" : \"388_JAMAICA\"," +
			"         \"id\" : {" +
			"            \"createdBy\" : \"Internal\"," +
			"            \"id\" : \"012345678901234\"," +
			"            \"shortName\" : \"EFTlabPTY\"," +
			"            \"type\" : \"MERCHANT\"" +
			"         }," +
			"         \"locationCategory\" : \"FIXED\"," +
			"         \"schemeData\" : null" +
			"      }," +
			"      \"pointOfInteraction\" : {" +
			"         \"additionalData\" : null," +
			"         \"capabilities\" : {" +
			"            \"additionalTextData\" : null," +
			"            \"cardReadingCapabilities\" : [ \"PHYSICAL\", \"MAGNETIC_STRIPE\", \"ICC\", \"PROXIMITY_READER_EMV\" ]," +
			"            \"cardholderVerificationCapabilities\" : [" +
			"               \"MANUAL_SIGNATURE\"," +
			"               \"ONLINE_PIN\"," +
			"               \"OFFLINE_PIN\"," +
			"               \"OFFLINE_PIN_ENCRYPTED\"" +
			"            ]," +
			"            \"displayCapabilities\" : null," +
			"            \"onLineCapabilities\" : \"ONLINE\"," +
			"            \"printLineWidth\" : 40" +
			"         }," +
			"         \"components\" : [" +
			"            {" +
			"               \"assessments\" : null," +
			"               \"characteristics\" : null," +
			"               \"componentType\" : \"TERMINAL\"," +
			"               \"id\" : {" +
			"                  \"createdBy\" : \"EFTlabPTY\"," +
			"                  \"id\" : \"01234567\"," +
			"                  \"shortName\" : \"My first terminal\"," +
			"                  \"type\" : \"ORIGINATING_POI\"" +
			"               }," +
			"               \"standardCompliance\" : null," +
			"               \"status\" : \"IN_OPERATION\"," +
			"               \"statusVersion\" : \"1.12\"" +
			"            }" +
			"         ]," +
			"         \"groupId\" : \"EFTlab\"," +
			"         \"id\" : {" +
			"            \"createdBy\" : \"EFTlabPTY\"," +
			"            \"id\" : \"01234567\"," +
			"            \"shortName\" : \"My first terminal\"," +
			"            \"type\" : \"ORIGINATING_POI\"" +
			"         }," +
			"         \"serviceData\" : null," +
			"         \"systemName\" : \"EFTlabICC\"" +
			"      }" +
			"   }," +
			"   \"initiatedBy\" : null," +
			"   \"messageClass\" : \"AUTHORIZATION\"," +
			"   \"messageFunction\" : \"REQUEST\"," +
			"   \"messageOrigin\" : \"Other\"," +
			"   \"messageRelayInformation\" : null," +
			"   \"networkMgmtInformation\" : null," +
			"   \"originatingProtocol\" : \"EFTlabJSON 1.0.0\"," +
			"   \"repeat\" : false," +
			"   \"securityTrailer\" : null," +
			"   \"sentTo\" : {" +
			"      \"createdBy\" : \"EFTlab\"," +
			"      \"id\" : \"BP-SimIso1993Host\"," +
			"      \"shortName\" : \"BP-Sim\"," +
			"      \"type\" : \"DELEGATE_ISSUER\"" +
			"   }," +
			"   \"transactionRequestDetails\" : {" +
			"      \"additionalService\" : null," +
			"      \"additionalTransactionData\" : null," +
			"      \"draftCaptureFlag\" : null," +
			"      \"failureReason\" : null," +
			"      \"initiatorTransactionIdentification\" : \"1\"," +
			"      \"interchangeData\" : null," +
			"      \"merchantCategoryCode\" : \"5994\"," +
			"      \"merchantOverride\" : false," +
			"      \"originalTransaction\" : null," +
			"      \"reconciliationIdentification\" : null," +
			"      \"requestResponse\" : null," +
			"      \"requestResult\" : null," +
			"      \"reverseLinkedTransactions\" : false," +
			"      \"serviceAttribute\" : null," +
			"      \"transactionDetails\" : {" +
			"         \"accountType\" : null," +
			"         \"additionalData\" : null," +
			"         \"additionalDataMap\" : null," +
			"         \"amountQualifier\" : \"ACTUAL\"," +
			"         \"currency\" : \"JMD\"," +
			"         \"currencyConversionResult\" : null," +
			"         \"detailedAmounts\" : null," +
			"         \"exchangeRates\" : null," +
			"         \"fees\" : null," +
			"         \"iccData\" : null," +
			"         \"onLineReason\" : \"FLOOR_LIMIT\"," +
			"         \"products\" : [" +
			"            {" +
			"               \"additionalProductInformation\" : null," +
			"               \"productAmount\" : null," +
			"               \"productCode\" : \"ELEC_12345\"," +
			"               \"productQuantity\" : null," +
			"               \"taxType\" : null," +
			"               \"unitOfMeasure\" : null," +
			"               \"unitPrice\" : null," +
			"               \"vat\" : null" +
			"            }" +
			"         ]," +
			"         \"recurringTransaction\" : null," +
			"         \"totalAmount\" : {" +
			"            \"scale\" : 2," +
			"            \"value\" : 340" +
			"         }," +
			"         \"unattendedLevelCategory\" : null," +
			"         \"validityDate\" : null" +
			"      }," +
			"      \"transactionIdentification\" : {" +
			"         \"transactionDateTime\" : \"2014-08-10 06:57:43.1350050 -07:00\"," +
			"         \"transactionReference\" : \"12345\"" +
			"      }," +
			"      \"transactionType\" : \"PERSON_TO_BUSINESS\"" +
			"   }," +
			"   \"transactionResponseDetails\" : null" +
			"}";
}
