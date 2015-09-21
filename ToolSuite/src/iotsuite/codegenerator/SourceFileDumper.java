package iotsuite.codegenerator;

import iotsuite.common.GlobalVariable;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SourceFileDumper {

	private File file;

	public SourceFileDumper() {

	}

	public void dumpCompilationUnit(CompilationUnit template) {

		/*
		 * The following part of the code is evaluated true, when activity =
		 * "Generate Device Driver"
		 */

		if (GlobalVariable.activity
				.equals(GlobalVariable.ACTIVITY_GENERATE_DEVICEDRIVER)) {

			// For JavaSE enabled devices
			if (GlobalVariable.ENABLE_JAVASE_CODE_GENERATATION) {
				generateCodeForJavaSEDeviceDriverActivity(template,
						GlobalVariable.deviceJAVASEType, null);
			}
			// For Android-enabled devices
			if (GlobalVariable.ENABLE_ANDROID_CODE_GENERATION) {
				generateCodeForAndroidDeviceDriverActivity(template,
						GlobalVariable.deviceAndroidType, null);
			}
		}

		if (GlobalVariable.activity
				.equals(GlobalVariable.ACTIVITY_GENERATE_USERINTERACTION)) {

			// For JavaSE enabled devices
			if (GlobalVariable.ENABLE_JAVASE_CODE_GENERATATION) {
				generateCodeForJavaSEDeviceDriverActivity(template,
						GlobalVariable.deviceJAVASEType, null);
			}
			// For Android-enabled devices
			if (GlobalVariable.ENABLE_ANDROID_CODE_GENERATION) {
				generateCodeForAndroidDeviceDriverActivity(template,
						GlobalVariable.deviceAndroidType, null);
			}
		}

		/*
		 * The following part of the code is evaluated true, when activity =
		 * "Generate Architecture Framework"
		 */

		if (GlobalVariable.activity
				.equals(GlobalVariable.ACTIVITY_GENERATE_ARCHITECTUREFRAMEWORK)) {

			generateCodeForArchitectureFrameworkActivity(template,
					"ApplicationLogic", null);
		}

		// For JavaSE

		/*
		 * if (GlobalVariable.ENABLE_JAVASE_CODE_GENERATATION) {
		 * generateCodeForArchitectureFrameworkActivity(template,
		 * GlobalVariable.deviceJAVASEType, null);
		 * 
		 * }
		 * 
		 * // For Android if (GlobalVariable.ENABLE_ANDROID_CODE_GENERATION) {
		 * generateCodeForArchitectureFrameworkActivity(template,
		 * GlobalVariable.deviceAndroidType, null); }
		 */

		/*
		 * The following part of the code is evaluated true, when activity =
		 * "mapping"
		 */

		if (GlobalVariable.activity
				.equals(GlobalVariable.ACTIVITY_GENERATE_MAPPING)) {

			// For Android enabled devices
			if (GlobalVariable.ENABLE_ANDROID_CODE_GENERATION) {
				generateCodeForMappingActivitity(template, "deviceMapping",
						"Android");
			}
			// For JavaSE enabled devices
			if (GlobalVariable.ENABLE_JAVASE_CODE_GENERATATION) {
				generateCodeForMappingActivitity(template,
						GlobalVariable.deviceJAVASEType,
						GlobalVariable.templatePath);
			}
		}
	}

	/*
	 * The following function will generate for (1) factory, (2) deviceImp, (3)
	 * Logic, and (4) framework.
	 */

	private void generateCodeForJavaSEDeviceDriverActivity(
			CompilationUnit unit, String deviceType, String str) {

		String content = unit.getStringTemplateName();

		/*
		 * The following if...condition code generates programming framework for
		 * "logic" package Logic files for Sensor, Actuator, Storage.
		 */

		if (unit.getFileCategory().equals("JavaSELogic")) {
			new File(GlobalVariable.templatePath + deviceType + "DeviceDrivers"
					+ GlobalVariable.outputDirPath
					+ GlobalVariable.logicDirPath).mkdirs();
			file = new File(GlobalVariable.templatePath + deviceType
					+ "DeviceDrivers" + GlobalVariable.outputDirPath
					+ GlobalVariable.logicDirPath + "/"
					+ unit.getFileNameToGenerate());
		}

		else if (unit.getFileCategory().equals("Logic")) {
			new File(GlobalVariable.templatePath + deviceType + "DeviceDrivers"
					+ GlobalVariable.outputDirPath
					+ GlobalVariable.logicDirPath).mkdirs();
			file = new File(GlobalVariable.templatePath + deviceType
					+ "DeviceDrivers" + GlobalVariable.outputDirPath
					+ GlobalVariable.logicDirPath + "/"
					+ unit.getFileNameToGenerate());
		}

		else if (unit.getFileCategory().equals("JavaSESensorLogic")) {
			new File(GlobalVariable.templatePath + deviceType + "DeviceDrivers"
					+ GlobalVariable.outputDirPath
					+ GlobalVariable.logicDirPath).mkdirs();
			file = new File(GlobalVariable.templatePath + deviceType
					+ "DeviceDrivers" + GlobalVariable.outputDirPath
					+ GlobalVariable.logicDirPath + "/"
					+ unit.getFileNameToGenerate());
		}

		else if (unit.getFileCategory().equals("JavaSEGuiLogic")) {
			new File(GlobalVariable.templatePath + deviceType + "DeviceDrivers"
					+ GlobalVariable.outputDirPath
					+ GlobalVariable.logicDirPath).mkdirs();
			file = new File(GlobalVariable.templatePath + deviceType
					+ "DeviceDrivers" + GlobalVariable.outputDirPath
					+ GlobalVariable.logicDirPath + "/"
					+ unit.getFileNameToGenerate());
		}

		/*
		 * The following if...condition code generates programming framework for
		 * "factory" package Factory files for Sensor, Actuator, Storage.
		 */

		else if (unit.getFileCategory().equals("JavaSEFactory")) {
			new File(GlobalVariable.templatePath + deviceType + "DeviceDrivers"
					+ GlobalVariable.outputDirPath
					+ GlobalVariable.factoryDirPath).mkdirs();
			file = new File(GlobalVariable.templatePath + deviceType
					+ "DeviceDrivers" + GlobalVariable.outputDirPath
					+ GlobalVariable.factoryDirPath + "/"
					+ unit.getFileNameToGenerate());

		}

		else if (unit.getFileCategory().equals("JavaSEStorageImpl")) {
			new File(GlobalVariable.templatePath + deviceType + "DeviceDrivers"
					+ GlobalVariable.outputDirPath
					+ GlobalVariable.deviceImplDirPath).mkdirs();
			file = new File(GlobalVariable.templatePath + deviceType
					+ "DeviceDrivers" + GlobalVariable.outputDirPath
					+ GlobalVariable.deviceImplDirPath + "/"
					+ unit.getFileNameToGenerate());
		} else if (unit.getFileCategory().equals("JavaSEGuiImpl")) {
			new File(GlobalVariable.templatePath + deviceType + "DeviceDrivers"
					+ GlobalVariable.outputDirPath
					+ GlobalVariable.deviceImplDirPath).mkdirs();
			file = new File(GlobalVariable.templatePath + deviceType
					+ "DeviceDrivers" + GlobalVariable.outputDirPath
					+ GlobalVariable.deviceImplDirPath + "/"
					+ unit.getFileNameToGenerate());
		} else if (unit.getFileCategory().equals("JavaSEFactory")) {
			new File(GlobalVariable.templatePath + deviceType + "DeviceDrivers"
					+ GlobalVariable.outputDirPath
					+ GlobalVariable.factoryDirPath).mkdirs();
			file = new File(GlobalVariable.templatePath + deviceType
					+ "DeviceDrivers" + GlobalVariable.outputDirPath
					+ GlobalVariable.factoryDirPath + "/"
					+ unit.getFileNameToGenerate());
		} else if (unit.getFileCategory().equals("AndroidFactory")
				|| unit.getFileCategory().equals("AndroidSensorImpl")
				|| unit.getFileCategory().equals("AndroidActuatorImpl")
				|| unit.getFileCategory().equals("AndroidLogic")
				|| unit.getFileCategory().equals("AndroidGuiImpl")
				|| unit.getFileCategory().equals("AndroidStorageImpl")
				|| unit.getFileCategory().equals("AndroidFactory")
				|| unit.getFileCategory().equals("AndroidGuiLogic")
				|| unit.getFileCategory().equals("AndroidSensorLogic")) {
			// Do nothing
		}

		else if (unit.getFileCategory().equals("JavaSESensorImpl")) {
			new File(GlobalVariable.templatePath + deviceType + "DeviceDrivers"
					+ GlobalVariable.outputDirPath
					+ GlobalVariable.deviceImplDirPath).mkdirs();
			file = new File(GlobalVariable.templatePath + deviceType
					+ "DeviceDrivers" + GlobalVariable.outputDirPath
					+ GlobalVariable.deviceImplDirPath + "/"
					+ unit.getFileNameToGenerate());
		}

		else if (unit.getFileCategory().equals("JavaSEActuatorImpl")) {
			new File(GlobalVariable.templatePath + deviceType + "DeviceDrivers"
					+ GlobalVariable.outputDirPath
					+ GlobalVariable.deviceImplDirPath).mkdirs();
			file = new File(GlobalVariable.templatePath + deviceType
					+ "DeviceDrivers" + GlobalVariable.outputDirPath
					+ GlobalVariable.deviceImplDirPath + "/"
					+ unit.getFileNameToGenerate());
		}

		else if (unit.getFileCategory().equals("AndroidGuiImpl")) {
			new File(GlobalVariable.templatePath + deviceType + "DeviceDrivers"
					+ GlobalVariable.outputDirPath
					+ GlobalVariable.deviceImplDirPath).mkdirs();
			file = new File(GlobalVariable.templatePath + deviceType
					+ "DeviceDrivers" + GlobalVariable.outputDirPath
					+ GlobalVariable.deviceImplDirPath + "/"
					+ unit.getFileNameToGenerate());
		} else {
			new File(GlobalVariable.templatePath + deviceType + "DeviceDrivers"
					+ GlobalVariable.outputDirPath
					+ GlobalVariable.frameworkDirPath).mkdirs();
			file = new File(GlobalVariable.templatePath + deviceType
					+ "DeviceDrivers" + GlobalVariable.outputDirPath
					+ GlobalVariable.frameworkDirPath + "/"
					+ unit.getFileNameToGenerate());
		}
		if (file != null) {
			try {
				file.createNewFile();
				FileWriter writer = new FileWriter(file);
				writer.write(content);
				writer.flush();
				writer.close();
				System.out.println("Done! --- " + unit.getFileNameToGenerate());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private void generateCodeForAndroidDeviceDriverActivity(
			CompilationUnit unit, String deviceType, String str) {
		String content = unit.getStringTemplateName();

		/*
		 * The following if...condition code generates programming framework for
		 * "logic" package Logic files for Sensor, Actuator, Storage.
		 */

		if (unit.getFileCategory().equals("AndroidLogic")) {
			new File(GlobalVariable.templatePath + deviceType + "DeviceDrivers"
					+ GlobalVariable.outputDirPath
					+ GlobalVariable.logicDirPath).mkdirs();
			file = new File(GlobalVariable.templatePath + deviceType
					+ "DeviceDrivers" + GlobalVariable.outputDirPath
					+ GlobalVariable.logicDirPath + "/"
					+ unit.getFileNameToGenerate());
		} else if (unit.getFileCategory().equals("Logic")) {
			new File(GlobalVariable.templatePath + deviceType + "DeviceDrivers"
					+ GlobalVariable.outputDirPath
					+ GlobalVariable.logicDirPath).mkdirs();
			file = new File(GlobalVariable.templatePath + deviceType
					+ "DeviceDrivers" + GlobalVariable.outputDirPath
					+ GlobalVariable.logicDirPath + "/"
					+ unit.getFileNameToGenerate());
		} else if (unit.getFileCategory().equals("AndroidSensorLogic")) {
			new File(GlobalVariable.templatePath + deviceType + "DeviceDrivers"
					+ GlobalVariable.outputDirPath
					+ GlobalVariable.logicDirPath).mkdirs();
			file = new File(GlobalVariable.templatePath + deviceType
					+ "DeviceDrivers" + GlobalVariable.outputDirPath
					+ GlobalVariable.logicDirPath + "/"
					+ unit.getFileNameToGenerate());
		}

		else if (unit.getFileCategory().equals("AndroidGuiLogic")) {
			new File(GlobalVariable.templatePath + deviceType + "DeviceDrivers"
					+ GlobalVariable.outputDirPath
					+ GlobalVariable.logicDirPath).mkdirs();
			file = new File(GlobalVariable.templatePath + deviceType
					+ "DeviceDrivers" + GlobalVariable.outputDirPath
					+ GlobalVariable.logicDirPath + "/"
					+ unit.getFileNameToGenerate());
		}

		else if (unit.getFileCategory().equals("AndroidFactory")) {
			new File(GlobalVariable.templatePath + deviceType + "DeviceDrivers"
					+ GlobalVariable.outputDirPath
					+ GlobalVariable.factoryDirPath).mkdirs();
			file = new File(GlobalVariable.templatePath + deviceType
					+ "DeviceDrivers" + GlobalVariable.outputDirPath
					+ GlobalVariable.factoryDirPath + "/"
					+ unit.getFileNameToGenerate());
		} else if (unit.getFileCategory().equals("AndroidStorageImpl")) {
			new File(GlobalVariable.templatePath + deviceType + "DeviceDrivers"
					+ GlobalVariable.outputDirPath
					+ GlobalVariable.deviceImplDirPath).mkdirs();
			file = new File(GlobalVariable.templatePath + deviceType
					+ "DeviceDrivers" + GlobalVariable.outputDirPath
					+ GlobalVariable.deviceImplDirPath + "/"
					+ unit.getFileNameToGenerate());
		} else if (unit.getFileCategory().equals("AndroidFactory")) {
			new File(GlobalVariable.templatePath + deviceType + "DeviceDrivers"
					+ GlobalVariable.outputDirPath
					+ GlobalVariable.factoryDirPath).mkdirs();
			file = new File(GlobalVariable.templatePath + deviceType
					+ "DeviceDrivers" + GlobalVariable.outputDirPath
					+ GlobalVariable.factoryDirPath + "/"
					+ unit.getFileNameToGenerate());
		} else if (unit.getFileCategory().equals("JavaSEFactory")
				|| unit.getFileCategory().equals("JavaSESensorImpl")
				|| unit.getFileCategory().equals("JavaSEActuatorImpl")
				|| unit.getFileCategory().equals("JavaSELogic")
				|| unit.getFileCategory().equals("JavaSEGuiImpl")
				|| unit.getFileCategory().equals("JavaSEFactory")
				|| unit.getFileCategory().equals("JavaSEStorageImpl")
				|| unit.getFileCategory().equals("JavaSEGuiLogic")
				|| unit.getFileCategory().equals("JavaSESensorLogic")) {

			// Do nothing

		}

		else if (unit.getFileCategory().equals("AndroidSensorImpl")) {
			new File(GlobalVariable.templatePath + deviceType + "DeviceDrivers"
					+ GlobalVariable.outputDirPath
					+ GlobalVariable.deviceImplDirPath).mkdirs();
			file = new File(GlobalVariable.templatePath + deviceType
					+ "DeviceDrivers" + GlobalVariable.outputDirPath
					+ GlobalVariable.deviceImplDirPath + "/"
					+ unit.getFileNameToGenerate());
		}

		else if (unit.getFileCategory().equals("AndroidActuatorImpl")) {
			new File(GlobalVariable.templatePath + deviceType + "DeviceDrivers"
					+ GlobalVariable.outputDirPath
					+ GlobalVariable.deviceImplDirPath).mkdirs();
			file = new File(GlobalVariable.templatePath + deviceType
					+ "DeviceDrivers" + GlobalVariable.outputDirPath
					+ GlobalVariable.deviceImplDirPath + "/"
					+ unit.getFileNameToGenerate());
		}

		else if (unit.getFileCategory().equals("AndroidGuiImpl")) {
			new File(GlobalVariable.templatePath + deviceType + "DeviceDrivers"
					+ GlobalVariable.outputDirPath
					+ GlobalVariable.deviceImplDirPath).mkdirs();
			file = new File(GlobalVariable.templatePath + deviceType
					+ "DeviceDrivers" + GlobalVariable.outputDirPath
					+ GlobalVariable.deviceImplDirPath + "/"
					+ unit.getFileNameToGenerate());
		}

		/*
		 * The following if...condition code generates programming framework for
		 * "framework" package Framework files for Sensor, Actuator, Storage. -
		 * Interaction - Data Structure - Interface - Listener
		 */

		else {
			new File(GlobalVariable.templatePath + deviceType + "DeviceDrivers"
					+ GlobalVariable.outputDirPath
					+ GlobalVariable.frameworkDirPath).mkdirs();
			file = new File(GlobalVariable.templatePath + deviceType
					+ "DeviceDrivers" + GlobalVariable.outputDirPath
					+ GlobalVariable.frameworkDirPath + "/"
					+ unit.getFileNameToGenerate());

		}

		if (file != null) {
			try {
				file.createNewFile();
				FileWriter writer = new FileWriter(file);
				writer.write(content);
				writer.flush();
				writer.close();
				System.out.println("Done! --- " + unit.getFileNameToGenerate());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private void generateCodeForArchitectureFrameworkActivity(
			CompilationUnit unit, String deviceType, String str) {

		// return new CompilationUnit(computationalService.getName() + "Factory"
		// + ".java", templateOfComputationalService, "JavaSEFactory" ,
		// "Computational", computationalService);

		// Name of file, templateType, Name , Name based on package Name , ,
		// functionargument)
		// fileNameToGenerate, stringTemplateName , fileCategory, objectName ,
		// objClass

		String content = unit.getStringTemplateName();

		if (unit.getFileCategory().equals("Logic")) {
			new File(GlobalVariable.templatePath + "ApplicationLogic"
					+ GlobalVariable.outputDirPath
					+ GlobalVariable.logicDirPath).mkdirs();
			file = new File(GlobalVariable.templatePath + "ApplicationLogic"
					+ GlobalVariable.outputDirPath
					+ GlobalVariable.logicDirPath + "/"
					+ unit.getFileNameToGenerate());
		}

		else if (unit.getFileCategory().equals("JavaSEFactory")) {
			new File(GlobalVariable.templatePath + "ApplicationLogic"
					+ GlobalVariable.outputDirPath
					+ GlobalVariable.factoryDirPath).mkdirs();
			file = new File(GlobalVariable.templatePath + "ApplicationLogic"
					+ GlobalVariable.outputDirPath
					+ GlobalVariable.factoryDirPath + "/"
					+ unit.getFileNameToGenerate());

			/*
			 * new File(GlobalVariable.templatePath + deviceType +
			 * "DeviceDrivers" + GlobalVariable.outputDirPath +
			 * GlobalVariable.factoryDirPath).mkdirs(); file = new
			 * File(GlobalVariable.templatePath + deviceType + "DeviceDrivers" +
			 * GlobalVariable.outputDirPath + GlobalVariable.factoryDirPath +
			 * "/" + unit.getFileNameToGenerate());
			 */
		}
		
		
		//Generate code in deviceImpl for ApplicationLogic
		else if (unit.getFileCategory().equals("JavaSEImpl")) {

		
			new File(GlobalVariable.templatePath + "ApplicationLogic"
					+ GlobalVariable.outputDirPath
					+ GlobalVariable.deviceImplDirPath).mkdirs();
			file = new File(GlobalVariable.templatePath + "ApplicationLogic"
					+ GlobalVariable.outputDirPath
					+ GlobalVariable.deviceImplDirPath + "/"
					+ unit.getFileNameToGenerate());

			/*
			 * new File(GlobalVariable.templatePath + deviceType +
			 * "DeviceDrivers" + GlobalVariable.outputDirPath +
			 * GlobalVariable.deviceImplDirPath).mkdirs(); file = new
			 * File(GlobalVariable.templatePath + deviceType + "DeviceDrivers" +
			 * GlobalVariable.outputDirPath + GlobalVariable.deviceImplDirPath +
			 * "/" + unit.getFileNameToGenerate());
			 */
		} else {

			// I think this else part generate code into framework repository.
			// So, you do not need to write "else if" for the Interaction.
			new File(GlobalVariable.templatePath + "ApplicationLogic"
					+ GlobalVariable.outputDirPath
					+ GlobalVariable.frameworkDirPath).mkdirs();
			file = new File(GlobalVariable.templatePath + "ApplicationLogic"
					+ GlobalVariable.outputDirPath
					+ GlobalVariable.frameworkDirPath + "/"
					+ unit.getFileNameToGenerate());
		}

		if (file != null) {
			try {
				file.createNewFile();
				FileWriter writer = new FileWriter(file);
				writer.write(content);
				writer.flush();
				writer.close();
				System.out.println("Done! --- " + unit.getFileNameToGenerate());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private void generateCodeForMappingActivitity(CompilationUnit unit,
			String deviceType, String str) {
		String content = unit.getStringTemplateName();

		if ((unit.getFileCategory()).equals("device")) {
			new File(GlobalVariable.templatePath + "/"
					+ GlobalVariable.deploymentFolderPath + "/"
					+ unit.getObjectClass().getType() + unit.getObjectName()
					+ GlobalVariable.outputDirPath
					+ GlobalVariable.deviceDirPath
					+ unit.getObjectClass().getName()).mkdirs();
			String dirName = GlobalVariable.templatePath + "/"
					+ GlobalVariable.deploymentFolderPath + "/"
					+ unit.getObjectClass().getType() + unit.getObjectName()
					+ GlobalVariable.outputDirPath
					+ GlobalVariable.deviceDirPath
					+ unit.getObjectClass().getName();
			File dir = new File(dirName);
			file = new File(dir, unit.getFileNameToGenerate());
		}

		// generate MainActivity.java files for Android devices
		if ((unit.getFileCategory()).equals("AndroidDevice")) {
			new File(GlobalVariable.templatePath + "/"
					+ GlobalVariable.deploymentFolderPath + "/"
					+ unit.getObjectClass().getType() + unit.getObjectName()
					+ GlobalVariable.outputDirPath
					+ GlobalVariable.AndroidDeviceDirPath).mkdirs();
			String dirName = GlobalVariable.templatePath + "/"
					+ GlobalVariable.deploymentFolderPath + "/"
					+ unit.getObjectClass().getType() + unit.getObjectName()
					+ GlobalVariable.outputDirPath
					+ GlobalVariable.AndroidDeviceDirPath;
			File dir = new File(dirName);
			file = new File(dir, unit.getFileNameToGenerate());
		}

		// This is for generating .project file
		if ((unit.getFileCategory()).equals("deviceProject")) {

			file = new File(GlobalVariable.templatePath + "/"
					+ GlobalVariable.deploymentFolderPath + "/"
					+ unit.getObjectClass().getType()
					+ unit.getObjectClass().getName() + "/"
					+ unit.getFileNameToGenerate());

			file = new File(GlobalVariable.templatePath + "/"
					+ GlobalVariable.deploymentFolderPath + "/"
					+ unit.getObjectClass().getType()
					+ unit.getObjectClass().getName() + "/"
					+ unit.getFileNameToGenerate());
		}
		if (file != null) {
			try {
				file.createNewFile();
				FileWriter writer = new FileWriter(file);
				writer.write(content);
				writer.flush();
				writer.close();
				System.out.println("Done! --- " + unit.getFileNameToGenerate());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
