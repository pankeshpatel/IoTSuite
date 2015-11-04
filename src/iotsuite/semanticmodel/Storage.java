package iotsuite.semanticmodel;

import iotsuite.common.GlobalVariable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Storage extends SoftwareComponent {

	private Set<DataAccess> dataAccess = new HashSet<DataAccess>();
	public List<String> fieldWithSQL = new ArrayList<String>();
	public List<String> fieldName = new ArrayList<String>();
	public List<String> structFieldName = new ArrayList<String>();
	public List<StructField> structField = new ArrayList<StructField>();
	private Set<Action> actions = new HashSet<Action>();

	public String databaseName = "iotsuiteuser";

	public String id;

	@SuppressWarnings("unchecked")
	public Storage(String name, Set<DataAccess> dataAccess,
			Set<Information> consumeInfo, List<String> fieldName,
			List<String> fieldwithSQL, List<StructField> structField,
			List<String> structFieldName, Set<Action> actionsList) {

		super(name, null, null);
		this.dataAccess = dataAccess;
		this.fieldWithSQL = fieldwithSQL;
		this.fieldName = fieldName;
		this.structField = structField;
		this.structFieldName = structFieldName;
		this.actions = actionsList;
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

	public List<String> getAllfieldName() {
		id = fieldName.get(0);
		return fieldName;
	}

	public List<String> getAllfieldwithSQlvariable() {
		return fieldWithSQL;
	}

	public List<StructField> getAllStructField() {
		ArrayList<StructField> allStructFields = new ArrayList<StructField>();
		allStructFields.addAll(getstructField());
		return allStructFields;
	}

	public List<StructField> getstructField() {
		return structField;
	}

	public List<String> getAllStructFieldName() {
		return structFieldName;
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

	public String getFactoryPackageName() {
		packageName = GlobalVariable
				.convertPathTopackage(GlobalVariable.factoryDirPath);
		return packageName;
	}

	public String getDeviceImplPackageName() {

		packageName = GlobalVariable
				.convertPathTopackage(GlobalVariable.deviceImplDirPath);
		return packageName;
	}
}
