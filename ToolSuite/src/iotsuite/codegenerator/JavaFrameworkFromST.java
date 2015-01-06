package iotsuite.codegenerator;

import iotsuite.common.GlobalVariable;
import iotsuite.semanticmodel.Actuator;
import iotsuite.semanticmodel.ComputationalService;
//import iotsuite.semanticmodel.Controller;
import iotsuite.semanticmodel.Device;
import iotsuite.semanticmodel.UserInterface;
import iotsuite.semanticmodel.Region;
import iotsuite.semanticmodel.Sensor;
import iotsuite.semanticmodel.SensorMeasurement;
import iotsuite.semanticmodel.Storage;
import iotsuite.semanticmodel.Struct;
import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;
import org.antlr.stringtemplate.language.DefaultTemplateLexer;

public class JavaFrameworkFromST {

	private StringTemplateGroup group = new StringTemplateGroup("myGroup", GlobalVariable.stringTemplatePath, DefaultTemplateLexer.class);

	/*******************************************************************************
	 * Code that generates Framework for structure
	 * 
	 ******************************************************************************/

	public CompilationUnit generateDataStructure(Struct struct) {

		StringTemplate templateOfStructure = group.getInstanceOf("structure");
		templateOfStructure.setAttribute("struct", struct);
		return new CompilationUnit(struct.getName() + ".java", templateOfStructure, "structure", "Future", struct);
	}

	/*******************************************************************************
	 * 
	 * Code that generates framework for interaction with other components It is
	 * applied to Sensor Actuator Storage ComputationalService End-userGUI
	 *******************************************************************************/

	// Sensor
	public CompilationUnit generateSensorInteraction(Sensor sensorDriver) {

		StringTemplate templateOfSensorDriver = group.getInstanceOf("sensordriver");
		templateOfSensorDriver.setAttribute("SensorDriver", sensorDriver);
		return new CompilationUnit(sensorDriver.getName() + ".java", templateOfSensorDriver, "sensorDriver", "Future", sensorDriver);
	}

	// Actuator
	public CompilationUnit generateActuatorInteraction(Actuator actuatorDriver) {

		StringTemplate templateOfActuatorDriver = group.getInstanceOf("actuatordriver");
		templateOfActuatorDriver.setAttribute("Actuatordriver", actuatorDriver);
		return new CompilationUnit(actuatorDriver.getName() + ".java", templateOfActuatorDriver, "actuatorDriver", "Future", actuatorDriver);
	}

	// Storage
	public CompilationUnit generateStorageInteraction(Storage storageService) {

		StringTemplate templateOfStorageService = group.getInstanceOf("storageservice");
		templateOfStorageService.setAttribute("Storageservice", storageService);
		return new CompilationUnit(storageService.getName() + ".java", templateOfStorageService, "storageService", "Future", storageService);
	}

	// User interface
	public CompilationUnit generateUserInterfaceInteraction(UserInterface guiDriver) {

		StringTemplate templateOfGUIDriver = group.getInstanceOf("guidriver");
		templateOfGUIDriver.setAttribute("GUIdriver", guiDriver);
		return new CompilationUnit(guiDriver.getName() + ".java", templateOfGUIDriver, "guiDriver", "Future", guiDriver);
	}

	// ComputationalService
	public CompilationUnit generateComputationalServiceInteraction(ComputationalService computationalService) {

		StringTemplate templateOfComputationalService = group.getInstanceOf("cs");
		templateOfComputationalService.setAttribute("CS", computationalService);
		return new CompilationUnit(computationalService.getName() + ".java", templateOfComputationalService, "computationalService", "Future", computationalService);
	}

	/*******************************************************************************
	 * 
	 * Code that generates framework for application logic of a component It is
	 * applied to Sensor Actuator Storage ComputationalService End-userGUI
	 * 
	 *******************************************************************************/

	// Sensor
	public CompilationUnit generateSensorLogic(Sensor sensorDriver) {

		StringTemplate templateOfSensorDriver = group.getInstanceOf("lsensor");
		templateOfSensorDriver.setAttribute("SensorDriver", sensorDriver);
		return new CompilationUnit("Logic" + sensorDriver.getName() + ".java", templateOfSensorDriver, "Logic", "sensor", sensorDriver);
	}

