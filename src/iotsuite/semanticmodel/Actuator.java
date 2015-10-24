package iotsuite.semanticmodel;

import iotsuite.common.GlobalVariable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Actuator extends SoftwareComponent<Information> {

	private Set<Action> actions = new HashSet<Action>();
	public static List<String> fieldName = new ArrayList<String>();

	// public Actuator(String name, Set<Action> actionsList, Set<Attribute>
	// attributes, Set<Information> generateInfo, Set<Information> consumeInfo)
	// {
	public Actuator(String name, Set<Action> actionsList,
			Set<Information> generateInfo, Set<Information> consumeInfo,
			List<String> fieldName) {
		// super(name, attributes, generateInfo, consumeInfo, "NoInstance");
		super(name, generateInfo, consumeInfo, "NoInstance");
		this.actions = actionsList;
		Actuator.fieldName = fieldName;

	}

	public List<String> getAllFieldName() {

		return fieldName;
	}

	public Set<Action> getActions() {

		return actions;
	}

	public List<Action> getAllActions() {
		ArrayList<Action> allGeneratedInfo = new ArrayList<Action>();
		allGeneratedInfo.addAll(getActions());

		return allGeneratedInfo;
	}

	private String packageName;

	public String getPackageName() {
		packageName = GlobalVariable
				.convertPathTopackage(GlobalVariable.frameworkDirPath);
		return packageName;
	}

	public String getLogicPackageName() {
		packageName = GlobalVariable
				.convertPathTopackage(GlobalVariable.logicDirPath);
		return packageName;
	}

	public String getFactoryPackageName() {

		packageName = GlobalVariable
				.convertPathTopackage(GlobalVariable.factoryDirPath);
		return packageName;

	}

	public String getFactoryDeviceImplActuator() {
		packageName = GlobalVariable
				.convertPathTopackage(GlobalVariable.deviceImplDirPath);

		return packageName;

	}

}
