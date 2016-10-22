var sensorLib = require('node-dht-sensor'); 
var mqtt=require('mqtt'); 
var client=mqtt.connect('mqtt://test.mosquitto.org:1883');  
var sensor = {
    initialize: function () {
        return sensorLib.initialize(22, 4); // here GPIO4 means pin7 
    },
    read: function () {
        var readout = sensorLib.read();
        var value={"tempValue":readout.temperature.toFixed(2),"unitOfMeasurement":"C","humidity": readout.humidity.toFixed(2)}; 
	client.publish('sensorMeasurement',JSON.stringify(value));  
        console.log('Temperature: ' + readout.temperature.toFixed(2) + 'C, ' + 
            'humidity: ' + readout.humidity.toFixed(2) + '%'); 
        setTimeout(function () {
            sensor.read();
        }, 5000);
    }
}; 
if (sensor.initialize()) {
    sensor.read();
} else {
    console.warn('Failed to initialize sensor');
}