	//JavaSE Actuator
	public CompilationUnit generateJavaSEActuatorLogic(Actuator actuatorDriver) {

		StringTemplate templateOfActuatorDriver = group.getInstanceOf("ljavaseactuator");
		templateOfActuatorDriver.setAttribute("Actuatordriver", actuatorDriver);
		return new CompilationUnit("Logic" + actuatorDriver.getName() + ".java", templateOfActuatorDriver, "JavaSELogic", "actuator", actuatorDriver);
	}
	
	//Android Actuator
	public CompilationUnit generateAndroidActuatorLogic(Actuator actuatorDriver) {

		StringTemplate templateOfActuatorDriver = group.getInstanceOf("landroidactuator");
		templateOfActuatorDriver.setAttribute("Actuatordriver", actuatorDriver);
		return new CompilationUnit("Logic" + actuatorDriver.getName() + ".java", templateOfActuatorDriver, "AndroidLogic", "actuator", actuatorDriver);
	}

	// Storage
	public CompilationUnit generateJavaSEStorageLogic(Storage storageService) {

		StringTemplate templateOfStorageService = group.getInstanceOf("lstorage");
		templateOfStorageService.setAttribute("Storageservice", storageService);
		return new CompilationUnit("Logic" + storageService.getName() + ".java", templateOfStorageService, "Logic", "storage", storageService);
	}

	// User interface
	public CompilationUnit generateUserInterfaceLogic(UserInterface guiDriver) {		

		StringTemplate templateOfGUIDriver = group.getInstanceOf("lgui");
		templateOfGUIDriver.setAttribute("GUIdriver", guiDriver);
		return new CompilationUnit("Logic" + guiDriver.getName() + ".java", templateOfGUIDriver, "Logic", "gui", guiDriver);
	}
	
	// For generating listener for GUI.
	public CompilationUnit generateUserInterfaceListener(UserInterface guiDriver) {		

		StringTemplate templateOfGUIDriver = group.getInstanceOf("guilistener");
		templateOfGUIDriver.setAttribute("GUIdriver", guiDriver);
		return new CompilationUnit("Listener" + guiDriver.getName() + ".java", templateOfGUIDriver, "Listener", "gui", guiDriver);

	}

	// ComputationalService
	public CompilationUnit generateComputationalServiceLogic(ComputationalService computationalService) {

		StringTemplate templateOfComputationalService = group.getInstanceOf("lcomputation");
		templateOfComputationalService.setAttribute("CS", computationalService);
		return new CompilationUnit("Logic" + computationalService.getName() + ".java", templateOfComputationalService, "Logic", "Future", computationalService);
	}

	/*******************************************************************************
	 * 
	 * Code that generates framework for factory of a component It is applied to
	 * Sensor Actuator Storage End-user GUI
	 *******************************************************************************/

	// JavaSE Sensor Factory
	public CompilationUnit generateJavaSESensorFactory(Sensor sensorDriver) {
		StringTemplate templateOfSensorDriver = group.getInstanceOf("javasesensorfactory");
		templateOfSensorDriver.setAttribute("SensorDriver", sensorDriver);
		return new CompilationUnit(sensorDriver.getName() + "Factory" + ".java", templateOfSensorDriver, "JavaSEFactory", "Sensor", sensorDriver);
	}

	// Android Sensor
	public CompilationUnit generateAndroidSensorFactory(Sensor sensorDriver) {
		StringTemplate templateOfSensorDriver = group.getInstanceOf("androidsensorfactory");
		templateOfSensorDriver.setAttribute("SensorDriver", sensorDriver);
		return new CompilationUnit(sensorDriver.getName() + "Factory" + ".java", templateOfSensorDriver, "AndroidFactory", "Sensor", sensorDriver);
	}

