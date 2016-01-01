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
    context.currentMappingConstraint = new MapperCompiler(); 
    }       
    ('structs' ':' struct_def)*  
    'softwareComponents' ':' (component_def )* 
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

  ('Common' ':')*       
        (agg_cs_def)*
   ('Custom' ':')     
        (controller_def)+    
        
    // ('Custom'     ':' (coordinator_def)* )* 
    // ('Controller' ':' (controller_def)* )* 
;       


 
agg_cs_def:  

 CAPITALIZED_ID
    { 
     context.currentComputationalService = new ComputationalServiceCompiler(); 
     context.currentMappingConstraint.setSoftwareComponentName($CAPITALIZED_ID.text);} 
    (csConsumeInfo_def ';')* 
    (csOperation_def ';')*
    (csGeneratedInfoForAggregator_def ';')*
   // (partition_def ';')+    
    {   
     context.currentComputationalService.setComputationalServiceName($CAPITALIZED_ID.text);
     context.currentComputationalService.createCSObject();
     context.currentMappingConstraint.setSoftwareComponentName($CAPITALIZED_ID.text);
     context.currentMappingConstraint.setSoftwareComponentType("inbuilt");       
      context.currentMappingConstraint.addDeployementConstraintObj(); // This line creates a  Symbol Table
      context.currentComputationalService.generateAggregatorComputationalServiceCode(); 
    }
;

//coordinator_def:

//CAPITALIZED_ID
//    { 
//     context.currentComputationalService = new ComputationalServiceCompiler(); 
//     context.currentMappingConstraint.setSoftwareComponentName($CAPITALIZED_ID.text);} 
//    (csConsumeInfo_def ';')* 
//    (csRequest_def ';')*
//    (csGeneratedInfo_def ';')*
   //(partition_def ';')+  
//    { 
//    context.currentComputationalService.setComputationalServiceName($CAPITALIZED_ID.text);
//     context.currentComputationalService.createCSObject();
//    context.currentComputationalService.generateComputationalServiceCode(); 
//   context.currentMappingConstraint.setSoftwareComponentName($CAPITALIZED_ID.text);
//   context.currentMappingConstraint.setSoftwareComponentType("custom"); 
//    context.currentMappingConstraint.addDeployementConstraintObj(); // This line creates a  Symbol Table
   
//    }
//;   

controller_def:

 CAPITALIZED_ID
    { 
     context.currentComputationalService = new ComputationalServiceCompiler(); 
     context.currentMappingConstraint.setSoftwareComponentName($CAPITALIZED_ID.text);
     } 
    (csConsumeInfo_def ';')*  // Input
     (csRequest_def ';')*  // Input
    (csGeneratedInfo_def ';')*   // output
    (cntrlCommand_def ';')*   //output 
   //  (partition_def ';')+   
    { 
    context.currentComputationalService.setComputationalServiceName($CAPITALIZED_ID.text);
     context.currentComputationalService.createCSObject();
    context.currentComputationalService.generateComputationalServiceCode(); 
   context.currentMappingConstraint.setSoftwareComponentName($CAPITALIZED_ID.text);
      context.currentMappingConstraint.setSoftwareComponentType("custom");  
   context.currentMappingConstraint.addDeployementConstraintObj(); 
   } 
;
  
csOperation_def :
    'COMPUTE(' CAPITALIZED_ID'_BY_SAMPLE' ',' INT ')'  
    { context.currentComputationalService.addOperation($CAPITALIZED_ID.text,$INT.text);  }  
;
  
csGeneratedInfoForAggregator_def:
 'generate' lc_id ':'  CAPITALIZED_ID
    { 
    context.currentComputationalService.addGeneratedInfo($lc_id.text, $CAPITALIZED_ID.text); 
    context.constructSymbTable($lc_id.text, $CAPITALIZED_ID.text);
    context.constructAggregatorSymblTable($CAPITALIZED_ID.text);
     context.constructGUISymblTable($lc_id.text, $CAPITALIZED_ID.text);   
    }
;


csGeneratedInfo_def:
    'generate' lc_id ':'  CAPITALIZED_ID
    { context.currentComputationalService.addGeneratedInfo($lc_id.text, $CAPITALIZED_ID.text); 
    context.constructSymbTable($lc_id.text, $CAPITALIZED_ID.text);
    context.constructGUISymblTable($lc_id.text, $CAPITALIZED_ID.text);
     }
;
  
csConsumeInfo_def:   
    // 'consume' lc_id 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID  
    'consume' lc_id  'from'  CAPITALIZED_ID       
   { context.currentComputationalService.addConsumedInfo($lc_id.text);    
   }     
;  

csRequest_def :
   'request' lc_id 'to' CAPITALIZED_ID
   { context.currentComputationalService.getDataAccessListFromSymblTable($lc_id.text);}
; 
 

cntrlCommand_def :
    //'command'  name = CAPITALIZED_ID '(' (cntrlParameter_def)? ')' 'to'  'region-hops' ':' INT ':' CAPITALIZED_ID
     'command'  name = CAPITALIZED_ID '(' (cntrlParameter_def)? ')' 'to'  CAPITALIZED_ID
    { 
      context.currentComputationalService.addCommand($name.text);  
    }
;

cntrlParameter_def :
    lc_id  
    { context.currentComputationalService.addParameter($lc_id.text); }  
;  
  
//partition_def:   
//    csDeploymentConstraint='partition-per' ':' CAPITALIZED_ID 
//    { 
//    context.currentComputationalService.addPartitionAttribute($CAPITALIZED_ID.text);   
//    context.currentMappingConstraint.setAttributeName($csDeploymentConstraint.text);  
//    context.currentMappingConstraint.setAttributeValue($CAPITALIZED_ID.text); 
//   }      
//;       
 
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

CAPITALIZED_ID: 'A'..'Z' ('a'..'z' | 'A'..'Z' )*  ;      

WS:  ('\t' | ' ' | '\r' | '\n' | '\u000C')+ {$channel = HIDDEN;};  

