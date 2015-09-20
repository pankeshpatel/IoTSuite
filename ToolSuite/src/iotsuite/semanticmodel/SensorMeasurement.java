package iotsuite.semanticmodel;

import iotsuite.common.GlobalVariable;
import iotsuite.compiler.StructCompiler;

public class SensorMeasurement extends Information {

	public StructCompiler data;

	public SensorMeasurement(String name, DataType type, StructCompiler data) {
		super(name, type);
		this.data = data;
	//	System.out.println(" Type is " +type);
	}

	public DataType getDataType() {
		return type;
	}

	private String packageName;

	public String getPackageName() {

		packageName = GlobalVariable
				.convertPathTopackage(GlobalVariable.frameworkDirPath);
		return packageName;
	}

}