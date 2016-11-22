var mqtt = require('mqtt'); 
var client = mqtt.connect('mqtt://test.mosquitto.org:1883'); 
var NUM_SAMPLE_FOR_AVG = $CS.sampleValue$;
var numSample = 0;

  $CS.allConsumedInfo:{ consumedInfo |
    client.subscribe('$consumedInfo.name$');    
    client.on('message', function(topic, payload) {
      if (topic.toString() == "$consumedInfo.name$") { 
        var sensorMeasurement=JSON.parse(payload);
        if (numSample <= NUM_SAMPLE_FOR_AVG) {
         
              $CS.allGeneratedInfo:{ generatedInfo |
               client.publish('$generatedInfo.name$', JSON.stringify(data)); 
               console.log("Publishing $generatedInfo.name$");}; separator="\n"$              
          
        }       
      }
    });  
  }; separator="\n"$    
   
    