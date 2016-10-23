var http = require('http');
var fs = require('fs');
var port = 8686;
var path = require('path');
var mqtt = require('mqtt');
var EventEmitter = require('events');
var sock = new EventEmitter();
var tempValue,humidityValue,min,max,avg;
var client = mqtt.connect('mqtt://test.mosquitto.org');


client.subscribe('DisplaySensorMeasurement');
client.on('message', function(topic, payload) {
	if (topic.toString() == "DisplaySensorMeasurement") {  
	var sensorMeasurement = JSON.parse(payload);  
	  sock.emit('sensorData', { value: parseFloat(sensorMeasurement.tempValue),
	  value1:  parseFloat(sensorMeasurement.humidityValue),
	  value2:  parseFloat(sensorMeasurement.yahooTempValue)});
	}
});

function handleRequest(request, response){

    var filePath = path.join(__dirname, 'client.html' );
    var stat = fs.statSync(filePath);

    response.writeHead(200, {
        'Content-Type': 'text/html',
        'Content-Length': stat.size
    });

    var readStream = fs.createReadStream(filePath);
    readStream.pipe(response);	   	
}


var server = http.createServer(handleRequest);

var io = require('socket.io').listen(server);

server.listen(port, function(){

    console.log("Server listening on port :%s", port);
});


io.sockets.on('connection', function (socket) {
  sock = socket; 
 });


