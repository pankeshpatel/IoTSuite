package iotsuite.common;

import java.util.Date;

/**
 * Utility class that logs events.
 * 
 * @author patel
 * 
 */
public class Logger {

	private static final String DELIMITER = " | ";

	/**
	 * Prints a nicely formatted log message
	 * 
	 * @param deviceId
	 *            The device from which the log is coming
	 * @param componentName
	 *            The component generating the log
	 * @param message
	 *            The message itself
	 */
	public static void log(String deviceId, String componentName, String message) {
		StringBuffer logMessage = new StringBuffer();

		logMessage.append(new Date());// start with today's date
		logMessage.append(DELIMITER);
		logMessage.append(Thread.currentThread().getId()); // this thread's ID
		logMessage.append(DELIMITER);
		logMessage.append(deviceId);// TODO add tabs along it?
		logMessage.append(DELIMITER);
		logMessage.append(componentName);
		logMessage.append(DELIMITER);
		logMessage.append(message);

		System.out.println(logMessage);
	}

}
