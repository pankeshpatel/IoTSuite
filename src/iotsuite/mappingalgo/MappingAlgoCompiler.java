package iotsuite.mappingalgo;

import iotsuite.semanticmodel.DeploymentScope;
import iotsuite.semanticmodel.Device;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

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

		List<Device> tempDeviceList = new ArrayList<Device>();
		List<String> tempSoftwareComponentList = new ArrayList<String>();
		final Map<Device, Set<String>> finalMapping = new HashMap<Device, Set<String>>();

		for (Device deviceObj : deviceList) {

			tempDeviceList.add(deviceObj);

		}

		for (DeploymentScope mc : mappingConstraintList) {

			tempSoftwareComponentList.add(mc.getSoftwareComponentName());

		}

		for (int i = 0; i < tempDeviceList.size(); i++) {

			if (tempDeviceList.get(i).getAbilities().isEmpty()) {

				Set<String> tempsc = new HashSet<String>();
				tempsc.add(tempSoftwareComponentList.get(j));
				finalMapping.put(tempDeviceList.get(i), tempsc);
				j++;
			} else {

				finalMapping.put(tempDeviceList.get(i), tempDeviceList.get(i)
						.getAbilities());
			}

		}
		return finalMapping;
	}

}
