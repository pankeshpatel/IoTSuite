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
    
    
 $CS.allDataAccess:{ dataAccess | 
    client.publish('get$dataAccess.dataAccessName; format="avoidCapital"$', JSON.stringify(data));
    console.log("Publishing get$dataAccess.dataAccessName; format="avoidCapital"$");
    }; separator="\n"$   
     
  }
 }); 

 }; separator="\n"$
 

$CS.allDataAccess:{ dataAccess |     
  client.subscribe('$dataAccess.dataAccessName; format="avoidCapital"$');
  client.on('message', function(topic, payload) {
  if (topic.toString() == "$dataAccess.dataAccessName; format="avoidCapital"$") {
    var sensorMeasurement = JSON.parse(payload);   
    
    $CS.allGeneratedInfo:{ generatedInfo |
    client.publish('$generatedInfo.name; format="avoidCapital"$', JSON.stringify(data));
    console.log("Publishing $generatedInfo.name; format="avoidCapital"$");
    }; separator="\n"$
  }
});
}$
     
     
   
