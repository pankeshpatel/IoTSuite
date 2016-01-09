package iotsuite.compiler;

import iotsuite.codegenerator.CompilationUnit;
import iotsuite.codegenerator.JavaFrameworkFromST;
import iotsuite.codegenerator.SourceFileDumper;
import iotsuite.common.GlobalVariable;
import iotsuite.semanticmodel.ConsumeInfo;
import iotsuite.semanticmodel.DataType;
import iotsuite.semanticmodel.Sensor;
import iotsuite.semanticmodel.SensorMeasurement;
import iotsuite.semanticmodel.StructField;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SensorCompiler {

	private Sensor sensorDriver;
	private Set<SensorMeasurement> generatedInfo = new HashSet<SensorMeasurement>();
	private List<StructField> eventDrivenField = new ArrayList<StructField>();
	private List<StructField> periodicField = new ArrayList<StructField>();
	// public static List<String> eventDrivenFieldName;
	public static String samplePeriod;
	public static String sampleDuration;
	public static String expressionValue;
	public static List<ConsumeInfo> consumeInfoForSensor;

	// public static String measurementName;

	public SensorCompiler() {
	}

	public SensorCompiler(String sensorName) {
		sensorDriver = new Sensor(sensorName, getGeneratedInfo(), null,
				getEventDrivenFields(), getPeriodicFields());
	}

	/*
	 * private List<String> getEventDrivenFieldName() { return
	 * eventDrivenFieldName; }
	 */

	private List<StructField> getEventDrivenFields() {
		this.eventDrivenField = iotsuite.parser.SymbolTable.StructFieldSetForEventDriven;
		return eventDrivenField;
	}

	private List<StructField> getPeriodicFields() {
		this.periodicField = iotsuite.parser.SymbolTable.StructFieldSetForPeriodic;
		return periodicField;
	}

	/*
	 * public List<ConsumeInfo> getConsumeInfoFiledsForSensors(){
	 * consumeInfoForSensor
	 * =iotsuite.parser.SymbolTable.consumeInfoForSensor.get(measurementName);
	 * return consumeInfoForSensor; }
	 */

	// Getter and Setter of GeneratedInfo
	public Set<SensorMeasurement> getGeneratedInfo() {
		return generatedInfo;
	}

	public void addSensorMeasurement(String measurementName,
			String measurementStruct, StructCompiler struct) {
		consumeInfoForSensor = iotsuite.parser.SymbolTable.consumeInfoForSensor
				.get(measurementName);
		SensorMeasurement sensorMeasurement = new SensorMeasurement(
				measurementName, new DataType(measurementStruct), struct);
		generatedInfo.add(sensorMeasurement);

	}

	public void addSensorMeasurementSamplePeriod(String samplePeriod) {

		SensorCompiler.samplePeriod = samplePeriod;

	}

	public void addSensorMeasurementSampleDuration(String sampleDuration) {

		SensorCompiler.sampleDuration = sampleDuration;
	}

	// Following method is for Event Driven Expression
	public void addEventDrivenExpression(String expressionName) {

		SensorCompiler.expressionValue = expressionName;

	}

	// This function will generate code for Periodic Sensor
	public void generatePeriodicSensorCode() {

		// Sensor's Interaction
		generateSensorInteraction_SensorCompiler();

		if (GlobalVariable.activity
				.equals(GlobalVariable.ACTIVITY_GENERATE_DEVICEDRIVER)) {

			if (GlobalVariable.ENABLE_JAVASE_CODE_GENERATATION) {

				// Sensor's Application Logic
				generateJavaSESensorLogic_SensorCompiler();

				// JavaSE SensorFactory
				generateJavaSESensorFactory_SensorCompiler();

				// Sensor's JavaSE Implementation
				generateSensorJavaSE_PeriodicSensorCompiler();
			}

			if (GlobalVariable.ENABLE_ANDROID_CODE_GENERATION) {

				// Sensor's Application Logic
				generateAndroidSensorLogic_SensorCompiler();

				// Android SensorFactory
				generateAndroidSensorFactory_SensorCompiler();

				// Sensor's Android Implementation
				generateSensorAndroid_PeriodicSensorCompiler();
				// generateSensorAndroidService_SensorCompiler();
			}

			// Sensor's Interface
			generateSensorInterface_SensorCompiler();

			// Sensor's Listener
			for (int i = 0; i < sensorDriver.getAllGeneratedInfo().size(); i++) {
				generateSensorListener_SensorCompiler(sensorDriver
						.getAllGeneratedInfo().get(i));
			}

		}

	}

	public void generateEventDrivenSensorCode() {

		generateSensorInteraction_SensorCompiler();

		if (GlobalVariable.activity
				.equals(GlobalVariable.ACTIVITY_GENERATE_DEVICEDRIVER)) {

			if (GlobalVariable.ENABLE_JAVASE_CODE_GENERATATION) {
				generateJavaSESensorLogic_SensorCompiler();
				generateJavaSESensorFactory_SensorCompiler();
				//generateJavaSE_TagCompiler();
				generateSensorJavaSE_EventDrivenSensorCompiler();
				
			}

			if (GlobalVariable.ENABLE_ANDROID_CODE_GENERATION) {
				generateAndroidSensorLogic_SensorCompiler();
				generateAndroidSensorFactory_SensorCompiler();
				generateSensorAndroid_EventDrivenSensorCompiler();

			}
			generateSensorInterface_SensorCompiler();
			for (int i = 0; i < sensorDriver.getAllGeneratedInfo().size(); i++) {
				generateSensorListener_SensorCompiler(sensorDriver
						.getAllGeneratedInfo().get(i));
			}

		}

	}
	
	// Generate Code for Tag 
	public void generateTagCode() {
		generateSensorInteraction_SensorCompiler();
		
		if (GlobalVariable.ENABLE_JAVASE_CODE_GENERATATION) {
			generateJavaSESensorLogic_SensorCompiler();
			generateJavaSESensorFactory_SensorCompiler();
			generateJavaSE_TagCompiler();
			
		}

		if (GlobalVariable.ENABLE_ANDROID_CODE_GENERATION) {
			generateAndroidSensorLogic_SensorCompiler();
			generateAndroidSensorFactory_SensorCompiler();
			generateSensorAndroid_EventDrivenSensorCompiler();

		}
		generateSensorInterface_SensorCompiler();
		for (int i = 0; i < sensorDriver.getAllGeneratedInfo().size(); i++) {
			generateSensorListener_SensorCompiler(sensorDriver
					.getAllGeneratedInfo().get(i));
		}

		
	}

	// Sensor's Interaction
	public void generateSensorInteraction_SensorCompiler() {
		JavaFrameworkFromST generatedSensorDriver = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generatedSensorDriver
				.generateSensorInteraction(sensorDriver);
		SourceFileDumper dumpGeneratedSensorDriver = new SourceFileDumper();
		dumpGeneratedSensorDriver.dumpCompilationUnit(generatedCU);

	}

	// Sensor's Application Logic
	public void generateJavaSESensorLogic_SensorCompiler() {
		JavaFrameworkFromST generateSensor = new JavaFrameworkFromST();
		CompilationUnit generateCU = generateSensor
				.generateJavaSESensorLogic(sensorDriver);
		SourceFileDumper dumpGenerateSensor = new SourceFileDumper();
		dumpGenerateSensor.dumpCompilationUnit(generateCU);
	}

	public void generateAndroidSensorLogic_SensorCompiler() {
		JavaFrameworkFromST generateSensor = new JavaFrameworkFromST();
		CompilationUnit generateCU = generateSensor
				.generateAndroidSensorLogic(sensorDriver);
		SourceFileDumper dumpGenerateSensor = new SourceFileDumper();
		dumpGenerateSensor.dumpCompilationUnit(generateCU);
	}

	// JavaSESensor's Factory
	private void generateJavaSESensorFactory_SensorCompiler() {
		JavaFrameworkFromST generateJavaSESensorFactory = new JavaFrameworkFromST();
		CompilationUnit generateCU = generateJavaSESensorFactory
				.generateJavaSESensorFactory(sensorDriver);
		SourceFileDumper dumpGeneratedJavaSESensorFacotry = new SourceFileDumper();
		dumpGeneratedJavaSESensorFacotry.dumpCompilationUnit(generateCU);

	}

	// Android Sensor Factory
	private void generateAndroidSensorFactory_SensorCompiler() {
		JavaFrameworkFromST generateAndroidSensorFactory = new JavaFrameworkFromST();
		CompilationUnit generateCU = generateAndroidSensorFactory
				.generateAndroidSensorFactory(sensorDriver);
		SourceFileDumper dumpGeneratedAndroidSensorFacotry = new SourceFileDumper();
		dumpGeneratedAndroidSensorFacotry.dumpCompilationUnit(generateCU);

	}

	// Sensor's JavaSE Implementation
	private void generateSensorJavaSE_PeriodicSensorCompiler() {
		JavaFrameworkFromST generateSensorImplFactory = new JavaFrameworkFromST();
		CompilationUnit generateCU = generateSensorImplFactory
				.generateJavaSEPeriodicSensorImpl(sensorDriver);
		SourceFileDumper dumpGeneratedSensorImplFactory = new SourceFileDumper();
		dumpGeneratedSensorImplFactory.dumpCompilationUnit(generateCU);
	}

	private void generateSensorJavaSE_EventDrivenSensorCompiler() {
		JavaFrameworkFromST generateSensorImplFactory = new JavaFrameworkFromST();
		CompilationUnit generateCU = generateSensorImplFactory
				.generateJavaSEEventDrivenSensorImpl(sensorDriver);
		SourceFileDumper dumpGeneratedSensorImplFactory = new SourceFileDumper();
		dumpGeneratedSensorImplFactory.dumpCompilationUnit(generateCU);
	}

	
	// For Tag
	
	private void generateJavaSE_TagCompiler() {
		JavaFrameworkFromST generateSensorImplFactory = new JavaFrameworkFromST();
		CompilationUnit generateCU = generateSensorImplFactory
				.generateJavaSETagImpl(sensorDriver);
		SourceFileDumper dumpGeneratedSensorImplFactory = new SourceFileDumper();
		dumpGeneratedSensorImplFactory.dumpCompilationUnit(generateCU);
	}

	
	private void generateSensorAndroid_PeriodicSensorCompiler() {
		JavaFrameworkFromST generateSensorImplFactory = new JavaFrameworkFromST();
		CompilationUnit generateCU = generateSensorImplFactory
				.generateAndroidPeriodicSensorImpl(sensorDriver);
		SourceFileDumper dumpGeneratedSensorImplFactory = new SourceFileDumper();
		dumpGeneratedSensorImplFactory.dumpCompilationUnit(generateCU);
	}

	private void generateSensorAndroid_EventDrivenSensorCompiler() {
		JavaFrameworkFromST generateSensorImplFactory = new JavaFrameworkFromST();
		CompilationUnit generateCU = generateSensorImplFactory
				.generateAndroidEventDrivenSensorImpl(sensorDriver);
		SourceFileDumper dumpGeneratedSensorImplFactory = new SourceFileDumper();
		dumpGeneratedSensorImplFactory.dumpCompilationUnit(generateCU);
	}

	private void generateSensorInterface_SensorCompiler() {
		JavaFrameworkFromST generateSensorInterface = new JavaFrameworkFromST();
		CompilationUnit generateCU = generateSensorInterface
				.generateSensorInterface(sensorDriver);
		SourceFileDumper dumpGeneratedSensorInterface = new SourceFileDumper();
		dumpGeneratedSensorInterface.dumpCompilationUnit(generateCU);
	}

	public void generateSensorListener_SensorCompiler(
			SensorMeasurement sensorMeasurement) {
		JavaFrameworkFromST generateSensorListener = new JavaFrameworkFromST();
		CompilationUnit generateCU = generateSensorListener
				.generateSensorListener(sensorMeasurement);
		SourceFileDumper dumpGeneratedSensorListener = new SourceFileDumper();
		dumpGeneratedSensorListener.dumpCompilationUnit(generateCU);
	}

	

}
