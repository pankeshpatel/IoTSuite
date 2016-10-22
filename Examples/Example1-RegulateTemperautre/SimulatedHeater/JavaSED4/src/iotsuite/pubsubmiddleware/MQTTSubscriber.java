package iotsuite.pubsubmiddleware;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.internal.MemoryPersistence;

public class MQTTSubscriber {

	// public static final String BROKER_URL =
	// "tcp://broker.mqttdashboard.com:1883";
	public static final String BROKER_URL = "tcp://test.mosquitto.org:1883";

	private MqttClient client;

	public MQTTSubscriber(PubSubMiddleware pubsub) {
		try {
			client = new MqttClient(BROKER_URL, MqttClient.generateClientId(),
					new MemoryPersistence());

			client.setCallback(new PushCallback(pubsub));
			client.connect();

		} catch (MqttException e) {
			e.printStackTrace();
		}
	}

	public void subscribe(String topicName) throws MqttException {

		// Subscribe to all subtopics of homeautomation
		client.subscribe(topicName);

		System.out.println("Subscribed. Topic: " + topicName);
	}

}
