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
	// Following list used to store notify command name specified by Developer
	// in userinteraction specification
	public static List<String> generatedInfoType = new ArrayList<String>();

	public static String generatedInfoName;

	/*
	 * public UserInterface(String name, String lowername, Set<Action>
	 * actionsList, Set<Command> commandsList, Set<Attribute> attributes,
	 * Set<Information> generateInfo, Set<Information> consumeInfo,
	 * Set<DataAccess> dataAccess, String struct, Widget reqWidgets) {
	 */

	public UserInterface(String name, String lowername,
			Set<Action> actionsList, Set<Command> commandsList,
			Set<Information> generateInfo, Set<Information> consumeInfo,
			Set<DataAccess> dataAccess, String struct, Widget reqWidgets,
			List<String> generatedInfoType) {
		// super(name, attributes, generateInfo, consumeInfo, "NoInstance");
		super(name, generateInfo, consumeInfo, "NoInstance");
		this.lowername = lowername;
		// this.actions = actionsList;
		// this.actions = null;
		this.commands = commandsList;
		this.dataAccess = dataAccess;
		this.struct = struct;
		UserInterface.generatedInfoType = generatedInfoType;
		// this.reqWidgets = reqWidgets;

	}

	public List<String> getAllGeneratedInfoType() {

		// System.out.println("Generated Info"+generatedInfoType.get(0));
		// System.out.println("Generated Info"+iotsuite.parser.SymbolTable.arrayGUIGeneratedInfo[0][1]);
		// String name =iotsuite.parser.SymbolTable.arrayGUIGeneratedInfo[0][0];
		// System.out.println("Name is "+name);
		// System.out.println("Generated "+generatedInfoType);
		return generatedInfoType;

	}

	public String getAllGeneratedName() {

		for (int i = 0; i < 10; i++) {

			if (iotsuite.parser.SymbolTable.arrayGUIGeneratedInfo[i][0]
					.equals(UserInterface.generatedInfoType.get(0))) {

				generatedInfoName = iotsuite.parser.SymbolTable.arrayGUIGeneratedInfo[i][1];
				break;

			}
			// System.out.println("Generated Info Name "+generatedInfoName);
		}

		return generatedInfoName;
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
