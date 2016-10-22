var mqtt = require('mqtt');
var client = mqtt.connect('mqtt://test.mosquitto.org:1883');
client.subscribe('fireMeasurement');
client.on('message', function(topic, payload) {
	if (topic.toString() == "fireMeasurement") {
		sensorMeasurement = JSON.parse(payload);
		var firePresense = sensorMeasurement.fireState;
		if (firePresense.toString() == "true") {
			var fireValue = {
				"fireStatus" : "true"
			};
			client.publish('notifyAlarm', JSON.stringify(fireValue));
			console.log("Publishing : Active Alarm");
			console.log("Publishing : Notify Smoke");
		}
	}
});
