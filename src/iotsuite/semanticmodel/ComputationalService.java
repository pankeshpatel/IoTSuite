package iotsuite.semanticmodel;

import iotsuite.common.GlobalVariable;
//import iotsuite.compiler.Attribute;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ComputationalService extends SoftwareComponent<Information> {

	private Set<DataAccess> dataAccess = new HashSet<DataAccess>();
	private Set<Action> actions = new HashSet<Action>();
	private String operatation;
	public List<StructField> fields = new ArrayList<StructField>();
	public static int sampleValue;

	// Following structure is used to store consumeInfoField for Sensor
	public static List<ConsumeInfo> consumeInfoField;
	// Following structure is used to store consumeInfoField for Storage
	public static List<ConsumeInfo> consumeInfoFieldForStorage;
	// public static List<List<ConsumeInfo>> listOfListConsumeInfo;
	public List<TempConsumeInfo> listOfListTempConsumeInfo;

	public ComputationalService(String name, Set<Information> generateInfo,
			Set<Information> consumeInfo, Set<DataAccess> dataAccess,
			Set<Action> actions, String operation, List<StructField> fields,
			int sampleValue, List<ConsumeInfo> consumeInfoFieldForSensor,
			List<ConsumeInfo> consumeInfoForStorage,
			List<TempConsumeInfo> listOfListTempConsumeInfo) {

		super(name, generateInfo, consumeInfo, listOfListTempConsumeInfo);
		this.dataAccess = dataAccess;
		this.actions = actions;
		this.operatation = operation;
		this.fields = fields;
		ComputationalService.sampleValue = sampleValue;
		ComputationalService.consumeInfoField = consumeInfoFieldForSensor;
		ComputationalService.consumeInfoFieldForStorage = consumeInfoForStorage;
		// this.listOfListConsumeInfo = listofListConsumeInfo ;
		this.listOfListTempConsumeInfo = listOfListTempConsumeInfo;
	}

	@Override
	public List<TempConsumeInfo> getTempAllConsumeInfo() {
		return listOfListTempConsumeInfo;
	}

	public List<StructField> getFields() {
		return fields;
	}

	public List<StructField> getAllStructFields() {
		ArrayList<StructField> allStructFields = new ArrayList<StructField>();
		allStructFields.addAll(getFields());
		return allStructFields;
	}

	public List<ConsumeInfo> getConsumeInfoFields() {
		return consumeInfoField;
	}

	public List<ConsumeInfo> getAllConsumeInfoFields() {
		ArrayList<ConsumeInfo> allConsumeInfoFields = new ArrayList<ConsumeInfo>();
		allConsumeInfoFields.addAll(getConsumeInfoFields());
		return allConsumeInfoFields;
	}

	public List<ConsumeInfo> getConsumeInfoFieldsForStorage() {
		return consumeInfoFieldForStorage;
	}

	public List<ConsumeInfo> getAllConsumeInfoFieldsForStorage() {
		ArrayList<ConsumeInfo> allConsumeInfoFields = new ArrayList<ConsumeInfo>();
		allConsumeInfoFields.addAll(getConsumeInfoFieldsForStorage());
		return allConsumeInfoFields;
	}

	public String getOperation() {
		return operatation;
	}

	public Set<Action> getActions() {
		return actions;
	}

	public List<Action> getAllActions() {
		ArrayList<Action> allGeneratedInfo = new ArrayList<Action>();
		allGeneratedInfo.addAll(getActions());
		return allGeneratedInfo;
	}

	public Set<DataAccess> getDataAccess() {
		return dataAccess;
	}

	public List<DataAccess> getAllDataAccess() {
		ArrayList<DataAccess> allDataAccess = new ArrayList<DataAccess>();
		allDataAccess.addAll(getDataAccess());
		return allDataAccess;
	}

	private String packageName;

	public String getPackageName() {
		packageName = GlobalVariable
				.convertPathTopackage(GlobalVariable.frameworkDirPath);
		return packageName;
	}

	public String getLogicPackageName() {
		packageName = GlobalVariable
				.convertPathTopackage(GlobalVariable.logicDirPath);
		return packageName;
	}

	public String getUtilPackageName() {
		packageName = GlobalVariable
				.convertPathTopackage(GlobalVariable.utilDirPath);
		return packageName;
	}
}