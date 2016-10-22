package iotsuite.pubsubmiddleware;

import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.MqttTopic;

public class PushCallback implements MqttCallback {

	PubSubMiddleware pubsub = null;

	public PushCallback(PubSubMiddleware pubsub) {
		this.pubsub = pubsub;
	}

	@Override
	public void connectionLost(Throwable cause) {
		// We should reconnect here
	}

	@Override
	public void messageArrived(MqttTopic topic, MqttMessage message)
			throws Exception {

		pubsub.receiveEvent(topic.toString(), message);
	}

	@Override
	public void deliveryComplete(MqttDeliveryToken token) {
		// We do not need this because we do not publish
	}
}
