package iotsuite.compiler;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;

import iotsuite.common.GlobalVariable;
import iotsuite.mappingalgo.MappingAlgoCompiler;

public class LinkerCompiler {
	


	public static void linkerAlgo() {

		File folder = new File(GlobalVariable.templatePath + "/"
				+ GlobalVariable.deploymentFolderPath + "/");
		
		File[] listOfFiles = folder.listFiles();

		for (int i = 0; i < listOfFiles.length; i++) {

			if (listOfFiles[i].isDirectory()) { // For JavaSE-enabled devices
				if (listOfFiles[i].getName().startsWith(
						GlobalVariable.JAVASE_ENABLED_DEVICES)) {

		System.out.println("Linked code for " + listOfFiles[i].getName() + " device");						
					
	     Set<String> tempJavaSEStringDeviceLinker 
	         =	 MappingAlgoCompiler.mappingOutputForLinker.get(listOfFiles[i].getName().substring(6));
	     
	     
	     // This is device with NoTNULL abilities specified in the deployment specification
	     if(tempJavaSEStringDeviceLinker.contains("true")) { 
           
	       // For deviceImpI  package
	       copyDeviceDriversGeneratedFromVocabulary(GlobalVariable.JAVASE_ENABLED_DEVICES,listOfFiles[i].getName(), tempJavaSEStringDeviceLinker);
	       
	       //For Factory package
	       copyFactoryGenerateFromVocabulary(GlobalVariable.JAVASE_ENABLED_DEVICES, listOfFiles[i].getName(), tempJavaSEStringDeviceLinker);
		   
	       //For Logic package
	       copyLogicGeneratedFromVocabulary(GlobalVariable.JAVASE_ENABLED_DEVICES, listOfFiles[i].getName(), tempJavaSEStringDeviceLinker);
	     
	      // For Framework package
	       copyFrameworkGeneratedFromVocabularyForInteraction(GlobalVariable.JAVASE_ENABLED_DEVICES,listOfFiles[i].getName(), tempJavaSEStringDeviceLinker);
	     
	      
	       // For Framework-Interface package (e.g., ITemperatureSensor)
	       copyFrameworkGeneratedFromVocabularyForInterface(GlobalVariable.JAVASE_ENABLED_DEVICES,listOfFiles[i].getName(), tempJavaSEStringDeviceLinker);

	      
	       // For Framework-Struct (e.g., TempStruct)
	       copyFrameworkGeneratedFromVocabularyForStruct(GlobalVariable.JAVASE_ENABLED_DEVICES,listOfFiles[i].getName(), "Struct" );

	       
	       // For Framework-Listener (e.g. ListenertempMeasurement)
	   copyFrameworkGeneratedFromVocabularyForListener(GlobalVariable.JAVASE_ENABLED_DEVICES,listOfFiles[i].getName(), "Listener");

	     
	     }else{ // This is device with NULL abilities specified in deployment specification
			    
	    	// For logic package
	    	 copyApplicationLogicArchitectureSpecification(GlobalVariable.JAVASE_ENABLED_DEVICES, listOfFiles[i].getName(), tempJavaSEStringDeviceLinker);
 	 
	    	// TODO: For Framework package 
	    	 copyFrameworkArchitectureSpecification(GlobalVariable.JAVASE_ENABLED_DEVICES, listOfFiles[i].getName()); 
	     }   
			
           
				} else { //TODO: For Android-enabled devices.

/*			System.out.println("Linked code for "
							+ listOfFiles[i].getName() + " device");
					
			Set<String> tempAndroidStringDeviceLinker =	 
				MappingAlgoCompiler.mappingOutputForLinker.get(listOfFiles[i].getName().substring(7));
			
			copyDeviceDriversGeneratedFromVocabulary(GlobalVariable.ANDROID_ENABLED_DEVICES,
							listOfFiles[i].getName(), tempAndroidStringDeviceLinker);
			
			copyFactoryGenerateFromVocabulary(GlobalVariable.ANDROID_ENABLED_DEVICES,
							listOfFiles[i].getName(), tempAndroidStringDeviceLinker);
			
			copyApplicationLogicArchitectureSpecification(
					GlobalVariable.ANDROID_ENABLED_DEVICES,
					listOfFiles[i].getName(), tempAndroidStringDeviceLinker);
					
			copyLogicGeneratedFromVocabulary(GlobalVariable.ANDROID_ENABLED_DEVICES, 
					listOfFiles[i].getName(), tempAndroidStringDeviceLinker);
			
					copyFrameworkGeneratedFromVocabulary(
							GlobalVariable.ANDROID_ENABLED_DEVICES,
							listOfFiles[i].getName());
					
					
					copyFrameworkArchitectureSpecification(
							GlobalVariable.ANDROID_ENABLED_DEVICES,
							listOfFiles[i].getName());
*/
				}
			}
		}
	}

