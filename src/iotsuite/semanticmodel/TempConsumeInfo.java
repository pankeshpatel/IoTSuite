package iotsuite.semanticmodel;

import java.util.ArrayList;
import java.util.List;

public class TempConsumeInfo {

	String tempConsumeInfoName;
	String tempConsumeInfoType;
	List<ConsumeInfo> myTempListOfSingleConsumeInfo = new ArrayList<ConsumeInfo>();

	/*
	 * String tempConsumInfoStructFieldName; String
	 * tempConsumInfoStructFieldType;
	 */
	// String consumeInfoType;
	// List<List<ConsumeInfo>> tempListOfListConsumeInfo = new
	// ArrayList<List<ConsumeInfo>>();
	public String getTempConsumeInfoName() {
		return tempConsumeInfoName;
	}

	/*
	 * public void setTempConsumeInfoName(String tempConsumeInfoName) {
	 * this.tempConsumeInfoName = tempConsumeInfoName; }
	 */

	public String getTempConsumeInfoType() {
		return tempConsumeInfoType;
	}

	public List<ConsumeInfo> getTempListOfSingleConsumeInfo() {
		return myTempListOfSingleConsumeInfo;
	}

	public TempConsumeInfo(String tempConsumeInfoName,
			String tempConsumeInfoType,
			List<ConsumeInfo> tempListOfSingleConsumeInfo) {
		super();
		this.tempConsumeInfoName = tempConsumeInfoName;
		this.tempConsumeInfoType = tempConsumeInfoType;
		this.myTempListOfSingleConsumeInfo = tempListOfSingleConsumeInfo;
	}

	/*
	 * public void setTempConsumeInfoType(String tempConsumeInfoType) {
	 * this.tempConsumeInfoType = tempConsumeInfoType; }
	 */

	/*
	 * public String getTempConsumInfoStructFieldName() { return
	 * tempConsumInfoStructFieldName; }
	 * 
	 * public void setTempConsumInfoStructFieldName( String
	 * tempConsumInfoStructFieldName) { this.tempConsumInfoStructFieldName =
	 * tempConsumInfoStructFieldName; }
	 * 
	 * public String getTempConsumInfoStructFieldType() { return
	 * tempConsumInfoStructFieldType; }
	 * 
	 * public void setTempConsumInfoStructFieldType( String
	 * tempConsumInfoStructFieldType) { this.tempConsumInfoStructFieldType =
	 * tempConsumInfoStructFieldType; }
	 */

	/*
	 * public TempConsumeInfo(String tempConsumeInfoName, String
	 * tempConsumeInfoType, String tempConsumInfoStructFieldName, String
	 * tempConsumInfoStructFieldType) { super(); this.tempConsumeInfoName =
	 * tempConsumeInfoName; this.tempConsumeInfoType = tempConsumeInfoType;
	 * this.tempConsumInfoStructFieldName = tempConsumInfoStructFieldName;
	 * this.tempConsumInfoStructFieldType = tempConsumInfoStructFieldType; }
	 */
	/*
	 * public TempConsumeInfo(String consumeInfoName, List<List<ConsumeInfo>>
	 * tempListOfListConsumeInfo) { this.tempConsumeInfoName = consumeInfoName;
	 * this.tempListOfListConsumeInfo = tempListOfListConsumeInfo; }
	 */

}
