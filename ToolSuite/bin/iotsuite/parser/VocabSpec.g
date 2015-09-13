grammar VocabSpec; 

options {
  language = Java;  
}  

@lexer::header {
  package iotsuite.parser; 
  
}    

@parser::header { 
package iotsuite.parser;
import iotsuite.compiler.*;  
import iotsuite.semanticmodel.*;   
      
} 
  
@members {
  //Initialize the context
  private SymbolTable context;
} 
 
vocabSpec : 
    'regions'
    { context = new SymbolTable();
    context.currentRegion = new RegionCompiler();
    // context.currentMappingConstraint = new MappingConstraint(); 
    }
    ':' (region_def)+  
    { context.currentRegion.generateRegionCode(); }     
    'structs' ':' (struct_def)+  
   // ('widgets' ':' widget_def)*
    'resources' ':' abilities_def   
;
//*************************************************************************************************

// Region Definition *** Start
 
region_def :      
  
     CAPITALIZED_ID ':' dataType  ';'
    { 
    context.currentRegion.addRegion($CAPITALIZED_ID.text, $dataType.text); 
    }
;

// Region Definition *** End 
//*************************************************************************************************


// Structure Definition *** Start 
//************************************************************************************************

struct_def:
    CAPITALIZED_ID 
    {context.currentStruct = new StructCompiler($CAPITALIZED_ID.text);
    context.constructStructNameSymblTable($CAPITALIZED_ID.text);}
    (structField_def ';')*   
    {
     
     context.currentStruct.generateStructureCode();
    
    
  
    } 
;
structField_def:  
  lc_id ':' dataType 
  { context.currentStruct.addField($lc_id.text, $dataType.text);
   //context.constructStructureSymbTable($lc_id.text,$dataType.text);
   // context.constructStructResponseTypeSymblTable($lc_id.text,$dataType.text);
   context.constructStructFieldSymblTable($lc_id.text,$dataType.text);
    context.constructStructSymblTable(context.currentStruct.getStructName(),context.currentStruct);  }  
; 
// Structure Definition *** End 
//************************************************************************************************

abilities_def : 
  // 'periodicsensors' ':'   (sensor_def)+
  ('sensors' ':'   sensor_def)+
 // 'actuators' ':' (actuator_def)+
   ('actuators' ':' actuator_def)*
  ('storages'  ':' ss_def)*
  ('interactions' ':' (gui_def)+ )*     
;   


// Sensor Definition *** Start 
//************************************************************************************************
 
sensor_def:
 
      ('periodicsensors' ':' periodicsensor_def)*
     // 'periodicsensors' ':' (periodicsensor_def|eventsensor_def)
     //'sensor_def' ':' (periodicsensor_def | eventsensor_def )+ 
      ('eventdriven' ':' eventsensor_def)*
   /* CAPITALIZED_ID
    {context.currentSensor = new SensorCompiler($CAPITALIZED_ID.text);}
    (sensorMeasurement_def ';')* 
    (sensorperiodicMeasurement_def ';')*
    {context.currentSensor.generateSensorCode();}*/
; 

periodicsensor_def:
 CAPITALIZED_ID
    {context.currentSensor = new SensorCompiler($CAPITALIZED_ID.text);}
    (sensorMeasurement_def ';')* 
    (sensorperiodicMeasurement_def ';')*
    {context.currentSensor.generatePeriodicSensorCode();}
;

eventsensor_def:
 CAPITALIZED_ID
    {context.currentSensor = new SensorCompiler($CAPITALIZED_ID.text);}
    (sensorMeasurement_def ';')* 
    (sensoreventMeasurement_def ';')*
    {context.currentSensor.generateEventDrivenSensorCode();}

;




sensorMeasurement_def : 
    'generate' lc_id ':'  CAPITALIZED_ID  
    //'sample' 'period' dataType 'for' dataType
    { context.currentSensor.addSensorMeasurement($lc_id.text, $CAPITALIZED_ID.text ,context.getStructSymblTable($CAPITALIZED_ID.text) ); 
    context.constructSymbTable($lc_id.text, $CAPITALIZED_ID.text); } 
