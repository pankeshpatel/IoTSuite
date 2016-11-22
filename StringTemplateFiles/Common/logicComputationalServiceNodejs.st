var mqtt = require('mqtt'); 
var client = mqtt.connect('mqtt://test.mosquitto.org:1883');
 $CS.allConsumedInfo:{ consumedInfo |
client.subscribe('$consumedInfo.name$'); 
client.on('message', function(topic, payload) { 
  if (topic.toString() == "$consumedInfo.name$") {
    var sensorMeasurement = JSON.parse(payload);
    
$CS.allActions:{ action |
    client.publish('$action.name; format="capital"$', JSON.stringify(data));  
    console.log("Publishing $action.name; format="capital"$");
    }; separator="\n"$  
  }
 }); 

  }; separator="\n"$ 

