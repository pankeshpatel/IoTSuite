// $ANTLR 3.5.1 S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g 2015-11-27 10:37:20
     
package iotsuite.parser;
import iotsuite.compiler.*;  
import iotsuite.semanticmodel.*;   
      


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InteractionSpecParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CAPITALIZED_ID", "ID", "INT", 
		"WS", "'('", "')'", "','", "':'", "';'", "'Boolean'", "'Integer'", "'String'", 
		"'action'", "'boolean'", "'command'", "'double'", "'from'", "'long'", 
		"'notify'", "'request'", "'resources'", "'structs'", "'to'", "'userInteractions'", 
		"'with'"
	};
	public static final int EOF=-1;
	public static final int T__8=8;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int CAPITALIZED_ID=4;
	public static final int ID=5;
	public static final int INT=6;
	public static final int WS=7;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public InteractionSpecParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public InteractionSpecParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return InteractionSpecParser.tokenNames; }
	@Override public String getGrammarFileName() { return "S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g"; }


	  private SymbolTable context;



	// $ANTLR start "interactionSpec"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:23:1: interactionSpec : abilities_def ;
	public final void interactionSpec() throws RecognitionException {
		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:23:17: ( abilities_def )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:24:5: abilities_def
			{
			 context = new SymbolTable();
			    
			pushFollow(FOLLOW_abilities_def_in_interactionSpec78);
			abilities_def();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "interactionSpec"



	// $ANTLR start "abilities_def"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:29:1: abilities_def : 'resources' ':' ( 'structs' ':' struct_def )* ( 'userInteractions' ':' ( gui_def )+ )* ;
	public final void abilities_def() throws RecognitionException {
		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:29:15: ( 'resources' ':' ( 'structs' ':' struct_def )* ( 'userInteractions' ':' ( gui_def )+ )* )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:30:1: 'resources' ':' ( 'structs' ':' struct_def )* ( 'userInteractions' ':' ( gui_def )+ )*
			{
			match(input,24,FOLLOW_24_in_abilities_def97); 
			match(input,11,FOLLOW_11_in_abilities_def99); 
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:31:3: ( 'structs' ':' struct_def )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==25) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:31:4: 'structs' ':' struct_def
					{
					match(input,25,FOLLOW_25_in_abilities_def104); 
					match(input,11,FOLLOW_11_in_abilities_def106); 
					pushFollow(FOLLOW_struct_def_in_abilities_def108);
					struct_def();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}

			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:32:3: ( 'userInteractions' ':' ( gui_def )+ )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==27) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:32:4: 'userInteractions' ':' ( gui_def )+
					{
					match(input,27,FOLLOW_27_in_abilities_def117); 
					match(input,11,FOLLOW_11_in_abilities_def119); 
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:32:27: ( gui_def )+
					int cnt2=0;
					loop2:
					while (true) {
						int alt2=2;
						int LA2_0 = input.LA(1);
						if ( (LA2_0==CAPITALIZED_ID) ) {
							alt2=1;
						}

						switch (alt2) {
						case 1 :
							// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:32:28: gui_def
							{
							pushFollow(FOLLOW_gui_def_in_abilities_def122);
							gui_def();
							state._fsp--;

							}
							break;

						default :
							if ( cnt2 >= 1 ) break loop2;
							EarlyExitException eee = new EarlyExitException(2, input);
							throw eee;
						}
						cnt2++;
					}

					}
					break;

				default :
					break loop3;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "abilities_def"



	// $ANTLR start "struct_def"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:35:1: struct_def : CAPITALIZED_ID ( structField_def ';' )+ ;
	public final void struct_def() throws RecognitionException {
		Token CAPITALIZED_ID1=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:35:11: ( CAPITALIZED_ID ( structField_def ';' )+ )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:36:5: CAPITALIZED_ID ( structField_def ';' )+
			{
			CAPITALIZED_ID1=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_struct_def145); 
			context.currentStruct = new StructCompiler((CAPITALIZED_ID1!=null?CAPITALIZED_ID1.getText():null));
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:38:5: ( structField_def ';' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==ID) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:38:6: structField_def ';'
					{
					pushFollow(FOLLOW_structField_def_in_struct_def159);
					structField_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_struct_def161); 
					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			context.currentStruct.generateStructureCode();
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "struct_def"



	// $ANTLR start "structField_def"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:41:1: structField_def : lc_id ':' dataType ;
	public final void structField_def() throws RecognitionException {
		ParserRuleReturnScope lc_id2 =null;
		ParserRuleReturnScope dataType3 =null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:41:16: ( lc_id ':' dataType )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:42:3: lc_id ':' dataType
			{
			pushFollow(FOLLOW_lc_id_in_structField_def184);
			lc_id2=lc_id();
			state._fsp--;

			match(input,11,FOLLOW_11_in_structField_def186); 
			pushFollow(FOLLOW_dataType_in_structField_def188);
			dataType3=dataType();
			state._fsp--;

			 context.currentStruct.addField((lc_id2!=null?input.toString(lc_id2.start,lc_id2.stop):null), (dataType3!=null?input.toString(dataType3.start,dataType3.stop):null));
			  context.constructStructSymblTable(context.currentStruct.getStructName(),context.currentStruct);  
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "structField_def"


	public static class lc_id_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "lc_id"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:48:1: lc_id : ID ;
	public final InteractionSpecParser.lc_id_return lc_id() throws RecognitionException {
		InteractionSpecParser.lc_id_return retval = new InteractionSpecParser.lc_id_return();
		retval.start = input.LT(1);

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:48:6: ( ID )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:48:8: ID
			{
			match(input,ID,FOLLOW_ID_in_lc_id205); 
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "lc_id"


	public static class dataType_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "dataType"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:51:1: dataType : primitiveType ;
	public final InteractionSpecParser.dataType_return dataType() throws RecognitionException {
		InteractionSpecParser.dataType_return retval = new InteractionSpecParser.dataType_return();
		retval.start = input.LT(1);

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:51:9: ( primitiveType )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:52:3: primitiveType
			{
			pushFollow(FOLLOW_primitiveType_in_dataType218);
			primitiveType();
			state._fsp--;

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "dataType"



	// $ANTLR start "primitiveType"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:55:1: primitiveType : (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' ) ;
	public final void primitiveType() throws RecognitionException {
		Token id=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:55:14: ( (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' ) )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:56:3: (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' )
			{
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:56:3: (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' )
			int alt5=6;
			switch ( input.LA(1) ) {
			case 14:
				{
				alt5=1;
				}
				break;
			case 13:
				{
				alt5=2;
				}
				break;
			case 15:
				{
				alt5=3;
				}
				break;
			case 19:
				{
				alt5=4;
				}
				break;
			case 21:
				{
				alt5=5;
				}
				break;
			case 17:
				{
				alt5=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:56:4: id= 'Integer'
					{
					id=(Token)match(input,14,FOLLOW_14_in_primitiveType233); 
					}
					break;
				case 2 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:56:19: id= 'Boolean'
					{
					id=(Token)match(input,13,FOLLOW_13_in_primitiveType239); 
					}
					break;
				case 3 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:56:34: id= 'String'
					{
					id=(Token)match(input,15,FOLLOW_15_in_primitiveType245); 
					}
					break;
				case 4 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:56:49: id= 'double'
					{
					id=(Token)match(input,19,FOLLOW_19_in_primitiveType254); 
					}
					break;
				case 5 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:56:65: id= 'long'
					{
					id=(Token)match(input,21,FOLLOW_21_in_primitiveType262); 
					}
					break;
				case 6 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:56:79: id= 'boolean'
					{
					id=(Token)match(input,17,FOLLOW_17_in_primitiveType268); 
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "primitiveType"



	// $ANTLR start "gui_def"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:68:1: gui_def : CAPITALIZED_ID ( gui_command_def ';' )* ( gui_request_def ';' )* ( gui_notify_def ';' )* ;
	public final void gui_def() throws RecognitionException {
		Token CAPITALIZED_ID4=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:68:8: ( CAPITALIZED_ID ( gui_command_def ';' )* ( gui_request_def ';' )* ( gui_notify_def ';' )* )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:69:3: CAPITALIZED_ID ( gui_command_def ';' )* ( gui_request_def ';' )* ( gui_notify_def ';' )*
			{
			context.currentGUI = new UserInterfaceCompiler();
			CAPITALIZED_ID4=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_gui_def396); 
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:71:4: ( gui_command_def ';' )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==18) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:71:5: gui_command_def ';'
					{
					pushFollow(FOLLOW_gui_command_def_in_gui_def402);
					gui_command_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_gui_def404); 
					}
					break;

				default :
					break loop6;
				}
			}

			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:72:4: ( gui_request_def ';' )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==23) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:72:5: gui_request_def ';'
					{
					pushFollow(FOLLOW_gui_request_def_in_gui_def415);
					gui_request_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_gui_def418); 
					}
					break;

				default :
					break loop7;
				}
			}

			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:73:5: ( gui_notify_def ';' )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==22) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:73:6: gui_notify_def ';'
					{
					pushFollow(FOLLOW_gui_notify_def_in_gui_def430);
					gui_notify_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_gui_def433); 
					}
					break;

				default :
					break loop8;
				}
			}

			context.currentGUI.setGUIName((CAPITALIZED_ID4!=null?CAPITALIZED_ID4.getText():null)); 
			    context.currentGUI.createGUIObject();
			    context.currentGUI.generateCode();
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "gui_def"



	// $ANTLR start "gui_command_def"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:79:1: gui_command_def : 'command' name= CAPITALIZED_ID '(' ( gui_command_parameter_def )? ')' 'to' CAPITALIZED_ID ;
	public final void gui_command_def() throws RecognitionException {
		Token name=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:79:17: ( 'command' name= CAPITALIZED_ID '(' ( gui_command_parameter_def )? ')' 'to' CAPITALIZED_ID )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:80:5: 'command' name= CAPITALIZED_ID '(' ( gui_command_parameter_def )? ')' 'to' CAPITALIZED_ID
			{
			match(input,18,FOLLOW_18_in_gui_command_def460); 
			name=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_gui_command_def467); 
			match(input,8,FOLLOW_8_in_gui_command_def469); 
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:80:42: ( gui_command_parameter_def )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==ID) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:80:43: gui_command_parameter_def
					{
					pushFollow(FOLLOW_gui_command_parameter_def_in_gui_command_def472);
					gui_command_parameter_def();
					state._fsp--;

					}
					break;

			}

			match(input,9,FOLLOW_9_in_gui_command_def476); 
			match(input,26,FOLLOW_26_in_gui_command_def478); 
			match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_gui_command_def480); 
			 
			      context.currentGUI.addCommand((name!=null?name.getText():null));   
			    
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "gui_command_def"



	// $ANTLR start "gui_command_parameter_def"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:87:1: gui_command_parameter_def : lc_id ( ',' gui_command_parameter_def )? ;
	public final void gui_command_parameter_def() throws RecognitionException {
		ParserRuleReturnScope lc_id5 =null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:87:27: ( lc_id ( ',' gui_command_parameter_def )? )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:88:5: lc_id ( ',' gui_command_parameter_def )?
			{
			pushFollow(FOLLOW_lc_id_in_gui_command_parameter_def502);
			lc_id5=lc_id();
			state._fsp--;

			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:88:11: ( ',' gui_command_parameter_def )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==10) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:88:12: ',' gui_command_parameter_def
					{
					match(input,10,FOLLOW_10_in_gui_command_parameter_def505); 
					pushFollow(FOLLOW_gui_command_parameter_def_in_gui_command_parameter_def507);
					gui_command_parameter_def();
					state._fsp--;

					}
					break;

			}

			 
			    context.currentGUI.addCommandParameter((lc_id5!=null?input.toString(lc_id5.start,lc_id5.stop):null)); 
			    
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "gui_command_parameter_def"



	// $ANTLR start "gui_action_def"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:94:1: gui_action_def : 'action' name= CAPITALIZED_ID '(' ( gui_action_parameter_def )? ')' 'with' ui= lc_id ;
	public final void gui_action_def() throws RecognitionException {
		Token name=null;
		ParserRuleReturnScope ui =null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:94:15: ( 'action' name= CAPITALIZED_ID '(' ( gui_action_parameter_def )? ')' 'with' ui= lc_id )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:95:5: 'action' name= CAPITALIZED_ID '(' ( gui_action_parameter_def )? ')' 'with' ui= lc_id
			{
			match(input,16,FOLLOW_16_in_gui_action_def528); 
			name=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_gui_action_def534); 
			match(input,8,FOLLOW_8_in_gui_action_def536); 
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:95:40: ( gui_action_parameter_def )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==ID) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:95:41: gui_action_parameter_def
					{
					pushFollow(FOLLOW_gui_action_parameter_def_in_gui_action_def539);
					gui_action_parameter_def();
					state._fsp--;

					}
					break;

			}

			match(input,9,FOLLOW_9_in_gui_action_def543); 
			match(input,28,FOLLOW_28_in_gui_action_def545); 
			pushFollow(FOLLOW_lc_id_in_gui_action_def551);
			ui=lc_id();
			state._fsp--;

			 context.currentGUI.addAction((name!=null?name.getText():null), (ui!=null?input.toString(ui.start,ui.stop):null) ); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "gui_action_def"



	// $ANTLR start "gui_action_parameter_def"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:99:1: gui_action_parameter_def : lc_id ':' CAPITALIZED_ID ( ',' gui_action_parameter_def )? ;
	public final void gui_action_parameter_def() throws RecognitionException {
		Token CAPITALIZED_ID7=null;
		ParserRuleReturnScope lc_id6 =null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:99:26: ( lc_id ':' CAPITALIZED_ID ( ',' gui_action_parameter_def )? )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:100:5: lc_id ':' CAPITALIZED_ID ( ',' gui_action_parameter_def )?
			{
			pushFollow(FOLLOW_lc_id_in_gui_action_parameter_def571);
			lc_id6=lc_id();
			state._fsp--;

			match(input,11,FOLLOW_11_in_gui_action_parameter_def573); 
			CAPITALIZED_ID7=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_gui_action_parameter_def576); 
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:100:31: ( ',' gui_action_parameter_def )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==10) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:100:32: ',' gui_action_parameter_def
					{
					match(input,10,FOLLOW_10_in_gui_action_parameter_def579); 
					pushFollow(FOLLOW_gui_action_parameter_def_in_gui_action_parameter_def581);
					gui_action_parameter_def();
					state._fsp--;

					}
					break;

			}

			 
			    context.currentGUI.addActionParameter((lc_id6!=null?input.toString(lc_id6.start,lc_id6.stop):null), (CAPITALIZED_ID7!=null?CAPITALIZED_ID7.getText():null)); 
			    context.constructSymbTable((lc_id6!=null?input.toString(lc_id6.start,lc_id6.stop):null), (CAPITALIZED_ID7!=null?CAPITALIZED_ID7.getText():null));
			    
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "gui_action_parameter_def"



	// $ANTLR start "gui_request_def"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:107:1: gui_request_def : 'request' lc_id 'to' CAPITALIZED_ID ;
	public final void gui_request_def() throws RecognitionException {
		ParserRuleReturnScope lc_id8 =null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:107:17: ( 'request' lc_id 'to' CAPITALIZED_ID )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:108:4: 'request' lc_id 'to' CAPITALIZED_ID
			{
			match(input,23,FOLLOW_23_in_gui_request_def603); 
			pushFollow(FOLLOW_lc_id_in_gui_request_def605);
			lc_id8=lc_id();
			state._fsp--;

			match(input,26,FOLLOW_26_in_gui_request_def607); 
			match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_gui_request_def609); 
			 context.currentGUI.getDataAccessListFromSymblTable((lc_id8!=null?input.toString(lc_id8.start,lc_id8.stop):null));
			     context.currentGUI.setRequestType(context.getResponseTypeSymblTable((lc_id8!=null?input.toString(lc_id8.start,lc_id8.stop):null)));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "gui_request_def"



	// $ANTLR start "gui_notify_def"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:113:1: gui_notify_def : 'notify' ( gui_display_def )* 'from' CAPITALIZED_ID ;
	public final void gui_notify_def() throws RecognitionException {
		Token CAPITALIZED_ID9=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:113:16: ( 'notify' ( gui_display_def )* 'from' CAPITALIZED_ID )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:114:5: 'notify' ( gui_display_def )* 'from' CAPITALIZED_ID
			{
			match(input,22,FOLLOW_22_in_gui_notify_def631); 
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:114:14: ( gui_display_def )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==CAPITALIZED_ID) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:114:15: gui_display_def
					{
					pushFollow(FOLLOW_gui_display_def_in_gui_notify_def634);
					gui_display_def();
					state._fsp--;

					}
					break;

				default :
					break loop13;
				}
			}

			match(input,20,FOLLOW_20_in_gui_notify_def638); 
			CAPITALIZED_ID9=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_gui_notify_def640); 
			context.currentGUI.notifyFrom((CAPITALIZED_ID9!=null?CAPITALIZED_ID9.getText():null));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "gui_notify_def"



	// $ANTLR start "gui_display_def"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:118:1: gui_display_def : CAPITALIZED_ID '(' gui_notify_parameter_def ')' ;
	public final void gui_display_def() throws RecognitionException {
		Token CAPITALIZED_ID10=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:118:17: ( CAPITALIZED_ID '(' gui_notify_parameter_def ')' )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:120:3: CAPITALIZED_ID '(' gui_notify_parameter_def ')'
			{
			CAPITALIZED_ID10=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_gui_display_def664); 

			   context.currentActuator = new ActuatorCompiler((CAPITALIZED_ID10!=null?CAPITALIZED_ID10.getText():null)); 
			match(input,8,FOLLOW_8_in_gui_display_def676); 
			pushFollow(FOLLOW_gui_notify_parameter_def_in_gui_display_def678);
			gui_notify_parameter_def();
			state._fsp--;

			match(input,9,FOLLOW_9_in_gui_display_def680); 

			   context.currentActuator.addAction((CAPITALIZED_ID10!=null?CAPITALIZED_ID10.getText():null)); 
			  // context.currentActuator.generateActuatorCode();
			   context.currentGUI.setNotifyName((CAPITALIZED_ID10!=null?CAPITALIZED_ID10.getText():null));
			   
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "gui_display_def"



	// $ANTLR start "gui_notify_parameter_def"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:131:1: gui_notify_parameter_def : lc_id ':' CAPITALIZED_ID ( ',' gui_notify_parameter_def )? ;
	public final void gui_notify_parameter_def() throws RecognitionException {
		Token CAPITALIZED_ID11=null;
		ParserRuleReturnScope lc_id12 =null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:131:25: ( lc_id ':' CAPITALIZED_ID ( ',' gui_notify_parameter_def )? )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:133:1: lc_id ':' CAPITALIZED_ID ( ',' gui_notify_parameter_def )?
			{
			pushFollow(FOLLOW_lc_id_in_gui_notify_parameter_def697);
			lc_id12=lc_id();
			state._fsp--;

			match(input,11,FOLLOW_11_in_gui_notify_parameter_def699); 
			CAPITALIZED_ID11=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_gui_notify_parameter_def701); 
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:133:27: ( ',' gui_notify_parameter_def )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==10) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:133:28: ',' gui_notify_parameter_def
					{
					match(input,10,FOLLOW_10_in_gui_notify_parameter_def705); 
					pushFollow(FOLLOW_gui_notify_parameter_def_in_gui_notify_parameter_def707);
					gui_notify_parameter_def();
					state._fsp--;

					}
					break;

			}

			  
			  context.constructActuatorSymblTable((CAPITALIZED_ID11!=null?CAPITALIZED_ID11.getText():null));
			  context.currentActuator.addParameter((lc_id12!=null?input.toString(lc_id12.start,lc_id12.stop):null), (CAPITALIZED_ID11!=null?CAPITALIZED_ID11.getText():null)); 
			  context.currentGUI.setNotifyParameter((CAPITALIZED_ID11!=null?CAPITALIZED_ID11.getText():null));
			   context.constructSymbTable((lc_id12!=null?input.toString(lc_id12.start,lc_id12.stop):null), (CAPITALIZED_ID11!=null?CAPITALIZED_ID11.getText():null));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "gui_notify_parameter_def"

	// Delegated rules



	public static final BitSet FOLLOW_abilities_def_in_interactionSpec78 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_abilities_def97 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_abilities_def99 = new BitSet(new long[]{0x000000000A000002L});
	public static final BitSet FOLLOW_25_in_abilities_def104 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_abilities_def106 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_struct_def_in_abilities_def108 = new BitSet(new long[]{0x000000000A000002L});
	public static final BitSet FOLLOW_27_in_abilities_def117 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_abilities_def119 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_gui_def_in_abilities_def122 = new BitSet(new long[]{0x0000000008000012L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_struct_def145 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_structField_def_in_struct_def159 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_struct_def161 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_lc_id_in_structField_def184 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_structField_def186 = new BitSet(new long[]{0x00000000002AE000L});
	public static final BitSet FOLLOW_dataType_in_structField_def188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_lc_id205 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveType_in_dataType218 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_primitiveType233 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_primitiveType239 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_primitiveType245 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_primitiveType254 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_primitiveType262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_primitiveType268 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_def396 = new BitSet(new long[]{0x0000000000C40002L});
	public static final BitSet FOLLOW_gui_command_def_in_gui_def402 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_gui_def404 = new BitSet(new long[]{0x0000000000C40002L});
	public static final BitSet FOLLOW_gui_request_def_in_gui_def415 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_gui_def418 = new BitSet(new long[]{0x0000000000C00002L});
	public static final BitSet FOLLOW_gui_notify_def_in_gui_def430 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_gui_def433 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_18_in_gui_command_def460 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_command_def467 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_gui_command_def469 = new BitSet(new long[]{0x0000000000000220L});
	public static final BitSet FOLLOW_gui_command_parameter_def_in_gui_command_def472 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_gui_command_def476 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_gui_command_def478 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_command_def480 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lc_id_in_gui_command_parameter_def502 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_10_in_gui_command_parameter_def505 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_gui_command_parameter_def_in_gui_command_parameter_def507 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_gui_action_def528 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_action_def534 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_gui_action_def536 = new BitSet(new long[]{0x0000000000000220L});
	public static final BitSet FOLLOW_gui_action_parameter_def_in_gui_action_def539 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_gui_action_def543 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_gui_action_def545 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_lc_id_in_gui_action_def551 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lc_id_in_gui_action_parameter_def571 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_gui_action_parameter_def573 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_action_parameter_def576 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_10_in_gui_action_parameter_def579 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_gui_action_parameter_def_in_gui_action_parameter_def581 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_gui_request_def603 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_lc_id_in_gui_request_def605 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_gui_request_def607 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_request_def609 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_gui_notify_def631 = new BitSet(new long[]{0x0000000000100010L});
	public static final BitSet FOLLOW_gui_display_def_in_gui_notify_def634 = new BitSet(new long[]{0x0000000000100010L});
	public static final BitSet FOLLOW_20_in_gui_notify_def638 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_notify_def640 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_display_def664 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_gui_display_def676 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_gui_notify_parameter_def_in_gui_display_def678 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_gui_display_def680 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lc_id_in_gui_notify_parameter_def697 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_gui_notify_parameter_def699 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_notify_parameter_def701 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_10_in_gui_notify_parameter_def705 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_gui_notify_parameter_def_in_gui_notify_parameter_def707 = new BitSet(new long[]{0x0000000000000002L});
}
