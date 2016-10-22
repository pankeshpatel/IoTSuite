var mqtt = require('mqtt'); //no count for NodeRED
var client = mqtt.connect('mqtt://test.mosquitto.org:1883'); //no count for NodeRED
client.subscribe('roomAvgTempMeasurement'); //no count for NodeRED
var avgTemp = 0;
var smoke = "false";
client.on('message', function(topic, payload) { //no count for NodeRED
	if (topic.toString() == "roomAvgTempMeasurement") { //no count for NodeRED
		var sensorMeasurement = JSON.parse(payload);
		avgTemp = parseFloat(sensorMeasurement.tempValue);
		console.log("avgTemp Received from RoomAvgTemp is  " + avgTemp); //no count for NodeRED
	} //no count for NodeRED
}); //no count for NodeRED
client.subscribe('smokePresence'); //no count for NodeRED
client.on('message', function(topic, payload) { //no count for NodeRED
	if (topic.toString() == "smokePresence") { //no count for NodeRED
		var data = payload.toString('utf8', 7);
		var sensorMeasurement = JSON.parse(data);
		smoke = sensorMeasurement.presence;
		console.log("Notification from Smoke Detector"); //no count for NodeRED
		if (smoke.toString() == "true" && avgTemp > 40) {
			var data = {
				"fireState" : "true"
			};
			console.log("Publishging Data to Fire Controller..."); //no count for NodeRED
			client.publish('fireMeasurement', JSON.stringify(data)); //no count for NodeRED
			smoke = "false";
		} else {
			var data = {
				"fireState" : "false"
			};
			console.log("Publishging Data to Fire Controller..."); //no count for NodeRED
			client.publish('fireMeasurement', JSON.stringify(data)); //no count for NodeRED
		}
	}//no count for NodeRED
}); //no count for NodeRED