package iotsuite.parser;

import iotsuite.codegenerator.GenFiller;
import iotsuite.common.GlobalVariable;
import iotsuite.compiler.LinkerCompiler;
import iotsuite.compiler.MapperCompiler;
import iotsuite.semanticmodel.DeploymentScope;
import iotsuite.semanticmodel.Device;

import java.util.List;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;

public class Main {

	public static void main(String[] args) throws Exception {

		if (GlobalVariable.DEVELOPMENT_METHODOLOGY) {

			GlobalVariable.vocabSpec = args[0];
			GlobalVariable.archSpec = args[1];
			GlobalVariable.deploymentSpec = args[2];
			GlobalVariable.stringTemplatePath = args[3];
			GlobalVariable.activity = args[4];
			GlobalVariable.templatePath = args[5]; 

			/*
			 * The following code generates code in the following sequence and
			 * corresponding invoked Java class (1) Region => RegionCompiler (2)
			 * Structure => StructCompiler (3) Sensor => SensorCompiler (4)
			 * Actuator => ActuatorCompiler (5) Storage, => StorageCompiler (6)
			 * User Interface => UserInterfaceCompiler // for future extension
			 */

			if (GlobalVariable.activity.equals(GlobalVariable.ACTIVITY_GENERATE_DEVICEDRIVER)) {

				//GlobalVariable.frameworkRootDir = args[5]; // Directory path, where the template is placed.
				
				ANTLRFileStream vocStream = new ANTLRFileStream(GlobalVariable.vocabSpec);
				VocabSpecLexer vocLexer = new VocabSpecLexer(vocStream);
				CommonTokenStream vocTokens = new CommonTokenStream(vocLexer);
				VocabSpecParser vocParser = new VocabSpecParser(vocTokens);
				vocParser.vocabSpec();

				GenFiller.copyDeviceDrivers();
			}

			if (GlobalVariable.activity.equals(GlobalVariable.ACTIVITY_GENERATE_ARCHITECTUREFRAMEWORK)) {

				//GlobalVariable.frameworkRootDir = args[5];

				ANTLRFileStream vocStream = new ANTLRFileStream(GlobalVariable.vocabSpec);
				VocabSpecLexer vocLexer = new VocabSpecLexer(vocStream);
				CommonTokenStream vocTokens = new CommonTokenStream(vocLexer);
				VocabSpecParser vocParser = new VocabSpecParser(vocTokens);
				vocParser.vocabSpec();

				ANTLRFileStream archStream = new ANTLRFileStream(GlobalVariable.archSpec);
				ArchSpecLexer archLexer = new ArchSpecLexer(archStream);
				CommonTokenStream archTokens = new CommonTokenStream(archLexer);
				ArchSpecParser archParser = new ArchSpecParser(archTokens);
				archParser.archSpec();

				GenFiller.copyApplicationLogic();

			}

			if (GlobalVariable.activity.equals(GlobalVariable.ACTIVITY_GENERATE_MAPPING)) {

				//GlobalVariable.frameworkRootDir = args[5];

				ANTLRFileStream vocStream = new ANTLRFileStream(GlobalVariable.vocabSpec);
				VocabSpecLexer vocLexer = new VocabSpecLexer(vocStream);
				CommonTokenStream vocTokens = new CommonTokenStream(vocLexer);
				VocabSpecParser vocParser = new VocabSpecParser(vocTokens);
				vocParser.vocabSpec();

				ANTLRFileStream archStream = new ANTLRFileStream(GlobalVariable.archSpec);
				ArchSpecLexer archLexer = new ArchSpecLexer(archStream);
				CommonTokenStream archTokens = new CommonTokenStream(archLexer);
				ArchSpecParser archParser = new ArchSpecParser(archTokens);
				archParser.archSpec();

				List<Device> deviceList;
				List<DeploymentScope> mappingConstraintList;

				mappingConstraintList = SymbolTable.getDeploymentConstrainsList();

				ANTLRFileStream deploymentStream = new ANTLRFileStream(GlobalVariable.deploymentSpec);
				NetworkSpecLexer deploymentLexer = new NetworkSpecLexer(deploymentStream);
				CommonTokenStream deploymentTokens = new CommonTokenStream(deploymentLexer);
				NetworkSpecParser deploymentParser = new NetworkSpecParser(deploymentTokens);
				deploymentParser.networkspec();
				deviceList = SymbolTable.getDeviceList();
				

				MapperCompiler.mappingFileGenerator(deviceList, mappingConstraintList);
				GenFiller.copyMapping();

			}

			if (GlobalVariable.activity.equals(GlobalVariable.ACTIVITY_GENERATE_LINKING)) {

				//GlobalVariable.frameworkRootDir = args[5];
				LinkerCompiler.linkerAlgo();
				GenFiller.copyLinking();
			}

		} else {

			GlobalVariable.vocabSpec = args[0];
			GlobalVariable.archSpec = args[1];
			GlobalVariable.deploymentSpec = args[2];
			GlobalVariable.stringTemplatePath = args[3];
			GlobalVariable.templatePath = args[4];
			GlobalVariable.frameworkRootDir = GlobalVariable.templatePath;

			List<Device> deviceList;
			List<DeploymentScope> mappingConstraintList;
			ANTLRFileStream vocStream = new ANTLRFileStream(GlobalVariable.vocabSpec);
			VocabSpecLexer vocLexer = new VocabSpecLexer(vocStream);
			CommonTokenStream vocTokens = new CommonTokenStream(vocLexer);
			VocabSpecParser vocParser = new VocabSpecParser(vocTokens);
			vocParser.vocabSpec();

			ANTLRFileStream archStream = new ANTLRFileStream(GlobalVariable.archSpec);
			ArchSpecLexer archLexer = new ArchSpecLexer(archStream);
			CommonTokenStream archTokens = new CommonTokenStream(archLexer);
			ArchSpecParser archParser = new ArchSpecParser(archTokens);
			archParser.archSpec();

			mappingConstraintList = SymbolTable.getDeploymentConstrainsList();

			ANTLRFileStream deploymentStream = new ANTLRFileStream(GlobalVariable.deploymentSpec);
			NetworkSpecLexer networkLexer = new NetworkSpecLexer(deploymentStream);
			CommonTokenStream networkTokens = new CommonTokenStream(networkLexer);
			NetworkSpecParser networkParser = new NetworkSpecParser(networkTokens);
			networkParser.networkspec();
			deviceList = SymbolTable.getDeviceList();

			MapperCompiler.mappingFileGenerator(deviceList, mappingConstraintList);

		}

	}
}
