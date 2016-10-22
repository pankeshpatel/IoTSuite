package iotsuite.pubsubmiddleware;

import iotsuite.semanticmodel.Device;

public class IoTSuiteFactory {

	static Object singletonInstance;

	public static Object getInstance(String middlewareName, Device device,
			Object context) {

		if (middlewareName.equals("mqtt")) {

			if (singletonInstance == null) {
				singletonInstance = new PubSubMiddleware(device.getType(),
						device.getName(), context);
			}
			return singletonInstance;
		}

		return null;
	}

}
