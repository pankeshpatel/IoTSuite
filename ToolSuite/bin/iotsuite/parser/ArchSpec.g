grammar ArchSpec;  

options {
  language     = Java;  
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
     
archSpec : 
    { context = new SymbolTable();
   context.currentRegion = new RegionCompiler();
    context.currentMappingConstraint = new MapperCompiler(); 
    }
     { context.currentRegion.generateRegionCode(); }    
    ('structs' ':' struct_def)* // see this is *. so, it is optional. :)  
     'softwarecomponents' ':' (component_def)+
;   
  
component_def :
    'computationalService' ':' (cs_def)   
;

 

struct_def: 
    CAPITALIZED_ID 
    {context.currentStruct = new StructCompiler($CAPITALIZED_ID.text);}
    (structField_def ';')+   
    {context.currentStruct.generateStructureCode();}
; 
structField_def:  
  lc_id ':' dataType 
  { context.currentStruct.addField($lc_id.text, $dataType.text);
  context.constructStructSymblTable(context.currentStruct.getStructName(),context.currentStruct);  }  
; 




cs_def:

    (agg_cs_def)*
    (computatinal_def)+ 

   
;

 
agg_cs_def:

 ('AGG'':') CAPITALIZED_ID
    { 
     context.currentComputationalService = new ComputationalServiceCompiler(); 
     context.currentMappingConstraint.setSoftwareComponentName($CAPITALIZED_ID.text);} 
    (csConsumeInfo_def ';')* 
    (csOperation_def ';')*
     (csGeneratedInfo_def ';')*
    (partition_def ';')+  
    {  
     context.currentComputationalService.setComputationalServiceName($CAPITALIZED_ID.text);
     context.currentComputationalService.createCSObject();
   context.currentComputationalService.generateAggregatorComputationalServiceCode(); 
    context.currentMappingConstraint.setSoftwareComponentName($CAPITALIZED_ID.text);
    context.currentMappingConstraint.addDeployementConstraintObj(); // This line creates a  Symbol Table
   
    }
;



computatinal_def:

 CAPITALIZED_ID
    { 
     context.currentComputationalService = new ComputationalServiceCompiler(); 
     context.currentMappingConstraint.setSoftwareComponentName($CAPITALIZED_ID.text);} 
    (csConsumeInfo_def ';')* 
    (csRequest_def  ';')*
    (csGeneratedInfo_def ';')*
    (cntrlCommand_def ';')*   
    (partition_def ';')+  
    { 
    context.currentComputationalService.setComputationalServiceName($CAPITALIZED_ID.text);
     context.currentComputationalService.createCSObject();
    context.currentComputationalService.generateComputationalServiceCode(); 
   context.currentMappingConstraint.setSoftwareComponentName($CAPITALIZED_ID.text);
   context.currentMappingConstraint.addDeployementConstraintObj(); // This line creates a  Symbol Table
   
    }
;
  
csOperation_def :
    'COMPUTE(' CAPITALIZED_ID')'  
    { context.currentComputationalService.addOperation($CAPITALIZED_ID.text);  }  
;
  
csGeneratedInfo_def:
    'generate' lc_id ':'  CAPITALIZED_ID
    { context.currentComputationalService.addGeneratedInfo($lc_id.text, $CAPITALIZED_ID.text); 
    context.constructSymbTable($lc_id.text, $CAPITALIZED_ID.text); }
;
  
csConsumeInfo_def:
    //'consume' lc_id ('from' 'region-hops' ':' INT ':' CAPITALIZED_ID )?
     'consume' lc_id 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID        
   { context.currentComputationalService.addConsumedInfo($lc_id.text);  
    
   }   
;

csRequest_def :
   'request' lc_id 
   { context.currentComputationalService.getDataAccessListFromSymblTable($lc_id.text);}
; 
 

cntrlCommand_def :
    'command'  name = CAPITALIZED_ID '(' (cntrlParameter_def)? ')' 'to'  'region-hops' ':' INT ':' CAPITALIZED_ID
    //'command'  name = CAPITALIZED_ID '(' (cntrlParameter_def)? ')' 'to'  'hops' ':' INT ':' CAPITALIZED_ID  
    { 
      context.currentComputationalService.addCommand($name.text);  
    }
;

cntrlParameter_def :
    lc_id  
    { context.currentComputationalService.addParameter($lc_id.text); }  
;

//cntrlParameter_def :
//    lc_id  (',' parameter_def )?
//    { context.currentComputationalService.addParameter($lc_id.text); }  
//; 
  
partition_def:  
    csDeploymentConstraint='partition-per' ':' CAPITALIZED_ID 
    { 
    context.currentComputationalService.addPartitionAttribute($CAPITALIZED_ID.text);   
    // Next two lines are for  Mapping constraints
    context.currentMappingConstraint.setAttributeName($csDeploymentConstraint.text);  
    context.currentMappingConstraint.setAttributeValue($CAPITALIZED_ID.text); 
   } 
;  

lc_id: ID  
;
 
dataType: 
  primitiveType 
;
 
primitiveType:
  (id='Integer' | id='Boolean' | id='String' |  id = 'double' | id = 'long' | id='boolean' )
;

ID  : 'a'..'z'  ('a'..'z' | 'A'..'Z' )*
   ;
   
INT : '0'..'9'('0'..'9')*  ; 

CAPITALIZED_ID: 'A'..'Z' ('a'..'z' | 'A'..'Z' )*;   

WS: ('\t' | ' ' | '\r' | '\n' | '\u000C')+ {$channel = HIDDEN;};