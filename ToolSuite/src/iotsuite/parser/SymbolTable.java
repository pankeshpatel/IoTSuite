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
import iotsuite.semanticmodel.DataType;
import iotsuite.semanticmodel.DeploymentScope;
import iotsuite.semanticmodel.Device;
import iotsuite.semanticmodel.PrimitiveType;
import iotsuite.semanticmodel.StructField;

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

	// Following four lists are used to store intermediate results
	public static List<String> tempListStorageFieldName = new ArrayList<String>();

	public static List<String> tempListStorageFieldType = new ArrayList<String>();

	public static List<String> tempListActuatorFieldName = new ArrayList<String>();

	public static List<String> tempListActuatorFieldType = new ArrayList<String>();
	
/*	
	//Following list used to store struct field name utilized by aggregator corresponding to structure
	public static List<String> aggregatorStructFieldName = new ArrayList<String>();
	
	//Following list used to store struct field types utilized by aggregator corresponding to structure
	public static List<String> aggregatorStructFieldType = new ArrayList<String>();*/
	
		// Static Table used for Mapping from high level specification datatype to
	// Resultset required datatype
	static HashMap<String, String> javaToResultSetMapping = new HashMap<String, String>();

	// Following Symbol Table stores name of struct (ex- TempStruct and
	// BadgeStruct)
	public static ArrayList<String> structNameSymblTable = new ArrayList<String>();

	// Following list stores field name and field type of
	// Structure(ex-tempValue-double)
	public static ArrayList<String> structField = new ArrayList<String>();
	
	//Following araylist used to store filed name and type used by event driven sensor(ex- String badgeId, boolean presence etc.)
	public static ArrayList<String> eventDrivenFields = new ArrayList<String>();
	
	//Following list used to store field name used by event driven sensor (ex-badgeId, presence etc.) 
	public static List<String> eventDrivenFieldName= new ArrayList<String>();

	public static Map<String, StructCompiler> structSymblTable = new HashMap<String, StructCompiler>();

	public static Map<String, String> responseSymblTable = new HashMap<String, String>();

	public static List<Device> deviceList = new ArrayList<Device>();

	public static List<DeploymentScope> deploymentConstraintsList = new ArrayList<DeploymentScope>();

	public static Map<String, Set<DataAccess>> dataAccessSymblTable = new HashMap<String, Set<DataAccess>>();
	
	public static List<StructField> StructFieldSet = new ArrayList<StructField>();
	
	/*public static List<String> structFieldName = new ArrayList<String>();
	
	public static List<String> structFieldType = new ArrayList<String>();
*/
	// Store Structure Name ex-TempStruct or BadgeStruct
	public static String structName;
	// Store Structure Name that is used by Storage
	public static String storageStructName;

	// Store Structure Name that is used by Actuator
	public static String actuatorStructName;
	
	//Store Struct Name used by Aggregator
	public static String aggregatorStructName;

	static String[][] arrayFieldName = new String[10][2];
	static String[][] arrayFieldType = new String[10][2];
	static String [] keys= new String[10];

	public static int rowCountInFieldName = 0;
	public static int columnCountInFieldName = 0;
	public static int rowCountInFieldType = 0;
	public static int columnCountinFieldType = 0;
	
	static StructField Field;

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
			
		}

	}

	
	public void constructAggregatorSymblTable(String aggregatorStructName) {
		// TODO Auto-generated method stub
		
		searchStructFieldNameForAggregator(aggregatorStructName);
		
	}

	public void constructStructNameSymblTable(String structName) {
		structNameSymblTable.add(structName);
		SymbolTable.structName = structName;
	}

	public void constructStorageSymblTable(String storageStructName) {

		SymbolTable.storageStructName = storageStructName;
		searchForStorageFields();
	}

	public void constructActuatorSymblTable(String actuatorStructName) {

		SymbolTable.actuatorStructName = actuatorStructName;
		searchForActuatorFields();

	}

	public void constructStructFieldSymblTable(String fieldName,
			String fieldType) {

		insertFieldName(structName, fieldName);
		insertFieldType(structName, fieldType);
		

	}
	
	public void constructEventDrivenSymblTable(String eventDrivenStructName) {
		
			searchForEventDrivenSensorFields(eventDrivenStructName);
		
		
	}

	private void insertFieldType(String structName, String fieldType) {

		arrayFieldType[rowCountInFieldType][columnCountinFieldType] = structName;
		columnCountinFieldType = columnCountinFieldType + 1;
		arrayFieldType[rowCountInFieldType][columnCountinFieldType] = fieldType;
		rowCountInFieldType++;
		columnCountinFieldType = 0;

	}

	private void insertFieldName(String structName, String fieldName) {

		arrayFieldName[rowCountInFieldName][columnCountInFieldName] = structName;
		columnCountInFieldName = columnCountInFieldName + 1;
		arrayFieldName[rowCountInFieldName][columnCountInFieldName] = fieldName;
		rowCountInFieldName++;
		columnCountInFieldName = 0;

	}
	

	public static void searchForEventDrivenSensorFields(
			String eventDrivenStructName) {
		
		List<String> tempEventFieldName = new ArrayList<String>();
		
		for (int i = 0; i < 10; i++) {

			if (arrayFieldName[i][0] != null) {
				if (arrayFieldName[i][0].equals(eventDrivenStructName))

				{ tempEventFieldName.add(arrayFieldName[i][1]);
					for (int j = 0; j < tempEventFieldName.size(); j++)
					{
						
						if (!eventDrivenFieldName
								.contains(tempEventFieldName.get(j))) {
							
					eventDrivenFields.add((arrayFieldType[i][1])
							+ " "
							+ (arrayFieldName[i][1]));
					eventDrivenFieldName.add(arrayFieldName[i][1]);
						}
					}
				}
			}

		}
	
		
		
	}

	
	private static void searchStructFieldNameForAggregator(
			String aggregatorStructName) {
		
	//	List<String> tempAggregatorStructFieldName = new ArrayList<String>();
		
		for (int i = 0; i < 10; i++) {
			if (arrayFieldName[i][0] != null)
			{
				if (arrayFieldName[i][0].equals(aggregatorStructName)) {

			//		tempAggregatorStructFieldName.add(arrayFieldName[i][1]);
				//	for (int j = 0; j < tempAggregatorStructFieldName.size(); j++) {
					//	if (!aggregatorStructFieldName
						//		.contains(tempAggregatorStructFieldName.get(j))) {

					//arrayFieldType[i][1]=arrayFieldType[i][1].substring(0, 5).toUpperCase();
					 //arrayFieldType[i][1]= arrayFieldType[i][1].substring(0,1).toUpperCase() + arrayFieldType[i][1].substring(1);
					 Field = new StructField(arrayFieldName[i][1],new PrimitiveType(arrayFieldType[i][1]));
					
					 StructFieldSet.add(Field);
					
					 /*structFieldName.add(arrayFieldName[i][1]);
					structFieldType.add(arrayFieldType[i][1]);*/
					}

				}
			}
		
	 // System.out.println("Struct Field set is "+StructFieldSet);
		
	  }
		
		
	//}
	
	
	private void searchForActuatorFields() {

		for (int i = 0; i < 10; i++) {
			if (arrayFieldName[i][0] != null) {
				if (arrayFieldName[i][0].equals(actuatorStructName)) {

					tempListActuatorFieldName.add(arrayFieldName[i][1]);
					tempListActuatorFieldType.add(arrayFieldType[i][1]);

				}
			}

		}
	}

	public void constructStorageInfoSymblTable(String fieldName,
			String fieldType) {

		listStorageFieldName.add(fieldName);
		listStorageFieldName.addAll(tempListStorageFieldName);

		listStorageFieldType.add(fieldType);
		listStorageFieldType.addAll(tempListStorageFieldType);

	}

	// Getter and Setter of structSymblTable

	private void searchForStorageFields() {

		for (int i = 0; i < 10; i++) {

			if (arrayFieldName[i][0] != null) {
				if (arrayFieldName[i][0].equals(storageStructName)) {

					tempListStorageFieldName.add(arrayFieldName[i][1]);
					tempListStorageFieldType.add(arrayFieldType[i][1]);

					Mapping(javaToResultSetMapping);
					structField.add(javaToResultSetMapping
							.get(arrayFieldType[i][1])
							+ "(\""
							+ (arrayFieldName[i][1]) + "\") ");

				}
			}
		}

	}

	public static void Mapping(Map<String, String> javaType) {

		javaType.put("String", "String");
		javaType.put("double", "Double");
		javaType.put("int", "Int");
		javaType.put("boolean", "Boolean");
		javaType.put("long", "Long");
		javaType.put("float", "Float");

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
