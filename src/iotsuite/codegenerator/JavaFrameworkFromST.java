package iotsuite.codegenerator;

import org.antlr.stringtemplate.StringTemplate;

import iotsuite.common.GlobalVariable;
import iotsuite.semanticmodel.Actuator;
import iotsuite.semanticmodel.ComputationalService;
//import iotsuite.semanticmodel.Controller;
import iotsuite.semanticmodel.Device;
import iotsuite.semanticmodel.Information;
import iotsuite.semanticmodel.UserInterface;
import iotsuite.semanticmodel.Sensor;
import iotsuite.semanticmodel.SensorMeasurement;
import iotsuite.semanticmodel.Storage;
import iotsuite.semanticmodel.Struct;
import org.antlr.stringtemplate.StringTemplateGroup;
import org.antlr.stringtemplate.language.DefaultTemplateLexer;

public class JavaFrameworkFromST {

	private StringTemplateGroup group = new StringTemplateGroup("myGroup",
			GlobalVariable.stringTemplatePath, DefaultTemplateLexer.class);

	// JavaSE Periodic Sensor Impl
	public CompilationUnit generateJavaSEPeriodicSensorImpl(Sensor sensorDriver) {
		StringTemplate templateOfSensorDriver = group
				.getInstanceOf("JavaSE/implPeriodicSensorJavaSE");
		templateOfSensorDriver.setAttribute("SensorDriver", sensorDriver);

		templateOfSensorDriver.registerRenderer(String.class,
				new MyAttributeRenderer());

		return new CompilationUnit(GlobalVariable.JAVASE_ENABLED_DEVICES
				+ sensorDriver.getName() + ".java", templateOfSensorDriver,
				"JavaSESensorImpl", "sensor", sensorDriver);
	}

	// JavaSE Event Driven Sensor Impl
	public CompilationUnit generateJavaSEEventDrivenSensorImpl(
			Sensor sensorDriver) {
		StringTemplate templateOfSensorDriver = group
				.getInstanceOf("JavaSE/implEventDrivenSensorJavaSE");
		templateOfSensorDriver.setAttribute("SensorDriver", sensorDriver);

		templateOfSensorDriver.registerRenderer(String.class,
				new MyAttributeRenderer());

		return new CompilationUnit(GlobalVariable.JAVASE_ENABLED_DEVICES
				+ sensorDriver.getName() + ".java", templateOfSensorDriver,
				"JavaSESensorImpl", "sensor", sensorDriver);
	}

	public CompilationUnit generateComputationalServiceFactory(
			ComputationalService computationalService) {

		StringTemplate templateOfComputationalService = group
				.getInstanceOf("JavaSE/factoryComputationalJavaSE");
		templateOfComputationalService.setAttribute("CS", computationalService);

		templateOfComputationalService.registerRenderer(String.class,
				new MyAttributeRenderer());

		return new CompilationUnit(computationalService.getName() + "Factory"
				+ ".java", templateOfComputationalService, "JavaSEFactory",
				"Computational", computationalService);

		
	}

	// For Interface
	public CompilationUnit generateComputationalServiceInterface(
			ComputationalService computationalService) {

		StringTemplate templateOfComputationalService = group
				.getInstanceOf("Common/interfaceComputational");
		templateOfComputationalService.setAttribute("CS", computationalService);

		templateOfComputationalService.registerRenderer(String.class,
				new MyAttributeRenderer());

		return new CompilationUnit("I" + computationalService.getName()
				+ ".java", templateOfComputationalService, "Interface",
				"Computational", computationalService);
	}

	// For Listener

	public CompilationUnit generateComputationalServiceListener(
			Information infoConsumeInfo) {

		StringTemplate templateOfComputationalService = group
				.getInstanceOf("Common/listenerComputational");
		templateOfComputationalService.setAttribute("INFO", infoConsumeInfo);

		templateOfComputationalService.registerRenderer(String.class,
				new MyAttributeRenderer());

		return new CompilationUnit("Listener" + infoConsumeInfo.getName()
				+ ".java", templateOfComputationalService, "Listener",
				"Computational", infoConsumeInfo);

		

	}

