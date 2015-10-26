package iotsuite.semanticmodel;

import iotsuite.common.GlobalVariable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UserInterface extends SoftwareComponent<Information> {

	// private Set<Action> actions = new HashSet<Action>();
	private Set<Command> commands = new HashSet<Command>();
	private Set<DataAccess> dataAccess = new HashSet<DataAccess>();
	public String struct;
	// private Widget reqWidgets;
	private String lowername;
	public List<StructField> fields = new ArrayList<StructField>();
	public List<StructField> fieldsForNotify = new ArrayList<StructField>();
	public List<String> notifyMeasurement = new ArrayList<String>();
	public List<String> notifyStructName = new ArrayList<String>();
	public static int i=0;
	
	
	/*
	 * public UserInterface(String name, String lowername, Set<Action>
	 * actionsList, Set<Command> commandsList, Set<Attribute> attributes,
	 * Set<Information> generateInfo, Set<Information> consumeInfo,
	 * Set<DataAccess> dataAccess, String struct, Widget reqWidgets) {
	 */

	public UserInterface(String name, String lowername,
			Set<Action> actionsList, Set<Command> commandsList,
			Set<Information> generateInfo, Set<Information> consumeInfo,
			Set<DataAccess> dataAccess, String struct, Widget reqWidgets,List<StructField> fields,List<StructField> fieldForNotify
			,List<String> notifyMeasurement,List<String> notifyStructName) {

		//super(name, generateInfo, consumeInfo, "NoInstance");
		
		super(name, generateInfo, consumeInfo);
		this.lowername = lowername;
		this.commands = commandsList;
		this.dataAccess = dataAccess;
		this.struct = struct;
		this.fields=fields;
		this.fieldsForNotify=fieldForNotify;
		this.notifyMeasurement=notifyMeasurement;
		this.notifyStructName=notifyStructName;
	}

	public List<String> getAllNotifyMeasurement(){
		
		return notifyMeasurement;
	}
	
	public String getAllNotifyStructName(){
				
		if(i==(notifyMeasurement.size())){
		i=0;	
		}
		
		return notifyStructName.get(i++);
	}
	
	
	public List<StructField> getFields() {
		return fields;
	}

	public List<StructField> getAllStructFields() {
		ArrayList<StructField> allStructFields = new ArrayList<StructField>();
		allStructFields.addAll(getFields());
		return allStructFields;
	}
	
	
	public List<StructField> getFieldsForNotify() {
		return fieldsForNotify;
	}

	public List<StructField> getAllStructFieldsForNotify() {
		ArrayList<StructField> allStructFieldsForNotify = new ArrayList<StructField>();
		allStructFieldsForNotify.addAll(getFieldsForNotify());
		return allStructFieldsForNotify;
	}
	
	
	
	public Set<DataAccess> getDataAccess() {

		return dataAccess;
	}

	public List<DataAccess> getAllDataAccess() {
		ArrayList<DataAccess> allDataAccess = new ArrayList<DataAccess>();
		allDataAccess.addAll(getDataAccess());
		return allDataAccess;
	}

	
     
	public Set<Command> getCommands() {
		return commands;
	}

	/*
	 * public Set<Action> getActions() { return actions; }
	 */

	/*
	 * public Widget getReqWidgets() { return reqWidgets; }
	 */

	/*
	 * public List<Action> getAllActions() { ArrayList<Action> allGeneratedInfo
	 * = new ArrayList<Action>(); allGeneratedInfo.addAll(getActions()); return
	 * allGeneratedInfo; }
	 */

	private String packageName;

	public String getLowerName() {
		return lowername;
	}

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

	public String getFactoryDeviceImplGUI() {
		packageName = GlobalVariable
				.convertPathTopackage(GlobalVariable.deviceImplDirPath);
		return packageName;
	}

	public String getDeviceImplPackageName() {
		packageName = GlobalVariable
				.convertPathTopackage(GlobalVariable.deviceImplDirPath);
		return packageName;
	}

}
