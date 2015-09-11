package iotsuite.compiler;

import iotsuite.codegenerator.CompilationUnit;
import iotsuite.codegenerator.JavaFrameworkFromST;
import iotsuite.codegenerator.SourceFileDumper;
import iotsuite.common.GlobalVariable;
import iotsuite.semanticmodel.DataType;
import iotsuite.semanticmodel.Sensor;
import iotsuite.semanticmodel.SensorMeasurement;

import java.util.HashSet;
import java.util.Set;

public class SensorCompiler {

	// private Sensor sensorDriver;
	private Sensor sensorDriver;
	private Set<SensorMeasurement> generatedInfo = new HashSet<SensorMeasurement>();

	public SensorCompiler() {
	}

	public SensorCompiler(String sensorName) {
		// sensorDriver = new Sensor(sensorName, getAttributeSet(),
		// getGeneratedInfo(), null);
		sensorDriver = new Sensor(sensorName, getGeneratedInfo(), null);
	}

	// Getter and Setter of GeneratedInfo
	public Set<SensorMeasurement> getGeneratedInfo() {
		return generatedInfo;
	}

	public void addSensorMeasurement(String measurementName,
			String measurementStruct, StructCompiler struct) {
		SensorMeasurement sensorMeasurement = new SensorMeasurement(
				measurementName, new DataType(measurementStruct), struct);
		generatedInfo.add(sensorMeasurement);
	}

	// Getter and setter of Attribute
	/*
	 * private Set<Attribute> attributeSet = new HashSet<Attribute>();
	 * 
	 * public Set<Attribute> getAttributeSet() { return attributeSet; }
	 * 
	 * public void addAttribute(String fieldName, String fieldType) { Attribute
	 * attribute = new Attribute(fieldName, new PrimitiveType(fieldType));
	 * attributeSet.add(attribute); }
	 */

	/*
	 * The following function generates programming framework for Sensor. It
	 * generates code in the following sequence.
	 * 
	 * (1) Sensor's Interaction (2) Sensor's ApplicationLogic (3) Sensor's
	 * Factory (4) Sensor's JavaSE-enabled device Implementation (5) Sensor's
	 * Android-enabled device Implementation (6) Sensor's Interface (7) Sensor's
	 * Listener
	 */

	// This function will generate code for Periodic Sensor
	public void generatePeriodicSensorCode() {

		// Sensor's Interaction
		generateSensorInteraction_SensorCompiler();

		if (GlobalVariable.activity
				.equals(GlobalVariable.ACTIVITY_GENERATE_DEVICEDRIVER)) {

			// Sensor's Application Logic

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

	// This function will generate code for Event Driven Sensor
	public void generateEventDrivenSensorCode() {

		// Sensor's Interaction
		generateSensorInteraction_SensorCompiler();

		if (GlobalVariable.activity
				.equals(GlobalVariable.ACTIVITY_GENERATE_DEVICEDRIVER)) {

			// Sensor's Application Logic

			if (GlobalVariable.ENABLE_JAVASE_CODE_GENERATATION) {

				// Sensor's Application Logic
				generateJavaSESensorLogic_SensorCompiler();

				// JavaSE SensorFactory
				generateJavaSESensorFactory_SensorCompiler();

				// Sensor's JavaSE Implementation
				generateSensorJavaSE_EventDrivenSensorCompiler();
			}

			if (GlobalVariable.ENABLE_ANDROID_CODE_GENERATION) {

				// Sensor's Application Logic
				generateAndroidSensorLogic_SensorCompiler();

				// Android SensorFactory
				generateAndroidSensorFactory_SensorCompiler();

				// Sensor's Android Implementation
				generateSensorAndroid_EventDrivenSensorCompiler();
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

	/*
	 * private void generateSensorJavaSE_SensorCompiler() { JavaFrameworkFromST
	 * generateSensorImplFactory = new JavaFrameworkFromST(); CompilationUnit
	 * generateCU = generateSensorImplFactory
	 * .generateJavaSESensorImpl(sensorDriver); SourceFileDumper
	 * dumpGeneratedSensorImplFactory = new SourceFileDumper();
	 * dumpGeneratedSensorImplFactory.dumpCompilationUnit(generateCU); }
	 */
	// Sensor's Android Implementation
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

	/*
	 * private void generateSensorAndroidService_SensorCompiler() {
	 * JavaFrameworkFromST generateSensorImplFactory = new
	 * JavaFrameworkFromST(); CompilationUnit generateCU =
	 * generateSensorImplFactory.generateAndroidSensorServiceImpl(sensorDriver);
	 * SourceFileDumper dumpGeneratedSensorImplFactory = new SourceFileDumper();
	 * dumpGeneratedSensorImplFactory.dumpCompilationUnit(generateCU); }
	 */

	// Sensor's Interface
	private void generateSensorInterface_SensorCompiler() {
		JavaFrameworkFromST generateSensorInterface = new JavaFrameworkFromST();
		CompilationUnit generateCU = generateSensorInterface
				.generateSensorInterface(sensorDriver);
		SourceFileDumper dumpGeneratedSensorInterface = new SourceFileDumper();
		dumpGeneratedSensorInterface.dumpCompilationUnit(generateCU);
	}

	// Sensor's Listener
	public void generateSensorListener_SensorCompiler(
			SensorMeasurement sensorMeasurement) {
		JavaFrameworkFromST generateSensorListener = new JavaFrameworkFromST();
		CompilationUnit generateCU = generateSensorListener
				.generateSensorListener(sensorMeasurement);
		SourceFileDumper dumpGeneratedSensorListener = new SourceFileDumper();
		dumpGeneratedSensorListener.dumpCompilationUnit(generateCU);
	}

}
