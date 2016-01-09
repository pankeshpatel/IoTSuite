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
  private SymbolTable context;
} 
 
vocabSpec : 
   { 
    context = new SymbolTable();
    }   
    'structs' ':' (struct_def)+  
    'resources' ':' abilities_def   
; 
   
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
  { 
    context.currentStruct.addField($lc_id.text, $dataType.text);
   context.constructStructFieldSymblTable($lc_id.text,$dataType.text);
    context.constructStructSymblTable(context.currentStruct.getStructName(),context.currentStruct);  }  
;  
  

abilities_def : 
  ('sensors' ':'   sensor_def)+
   ('tags' ':' (tagsensor_def)*)* 
   ('actuators' ':' (actuator_def)*)*
   ('storages'  ':' (ss_def)* )*     
;
 
sensor_def:
      ('periodicSensors' ':'(periodicsensor_def)*)*
      ('eventDrivenSensors' ':' (eventsensor_def)*)*  
       ('requestBasedSensors' ':' (requestsensor_def)*)*
; 

periodicsensor_def:
 CAPITALIZED_ID
    {context.currentSensor = new SensorCompiler($CAPITALIZED_ID.text);}
    (sensorMeasurementForPeriodic_def ';')* 
    (sensorperiodicMeasurement_def ';')*
    {context.currentSensor.generatePeriodicSensorCode();        
    }
;


tagsensor_def: 
 CAPITALIZED_ID
    {context.currentSensor = new SensorCompiler($CAPITALIZED_ID.text);}
    (sensorMeasurementForTag_def ';')* 
   // (sensoreventMeasurement_def ';')*
   //{context.currentSensor.generateEventDrivenSensorCode();}
   {context.currentSensor.generateTagCode();}

;

eventsensor_def:
 CAPITALIZED_ID
    {context.currentSensor = new SensorCompiler($CAPITALIZED_ID.text);}
    (sensorMeasurementForEventDriven_def ';')* 
    (sensoreventMeasurement_def ';')*
    {context.currentSensor.generateEventDrivenSensorCode();}

;

  
requestsensor_def:
  CAPITALIZED_ID
   { context.currentStorageService = new StorageCompiler();   }   
    (webServiceDataAccess_def ';')*
    (storageActionAccess_def ';')*   
    {
     context.currentStorageService.setStorageServiceName($CAPITALIZED_ID.text);
     context.currentStorageService.createStorageObject();
     context.currentStorageService.generateStorageCode(); 
     }     
;
webServiceDataAccess_def :
     webServiceGeneratedInfo_def  'accessed-by' webServicedataIndex_def
   { context.currentStorageService.addDataAccess(); }
;

webServiceGeneratedInfo_def :
    'generate' lc_id ':'  CAPITALIZED_ID   
   {
     context.constructStorageSymblTable($CAPITALIZED_ID.text);
      context.constructConsumeInfoSymblTable($lc_id.text, $CAPITALIZED_ID.text);
     context.currentStorageService.addGeneratedInfo($lc_id.text, $CAPITALIZED_ID.text);  
      context.constructSymbTable($lc_id.text, $CAPITALIZED_ID.text);
   context.constructResponseTypeSymblTable($lc_id.text, $CAPITALIZED_ID.text);
   
    
   }   
;

webServicedataIndex_def:
        lc_id ':' dataType
     { context.currentStorageService.addDataAccessIndex($lc_id.text, $dataType.text); 
      context.constructStorageInfoSymblTable($lc_id.text, $dataType.text);
        
      }     
;
sensorMeasurementForEventDriven_def:
'generate' lc_id ':'  CAPITALIZED_ID  
    {  
     context.constructConsumeInfoSymblTable($lc_id.text, $CAPITALIZED_ID.text);
    context.currentSensor.addSensorMeasurement($lc_id.text, $CAPITALIZED_ID.text , context.getStructSymblTable($CAPITALIZED_ID.text) ); 
   
    context.constructSymbTable($lc_id.text, $CAPITALIZED_ID.text);
    context.constructEventDrivenSymblTable($CAPITALIZED_ID.text);
    
     } 
;

sensorMeasurementForTag_def:
'generate' lc_id ':'  CAPITALIZED_ID  
    {  
    context.constructConsumeInfoSymblTable($lc_id.text, $CAPITALIZED_ID.text);
    context.currentSensor.addSensorMeasurement($lc_id.text, $CAPITALIZED_ID.text , context.getStructSymblTable($CAPITALIZED_ID.text) ); 
    context.constructSymbTable($lc_id.text, $CAPITALIZED_ID.text);
     
  //  context.constructEventDrivenSymblTable($CAPITALIZED_ID.text);
     } 
