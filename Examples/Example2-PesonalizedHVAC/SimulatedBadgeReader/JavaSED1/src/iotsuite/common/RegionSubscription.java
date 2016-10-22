package iotsuite.common;

import java.util.ArrayList;
import java.util.List;

public class RegionSubscription {

	public static List<String> getSubscriptionString(String partitionAttrVal,
			List<String> regionLabelArray) {

		List<String> regionLabel = new ArrayList<String>();

		int i = HierarchicalRegion.getPartitionIndex(partitionAttrVal,
				regionLabelArray);

		for (int j = 0; j < regionLabelArray.size(); j++) {

			if (j <= i) {
				regionLabel.add(regionLabelArray.get(j));

			} else {
				regionLabel.add("any");
			}

		}

		return regionLabel;

	}

	public static List<String> getSubscriptionRequest(String partitionAttrVal,
			List<String> regionLabel, List<String> regionID) {

		List<String> regionIDsList = new ArrayList<String>();

		// Get all RegionLabel
		List<String> regionLabels = regionLabel;

		// Get all RegionIDs
		List<String> regionIDs = regionID;

		// get SubscriprionString
		List<String> subscriptionRegionLabels = getSubscriptionString(
				partitionAttrVal, regionLabels);

		for (int i = 0; i < subscriptionRegionLabels.size(); i++) {

			if (!subscriptionRegionLabels.get(i).equals("any")) {
				regionIDsList.add(regionIDs.get(i));
			} else {
				regionIDsList.add("*");
			}
		}

		return regionIDsList;

	}

}
