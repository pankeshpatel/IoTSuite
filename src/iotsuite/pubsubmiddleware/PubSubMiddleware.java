package iotsuite.pubsubmiddleware;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PubSubMiddleware {

	private Map<String, Set<Subscriber>> subscriberMap = new Hashtable<String, Set<Subscriber>>();
	/*private Map<String, Set<CommandListener>> registeredInstanceMap = new Hashtable<String, Set<CommandListener>>();

	private Map<List<String>, Set<Subscriber>> regionSubscriber = new Hashtable<List<String>, Set<Subscriber>>();

	private List<String> pubSubRegionIDList = new ArrayList<String>();*/

	private Set<Subscriber> subscriberSet = new HashSet<Subscriber>();

	/*RegionIDTables regionIDtb = new RegionIDTables();

	static PubSubMiddleware singletonInstance;

	public static PubSubMiddleware getInstance() {
		if (singletonInstance == null) {
			singletonInstance = new PubSubMiddleware();
		}
		return singletonInstance;
	}*/

	public void subscribe(Subscriber s, String eventSignature,
			List<String> regionInfo) {

		registerNewSubscriber(s, eventSignature, regionInfo);
	}

	public void publish(String eventName, Object arg) {

		/*Set<Subscriber> subscriberPatternSet = new HashSet<Subscriber>();

		pubSubRegionIDList = deviceInfo.getRegion();

		for (int i = 0; i <= pubSubRegionIDList.size(); i++) {

			List<String> regionIDResult = regionIDtb.getRegionIDField(i,
					pubSubRegionIDList);

			Set<Subscriber> s = regionSubscriber.get(regionIDResult);

			if (s != null) {
				subscriberPatternSet.addAll(s);
			}

		}
*/
		Set<Subscriber> subscriberEventSet = getSubscribersForEvent(eventName);

	/*	subscriberSet = SetOperations.intersection(subscriberEventSet,
				subscriberPatternSet);
*/
		if (subscriberSet != null) {
			for (Subscriber s : subscriberEventSet) {
				s.notifyReceived(eventName, arg);
			}
		}

	}

	private Set<Subscriber> getSubscribersForEvent(String eventName) {

		return subscriberMap.get(eventName);
	}

	private void registerNewSubscriber(Subscriber s, String eSig,
			List<String> regionInfo) {

		/*if (regionSubscriber.containsKey(regionInfo)) {
			Set<Subscriber> tempSet = regionSubscriber.get(regionInfo);
			tempSet.add(s);
			regionSubscriber.put(regionInfo, tempSet);

		} else {

			Set<Subscriber> newSet = new HashSet<Subscriber>();
			newSet.add(s);
			regionSubscriber.put(regionInfo, newSet);
		}*/

		// create Map by EventName

		if (subscriberMap.containsKey(eSig)) {

			Set<Subscriber> tempSet = subscriberMap.get(eSig);
			tempSet.add(s);
		} else {
			Set<Subscriber> newSet = new HashSet<Subscriber>();
			newSet.add(s);
			subscriberMap.put(eSig, newSet);
		}

	}

	/*// Request-Response

	public Object sendCommand(String methodName, Object arg, Device deviceInfo) {

		Set<CommandListener> registeredInstanceSet = getInstanceForCommand(methodName);

		if (registeredInstanceSet != null) {
			for (CommandListener s : registeredInstanceSet) {
				return s.commandReceived(methodName, arg, deviceInfo);
			}
		}
		return null;
	}

	private Set<CommandListener> getInstanceForCommand(String methodName) {
		return registeredInstanceMap.get(methodName);
	}

	private void registerNewInstance(CommandListener s, String listnerSignature) {

		if (registeredInstanceMap.containsKey(listnerSignature)) {
			Set<CommandListener> tempSet = registeredInstanceMap
					.get(listnerSignature);
			tempSet.add(s);
		} else {
			Set<CommandListener> newSet = new HashSet<CommandListener>();
			newSet.add(s);
			registeredInstanceMap.put(listnerSignature, newSet);
		}
	}

	public void registerInstance(CommandListener s, String listnerSignature) {
		registerNewInstance(s, listnerSignature);
	}
*/
}