	// For Computational DeviceImpl
	public CompilationUnit generateImplComputationalService(
			ComputationalService computationalService) {

		StringTemplate templateOfComputationalService = group
				.getInstanceOf("JavaSE/implComputationalJavaSE");
		templateOfComputationalService.setAttribute("CS", computationalService);

		templateOfComputationalService.registerRenderer(String.class,
				new MyAttributeRenderer());

		return new CompilationUnit("JavaSE" + computationalService.getName()
				+ ".java", templateOfComputationalService, "JavaSEImpl",
				"Computational", computationalService);

	}

	public CompilationUnit generateImplAggComputationalService(
			ComputationalService computationalService) {

		StringTemplate templateOfComputationalService = group
				.getInstanceOf("JavaSE/implAggComputationalJavaSE");
		templateOfComputationalService.setAttribute("CS", computationalService);

		templateOfComputationalService.registerRenderer(String.class,
				new MyAttributeRenderer());

		return new CompilationUnit("JavaSE" + computationalService.getName()
				+ ".java", templateOfComputationalService, "JavaSEImplAgg",
				"Computational", computationalService);

	}

	// JavaSE Sensor Factory
	public CompilationUnit generateJavaSESensorFactory(Sensor sensorDriver) {
		StringTemplate templateOfSensorDriver = group
				.getInstanceOf("JavaSE/factorySensorJavaSE");
		templateOfSensorDriver.setAttribute("SensorDriver", sensorDriver);

		templateOfSensorDriver.registerRenderer(String.class,
				new MyAttributeRenderer());

		return new CompilationUnit(
				sensorDriver.getName() + "Factory" + ".java",
				templateOfSensorDriver, "JavaSEFactory", "Sensor", sensorDriver);
	}

	// JavaSE Actuator Impl
	public CompilationUnit generateJavaSEActuatorImpl(Actuator actuatorDriver) {
		StringTemplate templateOfActuatorDriver = group
				.getInstanceOf("JavaSE/implActuatorJavaSE");
		templateOfActuatorDriver.setAttribute("Actuatordriver", actuatorDriver);

		templateOfActuatorDriver.registerRenderer(String.class,
				new MyAttributeRenderer());

		return new CompilationUnit(GlobalVariable.JAVASE_ENABLED_DEVICES
				+ actuatorDriver.getName() + ".java", templateOfActuatorDriver,
				"JavaSEActuatorImpl", "actuator", actuatorDriver);
	}

	// JavaSE Actuator Factory
	public CompilationUnit generateJavaSEActuatorFactory(Actuator actuatorDriver) {
		StringTemplate templateOfActuatorDriver = group
				.getInstanceOf("JavaSE/factoryActuatorJavaSE");
		templateOfActuatorDriver.setAttribute("Actuatordriver", actuatorDriver);

		templateOfActuatorDriver.registerRenderer(String.class,
				new MyAttributeRenderer());

		return new CompilationUnit(actuatorDriver.getName() + "Factory"
				+ ".java", templateOfActuatorDriver, "JavaSEFactory",
				"Actuator", actuatorDriver);
	}

	// JavaSE Storage Impl
	public CompilationUnit generateJavaSEStorageImpl(Storage storageService) {
		StringTemplate templateOfStorageService = group
				.getInstanceOf("JavaSE/implStorageJavaSE");
		templateOfStorageService.setAttribute("Storageservice", storageService);

		templateOfStorageService.registerRenderer(String.class,
				new MyAttributeRenderer());

		return new CompilationUnit("JavaSE" + storageService.getName()
				+ ".java", templateOfStorageService, "JavaSEStorageImpl",
				"actuator", storageService);
	}

	// JavaSE Storage Factory
	public CompilationUnit generateJavaSEStorageFactory(Storage storageService) {
		StringTemplate templateOfStorageService = group
				.getInstanceOf("JavaSE/factoryStorageJavaSE");
		templateOfStorageService.setAttribute("Storageservice", storageService);

		templateOfStorageService.registerRenderer(String.class,
				new MyAttributeRenderer());

		return new CompilationUnit(storageService.getName() + "Factory"
				+ ".java", templateOfStorageService, "JavaSEFactory", "Future",
				storageService);
	}

