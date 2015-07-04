package iotsuite.compiler;

import iotsuite.parser.SymbolTable;
import iotsuite.semanticmodel.Device;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DeviceCompiler {

	private Device device;
	private Set<String> deviceAbilities = new HashSet<String>();
	private List<String> regionLabels = new ArrayList<String>();
	private List<String> regionValue = new ArrayList<String>();
	private String deviceType;
	private String networkAddress;
	private String deviceName;
	private String softwarePlatform;
	private List<Device> deviceList = new ArrayList<Device>();

	private String myMobileFlag;

	public DeviceCompiler() {
	}

	public void addDeviceObj() {
		device = new Device(getDeviceName(), getDeviceType(), getNetworkAddress(), getRegionValues(), getRegionLabel(), deviceAbilities, getMobileFlag());
		SymbolTable.addDeviceinSymblTable(device);
	}


	public void setMobileFlag(String mobileFlag) {
		this.myMobileFlag = mobileFlag;
	}

	public String getMobileFlag() {
		return myMobileFlag;
	}

	// Getter and Setter of Software Platform

	public void setSoftwarePlatform(String softwarePlatform) {
		this.softwarePlatform = softwarePlatform;
	}

	public String getSoftwarePlatform() {
		return softwarePlatform;
	}

	// Getter and Setter of DeviceName
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getDeviceName() {
		return deviceName;
	}

	// Getter and Setter of DeviceType

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	// Getter and Setter of NetworkAddress

	public String getNetworkAddress() {
		return networkAddress;
	}

	public void setNetworkAddress(String networkAddress) {
		this.networkAddress = networkAddress;
	}

	// Getter and Setter Region Type

	public void addRegionValue(String value) {
		regionValue.add(value);
	}

	public List<String> getRegionValues() {
		return regionValue;
	}

	// Getter and Setter of RegionLabels

	public void addRegionLabel(String regionLabel) {
		regionLabels.add(regionLabel);
	}

	public List<String> getRegionLabel() {
		return regionLabels;
	}

	// Getter and Setter of Device Abilities

	public void addDeviceAbilities(String deviceAbilitiesStr) {

		this.deviceAbilities.add(deviceAbilitiesStr);

	}

	public Set<String> getDeviceAbilities() {
		return deviceAbilities;
	}

	// Getter and setter Region Label

	public Device getDevice() {
		return device;
	}

	public List<String> getRegionLabels() {
		return regionLabels;
	}

	public List<String> getRegionValue() {
		return regionValue;
	}

	public List<Device> getDeviceList() {
		return deviceList;
	}

}
