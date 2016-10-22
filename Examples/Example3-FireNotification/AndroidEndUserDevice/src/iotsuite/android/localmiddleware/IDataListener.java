package iotsuite.android.localmiddleware;



public interface IDataListener {
	//public abstract void onDataReceived(String eventName, JsonObject dataEvent);
	public abstract void onDataReceived(String eventName, Object data);

}
