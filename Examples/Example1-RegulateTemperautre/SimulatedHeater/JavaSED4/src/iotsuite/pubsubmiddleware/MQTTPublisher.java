package iotsuite.pubsubmiddleware;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import org.eclipse.paho.client.mqttv3.internal.MemoryPersistence;

public class MQTTPublisher {

	// public static final String BROKER_URL =
	// "tcp://broker.mqttdashboard.com:1883";
	public static final String BROKER_URL = "tcp://test.mosquitto.org:1883";

	private MqttClient client;

	public MQTTPublisher() {
		try {
			client = new MqttClient(BROKER_URL, MqttClient.generateClientId(),
					new MemoryPersistence());
			client.connect();

		} catch (MqttException e) {
			e.printStackTrace();
		}
	}

	public void publish(String topicName, int qos, byte[] payload)
			throws MqttException {
		final MqttTopic topic = client.getTopic(topicName);

		final MqttMessage message = new MqttMessage(payload);
		topic.publish(message);

		System.out.println("Published data. Topic: " + topic.getName()
				+ "  Message: " + payload);
	}

}
