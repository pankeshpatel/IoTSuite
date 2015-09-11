package iotsuite.compiler;

import iotsuite.codegenerator.CompilationUnit;
import iotsuite.codegenerator.JavaFrameworkFromST;
import iotsuite.codegenerator.SourceFileDumper;
import iotsuite.semanticmodel.PrimitiveType;
import iotsuite.semanticmodel.StructField;
import iotsuite.semanticmodel.Struct;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

public class StructCompiler {

	// HashMap<String,List<String>> map = new HashMap<String,List<String>>();
	private Struct createdStructure;
	private List<StructField> StructFieldSet = new ArrayList<StructField>();
	private String structName;

	public StructCompiler() {
	}

	public StructCompiler(String structName) {
		this.structName = structName;
		createdStructure = new Struct(structName, getStructFieldSet());

	}

	public void addField(String fieldName, String fieldType) {

		// List<String> StructFieldList = new ArrayList<String>();

		StructField Field = new StructField(fieldName, new PrimitiveType(
				fieldType));
		StructFieldSet.add(Field);

	}

	public List<StructField> getStructFieldSet() {

		return StructFieldSet;
	}

	public String getStructName() {

		return structName;
	}

	public void generateStructureCode() {

		JavaFrameworkFromST generatedStruct = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generatedStruct
				.generateDataStructure(createdStructure);
		SourceFileDumper dumpGeneratedStruct = new SourceFileDumper();
		dumpGeneratedStruct.dumpCompilationUnit(generatedCU);
	}

}
