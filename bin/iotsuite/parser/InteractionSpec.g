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
  ('userinteractions' ':' (gui_def)+ )*     
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
