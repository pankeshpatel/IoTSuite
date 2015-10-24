package iotsuite.semanticmodel;

import iotsuite.common.GlobalVariable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Device implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	// private String id;
	private String type;
	private String networkAddress;

	private List<String> regionIDs = new ArrayList<String>();
	private List<String> regionLabels = new ArrayList<String>();

	private Set<String> abilities = new HashSet<String>();

	private String myMobileFlag;

	private String myProtocol;

	public Device(String name, String type, String networkAddress,
			List<String> regionIDs, List<String> regionLabels,
			Set<String> abilities, String mobileFlag, String protocol) {

		this.name = name;

		this.type = type;
		this.networkAddress = networkAddress;
		this.regionIDs = regionIDs;
		this.regionLabels = regionLabels;
		this.abilities = abilities;
		this.myMobileFlag = mobileFlag;
		this.myProtocol = protocol;

	}

	public String getProtocol() {
		return myProtocol;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public String getNetworkAddress() {
		return networkAddress;
	}

	public List<String> getRegionLabels() {
		// System.out.println("Region labels are "+
		// regionLabels+"in Device.java file");
		return regionLabels;
	}

	public List<String> getRegion() {

		// System.out.println("Value of region is"+regionIDs+"In Device.java file");
		return regionIDs;
	}

	public Set<String> getAbilities() {
		return abilities;
	}

	public String getMobileFlag() {
		return myMobileFlag;
	}

	private String packageName;

	public String getPackageName() {
		packageName = GlobalVariable
				.convertPathTopackage(GlobalVariable.deviceDirPath) + getName();
		return packageName;
	}

	public String getLogicPackageName() {
		packageName = GlobalVariable
				.convertPathTopackage(GlobalVariable.logicDirPath);
		return packageName;
	}

	public String getUtilPackageName() {
		packageName = GlobalVariable
				.convertPathTopackage(GlobalVariable.utilDirPath);
		return packageName;
	}

}
