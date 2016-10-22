package iotsuite.pubsubmiddleware;

import iotsuite.semanticmodel.Device;

public interface Subscriber {

	public abstract void notifyReceived(String eventName, Object arg,
			Device deviceInfo);
}
