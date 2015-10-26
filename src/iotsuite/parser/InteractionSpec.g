grammar InteractionSpec;  

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
 
interactionSpec :  
    { context = new SymbolTable();
    }   
    abilities_def   
;      

abilities_def : 
'resources' ':'
  ('structs' ':' struct_def)*  
  ('userinteractions' ':' (gui_def)+ )*     
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


lc_id: ID  
;
 
dataType:
  primitiveType 
;
 
primitiveType:
  (id='Integer' | id='Boolean' | id='String' |  id = 'double' | id = 'long' | id='boolean' )
;

ID  : 'a'..'z'  ('a'..'z' | 'A'..'Z' | '0'..'9')*
   ;
   
INT : '0'..'9'('0'..'9')*  ; 

CAPITALIZED_ID: 'A'..'Z' ('a'..'z' | 'A'..'Z' )*;

WS: ('\t' | ' ' | '\r' | '\n' | '\u000C')+ {$channel = HIDDEN;};

gui_def:  
  {context.currentGUI = new UserInterfaceCompiler();}  
  CAPITALIZED_ID
   (gui_command_def ';')*   // User interaction - Command
   (gui_request_def  ';')*   //User interaction - Request/Response
    (gui_notify_def  ';')*   //User interaction - Notify
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

gui_notify_def :  
    'notify' (gui_display_def)*  
; 

gui_display_def :
  
  CAPITALIZED_ID  
   {
   context.currentActuator = new ActuatorCompiler($CAPITALIZED_ID.text); }
   '(' gui_notify_parameter_def ')'
   {
   context.currentActuator.addAction($CAPITALIZED_ID.text); 
   context.currentActuator.generateActuatorCode();
   context.currentGUI.setNotifyName($CAPITALIZED_ID.text);
   } 
;

gui_notify_parameter_def:

lc_id ':' CAPITALIZED_ID  (',' gui_notify_parameter_def )?
{  
  context.constructActuatorSymblTable($CAPITALIZED_ID.text);
  context.currentActuator.addParameter($lc_id.text, $CAPITALIZED_ID.text); 
  context.currentGUI.setNotifyParameter($CAPITALIZED_ID.text);
   context.constructSymbTable($lc_id.text, $CAPITALIZED_ID.text);}  
;