	// JavaSE Userinterface Impl
	public CompilationUnit generateJavaSEUserInterfaceImpl(
			UserInterface guiDriver) {
		StringTemplate templateOfGUIDriver = group
				.getInstanceOf("JavaSE/implGuiJavaSE");
		templateOfGUIDriver.setAttribute("GUIdriver", guiDriver);

		templateOfGUIDriver.registerRenderer(String.class,
				new MyAttributeRenderer());

		return new CompilationUnit("JavaSE" + guiDriver.getName() + ".java",
				templateOfGUIDriver, "JavaSEGuiImpl", "java", guiDriver);
	}

	// JavaSE Userinterface Factory
	public CompilationUnit generateJavaSEUserInterfaceFactory(
			UserInterface guiDriver) {
		StringTemplate templateOfGUIDriver = group
				.getInstanceOf("JavaSE/factoryGuiJavaSE");
		templateOfGUIDriver.setAttribute("GUIdriver", guiDriver);

		templateOfGUIDriver.registerRenderer(String.class,
				new MyAttributeRenderer());

		return new CompilationUnit(guiDriver.getName() + "Factory" + ".java",
				templateOfGUIDriver, "JavaSEFactory", "gui", guiDriver);
	}

	// JavaSE Actuator
	public CompilationUnit generateJavaSEActuatorLogic(Actuator actuatorDriver) {

		StringTemplate templateOfActuatorDriver = group
				.getInstanceOf("JavaSE/logicActuatorJavaSE");
		templateOfActuatorDriver.setAttribute("Actuatordriver", actuatorDriver);

		templateOfActuatorDriver.registerRenderer(String.class,
				new MyAttributeRenderer());

		return new CompilationUnit(
				"Logic" + actuatorDriver.getName() + ".java",
				templateOfActuatorDriver, "JavaSELogic", "actuator",
				actuatorDriver);
	}

	/*
	 * Android Platform - start
	 */

	// Android Sensor
	public CompilationUnit generateAndroidSensorFactory(Sensor sensorDriver) {
		StringTemplate templateOfSensorDriver = group
				.getInstanceOf("Android/factorySensorAndroid");
		templateOfSensorDriver.setAttribute("SensorDriver", sensorDriver);

		templateOfSensorDriver.registerRenderer(String.class,
				new MyAttributeRenderer());

		return new CompilationUnit(
				sensorDriver.getName() + "Factory" + ".java",
				templateOfSensorDriver, "AndroidFactory", "Sensor",
				sensorDriver);
	}

	// Android Actuator
	public CompilationUnit generateAndroidActuatorFactory(
			Actuator actuatorDriver) {
		StringTemplate templateOfActuatorDriver = group
				.getInstanceOf("Android/factoryActuatorAndroid");
		templateOfActuatorDriver.setAttribute("Actuatordriver", actuatorDriver);

		templateOfActuatorDriver.registerRenderer(String.class,
				new MyAttributeRenderer());

		return new CompilationUnit(actuatorDriver.getName() + "Factory"
				+ ".java", templateOfActuatorDriver, "AndroidFactory",
				"Actuator", actuatorDriver);
	}

	public CompilationUnit generateAndroidStorageFactory(Storage storageService) {
		StringTemplate templateOfStorageService = group
				.getInstanceOf("Android/factoryStorageAndroid");
		templateOfStorageService.setAttribute("Storageservice", storageService);

		templateOfStorageService.registerRenderer(String.class,
				new MyAttributeRenderer());

		return new CompilationUnit(storageService.getName() + "Factory"
				+ ".java", templateOfStorageService, "AndroidFactory",
				"Future", storageService);
	}

	// Factory for the Android GUI
	public CompilationUnit generateAndroidUserInterfaceFactory(
			UserInterface guiDriver) {
		StringTemplate templateOfGUIDriver = group
				.getInstanceOf("Android/factoryGuiAndroid");
		templateOfGUIDriver.setAttribute("GUIdriver", guiDriver);

		templateOfGUIDriver.registerRenderer(String.class,
				new MyAttributeRenderer());

		return new CompilationUnit(guiDriver.getName() + "Factory" + ".java",
				templateOfGUIDriver, "AndroidFactory", "gui", guiDriver);
	}

