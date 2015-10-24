package iotsuite.compiler;

import iotsuite.common.GlobalVariable;
import iotsuite.semanticmodel.PrimitiveType;
import iotsuite.semanticmodel.RegionField;
import iotsuite.semanticmodel.Region;

import java.util.ArrayList;
import java.util.List;

public class RegionCompiler {

	private List<RegionField> regions = new ArrayList<RegionField>();
	private Region region;

	public RegionCompiler() {
		region = new Region(getRegionType());
	}

	public void addRegion(String regionLabel, String regionType) {
		RegionField Field = new RegionField(regionLabel, new PrimitiveType(
				regionType));
		regions.add(Field);

	}

	private List<RegionField> getRegionType() {
		return regions;
	}

	public void generateRegionCode() {

		// Region region = new Region(getRegionType());

		if (GlobalVariable.activity
				.equals(GlobalVariable.ACTIVITY_GENERATE_DEVICEDRIVER)) {
			// generateRegionCode_RegionCompiler(region, "RegionID");
			// generateRegionCode_RegionCompiler(region, "RegionLabel");
			// generateRegionCode_RegionCompiler(region, "DSConvert");

		}
	}

	/*
	 * private void generateRegionCode_RegionCompiler(Region region, String
	 * className) {
	 * 
	 * JavaFrameworkFromST generatedRegion = new JavaFrameworkFromST();
	 * CompilationUnit generatedCU =
	 * generatedRegion.buildAbstractClassOFRegion(region, className);
	 * SourceFileDumper dumpGeneratedRegion = new SourceFileDumper();
	 * dumpGeneratedRegion.dumpCompilationUnit(generatedCU);
	 * 
	 * }
	 */

}
