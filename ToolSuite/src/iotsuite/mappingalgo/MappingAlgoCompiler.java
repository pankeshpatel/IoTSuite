package iotsuite.mappingalgo;

import iotsuite.semanticmodel.DeploymentScope;
import iotsuite.semanticmodel.Device;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MappingAlgoCompiler {

	/**
	 * 
	 * @param deviceList
	 *            : This is a List of devices, which are fetched from Network
	 *            Description File
	 * @param mappingConstraintList
	 *            : This is a list of mapping Constraints, which are fetched
	 *            from Mapping constrainsts file
	 * @return Map<Device,Set<String>> : This is final mapping between devices
	 *         and software Components ( CS, Controller).
	 */
	public static Map<Device, Set<String>> mapTasks(List<Device> deviceList, List<DeploymentScope> mappingConstraintList) {

		Map<String, Set<Device>> deviceListByRegion = new HashMap<String, Set<Device>>();
		Set<String> regionLabelSet = new HashSet<String>();

		// Construct regionLabelSet --- O/p: [center, floor, room]
		for (Device deviceObj : deviceList) {
			regionLabelSet.addAll(deviceObj.getRegionLabels());
		}

		// --O/p : 21 (regionLabel) -> device List.
		for (Device deviceObj : deviceList) {

			List<String> setOfRegion = deviceObj.getRegion();

			for (String r : setOfRegion) {

				if (deviceListByRegion.containsKey(r)) {

					Set<Device> tempSet = deviceListByRegion.get(r);
					tempSet.add(deviceObj);

				} else {

					Set<Device> newSet = new HashSet<Device>();
					newSet.add(deviceObj);
					deviceListByRegion.put(r, newSet);
				}

			}

		}

		final Map<String, Set<String>> regionMap = new HashMap<String, Set<String>>();

		for (String regionLabel : regionLabelSet) {
			regionMap.put(regionLabel, new HashSet<String>());
		}

		for (Device deviceObj : deviceList) {

			List<String> setOfRegionLabels = deviceObj.getRegionLabels();
			List<String> setOfRegionIDs = deviceObj.getRegion();

			int i, j;
			for (i = 0, j = 0; i < setOfRegionLabels.size(); i++, j++) {

				regionMap.get(setOfRegionLabels.get(i)).add(setOfRegionIDs.get(j));

			}

		}

		final Map<Device, Set<String>> finalMapping = new HashMap<Device, Set<String>>();

		for (Device d : deviceList) {
			finalMapping.put(d, new HashSet<String>());
		}

		for (String regionLabel : regionMap.keySet()) {
			for (DeploymentScope mc : mappingConstraintList) {
				//
				// if (mc.getAttributeName().equals("deployment-instance")
				// && mc.getAttributeValue().equals("singleton")) {
				//
				// List<Device> selectedDeviceWithAbility =
				// pickDevicesWithAbilities(
				// "DBServer", deviceList);
				//
				// for (Device ds : selectedDeviceWithAbility) {
				//
				// String tempSoftwareComponent = mc
				// .getSoftwareComponentName();
				// finalMapping.get(ds).add(tempSoftwareComponent);
				//
				// }
				//
				// } else {

				if (regionLabel.equals(mc.getAttributeValue())) {

					String tempSoftWareComponent = mc.getSoftwareComponentName();

					// for (String regionID : regionMap.keySet()) {
					// Random selection

					String[] tempkey = regionMap.get(regionLabel).toArray(new String[regionMap.get(regionLabel).size()]);

					for (int i = 0; i < tempkey.length; i++) {

						if (tempkey[i] != null) {
							Set<Device> tempDeviceSet = deviceListByRegion.get(tempkey[i]);
							Device selectedDevice = pickOneFrom(tempDeviceSet);

							/*
							 * for (String ability :
							 * selectedDevice.getAbilities()) { if
							 * (ability.contains("GUI")) {
							 * 
							 * } else { finalMapping.get(selectedDevice).add(
							 * tempSoftWareComponent); }
							 * 
							 * }
							 */

							if (selectedDevice.getMobileFlag().equals("true")) {
								
								// Do not allocate any software component 
								// if the device mobileFlag = true (mobile device).

							} else {
								finalMapping.get(selectedDevice).add(tempSoftWareComponent);
							}

						}
					}

					// }
					// }

				}

			}
		}

		return finalMapping;

	}

	/**
	 * Pick an element from this set and return it. Picked uniformly at random.
	 * 
	 * @param set
	 *            The set to pick elements from
	 * @return the element that is picked
	 */
	private static Device pickOneFrom(Set<Device> set) {

		int size = set.size();

		// generate a random number in [0,1)
		double random = Math.random();

		// convert it to a number in [0,size)
		double scaledRandom = random * size;

		// floor that number
		int destinationIndex = (int) scaledRandom;

		// pick that item from the array version of the set and return it.
		return (Device) set.toArray()[destinationIndex];

	}

	/*private static List<Device> pickDevicesWithAbilities(String abilityName, List<Device> deviceList) {

		List<Device> deviceListWithAbility = new ArrayList<Device>();

		for (Device d : deviceList) {
			for (String ability : d.getAbilities()) {

				if (ability.equals(abilityName))
					deviceListWithAbility.add(d);
			}
		}

		return deviceListWithAbility;

	}*/

}