	// JavaSE Actuator
	public CompilationUnit generateJavaSEActuatorFactory(Actuator actuatorDriver) {
		StringTemplate templateOfActuatorDriver = group.getInstanceOf("javaseactuatorfactory");
		templateOfActuatorDriver.setAttribute("Actuatordriver", actuatorDriver);
		return new CompilationUnit(actuatorDriver.getName() + "Factory" + ".java", templateOfActuatorDriver, "JavaSEFactory", "Actuator", actuatorDriver);
	}

	// Android Actuator
	public CompilationUnit generateAndroidActuatorFactory(Actuator actuatorDriver) {
		StringTemplate templateOfActuatorDriver = group.getInstanceOf("androidactuatorfactory");
		templateOfActuatorDriver.setAttribute("Actuatordriver", actuatorDriver);
		return new CompilationUnit(actuatorDriver.getName() + "Factory" + ".java", templateOfActuatorDriver, "AndroidFactory", "Actuator", actuatorDriver);
	}

	// Storage
	public CompilationUnit generateJavaSEStorageFactory(Storage storageService) {

		StringTemplate templateOfStorageService = group.getInstanceOf("storageJavaSEFactory");
		templateOfStorageService.setAttribute("Storageservice", storageService);
		return new CompilationUnit(storageService.getName() + "Factory" + ".java", templateOfStorageService, "ImplFactory", "Future", storageService);
	}

	// Factory for the Android GUI
	public CompilationUnit generateAndroidUserInterfaceFactory(UserInterface guiDriver) {
		StringTemplate templateOfGUIDriver = group.getInstanceOf("guiAndroidFactory");
		templateOfGUIDriver.setAttribute("GUIdriver", guiDriver);
		return new CompilationUnit(guiDriver.getName() + "Factory" + ".java", templateOfGUIDriver, "AndroidFactory", "gui", guiDriver);
	}
	
	//Factory for the JavaSE device 
	public CompilationUnit generateJavaSEUserInterfaceFactory(UserInterface guiDriver) {
		StringTemplate templateOfGUIDriver = group.getInstanceOf("guiJavaseFactory");
		templateOfGUIDriver.setAttribute("GUIdriver", guiDriver);
		return new CompilationUnit(guiDriver.getName() + "Factory" + ".java", templateOfGUIDriver, "JavaSEFactory", "gui", guiDriver);
	}
	
	

	/*******************************************************************************
	 * 
	 * Code that generates framework for implementing device drivers - 
	 *  Implementation It is applied to only sensor, actuator, storage, and
	 * end-user gui
	 *******************************************************************************/

	
	// JavaSE Sensor
	public CompilationUnit generateJavaSESensorImpl(Sensor sensorDriver) {

		StringTemplate templateOfSensorDriver = group.getInstanceOf("implsensor");
		templateOfSensorDriver.setAttribute("SensorDriver", sensorDriver);
		return new CompilationUnit(GlobalVariable.JAVASE_ENABLED_DEVICES + sensorDriver.getName() + ".java", templateOfSensorDriver, "JavaSESensorImpl", "sensor", sensorDriver);
	}
	
	// Android Sensor
	public CompilationUnit generateAndroidSensorImpl(Sensor sensorDriver) {

		StringTemplate templateOfSensorDriver = group.getInstanceOf("androidsensor");
		templateOfSensorDriver.setAttribute("SensorDriver", sensorDriver);
		return new CompilationUnit(GlobalVariable.ANDROID_ENABLED_DEVICES + sensorDriver.getName() + ".java", templateOfSensorDriver, "AndroidSensorImpl", "sensor", sensorDriver);
	}

	
	//JavaSE Actuator
	public CompilationUnit generateJavaSEActuatorImpl(Actuator actuatorDriver) {

		StringTemplate templateOfActuatorDriver = group.getInstanceOf("implactuator");
		templateOfActuatorDriver.setAttribute("Actuatordriver", actuatorDriver);
		return new CompilationUnit(GlobalVariable.JAVASE_ENABLED_DEVICES + actuatorDriver.getName() + ".java", templateOfActuatorDriver, "JavaSEActuatorImpl", "actuator", actuatorDriver);
	}
	
