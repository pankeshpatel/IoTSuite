package iotsuite.android.localmiddleware;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

import com.google.gson.JsonObject;


public class PubSubsSensingFramework {

	private Map<String, Set<IDataListener>> subscriberMap = new Hashtable<String, Set<IDataListener>>();

	static PubSubsSensingFramework singletonInstance;

	public static PubSubsSensingFramework getInstance() {

		if (singletonInstance == null) {
			singletonInstance = new PubSubsSensingFramework();
		}

		return singletonInstance;

	}

	/*
	 * Data consumer implements this interface.
	 */

	public void registerForSensorData(IDataListener s, String eventSignature) {

		registerNewSubscriber(s, eventSignature);
	}

	private void registerNewSubscriber(IDataListener s, String eSig) {

		// create Map by EventName

		if (subscriberMap.containsKey(eSig)) {

			Set<IDataListener> tempSet = subscriberMap.get(eSig);
			tempSet.add(s);
		} else {
			Set<IDataListener> newSet = new HashSet<IDataListener>();
			newSet.add(s);
			subscriberMap.put(eSig, newSet);

		}

		System.out.println(subscriberMap);

	}

	/*
	 * Data producer implements this interface.
	 */

	//public void publish(String eventName, JsonObject dataEvent) {
	public void publish(String eventName, Object data) {
		
		System.out.println("I am in SetTemp Function");


		Set<IDataListener> subscriberEventSet = getSubscribersForEvent(eventName);

		if (subscriberEventSet != null) {
			for (IDataListener s : subscriberEventSet) {
				//s.onDataReceived(eventName, dataEvent);
				s.onDataReceived(eventName, data);
			}
		}

	}

	private Set<IDataListener> getSubscribersForEvent(String eventName) {

		return subscriberMap.get(eventName);
	}

}
