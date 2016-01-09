package iotsuite.semanticmodel;

public class ConsumeInfo {

	String consumeInfoType, consumeInfoStructField, consumeInfoStructFieldType;

	public ConsumeInfo(String consumeInfoType, String consumeInfoStructField,
			String consumeInfoStructFieldType) {

		this.consumeInfoType = consumeInfoType;
		this.consumeInfoStructField = consumeInfoStructField;
		this.consumeInfoStructFieldType = consumeInfoStructFieldType;
	}

	public String getConsumeInfoType() {
		return consumeInfoType;
	}

	public String getConsumeInfoStructField() {
		return consumeInfoStructField;
	}

	public String getConsumeInfoStructFieldType() {
		return consumeInfoStructFieldType;
	}

}
