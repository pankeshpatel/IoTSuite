package iotsuite.compiler;

import iotsuite.codegenerator.CompilationUnit;
import iotsuite.codegenerator.JavaFrameworkFromST;
import iotsuite.codegenerator.SourceFileDumper;
import iotsuite.common.GlobalVariable;
import iotsuite.parser.SymbolTable;
import iotsuite.semanticmodel.Action;
import iotsuite.semanticmodel.Command;
import iotsuite.semanticmodel.DataAccess;
import iotsuite.semanticmodel.DataType;
import iotsuite.semanticmodel.StructField;
import iotsuite.semanticmodel.UserInterface;
import iotsuite.semanticmodel.Parameter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UserInterfaceCompiler {

	private UserInterface guiDriver;
	private Set<Action> actions = new HashSet<Action>();
	private Set<Command> commands = new HashSet<Command>();
	private Parameter actionParameter;
	private Parameter commandParameter;
	private Set<DataAccess> dataAccessList = new HashSet<DataAccess>();
	private String GUIName;
	private String struct;
	public static List<StructField> StructFieldSetForGUI = new ArrayList<StructField>();
	public static List<StructField> StructFieldSetForGUINotify = new ArrayList<StructField>();
	private List<String> notifyMeasurement = new ArrayList<String>();
	private List<String> notifyStructName = new ArrayList<String>();

	public UserInterfaceCompiler() {

	}

	public String getGUIName() {
		return GUIName;
	}

	public String getLowerCaseGUIName() {
		return GUIName.toLowerCase();
	}

	public void setGUIName(String computationalServiceName) {

		this.GUIName = computationalServiceName;
	}

	public List<StructField> getStructFieldSet() {

		StructFieldSetForGUI = iotsuite.parser.SymbolTable.StructFieldSetForGUI;
		// System.out.println("Struct Field set is "+StructFieldSet);
		return StructFieldSetForGUI;
	}

	public List<StructField> getStructFieldSetForGUINotify() {

		StructFieldSetForGUINotify = iotsuite.parser.SymbolTable.StructFieldSetForGUINotify;
		// System.out.println("Struct Field set is "+StructFieldSet);
		return StructFieldSetForGUINotify;
	}

	public List<String> getNotifyMeasurement() {

		return this.notifyMeasurement;
	}

	public List<String> getNotifyStructName() {

		return this.notifyStructName;
	}

	public void setNotifyName(String notifyName) {

		this.notifyMeasurement.add(notifyName);

	}

	public void setNotifyParameter(String notifyStructName) {

		
		this.notifyStructName.add(notifyStructName);
		iotsuite.parser.SymbolTable
				.searchStructFieldNameForNotifyGUI(notifyStructName);
		
	}

	public void createGUIObject() {
		

		guiDriver = new UserInterface(getGUIName(), getLowerCaseGUIName(),
				null, getCommandList(), null, null, getDataAccessList(), null,
				null, getStructFieldSet(), getStructFieldSetForGUINotify(),
				getNotifyMeasurement(), getNotifyStructName());
	}

	// Code generator of the abstract classes and Logic files

	public void generateCode() {
		JavaFrameworkFromST generatedGUIDriver = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generatedGUIDriver
				.generateUserInterfaceInteraction(guiDriver);
		SourceFileDumper dumpGeneratedGUIDriver = new SourceFileDumper();
		dumpGeneratedGUIDriver.dumpCompilationUnit(generatedCU);

		if (GlobalVariable.activity
				.equals(GlobalVariable.ACTIVITY_GENERATE_USERINTERACTION)) {

			// For JavaSE code generation
			if (GlobalVariable.ENABLE_JAVASE_CODE_GENERATATION) {

				generateJavaSEGUI();
				// Factory
				generateJavaSEGUIFactory();
				// Device Driver code
				generateJavaSEGUIImpl();
			}

			if (GlobalVariable.ENABLE_ANDROID_CODE_GENERATION) {

				generateAndroidGUI(); // This function call will create a
										// partial Logic files
				generateGUIListener(); // This function call will create
										// Listener files
				generateGUIInterface(); // This function call will create
										// Interface of GUI.
				generateAndroidGUIFactory();
				generateAndroidGUIImpl();
	

			}
	
		}

	
	}

	public void generateAndroidGUI() {
		JavaFrameworkFromST generatedGUIDriver = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generatedGUIDriver
				.generateAndroidUserInterfaceLogic(guiDriver);
		SourceFileDumper dumpGeneratedGUIDriver = new SourceFileDumper();
		dumpGeneratedGUIDriver.dumpCompilationUnit(generatedCU);

	}

	public void generateJavaSEGUI() {
		JavaFrameworkFromST generatedGUIDriver = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generatedGUIDriver
				.generateJavaSEUserInterfaceLogic(guiDriver);
		SourceFileDumper dumpGeneratedGUIDriver = new SourceFileDumper();
		dumpGeneratedGUIDriver.dumpCompilationUnit(generatedCU);

	}

	private void generateGUIListener() {

		JavaFrameworkFromST generatedGUIDriver = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generatedGUIDriver
				.generateUserInterfaceListener(guiDriver);
		SourceFileDumper dumpGeneratedGUIDriver = new SourceFileDumper();
		dumpGeneratedGUIDriver.dumpCompilationUnit(generatedCU);

	}
	
	private void generateAndroidGUIImpl() {

		JavaFrameworkFromST generatedGUIDriver = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generatedGUIDriver
				.generateAndroidUserInterfaceImpl(guiDriver);
		SourceFileDumper dumpGeneratedGUIDriver = new SourceFileDumper();
		dumpGeneratedGUIDriver.dumpCompilationUnit(generatedCU);

	}

	private void generateJavaSEGUIImpl() {
		JavaFrameworkFromST generatedGUIDriver = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generatedGUIDriver
				.generateJavaSEUserInterfaceImpl(guiDriver);
		SourceFileDumper dumpGeneratedGUIDriver = new SourceFileDumper();
		dumpGeneratedGUIDriver.dumpCompilationUnit(generatedCU);

	}

	private void generateAndroidGUIFactory() {
		JavaFrameworkFromST generatedGUIDriver = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generatedGUIDriver
				.generateAndroidUserInterfaceFactory(guiDriver);
		SourceFileDumper dumpGeneratedGUIDriver = new SourceFileDumper();
		dumpGeneratedGUIDriver.dumpCompilationUnit(generatedCU);
	}

	private void generateJavaSEGUIFactory() {
		JavaFrameworkFromST generatedGUIDriver = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generatedGUIDriver
				.generateJavaSEUserInterfaceFactory(guiDriver);
		SourceFileDumper dumpGeneratedGUIDriver = new SourceFileDumper();
		dumpGeneratedGUIDriver.dumpCompilationUnit(generatedCU);
	}

	private void generateGUIInterface() {
		JavaFrameworkFromST generatedGUIDriver = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generatedGUIDriver
				.generateUserInterfaceInterface(guiDriver);
		SourceFileDumper dumpGeneratedGUIDriver = new SourceFileDumper();
		dumpGeneratedGUIDriver.dumpCompilationUnit(generatedCU);

	}


	public String getDatafromSymblTable(String variableName) {
		return SymbolTable.getSymblTableData(variableName);
	}

	public void getDataAccessListFromSymblTable(String dataAccessStr) {
		this.dataAccessList = SymbolTable
				.getDataAccessSymblTable(dataAccessStr);
	}

	public Set<DataAccess> getDataAccessList() {
		return dataAccessList;
	}

	public void setRequestType(String struct) {
		iotsuite.parser.SymbolTable.searchStructFieldNameForGUI(struct);
		this.struct = struct;

	}

	public String getRequestType() {

		return struct;
	}
	
	public void addCommand(String actionName) {
		Command command = new Command(actionName, getCommandParameter(), null);
		commands.add(command);
	}

	private Set<Command> getCommandList() {
		return commands;
	}

	// Getter and Setter of Action Parameters
	private Parameter getActionParameter() {
		return actionParameter;
	}

	public void addActionParameter(String parameterName, String parameterType) {
		actionParameter = new Parameter(parameterName, new DataType(
				parameterType));
	}

	// Getter and Setter of Command Parameters

	public void addCommandParameter(String parameterName) {

		commandParameter = new Parameter(parameterName, new DataType(
				getDatafromSymblTable(parameterName)));
	}

	public Parameter getCommandParameter() {
		return commandParameter;
	}

	// Getter and Setter of Action
	public void addAction(String actionName, String widgetName) {
		Action action = new Action(actionName, getActionParameter(), widgetName);
		actions.add(action);
	}

	
}
