package iotsuite.semanticmodel;

import iotsuite.common.GlobalVariable;

import java.util.ArrayList;
import java.util.List;

public class Region {

	private List<RegionField> fields = new ArrayList<RegionField>();

	public Region(List<RegionField> fields) {
		this.fields = fields;

	}

	private List<RegionField> getFields() {
		return fields;

	}

	public List<RegionField> getAllRegions() {
		ArrayList<RegionField> allregionFields = new ArrayList<RegionField>();
		allregionFields.addAll(getFields());
		return allregionFields;
	}

	private String packageName;

	public String getPackageName() {
		packageName = GlobalVariable
				.convertPathTopackage(GlobalVariable.utilDirPath);
		return packageName;
	}

}
