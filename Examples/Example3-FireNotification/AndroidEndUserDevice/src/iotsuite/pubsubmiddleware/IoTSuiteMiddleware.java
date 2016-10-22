package iotsuite.pubsubmiddleware;

import iotsuite.semanticmodel.Device;

import java.util.List;


public interface IoTSuiteMiddleware {	
	    
	public abstract void publish(String topicName, Object arg, Device deviceInfo);
	
	public abstract void subscribe(Subscriber s, String topicName, List<String> regionInfo);
	
}
