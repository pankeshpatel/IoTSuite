var mqtt=require('mqtt'); 
var client=mqtt.connect('mqtt://test.mosquitto.org:1883');
client.subscribe('notifyAlarm');  
console.log("Alarm is ready to receive Fire State"); 
client.on('message',function(topic,payload){	
//sensorMeasurement=JSON.parse(payload); // no count for NodeRED
var Gpio = require('onoff').Gpio,
  buzzer = new Gpio(3, 'out'); // Here it's a GPIOPin:3 (i.e. pin number 5)
//var value=sensorMeasurement.tempValue; // no count for NodeRED
setTimeout(function(){
buzzer.unexport();   
},10000);
}); 
function exit() {
  //buzzer.unexport(); // no count for NodeRED
  //button.unexport(); // no count for NodeRED
console.log("Good Bye!");
  process.exit();
} 
process.on('SIGINT', exit);