	// Android Periodic Sensor
	public CompilationUnit generateAndroidPeriodicSensorImpl(Sensor sensorDriver) {
		StringTemplate templateOfSensorDriver = group
				.getInstanceOf("Android/implPeriodicSensorAndroid");
		templateOfSensorDriver.setAttribute("SensorDriver", sensorDriver);

		templateOfSensorDriver.registerRenderer(String.class,
				new MyAttributeRenderer());

		return new CompilationUnit(GlobalVariable.ANDROID_ENABLED_DEVICES
				+ sensorDriver.getName() + ".java", templateOfSensorDriver,
				"AndroidSensorImpl", "sensor", sensorDriver);
	}

	// Android Event Driven Sensor
	public CompilationUnit generateAndroidEventDrivenSensorImpl(
			Sensor sensorDriver) {
		StringTemplate templateOfSensorDriver = group
				.getInstanceOf("Android/implEventDrivenSensorAndroid");
		templateOfSensorDriver.setAttribute("SensorDriver", sensorDriver);

		templateOfSensorDriver.registerRenderer(String.class,
				new MyAttributeRenderer());

		return new CompilationUnit(GlobalVariable.ANDROID_ENABLED_DEVICES
				+ sensorDriver.getName() + ".java", templateOfSensorDriver,
				"AndroidSensorImpl", "sensor", sensorDriver);
	}

	// Android Actuator
	public CompilationUnit generateAndroidActuatorImpl(Actuator actuatorDriver) {
		StringTemplate templateOfActuatorDriver = group
				.getInstanceOf("Android/implActuatorAndroid");
		templateOfActuatorDriver.setAttribute("Actuatordriver", actuatorDriver);

		templateOfActuatorDriver.registerRenderer(String.class,
				new MyAttributeRenderer());

		return new CompilationUnit(GlobalVariable.ANDROID_ENABLED_DEVICES
				+ actuatorDriver.getName() + ".java", templateOfActuatorDriver,
				"AndroidActuatorImpl", "actuator", actuatorDriver);
	}

	public CompilationUnit generateAndroidStorageImpl(Storage storageService) {
		StringTemplate templateOfStorageService = group
				.getInstanceOf("Android/implStorageAndroid");
		templateOfStorageService.setAttribute("Storageservice", storageService);

		templateOfStorageService.registerRenderer(String.class,
				new MyAttributeRenderer());

		return new CompilationUnit("Android" + storageService.getName()
				+ ".java", templateOfStorageService, "AndroidStorageImpl",
				"actuator", storageService);
	}

	
	// Android User interface
	public CompilationUnit generateAndroidUserInterfaceImpl(
			UserInterface guiDriver) {
		StringTemplate templateOfGUIDriver = group
				.getInstanceOf("Android/implGuiAndroid");
		templateOfGUIDriver.setAttribute("GUIdriver", guiDriver);

		templateOfGUIDriver.registerRenderer(String.class,
				new MyAttributeRenderer());

		return new CompilationUnit("Android" + guiDriver.getName() + ".java",
				templateOfGUIDriver, "AndroidGuiImpl", "java", guiDriver);
	}

	// Android manifest
	public CompilationUnit generateAndroidManifest(Device device) {

		StringTemplate templateOfGUIDriver = group
				.getInstanceOf("Android/deviceManifestAndroid");
		templateOfGUIDriver.setAttribute("device", device);

		templateOfGUIDriver.registerRenderer(String.class,
				new MyAttributeRenderer());

		return new CompilationUnit("AndroidManifest.xml", templateOfGUIDriver,
				"AndroidManifest", "manifest", device);
	}

	/*
	 * Android Platform - end
	 */

	/*
	 * Common code - start
	 */

	// User interface
	public CompilationUnit generateJavaSEUserInterfaceLogic(
			UserInterface guiDriver) {

		StringTemplate templateOfGUIDriver = group
				.getInstanceOf("JavaSE/logicGuiJavaSE");
		templateOfGUIDriver.setAttribute("GUIdriver", guiDriver);

		templateOfGUIDriver.registerRenderer(String.class,
				new MyAttributeRenderer());

		return new CompilationUnit("Logic" + guiDriver.getName() + ".java",
				templateOfGUIDriver, "JavaSEGuiLogic", "gui", guiDriver);
	}

