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

	/**
	 * @param JavaSE Platform Code - Start
	 * Date : 8th December, 2015 @author : Pankesh Patel
	 */
	
	
	/*  
	 * JavaSE Sensor Code
	 *  
	 */
	
	// JavaSE Sensor Impl
	public CompilationUnit generateJavaSESensorImpl(Sensor sensorDriver) {
		StringTemplate templateOfSensorDriver = group.getInstanceOf("JavaSE/implsensor");
		templateOfSensorDriver.setAttribute("SensorDriver", sensorDriver);
		return new CompilationUnit(GlobalVariable.JAVASE_ENABLED_DEVICES + sensorDriver.getName() + ".java", templateOfSensorDriver, "JavaSESensorImpl", "sensor", sensorDriver);
	}
	
	// JavaSE Sensor Factory
	public CompilationUnit generateJavaSESensorFactory(Sensor sensorDriver) {
		StringTemplate templateOfSensorDriver = group.getInstanceOf("JavaSE/javasesensorfactory");
		templateOfSensorDriver.setAttribute("SensorDriver", sensorDriver);
		return new CompilationUnit(sensorDriver.getName() + "Factory" + ".java", templateOfSensorDriver, "JavaSEFactory", "Sensor", sensorDriver);
	}
	
	//JavaSE Actuator Impl
	public CompilationUnit generateJavaSEActuatorImpl(Actuator actuatorDriver) {
		StringTemplate templateOfActuatorDriver = group.getInstanceOf("JavaSE/implactuator");
		templateOfActuatorDriver.setAttribute("Actuatordriver", actuatorDriver);
		return new CompilationUnit(GlobalVariable.JAVASE_ENABLED_DEVICES + actuatorDriver.getName() + ".java", templateOfActuatorDriver, "JavaSEActuatorImpl", "actuator", actuatorDriver);
	}
	
	// JavaSE Actuator Factory
	public CompilationUnit generateJavaSEActuatorFactory(Actuator actuatorDriver) {
		StringTemplate templateOfActuatorDriver = group.getInstanceOf("JavaSE/javaseactuatorfactory");
		templateOfActuatorDriver.setAttribute("Actuatordriver", actuatorDriver);
		return new CompilationUnit(actuatorDriver.getName() + "Factory" + ".java", templateOfActuatorDriver, "JavaSEFactory", "Actuator", actuatorDriver);
	}	
	
	// JavaSE Storage Impl
	public CompilationUnit generateJavaSEStorageImpl(Storage storageService) {
		StringTemplate templateOfStorageService = group.getInstanceOf("JavaSE/implJavaSEStorage");
		templateOfStorageService.setAttribute("Storageservice", storageService);
		return new CompilationUnit("JavaSE" + storageService.getName() + ".java", templateOfStorageService, "JavaSEStorageImpl", "actuator", storageService);
	}
	
	// JavaSE Storage Factory
	public CompilationUnit generateJavaSEStorageFactory(Storage storageService) {
		StringTemplate templateOfStorageService = group.getInstanceOf("JavaSE/storageJavaSEFactory");
		templateOfStorageService.setAttribute("Storageservice", storageService);
		return new CompilationUnit(storageService.getName() + "Factory" + ".java", templateOfStorageService, "JavaSEFactory", "Future", storageService);
	}	
	
	// JavaSE Userinterface Impl
	public CompilationUnit generateJavaSEUserInterfaceImpl(UserInterface guiDriver) {
		StringTemplate templateOfGUIDriver = group.getInstanceOf("JavaSE/implJavaSEGui");
		templateOfGUIDriver.setAttribute("GUIdriver", guiDriver);
		return new CompilationUnit("JavaSE" + guiDriver.getName() + ".java", templateOfGUIDriver, "JavaSEGuiImpl", "java", guiDriver);
	}
	
	//JavaSE  Userinterface Factory 
	public CompilationUnit generateJavaSEUserInterfaceFactory(UserInterface guiDriver) {
		StringTemplate templateOfGUIDriver = group.getInstanceOf("JavaSE/guiJavaseFactory");
		templateOfGUIDriver.setAttribute("GUIdriver", guiDriver);
		return new CompilationUnit(guiDriver.getName() + "Factory" + ".java", templateOfGUIDriver, "JavaSEFactory", "gui", guiDriver);
	}
	
	//JavaSE Actuator
	public CompilationUnit generateJavaSEActuatorLogic(Actuator actuatorDriver) {

		StringTemplate templateOfActuatorDriver = group.getInstanceOf("JavaSE/ljavaseactuator");
		templateOfActuatorDriver.setAttribute("Actuatordriver", actuatorDriver);
		return new CompilationUnit("Logic" + actuatorDriver.getName() + ".java", templateOfActuatorDriver, "JavaSELogic", "actuator", actuatorDriver);
	}
	
	
	/*
	 *  Android Platform - start
	 * 
	 */
	
	// Android Sensor
	public CompilationUnit generateAndroidSensorFactory(Sensor sensorDriver) {
		StringTemplate templateOfSensorDriver = group.getInstanceOf("Android/androidsensorfactory");
		templateOfSensorDriver.setAttribute("SensorDriver", sensorDriver);
		return new CompilationUnit(sensorDriver.getName() + "Factory" + ".java", templateOfSensorDriver, "AndroidFactory", "Sensor", sensorDriver);
	}

	// Android Actuator
	public CompilationUnit generateAndroidActuatorFactory(Actuator actuatorDriver) {
		StringTemplate templateOfActuatorDriver = group.getInstanceOf("Android/androidactuatorfactory");
		templateOfActuatorDriver.setAttribute("Actuatordriver", actuatorDriver);
		return new CompilationUnit(actuatorDriver.getName() + "Factory" + ".java", templateOfActuatorDriver, "AndroidFactory", "Actuator", actuatorDriver);
	}
	
	public CompilationUnit generateAndroidStorageFactory(Storage storageService) {
		StringTemplate templateOfStorageService = group.getInstanceOf("Android/storageAndroidFactory");
		templateOfStorageService.setAttribute("Storageservice", storageService);
		return new CompilationUnit(storageService.getName() + "Factory" + ".java", templateOfStorageService, "AndroidFactory", "Future", storageService);
	}

	// Factory for the Android GUI
	public CompilationUnit generateAndroidUserInterfaceFactory(UserInterface guiDriver) {
		StringTemplate templateOfGUIDriver = group.getInstanceOf("Android/guiAndroidFactory");
		templateOfGUIDriver.setAttribute("GUIdriver", guiDriver);
		return new CompilationUnit(guiDriver.getName() + "Factory" + ".java", templateOfGUIDriver, "AndroidFactory", "gui", guiDriver);
	}
	
	// Android Sensor
	public CompilationUnit generateAndroidSensorImpl(Sensor sensorDriver) {
		StringTemplate templateOfSensorDriver = group.getInstanceOf("Android/androidsensor");
		templateOfSensorDriver.setAttribute("SensorDriver", sensorDriver);
		return new CompilationUnit(GlobalVariable.ANDROID_ENABLED_DEVICES + sensorDriver.getName() + ".java", templateOfSensorDriver, "AndroidSensorImpl", "sensor", sensorDriver);
	}
	
	// Android Actuator
	public CompilationUnit generateAndroidActuatorImpl(Actuator actuatorDriver) {
		StringTemplate templateOfActuatorDriver = group.getInstanceOf("Android/androidactuator");
		templateOfActuatorDriver.setAttribute("Actuatordriver", actuatorDriver);
		return new CompilationUnit(GlobalVariable.ANDROID_ENABLED_DEVICES + actuatorDriver.getName() + ".java", templateOfActuatorDriver, "AndroidActuatorImpl", "actuator", actuatorDriver);
	}

	public CompilationUnit generateAndroidStorageImpl(Storage storageService) {
		StringTemplate templateOfStorageService = group.getInstanceOf("Android/implAndroidStorage");
		templateOfStorageService.setAttribute("Storageservice", storageService);
		return new CompilationUnit("Android" + storageService.getName() + ".java", templateOfStorageService, "AndroidStorageImpl", "actuator", storageService);
	}	
	// Android User interface
	public CompilationUnit generateAndroidUserInterfaceImpl(UserInterface guiDriver) {
		StringTemplate templateOfGUIDriver = group.getInstanceOf("Android/implAndroidGui");
		templateOfGUIDriver.setAttribute("GUIdriver", guiDriver);
		return new CompilationUnit("Android" + guiDriver.getName() + ".java", templateOfGUIDriver, "AndroidGuiImpl", "java", guiDriver);
	}
	
	//Android manifest
	public CompilationUnit generateAndroidManifest(Device device) {

		StringTemplate templateOfGUIDriver = group.getInstanceOf("Android/devicemanifest");
		templateOfGUIDriver.setAttribute("device", device);
		return new CompilationUnit("AndroidManifest.xml", templateOfGUIDriver, "AndroidManifest", "manifest", device);
	}
	
	/*
	 *  Android Platform - end
	*/
	
	
	/*
	 *  Common code - start
	 * 
	 */
	
	// User interface
	public CompilationUnit generateUserInterfaceLogic(UserInterface guiDriver) {		
		StringTemplate templateOfGUIDriver = group.getInstanceOf("Common/lgui");
		templateOfGUIDriver.setAttribute("GUIdriver", guiDriver);
		return new CompilationUnit("Logic" + guiDriver.getName() + ".java", templateOfGUIDriver, "Logic", "gui", guiDriver);
	}
	
	// For generating listener for GUI.
	public CompilationUnit generateUserInterfaceListener(UserInterface guiDriver) {		
		StringTemplate templateOfGUIDriver = group.getInstanceOf("Common/guilistener");
		templateOfGUIDriver.setAttribute("GUIdriver", guiDriver);
		return new CompilationUnit("Listener" + guiDriver.getName() + ".java", templateOfGUIDriver, "Listener", "gui", guiDriver);
	}

	// ComputationalService
	public CompilationUnit generateComputationalServiceLogic(ComputationalService computationalService) {

		StringTemplate templateOfComputationalService = group.getInstanceOf("Common/lcomputation");
		templateOfComputationalService.setAttribute("CS", computationalService);
		return new CompilationUnit("Logic" + computationalService.getName() + ".java", templateOfComputationalService, "Logic", "Future", computationalService);
	}
	
	// Sensor
	public CompilationUnit generateSensorInterface(Sensor sensorDriver) {

		StringTemplate templateOfSensorDriver = group.getInstanceOf("Common/isensor");
		templateOfSensorDriver.setAttribute("SensorDriver", sensorDriver);
		return new CompilationUnit("I" + sensorDriver.getName() + ".java", templateOfSensorDriver, "Interface", "sensor", sensorDriver);
	}

	// Actuator
	public CompilationUnit generateActuatorInterface(Actuator actuatorDriver) {

		StringTemplate templateOfActuatorDriver = group.getInstanceOf("Common/iactuator");
		templateOfActuatorDriver.setAttribute("Actuatordriver", actuatorDriver);
		return new CompilationUnit("I" + actuatorDriver.getName() + ".java", templateOfActuatorDriver, "Interface", "actuator", actuatorDriver);
	}
	
	// User Interface
	public CompilationUnit generateUserInterfaceInterface(UserInterface guiDriver) {

		StringTemplate templateOfGUIDriver = group.getInstanceOf("Common/igui");
		templateOfGUIDriver.setAttribute("GUIdriver", guiDriver);
		return new CompilationUnit("I" + guiDriver.getName() + ".java", templateOfGUIDriver, "Interface", "gui", guiDriver);
	}

	
	public CompilationUnit generateSensorListener(SensorMeasurement sensorMeasurement) {
		StringTemplate templateOfSensorDriver = group.getInstanceOf("Common/sensorlistener");
		templateOfSensorDriver.setAttribute("SensorDriver", sensorMeasurement);
		return new CompilationUnit("Listener" + sensorMeasurement.getName() + ".java", templateOfSensorDriver, "Listener", "sensor", sensorMeasurement);
	}

	public CompilationUnit generateDeviceStartup(Device device) {
		StringTemplate templateOfDevice = group.getInstanceOf("Common/device");
		templateOfDevice.setAttribute("device", device);
		return new CompilationUnit("Startup" + ".java", templateOfDevice, "device", device.getName(), device);
	}
	
	// Sensor
	public CompilationUnit generateSensorLogic(Sensor sensorDriver) {

		StringTemplate templateOfSensorDriver = group.getInstanceOf("Common/lsensor");
		templateOfSensorDriver.setAttribute("SensorDriver", sensorDriver);
		return new CompilationUnit("Logic" + sensorDriver.getName() + ".java", templateOfSensorDriver, "Logic", "sensor", sensorDriver);
	}

	
	
	//Android Actuator
	public CompilationUnit generateAndroidActuatorLogic(Actuator actuatorDriver) {

		StringTemplate templateOfActuatorDriver = group.getInstanceOf("Android/landroidactuator");
		templateOfActuatorDriver.setAttribute("Actuatordriver", actuatorDriver);
		return new CompilationUnit("Logic" + actuatorDriver.getName() + ".java", templateOfActuatorDriver, "AndroidLogic", "actuator", actuatorDriver);
	}

	// Storage
	public CompilationUnit generateJavaSEStorageLogic(Storage storageService) {

		StringTemplate templateOfStorageService = group.getInstanceOf("JavaSE/lstorage");
		templateOfStorageService.setAttribute("Storageservice", storageService);
		return new CompilationUnit("Logic" + storageService.getName() + ".java", templateOfStorageService, "Logic", "storage", storageService);
	}
	
	//Structure 
	public CompilationUnit generateDataStructure(Struct struct) {
		StringTemplate templateOfStructure = group.getInstanceOf("Common/structure");
		templateOfStructure.setAttribute("struct", struct);
		return new CompilationUnit(struct.getName() + ".java", templateOfStructure, "structure", "Future", struct);		
	}
	
	// Sensor
	public CompilationUnit generateSensorInteraction(Sensor sensorDriver) {
		StringTemplate templateOfSensorDriver = group.getInstanceOf("Common/sensordriver");
		templateOfSensorDriver.setAttribute("SensorDriver", sensorDriver);
		return new CompilationUnit(sensorDriver.getName() + ".java", templateOfSensorDriver, "sensorDriver", "Future", sensorDriver);
	}

	// Actuator
	public CompilationUnit generateActuatorInteraction(Actuator actuatorDriver) {

		StringTemplate templateOfActuatorDriver = group.getInstanceOf("Common/actuatordriver");
		templateOfActuatorDriver.setAttribute("Actuatordriver", actuatorDriver);
		return new CompilationUnit(actuatorDriver.getName() + ".java", templateOfActuatorDriver, "actuatorDriver", "Future", actuatorDriver);
	}
	
	// Storage
	public CompilationUnit generateStorageInteraction(Storage storageService) {

		StringTemplate templateOfStorageService = group.getInstanceOf("Common/storageservice");
		templateOfStorageService.setAttribute("Storageservice", storageService);
		return new CompilationUnit(storageService.getName() + ".java", templateOfStorageService, "storageService", "Future", storageService);
	}	
	
	// User interface
	public CompilationUnit generateUserInterfaceInteraction(UserInterface guiDriver) {
		StringTemplate templateOfGUIDriver = group.getInstanceOf("Common/guidriver");
		templateOfGUIDriver.setAttribute("GUIdriver", guiDriver);
		return new CompilationUnit(guiDriver.getName() + ".java", templateOfGUIDriver, "guiDriver", "Future", guiDriver);
	}
	
	// ComputationalService
	public CompilationUnit generateComputationalServiceInteraction(ComputationalService computationalService) {

		StringTemplate templateOfComputationalService = group.getInstanceOf("Common/cs");
		templateOfComputationalService.setAttribute("CS", computationalService);
		return new CompilationUnit(computationalService.getName() + ".java", templateOfComputationalService, "computationalService", "Future", computationalService);
	}
	
	// Storage  - interface
	public CompilationUnit generateJavaSEStorageInterface(Storage storageService) {
		StringTemplate templateOfStorageService = group.getInstanceOf("Common/storageInterface");
		templateOfStorageService.setAttribute("Storageservice", storageService);
		return new CompilationUnit("I" + storageService.getName() + ".java", templateOfStorageService, "storageService", "Future", storageService);
	}



	

	public CompilationUnit generatePlatformSpecificProjectFile(Device device) {

		// For JavaSE-enabled devices
		if (device.getType().equals(GlobalVariable.JAVASE_ENABLED_DEVICES)) {

			StringTemplate templateOfDevice = group.getInstanceOf("JavaSE/eclipseProjectJavaSE");
			templateOfDevice.setAttribute("device", device);
			return new CompilationUnit(".project", templateOfDevice, "deviceProject", device.getName(), device);

		} 
		
		if (device.getType().equals(GlobalVariable.ANDROID_ENABLED_DEVICES)) {
			StringTemplate templateOfDevice = group.getInstanceOf("Android/eclipseProjectAndroid");
			templateOfDevice.setAttribute("device", device);
			return new CompilationUnit(".project", templateOfDevice, "deviceProject", device.getName(), device);
		}
		
		return null;
	}

	public CompilationUnit generatePlatformSpecificExecutionStartup(Device device) {

		if (device.getType().equals(GlobalVariable.JAVASE_ENABLED_DEVICES)) {
			StringTemplate templateOfDevice = group.getInstanceOf("JavaSE/executionJavaSE");
			templateOfDevice.setAttribute("device", device);
			return new CompilationUnit(device.getName() + "Main" + ".java", templateOfDevice, "device", device.getName(), device);
		}

		if (device.getType().equals(GlobalVariable.ANDROID_ENABLED_DEVICES)) {
			StringTemplate templateOfDevice = group.getInstanceOf("Android/executionAndroid");
			templateOfDevice.setAttribute("device", device);
			return new CompilationUnit("MainActivity" + ".java", templateOfDevice, "AndroidDevice", device.getName(), device);
		}

		return null;
	}

	

	//  Un-used the following code right now. It may be useful in future design
	
	
	
	/*public CompilationUnit buildAbstractClassOFRegion(Region region, String className) {

		StringTemplate templateOfStructure = group.getInstanceOf(className);
		templateOfStructure.setAttribute("region", region);
		return new CompilationUnit(className + ".java", templateOfStructure, "Region", "Future", region);
	}

	
	 * public CompilationUnit buildGUIManifest(GUIDriver guiDriver) {
	 * 
	 * StringTemplate templateOfGUIDriver = group.getInstanceOf("guiManifest");
	 * templateOfGUIDriver.setAttribute("GUIdriver", guiDriver); return new
	 * CompilationUnit("AndroidManifest.xml", templateOfGUIDriver, "androidgui",
	 * "manifest", guiDriver); }
	 */
	
	// Android gui layout
	/*public CompilationUnit generateAndroidUserInterfaceLayout(UserInterface guiDriver) {

		StringTemplate templateOfGUIDriver = group.getInstanceOf("guilayout");
		templateOfGUIDriver.setAttribute("GUIdriver", guiDriver);
		return new CompilationUnit(guiDriver.getName().toLowerCase() + "layout" + ".xml", templateOfGUIDriver, "androidgui", "layout", guiDriver);
	}*/
	
	

}
