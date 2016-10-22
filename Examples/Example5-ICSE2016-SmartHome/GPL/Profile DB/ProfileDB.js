var http = require('http');
var fs = require('fs');
var port = 8686;
var mqtt = require('mqtt');
var client = mqtt.connect('mqtt://test.mosquitto.org:1883');
client.subscribe('getprofile');
client.on('message', function(topic, payload) {
	if (topic.toString() == "getprofile") {
		var sensorMeasurement = JSON.parse(payload);
		var badgeID = sensorMeasurement.badgeID;
		badgeID = "'" + badgeID + "'";
		//console.log(badgeID);
		// Connection to mysql
		var mysql = require('mysql');
		var connection = mysql.createConnection({
			host : 'localhost',
			user : 'root',
			password : 'root',
			database : 'iotsuiteuser',
			port : 3306
		});
		var query = connection.query(
				'SELECT * FROM RFIDPROFILEDB WHERE badgeID=' + badgeID,
				function(err, result, fields) {
					if (err)
						throw err;
					// console.log(result);
					var tempvalue = result.tempValue;
					var unitOfMeasurement = result.unitOfMeasurement;
					var data = {
						"tempValue" : tempvalue,
						"unitOfMeasurement" : unitOfMeasurement
					};
					client.publish('profile', JSON.stringify(data));
					console.log("Publishing Data to Proximity");
					//res.end();
					connection.end();
				});
	}
});
