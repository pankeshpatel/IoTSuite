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
    'region' ':' (location_def)* 
    'type' ':' (device_type)* ';'
    'resources' ':' (abilities_def)* ';'
    (mobileFlag_def)* ';'
    { context.currentNetwork.addDeviceObj();}
;

// Region Definition

location_def :
    CAPITALIZED_ID ':' INT ';'
    {context.currentNetwork.addRegionLabel($CAPITALIZED_ID.text);
    context.currentNetwork.addRegionValue($INT.text);}
;

// Device Type
device_type :
     CAPITALIZED_ID 
    {context.currentNetwork.setDeviceType($CAPITALIZED_ID.text);}
;

//Attached resources with devices
abilities_def :
   CAPITALIZED_ID (',' abilities_def)?
  {context.currentNetwork.addDeviceAbilities($CAPITALIZED_ID.text);
  }
;

// MobileFlag 
mobileFlag_def :
   'mobile' ':' MOBILEFLAG 
   {context.currentNetwork.setMobileFlag($MOBILEFLAG.text);}
; 


//networkAddress_def :
//  'networkaddress' ':' INT 
//  {context.currentNetwork.setNetworkAddress($INT.text);}
//;







MOBILEFLAG :  'true' | 'false'
   ;

ID  : 'a'..'z'  ('a'..'z' | 'A'..'Z' )* ('0'..'9')*
   ;
   
INT : '0'..'9'('0'..'9')*  ; 

CAPITALIZED_ID: 'A'..'Z' ('a'..'z' | 'A'..'Z' )* ('0'..'9')*;

WS: ('\t' | ' ' | '\r' | '\n' | '\u000C')+ {$channel = HIDDEN;};