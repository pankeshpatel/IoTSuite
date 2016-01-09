package iotsuite.pubsubmiddleware;

public interface Subscriber {

	public abstract void notifyReceived(String eventName, Object arg);

}
