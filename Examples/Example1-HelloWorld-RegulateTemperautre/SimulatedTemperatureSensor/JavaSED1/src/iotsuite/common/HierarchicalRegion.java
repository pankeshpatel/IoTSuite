package iotsuite.common;

import java.util.List;

public class HierarchicalRegion {

	public static int getPartitionIndex(String partionAttrVal,
			List<String> regionLabelArray) {

		for (int i = 0; i <= regionLabelArray.size(); i++) {

			if (regionLabelArray.get(i).equals(partionAttrVal)) {
				return i;
			}
		}
		return -1;
	}
}
