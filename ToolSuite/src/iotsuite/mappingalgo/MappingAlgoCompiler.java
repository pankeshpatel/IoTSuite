package iotsuite.mappingalgo;

import iotsuite.semanticmodel.DeploymentScope;
import iotsuite.semanticmodel.Device;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class MappingAlgoCompiler {

		
	private static int j;
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
	public static Map<Device, Set<String>> mapTasks(List<Device> deviceList,
			List<DeploymentScope> mappingConstraintList) {
		
		List<Device>  tempDeviceList = new ArrayList<Device>();
		List<String>  tempSoftwareComponentList = new ArrayList<String>();
		Set<String>  tempSoftwareComponentName = new HashSet<String>();
		final Map<Device, Set<String>> finalMapping = new HashMap<Device, Set<String>>();
		
		
		for (Device deviceObj : deviceList) {
			//if(deviceObj.getAbilities().isEmpty()){
				tempDeviceList.add(deviceObj);			
			//}	
		}
		
		for (DeploymentScope mc : mappingConstraintList){
			
			tempSoftwareComponentList.add(mc.getSoftwareComponentName());	
			
		}
		
		/*for (DeploymentScope mc : mappingConstraintList){
			
			tempSoftwareComponentName.add(mc.getSoftwareComponentName());
			
		}*/
		
		
		for(int i = 0 ; i<tempDeviceList.size(); i++){
			
			if(tempDeviceList.get(i).getAbilities().isEmpty()){
			
			Set<String> tempsc = new HashSet<String>();
			tempsc.add(tempSoftwareComponentList.get(j));			
			finalMapping.put(tempDeviceList.get(i),tempsc);
			j++;
			}
			else{
								
				finalMapping.put(tempDeviceList.get(i), tempDeviceList.get(i).getAbilities());
			}
			
		}
		
		
		
		

	/*	Map<String, Set<Device>> deviceListByRegion = new HashMap<String, Set<Device>>();
		Set<String> regionLabelSet = new HashSet<String>();

		// Construct regionLabelSet --- O/p: [Building, Floor, Room]
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
				regionMap.get(setOfRegionLabels.get(i)).add(
						setOfRegionIDs.get(j));

			}

		}
	

		final Map<Device, Set<String>> finalMapping = new HashMap<Device, Set<String>>();

		for (Device d : deviceList) {
			finalMapping.put(d, new HashSet<String>());
		}

		for (String regionLabel : regionMap.keySet()) {
			for (DeploymentScope mc : mappingConstraintList) {

				if (regionLabel.equals(mc.getAttributeValue())) {

					String tempSoftWareComponent = mc
							.getSoftwareComponentName();

					String[] tempkey = regionMap.get(regionLabel).toArray(
							new String[regionMap.get(regionLabel).size()]);

					for (int i = 0; i < tempkey.length; i++) {

						if (tempkey[i] != null) {
							Set<Device> tempDeviceSet = deviceListByRegion
									.get(tempkey[i]);
							Device selectedDevice = pickOneFrom(tempDeviceSet);

							finalMapping.get(selectedDevice).add(
									tempSoftWareComponent);
							

						}
					}

				}

			}
		}*/
		
		//System.out.println(finalMapping);
		return finalMapping;

		//return finalMapping;

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

}
