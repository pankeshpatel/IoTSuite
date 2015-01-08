package iotsuite.semanticmodel;

import iotsuite.common.GlobalVariable;
//import iotsuite.compiler.Attribute;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UserInterface extends SoftwareComponent<Information> {

	private Set<Action> actions = new HashSet<Action>();
	private Set<Command> commands = new HashSet<Command>();
	private Set<DataAccess> dataAccess = new HashSet<DataAccess>();
	public String struct;
	private Widget reqWidgets;
	private String lowername;

	/*
	 * public UserInterface(String name, String lowername, Set<Action>
	 * actionsList, Set<Command> commandsList, Set<Attribute> attributes,
	 * Set<Information> generateInfo, Set<Information> consumeInfo,
	 * Set<DataAccess> dataAccess, String struct, Widget reqWidgets) {
	 */

	public UserInterface(String name, String lowername, Set<Action> actionsList, Set<Command> commandsList, 
			Set<Information> generateInfo, Set<Information> consumeInfo, Set<DataAccess> dataAccess,
			String struct, Widget reqWidgets) {
		// super(name, attributes, generateInfo, consumeInfo, "NoInstance");
		super(name, generateInfo, consumeInfo, "NoInstance");
		this.lowername = lowername;
		//this.actions = actionsList;
		this.actions = null;
		this.commands = commandsList;
		//this.dataAccess = dataAccess;
		this.struct = struct;
		this.reqWidgets = reqWidgets;

	}
	

	/*
	public Set<DataAccess> getDataAccess() {
		return dataAccess;
	}
	*/

	/*public List<DataAccess> getAllDataAccess() {
		ArrayList<DataAccess> allDataAccess = new ArrayList<DataAccess>();
		allDataAccess.addAll(getDataAccess());
		return allDataAccess;
	} */

	public Set<Command> getCommands() {
		return commands;
	}

	public Set<Action> getActions() {
		return actions;
	}

	public Widget getReqWidgets() {
		return reqWidgets;
	}

	/*public List<Action> getAllActions() {
		ArrayList<Action> allGeneratedInfo = new ArrayList<Action>();
		allGeneratedInfo.addAll(getActions());
		return allGeneratedInfo;
	} */ 

	private String packageName;

	public String getLowerName() {
		return lowername;
	}

	public String getPackageName() {
		packageName = GlobalVariable.convertPathTopackage(GlobalVariable.frameworkDirPath);
		return packageName;
	}

	public String getLogicPackageName() {
		packageName = GlobalVariable.convertPathTopackage(GlobalVariable.logicDirPath);
		return packageName;
	}

	public String getFactoryPackageName() {

		packageName = GlobalVariable.convertPathTopackage(GlobalVariable.factoryDirPath);
		return packageName;

	}

	public String getFactoryDeviceImplGUI() {
		packageName = GlobalVariable.convertPathTopackage(GlobalVariable.deviceImplDirPath);

		return packageName;

	}

	public String getDeviceImplPackageName() {

		packageName = GlobalVariable.convertPathTopackage(GlobalVariable.deviceImplDirPath);
		return packageName;
	}

}
