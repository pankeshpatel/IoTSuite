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
	//public static List<String> eventDrivenFieldName = new ArrayList<String>();
	// Store fields used by Periodic Sensor
	public static List<StructField> eventDrivenField = new ArrayList<StructField>();
	public static String samplePeriod;
	public static String sampleDuration;

	public Sensor(String name, Set<SensorMeasurement> generateInfo,
			Set<SensorMeasurement> consumeInfo,
			List<StructField> eventDrivenField) {

		// super(name, generateInfo, consumeInfo, "NoInstance");
		super(name, generateInfo, consumeInfo);
		//Sensor.eventDrivenFieldName = eventDrivenFieldName;
		Sensor.eventDrivenField = eventDrivenField;

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

	/*public static List<String> getAllEventDrivenFieldName() {

		eventDrivenFieldName = iotsuite.parser.SymbolTable.eventDrivenFieldName;
		return eventDrivenFieldName;

	}
*/
	
	public List<StructField> getAllEventDivenFields() {
		ArrayList<StructField> allEventDrivenFields = new ArrayList<StructField>();
		allEventDrivenFields.addAll(getEventDrivenField());
		return allEventDrivenFields;
	}
	public static List<StructField> getEventDrivenField() {

		
		//eventDrivenField = iotsuite.parser.SymbolTable.StructFieldSetForEventDriven;
		//System.out.println("eventDriven"+eventDrivenFields);
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
