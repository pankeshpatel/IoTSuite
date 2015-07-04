package iotsuite.semanticmodel;

import iotsuite.common.GlobalVariable;
//import iotsuite.compiler.Attribute;

import java.util.HashSet;
import java.util.Set;

public class Sensor extends SoftwareComponent<SensorMeasurement> {

	protected static Set<Sensor> allSensorDriver = new HashSet<Sensor>();

	// public Sensor(String name, Set<Attribute> attributes,
	// Set<SensorMeasurement> generateInfo, Set<SensorMeasurement> consumeInfo)
	// {
	public Sensor(String name, Set<SensorMeasurement> generateInfo, Set<SensorMeasurement> consumeInfo) {
		// super(name, attributes, generateInfo, consumeInfo, "NoInstance");
		super(name, generateInfo, consumeInfo, "NoInstance");

	}

	private String packageName;

	public String getPackageName() {

		packageName = GlobalVariable.convertPathTopackage(GlobalVariable.frameworkDirPath);
		return packageName;
	}

	public String getLogicPackageName() {
		packageName = GlobalVariable.convertPathTopackage(GlobalVariable.logicDirPath);
		return packageName;
	}

	public String getFactoryPackageName() {

		packageName = GlobalVariable.convertPathTopackage(GlobalVariable.factoryDirPath);
		return packageName;

	}

	public String getDeviceImplPackageName() {

		packageName = GlobalVariable.convertPathTopackage(GlobalVariable.deviceImplDirPath);
		return packageName;
	}

}
