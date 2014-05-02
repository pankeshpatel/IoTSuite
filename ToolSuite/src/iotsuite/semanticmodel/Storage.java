package iotsuite.semanticmodel;

import iotsuite.common.GlobalVariable;
//import iotsuite.compiler.Attribute;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Storage extends SoftwareComponent {

	private Set<DataAccess> dataAccess = new HashSet<DataAccess>();

	// public Storage(String name, Set<Attribute> attributes, Set<DataAccess>
	// dataAccess, Set<Information> consumeInfo) {
	public Storage(String name, Set<DataAccess> dataAccess, Set<Information> consumeInfo) {
		// super(name, attributes, null, null, "NoInstance");
		super(name, null, null, "NoInstance");

		this.dataAccess = dataAccess;

	}

	public Set<DataAccess> getDataAccess() {
		return dataAccess;
	}

	public List<DataAccess> getAllDataAccess() {
		ArrayList<DataAccess> allDataAccess = new ArrayList<DataAccess>();
		allDataAccess.addAll(getDataAccess());
		return allDataAccess;
	}

	private String packageName;

	public String getPackageName() {
		packageName = GlobalVariable.convertPathTopackage(GlobalVariable.frameworkDirPath);
		return packageName;
	}

	public String getLogicPackageName() {
		packageName = GlobalVariable.convertPathTopackage(GlobalVariable.logicDirPath);
		return packageName;
	}

	public String getFactoryPackageName() {
		packageName = GlobalVariable.convertPathTopackage(GlobalVariable.factoryDirPath);
		return packageName;
	}

	public String getDeviceImplPackageName() {

		packageName = GlobalVariable.convertPathTopackage(GlobalVariable.deviceImplDirPath);
		return packageName;
	}

}
