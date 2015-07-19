package iotsuite.parser;

import iotsuite.compiler.ActuatorCompiler;
import iotsuite.compiler.ComputationalServiceCompiler;
//import iotsuite.compiler.ControllerCompiler;
import iotsuite.compiler.DeviceCompiler;
import iotsuite.compiler.UserInterfaceCompiler;
import iotsuite.compiler.MapperCompiler;
import iotsuite.compiler.RegionCompiler;
import iotsuite.compiler.SensorCompiler;
import iotsuite.compiler.StorageCompiler;
import iotsuite.compiler.StructCompiler;
import iotsuite.semanticmodel.DataAccess;
import iotsuite.semanticmodel.DeploymentScope;
import iotsuite.semanticmodel.Device;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SymbolTable {

	public static Map<String, String> symblTable = new HashMap<String, String>();

	public static Map<String, StructCompiler> structSymblTable = new HashMap<String, StructCompiler>();

	public static Map<String, String> responseSymblTable = new HashMap<String, String>();

	public static List<Device> deviceList = new ArrayList<Device>();

	public static List<DeploymentScope> deploymentConstraintsList = new ArrayList<DeploymentScope>();

	public static Map<String, Set<DataAccess>> dataAccessSymblTable = new HashMap<String, Set<DataAccess>>();

	// Getter and Setter of DataAccessSymblTable

	public static Set<DataAccess> getDataAccessSymblTable(String dataAccessKey) {
		return dataAccessSymblTable.get(dataAccessKey);

	}

	public static void constructDataAccessSymblTable(String dataAccessKey,
			Set<DataAccess> dataAccessObj) {
		dataAccessSymblTable.put(dataAccessKey, dataAccessObj);
	}

	// Getter and Setter of DeploymentConstrinstsSymblTable
	public static void addDeploymentConstraints(DeploymentScope dc) {
		deploymentConstraintsList.add(dc);
	}

	public static List<DeploymentScope> getDeploymentConstrainsList() {
		return deploymentConstraintsList;
	}

	// Getter and Setter of DeviceSymblTable

	public static void addDeviceinSymblTable(Device deviceObj) {
		deviceList.add(deviceObj);
	}

	public static List<Device> getDeviceList() {
		return deviceList;
	}

	public static String getSymblTableData(String variableName) {
		return symblTable.get(variableName);
	}

	public static void constructSymbTable(String variableName,
			String variableType) {

		if (symblTable.containsKey(variableName)) {

		} else {
			symblTable.put(variableName, variableType);
		}
	}

	// Getter and Setter of structSymblTable

	public static void constructStructSymblTable(String structAccessKey,
			StructCompiler structAccessObj) {
		structSymblTable.put(structAccessKey, structAccessObj);
	}

	public static StructCompiler getStructSymblTable(String structAccessKey) {
		return structSymblTable.get(structAccessKey);

	}

	public static void constructResponseTypeSymblTable(String structAccessKey,
			String structAccessObj) {
		responseSymblTable.put(structAccessKey, structAccessObj);
	}

	public static String getResponseTypeSymblTable(String structAccessKey) {
		return responseSymblTable.get(structAccessKey);

	}

	// Cursor to current structure
	public StructCompiler currentStruct;

	public SensorCompiler currentSensor;

	public ActuatorCompiler currentActuator;

	public UserInterfaceCompiler currentGUI;

	public StorageCompiler currentStorageService;

	public ComputationalServiceCompiler currentComputationalService;

	// public ControllerCompiler currentController;

	public RegionCompiler currentRegion;

	public DeviceCompiler currentNetwork;

	public MapperCompiler currentMappingConstraint;

	public SymbolTable() {

	}

}
