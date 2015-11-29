var http = require('http');
var fs = require('fs');
//Device developer will specify port number where server is up and running
var port=8686 ;
var i=0;



/* Following  will be used for mqtt once we will implement modified mqtt publish/subscriber interface in ToolSuite
var mqtt=require('mqtt');
var client=mqtt.connect('mqtt://test.mosquitto.org:1883');

//Device developer will specify subscribe topic
client.subscribe('');
client.on('message',function(topic,payload){
//Device developer will specify subscribe topic
  if(topic.toString()==""){
  var data =payload.toString('utf8',7);
  var temp=JSON.parse(data);
  
  //Connection to mysql
  var mysql=require('mysql'); 
  var connection=mysql.createConnection({
    //Device developer will specify following value in order to establish connection to mysql
    host:'localhost',
    user:'',
    password:'',
    database:'',
    port: 
  }); 
  
  var query=connection.query(     
     
     //Device developer will write query to store data received through mqtt to database
     
      function(err,result,fields){
        if(err) throw err;
        console.log("Data Inserted into Database");
        connection.end();
        //getData(res,temp);
        //connection.end();
      });
  }  
  }); */ 
  
  // 404 response
function send404Response(response){
  response.writeHead(404,{"Content-Type": "text/plain" });
  response.write("Error 404: Page not found");
  response.end();
}


// handle the user request..

http.createServer(function(req, res) {
  console.log('New incoming client request for ' + req.url);
  
  res.writeHeader(200, {'Content-Type' : 'application/json'});  
   
  switch (req.url) {
  
  case '/temperatureData':
    var mysql=require('mysql');
    
    currentmiliseconds=((new Date().getTime())-1000000);
     //Device developer will specify following value in order to establish connection to mysql     
    var connection=mysql.createConnection({
      host:'localhost',
      user:'',
      password:'',
      database:'',
      port: 
    });
    
    var query=connection.query(     
      
      // Device developer will write query to select data from database 
      'SELECT * FROM $GUIdriver.NotifyFrom$',function(err,result,fields){
          if(err) throw err;         
          $GUIdriver.AllStructFieldsForNotify:{fieldsForNotify | 
          var $fieldsForNotify.name$= result[i].$fieldsForNotify.name$;
          }$
          // Device developer will extract value (only those value which will need to display) from database  and send value to client 
          res.write('{$GUIdriver.AllStructFieldsForNotify:{fieldsForNotify |
          "$fieldsForNotify.name$" :'+$fieldsForNotify.name$+'}; separator=" , "$
          }');
          i++;
          res.end();
          connection.end();
          
        });
      break;
      
  case '/temperature':  
    res.writeHead(200, 'text/html');  
    var fileStream = fs.createReadStream('client.html');
    fileStream.pipe(res);
    break;  
  default:
        send404Response(res);   
  }
}).listen(port);
console.log('Server listening on http://localhost:' + port);


