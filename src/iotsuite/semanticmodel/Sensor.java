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
	public static List<String> eventDrivenFieldName = new ArrayList<String>();
	// Store fields used by Periodic Sensor
	public static List<String> eventDrivenFields = new ArrayList<String>();
	public static String samplePeriod;
	public static String sampleDuration;

	
	public Sensor(String name, Set<SensorMeasurement> generateInfo,
			Set<SensorMeasurement> consumeInfo,
			List<String> eventDrivenFieldName, List<String> eventDrivenFields) {

		//super(name, generateInfo, consumeInfo, "NoInstance");
		super(name, generateInfo, consumeInfo);
		Sensor.eventDrivenFieldName = eventDrivenFieldName;
		Sensor.eventDrivenFields = eventDrivenFields;

	}

	private String packageName;

	public static String getSamplePeriod() {
		samplePeriod = iotsuite.compiler.SensorCompiler.samplePeriod;
		return samplePeriod;
	}

	public static String getSampleDuration() {
		sampleDuration = iotsuite.compiler.SensorCompiler.sampleDuration;
		return sampleDuration;
	}

	public static List<String> getAllEventDrivenFieldName() {

		eventDrivenFieldName = iotsuite.parser.SymbolTable.eventDrivenFieldName;
		return eventDrivenFieldName;

	}

	public static List<String> getAllEventDrivenFields() {

		eventDrivenFields = iotsuite.parser.SymbolTable.eventDrivenFields;
		return eventDrivenFields;

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