	// Android Actuator
	public CompilationUnit generateAndroidActuatorImpl(Actuator actuatorDriver) {
		StringTemplate templateOfActuatorDriver = group.getInstanceOf("androidactuator");
		templateOfActuatorDriver.setAttribute("Actuatordriver", actuatorDriver);
		return new CompilationUnit(GlobalVariable.ANDROID_ENABLED_DEVICES + actuatorDriver.getName() + ".java", templateOfActuatorDriver, "AndroidActuatorImpl", "actuator", actuatorDriver);
	}

	// JavaSE Storage Factory
	public CompilationUnit generateJavaSEStorageImpl(Storage storageService) {

		StringTemplate templateOfStorageService = group.getInstanceOf("implJavaSEStorage");
		templateOfStorageService.setAttribute("Storageservice", storageService);
		return new CompilationUnit("JavaSE" + storageService.getName() + ".java", templateOfStorageService, "deviceImpl", "actuator", storageService);
	}
	
	
	// Android User interface
	public CompilationUnit generateAndroidUserInterfaceImpl(UserInterface guiDriver) {

		StringTemplate templateOfGUIDriver = group.getInstanceOf("implAndroidGui");
		templateOfGUIDriver.setAttribute("GUIdriver", guiDriver);
		return new CompilationUnit("Android" + guiDriver.getName() + ".java", templateOfGUIDriver, "AndroidGuiImpl", "java", guiDriver);
	}
	
	
	// Android User interface
	public CompilationUnit generateJavaSEUserInterfaceImpl(UserInterface guiDriver) {

		StringTemplate templateOfGUIDriver = group.getInstanceOf("implJavaSEGui");
		templateOfGUIDriver.setAttribute("GUIdriver", guiDriver);
		return new CompilationUnit("JavaSE" + guiDriver.getName() + ".java", templateOfGUIDriver, "JavaSEGuiImpl", "java", guiDriver);
	}

	// Android gui layout
	public CompilationUnit generateAndroidUserInterfaceLayout(UserInterface guiDriver) {

		StringTemplate templateOfGUIDriver = group.getInstanceOf("guilayout");
		templateOfGUIDriver.setAttribute("GUIdriver", guiDriver);
		return new CompilationUnit(guiDriver.getName().toLowerCase() + "layout" + ".xml", templateOfGUIDriver, "androidgui", "layout", guiDriver);
	}
	
	//Android manifest
	public CompilationUnit generateAndroidManifest(Device device) {

		StringTemplate templateOfGUIDriver = group.getInstanceOf("devicemanifest");
		templateOfGUIDriver.setAttribute("device", device);
		return new CompilationUnit("AndroidManifest.xml", templateOfGUIDriver, "AndroidManifest", "manifest", device);
	}

	/*******************************************************************************
	 * 
	 * Code that generates framework for implementing device drivers - Interface
	 * 
	 * It is applied to Sensor Actuator Storage End-userGUI
	 * *******************************************************************************/

	// Sensor
	public CompilationUnit generateSensorInterface(Sensor sensorDriver) {

		StringTemplate templateOfSensorDriver = group.getInstanceOf("isensor");
		templateOfSensorDriver.setAttribute("SensorDriver", sensorDriver);
		return new CompilationUnit("I" + sensorDriver.getName() + ".java", templateOfSensorDriver, "Interface", "sensor", sensorDriver);
	}

	// Actuator
	public CompilationUnit generateActuatorInterface(Actuator actuatorDriver) {

		StringTemplate templateOfActuatorDriver = group.getInstanceOf("iactuator");
		templateOfActuatorDriver.setAttribute("Actuatordriver", actuatorDriver);
		return new CompilationUnit("I" + actuatorDriver.getName() + ".java", templateOfActuatorDriver, "Interface", "actuator", actuatorDriver);
	}

	// Storage
	public CompilationUnit generateJavaSEStorageInterface(Storage storageService) {
		StringTemplate templateOfStorageService = group.getInstanceOf("storageInterface");
		templateOfStorageService.setAttribute("Storageservice", storageService);
		return new CompilationUnit("I" + storageService.getName() + ".java", templateOfStorageService, "storageService", "Future", storageService);
	}