;
sensorMeasurementForPeriodic_def : 
    'generate' lc_id ':'  CAPITALIZED_ID        
    {      
     context.constructConsumeInfoSymblTable($lc_id.text, $CAPITALIZED_ID.text);
    context.currentSensor.addSensorMeasurement($lc_id.text, $CAPITALIZED_ID.text , context.getStructSymblTable($CAPITALIZED_ID.text) ); 
    
    context.constructSymbTable($lc_id.text, $CAPITALIZED_ID.text);  
    context.constructPeriodicSymbltable($CAPITALIZED_ID.text);
   
    } 
;
 
sensorperiodicMeasurement_def:
 'sample' 'period' (sample_period_def)* 'for' (sample_duration_def)*  
;

sample_period_def :
  INT  
{
context.currentSensor.addSensorMeasurementSamplePeriod($INT.text);
}
;

sample_duration_def :
INT
{
context.currentSensor.addSensorMeasurementSampleDuration($INT.text);
}
;

sensoreventMeasurement_def: 
('onCondition' (EXPRESSION)(UNIT) )* 
{
context.currentSensor.addEventDrivenExpression($EXPRESSION.text);
}
;


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
ss_def:
  CAPITALIZED_ID
    { context.currentStorageService = new StorageCompiler();
    }  
    (storageDataAccess_def ';')*
    (storageActionAccess_def ';')* 
     {
     context.currentStorageService.setStorageServiceName($CAPITALIZED_ID.text);
     context.currentStorageService.createStorageObject();
     context.currentStorageService.generateStorageCode(); 
     }
;

storageActionAccess_def: 
   (storageAction_def )*       
;  

storageAction_def: 
    'action' CAPITALIZED_ID '(' (storageParameter_def)? ')'
    {context.currentStorageService.addAction($CAPITALIZED_ID.text);} 
;

storageParameter_def :
    lc_id ':'  CAPITALIZED_ID (',' storageParameter_def )?
    { 
     context.constructStorageActionSymlTable($CAPITALIZED_ID.text);    
     context.currentStorageService.addParameter($lc_id.text, $CAPITALIZED_ID.text);  
     context.constructSymbTable($lc_id.text, $CAPITALIZED_ID.text);
    }
;
 

storageDataAccess_def :
     storageGeneratedInfo_def  'accessed-by' storagedataIndex_def
    { context.currentStorageService.addDataAccess(); }
;

storageGeneratedInfo_def : 
    'generate' lc_id ':'  CAPITALIZED_ID
    {
     context.constructStorageSymblTable($CAPITALIZED_ID.text);
      context.constructResponseTypeSymblTable($lc_id.text, $CAPITALIZED_ID.text);
      context.constructConsumeInfoSymblTable($lc_id.text, $CAPITALIZED_ID.text); 
      context.currentStorageService.addGeneratedInfo($lc_id.text, $CAPITALIZED_ID.text);        
      context.constructSymbTable($lc_id.text, $CAPITALIZED_ID.text);
   
    
   
    }
;

storagedataIndex_def:
        lc_id ':' dataType
        { context.currentStorageService.addDataAccessIndex($lc_id.text, $dataType.text); 
        context.constructStorageInfoSymblTable($lc_id.text, $dataType.text);
        
         }
;

lc_id: ID  
;
 
dataType:
  primitiveType  
;
 
primitiveType:
  (id='Integer' | id='Boolean' | id='String' |  id = 'double' | id = 'long' | id='boolean'|id ='_')
;


ID  : 'a'..'z'  ('a'..'z' | 'A'..'Z' | '0'..'9')* ;

EXPRESSION : 'a'..'z'  ('a'..'z' | 'A'..'Z')* ('>' |'<'|'=')* ('0'..'9')*;

   
INT : '0'..'9'('0'..'9')* ;

UNIT :   (id = 'PPM' | id = 'miliseconds' | id = 'seconds' | id = 'minutes' | id = 'ppm')   
;     
    
 
CAPITALIZED_ID: 'A'..'Z' ('a'..'z' | 'A'..'Z' )*;

WS: ('\t' | ' ' | '\r' | '\n' | '\u000C')+ {$channel = HIDDEN;};