package iotsuite.pubsubmiddleware;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;

import iotsuite.common.RegionIDTables;
import iotsuite.semanticmodel.Device;

public class PubSubMiddleware {

	MQTTSubscriber sub = null;
	MQTTPublisher pub = null;

	private Map<String, Set<Subscriber>> subscriberMap = new Hashtable<String, Set<Subscriber>>();

	private Map<List<String>, Set<Subscriber>> regionSubscriber = new Hashtable<List<String>, Set<Subscriber>>();

	private Set<Subscriber> subscriberSet = Collections
			.synchronizedSet(new HashSet<Subscriber>());

	private List<String> pubSubRegionIDList = new ArrayList<String>();

	RegionIDTables regionIDtb = new RegionIDTables();

	static PubSubMiddleware singletonInstance;

	public static PubSubMiddleware getInstance(Device device, Object context) {

		if (singletonInstance == null) {
			singletonInstance = new PubSubMiddleware(device.getType(),
					device.getName(), context);
		}
		return singletonInstance;
	}

	public PubSubMiddleware(String type, String name, Object context) {

		pub = new MQTTPublisher();
		sub = new MQTTSubscriber(this);

	}

	/*
	 * Publish() function will publish data from software component, whenever it
	 * gets data from hardware sensor or other software component.
	 */

	public void publish(String topicName, Object arg, Device deviceInfo) {

		DataWrapper dw = new DataWrapper();
		dw.setObject(arg);
		dw.setDevice(deviceInfo);

		java.io.ByteArrayOutputStream bstream = new java.io.ByteArrayOutputStream();
		java.io.ObjectOutputStream st;

		try {
			st = new java.io.ObjectOutputStream(bstream);
			st.writeObject(dw);
			st.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		byte[] bytes = bstream.toByteArray();

		try {
			pub.publish(topicName, 0, bytes);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/*
	 * subscribe() function will subscribe component's interest to the
	 * middleware.
	 * 
	 * topicName : The eventName in which a component is in interest.
	 */

	public void subscribe(Subscriber s, String topicName,
			List<String> regionInfo) {
		registerNewSubscriber(s, topicName, regionInfo);

		try {
			sub.subscribe(topicName);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private Set<Subscriber> getSubscribersForEvent(String eventName) {

		return subscriberMap.get(eventName);
	}

	private void registerNewSubscriber(Subscriber s, String eSig,
			List<String> regionInfo) {

		if (regionSubscriber.containsKey(regionInfo)) {
			Set<Subscriber> tempSet = regionSubscriber.get(regionInfo);
			tempSet.add(s);
			regionSubscriber.put(regionInfo, tempSet);

		} else {

			Set<Subscriber> newSet = new HashSet<Subscriber>();
			newSet.add(s);
			regionSubscriber.put(regionInfo, newSet);
		}

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

	public void receiveEvent(String forTopic, MqttMessage event)
			throws MqttException {
		Object obj = null;

		log("receiveEvent(forTopic = %s, event = %s)", forTopic, event
				.getPayload().getClass().getName());

		java.io.ByteArrayInputStream bstream = new java.io.ByteArrayInputStream(
				event.getPayload());
		try {
			java.io.ObjectInputStream st = new java.io.ObjectInputStream(
					bstream);
			obj = st.readObject();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		DataWrapper dt = (DataWrapper) obj;

		Set<Subscriber> subscriberPatternSet = new HashSet<Subscriber>();

		pubSubRegionIDList = dt.getDevice().getRegion();

		for (int i = 0; i <= pubSubRegionIDList.size(); i++) {

			List<String> regionIDResult = regionIDtb.getRegionIDField(i,
					pubSubRegionIDList);

			Set<Subscriber> s = regionSubscriber.get(regionIDResult);

			if (s != null) {
				subscriberPatternSet.addAll(s);
			}

		}

		Set<Subscriber> subscriberEventSet = getSubscribersForEvent(forTopic);

		subscriberSet = SetOperations.intersection(subscriberEventSet,
				subscriberPatternSet);

		if (subscriberSet != null) {
			for (Subscriber s : subscriberSet) {
				s.notifyReceived(forTopic, dt.getObject(), dt.getDevice());
			}
		}

	}

	private static void log(String format, Object... args) {
		System.err.println("[LOG] " + String.format(format, args));
	}

}
