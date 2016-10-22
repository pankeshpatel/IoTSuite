package iotsuite.common;

public class GlobalVariable {

	public static String vocabSpec;
	public static String archSpec;
	public static String deploymentSpec;

	public static String frameworkRootDir;

	public static String frameworkDirPath = "/framework";
	// public static String outputDirPath = "./gen";
	public static String outputDirPath = "/src";
	public static String logicDirPath = "/logic";
	public static String deviceDirPath = "/sim/device";
	public static String deviceDirPathA = "/com/example/android/";
	public static String utilDirPath = "/util";
	public static String factoryDirPath = "/factory";
	public static String deviceImplDirPath = "/deviceImpl";
	public static String stringTemplatePath;
	public static String activity;
	// public static String devicePCType = "/" + "DeviceDrivers" + "/" + "PC" +
	// "/";
	// public static String deviceJAVASEType = "/";
	public static String deviceJAVASEType = "JavaSE";
	public static String deviceAndroidType = "Android";
	// public static String deviceAndroidType = "/" + "DeviceDrivers" + "/" +
	// "Android" + "/";
	public static String deploymentFolderPath = "CodeForDeployment";
	// public static String androidDevicepath = "AndroidDNine";
	public static String templatePath;

	public static final String JAVASE_ENABLED_DEVICES = "JavaSE";
	public static final String ANDROID_ENABLED_DEVICES = "Android";

	public static final boolean ENABLE_JAVASE_CODE_GENERATATION = true;
	// Set false, if you do not want to generate JavaSE code

	public static final boolean ENABLE_ANDROID_CODE_GENERATION = true;
	// Set true, if you want to generate Android code

	public static final boolean DEVELOPMENT_METHODOLOGY = true;
	// set "yes" if you want to use development methodology

	public static final String ACTIVITY_GENERATE_DEVICEDRIVER = "dd";
	public static final String ACTIVITY_GENERATE_ARCHITECTUREFRAMEWORK = "af";
	public static final String ACTIVITY_GENERATE_MAPPING = "mapping";
	public static final String ACTIVITY_GENERATE_LINKING = "linking";

	public static String convertPathTopackage(String pathName) {

		String modifiedPathName;

		if (pathName.substring(0, 1).equals(".")
				|| pathName.substring(0, 1).equals(".")) {
			modifiedPathName = pathName.substring(2).replace("/", ".");
		} else {
			modifiedPathName = pathName.replace("/", ".").substring(1);
		}

		return modifiedPathName;
	}

}
