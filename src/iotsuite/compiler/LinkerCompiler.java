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

					System.out.println("Linked code for "
							+ listOfFiles[i].getName() + " device");

					Set<String> tempJavaSEStringDeviceLinker = MappingAlgoCompiler.mappingOutputForLinker
							.get(listOfFiles[i].getName().substring(6));

					// This is device with NoTNULL abilities specified in the
					// deployment specification
					if (tempJavaSEStringDeviceLinker.contains("true")) {

						List<String> convertedTempJavaSEStringDeviceLinker = convertListFromSet(tempJavaSEStringDeviceLinker);

						// For deviceImpI package
						copyDeviceDriversGeneratedFromVocabulary(
								GlobalVariable.JAVASE_ENABLED_DEVICES,
								listOfFiles[i].getName(),
								convertedTempJavaSEStringDeviceLinker);

						// For Factory package
						copyFactoryGenerateFromVocabulary(
								GlobalVariable.JAVASE_ENABLED_DEVICES,
								listOfFiles[i].getName(),
								convertedTempJavaSEStringDeviceLinker);

						// For Logic package
						copyLogicGeneratedFromVocabulary(
								GlobalVariable.JAVASE_ENABLED_DEVICES,
								listOfFiles[i].getName(),
								convertedTempJavaSEStringDeviceLinker);

						// For Framework package
						copyFrameworkGeneratedFromVocabularyForInteraction(
								GlobalVariable.JAVASE_ENABLED_DEVICES,
								listOfFiles[i].getName(),
								convertedTempJavaSEStringDeviceLinker);

						// For Framework-Interface package (e.g.,
						// ITemperatureSensor)
						copyFrameworkGeneratedFromVocabularyForInterface(
								GlobalVariable.JAVASE_ENABLED_DEVICES,
								listOfFiles[i].getName(),
								convertedTempJavaSEStringDeviceLinker);

						// For Framework-Listener (e.g. ListenertempMeasurement)
						copyFrameworkGeneratedFromVocabularyForListener(
								GlobalVariable.JAVASE_ENABLED_DEVICES,
								listOfFiles[i].getName(), "Listener");

						// For Framework-Struct (e.g., TempStruct)
						copyFrameworkGeneratedFromVocabularyForStruct(
								GlobalVariable.JAVASE_ENABLED_DEVICES,
								listOfFiles[i].getName(), "Struct");

					} else { // This is device with NULL abilities specified in
								// deployment specification

						List<String> convertedTempJavaSEStringDeviceLinker = convertListFromSet(tempJavaSEStringDeviceLinker);

						for (int j = 0; j < convertedTempJavaSEStringDeviceLinker
								.size(); j++) {
							// For logic package
							/*
							 * copyApplicationLogicArchitectureSpecification(
							 * GlobalVariable.JAVASE_ENABLED_DEVICES,
							 * listOfFiles[i].getName(),
							 * convertedTempJavaSEStringDeviceLinker);
							 */

							copyApplicationLogicArchitectureSpecification(
									GlobalVariable.JAVASE_ENABLED_DEVICES,
									listOfFiles[i].getName(),
									convertedTempJavaSEStringDeviceLinker
											.get(j));

							// For Framework package
							/*
							 * copyFrameworkArchitectureSpecification(
							 * GlobalVariable.JAVASE_ENABLED_DEVICES,
							 * listOfFiles[i].getName(),
							 * convertedTempJavaSEStringDeviceLinker);
							 */

							copyFrameworkArchitectureSpecification(
									GlobalVariable.JAVASE_ENABLED_DEVICES,
									listOfFiles[i].getName(),
									convertedTempJavaSEStringDeviceLinker
											.get(j));

							// For Framework - Struct component
							copyFrameworkGeneratedFromVocabularyForStruct(
									GlobalVariable.JAVASE_ENABLED_DEVICES,
									listOfFiles[i].getName(), "Struct");
						}

						Set<String> noAbilitiesJavaSEDevicesForLinker = MappingAlgoCompiler.mappingOutputForLinker
								.get(listOfFiles[i].getName().substring(6));

						if (noAbilitiesJavaSEDevicesForLinker
								.contains("inbuilt")) {

							List<String> tempString = convertListFromSet(tempJavaSEStringDeviceLinker);

							// For deviceImpI package
							copydeviceImplGeneratedFromArchitecture(
									GlobalVariable.JAVASE_ENABLED_DEVICES,
									listOfFiles[i].getName(), tempString);

							// For Factory package
							copyFactoryGenerateFromArchitecture(
									GlobalVariable.JAVASE_ENABLED_DEVICES,
									listOfFiles[i].getName(), tempString);

							// For Framework-Interface package (e.g.,
							// ITemperatureSensor)
							copyFrameworkGeneratedFromArchitectureForInterface(
									GlobalVariable.JAVASE_ENABLED_DEVICES,
									listOfFiles[i].getName(), tempString);

							// For Framework-Listener (e.g.
							// ListenertempMeasurement)
							copyFrameworkGeneratedFromAchitectureForListener(
									GlobalVariable.JAVASE_ENABLED_DEVICES,
									listOfFiles[i].getName(), "Listener");

						}

					}

				}
				if (listOfFiles[i].getName().startsWith(
						GlobalVariable.NODEJS_ENABLED_DEVICES)) {

					System.out.println("Linked code for "
							+ listOfFiles[i].getName() + " device");

					Set<String> tempNodeJSStringDeviceLinker = MappingAlgoCompiler.mappingOutputForLinker
							.get(listOfFiles[i].getName().substring(6));

					List<String> convertedTempNodeJSStringDeviceLinker = convertListFromSet(tempNodeJSStringDeviceLinker);

					for (int j = 0; j < convertedTempNodeJSStringDeviceLinker
							.size(); j++) {

						if ((convertedTempNodeJSStringDeviceLinker.get(j))
								.contains(GlobalVariable.USER_INTERACTION_DASHBOARD)) {

							// For deviceImpI package (client.html and
							// server.js)
							copyNodeJSServerGeneratedFromVocabulary(
									GlobalVariable.NODEJS_ENABLED_DEVICES,
									listOfFiles[i].getName(),
									convertedTempNodeJSStringDeviceLinker);
							copyNodeJSClientGeneratedFromVocabulary(
									GlobalVariable.NODEJS_ENABLED_DEVICES,
									listOfFiles[i].getName(),
									convertedTempNodeJSStringDeviceLinker);
						} else {
							// NodeJS Sensor and actuator

							copyNodeJSSensorGeneratedFromVocabulary(
									GlobalVariable.NODEJS_ENABLED_DEVICES,
									listOfFiles[i].getName(),
									convertedTempNodeJSStringDeviceLinker
											.get(j));

						}

					}

				}

				// For Android-enabled devices.
				if (listOfFiles[i].getName().startsWith(
						GlobalVariable.ANDROID_ENABLED_DEVICES)) {

					System.out.println("Linked code for "
							+ listOfFiles[i].getName() + " device");

					Set<String> tempAndroidStringDeviceLinker = MappingAlgoCompiler.mappingOutputForLinker
							.get(listOfFiles[i].getName().substring(7));

					List<String> convertedTempJavaSEStringDeviceLinker = convertListFromSet(tempAndroidStringDeviceLinker);

					for (int j = 0; j < convertedTempJavaSEStringDeviceLinker
							.size(); j++) {
						if ((convertedTempJavaSEStringDeviceLinker.get(j))
								.contains(GlobalVariable.USER_INTERACTION_ENDUSERAPP)) {

							copyGuiDeviceDriversGeneratedFromVocabulary(
									GlobalVariable.ANDROID_ENABLED_DEVICES,
									listOfFiles[i].getName(),
									convertedTempJavaSEStringDeviceLinker);

							// For Factory package
							copyGuiFactoryGenerateFromVocabulary(
									GlobalVariable.ANDROID_ENABLED_DEVICES,
									listOfFiles[i].getName(),
									convertedTempJavaSEStringDeviceLinker);
							// For Logic package
							copyGuiLogicGeneratedFromVocabulary(
									GlobalVariable.ANDROID_ENABLED_DEVICES,
									listOfFiles[i].getName(),
									convertedTempJavaSEStringDeviceLinker);

							// For Framework package
							copyGuiFrameworkGeneratedFromVocabularyForInteraction(
									GlobalVariable.ANDROID_ENABLED_DEVICES,
									listOfFiles[i].getName(),
									convertedTempJavaSEStringDeviceLinker);

							// For Framework-Interface package (e.g.,
							// ITemperatureSensor)
							copyGuiFrameworkGeneratedFromVocabularyForInterface(
									GlobalVariable.ANDROID_ENABLED_DEVICES,
									listOfFiles[i].getName(),
									convertedTempJavaSEStringDeviceLinker);

							// For Framework-Listener (e.g.
							// ListenertempMeasurement)
							copyGuiFrameworkGeneratedFromVocabularyForListener(
									GlobalVariable.ANDROID_ENABLED_DEVICES,
									listOfFiles[i].getName(),
									convertedTempJavaSEStringDeviceLinker);

							// For Framework-Struct (e.g., TempStruct)
							copyGuiFrameworkGeneratedFromVocabularyForStruct(
									GlobalVariable.ANDROID_ENABLED_DEVICES,
									listOfFiles[i].getName(), "Struct");

						} else {

							// For deviceImpI package
							copyDeviceDriversGeneratedFromVocabulary(
									GlobalVariable.ANDROID_ENABLED_DEVICES,
									listOfFiles[i].getName(),
									convertedTempJavaSEStringDeviceLinker);

							// For Factory package
							copyFactoryGenerateFromVocabulary(
									GlobalVariable.ANDROID_ENABLED_DEVICES,
									listOfFiles[i].getName(),
									convertedTempJavaSEStringDeviceLinker);

							// For Logic package
							copyLogicGeneratedFromVocabulary(
									GlobalVariable.ANDROID_ENABLED_DEVICES,
									listOfFiles[i].getName(),
									convertedTempJavaSEStringDeviceLinker);

							// For Framework package
							copyFrameworkGeneratedFromVocabularyForInteraction(
									GlobalVariable.ANDROID_ENABLED_DEVICES,
									listOfFiles[i].getName(),
									convertedTempJavaSEStringDeviceLinker);

							// For Framework-Interface package (e.g.,
							// ITemperatureSensor)
							copyFrameworkGeneratedFromVocabularyForInterface(
									GlobalVariable.ANDROID_ENABLED_DEVICES,
									listOfFiles[i].getName(),
									convertedTempJavaSEStringDeviceLinker);

							// For Framework-Listener (e.g.
							// ListenertempMeasurement)
							copyFrameworkGeneratedFromVocabularyForListener(
									GlobalVariable.ANDROID_ENABLED_DEVICES,
									listOfFiles[i].getName(), "Listener");

							// For Framework-Struct (e.g., TempStruct)
							copyFrameworkGeneratedFromVocabularyForStruct(
									GlobalVariable.ANDROID_ENABLED_DEVICES,
									listOfFiles[i].getName(), "Struct");
						}

					}

					/*
					 * // For deviceImpI package
					 * copyDeviceDriversGeneratedFromVocabulary(
					 * GlobalVariable.ANDROID_ENABLED_DEVICES,
					 * listOfFiles[i].getName(),
					 * convertedTempJavaSEStringDeviceLinker);
					 * 
					 * // For Factory package copyFactoryGenerateFromVocabulary(
					 * GlobalVariable.ANDROID_ENABLED_DEVICES,
					 * listOfFiles[i].getName(),
					 * convertedTempJavaSEStringDeviceLinker);
					 * 
					 * // For Logic package copyLogicGeneratedFromVocabulary(
					 * GlobalVariable.ANDROID_ENABLED_DEVICES,
					 * listOfFiles[i].getName(),
					 * convertedTempJavaSEStringDeviceLinker);
					 * 
					 * // For Framework package
					 * copyFrameworkGeneratedFromVocabularyForInteraction(
					 * GlobalVariable.ANDROID_ENABLED_DEVICES,
					 * listOfFiles[i].getName(),
					 * convertedTempJavaSEStringDeviceLinker);
					 * 
					 * // For Framework-Interface package (e.g., //
					 * ITemperatureSensor)
					 * copyFrameworkGeneratedFromVocabularyForInterface(
					 * GlobalVariable.ANDROID_ENABLED_DEVICES,
					 * listOfFiles[i].getName(),
					 * convertedTempJavaSEStringDeviceLinker);
					 * 
					 * // For Framework-Listener (e.g. ListenertempMeasurement)
					 * copyFrameworkGeneratedFromVocabularyForListener(
					 * GlobalVariable.ANDROID_ENABLED_DEVICES,
					 * listOfFiles[i].getName(), "Listener");
					 * 
					 * // For Framework-Struct (e.g., TempStruct)
					 * copyFrameworkGeneratedFromVocabularyForStruct(
					 * GlobalVariable.ANDROID_ENABLED_DEVICES,
					 * listOfFiles[i].getName(), "Struct");
					 */

					/*
					 * Set<String> tempAndroidStringDeviceLinker =
					 * MappingAlgoCompiler
					 * .mappingOutputForLinker.get(listOfFiles
					 * [i].getName().substring(7));
					 * 
					 * copyAndroidDeviceDriversGeneratedFromVocabulary(
					 * GlobalVariable.ANDROID_ENABLED_DEVICES,
					 * listOfFiles[i].getName(), tempAndroidStringDeviceLinker);
					 * 
					 * copyAndroidFactoryGenerateFromVocabulary(GlobalVariable.
					 * ANDROID_ENABLED_DEVICES, listOfFiles[i].getName(),
					 * tempAndroidStringDeviceLinker);
					 * 
					 * copyAndroidApplicationLogicArchitectureSpecification(
					 * GlobalVariable.ANDROID_ENABLED_DEVICES,
					 * listOfFiles[i].getName(), tempAndroidStringDeviceLinker);
					 * 
					 * copyAndroidLogicGeneratedFromVocabulary(GlobalVariable.
					 * ANDROID_ENABLED_DEVICES, listOfFiles[i].getName(),
					 * tempAndroidStringDeviceLinker);
					 * 
					 * copyFrameworkGeneratedFromVocabulary(
					 * GlobalVariable.ANDROID_ENABLED_DEVICES,
					 * listOfFiles[i].getName());
					 * 
					 * 
					 * copyFrameworkArchitectureSpecification(
					 * GlobalVariable.ANDROID_ENABLED_DEVICES,
					 * listOfFiles[i].getName());
					 */

				}
			}
		}
	}

	public static void copyDeviceDriversGeneratedFromVocabulary(String type,
			String name, List<String> softwareComponmentNameToPick) {

		String tempVariableForSoftwareComponent = softwareComponmentNameToPick
				.iterator().next();
		File srcFile = new File(GlobalVariable.templatePath + "/" + type
				+ "DeviceDrivers" + "/src/deviceImpl/" + type
				+ tempVariableForSoftwareComponent + ".java");

		File destFolder = new File(GlobalVariable.templatePath + "/"
				+ GlobalVariable.deploymentFolderPath + "/" + name
				+ "/src/deviceImpl");
		try {
			FileUtils.copyFileToDirectory(srcFile, destFolder);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void copyGuiDeviceDriversGeneratedFromVocabulary(String type,
			String name, List<String> softwareComponmentNameToPick) {

		String tempVariableForSoftwareComponent = softwareComponmentNameToPick
				.iterator().next();
		File srcFile = new File(GlobalVariable.templatePath + "/"
				+ "EndUserApp" + "/src/deviceImpl/" + type
				+ tempVariableForSoftwareComponent + ".java");

		File destFolder = new File(GlobalVariable.templatePath + "/"
				+ GlobalVariable.deploymentFolderPath + "/" + name
				+ "/src/deviceImpl");
		try {
			FileUtils.copyFileToDirectory(srcFile, destFolder);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// NodeJS Sensor

	/*
	 * public static void copyNodeJSSensorGeneratedFromVocabulary(String type,
	 * String name, List<String> softwareComponmentNameToPick) {
	 * 
	 * 
	 * 
	 * File srcFile = new File(GlobalVariable.templatePath + "/" + type +
	 * "DeviceDrivers" + "/src/deviceImpl/" + type +
	 * softwareComponmentNameToPick.get(0) + ".js");
	 * 
	 * File destFolder = new File(GlobalVariable.templatePath + "/" +
	 * GlobalVariable.deploymentFolderPath + "/" + name + "/src/deviceImpl");
	 * try { FileUtils.copyFileToDirectory(srcFile, destFolder); } catch
	 * (IOException e) { e.printStackTrace(); }
	 * 
	 * }
	 */

	public static void copyNodeJSSensorGeneratedFromVocabulary(String type,
			String name, String softwareComponmentNameToPick) {

		File srcFile = new File(GlobalVariable.templatePath + "/" + type
				+ "DeviceDrivers" + "/src/deviceImpl/" + type
				+ softwareComponmentNameToPick + ".js");

		File destFolder = new File(GlobalVariable.templatePath + "/"
				+ GlobalVariable.deploymentFolderPath + "/" + name
				+ "/src/deviceImpl");
		try {
			FileUtils.copyFileToDirectory(srcFile, destFolder);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// Server.js

	public static void copyNodeJSServerGeneratedFromVocabulary(String type,
			String name, List<String> softwareComponmentNameToPick) {

		/*
		 * String tempVariableForSoftwareComponent =
		 * softwareComponmentNameToPick .iterator().next();
		 */

		File srcFile = new File(GlobalVariable.templatePath + "/" + "DashBoard"
				+ "/src/deviceImpl/" + "server.js");

		File destFolder = new File(GlobalVariable.templatePath + "/"
				+ GlobalVariable.deploymentFolderPath + "/" + name
				+ "/src/deviceImpl");
		try {
			FileUtils.copyFileToDirectory(srcFile, destFolder);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// Client.html

	public static void copyNodeJSClientGeneratedFromVocabulary(String type,
			String name, List<String> softwareComponmentNameToPick) {

		/*
		 * String tempVariableForSoftwareComponent =
		 * softwareComponmentNameToPick .iterator().next();
		 */
		File srcFile = new File(GlobalVariable.templatePath + "/" + "DashBoard"
				+ "/src/deviceImpl/" + "client" + ".html");

		File destFolder = new File(GlobalVariable.templatePath + "/"
				+ GlobalVariable.deploymentFolderPath + "/" + name
				+ "/src/deviceImpl");
		try {
			FileUtils.copyFileToDirectory(srcFile, destFolder);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void copydeviceImplGeneratedFromArchitecture(String type,
			String name, List<String> softwareComponmentNameToPick) {

		File srcFile = new File(GlobalVariable.templatePath + "/"
				+ "ApplicationLogic/src/deviceImpl/" + type
				+ softwareComponmentNameToPick.get(0) + ".java");

		File destFolder = new File(GlobalVariable.templatePath + "/"
				+ GlobalVariable.deploymentFolderPath + "/" + name
				+ "/src/deviceImpl");
		try {
			FileUtils.copyFileToDirectory(srcFile, destFolder);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void copyFactoryGenerateFromVocabulary(String type,
			String name, List<String> softwareComponmentNameToPick) {

		File srcFile = new File(GlobalVariable.templatePath + "/" + type
				+ "DeviceDrivers" + "/src/factory/"
				+ softwareComponmentNameToPick.get(0) + "Factory" + ".java");

		File destFolder = new File(GlobalVariable.templatePath + "/"
				+ GlobalVariable.deploymentFolderPath + "/" + name + "/src/"
				+ "factory");

		try {
			FileUtils.copyFileToDirectory(srcFile, destFolder);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void copyGuiFactoryGenerateFromVocabulary(String type,
			String name, List<String> softwareComponmentNameToPick) {

		File srcFile = new File(GlobalVariable.templatePath + "/"
				+ "EndUserApp" + "/src/factory/"
				+ softwareComponmentNameToPick.get(0) + "Factory" + ".java");

		File destFolder = new File(GlobalVariable.templatePath + "/"
				+ GlobalVariable.deploymentFolderPath + "/" + name + "/src/"
				+ "factory");

		try {
			FileUtils.copyFileToDirectory(srcFile, destFolder);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void copyFactoryGenerateFromArchitecture(String type,
			String name, List<String> softwareComponmentNameToPick) {

		File srcFile = new File(GlobalVariable.templatePath + "/"
				+ "ApplicationLogic/src/factory/"
				+ softwareComponmentNameToPick.get(0) + "Factory" + ".java");

		File destFolder = new File(GlobalVariable.templatePath + "/"
				+ GlobalVariable.deploymentFolderPath + "/" + name + "/src/"
				+ "factory");

		try {
			FileUtils.copyFileToDirectory(srcFile, destFolder);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void copyFrameworkGeneratedFromVocabularyForInteraction(
			String type, String name, List<String> softwareComponmentNameToPick) {

		File srcFile = new File(GlobalVariable.templatePath + "/" + type
				+ "DeviceDrivers" + "/src/framework/"
				+ softwareComponmentNameToPick.get(0) + ".java");
		File destFolder = new File(GlobalVariable.templatePath + "/"
				+ GlobalVariable.deploymentFolderPath + "/" + name + "/src/"
				+ "framework");
		try {
			FileUtils.copyFileToDirectory(srcFile, destFolder);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void copyGuiFrameworkGeneratedFromVocabularyForInteraction(
			String type, String name, List<String> softwareComponmentNameToPick) {

		File srcFile = new File(GlobalVariable.templatePath + type
				+ "DeviceDrivers" + "/src/framework/"
				+ softwareComponmentNameToPick.get(0) + ".java");
		File destFolder = new File(GlobalVariable.templatePath + "/"
				+ GlobalVariable.deploymentFolderPath + "/" + name + "/src/"
				+ "framework");
		try {
			FileUtils.copyFileToDirectory(srcFile, destFolder);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void copyFrameworkGeneratedFromVocabularyForInterface(
			String type, String name, List<String> softwareComponmentNameToPick) {

		File srcFile = new File(GlobalVariable.templatePath + "/" + type
				+ "DeviceDrivers" + "/src/framework/" + "I"
				+ softwareComponmentNameToPick.get(0) + ".java");
		File destFolder = new File(GlobalVariable.templatePath + "/"
				+ GlobalVariable.deploymentFolderPath + "/" + name + "/src/"
				+ "framework");
		try {
			FileUtils.copyFileToDirectory(srcFile, destFolder);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void copyGuiFrameworkGeneratedFromVocabularyForInterface(
			String type, String name, List<String> softwareComponmentNameToPick) {

		File srcFile = new File(GlobalVariable.templatePath + "/" + type
				+ "DeviceDrivers" + "/src/framework/" + "I"
				+ softwareComponmentNameToPick.get(0) + ".java");
		File destFolder = new File(GlobalVariable.templatePath + "/"
				+ GlobalVariable.deploymentFolderPath + "/" + name + "/src/"
				+ "framework");
		try {
			FileUtils.copyFileToDirectory(srcFile, destFolder);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void copyFrameworkGeneratedFromArchitectureForInterface(
			String type, String name, List<String> softwareComponmentNameToPick) {

		File srcFile = new File(GlobalVariable.templatePath + "/"
				+ "ApplicationLogic/src/framework/" + "I"
				+ softwareComponmentNameToPick.get(0) + ".java");

		File destFolder = new File(GlobalVariable.templatePath + "/"
				+ GlobalVariable.deploymentFolderPath + "/" + name + "/src/"
				+ "framework");
		try {
			FileUtils.copyFileToDirectory(srcFile, destFolder);
		} catch (IOException e) {
			e.printStackTrace();
		}

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
						+ tempValriableForStructFiles);

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
	}

	public static void copyGuiFrameworkGeneratedFromVocabularyForStruct(
			String type, String name, String stringForRegEx) {

		File srcFolder = new File(GlobalVariable.templatePath + "/" + type
				+ "DeviceDrivers" + "/src/framework/");

		File[] listOfFiles = srcFolder.listFiles();

		for (int i = 0; i < listOfFiles.length; i++) {

			if (listOfFiles[i].getName().contains(stringForRegEx)) {

				String tempValriableForStructFiles = listOfFiles[i].getName();

				File srcFile = new File(GlobalVariable.templatePath + "/"
						+ type + "DeviceDrivers" + "/src/framework/"
						+ tempValriableForStructFiles);

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
	}

	public static void copyFrameworkGeneratedFromVocabularyForListener(
			String type, String name, String stringForRegEx) {

		File srcFolder = new File(GlobalVariable.templatePath + "/" + type
				+ "DeviceDrivers" + "/src/framework/");
		File[] listOfFiles = srcFolder.listFiles();

		for (int i = 0; i < listOfFiles.length; i++) {

			if (listOfFiles[i].getName().contains(stringForRegEx)) {
				String tempValriableForInterfaceFiles = listOfFiles[i]
						.getName();
				File srcFile = new File(GlobalVariable.templatePath + "/"
						+ type + "DeviceDrivers" + "/src/framework/"
						+ tempValriableForInterfaceFiles);

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

	}

	public static void copyGuiFrameworkGeneratedFromVocabularyForListener(
			String type, String name, List<String> softwareComponmentNameToPick) {

		// System.out.println("Software Name is.."+softwareComponmentNameToPick.get(0));

		File srcFile = new File(GlobalVariable.templatePath + "/" + type
				+ "DeviceDrivers" + "/src/framework/Listener"
				+ softwareComponmentNameToPick.get(0) + ".java");

		File destFolder = new File(GlobalVariable.templatePath + "/"
				+ GlobalVariable.deploymentFolderPath + "/" + name + "/src/"
				+ "framework");

		try {
			FileUtils.copyFileToDirectory(srcFile, destFolder);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void copyFrameworkGeneratedFromAchitectureForListener(
			String type, String name, String stringForRegEx) {

		File srcFolder = new File(GlobalVariable.templatePath + "/"
				+ "ApplicationLogic/src/framework/");

		File[] listOfFiles = srcFolder.listFiles();

		for (int i = 0; i < listOfFiles.length; i++) {

			if (listOfFiles[i].getName().contains(stringForRegEx)) {
				String tempValriableForInterfaceFiles = listOfFiles[i]
						.getName();
				File srcFile = new File(GlobalVariable.templatePath + "/"
						+ type + "DeviceDrivers" + "/src/framework/"
						+ tempValriableForInterfaceFiles);

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

	}

	public static void copyLogicGeneratedFromVocabulary(String type,
			String name, List<String> softwareComponmentNameToPick) {

		File srcFile = new File(GlobalVariable.templatePath + "/" + type
				+ "DeviceDrivers" + "/src/logic/" + "Logic"
				+ softwareComponmentNameToPick.get(0) + ".java");

		File destFolder = new File(GlobalVariable.templatePath + "/"
				+ GlobalVariable.deploymentFolderPath + "/" + name + "/src/"
				+ "logic");

		try {
			FileUtils.copyFileToDirectory(srcFile, destFolder);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void copyGuiLogicGeneratedFromVocabulary(String type,
			String name, List<String> softwareComponmentNameToPick) {

		File srcFile = new File(GlobalVariable.templatePath + "/"
				+ "EndUserApp" + "/src/logic/" + "Logic"
				+ softwareComponmentNameToPick.get(0) + ".java");

		File destFolder = new File(GlobalVariable.templatePath + "/"
				+ GlobalVariable.deploymentFolderPath + "/" + name + "/src/"
				+ "logic");

		try {
			FileUtils.copyFileToDirectory(srcFile, destFolder);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/*
	 * public static void copyApplicationLogicArchitectureSpecification( String
	 * type, String name, List<String> softwareComponmentNameToPick) {
	 * 
	 * File srcFile = new File(GlobalVariable.templatePath + "/" +
	 * "ApplicationLogic/src/logic/" + "Logic" +
	 * softwareComponmentNameToPick.get(0) + ".java");
	 * 
	 * File destFolder = new File(GlobalVariable.templatePath + "/" +
	 * GlobalVariable.deploymentFolderPath + "/" + name + "/src/" + "logic");
	 * 
	 * try { FileUtils.copyFileToDirectory(srcFile, destFolder); } catch
	 * (IOException e) { e.printStackTrace(); }
	 * 
	 * }
	 */

	public static void copyApplicationLogicArchitectureSpecification(
			String type, String name, String softwareComponmentNameToPick) {

		File srcFile = new File(GlobalVariable.templatePath + "/"
				+ "ApplicationLogic/src/logic/" + "Logic"
				+ softwareComponmentNameToPick + ".java");

		File destFolder = new File(GlobalVariable.templatePath + "/"
				+ GlobalVariable.deploymentFolderPath + "/" + name + "/src/"
				+ "logic");

		try {
			FileUtils.copyFileToDirectory(srcFile, destFolder);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/*
	 * public static void copyFrameworkArchitectureSpecification(String type,
	 * String name, List<String> softwareComponmentNameToPick) {
	 * 
	 * File srcFile = new File(GlobalVariable.templatePath + "/" +
	 * "ApplicationLogic/src/framework/" + softwareComponmentNameToPick.get(0) +
	 * ".java");
	 * 
	 * File destFolder = new File(GlobalVariable.templatePath + "/" +
	 * GlobalVariable.deploymentFolderPath + "/" + name + "/src/" +
	 * "framework"); try { FileUtils.copyFileToDirectory(srcFile, destFolder); }
	 * catch (IOException e) { e.printStackTrace(); }
	 * 
	 * }
	 */

	public static void copyFrameworkArchitectureSpecification(String type,
			String name, String softwareComponmentNameToPick) {

		File srcFile = new File(GlobalVariable.templatePath + "/"
				+ "ApplicationLogic/src/framework/"
				+ softwareComponmentNameToPick + ".java");

		File destFolder = new File(GlobalVariable.templatePath + "/"
				+ GlobalVariable.deploymentFolderPath + "/" + name + "/src/"
				+ "framework");
		try {
			FileUtils.copyFileToDirectory(srcFile, destFolder);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// Some general function...
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
		}
	}

	public static List<String> convertListFromSet(Set<String> listVariable) {
		ArrayList<String> L1 = new ArrayList<String>();
		List<String> result = new ArrayList<String>();
		L1.addAll(listVariable);
		for (String x : L1) {
			if (x.equals("true") || x.equals("false") || x.equals("NoType")
					|| x.equals("custom") || x.equals("inbuilt")) {
				// Do nothing ...
			} else {
				result.add(x);
			}

		}
		return result;
	}

}