;


sensorperiodicMeasurement_def:
 'sample' 'period' 'SAMPLEPERIOD' 'for' 'SAMPLEDURATION'  
  
;


sensoreventMeasurement_def: 
//('onCondition' ID ',' ID)*
('onCondition' (ID |',' ID)*)*

;

// Sensor Definition *** End 
//************************************************************************************************


// Actuator Definition *** Start 
//************************************************************************************************

actuator_def:
   CAPITALIZED_ID
    {context.currentActuator = new ActuatorCompiler($CAPITALIZED_ID.text);}
   (action_def ';')*
   {context.currentActuator.generateActuatorCode();}    
;


action_def:
    'action' CAPITALIZED_ID '(' (parameter_def)? ')'
    { context.currentActuator.addAction($CAPITALIZED_ID.text); } 
;

parameter_def :
    lc_id ':'  CAPITALIZED_ID (',' parameter_def )?
    { 
     context.constructActuatorSymblTable($CAPITALIZED_ID.text);
    
    context.currentActuator.addParameter($lc_id.text, $CAPITALIZED_ID.text); 
    context.constructSymbTable($lc_id.text, $CAPITALIZED_ID.text);
   
    }
; 

// Actuator Definition *** End 
//************************************************************************************************


// Storage Definition *** Start 
//************************************************************************************************

ss_def:
  CAPITALIZED_ID
    { context.currentStorageService = new StorageCompiler();
      //context.currentStorageService = new Storage($CAPITALIZED_ID.text);
      }
   
    (storageDataAccess_def ';')* 
 
     {
     context.currentStorageService.setStorageServiceName($CAPITALIZED_ID.text);
     context.currentStorageService.createStorageObject();
     context.currentStorageService.generateStorageCode(); 
    // context.currentMappingConstraint.setSoftwareComponentName($CAPITALIZED_ID.text);
    // context.currentMappingConstraint.addDeployementConstraintObj(); // This line creates a  Symbol Table
     }
; 
 
 

storageDataAccess_def :
     storageGeneratedInfo_def  'accessed-by' storagedataIndex_def
    { context.currentStorageService.addDataAccess(); }
;

storageGeneratedInfo_def :
    'generate' lc_id ':'  CAPITALIZED_ID
    { context.currentStorageService.addGeneratedInfo($lc_id.text, $CAPITALIZED_ID.text);  
      context.constructSymbTable($lc_id.text, $CAPITALIZED_ID.text);
    context.constructResponseTypeSymblTable($lc_id.text, $CAPITALIZED_ID.text);
    }
;

storagedataIndex_def:
        lc_id ':' dataType
        { context.currentStorageService.addDataAccessIndex($lc_id.text, $dataType.text); 
        context.constructStorageInfoSymblTable($lc_id.text, $dataType.text);
        
         }
;  

/*storagePartition_def :
    storageDeploymentConstraint = 'deployment-instance' ':' storageDeploymentConstraintValue = 'singleton'
    {
     
     // Next two lines are for  Mapping constraints
    context.currentMappingConstraint.setAttributeName($storageDeploymentConstraint.text);  
    context.currentMappingConstraint.setAttributeValue($storageDeploymentConstraintValue.text);  
    } 
; */

// Storage Definition *** End 
//************************************************************************************************



lc_id: ID  
;
 
dataType:
  primitiveType 
;
 
primitiveType:
  (id='Integer' | id='Boolean' | id='String' |  id = 'double' | id = 'long' | id='boolean'|id ='_')
;


ID  : 'a'..'z'  ('a'..'z' | 'A'..'Z' | '0'..'9')*
   ;
   
INT : '0'..'9'('0'..'9')*  ; 

CAPITALIZED_ID: 'A'..'Z' ('a'..'z' | 'A'..'Z' )*;

WS: ('\t' | ' ' | '\r' | '\n' | '\u000C')+ {$channel = HIDDEN;};


//**************************The following is a part of future work ******************************

// EndUserGUI Definition *** Start 
//************************************************************************************************

// This is a part of future work.

