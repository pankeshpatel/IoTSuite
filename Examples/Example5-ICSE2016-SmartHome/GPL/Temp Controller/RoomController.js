var mqtt = require('mqtt'); // no count for NodeRED
var client = mqtt.connect('mqtt://test.mosquitto.org:1883'); // no count for NodeRED
client.subscribe('profile'); // no count for NodeRED
var tempMeasurement = 0;
var tempValue = 0;
client.on('message', function(topic, payload) { // no count for NodeRED
	if (topic.toString() == "profile") { // no count for NodeRED
		var sensorMeasurement = JSON.parse(payload);
		var data = JSON.stringify(sensorMeasurement);
		tempValue = (tempMeasurement + data.substring(68, 70)) / 2;
		console.log("Publish Data.." + tempValue); // no count for NodeRED
		var data = {
			"tempValue" : tempValue,
			"unitOfMeasurement" : "C"
		};
		client.publish('DisplayTemp', JSON.stringify(data)); // no count for NodeRED
	} // no count for NodeRED
}); // no count for NodeRED
client.subscribe('roomAvgTempMeasurement'); // no count for NodeRED
client.on('message', function(topic, payload) { // no count for NodeRED
	if (topic.toString() == "roomAvgTempMeasurement") { // no count for NodeRED
		var sensorMeasurement = JSON.parse(payload);
		tempMeasurement = sensorMeasurement.tempValue;
	} // no count for NodeRED
}); // no count for NodeRED