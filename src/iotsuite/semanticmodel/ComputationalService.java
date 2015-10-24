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
	

	public ComputationalService(String name, Set<Information> generateInfo,
			Set<Information> consumeInfo, Set<DataAccess> dataAccess,
			Set<Action> actions, String partitionAttributeValue,
			String operation,List<StructField> fields, int sampleValue) {
				
		super(name, generateInfo, consumeInfo, partitionAttributeValue);
		this.dataAccess = dataAccess;
		this.actions = actions;
		this.operatation = operation;
		this.fields=fields;
		this.sampleValue=sampleValue;
	}

	public List<StructField> getFields() {
		return fields;
	}

	public List<StructField> getAllStructFields() {
		ArrayList<StructField> allStructFields = new ArrayList<StructField>();
		allStructFields.addAll(getFields());
		return allStructFields;
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