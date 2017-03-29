package iotsuite.compiler;

import iotsuite.codegenerator.CompilationUnit;
import iotsuite.codegenerator.JavaFrameworkFromST;
import iotsuite.codegenerator.SourceFileDumper;
import iotsuite.parser.SymbolTable;
import iotsuite.semanticmodel.Action;
import iotsuite.semanticmodel.ComputationalService;
import iotsuite.semanticmodel.ConsumeInfo;
import iotsuite.semanticmodel.DataAccess;
import iotsuite.semanticmodel.DataType;
import iotsuite.semanticmodel.Information;
import iotsuite.semanticmodel.Parameter;
import iotsuite.semanticmodel.StructField;
import iotsuite.semanticmodel.TempConsumeInfo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ComputationalServiceCompiler {

	private ComputationalService computationalService;
	private Set<Information> generatedInfo = new HashSet<Information>();
	private Set<Information> consumedInfo = new HashSet<Information>();
	private String operationType;
	private Set<DataAccess> dataAccessList = new HashSet<DataAccess>();
	private Set<Action> actions = new HashSet<Action>();
	private String computationalServiceName;
	private Parameter parameter;
	private int sampleValue;
	public static List<ConsumeInfo> consumeInfoForSensor;
	public List<List<ConsumeInfo>> tempConsumeInfoForSensor = new ArrayList<List<ConsumeInfo>>();
	public static List<ConsumeInfo> consumeInfoForStorage;
	public static String consumeInfoName;
	public List<TempConsumeInfo> tempListofConsumeInfo = new ArrayList<TempConsumeInfo>();
	String tempConsumeInfoType;
	String tempConsumInfoStructFieldName;
	String tempConsumInfoStructFieldType;

	public static List<StructField> StructFieldSet = new ArrayList<StructField>();

	public void addCommand(String actionName) {
		Action action = new Action(actionName, getParameters(), null);
		actions.add(action);
	}

	private Set<Action> getActionList() {
		return actions;
	}

	private Parameter getParameters() {
		return parameter;
	}

	public void addParameter(String parameterName) {
		parameter = new Parameter(parameterName, new DataType(
				getDatafromSymblTable(parameterName)));
	}

	public String getComputationalServiceName() {
		return computationalServiceName;
	}

	public void setComputationalServiceName(String computationalServiceName) {
		this.computationalServiceName = computationalServiceName;
	}

	public void createCSObject() {
		computationalService = new ComputationalService(
				getComputationalServiceName(), getGeneratedInfo(),
				getConsumedInfo(), getDataAccessList(), getActionList(),
				getOperation(), getStructFieldSet(), getSampleValue(),
				getConsumeInfoFieldForSensor(),
				getConsumeInfoFieldForStorage(), getTempConsomeInfoForSensor());
	}

	public List<ConsumeInfo> getConsumeInfoFieldForSensor() {

		consumeInfoForSensor = iotsuite.parser.SymbolTable.consumeInfoForSensor
				.get(consumeInfoName);
		return consumeInfoForSensor;

	}

	public List<TempConsumeInfo> getTempConsomeInfoForSensor() {
		return tempListofConsumeInfo;
	}

	/*
	 * public List<List<ConsumeInfo>> getListOfListConsumeInfoFieldForSensor(){
	 * return tempConsumeInfoForSensor;
	 * 
	 * }
	 */

	public List<ConsumeInfo> getConsumeInfoFieldForStorage() {

		return consumeInfoForStorage;

	}

	public List<StructField> getStructFieldSet() {
		StructFieldSet = iotsuite.parser.SymbolTable.StructFieldSet;
		return StructFieldSet;
	}

	public Set<DataAccess> getDataAccessList() {
		return dataAccessList;
	}

	public void getDataAccessListFromSymblTable(String dataAccessStr) {

		consumeInfoForStorage = iotsuite.parser.SymbolTable.consumeInfoForSensor
				.get(dataAccessStr);
		this.dataAccessList = SymbolTable
				.getDataAccessSymblTable(dataAccessStr);
	}

	public Set<Information> getConsumedInfo() {
		return consumedInfo;
	}

	public String getOperation() {
		return operationType;
	}

	public int getSampleValue() {
		return sampleValue;
	}

	public void addOperation(String variableName, String sampleValue) {
		this.operationType = variableName;
		this.sampleValue = Integer.parseInt(sampleValue);
	}

	public void addConsumedInfo(String variableName) {

		consumeInfoName = variableName;
		consumedInfo.add(new Information(variableName, new DataType(
				getDatafromSymblTable(variableName))));
		consumeInfoForSensor = iotsuite.parser.SymbolTable.consumeInfoForSensor
				.get(consumeInfoName);
		tempConsumeInfoForSensor.add(consumeInfoForSensor);

		tempConsumeInfoType = consumeInfoForSensor.get(0).getConsumeInfoType();
		tempListofConsumeInfo.add(new TempConsumeInfo(variableName,
				tempConsumeInfoType, consumeInfoForSensor));

	}

	public String getDatafromSymblTable(String variableName) {
		return SymbolTable.getSymblTableData(variableName);
	}

	// Getter and setter of Generated Info
	public Set<Information> getGeneratedInfo() {
		return generatedInfo;
	}

	public void addGeneratedInfo(String variableName, String variableType) {
		generatedInfo.add(new Information(variableName, new DataType(
				variableType)));
	}

	public void generateAggregatorComputationalServiceCode() {
		generateComputationalServiceInteraction_ComputationalServiceCompiler();
		generateAggregatorComputationalServiceLogic_ComputationalServiceCompiler();
		generateNodejsAggregatorComputationalServiceLogic_ComputationalServiceCompiler();
		generateAggregatorComputationalServiceFactory_ComputationalServiceCompiler();
		generateAggregatorComputationalServiceInterface_ComputationalServiceCompiler();

		for (int i = 0; i < computationalService.getAllConsumedInfo().size(); i++) {
			generateComputationalServiceListener_ComputationalServiceCompiler(computationalService
					.getAllConsumedInfo().get(i));

		}

		generateImplComputationalService_ComputationalServiceCompiler();

	}

	public void generateComputationalServiceCode() {
		generateComputationalServiceInteraction_ComputationalServiceCompiler();
		generateComputationalServiceLogic_ComputationalServiceCompiler();
		generateNodejsComputationalServiceLogic_ComputationalServiceCompiler();
	}

	public void generateComputationalServiceInteraction_ComputationalServiceCompiler() {
		JavaFrameworkFromST generatedComputationalService = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generatedComputationalService
				.generateComputationalServiceInteraction(computationalService);
		SourceFileDumper dumpGeneratedComputationalService = new SourceFileDumper();
		dumpGeneratedComputationalService.dumpCompilationUnit(generatedCU);

	}

	// Node.js aggregator
	public void generateNodejsAggregatorComputationalServiceLogic_ComputationalServiceCompiler() {
		JavaFrameworkFromST generatedComputationalService = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generatedComputationalService
				.generateAggregatorComputationalServiceLogicNodejs(computationalService);
		SourceFileDumper dumpGeneratedComputationalService = new SourceFileDumper();
		dumpGeneratedComputationalService.dumpCompilationUnit(generatedCU);
	}

	public void generateAggregatorComputationalServiceLogic_ComputationalServiceCompiler() {
		JavaFrameworkFromST generatedComputationalService = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generatedComputationalService
				.generateAggregatorComputationalServiceLogic(computationalService);
		SourceFileDumper dumpGeneratedComputationalService = new SourceFileDumper();
		dumpGeneratedComputationalService.dumpCompilationUnit(generatedCU);
	}

	// Computational service for Nodejs

	public void generateNodejsComputationalServiceLogic_ComputationalServiceCompiler() {
		JavaFrameworkFromST generatedComputationalService = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generatedComputationalService
				.generateComputationalServiceLogicNodejs(computationalService);
		SourceFileDumper dumpGeneratedComputationalService = new SourceFileDumper();
		dumpGeneratedComputationalService.dumpCompilationUnit(generatedCU);
	}

	public void generateComputationalServiceLogic_ComputationalServiceCompiler() {
		JavaFrameworkFromST generatedComputationalService = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generatedComputationalService
				.generateComputationalServiceLogic(computationalService);
		SourceFileDumper dumpGeneratedComputationalService = new SourceFileDumper();
		dumpGeneratedComputationalService.dumpCompilationUnit(generatedCU);
	}

	public void generateAggregatorComputationalServiceFactory_ComputationalServiceCompiler() {

		JavaFrameworkFromST generatedComputationalService = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generatedComputationalService
				.generateComputationalServiceFactory(computationalService);
		SourceFileDumper dumpGeneratedComputationalService = new SourceFileDumper();
		dumpGeneratedComputationalService.dumpCompilationUnit(generatedCU);
	}

	public void generateAggregatorComputationalServiceInterface_ComputationalServiceCompiler() {

		JavaFrameworkFromST generatedComputationalService = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generatedComputationalService
				.generateComputationalServiceInterface(computationalService);
		SourceFileDumper dumpGeneratedComputationalService = new SourceFileDumper();
		dumpGeneratedComputationalService.dumpCompilationUnit(generatedCU);
	}

	public void generateComputationalServiceListener_ComputationalServiceCompiler(
			Information infoConsumeInfo) {
		JavaFrameworkFromST generatedComputationalService = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generatedComputationalService
				.generateComputationalServiceListener(infoConsumeInfo);
		SourceFileDumper dumpGeneratedComputationalService = new SourceFileDumper();
		dumpGeneratedComputationalService.dumpCompilationUnit(generatedCU);
	}

	public void generateImplComputationalService_ComputationalServiceCompiler() {
		JavaFrameworkFromST generatedComputationalService = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generatedComputationalService
				.generateImplComputationalService(computationalService);
		SourceFileDumper dumpGeneratedComputationalService = new SourceFileDumper();
		dumpGeneratedComputationalService.dumpCompilationUnit(generatedCU);
	}
}