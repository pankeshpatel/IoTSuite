package iotsuite.compiler;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import iotsuite.codegenerator.CompilationUnit;
import iotsuite.codegenerator.GenFiller;
import iotsuite.codegenerator.JavaFrameworkFromST;
import iotsuite.codegenerator.SourceFileDumper;
import iotsuite.common.GlobalVariable;
import iotsuite.mappingalgo.MappingAlgoCompiler;
import iotsuite.parser.SymbolTable;
import iotsuite.semanticmodel.DeploymentScope;
import iotsuite.semanticmodel.Device;

public class MapperCompiler {

	private String softwareComponentName;
	private String softwareComponentType;

	public String getSoftwareComponentType() {
		return softwareComponentType;
	}

	public void setSoftwareComponentType(String softwareComponentType) {
		this.softwareComponentType = softwareComponentType;
	}

	private DeploymentScope deploymentConstraint;

	public MapperCompiler() {
	}

	public void addDeployementConstraintObj() {
		deploymentConstraint = new DeploymentScope(getSoftwareComponentName(),
				getSoftwareComponentType());
		SymbolTable.addDeploymentConstraints(deploymentConstraint);
	}

	public String getSoftwareComponentName() {
		return softwareComponentName;
	}

	public void setSoftwareComponentName(String softwareComponentName) {
		this.softwareComponentName = softwareComponentName;
	}

	public static void mappingFileGenerator(List<Device> deviceList,
			List<DeploymentScope> mappingConstraintList) throws IOException {

		// Mapping Algorithm
		Map<Device, Set<String>> taskMapper = MappingAlgoCompiler.mapTasks(
				deviceList, mappingConstraintList);

		for (Entry<Device, Set<String>> entry : taskMapper.entrySet()) {

			Device device = MergeDeviceAbilities(entry.getKey(),
					entry.getValue(), "DBServer");

			if(device.getType().equals("NodeJS")){
				multiplyTemplate(device);
			}		
			else{
				multiplyTemplate(device);
				genearateStartupCode(device);
				genearateExecutionCode(device);
				genearateProjectFileCode(device);
			}
			

		}
	}

	private static Device MergeDeviceAbilities(Device device,
			Set<String> swComponentName, String filterAbility) {

		List<String> forLoopAbilities = new ArrayList<String>();
		forLoopAbilities.addAll(device.getAbilities());
		forLoopAbilities.addAll(swComponentName);

		Set<String> resultAbilities = new HashSet<String>();

		for (String ab : forLoopAbilities) {
			if (ab.equals(filterAbility)) {
				// Do nothing...
			} else {
				resultAbilities.add(ab);
				resultAbilities.addAll(swComponentName);
			}
		}

		return new Device(device.getName(), device.getType(),
				device.getNetworkAddress(), device.getRegion(),
				device.getRegionLabels(), resultAbilities,
				device.getMobileFlag(), device.getProtocol(),
				device.getDescription(), device.getDatabase());
		
	
	}

	/*
	 * This method generates folders according to number of devices in the
	 * deployment specification. For example, if the device specification
	 * contains 6 JavaSE-enabled devices and 4 Android devices Then, this method
	 * generates 6 JavaSEFolders and 4 Android Folders.
	 * 
	 * This method uses source folder as following - based on device type
	 * CurrentWorkingDir/DeviceDrivers/JavaSE
	 * CurrentWorkingDir/DeviceDrivers/Android
	 */

	public static void multiplyTemplate(Device unit) {

		if (unit.getType().equals(GlobalVariable.ANDROID_ENABLED_DEVICES)) {
			generateDeviceManifest(unit);
		}

		if(unit.getAbilities().contains(GlobalVariable.USER_INTERACTION_ENDUSERAPP))
		{
			
						
			File srcFolder = new File(GlobalVariable.templatePath + "/"
					+ "DeviceDrivers" + "/" +"EndUserApp");

			new File(GlobalVariable.templatePath).mkdirs();
			File destFolder = new File(GlobalVariable.templatePath + "/"
					+ GlobalVariable.deploymentFolderPath + "/" + unit.getType()
					+ unit.getName());

			if (!srcFolder.exists()) {
				System.out.println("Directory does not exist.");
				System.exit(0);
			} else {
				try {
					GenFiller.copyFolder(srcFolder, destFolder);
				} catch (IOException e) {
					e.printStackTrace();
					System.exit(0);
				}
			}
		}
		else
			
		{
			
			
			File srcFolder = new File(GlobalVariable.templatePath + "/"
					+ "DeviceDrivers" + "/" + unit.getType());

			new File(GlobalVariable.templatePath).mkdirs();
			File destFolder = new File(GlobalVariable.templatePath + "/"
					+ GlobalVariable.deploymentFolderPath + "/" + unit.getType()
					+ unit.getName());

			if (!srcFolder.exists()) {
				System.out.println("Directory does not exist.");
				System.exit(0);
			} else {
				try {
					GenFiller.copyFolder(srcFolder, destFolder);
				} catch (IOException e) {
					e.printStackTrace();
					System.exit(0);
				}
			}
			
		}
		

	}

	private static void genearateStartupCode(Device device) {

		JavaFrameworkFromST generateDevice = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generateDevice
				.generateDeviceStartup(device);
		SourceFileDumper dumpGeneratedDevice = new SourceFileDumper();
		dumpGeneratedDevice.dumpCompilationUnit(generatedCU);
	}

	// this function call generate start up files :
	// For Android : MainActivity.java
	// and for JavaSE : D1Main.java
	private static void genearateExecutionCode(Device device) {
		JavaFrameworkFromST generateDevice = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generateDevice
				.generatePlatformSpecificExecutionStartup(device);
		SourceFileDumper dumpGeneratedDevice = new SourceFileDumper();
		dumpGeneratedDevice.dumpCompilationUnit(generatedCU);
	}

	private static void genearateProjectFileCode(Device device) {
		JavaFrameworkFromST generateDevice = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generateDevice
				.generatePlatformSpecificProjectFile(device);
		SourceFileDumper dumpGeneratedDevice = new SourceFileDumper();
		dumpGeneratedDevice.dumpCompilationUnit(generatedCU);
	}

	private static void generateDeviceManifest(Device device) {
		JavaFrameworkFromST generatedGUIDriver = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generatedGUIDriver
				.generateAndroidManifest(device);
		SourceFileDumper dumpGeneratedGUIDriver = new SourceFileDumper();
		dumpGeneratedGUIDriver.dumpCompilationUnit(generatedCU);

	}

}
