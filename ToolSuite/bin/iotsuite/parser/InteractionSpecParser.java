// $ANTLR 3.5.1 C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g 2015-10-26 23:13:37
 
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
		"'double'", "'long'", "'request'", "'userinteractions'", "'with'"
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
	@Override public String getGrammarFileName() { return "C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g"; }


	  //Initialize the context
	  private SymbolTable context;



	// $ANTLR start "interactionSpec"
	// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:24:1: interactionSpec : abilities_def ;
	public final void interactionSpec() throws RecognitionException {
		try {
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:24:17: ( abilities_def )
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:25:5: abilities_def
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
	// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:30:1: abilities_def : ( 'userinteractions' ':' ( gui_def )+ )* ;
	public final void abilities_def() throws RecognitionException {
		try {
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:30:15: ( ( 'userinteractions' ':' ( gui_def )+ )* )
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:31:3: ( 'userinteractions' ':' ( gui_def )+ )*
			{
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:31:3: ( 'userinteractions' ':' ( gui_def )+ )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==25) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:31:4: 'userinteractions' ':' ( gui_def )+
					{
					match(input,25,FOLLOW_25_in_abilities_def100); 
					match(input,11,FOLLOW_11_in_abilities_def102); 
					// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:31:27: ( gui_def )+
					int cnt1=0;
					loop1:
					while (true) {
						int alt1=2;
						int LA1_0 = input.LA(1);
						if ( (LA1_0==CAPITALIZED_ID) ) {
							alt1=1;
						}

						switch (alt1) {
						case 1 :
							// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:31:28: gui_def
							{
							pushFollow(FOLLOW_gui_def_in_abilities_def105);
							gui_def();
							state._fsp--;

							}
							break;

						default :
							if ( cnt1 >= 1 ) break loop1;
							EarlyExitException eee = new EarlyExitException(1, input);
							throw eee;
						}
						cnt1++;
					}

					}
					break;

				default :
					break loop2;
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


	public static class lc_id_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "lc_id"
	// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:34:1: lc_id : ID ;
	public final InteractionSpecParser.lc_id_return lc_id() throws RecognitionException {
		InteractionSpecParser.lc_id_return retval = new InteractionSpecParser.lc_id_return();
		retval.start = input.LT(1);

		try {
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:34:6: ( ID )
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:34:8: ID
			{
			match(input,ID,FOLLOW_ID_in_lc_id123); 
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



	// $ANTLR start "dataType"
	// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:37:1: dataType : primitiveType ;
	public final void dataType() throws RecognitionException {
		try {
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:37:9: ( primitiveType )
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:38:3: primitiveType
			{
			pushFollow(FOLLOW_primitiveType_in_dataType136);
			primitiveType();
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
	// $ANTLR end "dataType"



	// $ANTLR start "primitiveType"
	// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:41:1: primitiveType : (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' ) ;
	public final void primitiveType() throws RecognitionException {
		Token id=null;

		try {
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:41:14: ( (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' ) )
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:42:3: (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' )
			{
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:42:3: (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' )
			int alt3=6;
			switch ( input.LA(1) ) {
			case 15:
				{
				alt3=1;
				}
				break;
			case 13:
				{
				alt3=2;
				}
				break;
			case 16:
				{
				alt3=3;
				}
				break;
			case 22:
				{
				alt3=4;
				}
				break;
			case 23:
				{
				alt3=5;
				}
				break;
			case 20:
				{
				alt3=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:42:4: id= 'Integer'
					{
					id=(Token)match(input,15,FOLLOW_15_in_primitiveType151); 
					}
					break;
				case 2 :
					// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:42:19: id= 'Boolean'
					{
					id=(Token)match(input,13,FOLLOW_13_in_primitiveType157); 
					}
					break;
				case 3 :
					// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:42:34: id= 'String'
					{
					id=(Token)match(input,16,FOLLOW_16_in_primitiveType163); 
					}
					break;
				case 4 :
					// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:42:49: id= 'double'
					{
					id=(Token)match(input,22,FOLLOW_22_in_primitiveType172); 
					}
					break;
				case 5 :
					// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:42:65: id= 'long'
					{
					id=(Token)match(input,23,FOLLOW_23_in_primitiveType180); 
					}
					break;
				case 6 :
					// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:42:79: id= 'boolean'
					{
					id=(Token)match(input,20,FOLLOW_20_in_primitiveType186); 
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
	// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:54:1: gui_def : CAPITALIZED_ID ( gui_command_def ';' )* ( gui_request_def ';' )* ;
	public final void gui_def() throws RecognitionException {
		Token CAPITALIZED_ID1=null;

		try {
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:54:8: ( CAPITALIZED_ID ( gui_command_def ';' )* ( gui_request_def ';' )* )
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:55:3: CAPITALIZED_ID ( gui_command_def ';' )* ( gui_request_def ';' )*
			{
			context.currentGUI = new UserInterfaceCompiler();
			CAPITALIZED_ID1=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_gui_def314); 
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:59:4: ( gui_command_def ';' )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==21) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:59:5: gui_command_def ';'
					{
					pushFollow(FOLLOW_gui_command_def_in_gui_def340);
					gui_command_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_gui_def342); 
					}
					break;

				default :
					break loop4;
				}
			}

			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:60:4: ( gui_request_def ';' )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==24) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:60:5: gui_request_def ';'
					{
					pushFollow(FOLLOW_gui_request_def_in_gui_def353);
					gui_request_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_gui_def356); 
					}
					break;

				default :
					break loop5;
				}
			}

			context.currentGUI.setGUIName((CAPITALIZED_ID1!=null?CAPITALIZED_ID1.getText():null)); 
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
	// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:66:1: gui_command_def : 'command' name= CAPITALIZED_ID '(' ( gui_command_parameter_def )? ')' ;
	public final void gui_command_def() throws RecognitionException {
		Token name=null;

		try {
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:66:17: ( 'command' name= CAPITALIZED_ID '(' ( gui_command_parameter_def )? ')' )
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:67:5: 'command' name= CAPITALIZED_ID '(' ( gui_command_parameter_def )? ')'
			{
			match(input,21,FOLLOW_21_in_gui_command_def383); 
			name=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_gui_command_def390); 
			match(input,8,FOLLOW_8_in_gui_command_def392); 
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:67:42: ( gui_command_parameter_def )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==ID) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:67:43: gui_command_parameter_def
					{
					pushFollow(FOLLOW_gui_command_parameter_def_in_gui_command_def395);
					gui_command_parameter_def();
					state._fsp--;

					}
					break;

			}

			match(input,9,FOLLOW_9_in_gui_command_def399); 
			 
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
	// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:74:1: gui_command_parameter_def : lc_id ( ',' gui_command_parameter_def )? ;
	public final void gui_command_parameter_def() throws RecognitionException {
		ParserRuleReturnScope lc_id2 =null;

		try {
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:74:27: ( lc_id ( ',' gui_command_parameter_def )? )
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:75:5: lc_id ( ',' gui_command_parameter_def )?
			{
			pushFollow(FOLLOW_lc_id_in_gui_command_parameter_def422);
			lc_id2=lc_id();
			state._fsp--;

			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:75:11: ( ',' gui_command_parameter_def )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==10) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:75:12: ',' gui_command_parameter_def
					{
					match(input,10,FOLLOW_10_in_gui_command_parameter_def425); 
					pushFollow(FOLLOW_gui_command_parameter_def_in_gui_command_parameter_def427);
					gui_command_parameter_def();
					state._fsp--;

					}
					break;

			}

			 
			    context.currentGUI.addCommandParameter((lc_id2!=null?input.toString(lc_id2.start,lc_id2.stop):null)); 
			    
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
	// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:81:1: gui_action_def : 'action' name= CAPITALIZED_ID '(' ( gui_action_parameter_def )? ')' 'with' ui= lc_id ;
	public final void gui_action_def() throws RecognitionException {
		Token name=null;
		ParserRuleReturnScope ui =null;

		try {
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:81:15: ( 'action' name= CAPITALIZED_ID '(' ( gui_action_parameter_def )? ')' 'with' ui= lc_id )
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:82:5: 'action' name= CAPITALIZED_ID '(' ( gui_action_parameter_def )? ')' 'with' ui= lc_id
			{
			match(input,19,FOLLOW_19_in_gui_action_def448); 
			name=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_gui_action_def454); 
			match(input,8,FOLLOW_8_in_gui_action_def456); 
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:82:40: ( gui_action_parameter_def )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==ID) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:82:41: gui_action_parameter_def
					{
					pushFollow(FOLLOW_gui_action_parameter_def_in_gui_action_def459);
					gui_action_parameter_def();
					state._fsp--;

					}
					break;

			}

			match(input,9,FOLLOW_9_in_gui_action_def463); 
			match(input,26,FOLLOW_26_in_gui_action_def465); 
			pushFollow(FOLLOW_lc_id_in_gui_action_def471);
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
	// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:92:1: gui_action_parameter_def : lc_id ':' CAPITALIZED_ID ( ',' gui_action_parameter_def )? ;
	public final void gui_action_parameter_def() throws RecognitionException {
		Token CAPITALIZED_ID4=null;
		ParserRuleReturnScope lc_id3 =null;

		try {
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:92:26: ( lc_id ':' CAPITALIZED_ID ( ',' gui_action_parameter_def )? )
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:93:5: lc_id ':' CAPITALIZED_ID ( ',' gui_action_parameter_def )?
			{
			pushFollow(FOLLOW_lc_id_in_gui_action_parameter_def497);
			lc_id3=lc_id();
			state._fsp--;

			match(input,11,FOLLOW_11_in_gui_action_parameter_def499); 
			CAPITALIZED_ID4=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_gui_action_parameter_def502); 
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:93:31: ( ',' gui_action_parameter_def )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==10) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:93:32: ',' gui_action_parameter_def
					{
					match(input,10,FOLLOW_10_in_gui_action_parameter_def505); 
					pushFollow(FOLLOW_gui_action_parameter_def_in_gui_action_parameter_def507);
					gui_action_parameter_def();
					state._fsp--;

					}
					break;

			}

			 
			    context.currentGUI.addActionParameter((lc_id3!=null?input.toString(lc_id3.start,lc_id3.stop):null), (CAPITALIZED_ID4!=null?CAPITALIZED_ID4.getText():null)); 
			    context.constructSymbTable((lc_id3!=null?input.toString(lc_id3.start,lc_id3.stop):null), (CAPITALIZED_ID4!=null?CAPITALIZED_ID4.getText():null));
			    
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
	// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:100:1: gui_request_def : 'request' lc_id ;
	public final void gui_request_def() throws RecognitionException {
		ParserRuleReturnScope lc_id5 =null;

		try {
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:100:17: ( 'request' lc_id )
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:101:4: 'request' lc_id
			{
			match(input,24,FOLLOW_24_in_gui_request_def529); 
			pushFollow(FOLLOW_lc_id_in_gui_request_def531);
			lc_id5=lc_id();
			state._fsp--;

			 context.currentGUI.getDataAccessListFromSymblTable((lc_id5!=null?input.toString(lc_id5.start,lc_id5.stop):null));
			     context.currentGUI.setRequestType(context.getResponseTypeSymblTable((lc_id5!=null?input.toString(lc_id5.start,lc_id5.stop):null)));
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



	// $ANTLR start "bt_id"
	// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:131:1: bt_id : ID ;
	public final void bt_id() throws RecognitionException {
		try {
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:131:7: ( ID )
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:131:10: ID
			{
			match(input,ID,FOLLOW_ID_in_bt_id572); 
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
	// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:133:1: txtbx_id : ID ;
	public final void txtbx_id() throws RecognitionException {
		try {
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:133:10: ( ID )
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:133:13: ID
			{
			match(input,ID,FOLLOW_ID_in_txtbx_id582); 
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
	// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:135:1: txtview_id : ID ;
	public final void txtview_id() throws RecognitionException {
		try {
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:135:12: ( ID )
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:135:15: ID
			{
			match(input,ID,FOLLOW_ID_in_txtview_id592); 
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
	// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:148:1: widget_def : ( 'TextView' textview_def ';' )* ( 'Button' button_def ';' )* ( 'TextBox' textbox_def ';' )* ;
	public final void widget_def() throws RecognitionException {
		try {
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:148:12: ( ( 'TextView' textview_def ';' )* ( 'Button' button_def ';' )* ( 'TextBox' textbox_def ';' )* )
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:149:5: ( 'TextView' textview_def ';' )* ( 'Button' button_def ';' )* ( 'TextBox' textbox_def ';' )*
			{
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:149:5: ( 'TextView' textview_def ';' )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==18) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:149:6: 'TextView' textview_def ';'
					{
					match(input,18,FOLLOW_18_in_widget_def618); 
					pushFollow(FOLLOW_textview_def_in_widget_def620);
					textview_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_widget_def622); 
					}
					break;

				default :
					break loop10;
				}
			}

			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:150:5: ( 'Button' button_def ';' )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==14) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:150:6: 'Button' button_def ';'
					{
					match(input,14,FOLLOW_14_in_widget_def631); 
					pushFollow(FOLLOW_button_def_in_widget_def634);
					button_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_widget_def636); 
					}
					break;

				default :
					break loop11;
				}
			}

			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:151:5: ( 'TextBox' textbox_def ';' )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==17) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:151:6: 'TextBox' textbox_def ';'
					{
					match(input,17,FOLLOW_17_in_widget_def645); 
					pushFollow(FOLLOW_textbox_def_in_widget_def647);
					textbox_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_widget_def649); 
					}
					break;

				default :
					break loop12;
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
	// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:158:1: textview_def : lc_id ( ',' textview_def )? ;
	public final void textview_def() throws RecognitionException {
		try {
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:158:14: ( lc_id ( ',' textview_def )? )
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:159:5: lc_id ( ',' textview_def )?
			{
			pushFollow(FOLLOW_lc_id_in_textview_def674);
			lc_id();
			state._fsp--;

			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:159:12: ( ',' textview_def )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==10) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:159:13: ',' textview_def
					{
					match(input,10,FOLLOW_10_in_textview_def678); 
					pushFollow(FOLLOW_textview_def_in_textview_def680);
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
	// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:162:1: button_def : lc_id ( ',' button_def )? ;
	public final void button_def() throws RecognitionException {
		try {
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:162:12: ( lc_id ( ',' button_def )? )
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:163:5: lc_id ( ',' button_def )?
			{
			pushFollow(FOLLOW_lc_id_in_button_def695);
			lc_id();
			state._fsp--;

			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:163:12: ( ',' button_def )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==10) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:163:13: ',' button_def
					{
					match(input,10,FOLLOW_10_in_button_def699); 
					pushFollow(FOLLOW_button_def_in_button_def701);
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
	// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:166:1: textbox_def : lc_id ( ',' textbox_def )? ;
	public final void textbox_def() throws RecognitionException {
		try {
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:166:13: ( lc_id ( ',' textbox_def )? )
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:167:5: lc_id ( ',' textbox_def )?
			{
			pushFollow(FOLLOW_lc_id_in_textbox_def717);
			lc_id();
			state._fsp--;

			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:167:11: ( ',' textbox_def )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==10) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\InteractionSpec.g:167:12: ',' textbox_def
					{
					match(input,10,FOLLOW_10_in_textbox_def720); 
					pushFollow(FOLLOW_textbox_def_in_textbox_def722);
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
	public static final BitSet FOLLOW_25_in_abilities_def100 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_abilities_def102 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_gui_def_in_abilities_def105 = new BitSet(new long[]{0x0000000002000012L});
	public static final BitSet FOLLOW_ID_in_lc_id123 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveType_in_dataType136 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_primitiveType151 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_primitiveType157 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_primitiveType163 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_primitiveType172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_primitiveType180 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_primitiveType186 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_def314 = new BitSet(new long[]{0x0000000001200002L});
	public static final BitSet FOLLOW_gui_command_def_in_gui_def340 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_gui_def342 = new BitSet(new long[]{0x0000000001200002L});
	public static final BitSet FOLLOW_gui_request_def_in_gui_def353 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_gui_def356 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_21_in_gui_command_def383 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_command_def390 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_gui_command_def392 = new BitSet(new long[]{0x0000000000000220L});
	public static final BitSet FOLLOW_gui_command_parameter_def_in_gui_command_def395 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_gui_command_def399 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lc_id_in_gui_command_parameter_def422 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_10_in_gui_command_parameter_def425 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_gui_command_parameter_def_in_gui_command_parameter_def427 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_gui_action_def448 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_action_def454 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_gui_action_def456 = new BitSet(new long[]{0x0000000000000220L});
	public static final BitSet FOLLOW_gui_action_parameter_def_in_gui_action_def459 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_gui_action_def463 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_gui_action_def465 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_lc_id_in_gui_action_def471 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lc_id_in_gui_action_parameter_def497 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_gui_action_parameter_def499 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_action_parameter_def502 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_10_in_gui_action_parameter_def505 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_gui_action_parameter_def_in_gui_action_parameter_def507 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_gui_request_def529 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_lc_id_in_gui_request_def531 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_bt_id572 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_txtbx_id582 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_txtview_id592 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_widget_def618 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_textview_def_in_widget_def620 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_widget_def622 = new BitSet(new long[]{0x0000000000064002L});
	public static final BitSet FOLLOW_14_in_widget_def631 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_button_def_in_widget_def634 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_widget_def636 = new BitSet(new long[]{0x0000000000024002L});
	public static final BitSet FOLLOW_17_in_widget_def645 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_textbox_def_in_widget_def647 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_widget_def649 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_lc_id_in_textview_def674 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_10_in_textview_def678 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_textview_def_in_textview_def680 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lc_id_in_button_def695 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_10_in_button_def699 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_button_def_in_button_def701 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lc_id_in_textbox_def717 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_10_in_textbox_def720 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_textbox_def_in_textbox_def722 = new BitSet(new long[]{0x0000000000000002L});
}
