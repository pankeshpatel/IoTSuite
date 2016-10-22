var rc522 = require("rc522-rfid-promise"); 
var mqtt=require('mqtt');
var client=mqtt.connect('mqtt://test.mosquitto.org:1883'); 
rc522.startListening()
	.then(function(rfidTag){
        var value={"badgeID":rfidTag};
	client.publish('badgeDetected',JSON.stringify(value));
    	console.log(rfidTag);	
	});