	public CompilationUnit generateAndroidUserInterfaceLogic(
			UserInterface guiDriver) {
		StringTemplate templateOfGUIDriver = group
				.getInstanceOf("Android/logicGuiAndroid");
		templateOfGUIDriver.setAttribute("GUIdriver", guiDriver);

		templateOfGUIDriver.registerRenderer(String.class,
				new MyAttributeRenderer());

		return new CompilationUnit("Logic" + guiDriver.getName() + ".java",
				templateOfGUIDriver, "AndroidGuiLogic", "gui", guiDriver);
	}

	// For generating listener for GUI.
	public CompilationUnit generateUserInterfaceListener(UserInterface guiDriver) {
		StringTemplate templateOfGUIDriver = group
				.getInstanceOf("Common/listenerGui");
		templateOfGUIDriver.setAttribute("GUIdriver", guiDriver);

		templateOfGUIDriver.registerRenderer(String.class,
				new MyAttributeRenderer());

		return new CompilationUnit("Listener" + guiDriver.getName() + ".java",
				templateOfGUIDriver, "Listener", "gui", guiDriver);
	}

	// ComputationalService
	public CompilationUnit generateAggregatorComputationalServiceLogic(
			ComputationalService computationalService) {

		StringTemplate templateOfComputationalService = group
				.getInstanceOf("Common/logicAggComputationalService");
		templateOfComputationalService.setAttribute("CS", computationalService);

		templateOfComputationalService.registerRenderer(String.class,
				new MyAttributeRenderer());

		return new CompilationUnit("Logic" + computationalService.getName()
				+ ".java", templateOfComputationalService, "Logic", "Future",
				computationalService);
	}

	public CompilationUnit generateComputationalServiceLogic(
			ComputationalService computationalService) {

		StringTemplate templateOfComputationalService = group
				.getInstanceOf("Common/logicComputationalService");
		templateOfComputationalService.setAttribute("CS", computationalService);

		templateOfComputationalService.registerRenderer(String.class,
				new MyAttributeRenderer());

		return new CompilationUnit("Logic" + computationalService.getName()
				+ ".java", templateOfComputationalService, "Logic", "Future",
				computationalService);
	}

	// Sensor
	public CompilationUnit generateSensorInterface(Sensor sensorDriver) {

		StringTemplate templateOfSensorDriver = group
				.getInstanceOf("Common/interfaceSensor");
		templateOfSensorDriver.setAttribute("SensorDriver", sensorDriver);

		templateOfSensorDriver.registerRenderer(String.class,
				new MyAttributeRenderer());

		return new CompilationUnit("I" + sensorDriver.getName() + ".java",
				templateOfSensorDriver, "Interface", "sensor", sensorDriver);
	}

	// Actuator
	public CompilationUnit generateActuatorInterface(Actuator actuatorDriver) {

		StringTemplate templateOfActuatorDriver = group
				.getInstanceOf("Common/interfaceActuator");
		templateOfActuatorDriver.setAttribute("Actuatordriver", actuatorDriver);

		templateOfActuatorDriver.registerRenderer(String.class,
				new MyAttributeRenderer());

		return new CompilationUnit("I" + actuatorDriver.getName() + ".java",
				templateOfActuatorDriver, "Interface", "actuator",
				actuatorDriver);
	}

	// User Interface
	public CompilationUnit generateUserInterfaceInterface(
			UserInterface guiDriver) {

		StringTemplate templateOfGUIDriver = group
				.getInstanceOf("Common/interfaceGui");
		templateOfGUIDriver.setAttribute("GUIdriver", guiDriver);

		templateOfGUIDriver.registerRenderer(String.class,
				new MyAttributeRenderer());

		return new CompilationUnit("I" + guiDriver.getName() + ".java",
				templateOfGUIDriver, "Interface", "gui", guiDriver);
	}

	public CompilationUnit generateSensorListener(
			SensorMeasurement sensorMeasurement) {
		StringTemplate templateOfSensorDriver = group
				.getInstanceOf("Common/listenerSensor");
		templateOfSensorDriver.setAttribute("SensorDriver", sensorMeasurement);

		templateOfSensorDriver.registerRenderer(String.class,
				new MyAttributeRenderer());

		return new CompilationUnit("Listener" + sensorMeasurement.getName()
				+ ".java", templateOfSensorDriver, "Listener", "sensor",
				sensorMeasurement);
	}

