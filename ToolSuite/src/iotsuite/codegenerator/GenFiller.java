package iotsuite.codegenerator;

import iotsuite.common.GlobalVariable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class GenFiller {

	public static void copyDeviceDrivers() {

		File srcFolder = new File(GlobalVariable.frameworkRootDir + "/"
				+ "DeviceDrivers");
		// Directory path, where the template is placed.em

		File destFolder = new File(GlobalVariable.templatePath
				+ "DeviceDrivers");
		// Directory where the development activity is performed

		copyFiles(srcFolder, destFolder);

	}

	public static void copyApplicationLogic() {

		File srcFolder = new File(GlobalVariable.frameworkRootDir + "/"
				+ "ApplicationLogic");
		File destFolder = new File(GlobalVariable.templatePath
				+ "ApplicationLogic");
		copyFiles(srcFolder, destFolder);

	}

	public static void copyMapping() {

		File srcFolder = new File(GlobalVariable.frameworkRootDir + "/"
				+ "CodeForDeployment");
		File destFolder = new File(GlobalVariable.templatePath
				+ "CodeForDeployment");
		copyFiles(srcFolder, destFolder);

	}

	public static void copyLinking() {

		File srcFolder = new File(GlobalVariable.frameworkRootDir + "/"
				+ "CodeForDeployment");
		File destFolder = new File(GlobalVariable.templatePath
				+ "CodeForDeployment");
		copyFiles(srcFolder, destFolder);

	}

	public static void copyFiles(File srcFolder, File destFolder) {
		// make sure source exists
		if (!srcFolder.exists()) {

			// just exit
			System.exit(0);

		} else {

			try {
				copyFolder(srcFolder, destFolder);
			} catch (IOException e) {
				e.printStackTrace();
				// error, just exit
				System.exit(0);
			}
		}

		// System.out.println("Done");

	}

	public static void copyFolder(File src, File dest) throws IOException {

		if (src.isDirectory()) {

			// if directory not exists, create it
			if (!dest.exists()) {
				dest.mkdir();
				// System.out.println("Directory copied from "
				// + src + "  to " + dest);
			}

			// list all the directory contents
			String files[] = src.list();

			for (String file : files) {
				// construct the src and dest file structure
				File srcFile = new File(src, file);
				File destFile = new File(dest, file);
				// recursive copy
				copyFolder(srcFile, destFile);
			}

		} else {
			// if file, then copy it
			// Use bytes stream to support all file types
			InputStream in = new FileInputStream(src);
			OutputStream out = new FileOutputStream(dest);

			byte[] buffer = new byte[1024];

			int length;
			// copy the file content in bytes
			while ((length = in.read(buffer)) > 0) {
				out.write(buffer, 0, length);
			}

			in.close();
			out.close();
			// System.out.println("File copied from " + src + " to " + dest);
		}
	}

}