	public static void copyDeviceDriversGeneratedFromVocabulary(String type, String name, Set<String> softwareComponmentNameToPick) {

	
		if(softwareComponmentNameToPick.iterator().next().equals("true")) {
		   // Do nothing...
		}		
		else{
			String tempVariableForSoftwareComponent = softwareComponmentNameToPick.iterator().next();
			File srcFile = new File(GlobalVariable.templatePath + "/" + type
				+ "DeviceDrivers" + "/src/deviceImpl/" + type + tempVariableForSoftwareComponent + ".java");
			
			File destFolder = new File(GlobalVariable.templatePath + "/" + GlobalVariable.deploymentFolderPath + "/" + name
					+ "/src/deviceImpl");			
			try {
				FileUtils.copyFileToDirectory(srcFile, destFolder);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		//copyFiles(srcFolder, destFolder);

		/*
		File srcFolder1 = new File(GlobalVariable.templatePath + "/"
				+ "ApplicationLogic/src/deviceImpl");

		
		File destFolder1 = new File(GlobalVariable.templatePath + "/"
				+ GlobalVariable.deploymentFolderPath + "/" + name + "/src/"
				+ "deviceImpl");

		copyFiles(srcFolder1, destFolder1);
		*/
	}

	public static void copyFactoryGenerateFromVocabulary(String type, String name, Set<String> softwareComponmentNameToPick) {
	
		if(softwareComponmentNameToPick.iterator().next().equals("true")) {
			   // Do nothing...
			}		
			else{
				
				
		List<String> tempVariableForSoftwareComponent = convertListFromSet(softwareComponmentNameToPick);	  

		File srcFile = new File(GlobalVariable.templatePath + "/" + type
				+ "DeviceDrivers" + "/src/factory/" +  tempVariableForSoftwareComponent.get(0) + "Factory"  + ".java");

		
		File destFolder = new File(GlobalVariable.templatePath + "/"
				+ GlobalVariable.deploymentFolderPath + "/" + name + "/src/"
				+ "factory");
		
		try {
			FileUtils.copyFileToDirectory(srcFile, destFolder);
		} catch (IOException e) {
			e.printStackTrace();
		}

			}
		
		
		
		
		//copyFiles(srcFolder, destFolder);

	
		
		/*File srcFolder1 = new File(GlobalVariable.templatePath + "/"
				+ "ApplicationLogic/src/factory");
		File destFolder1 = new File(GlobalVariable.templatePath + "/"
				+ GlobalVariable.deploymentFolderPath + "/" + name + "/src/"
				+ "factory");
		copyFiles(srcFolder1, destFolder1);
*/
	}

	public static void copyFrameworkGeneratedFromVocabularyForInteraction(String type,
			String name, Set<String> softwareComponmentNameToPick) {
		
		if(softwareComponmentNameToPick.iterator().next().equals("true")) {
			   // Do nothing...
			}		
			else{			
				
		List<String> tempVariableForSoftwareComponent = convertListFromSet(softwareComponmentNameToPick);	
    	File srcFile = new File(GlobalVariable.templatePath + "/" + type 	+ "DeviceDrivers" + "/src/framework/" +  tempVariableForSoftwareComponent.get(0) + ".java");
		File destFolder = new File(GlobalVariable.templatePath + "/" + GlobalVariable.deploymentFolderPath + "/" + name + "/src/"
				+ "framework");
		try {
			FileUtils.copyFileToDirectory(srcFile, destFolder);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
		
		
		
		//copyFiles(srcFolder, destFolder);

	}
	
	public static void copyFrameworkGeneratedFromVocabularyForInterface(String type,String name, Set<String> softwareComponmentNameToPick) {
		
		if(softwareComponmentNameToPick.iterator().next().equals("true")) {
			   // Do nothing...
			}		
			else{			
				
		List<String> tempVariableForSoftwareComponent = convertListFromSet(softwareComponmentNameToPick);	
		
		
		File srcFile = new File(GlobalVariable.templatePath + "/" + type 	+ "DeviceDrivers" + "/src/framework/" + "I" + tempVariableForSoftwareComponent.get(0) + ".java" );
		File destFolder = new File(GlobalVariable.templatePath + "/" + GlobalVariable.deploymentFolderPath + "/" + name + "/src/"
				+ "framework");
		try {
			FileUtils.copyFileToDirectory(srcFile, destFolder);
		} catch (IOException e) {
			e.printStackTrace();
		}		
		
		}
		
		//copyFiles(srcFolder, destFolder);

	}
	
	
	public static void copyFrameworkGeneratedFromVocabularyForStruct(
			String type, String name, String stringForRegEx) {

		File srcFolder = new File(GlobalVariable.templatePath + "/" + type
				+ "DeviceDrivers" + "/src/framework/");
			
		File[] listOfFiles = srcFolder.listFiles();

		for (int i = 0; i < listOfFiles.length; i++) {

			if (listOfFiles[i].getName().contains(stringForRegEx)) {

				String tempValriableForStructFiles = listOfFiles[i].getName();

				File srcFile = new File(GlobalVariable.templatePath + "/"
						+ type + "DeviceDrivers" + "/src/framework/"
						+ tempValriableForStructFiles );
				
				File destFolder = new File(GlobalVariable.templatePath + "/"
						+ GlobalVariable.deploymentFolderPath + "/" + name
						+ "/src/" + "framework");

				try {
					FileUtils.copyFileToDirectory(srcFile, destFolder);
				} catch (IOException e) {
					e.printStackTrace();
				}

			}

		}
		
		
		
		//copyFiles(srcFolder, destFolder);

	}
	
	public static void copyFrameworkGeneratedFromVocabularyForListener(String type, String name, String stringForRegEx) {

		File srcFolder = new File(GlobalVariable.templatePath + "/" + type
				+ "DeviceDrivers" + "/src/framework/");
		File[] listOfFiles = srcFolder.listFiles();

		for (int i = 0; i < listOfFiles.length; i++) {

			if (listOfFiles[i].getName().contains(stringForRegEx)) {
				String tempValriableForInterfaceFiles = listOfFiles[i].getName();
				File srcFile = new File(GlobalVariable.templatePath + "/" + type + "DeviceDrivers" + "/src/framework/" + tempValriableForInterfaceFiles );
		
		File destFolder = new File(GlobalVariable.templatePath + "/" + GlobalVariable.deploymentFolderPath + "/" + name + "/src/"
				+ "framework");
		
		try {
			FileUtils.copyFileToDirectory(srcFile, destFolder);
		} catch (IOException e) {
			e.printStackTrace();
		}
			}
		}
		
		
		
		//copyFiles(srcFolder, destFolder);

	}
	
	
	
	

	public static void copyLogicGeneratedFromVocabulary(String type, String name,  Set<String> softwareComponmentNameToPick) {

		if(softwareComponmentNameToPick.iterator().next().equals("true")) {
			   // Do nothing...
			}		
			else{
				
	    String tempVariableForSoftwareComponent = softwareComponmentNameToPick.iterator().next();
		
	    
		File srcFile = new File(GlobalVariable.templatePath + "/" + type
				+ "DeviceDrivers" + "/src/logic/" +  "Logic" + tempVariableForSoftwareComponent + ".java" );		

		File destFolder = new File(GlobalVariable.templatePath + "/"
				+ GlobalVariable.deploymentFolderPath + "/" + name + "/src/"
				+ "logic");
		
		try {
			FileUtils.copyFileToDirectory(srcFile, destFolder);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		}
		
		//copyFiles(srcFolder, destFolder);

	}

	/*
	 * The following function will copy the written application logic by
	 * application developer.
	 */

	public static void copyApplicationLogicArchitectureSpecification(String type, String name, Set<String> softwareComponmentNameToPick) {
		
		if(softwareComponmentNameToPick.iterator().next().equals("true")) {
			   // Do nothing...
			}		
			else{				
	    List<String> tempVariableForSoftwareComponent = convertListFromSet(softwareComponmentNameToPick);	
		File srcFile = new File(GlobalVariable.templatePath + "/"
				+ "ApplicationLogic/src/logic/" + "Logic" + tempVariableForSoftwareComponent.get(0) + ".java" );

		
		File destFolder = new File(GlobalVariable.templatePath + "/"
				+ GlobalVariable.deploymentFolderPath + "/" + name + "/src/"
				+ "logic");
		
		try {
			FileUtils.copyFileToDirectory(srcFile, destFolder);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
		//copyFiles(srcFolder, destFolder);

	}

	public static void copyFrameworkArchitectureSpecification(String type,
			String name) {
		File srcFolder = new File(GlobalVariable.templatePath + "/"
				+ "ApplicationLogic/src/framework");
		File destFolder = new File(GlobalVariable.templatePath + "/"
				+ GlobalVariable.deploymentFolderPath + "/" + name + "/src/"
				+ "framework");

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
	
	public static List<String> convertListFromSet(Set<String> listVariable){
		ArrayList<String> L1= new ArrayList<String>();
		List<String> result = new ArrayList<String>();
		L1.addAll(listVariable);
        for(String x : L1){
        	if(x.equals("true") || x.equals("false")) {
        		//Do nothing ...
        	}else{
        		result.add(x);
        	}
        	
          }
        return result;		
	}

}
