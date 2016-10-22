package iotsuite.pubsubmiddleware;

import java.util.List;

import iotsuite.semanticmodel.Device;

public interface IoTSuiteMiddleware {

	public abstract void publish(String topicName, Object arg, Device deviceInfo);

	public abstract void subscribe(Subscriber s, String topicName,
			List<String> regionInfo);

}