gui_def:  
  {context.currentGUI = new UserInterfaceCompiler();}  
  CAPITALIZED_ID           
   //(gui_action_def ';')*  
    // User interaction - Action. Action (e.g., receiving notification is not a user interaction.
   (gui_command_def ';')*   // User interaction - Command
   (gui_request_def  ';')*   //User interaction - Request/Response
   {context.currentGUI.setGUIName($CAPITALIZED_ID.text); 
    context.currentGUI.createGUIObject();
    context.currentGUI.generateCode();}   
;

gui_command_def :
    'command'  name = CAPITALIZED_ID '(' (gui_command_parameter_def)? ')'   
    { 
      context.currentGUI.addCommand($name.text);   
    }
;


gui_command_parameter_def :
    lc_id (',' gui_command_parameter_def )?
    { 
    context.currentGUI.addCommandParameter($lc_id.text); 
    }
;




gui_action_def:
    'action' name = CAPITALIZED_ID '(' (gui_action_parameter_def)? ')' 'with' ui = lc_id
    { context.currentGUI.addAction($name.text, $ui.text ); } 
;


//gui_action_def:
//    'action' name = CAPITALIZED_ID '(' (gui_action_parameter_def)? ')' 'with' ui = lc_id 
//    { context.currentGUI.addAction($name.text, $ui.text ); } 
//;

gui_action_parameter_def :
    lc_id ':'  CAPITALIZED_ID (',' gui_action_parameter_def )?
    { 
    context.currentGUI.addActionParameter($lc_id.text, $CAPITALIZED_ID.text); 
    context.constructSymbTable($lc_id.text, $CAPITALIZED_ID.text);
    }
; 

gui_request_def :
   'request' lc_id 
   { context.currentGUI.getDataAccessListFromSymblTable($lc_id.text);
     context.currentGUI.setRequestType(context.getResponseTypeSymblTable($lc_id.text));}
;



//gui_request_def :
//   'request' lc_id 'with' button = bt_id ',' textbox = txtbx_id ',' textview = txtview_id 
//   { context.currentGUI.getDataAccessListFromSymblTable($lc_id.text);
//     context.currentGUI.setRequestType(context.getResponseTypeSymblTable($lc_id.text));}
//;




//gui_command_def :
//    'command'  name = CAPITALIZED_ID '(' (gui_command_parameter_def)? ')' 'with' button = lc_id (',' textbox = lc_id)?  
//    { 
//      context.currentGUI.addCommand($name.text,new Widget($textbox.text,$button.text,""));  
//    }
//;

//TODO  : need discussion on request-response 
//For  request response, a user needs the following three components
//  1. TextBox to enter data.
//  2. Button to made a request.
//  3. TextView to view the response.

//gui_request_def :
//   'request' lc_id 'with' button = bt_id ',' textbox = txtbx_id ',' textview = txtview_id 
//   { context.currentGUI.getDataAccessListFromSymblTable($lc_id.text);
//     context.currentGUI.setRequestType(context.getResponseTypeSymblTable($lc_id.text));}
//;

bt_id :  ID ;

txtbx_id :  ID ;

txtview_id :  ID ;

 
//req_ui_parameter :
//    textbox = CAPITALIZED_ID button = CAPITALIZED_ID textview = CAPITALIZED_ID 
//    {context.currentGUI.setReqWidget($textbox.text,$button.text,$textview.text);}
//;

 

// EndUSerGUI Definition *** End 
//************************************************************************************************


// Widget Definition *** Start 
//************************************************************************************************
// This is a part of future work.

widget_def :
    ('TextView' textview_def ';')*
    ('Button'  button_def ';')*
    ('TextBox' textbox_def ';')*

  //('TextView' textview = lc_id )* ';'
  //('Button'  button = lc_id)* ';'
  //('TextBox' textbox = lc_id)* ';'
;

textview_def :
    lc_id  (',' textview_def)?
;

button_def :
    lc_id  (',' button_def)? 
;

textbox_def :
    lc_id (',' textbox_def)?
;

// Widget Definition *** End 
//************************************************************************************************

