package iotsuite.compiler;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import iotsuite.common.GlobalVariable;

public class LinkerCompiler {

	public static void linkerAlgo() {
		
		
		//File folder = new File(GlobalVariable.frameworkRootDir + GlobalVariable.deploymentFolderPath);
		File folder = new File(GlobalVariable.templatePath + "/" +  GlobalVariable.deploymentFolderPath + "/");
		File[] listOfFiles = folder.listFiles();
		

		for (int i = 0; i < listOfFiles.length; i++) {

			if (listOfFiles[i].isDirectory()) { // For JavaSE-enabled devices
				if (listOfFiles[i].getName().startsWith(GlobalVariable.JAVASE_ENABLED_DEVICES)) {
					
					System.out.println( "Linked code for " + listOfFiles[i].getName() + " device");

					copyDeviceDrivers(GlobalVariable.JAVASE_ENABLED_DEVICES, listOfFiles[i].getName());
					copyFactory(GlobalVariable.JAVASE_ENABLED_DEVICES, listOfFiles[i].getName());
					copyFrameworkGeneratedFromVocabulary(GlobalVariable.JAVASE_ENABLED_DEVICES, listOfFiles[i].getName());
					copyLogicGeneratedFromVocabulary(GlobalVariable.JAVASE_ENABLED_DEVICES, listOfFiles[i].getName());
					copyApplicationLogicArchitectureSpecification(GlobalVariable.JAVASE_ENABLED_DEVICES, listOfFiles[i].getName());
					copyFrameworkArchitectureSpecification(GlobalVariable.JAVASE_ENABLED_DEVICES, listOfFiles[i].getName());

				} else {  // For Android-enabled devices.

					System.out.println(GlobalVariable.ANDROID_ENABLED_DEVICES);
					copyDeviceDrivers(GlobalVariable.ANDROID_ENABLED_DEVICES, listOfFiles[i].getName());
					copyFactory(GlobalVariable.ANDROID_ENABLED_DEVICES, listOfFiles[i].getName());
					copyFrameworkGeneratedFromVocabulary(GlobalVariable.ANDROID_ENABLED_DEVICES, listOfFiles[i].getName());
					copyLogicGeneratedFromVocabulary(GlobalVariable.ANDROID_ENABLED_DEVICES, listOfFiles[i].getName());
					copyApplicationLogicArchitectureSpecification(GlobalVariable.ANDROID_ENABLED_DEVICES, listOfFiles[i].getName());
					copyFrameworkArchitectureSpecification(GlobalVariable.ANDROID_ENABLED_DEVICES, listOfFiles[i].getName());

				}
			}
		}
	}

	public static void copyDeviceDrivers(String type, String name) {
		
		//File srcFolder = new File(GlobalVariable.frameworkRootDir + "/" + "DeviceDrivers" + "/" + type + "/src/deviceImpl/");
		File srcFolder = new File(GlobalVariable.templatePath + "/" + type + "DeviceDrivers" + "/src/deviceImpl/" );
		
		
		
		//File destFolder = new File(GlobalVariable.frameworkRootDir + "/" + GlobalVariable.deploymentFolderPath + "/" + name + "/src/");
		File destFolder = new File(GlobalVariable.templatePath + "/" + GlobalVariable.deploymentFolderPath + "/" + name + "/src/deviceImpl");
		
		
		copyFiles(srcFolder, destFolder);

	}

	public static void copyFactory(String type, String name) {
		
		
		//File srcFolder = new File(GlobalVariable.frameworkRootDir + "/" + "DeviceDrivers" + "/" + type + "/src/factory");
		File srcFolder = new File(GlobalVariable.templatePath + "/" + type + "DeviceDrivers" + "/src/factory/");
		
		
		//File destFolder = new File(GlobalVariable.frameworkRootDir + "/" + GlobalVariable.deploymentFolderPath + "/" + name + "/src/" + "factory");
		File destFolder = new File(GlobalVariable.templatePath + "/" + GlobalVariable.deploymentFolderPath + "/" + name + "/src/" + "factory");
		
		copyFiles(srcFolder, destFolder);

	}