	// User Interface
	public CompilationUnit generateUserInterfaceInterface(UserInterface guiDriver) {

		StringTemplate templateOfGUIDriver = group.getInstanceOf("igui");
		templateOfGUIDriver.setAttribute("GUIdriver", guiDriver);
		return new CompilationUnit("I" + guiDriver.getName() + ".java", templateOfGUIDriver, "Interface", "gui", guiDriver);
	}

	/*******************************************************************************
	 * 
	 * Code that generates framework for implementing device drivers - Listener
	 * It is applied to only sensor, actuator, storage, and end-user gui
	 *******************************************************************************/

	public CompilationUnit generateSensorListener(SensorMeasurement sensorMeasurement) {

		StringTemplate templateOfSensorDriver = group.getInstanceOf("sensorlistener");
		templateOfSensorDriver.setAttribute("SensorDriver", sensorMeasurement);
		return new CompilationUnit("Listener" + sensorMeasurement.getName() + ".java", templateOfSensorDriver, "Listener", "sensor", sensorMeasurement);

	}

	/*******************************************************************************
	 * 
	 * Code that generates framework for startup code
	 * 
	 *******************************************************************************/

	public CompilationUnit generateDeviceStartup(Device device) {

		StringTemplate templateOfDevice = group.getInstanceOf("device");
		templateOfDevice.setAttribute("device", device);
		return new CompilationUnit("Startup" + ".java", templateOfDevice, "device", device.getName(), device);

	}

	/*******************************************************************************
	 * 
	 * Code that generates framework for platform-specific project
	 * 
	 *******************************************************************************/

	public CompilationUnit generatePlatformSpecificProjectFile(Device device) {

		// For JavaSE-enabled devices
		if (device.getType().equals(GlobalVariable.JAVASE_ENABLED_DEVICES)) {

			StringTemplate templateOfDevice = group.getInstanceOf("eclipseprojectpc");
			templateOfDevice.setAttribute("device", device);
			return new CompilationUnit(".project", templateOfDevice, "deviceProject", device.getName(), device);

		} else { // For Android-enabled devices

			StringTemplate templateOfDevice = group.getInstanceOf("eclipseprojectandroid");
			templateOfDevice.setAttribute("device", device);
			return new CompilationUnit(".project", templateOfDevice, "deviceProject", device.getName(), device);

		}

	}

	/*******************************************************************************
	 * 
	 * Code that generates framework for platform-specific startup
	 * 
	 *******************************************************************************/

	public CompilationUnit generatePlatformSpecificExecutionStartup(Device device) {

		// For JavaSE devices
		if (device.getType().equals(GlobalVariable.JAVASE_ENABLED_DEVICES)) {
			StringTemplate templateOfDevice = group.getInstanceOf("deskexecution");
			templateOfDevice.setAttribute("device", device);
			return new CompilationUnit(device.getName() + "Main" + ".java", templateOfDevice, "device", device.getName(), device);

		}

		// For Android devices
		if (device.getType().equals(GlobalVariable.ANDROID_ENABLED_DEVICES)) {

			StringTemplate templateOfDevice = group.getInstanceOf("androidexecution");
			templateOfDevice.setAttribute("device", device);
			return new CompilationUnit("MainActivity" + ".java", templateOfDevice, "AndroidDevice", device.getName(), device);
		}

		return null;
	}

	/* ******************************************************
	 * The following two functions are under-research
	 * 
	 * ******************************************************
	 */

	// Un-used right now
	public CompilationUnit buildAbstractClassOFRegion(Region region, String className) {

		StringTemplate templateOfStructure = group.getInstanceOf(className);
		templateOfStructure.setAttribute("region", region);
		return new CompilationUnit(className + ".java", templateOfStructure, "Region", "Future", region);
	}

	/*
	 * public CompilationUnit buildGUIManifest(GUIDriver guiDriver) {
	 * 
	 * StringTemplate templateOfGUIDriver = group.getInstanceOf("guiManifest");
	 * templateOfGUIDriver.setAttribute("GUIdriver", guiDriver); return new
	 * CompilationUnit("AndroidManifest.xml", templateOfGUIDriver, "androidgui",
	 * "manifest", guiDriver); }
	 */

}
