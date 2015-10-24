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
import iotsuite.semanticmodel.Information;
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
	private Set<Information> generatedInfo = new HashSet<Information>();
	private Set<DataAccess> dataAccessList = new HashSet<DataAccess>();
	private String GUIName;
	private String struct;
	public static List<StructField> StructFieldSetForGUI = new ArrayList<StructField>();
	

	// private Widget widget;

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
			
			StructFieldSetForGUI=iotsuite.parser.SymbolTable.StructFieldSetForGUI;
			 //System.out.println("Struct Field set is "+StructFieldSet);
			return StructFieldSetForGUI;
		}
	

	public void createGUIObject() {
		/*
		 * guiDriver = new UserInterface(getGUIName(), getLowerCaseGUIName(),
		 * getActionList(), getCommandList(), getAttributeSet(), generatedInfo,
		 * null, getDataAccessList(), getRequestType(), getReqWidget());
		 */

		// guiDriver = new UserInterface(getGUIName(), getLowerCaseGUIName(),
		// getActionList(), getCommandList(), generatedInfo, null,
		// getDataAccessList(), getRequestType(), getReqWidget());

		guiDriver = new UserInterface(getGUIName(), getLowerCaseGUIName(),
				null, getCommandList(), null, null, getDataAccessList(), null,
				null,getStructFieldSet());
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
				//generateAndroidGUIMainActivity();
				
			}
			// generateGUILayout();
			// generateGUIManifest();
		}

		/*
		 * if (GlobalVariable.activity.equals("generateMapping")) {
		 * generateGUILayout(); // generateGUIManifest(); }
		 */
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
	
	//For Main  Activity for AndroidGUI
	/*private void generateAndroidGUIMainActivity() {

		JavaFrameworkFromST generatedGUIDriver = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generatedGUIDriver
				.generateAndroidUserInterfaceMainActivity(guiDriver);
		SourceFileDumper dumpGeneratedGUIDriver = new SourceFileDumper();
		dumpGeneratedGUIDriver.dumpCompilationUnit(generatedCU);

	}
	*/

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

	/*
	 * private void generateGUILayout() { JavaFrameworkFromST generatedGUIDriver
	 * = new JavaFrameworkFromST(); CompilationUnit generatedCU =
	 * generatedGUIDriver .generateAndroidUserInterfaceLayout(guiDriver);
	 * SourceFileDumper dumpGeneratedGUIDriver = new SourceFileDumper();
	 * dumpGeneratedGUIDriver.dumpCompilationUnit(generatedCU);
	 * 
	 * }
	 */

	/*
	 * private void generateGUIManifest() { JavaFrameworkFromST
	 * generatedGUIDriver = new JavaFrameworkFromST(); CompilationUnit
	 * generatedCU = generatedGUIDriver.buildGUIManifest(guiDriver);
	 * SourceFileDumper dumpGeneratedGUIDriver = new SourceFileDumper();
	 * dumpGeneratedGUIDriver.dumpCompilationUnit(generatedCU);
	 * 
	 * }
	 */

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

	// Getter and Setter of Command

	/*
	 * public void addCommand(String actionName, Widget widget) { Command
	 * command = new Command(actionName, getCommandParameter(), widget);
	 * commands.add(command); }
	 */

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

	/*
	 * private Set<Action> getActionList() { return actions; }
	 */

	// Getter and Setter of Attribute

	/*
	 * private Set<Attribute> attributeSet = new HashSet<Attribute>();
	 * 
	 * public void addAttribute(String fieldName, String fieldType) { Attribute
	 * attribute = new Attribute(fieldName, new PrimitiveType(fieldType));
	 * attributeSet.add(attribute); }
	 * 
	 * public Set<Attribute> getAttributeSet() { return attributeSet; }
	 */

	/*
	 * public void setReqWidget(String textbox, String button, String textview)
	 * { widget = new Widget(textbox, button, textview); }
	 * 
	 * public Widget getReqWidget() {
	 * 
	 * return widget; }
	 */

}
