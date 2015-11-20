package iotsuite.pubsubmiddleware;

import iotsuite.semanticmodel.Device;

public interface CommandListener {
	public Object commandReceived(String methodName, Object arg,
			Device deviceInfo);
}
