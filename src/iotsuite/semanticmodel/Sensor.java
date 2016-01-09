package iotsuite.semanticmodel;

import iotsuite.common.GlobalVariable;
//import iotsuite.compiler.Attribute;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sensor extends SoftwareComponent<SensorMeasurement> {

	protected static Set<Sensor> allSensorDriver = new HashSet<Sensor>();
	// Store field Name used by Periodic Sensor
	// public static List<String> eventDrivenFieldName = new
	// ArrayList<String>();
	// Store fields used by Periodic Sensor
	public static List<StructField> eventDrivenField = new ArrayList<StructField>();
	// Store field Name used by Periodic Sensor
	public static List<StructField> periodicField = new ArrayList<StructField>();
	public static String samplePeriod;
	public static String sampleDuration;
	public static String expressionValue;
	// Following structure is used to store fieldName,fieldType and StructName
	// (ex- TempStruct,tempValue and double)
	public static List<ConsumeInfo> consumeInfoFieldsForSensor;

	public Sensor(String name, Set<SensorMeasurement> generateInfo,
			Set<SensorMeasurement> consumeInfo,
			List<StructField> eventDrivenField, List<StructField> periodicField) {

		// super(name, generateInfo, consumeInfo, "NoInstance");
		super(name, generateInfo, consumeInfo, null);
		// Sensor.eventDrivenFieldName = eventDrivenFieldName;
		Sensor.eventDrivenField = eventDrivenField;
		Sensor.periodicField = periodicField;

	}

	private String packageName;

	public static String getSamplePeriod() {
		samplePeriod = iotsuite.compiler.SensorCompiler.samplePeriod;
		return samplePeriod;
	}

	public static String getExpressionValue() {

		expressionValue = iotsuite.compiler.SensorCompiler.expressionValue;

		return expressionValue;

	}

	public static String getSampleDuration() {
		sampleDuration = iotsuite.compiler.SensorCompiler.sampleDuration;
		return sampleDuration;
	}

	public List<ConsumeInfo> getConsumeInfoFieldsForSensor() {
		consumeInfoFieldsForSensor = iotsuite.compiler.SensorCompiler.consumeInfoForSensor;
		return consumeInfoFieldsForSensor;
	}

	public List<ConsumeInfo> getAllConsumeInfoFieldsForSensors() {
		ArrayList<ConsumeInfo> allConsumeInfoFields = new ArrayList<ConsumeInfo>();
		allConsumeInfoFields.addAll(getConsumeInfoFieldsForSensor());
		return allConsumeInfoFields;
	}

	public List<StructField> getAllPeriodicFields() {
		ArrayList<StructField> allPeriodicFields = new ArrayList<StructField>();
		allPeriodicFields.addAll(getPeriodicField());
		return allPeriodicFields;
	}

	public static List<StructField> getPeriodicField() {

		return periodicField;

	}

	public List<StructField> getAllEventDivenFields() {
		ArrayList<StructField> allEventDrivenFields = new ArrayList<StructField>();
		allEventDrivenFields.addAll(getEventDrivenField());
		return allEventDrivenFields;
	}

	public static List<StructField> getEventDrivenField() {

		return eventDrivenField;

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

	public String getDeviceImplPackageName() {

		packageName = GlobalVariable
				.convertPathTopackage(GlobalVariable.deviceImplDirPath);
		return packageName;
	}

}
