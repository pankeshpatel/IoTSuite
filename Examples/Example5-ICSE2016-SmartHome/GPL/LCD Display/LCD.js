var Lcd = require('lcd'), 
  lcd = new Lcd({
    rs: 12,
    e: 21,
    data: [5,6,17,18],
    cols: 8,
    rows: 2
  });
var mqtt=require('mqtt'); 
var client=mqtt.connect('mqtt://test.mosquitto.org:1883'); 
client.subscribe('SetTemp'); 	
lcd.on('ready', function() {
client.on('message',function(topic,payload){	
//var data=payload.toString('utf8',7);    // no count for NodeRED
sensorMeasurement=JSON.parse(data);
//console.log(sensorMeasurement.tempValue); // no count for NodeRED
    lcd.setCursor(0, 0);
    lcd.print("Merry Christmas");
	//console.log("Time"+new Date().toISOString().substring(11, 19));  // no count for NodeRED
});		
	}); 
// If ctrl+c is hit, free resources and exit. // no count for NodeRED
process.on('SIGINT', function() {
  lcd.clear();
  lcd.close();
  process.exit();
});