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
   ('actuators' ':' actuator_def)*
  ('storages'  ':' ss_def)*     
;
 
sensor_def:
      ('periodicsensors' ':'(periodicsensor_def)*)*
      ('eventdriven' ':' (eventsensor_def)*)*
; 

periodicsensor_def:
 CAPITALIZED_ID
    {context.currentSensor = new SensorCompiler($CAPITALIZED_ID.text);}
    (sensorMeasurementForPeriodic_def ';')* 
    (sensorperiodicMeasurement_def ';')*
    {context.currentSensor.generatePeriodicSensorCode();        
    }
;

eventsensor_def:
 CAPITALIZED_ID
    {context.currentSensor = new SensorCompiler($CAPITALIZED_ID.text);}
    (sensorMeasurementForEventDriven_def ';')* 
    (sensoreventMeasurement_def ';')*
    {context.currentSensor.generateEventDrivenSensorCode();}

;

sensorMeasurementForEventDriven_def:
'generate' lc_id ':'  CAPITALIZED_ID  
    {  
    context.currentSensor.addSensorMeasurement($lc_id.text, $CAPITALIZED_ID.text , context.getStructSymblTable($CAPITALIZED_ID.text) ); 
    context.constructSymbTable($lc_id.text, $CAPITALIZED_ID.text);
    context.constructEventDrivenSymblTable($CAPITALIZED_ID.text);
     } 
;

sensorMeasurementForPeriodic_def : 
    'generate' lc_id ':'  CAPITALIZED_ID        
    {      
    context.currentSensor.addSensorMeasurement($lc_id.text, $CAPITALIZED_ID.text , context.getStructSymblTable($CAPITALIZED_ID.text) ); 
    context.constructSymbTable($lc_id.text, $CAPITALIZED_ID.text);  
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
('onCondition' (ID |',' ID)*)*
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
     {
     context.currentStorageService.setStorageServiceName($CAPITALIZED_ID.text);
     context.currentStorageService.createStorageObject();
     context.currentStorageService.generateStorageCode(); 
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
     context.currentStorageService.addGeneratedInfo($lc_id.text, $CAPITALIZED_ID.text);  
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

lc_id: ID  
;
 
dataType:
  primitiveType 
;
 
primitiveType:
  (id='Integer' | id='Boolean' | id='String' |  id = 'double' | id = 'long' | id='boolean'|id ='_')
;


ID  : 'a'..'z'  ('a'..'z' | 'A'..'Z' | '0'..'9')* ;
   
INT : '0'..'9'('0'..'9')* ;


CAPITALIZED_ID: 'A'..'Z' ('a'..'z' | 'A'..'Z' )*;

WS: ('\t' | ' ' | '\r' | '\n' | '\u000C')+ {$channel = HIDDEN;};