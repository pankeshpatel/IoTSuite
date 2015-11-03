package iotsuite.codegenerator;

import iotsuite.semanticmodel.Device;

import org.antlr.stringtemplate.StringTemplate;

public class CompilationUnit {

	private final String fileNameToGenerate;
	private final StringTemplate stringTemplateName;
	private final String fileCategory;

	private final String objectName;
	private Object objClass;

	public CompilationUnit(String fileNameToGenerate, StringTemplate template,
			String type, String objectName, Object obj) {
		super();
		this.fileNameToGenerate = fileNameToGenerate;
		this.stringTemplateName = template;
		this.fileCategory = type;
		this.objectName = objectName;
		this.objClass = obj;
	}

	public Device getObjectClass() {
		return (Device) objClass;
	}

	public String getObjectName() {
		return objectName;
	}

	public String getFileCategory() {
		return fileCategory;
	}

	public String getFileNameToGenerate() {
		return fileNameToGenerate;
	}

	public String getStringTemplateName() {
		return stringTemplateName.toString();
	}

}