	public CompilationUnit generateDeviceStartup(Device device) {

		StringTemplate templateOfDevice = group.getInstanceOf("Common/device");
		templateOfDevice.setAttribute("device", device);

		templateOfDevice.registerRenderer(String.class,
				new MyAttributeRenderer());

		return new CompilationUnit("Startup" + ".java", templateOfDevice,
				"device", device.getName(), device);
	}

	// Sensor
	public CompilationUnit generateJavaSESensorLogic(Sensor sensorDriver) {
		StringTemplate templateOfSensorDriver = group
				.getInstanceOf("JavaSE/logicSensorJavaSE");
		templateOfSensorDriver.setAttribute("SensorDriver", sensorDriver);

		templateOfSensorDriver.registerRenderer(String.class,
				new MyAttributeRenderer());

		return new CompilationUnit("Logic" + sensorDriver.getName() + ".java",
				templateOfSensorDriver, "JavaSESensorLogic", "sensor",
				sensorDriver);
	}

	// Sensor
	public CompilationUnit generateAndroidSensorLogic(Sensor sensorDriver) {
		StringTemplate templateOfSensorDriver = group
				.getInstanceOf("Android/logicSensorAndroid");
		templateOfSensorDriver.setAttribute("SensorDriver", sensorDriver);

		templateOfSensorDriver.registerRenderer(String.class,
				new MyAttributeRenderer());

		return new CompilationUnit("Logic" + sensorDriver.getName() + ".java",
				templateOfSensorDriver, "AndroidSensorLogic", "sensor",
				sensorDriver);
	}

	// Android Actuator
	public CompilationUnit generateAndroidActuatorLogic(Actuator actuatorDriver) {
		StringTemplate templateOfActuatorDriver = group
				.getInstanceOf("Android/logicActuatorAndroid");
		templateOfActuatorDriver.setAttribute("Actuatordriver", actuatorDriver);

		templateOfActuatorDriver.registerRenderer(String.class,
				new MyAttributeRenderer());

		return new CompilationUnit(
				"Logic" + actuatorDriver.getName() + ".java",
				templateOfActuatorDriver, "AndroidLogic", "actuator",
				actuatorDriver);
	}

	// Storage
	public CompilationUnit generateJavaSEStorageLogic(Storage storageService) {
		StringTemplate templateOfStorageService = group
				.getInstanceOf("Common/logicStorage");
		templateOfStorageService.setAttribute("Storageservice", storageService);

		templateOfStorageService.registerRenderer(String.class,
				new MyAttributeRenderer());

		return new CompilationUnit(
				"Logic" + storageService.getName() + ".java",
				templateOfStorageService, "Logic", "storage", storageService);
	}

	// Structure
	public CompilationUnit generateDataStructure(Struct struct) {
		StringTemplate templateOfStructure = group
				.getInstanceOf("Common/structure");
		templateOfStructure.setAttribute("struct", struct);

		templateOfStructure.registerRenderer(String.class,
				new MyAttributeRenderer());

		return new CompilationUnit(struct.getName() + ".java",
				templateOfStructure, "structure", "Future", struct);
	}

	// Sensor
	public CompilationUnit generateSensorInteraction(Sensor sensorDriver) {
		StringTemplate templateOfSensorDriver = group
				.getInstanceOf("Common/frameworkSensorInteraction");
		templateOfSensorDriver.setAttribute("SensorDriver", sensorDriver);

		templateOfSensorDriver.registerRenderer(String.class,
				new MyAttributeRenderer());

		return new CompilationUnit(sensorDriver.getName() + ".java",
				templateOfSensorDriver, "sensorDriver", "Future", sensorDriver);
	}

	// Actuator
	public CompilationUnit generateActuatorInteraction(Actuator actuatorDriver) {

		StringTemplate templateOfActuatorDriver = group
				.getInstanceOf("Common/frameworkActuatorInteraction");
		templateOfActuatorDriver.setAttribute("Actuatordriver", actuatorDriver);

		templateOfActuatorDriver.registerRenderer(String.class,
				new MyAttributeRenderer());

		return new CompilationUnit(actuatorDriver.getName() + ".java",
				templateOfActuatorDriver, "actuatorDriver", "Future",
				actuatorDriver);
	}

