package iotsuite.compiler;

import iotsuite.codegenerator.CompilationUnit;
import iotsuite.codegenerator.JavaFrameworkFromST;
import iotsuite.codegenerator.SourceFileDumper;
import iotsuite.common.GlobalVariable;
import iotsuite.semanticmodel.DataType;
import iotsuite.semanticmodel.Sensor;
import iotsuite.semanticmodel.SensorMeasurement;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SensorCompiler {

	private Sensor sensorDriver;
	private Set<SensorMeasurement> generatedInfo = new HashSet<SensorMeasurement>();
	public static List<String> eventDrivenFields;
	public static List<String> eventDrivenFieldName;
	public static String samplePeriod;
	public static String sampleDuration;

	public SensorCompiler() {
	}

	public SensorCompiler(String sensorName) {
		sensorDriver = new Sensor(sensorName, getGeneratedInfo(), null,
				getEventDrivenFieldName(), getEventDrivenFields());
	}

	private List<String> getEventDrivenFieldName() {
		return eventDrivenFieldName;
	}

	private List<String> getEventDrivenFields() {
		return eventDrivenFields;
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

	public void addSensorMeasurementSamplePeriod(String samplePeriod) {

		SensorCompiler.samplePeriod = samplePeriod;

	}

	public void addSensorMeasurementSampleDuration(String sampleDuration) {

		SensorCompiler.sampleDuration = sampleDuration;
	}

<<<<<<< HEAD
=======

>>>>>>> f18db808215aa7c0212c33614ab0a8c9dea732b4
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

<<<<<<< HEAD
		}
=======
	}
>>>>>>> f18db808215aa7c0212c33614ab0a8c9dea732b4

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
<<<<<<< HEAD

=======
>>>>>>> f18db808215aa7c0212c33614ab0a8c9dea732b4
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
<<<<<<< HEAD

=======
>>>>>>> f18db808215aa7c0212c33614ab0a8c9dea732b4
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
