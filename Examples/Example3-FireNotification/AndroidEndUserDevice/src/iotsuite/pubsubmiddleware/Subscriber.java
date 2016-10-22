package iotsuite.pubsubmiddleware;


public interface Subscriber {

	/*public abstract void notifyReceived(String eventName, Object arg,
			Device deviceInfo);*/
	
	public abstract void notifyReceived(String eventName, Object arg);
}


