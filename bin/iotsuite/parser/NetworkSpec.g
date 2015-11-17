grammar NetworkSpec;

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
  

networkspec: 
      'devices' ':'
      { context = new SymbolTable();
      }
       (device_def)*     
    ;
    
device_def:
   deviceName = (ID|CAPITALIZED_ID) ':' 
   { 
   context.currentNetwork = new DeviceCompiler();
   context.currentNetwork.setDeviceName($deviceName.text);
   }   
    'location' ':' (location_def)* 
    'platform' ':' (device_type)* ';' 
    'resources' ':' (abilities_def)?  ';'
    'protocol' ':' (protocol_value)* ';'
    ('database' ':' database_def ';')*      
     'description' ':'  (description_def)* ';'     
    { context.currentNetwork.addDeviceObj();}
; 
   
location_def :
    CAPITALIZED_ID ':' ID ';'
    {context.currentNetwork.addRegionLabel($CAPITALIZED_ID.text);
    context.currentNetwork.addRegionValue($ID.text);}    
;  

// Device Type
device_type :
     CAPITALIZED_ID 
    {context.currentNetwork.setDeviceType($CAPITALIZED_ID.text);}
;

abilities_def :
   CAPITALIZED_ID (',' abilities_def)?
  {context.currentNetwork.addDeviceAbilities($CAPITALIZED_ID.text);
  }
;
 
protocol_value:
  ID    
  {context.currentNetwork.setProtocol($ID.text);}
;

description_def:
   '"'DESCRIPTION_ID '"'
   {context.currentNetwork.setDeviceDescription($DESCRIPTION_ID.text);}
;   

database_def:
CAPITALIZED_ID
{context.currentNetwork.setDatabase($CAPITALIZED_ID.text);}
;
 
MOBILEFLAG :  'true' | 'false' 
   ;

      
 
ID  : ('a'..'z'  ('a'..'z' | 'A'..'Z' )* ('0'..'9')*)| '0'..'9'('0'..'9')*|'*' ;

DESCRIPTION_ID:   ('a'..'z'|'0'..'9')('a'..'z' | 'A'..'Z'| '0'..'9'| ' ')* ;   

CAPITALIZED_ID: 'A'..'Z' ('a'..'z' | 'A'..'Z' )* ('0'..'9')*;

 
WS: ('\t' | ' ' | '\r' | '\n' | '\u000C')+ {$channel = HIDDEN;};