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
	
	public static Map<String, Set<String>> mappingOutputForLinker = new HashMap<String, Set<String>>();
	//public static Map<String, Set<String>> mappingOutputWithoutAbilitiesForLinker = new HashMap<String, Set<String>>();


	
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
				tempsc.add("false");
				finalMapping.put(tempDeviceList.get(i), tempsc);
				mappingOutputForLinker.put(tempDeviceList.get(i).getName(), tempsc);
				j++;
			} else {

				finalMapping.put(tempDeviceList.get(i), tempDeviceList.get(i).getAbilities());
				Set<String> tempSoftwareComponentWithAbilities  = new HashSet<String>();
				tempSoftwareComponentWithAbilities.addAll(tempDeviceList.get(i).getAbilities());
				tempSoftwareComponentWithAbilities.add("true");
				mappingOutputForLinker.put(tempDeviceList.get(i).getName(), tempSoftwareComponentWithAbilities );
			}
		}
		
		System.out.println(mappingOutputForLinker);
		return finalMapping;
	}

}
