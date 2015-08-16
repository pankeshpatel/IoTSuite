package iotsuite.parser;

import iotsuite.codegenerator.GenFiller;
import iotsuite.common.GlobalVariable;
import iotsuite.compiler.LinkerCompiler;
import iotsuite.compiler.MapperCompiler;
import iotsuite.semanticmodel.DeploymentScope;
import iotsuite.semanticmodel.Device;

import java.io.IOException;
import java.util.List;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

public class Main {

	public static void main(String[] args) throws Exception {
		
		
	//Main main = new Main();

		if (GlobalVariable.DEVELOPMENT_METHODOLOGY) {

			/*
			 * GlobalVariable.vocabSpec = args[0]; GlobalVariable.archSpec =
			 * args[1]; GlobalVariable.deploymentSpec = args[2];
			 * GlobalVariable.stringTemplatePath = args[3];
			 * GlobalVariable.activity = args[4]; GlobalVariable.templatePath =
			 * args[5];
			 */

			/*
			 * The following code generates code in the following sequence and
			 * corresponding invoked Java class (1) Region => RegionCompiler (2)
			 * Structure => StructCompiler (3) Sensor => SensorCompiler (4)
			 * Actuator => ActuatorCompiler (5) Storage, => StorageCompiler (6)
			 * User Interface => UserInterfaceCompiler // for future extension
			 */

			GlobalVariable.activity = args[0];
			GlobalVariable.templatePath = args[1];

			if (GlobalVariable.activity
					.equals(GlobalVariable.ACTIVITY_GENERATE_DEVICEDRIVER)) {

				ANTLRFileStream vocStream = new ANTLRFileStream(
						GlobalVariable.vocabSpec);
				VocabSpecLexer vocLexer = new VocabSpecLexer(vocStream);
				CommonTokenStream vocTokens = new CommonTokenStream(vocLexer);
				VocabSpecParser vocParser = new VocabSpecParser(vocTokens);
				vocParser.vocabSpec();	
				
				// User Interaction
				
			/*	ANTLRFileStream interactionStream = new ANTLRFileStream(GlobalVariable.interactionSpec);
				InteractionSpecLexer  interactionLexer = new InteractionSpecLexer(interactionStream);
				CommonTokenStream interactionTokens = new CommonTokenStream(interactionLexer);
                InteractionSpecParser  interactionParser = new InteractionSpecParser(interactionTokens);
                interactionParser.interactionSpec();*/				
			    GenFiller.copyDeviceDrivers();		
			
			}
			
			if (GlobalVariable.activity
					.equals(GlobalVariable.ACTIVITY_GENERATE_USERINTERACTION)) {
				
				ANTLRFileStream vocStream = new ANTLRFileStream(
						GlobalVariable.vocabSpec);
				VocabSpecLexer vocLexer = new VocabSpecLexer(vocStream);
				CommonTokenStream vocTokens = new CommonTokenStream(vocLexer);
				VocabSpecParser vocParser = new VocabSpecParser(vocTokens);
				vocParser.vocabSpec();
				
				ANTLRFileStream interactionStream = new ANTLRFileStream(GlobalVariable.interactionSpec);
				InteractionSpecLexer  interactionLexer = new InteractionSpecLexer(interactionStream);
				CommonTokenStream interactionTokens = new CommonTokenStream(interactionLexer);
                InteractionSpecParser  interactionParser = new InteractionSpecParser(interactionTokens);
                interactionParser.interactionSpec();				
			    GenFiller.copyDeviceDrivers();		
			
			}

			if (GlobalVariable.activity
					.equals(GlobalVariable.ACTIVITY_GENERATE_ARCHITECTUREFRAMEWORK)) {

				ANTLRFileStream vocStream = new ANTLRFileStream(
						GlobalVariable.vocabSpec);
				VocabSpecLexer vocLexer = new VocabSpecLexer(vocStream);
				CommonTokenStream vocTokens = new CommonTokenStream(vocLexer);
				VocabSpecParser vocParser = new VocabSpecParser(vocTokens);
				vocParser.vocabSpec();

				ANTLRFileStream archStream = new ANTLRFileStream(
						GlobalVariable.archSpec);
				ArchSpecLexer archLexer = new ArchSpecLexer(archStream);
				CommonTokenStream archTokens = new CommonTokenStream(archLexer);
				ArchSpecParser archParser = new ArchSpecParser(archTokens);
				archParser.archSpec();

				GenFiller.copyApplicationLogic();

			}

			if (GlobalVariable.activity
					.equals(GlobalVariable.ACTIVITY_GENERATE_MAPPING)) {

				
				ANTLRFileStream vocStream = new ANTLRFileStream(
						GlobalVariable.vocabSpec);
				VocabSpecLexer vocLexer = new VocabSpecLexer(vocStream);
				CommonTokenStream vocTokens = new CommonTokenStream(vocLexer);
				VocabSpecParser vocParser = new VocabSpecParser(vocTokens);
				vocParser.vocabSpec();

				ANTLRFileStream archStream = new ANTLRFileStream(
						GlobalVariable.archSpec);
				ArchSpecLexer archLexer = new ArchSpecLexer(archStream);
				CommonTokenStream archTokens = new CommonTokenStream(archLexer);
				ArchSpecParser archParser = new ArchSpecParser(archTokens);
				archParser.archSpec();

				List<Device> deviceList;
				List<DeploymentScope> mappingConstraintList;

				mappingConstraintList = SymbolTable
						.getDeploymentConstrainsList();

				ANTLRFileStream deploymentStream = new ANTLRFileStream(
						GlobalVariable.deploymentSpec);
				NetworkSpecLexer deploymentLexer = new NetworkSpecLexer(
						deploymentStream);
				CommonTokenStream deploymentTokens = new CommonTokenStream(
						deploymentLexer);
				NetworkSpecParser deploymentParser = new NetworkSpecParser(
						deploymentTokens);
				deploymentParser.networkspec();
				deviceList = SymbolTable.getDeviceList();
				
				
			

				MapperCompiler.mappingFileGenerator(deviceList,
						mappingConstraintList);
				//System.out.println("I am in Mapping Acitivity");
				LinkerCompiler.linkerAlgo();
				GenFiller.copyLinking();
				GenFiller.copyMapping();
			
			

			}

			
			/*if (GlobalVariable.activity
					.equals(GlobalVariable.ACTIVITY_GENERATE_LINKING)) {

				LinkerCompiler.linkerAlgo();
				GenFiller.copyLinking();
			}*/
			

		} else {

			GlobalVariable.vocabSpec = args[0];
			GlobalVariable.archSpec = args[1];
			GlobalVariable.deploymentSpec = args[2];
			GlobalVariable.stringTemplatePath = args[3];
			GlobalVariable.templatePath = args[4];
			GlobalVariable.frameworkRootDir = GlobalVariable.templatePath;

			List<Device> deviceList;
			List<DeploymentScope> mappingConstraintList;
			ANTLRFileStream vocStream = new ANTLRFileStream(
					GlobalVariable.vocabSpec);
			VocabSpecLexer vocLexer = new VocabSpecLexer(vocStream);
			CommonTokenStream vocTokens = new CommonTokenStream(vocLexer);
			VocabSpecParser vocParser = new VocabSpecParser(vocTokens);
			vocParser.vocabSpec();

			ANTLRFileStream archStream = new ANTLRFileStream(
					GlobalVariable.archSpec);
			ArchSpecLexer archLexer = new ArchSpecLexer(archStream);
			CommonTokenStream archTokens = new CommonTokenStream(archLexer);
			ArchSpecParser archParser = new ArchSpecParser(archTokens);
			archParser.archSpec();

			mappingConstraintList = SymbolTable.getDeploymentConstrainsList();

			ANTLRFileStream deploymentStream = new ANTLRFileStream(
					GlobalVariable.deploymentSpec);
			NetworkSpecLexer networkLexer = new NetworkSpecLexer(
					deploymentStream);
			CommonTokenStream networkTokens = new CommonTokenStream(
					networkLexer);
			NetworkSpecParser networkParser = new NetworkSpecParser(
					networkTokens);
			networkParser.networkspec();
			deviceList = SymbolTable.getDeviceList();

			MapperCompiler.mappingFileGenerator(deviceList,
					mappingConstraintList);

		}

	}
	
	/*public  void linker()
	{
	if (GlobalVariable.activity
			.equals(GlobalVariable.ACTIVITY_GENERATE_LINKING)) {

		System.out.println("I am in Linker");
		LinkerCompiler.linkerAlgo();
		GenFiller.copyLinking();
		
	}
	}*/
	
	
	
}
