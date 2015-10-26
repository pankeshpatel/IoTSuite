// $ANTLR 3.5.1 S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g 2015-10-26 18:44:39
 
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
		"WS", "'('", "')'", "','", "':'", "';'", "'Boolean'", "'Button'", "'Integer'", 
		"'String'", "'TextBox'", "'TextView'", "'action'", "'boolean'", "'command'", 
		"'double'", "'long'", "'notify'", "'request'", "'resources'", "'structs'", 
		"'userinteractions'", "'with'"
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
	public static final int T__29=29;
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
	@Override public String getGrammarFileName() { return "S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g"; }


	  //Initialize the context
	  private SymbolTable context;



	// $ANTLR start "interactionSpec"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:24:1: interactionSpec : abilities_def ;
	public final void interactionSpec() throws RecognitionException {
		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:24:17: ( abilities_def )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:25:5: abilities_def
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
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:30:1: abilities_def : 'resources' ':' ( 'structs' ':' struct_def )* ( 'userinteractions' ':' ( gui_def )+ )* ;
	public final void abilities_def() throws RecognitionException {
		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:30:15: ( 'resources' ':' ( 'structs' ':' struct_def )* ( 'userinteractions' ':' ( gui_def )+ )* )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:31:1: 'resources' ':' ( 'structs' ':' struct_def )* ( 'userinteractions' ':' ( gui_def )+ )*
			{
			match(input,26,FOLLOW_26_in_abilities_def97); 
			match(input,11,FOLLOW_11_in_abilities_def99); 
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:32:2: ( 'structs' ':' struct_def )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==27) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:32:2: 'structs' ':' struct_def
					{
					match(input,27,FOLLOW_27_in_abilities_def102); 
					match(input,11,FOLLOW_11_in_abilities_def104); 
					pushFollow(FOLLOW_struct_def_in_abilities_def106);
					struct_def();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}

			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:33:3: ( 'userinteractions' ':' ( gui_def )+ )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==28) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:33:4: 'userinteractions' ':' ( gui_def )+
					{
					match(input,28,FOLLOW_28_in_abilities_def114); 
					match(input,11,FOLLOW_11_in_abilities_def116); 
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:33:27: ( gui_def )+
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
							// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:33:28: gui_def
							{
							pushFollow(FOLLOW_gui_def_in_abilities_def119);
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
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:36:1: struct_def : CAPITALIZED_ID ( structField_def ';' )+ ;
	public final void struct_def() throws RecognitionException {
		Token CAPITALIZED_ID1=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:36:11: ( CAPITALIZED_ID ( structField_def ';' )+ )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:37:5: CAPITALIZED_ID ( structField_def ';' )+
			{
			CAPITALIZED_ID1=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_struct_def142); 
			context.currentStruct = new StructCompiler((CAPITALIZED_ID1!=null?CAPITALIZED_ID1.getText():null));
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:39:5: ( structField_def ';' )+
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
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:39:6: structField_def ';'
					{
					pushFollow(FOLLOW_structField_def_in_struct_def156);
					structField_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_struct_def158); 
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
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:42:1: structField_def : lc_id ':' dataType ;
	public final void structField_def() throws RecognitionException {
		ParserRuleReturnScope lc_id2 =null;
		ParserRuleReturnScope dataType3 =null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:42:16: ( lc_id ':' dataType )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:43:3: lc_id ':' dataType
			{
			pushFollow(FOLLOW_lc_id_in_structField_def181);
			lc_id2=lc_id();
			state._fsp--;

			match(input,11,FOLLOW_11_in_structField_def183); 
			pushFollow(FOLLOW_dataType_in_structField_def185);
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
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:49:1: lc_id : ID ;
	public final InteractionSpecParser.lc_id_return lc_id() throws RecognitionException {
		InteractionSpecParser.lc_id_return retval = new InteractionSpecParser.lc_id_return();
		retval.start = input.LT(1);

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:49:6: ( ID )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:49:8: ID
			{
			match(input,ID,FOLLOW_ID_in_lc_id202); 
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
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:52:1: dataType : primitiveType ;
	public final InteractionSpecParser.dataType_return dataType() throws RecognitionException {
		InteractionSpecParser.dataType_return retval = new InteractionSpecParser.dataType_return();
		retval.start = input.LT(1);

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:52:9: ( primitiveType )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:53:3: primitiveType
			{
			pushFollow(FOLLOW_primitiveType_in_dataType215);
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
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:56:1: primitiveType : (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' ) ;
	public final void primitiveType() throws RecognitionException {
		Token id=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:56:14: ( (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' ) )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:57:3: (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' )
			{
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:57:3: (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' )
			int alt5=6;
			switch ( input.LA(1) ) {
			case 15:
				{
				alt5=1;
				}
				break;
			case 13:
				{
				alt5=2;
				}
				break;
			case 16:
				{
				alt5=3;
				}
				break;
			case 22:
				{
				alt5=4;
				}
				break;
			case 23:
				{
				alt5=5;
				}
				break;
			case 20:
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
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:57:4: id= 'Integer'
					{
					id=(Token)match(input,15,FOLLOW_15_in_primitiveType230); 
					}
					break;
				case 2 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:57:19: id= 'Boolean'
					{
					id=(Token)match(input,13,FOLLOW_13_in_primitiveType236); 
					}
					break;
				case 3 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:57:34: id= 'String'
					{
					id=(Token)match(input,16,FOLLOW_16_in_primitiveType242); 
					}
					break;
				case 4 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:57:49: id= 'double'
					{
					id=(Token)match(input,22,FOLLOW_22_in_primitiveType251); 
					}
					break;
				case 5 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:57:65: id= 'long'
					{
					id=(Token)match(input,23,FOLLOW_23_in_primitiveType259); 
					}
					break;
				case 6 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:57:79: id= 'boolean'
					{
					id=(Token)match(input,20,FOLLOW_20_in_primitiveType265); 
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
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:69:1: gui_def : CAPITALIZED_ID ( gui_command_def ';' )* ( gui_request_def ';' )* ( gui_notify_def ';' )* ;
	public final void gui_def() throws RecognitionException {
		Token CAPITALIZED_ID4=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:69:8: ( CAPITALIZED_ID ( gui_command_def ';' )* ( gui_request_def ';' )* ( gui_notify_def ';' )* )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:70:3: CAPITALIZED_ID ( gui_command_def ';' )* ( gui_request_def ';' )* ( gui_notify_def ';' )*
			{
			context.currentGUI = new UserInterfaceCompiler();
			CAPITALIZED_ID4=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_gui_def393); 
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:74:4: ( gui_command_def ';' )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==21) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:74:5: gui_command_def ';'
					{
					pushFollow(FOLLOW_gui_command_def_in_gui_def419);
					gui_command_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_gui_def421); 
					}
					break;

				default :
					break loop6;
				}
			}

			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:75:4: ( gui_request_def ';' )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==25) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:75:5: gui_request_def ';'
					{
					pushFollow(FOLLOW_gui_request_def_in_gui_def432);
					gui_request_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_gui_def435); 
					}
					break;

				default :
					break loop7;
				}
			}

			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:76:5: ( gui_notify_def ';' )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==24) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:76:6: gui_notify_def ';'
					{
					pushFollow(FOLLOW_gui_notify_def_in_gui_def447);
					gui_notify_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_gui_def450); 
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
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:82:1: gui_command_def : 'command' name= CAPITALIZED_ID '(' ( gui_command_parameter_def )? ')' ;
	public final void gui_command_def() throws RecognitionException {
		Token name=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:82:17: ( 'command' name= CAPITALIZED_ID '(' ( gui_command_parameter_def )? ')' )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:83:5: 'command' name= CAPITALIZED_ID '(' ( gui_command_parameter_def )? ')'
			{
			match(input,21,FOLLOW_21_in_gui_command_def477); 
			name=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_gui_command_def484); 
			match(input,8,FOLLOW_8_in_gui_command_def486); 
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:83:42: ( gui_command_parameter_def )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==ID) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:83:43: gui_command_parameter_def
					{
					pushFollow(FOLLOW_gui_command_parameter_def_in_gui_command_def489);
					gui_command_parameter_def();
					state._fsp--;

					}
					break;

			}

			match(input,9,FOLLOW_9_in_gui_command_def493); 
			 
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
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:90:1: gui_command_parameter_def : lc_id ( ',' gui_command_parameter_def )? ;
	public final void gui_command_parameter_def() throws RecognitionException {
		ParserRuleReturnScope lc_id5 =null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:90:27: ( lc_id ( ',' gui_command_parameter_def )? )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:91:5: lc_id ( ',' gui_command_parameter_def )?
			{
			pushFollow(FOLLOW_lc_id_in_gui_command_parameter_def516);
			lc_id5=lc_id();
			state._fsp--;

			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:91:11: ( ',' gui_command_parameter_def )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==10) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:91:12: ',' gui_command_parameter_def
					{
					match(input,10,FOLLOW_10_in_gui_command_parameter_def519); 
					pushFollow(FOLLOW_gui_command_parameter_def_in_gui_command_parameter_def521);
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
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:97:1: gui_action_def : 'action' name= CAPITALIZED_ID '(' ( gui_action_parameter_def )? ')' 'with' ui= lc_id ;
	public final void gui_action_def() throws RecognitionException {
		Token name=null;
		ParserRuleReturnScope ui =null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:97:15: ( 'action' name= CAPITALIZED_ID '(' ( gui_action_parameter_def )? ')' 'with' ui= lc_id )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:98:5: 'action' name= CAPITALIZED_ID '(' ( gui_action_parameter_def )? ')' 'with' ui= lc_id
			{
			match(input,19,FOLLOW_19_in_gui_action_def542); 
			name=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_gui_action_def548); 
			match(input,8,FOLLOW_8_in_gui_action_def550); 
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:98:40: ( gui_action_parameter_def )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==ID) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:98:41: gui_action_parameter_def
					{
					pushFollow(FOLLOW_gui_action_parameter_def_in_gui_action_def553);
					gui_action_parameter_def();
					state._fsp--;

					}
					break;

			}

			match(input,9,FOLLOW_9_in_gui_action_def557); 
			match(input,29,FOLLOW_29_in_gui_action_def559); 
			pushFollow(FOLLOW_lc_id_in_gui_action_def565);
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
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:108:1: gui_action_parameter_def : lc_id ':' CAPITALIZED_ID ( ',' gui_action_parameter_def )? ;
	public final void gui_action_parameter_def() throws RecognitionException {
		Token CAPITALIZED_ID7=null;
		ParserRuleReturnScope lc_id6 =null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:108:26: ( lc_id ':' CAPITALIZED_ID ( ',' gui_action_parameter_def )? )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:109:5: lc_id ':' CAPITALIZED_ID ( ',' gui_action_parameter_def )?
			{
			pushFollow(FOLLOW_lc_id_in_gui_action_parameter_def591);
			lc_id6=lc_id();
			state._fsp--;

			match(input,11,FOLLOW_11_in_gui_action_parameter_def593); 
			CAPITALIZED_ID7=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_gui_action_parameter_def596); 
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:109:31: ( ',' gui_action_parameter_def )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==10) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:109:32: ',' gui_action_parameter_def
					{
					match(input,10,FOLLOW_10_in_gui_action_parameter_def599); 
					pushFollow(FOLLOW_gui_action_parameter_def_in_gui_action_parameter_def601);
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
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:116:1: gui_request_def : 'request' lc_id ;
	public final void gui_request_def() throws RecognitionException {
		ParserRuleReturnScope lc_id8 =null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:116:17: ( 'request' lc_id )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:117:4: 'request' lc_id
			{
			match(input,25,FOLLOW_25_in_gui_request_def623); 
			pushFollow(FOLLOW_lc_id_in_gui_request_def625);
			lc_id8=lc_id();
			state._fsp--;

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
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:122:1: gui_notify_def : 'notify' ( gui_display_def )* ;
	public final void gui_notify_def() throws RecognitionException {
		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:122:16: ( 'notify' ( gui_display_def )* )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:124:5: 'notify' ( gui_display_def )*
			{
			match(input,24,FOLLOW_24_in_gui_notify_def647); 
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:124:14: ( gui_display_def )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==CAPITALIZED_ID) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:124:15: gui_display_def
					{
					pushFollow(FOLLOW_gui_display_def_in_gui_notify_def650);
					gui_display_def();
					state._fsp--;

					}
					break;

				default :
					break loop13;
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
	// $ANTLR end "gui_notify_def"



	// $ANTLR start "gui_display_def"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:128:1: gui_display_def : CAPITALIZED_ID '(' gui_notify_parameter_def ')' ;
	public final void gui_display_def() throws RecognitionException {
		Token CAPITALIZED_ID9=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:128:17: ( CAPITALIZED_ID '(' gui_notify_parameter_def ')' )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:130:3: CAPITALIZED_ID '(' gui_notify_parameter_def ')'
			{
			CAPITALIZED_ID9=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_gui_display_def669); 

			   context.currentActuator = new ActuatorCompiler((CAPITALIZED_ID9!=null?CAPITALIZED_ID9.getText():null)); 
			match(input,8,FOLLOW_8_in_gui_display_def681); 
			pushFollow(FOLLOW_gui_notify_parameter_def_in_gui_display_def683);
			gui_notify_parameter_def();
			state._fsp--;

			match(input,9,FOLLOW_9_in_gui_display_def685); 

			   context.currentActuator.addAction((CAPITALIZED_ID9!=null?CAPITALIZED_ID9.getText():null)); 
			   context.currentActuator.generateActuatorCode();
			   context.currentGUI.setNotifyName((CAPITALIZED_ID9!=null?CAPITALIZED_ID9.getText():null));
			   
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
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:142:1: gui_notify_parameter_def : lc_id ':' CAPITALIZED_ID ( ',' gui_notify_parameter_def )? ;
	public final void gui_notify_parameter_def() throws RecognitionException {
		Token CAPITALIZED_ID11=null;
		ParserRuleReturnScope lc_id10 =null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:142:25: ( lc_id ':' CAPITALIZED_ID ( ',' gui_notify_parameter_def )? )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:144:2: lc_id ':' CAPITALIZED_ID ( ',' gui_notify_parameter_def )?
			{
			pushFollow(FOLLOW_lc_id_in_gui_notify_parameter_def702);
			lc_id10=lc_id();
			state._fsp--;

			match(input,11,FOLLOW_11_in_gui_notify_parameter_def704); 
			CAPITALIZED_ID11=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_gui_notify_parameter_def706); 
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:144:28: ( ',' gui_notify_parameter_def )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==10) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:144:29: ',' gui_notify_parameter_def
					{
					match(input,10,FOLLOW_10_in_gui_notify_parameter_def710); 
					pushFollow(FOLLOW_gui_notify_parameter_def_in_gui_notify_parameter_def712);
					gui_notify_parameter_def();
					state._fsp--;

					}
					break;

			}


			  //context.currentGUI.addNotify((lc_id10!=null?input.toString(lc_id10.start,lc_id10.stop):null)); 
			  context.constructActuatorSymblTable((CAPITALIZED_ID11!=null?CAPITALIZED_ID11.getText():null));
			  context.currentActuator.addParameter((lc_id10!=null?input.toString(lc_id10.start,lc_id10.stop):null), (CAPITALIZED_ID11!=null?CAPITALIZED_ID11.getText():null)); 
			  context.currentGUI.setNotifyParameter((CAPITALIZED_ID11!=null?CAPITALIZED_ID11.getText():null));
			   context.constructSymbTable((lc_id10!=null?input.toString(lc_id10.start,lc_id10.stop):null), (CAPITALIZED_ID11!=null?CAPITALIZED_ID11.getText():null));
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



	// $ANTLR start "bt_id"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:178:1: bt_id : ID ;
	public final void bt_id() throws RecognitionException {
		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:178:7: ( ID )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:178:10: ID
			{
			match(input,ID,FOLLOW_ID_in_bt_id754); 
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
	// $ANTLR end "bt_id"



	// $ANTLR start "txtbx_id"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:180:1: txtbx_id : ID ;
	public final void txtbx_id() throws RecognitionException {
		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:180:10: ( ID )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:180:13: ID
			{
			match(input,ID,FOLLOW_ID_in_txtbx_id764); 
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
	// $ANTLR end "txtbx_id"



	// $ANTLR start "txtview_id"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:182:1: txtview_id : ID ;
	public final void txtview_id() throws RecognitionException {
		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:182:12: ( ID )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:182:15: ID
			{
			match(input,ID,FOLLOW_ID_in_txtview_id774); 
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
	// $ANTLR end "txtview_id"



	// $ANTLR start "widget_def"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:195:1: widget_def : ( 'TextView' textview_def ';' )* ( 'Button' button_def ';' )* ( 'TextBox' textbox_def ';' )* ;
	public final void widget_def() throws RecognitionException {
		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:195:12: ( ( 'TextView' textview_def ';' )* ( 'Button' button_def ';' )* ( 'TextBox' textbox_def ';' )* )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:196:5: ( 'TextView' textview_def ';' )* ( 'Button' button_def ';' )* ( 'TextBox' textbox_def ';' )*
			{
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:196:5: ( 'TextView' textview_def ';' )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==18) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:196:6: 'TextView' textview_def ';'
					{
					match(input,18,FOLLOW_18_in_widget_def800); 
					pushFollow(FOLLOW_textview_def_in_widget_def802);
					textview_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_widget_def804); 
					}
					break;

				default :
					break loop15;
				}
			}

			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:197:5: ( 'Button' button_def ';' )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==14) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:197:6: 'Button' button_def ';'
					{
					match(input,14,FOLLOW_14_in_widget_def813); 
					pushFollow(FOLLOW_button_def_in_widget_def816);
					button_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_widget_def818); 
					}
					break;

				default :
					break loop16;
				}
			}

			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:198:5: ( 'TextBox' textbox_def ';' )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==17) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:198:6: 'TextBox' textbox_def ';'
					{
					match(input,17,FOLLOW_17_in_widget_def827); 
					pushFollow(FOLLOW_textbox_def_in_widget_def829);
					textbox_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_widget_def831); 
					}
					break;

				default :
					break loop17;
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
	// $ANTLR end "widget_def"



	// $ANTLR start "textview_def"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:205:1: textview_def : lc_id ( ',' textview_def )? ;
	public final void textview_def() throws RecognitionException {
		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:205:14: ( lc_id ( ',' textview_def )? )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:206:5: lc_id ( ',' textview_def )?
			{
			pushFollow(FOLLOW_lc_id_in_textview_def856);
			lc_id();
			state._fsp--;

			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:206:12: ( ',' textview_def )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==10) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:206:13: ',' textview_def
					{
					match(input,10,FOLLOW_10_in_textview_def860); 
					pushFollow(FOLLOW_textview_def_in_textview_def862);
					textview_def();
					state._fsp--;

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
	// $ANTLR end "textview_def"



	// $ANTLR start "button_def"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:209:1: button_def : lc_id ( ',' button_def )? ;
	public final void button_def() throws RecognitionException {
		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:209:12: ( lc_id ( ',' button_def )? )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:210:5: lc_id ( ',' button_def )?
			{
			pushFollow(FOLLOW_lc_id_in_button_def877);
			lc_id();
			state._fsp--;

			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:210:12: ( ',' button_def )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==10) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:210:13: ',' button_def
					{
					match(input,10,FOLLOW_10_in_button_def881); 
					pushFollow(FOLLOW_button_def_in_button_def883);
					button_def();
					state._fsp--;

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
	// $ANTLR end "button_def"



	// $ANTLR start "textbox_def"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:213:1: textbox_def : lc_id ( ',' textbox_def )? ;
	public final void textbox_def() throws RecognitionException {
		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:213:13: ( lc_id ( ',' textbox_def )? )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:214:5: lc_id ( ',' textbox_def )?
			{
			pushFollow(FOLLOW_lc_id_in_textbox_def899);
			lc_id();
			state._fsp--;

			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:214:11: ( ',' textbox_def )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==10) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\src\\iotsuite\\parser\\InteractionSpec.g:214:12: ',' textbox_def
					{
					match(input,10,FOLLOW_10_in_textbox_def902); 
					pushFollow(FOLLOW_textbox_def_in_textbox_def904);
					textbox_def();
					state._fsp--;

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
	// $ANTLR end "textbox_def"

	// Delegated rules



	public static final BitSet FOLLOW_abilities_def_in_interactionSpec78 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_abilities_def97 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_abilities_def99 = new BitSet(new long[]{0x0000000018000002L});
	public static final BitSet FOLLOW_27_in_abilities_def102 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_abilities_def104 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_struct_def_in_abilities_def106 = new BitSet(new long[]{0x0000000018000002L});
	public static final BitSet FOLLOW_28_in_abilities_def114 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_abilities_def116 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_gui_def_in_abilities_def119 = new BitSet(new long[]{0x0000000010000012L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_struct_def142 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_structField_def_in_struct_def156 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_struct_def158 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_lc_id_in_structField_def181 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_structField_def183 = new BitSet(new long[]{0x0000000000D1A000L});
	public static final BitSet FOLLOW_dataType_in_structField_def185 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_lc_id202 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveType_in_dataType215 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_primitiveType230 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_primitiveType236 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_primitiveType242 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_primitiveType251 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_primitiveType259 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_primitiveType265 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_def393 = new BitSet(new long[]{0x0000000003200002L});
	public static final BitSet FOLLOW_gui_command_def_in_gui_def419 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_gui_def421 = new BitSet(new long[]{0x0000000003200002L});
	public static final BitSet FOLLOW_gui_request_def_in_gui_def432 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_gui_def435 = new BitSet(new long[]{0x0000000003000002L});
	public static final BitSet FOLLOW_gui_notify_def_in_gui_def447 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_gui_def450 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_21_in_gui_command_def477 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_command_def484 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_gui_command_def486 = new BitSet(new long[]{0x0000000000000220L});
	public static final BitSet FOLLOW_gui_command_parameter_def_in_gui_command_def489 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_gui_command_def493 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lc_id_in_gui_command_parameter_def516 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_10_in_gui_command_parameter_def519 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_gui_command_parameter_def_in_gui_command_parameter_def521 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_gui_action_def542 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_action_def548 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_gui_action_def550 = new BitSet(new long[]{0x0000000000000220L});
	public static final BitSet FOLLOW_gui_action_parameter_def_in_gui_action_def553 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_gui_action_def557 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_gui_action_def559 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_lc_id_in_gui_action_def565 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lc_id_in_gui_action_parameter_def591 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_gui_action_parameter_def593 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_action_parameter_def596 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_10_in_gui_action_parameter_def599 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_gui_action_parameter_def_in_gui_action_parameter_def601 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_gui_request_def623 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_lc_id_in_gui_request_def625 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_gui_notify_def647 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_gui_display_def_in_gui_notify_def650 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_display_def669 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_gui_display_def681 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_gui_notify_parameter_def_in_gui_display_def683 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_gui_display_def685 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lc_id_in_gui_notify_parameter_def702 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_gui_notify_parameter_def704 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_notify_parameter_def706 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_10_in_gui_notify_parameter_def710 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_gui_notify_parameter_def_in_gui_notify_parameter_def712 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_bt_id754 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_txtbx_id764 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_txtview_id774 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_widget_def800 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_textview_def_in_widget_def802 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_widget_def804 = new BitSet(new long[]{0x0000000000064002L});
	public static final BitSet FOLLOW_14_in_widget_def813 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_button_def_in_widget_def816 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_widget_def818 = new BitSet(new long[]{0x0000000000024002L});
	public static final BitSet FOLLOW_17_in_widget_def827 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_textbox_def_in_widget_def829 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_widget_def831 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_lc_id_in_textview_def856 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_10_in_textview_def860 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_textview_def_in_textview_def862 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lc_id_in_button_def877 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_10_in_button_def881 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_button_def_in_button_def883 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lc_id_in_textbox_def899 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_10_in_textbox_def902 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_textbox_def_in_textbox_def904 = new BitSet(new long[]{0x0000000000000002L});
}