	// Storage
	public CompilationUnit generateStorageInteraction(Storage storageService) {

		StringTemplate templateOfStorageService = group
				.getInstanceOf("Common/frameworkStorageInteraction");
		templateOfStorageService.setAttribute("Storageservice", storageService);

		templateOfStorageService.registerRenderer(String.class,
				new MyAttributeRenderer());

		return new CompilationUnit(storageService.getName() + ".java",
				templateOfStorageService, "storageService", "Future",
				storageService);
	}

	// User interface
	public CompilationUnit generateUserInterfaceInteraction(
			UserInterface guiDriver) {
		StringTemplate templateOfGUIDriver = group
				.getInstanceOf("Common/frameworkGuiInteraction");
		templateOfGUIDriver.setAttribute("GUIdriver", guiDriver);

		templateOfGUIDriver.registerRenderer(String.class,
				new MyAttributeRenderer());

		return new CompilationUnit(guiDriver.getName() + ".java",
				templateOfGUIDriver, "guiDriver", "Future", guiDriver);
	}

	// ComputationalService
	public CompilationUnit generateComputationalServiceInteraction(
			ComputationalService computationalService) {

		StringTemplate templateOfComputationalService = group
				.getInstanceOf("Common/frameworkComputationalServiceInteraction");
		templateOfComputationalService.setAttribute("CS", computationalService);

		templateOfComputationalService.registerRenderer(String.class,
				new MyAttributeRenderer());

		return new CompilationUnit(computationalService.getName() + ".java",
				templateOfComputationalService, "computationalService",
				"Future", computationalService);
	}

	// Storage - interface
	public CompilationUnit generateJavaSEStorageInterface(Storage storageService) {
		StringTemplate templateOfStorageService = group
				.getInstanceOf("Common/interfaceStorage");
		templateOfStorageService.setAttribute("Storageservice", storageService);

		templateOfStorageService.registerRenderer(String.class,
				new MyAttributeRenderer());

		return new CompilationUnit("I" + storageService.getName() + ".java",
				templateOfStorageService, "storageService", "Future",
				storageService);
	}

	public CompilationUnit generatePlatformSpecificProjectFile(Device device) {

		// For JavaSE-enabled devices
		if (device.getType().equals(GlobalVariable.JAVASE_ENABLED_DEVICES)) {

			StringTemplate templateOfDevice = group
					.getInstanceOf("JavaSE/eclipseProjectJavaSE");
			templateOfDevice.setAttribute("device", device);

			templateOfDevice.registerRenderer(String.class,
					new MyAttributeRenderer());

			return new CompilationUnit(".project", templateOfDevice,
					"deviceProject", device.getName(), device);

		}

		if (device.getType().equals(GlobalVariable.ANDROID_ENABLED_DEVICES)) {
			StringTemplate templateOfDevice = group
					.getInstanceOf("Android/eclipseProjectAndroid");
			templateOfDevice.setAttribute("device", device);

			templateOfDevice.registerRenderer(String.class,
					new MyAttributeRenderer());

			return new CompilationUnit(".project", templateOfDevice,
					"deviceProject", device.getName(), device);
		}

		return null;
	}

	public CompilationUnit generatePlatformSpecificExecutionStartup(
			Device device) {

		if (device.getType().equals(GlobalVariable.JAVASE_ENABLED_DEVICES)) {
			StringTemplate templateOfDevice = group
					.getInstanceOf("JavaSE/executionJavaSE");
			templateOfDevice.setAttribute("device", device);

			templateOfDevice.registerRenderer(String.class,
					new MyAttributeRenderer());

			return new CompilationUnit(device.getName() + "Main" + ".java",
					templateOfDevice, "device", device.getName(), device);
		}

		if (device.getType().equals(GlobalVariable.ANDROID_ENABLED_DEVICES)) {
			StringTemplate templateOfDevice = group
					.getInstanceOf("Android/executionAndroid");
			templateOfDevice.setAttribute("device", device);

			templateOfDevice.registerRenderer(String.class,
					new MyAttributeRenderer());

			return new CompilationUnit("MainActivity" + ".java",
					templateOfDevice, "AndroidDevice", device.getName(), device);
		}

		return null;
	}
	
}
