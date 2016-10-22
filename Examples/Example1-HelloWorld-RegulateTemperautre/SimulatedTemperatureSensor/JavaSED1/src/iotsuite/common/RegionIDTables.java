package iotsuite.common;

import java.util.ArrayList;
import java.util.List;

public class RegionIDTables {

	public List<String> getRegionIDField(int i, List<String> regionIDList) {

		// clone the list first
		List<String> myRegioList = new ArrayList<String>(regionIDList.size());
		for (String tempString : regionIDList)
			myRegioList.add(tempString);

		for (int j = myRegioList.size() - 1; i > 0; j--, i--) {
			myRegioList.set(j, "*");

		}

		return myRegioList;

	}

}
