var mqtt = require('mqtt');
var client = mqtt.connect('mqtt://test.mosquitto.org:1883');
client.subscribe('badgeDetected');
client.on('message', function(topic, payload) {
	if (topic.toString() == "badgeDetected") {
		var sensorMeasurement = JSON.parse(payload);
		badgeID = sensorMeasurement.badgeID;
		badgeEvent = sensorMeasurement.badgeEvent;
		var data = {
			"badgeID" : badgeID,
			"badgeEvent" : badgeEvent
		};
		client.publish('getprofile', JSON.stringify(data));
		console.log("Publishing Data to ProfileDB");
	}
});
client.subscribe('profile');
client.on('message', function(topic, payload) {
	if (topic.toString() == "profile") {
		var sensorMeasurement = JSON.parse(payload);
		tempValue = sensorMeasurement.tempValue;
		unitOfMeasurement = sensorMeasurement.unitOfMeasurement;
		var data = {
			"tempValue" : badgeID,
			"unitOfMeasurement" : badgeEvent
		};
		console.log("Publishing Data to TempController");
		client.publish('tempPref', JSON.stringify(data));
	}
});