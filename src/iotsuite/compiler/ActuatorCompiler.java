package iotsuite.compiler;

import iotsuite.codegenerator.CompilationUnit;
import iotsuite.codegenerator.JavaFrameworkFromST;
import iotsuite.codegenerator.SourceFileDumper;
import iotsuite.common.GlobalVariable;
import iotsuite.semanticmodel.Action;
import iotsuite.semanticmodel.Actuator;
import iotsuite.semanticmodel.DataType;
import iotsuite.semanticmodel.Parameter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ActuatorCompiler {

	private Actuator actuatorDriver;
	private Set<Action> actions = new HashSet<Action>();
	private Parameter parameter;
	public static List<String> fieldName = new ArrayList<String>();
<<<<<<< HEAD

=======
>>>>>>> f18db808215aa7c0212c33614ab0a8c9dea732b4
	public ActuatorCompiler() {

	}

	public ActuatorCompiler(String actuatorName) {
		actuatorDriver = new Actuator(actuatorName, getActionList(), null,
				null, getAllFieldName());
	}

	private List<String> getAllFieldName() {
		ActuatorCompiler.fieldName = iotsuite.parser.SymbolTable.tempListActuatorFieldName;
		return fieldName;
	}

<<<<<<< HEAD
=======
	
>>>>>>> f18db808215aa7c0212c33614ab0a8c9dea732b4
	public void addParameter(String parameterName, String parameterType) {
		parameter = new Parameter(parameterName, new DataType(parameterType));
	}

	public Parameter getParameter() {
		return parameter;
	}

	public void addAction(String actionName) {
		Action action = new Action(actionName, getParameter(), null);
		actions.add(action);
	}

	private Set<Action> getActionList() {
		return actions;
	}

<<<<<<< HEAD
	public void generateActuatorCode() {

=======
	
	public void generateActuatorCode() {


>>>>>>> f18db808215aa7c0212c33614ab0a8c9dea732b4
		generateActuatorInteraction_ActuatorCompiler();

		if (GlobalVariable.activity
				.equals(GlobalVariable.ACTIVITY_GENERATE_DEVICEDRIVER)) {

			if (GlobalVariable.ENABLE_JAVASE_CODE_GENERATATION) {
				generateJavaSEActuatorLogic_ActuatorCompiler();
				generateJavaSEActuatorFactory_ActuatorCompiler();
				generateJavaSEActuator_ActuatorCompiler();
<<<<<<< HEAD
				generateNodejsServer_Visualization();
				generateClient_Visualization();
				
=======
>>>>>>> f18db808215aa7c0212c33614ab0a8c9dea732b4
			}
			if (GlobalVariable.ENABLE_ANDROID_CODE_GENERATION) {
				generateAndroidActuatorLogic_ActuatorCompiler();
				generateAndroidActuatorFactory_ActuatorCompiler();
				generateActuatorAndroid_ActuatorCompiler();
			}
			generateActuatorInterface_ActuatorCompiler();
		}
	}

	private void generateActuatorInteraction_ActuatorCompiler() {
		JavaFrameworkFromST generatedActuatorDriver = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generatedActuatorDriver
				.generateActuatorInteraction(actuatorDriver);
		SourceFileDumper dumpGeneratedActuatorDriver = new SourceFileDumper();
		dumpGeneratedActuatorDriver.dumpCompilationUnit(generatedCU);

	}
<<<<<<< HEAD
	
// for server.js
	private void generateNodejsServer_Visualization() {
		JavaFrameworkFromST generatedActuatorDriver = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generatedActuatorDriver
				.generateNodejsVisualization(actuatorDriver);
		SourceFileDumper dumpGeneratedActuatorDriver = new SourceFileDumper();
		dumpGeneratedActuatorDriver.dumpCompilationUnit(generatedCU);
	}

// for client	
	
	private void generateClient_Visualization() {
		JavaFrameworkFromST generatedActuatorDriver = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generatedActuatorDriver
				.generateClientVisualization(actuatorDriver);
		SourceFileDumper dumpGeneratedActuatorDriver = new SourceFileDumper();
		dumpGeneratedActuatorDriver.dumpCompilationUnit(generatedCU);
	}
=======

>>>>>>> f18db808215aa7c0212c33614ab0a8c9dea732b4
	private void generateJavaSEActuator_ActuatorCompiler() {
		JavaFrameworkFromST generatedActuatorDriver = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generatedActuatorDriver
				.generateJavaSEActuatorImpl(actuatorDriver);
		SourceFileDumper dumpGeneratedActuatorDriver = new SourceFileDumper();
		dumpGeneratedActuatorDriver.dumpCompilationUnit(generatedCU);
	}

	private void generateActuatorAndroid_ActuatorCompiler() {
		JavaFrameworkFromST generatedActuatorDriver = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generatedActuatorDriver
				.generateAndroidActuatorImpl(actuatorDriver);
		SourceFileDumper dumpGeneratedActuatorDriver = new SourceFileDumper();
		dumpGeneratedActuatorDriver.dumpCompilationUnit(generatedCU);
	}

	private void generateJavaSEActuatorFactory_ActuatorCompiler() {
		JavaFrameworkFromST generatedActuatorDriver = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generatedActuatorDriver
				.generateJavaSEActuatorFactory(actuatorDriver);
		SourceFileDumper dumpGeneratedActuatorDriver = new SourceFileDumper();
		dumpGeneratedActuatorDriver.dumpCompilationUnit(generatedCU);
	}

	private void generateAndroidActuatorFactory_ActuatorCompiler() {
		JavaFrameworkFromST generatedActuatorDriver = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generatedActuatorDriver
				.generateAndroidActuatorFactory(actuatorDriver);
		SourceFileDumper dumpGeneratedActuatorDriver = new SourceFileDumper();
		dumpGeneratedActuatorDriver.dumpCompilationUnit(generatedCU);
	}

	private void generateActuatorInterface_ActuatorCompiler() {
		JavaFrameworkFromST generatedActuatorDriver = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generatedActuatorDriver
				.generateActuatorInterface(actuatorDriver);
		SourceFileDumper dumpGeneratedActuatorDriver = new SourceFileDumper();
		dumpGeneratedActuatorDriver.dumpCompilationUnit(generatedCU);
	}

	public void generateJavaSEActuatorLogic_ActuatorCompiler() {
		JavaFrameworkFromST generatedActuatorDriver = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generatedActuatorDriver
				.generateJavaSEActuatorLogic(actuatorDriver);
		SourceFileDumper dumpGeneratedActuatorDriver = new SourceFileDumper();
		dumpGeneratedActuatorDriver.dumpCompilationUnit(generatedCU);
	}

	public void generateAndroidActuatorLogic_ActuatorCompiler() {
		JavaFrameworkFromST generatedActuatorDriver = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generatedActuatorDriver
				.generateAndroidActuatorLogic(actuatorDriver);
		SourceFileDumper dumpGeneratedActuatorDriver = new SourceFileDumper();
		dumpGeneratedActuatorDriver.dumpCompilationUnit(generatedCU);
	}
}