	public static void copyFrameworkGeneratedFromVocabulary(String type, String name) {
		
		
		//File srcFolder = new File(GlobalVariable.frameworkRootDir + "/" + "ApplicationLogic/src/framework");
		//File srcFolder = new File(GlobalVariable.activityGenPath + "/ApplicationLogic/src/framework");
		File srcFolder = new File(GlobalVariable.templatePath + "/" + type + "DeviceDrivers" + "/src/framework/");
		//File srcFolder = new File(GlobalVariable.activityGenPath + "/" + "ApplicationLogic/src/framework");
		
		//File destFolder = new File(GlobalVariable.frameworkRootDir + "/" + GlobalVariable.deploymentFolderPath + "/" + name + "/src/" + "framework");
		
		File destFolder = new File(GlobalVariable.templatePath + "/" + GlobalVariable.deploymentFolderPath + "/" + name + "/src/" + "framework");
		copyFiles(srcFolder, destFolder);

	}

	public static void copyLogicGeneratedFromVocabulary(String type, String name) {

		//File srcFolder = new File(GlobalVariable.frameworkRootDir + "/" + "DeviceDrivers" + "/" + type + "/src/logic");
		File srcFolder = new File(GlobalVariable.templatePath + "/" + type + "DeviceDrivers" + "/src/logic/");
		
		//File destFolder = new File(GlobalVariable.frameworkRootDir + "/" + GlobalVariable.deploymentFolderPath + "/" + name + "/src/" + "logic");
		
		File destFolder = new File(GlobalVariable.templatePath + "/" + GlobalVariable.deploymentFolderPath + "/" + name + "/src/" + "logic");
		copyFiles(srcFolder, destFolder);

	}
	
	/*
	 * The following function will copy the written application 
	 * logic by application developer. 
	 */

	public static void copyApplicationLogicArchitectureSpecification(String type, String name) {

		//File srcFolder = new File(GlobalVariable.frameworkRootDir + "/" + "ApplicationLogic/src/logic");
		File srcFolder = new File(GlobalVariable.templatePath + "/" + "ApplicationLogic/src/logic");
		
		//File destFolder = new File(GlobalVariable.frameworkRootDir + "/" + GlobalVariable.deploymentFolderPath + "/" + name + "/src/" + "logic");
		File destFolder = new File(GlobalVariable.templatePath + "/" + GlobalVariable.deploymentFolderPath + "/" + name + "/src/" + "logic");
		
		copyFiles(srcFolder, destFolder);

	}
	
	public static void copyFrameworkArchitectureSpecification(String type, String name){
		File srcFolder = new File(GlobalVariable.templatePath + "/" + "ApplicationLogic/src/framework");
		File destFolder = new File(GlobalVariable.templatePath + "/" + GlobalVariable.deploymentFolderPath + "/" +  name + "/src/" + "framework");
		
		copyFiles(srcFolder, destFolder);
	}

	public static void copyFiles(File srcFolder, File destFolder) {
		// make sure source exists
		if (!srcFolder.exists()) {

			System.out.println("Directory does not exist.");
			// just exit
	 	System.exit(0);

		} else {

			try {
				copyFolder(srcFolder, destFolder);
			} catch (IOException e) {
				e.printStackTrace();
				// error, just exit
				System.exit(0);
			}
		}

		// System.out.println("Done");

	}

	public static void copyFolder(File src, File dest) throws IOException {

		if (src.isDirectory()) {

			// if directory not exists, create it
			if (!dest.exists()) {
				dest.mkdir();
				// System.out.println("Directory copied from "
				// + src + "  to " + dest);
			}

			// list all the directory contents
			String files[] = src.list();

			for (String file : files) {
				// construct the src and dest file structure
				File srcFile = new File(src, file);
				File destFile = new File(dest, file);
				// recursive copy
				copyFolder(srcFile, destFile);
			}

		} else {
			// if file, then copy it
			// Use bytes stream to support all file types
			InputStream in = new FileInputStream(src);
			OutputStream out = new FileOutputStream(dest);

			byte[] buffer = new byte[1024];

			int length;
			// copy the file content in bytes
			while ((length = in.read(buffer)) > 0) {
				out.write(buffer, 0, length);
			}

			in.close();
			out.close();
			// System.out.println("File copied from " + src + " to " + dest);
		}
	}

}
