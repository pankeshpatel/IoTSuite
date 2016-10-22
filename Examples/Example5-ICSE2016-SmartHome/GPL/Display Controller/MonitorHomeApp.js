var http = require('http');
var fs = require('fs');
var port = 8686;
var i = 0;
var j = 0;
var mqtt = require('mqtt');
var currentmiliseconds;
var client = mqtt.connect('mqtt://test.mosquitto.org:1883');
client.subscribe('sensorMeasurement');
client.on(
				'message',
				function(topic, payload) {
					if (topic.toString() == "sensorMeasurement") {
						
						client.publish('getTemp', JSON.stringify(data)); // Request to yahoo weather service
						var temp = JSON.parse(payload);
						// Connection to mysql
						var mysql = require('mysql');
						var connection = mysql.createConnection({
							host : 'localhost',
							user : 'root',
							password : 'root',
							database : 'feedback',
							port : 3306
						});
						var query = connection
								.query(
										"INSERT INTO monitorhome (tempValue,humidityValue, timestamp) VALUES(?,?,?)",
										[ temp.tempValue, temp.humidity,
												new Date().getTime() ],
										function(err, result, fields) {
											if (err)
												throw err;
											connection.end();
										});
					}
				});
client.subscribe('weatherCondition');
client.on('message', function(topic, payload) {
	if (topic.toString() == "weatherCondition") {
		var temp = JSON.parse(payload);
		// Connection to mysql
		var mysql = require('mysql');
		var connection = mysql.createConnection({
			host : 'localhost',
			user : 'root',
			password : 'root',
			database : 'feedback',
			port : 3306
		});
		var query = connection.query(
				"INSERT INTO weatherservice (tempValue,timestamp) VALUES(?,?)",
				[ temp.tempValue, new Date().getTime() ], function(err, result,
						fields) {
					if (err)
						throw err;
					connection.end();
				});
	}
});
// 404 response
function send404Response(response) {
	response.writeHead(404, {
		"Content-Type" : "text/plain"
	});
	response.write("Error 404: Page not found");
	response.end();
}
// handle the user request..
http.createServer(
		function(req, res) {
			console.log('New incoming client request for ' + req.url);
			res.writeHeader(200, {
				'Content-Type' : 'application/json'
			});
			switch (req.url) {
			case '/temperatureData':
				currentmiliseconds = ((new Date().getTime()) - 10000000);
				var mysql = require('mysql');
				var connection = mysql.createConnection({
					host : 'localhost',
					user : 'root',
					password : 'root',
					database : 'feedback',
					port : 3306
				});
				var query = connection.query(
						'select * from monitorhome where timestamp > '
								+ currentmiliseconds, function(err, result,
								fields) {
							if (err)
								throw err;
							var tempvalue = result[i].tempValue;
							var humidityValue = result[i].humidityValue;
							console.log('Temperature:', result[i].tempValue
									+ ' Humidity :', result[i].humidityValue);
							i++;
							getData(res, tempvalue, humidityValue);
							connection.end();
						});
				break;
			case '/temperature':
				res.writeHead(200, 'text/html');
				var fileStream = fs.createReadStream('index.html');
				fileStream.pipe(res);
				break;
			default:
				send404Response(res);
			}
		}).listen(port);
function getData(res, tempValue, humidityValue) {
	var mysql = require('mysql');
	currentmiliseconds = ((new Date().getTime()) - 10000000);
	var connection = mysql.createConnection({
		host : 'localhost',
		user : 'root',
		password : 'root',
		database : 'feedback',
		port : 3306
	});
	var query = connection.query(
			'select * from weatherservice where timestamp > '
					+ currentmiliseconds, function(err, result, fields) {
				if (err)
					throw err;
				console.log('TempValue from Yahoo Weather Service :',
						result[j].tempValue);
				res.write('{"value" :' + tempValue + ',"value1":'
						+ humidityValue + ',"value2":' + result[j].tempValue
						+ '}');
				j++;
				res.end();
				connection.end();
			});
}
console.log('Server listening on http://localhost:' + port);