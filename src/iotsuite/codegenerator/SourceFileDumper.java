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

		if (GlobalVariable.activity
				.equals(GlobalVariable.ACTIVITY_GENERATE_DEVICEDRIVER)) {

			if (GlobalVariable.ENABLE_JAVASE_CODE_GENERATATION) {
				generateCodeForJavaSEDeviceDriverActivity(template,
						GlobalVariable.deviceJAVASEType, null);
			}

			if (GlobalVariable.ENABLE_ANDROID_CODE_GENERATION) {
				generateCodeForAndroidDeviceDriverActivity(template,
						GlobalVariable.deviceAndroidType, null);
			}
		}

		if (GlobalVariable.activity
				.equals(GlobalVariable.ACTIVITY_GENERATE_USERINTERACTION)) {

			if (GlobalVariable.ENABLE_JAVASE_CODE_GENERATATION) {
				generateCodeForJavaSEDeviceDriverActivity(template,
						GlobalVariable.deviceJAVASEType, null);
			}

			if (GlobalVariable.ENABLE_ANDROID_CODE_GENERATION) {
				generateCodeForAndroidDeviceDriverActivity(template,
						GlobalVariable.deviceAndroidType, null);
			}
		}

		if (GlobalVariable.activity
				.equals(GlobalVariable.ACTIVITY_GENERATE_ARCHITECTUREFRAMEWORK)) {
<<<<<<< HEAD
=======
			
>>>>>>> f18db808215aa7c0212c33614ab0a8c9dea732b4

			generateCodeForArchitectureFrameworkActivity(template,
					"ApplicationLogic", null);
		}

		if (GlobalVariable.activity
				.equals(GlobalVariable.ACTIVITY_GENERATE_MAPPING)) {

			if (GlobalVariable.ENABLE_ANDROID_CODE_GENERATION) {
				generateCodeForMappingActivitity(template, "deviceMapping",
						"Android");
			}

<<<<<<< HEAD
=======
			
>>>>>>> f18db808215aa7c0212c33614ab0a8c9dea732b4
			if (GlobalVariable.ENABLE_JAVASE_CODE_GENERATATION) {
				generateCodeForMappingActivitity(template,
						GlobalVariable.deviceJAVASEType,
						GlobalVariable.templatePath);
			}
		}
	}

	private void generateCodeForJavaSEDeviceDriverActivity(
			CompilationUnit unit, String deviceType, String str) {

		String content = unit.getStringTemplateName();

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
<<<<<<< HEAD
			
=======
>>>>>>> f18db808215aa7c0212c33614ab0a8c9dea732b4
		} else if (unit.getFileCategory().equals("JavaSEGuiImpl")) {
			new File(GlobalVariable.templatePath + deviceType + "DeviceDrivers"
					+ GlobalVariable.outputDirPath
					+ GlobalVariable.deviceImplDirPath).mkdirs();
			file = new File(GlobalVariable.templatePath + deviceType
					+ "DeviceDrivers" + GlobalVariable.outputDirPath
					+ GlobalVariable.deviceImplDirPath + "/"
					+ unit.getFileNameToGenerate());
<<<<<<< HEAD
			
=======
>>>>>>> f18db808215aa7c0212c33614ab0a8c9dea732b4
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

<<<<<<< HEAD
		// Node.js code generation
		else if (unit.getFileCategory().equals("nodejs")) {
			new File(GlobalVariable.templatePath + deviceType + "DeviceDrivers"
					+ GlobalVariable.outputDirPath
					+ GlobalVariable.deviceImplDirPath).mkdirs();
			file = new File(GlobalVariable.templatePath + deviceType
					+ "DeviceDrivers" + GlobalVariable.outputDirPath
					+ GlobalVariable.deviceImplDirPath + "/"
					+ unit.getFileNameToGenerate());
		}
		
		// Client code generation			
		else if (unit.getFileCategory().equals("client")) {
			new File(GlobalVariable.templatePath + deviceType + "DeviceDrivers"
					+ GlobalVariable.outputDirPath
					+ GlobalVariable.deviceImplDirPath).mkdirs();
			file = new File(GlobalVariable.templatePath + deviceType
					+ "DeviceDrivers" + GlobalVariable.outputDirPath
					+ GlobalVariable.deviceImplDirPath + "/"
					+ unit.getFileNameToGenerate());
		}
		
=======
>>>>>>> f18db808215aa7c0212c33614ab0a8c9dea732b4
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
		}

		else if (unit.getFileCategory().equals("AndroidMainActivity")) {

		}

		else if (unit.getFileCategory().equals("JavaSEFactory")
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

	private void generateCodeForArchitectureFrameworkActivity(
			CompilationUnit unit, String deviceType, String str) {

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

		}

		// Generate code in deviceImpl for ApplicationLogic
		else if (unit.getFileCategory().equals("JavaSEImpl")) {

			new File(GlobalVariable.templatePath + "ApplicationLogic"
					+ GlobalVariable.outputDirPath
					+ GlobalVariable.deviceImplDirPath).mkdirs();
			file = new File(GlobalVariable.templatePath + "ApplicationLogic"
					+ GlobalVariable.outputDirPath
					+ GlobalVariable.deviceImplDirPath + "/"
					+ unit.getFileNameToGenerate());

		} else {

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
