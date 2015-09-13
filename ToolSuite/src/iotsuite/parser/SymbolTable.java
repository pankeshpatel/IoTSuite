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

	// Store field name that is used in Storage
	public static List<String> listStorageFieldName = new ArrayList<String>();
	// Store field type that is used in Storage
	public static List<String> listStorageFieldType = new ArrayList<String>();

	public static List<String> tempListStorageFieldName = new ArrayList<String>();
	
	public static List<String> tempListActuatorFieldName = new ArrayList<String>();

	public static List<String> tempListStorageFieldType = new ArrayList<String>();
	public static List<String> tempListActuatorFieldType = new ArrayList<String>();

	// Following Symbol Table stores name of struct (ex- TempStruct and
	// BadgeStruct)
	public static ArrayList<String> structNameSymblTable = new ArrayList<String>();

	public static ArrayList<String> structField = new ArrayList<String>();

	public static Map<String, StructCompiler> structSymblTable = new HashMap<String, StructCompiler>();

	public static Map<String, String> responseSymblTable = new HashMap<String, String>();

	public static List<Device> deviceList = new ArrayList<Device>();

	public static List<DeploymentScope> deploymentConstraintsList = new ArrayList<DeploymentScope>();

	public static Map<String, Set<DataAccess>> dataAccessSymblTable = new HashMap<String, Set<DataAccess>>();

	// Store Structure Name ex-TempStruct or BadgeStruct
	public static String structName; 
	 // Store Structure Name that is used by Storage
	public static String storageStructName;
	
	//Store Structure Name that is used by Actuator
	public static String actuatorStructName;

	String[][] arrayFieldName = new String[10][2];
	String[][] arrayFieldType = new String[10][2];

	public static int a = 0;
	public static int b = 0;
	public static int p = 0;
	public static int q = 0;

	/*
	 * public static void constructResponseTypeSymblTable(String
	 * structAccessKey, String structAccessObj) {
	 * responseSymblTable.put(structAccessKey, structAccessObj);
	 * //System.out.println
	 * (structAccessKey+" "+structAccessObj+"In Symbol Table.java"); }
	 */

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
			storageStructName = variableType;
		

		}

	}

	public void constructStructNameSymblTable(String structName) {
		structNameSymblTable.add(structName);
		SymbolTable.structName = structName;
		
		
	}
	
	public void constructActuatorSymblTable(String actuatorStructName) {
		// TODO Auto-generated method stub
		SymbolTable.actuatorStructName=actuatorStructName;
		searchActuatorStruct();
		
		
		
	}

	public void constructStructFieldSymblTable(String fieldName,
			String fieldType) {

		insertFieldName(structName, fieldName);
		
		insertFieldType(structName, fieldType);
		
		
	}

	private void insertFieldType(String structName, String fieldType) {
		
		
		arrayFieldType[p][q] = structName;
		q = q + 1;
		arrayFieldType[p][q] = fieldType;
		p++;
		q = 0;
	
		
	}

	private void insertFieldName(String structName, String fieldName) {
		
		arrayFieldName[a][b] = structName;
		b = b + 1;
		arrayFieldName[a][b] = fieldName;
	    a++;
		b = 0;
		
		
		
		
	}
	

	private void searchActuatorStruct() {

		
		for (int i = 0; i < 2; i++) {
			if (arrayFieldName[i][0].equals(actuatorStructName)) 
			{

				tempListActuatorFieldName.add(arrayFieldName[i][1]);
				tempListActuatorFieldType.add(arrayFieldType[i][1]);
				
			}

		}
	}

	

	public void constructStorageInfoSymblTable(String fieldName,
			String fieldType) {

		
		searchStorageStruct();
		
		listStorageFieldName.add(fieldName);
		listStorageFieldName.addAll(tempListStorageFieldName);
		
		
		listStorageFieldType.add(fieldType);
		listStorageFieldType.addAll(tempListStorageFieldType);

	}

	// Getter and Setter of structSymblTable

	private void searchStorageStruct() {

		for (int i = 0; i < 2; i++) {
			if (arrayFieldName[i][0].equals(storageStructName)) {

				tempListStorageFieldName.add(arrayFieldName[i][1]);
				tempListStorageFieldType.add(arrayFieldType[i][1]);
				
				structField.add(arrayFieldType[i][1] + "(\""
						+ (arrayFieldName[i][1]) + "\") ");

			}

		}

	}

	public void constructStructSymblTable(String structAccessKey,
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
