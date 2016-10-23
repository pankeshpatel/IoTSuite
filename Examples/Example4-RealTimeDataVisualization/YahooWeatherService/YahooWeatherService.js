var YQL = require('yqlp');
var mqtt = require('mqtt');
var client = mqtt.connect('mqtt://test.mosquitto.org');

var timeout = setInterval(function() {
	YQL.exec("SELECT * FROM weather.forecast WHERE woeid=@woeid AND u='c'", {
		//woeid : sensorMeasurement.woeid
		woeid : 2295420
	}, function(error, response) {
		if (error) {
			console.log('Ut oh! Example #1 has messed up:', error);
		} else {
			var results = response.query.results;
			//console.log(results.channel.item.condition.temp);
			var data = {
				"tempValue" : parseFloat(results.channel.item.condition.temp),
				"unitOfMeasurement" : 'C'
			};
			client.publish('weatherMeasurement', JSON.stringify(data));
			console.log("Publishing Data weatherCondition "+ parseFloat(results.channel.item.condition.temp));
		}
	});
}, 5000);
//});
