// $ANTLR 3.5.1 C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g 2015-10-27 00:32:03
 
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
		"'action'", "'boolean'", "'command'", "'double'", "'long'", "'notify'", 
		"'request'", "'resources'", "'structs'", "'userinteractions'", "'with'"
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
	@Override public String getGrammarFileName() { return "C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g"; }


	  //Initialize the context
	  private SymbolTable context;



	// $ANTLR start "interactionSpec"
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:24:1: interactionSpec : abilities_def ;
	public final void interactionSpec() throws RecognitionException {
		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:24:17: ( abilities_def )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:25:5: abilities_def
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
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:30:1: abilities_def : 'resources' ':' ( 'structs' ':' struct_def )* ( 'userinteractions' ':' ( gui_def )+ )* ;
	public final void abilities_def() throws RecognitionException {
		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:30:15: ( 'resources' ':' ( 'structs' ':' struct_def )* ( 'userinteractions' ':' ( gui_def )+ )* )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:31:1: 'resources' ':' ( 'structs' ':' struct_def )* ( 'userinteractions' ':' ( gui_def )+ )*
			{
			match(input,23,FOLLOW_23_in_abilities_def97); 
			match(input,11,FOLLOW_11_in_abilities_def99); 
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:32:3: ( 'structs' ':' struct_def )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==24) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:32:4: 'structs' ':' struct_def
					{
					match(input,24,FOLLOW_24_in_abilities_def104); 
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

			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:33:3: ( 'userinteractions' ':' ( gui_def )+ )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==25) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:33:4: 'userinteractions' ':' ( gui_def )+
					{
					match(input,25,FOLLOW_25_in_abilities_def117); 
					match(input,11,FOLLOW_11_in_abilities_def119); 
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:33:27: ( gui_def )+
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
							// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:33:28: gui_def
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
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:36:1: struct_def : CAPITALIZED_ID ( structField_def ';' )+ ;
	public final void struct_def() throws RecognitionException {
		Token CAPITALIZED_ID1=null;

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:36:11: ( CAPITALIZED_ID ( structField_def ';' )+ )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:37:5: CAPITALIZED_ID ( structField_def ';' )+
			{
			CAPITALIZED_ID1=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_struct_def145); 
			context.currentStruct = new StructCompiler((CAPITALIZED_ID1!=null?CAPITALIZED_ID1.getText():null));
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:39:5: ( structField_def ';' )+
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
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:39:6: structField_def ';'
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
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:42:1: structField_def : lc_id ':' dataType ;
	public final void structField_def() throws RecognitionException {
		ParserRuleReturnScope lc_id2 =null;
		ParserRuleReturnScope dataType3 =null;

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:42:16: ( lc_id ':' dataType )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:43:3: lc_id ':' dataType
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
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:49:1: lc_id : ID ;
	public final InteractionSpecParser.lc_id_return lc_id() throws RecognitionException {
		InteractionSpecParser.lc_id_return retval = new InteractionSpecParser.lc_id_return();
		retval.start = input.LT(1);

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:49:6: ( ID )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:49:8: ID
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
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:52:1: dataType : primitiveType ;
	public final InteractionSpecParser.dataType_return dataType() throws RecognitionException {
		InteractionSpecParser.dataType_return retval = new InteractionSpecParser.dataType_return();
		retval.start = input.LT(1);

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:52:9: ( primitiveType )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:53:3: primitiveType
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
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:56:1: primitiveType : (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' ) ;
	public final void primitiveType() throws RecognitionException {
		Token id=null;

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:56:14: ( (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' ) )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:57:3: (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' )
			{
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:57:3: (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' )
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
			case 20:
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
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:57:4: id= 'Integer'
					{
					id=(Token)match(input,14,FOLLOW_14_in_primitiveType233); 
					}
					break;
				case 2 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:57:19: id= 'Boolean'
					{
					id=(Token)match(input,13,FOLLOW_13_in_primitiveType239); 
					}
					break;
				case 3 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:57:34: id= 'String'
					{
					id=(Token)match(input,15,FOLLOW_15_in_primitiveType245); 
					}
					break;
				case 4 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:57:49: id= 'double'
					{
					id=(Token)match(input,19,FOLLOW_19_in_primitiveType254); 
					}
					break;
				case 5 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:57:65: id= 'long'
					{
					id=(Token)match(input,20,FOLLOW_20_in_primitiveType262); 
					}
					break;
				case 6 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:57:79: id= 'boolean'
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
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:69:1: gui_def : CAPITALIZED_ID ( gui_command_def ';' )* ( gui_request_def ';' )* ( gui_notify_def ';' )* ;
	public final void gui_def() throws RecognitionException {
		Token CAPITALIZED_ID4=null;

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:69:8: ( CAPITALIZED_ID ( gui_command_def ';' )* ( gui_request_def ';' )* ( gui_notify_def ';' )* )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:70:3: CAPITALIZED_ID ( gui_command_def ';' )* ( gui_request_def ';' )* ( gui_notify_def ';' )*
			{
			context.currentGUI = new UserInterfaceCompiler();
			CAPITALIZED_ID4=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_gui_def396); 
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:72:4: ( gui_command_def ';' )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==18) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:72:5: gui_command_def ';'
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

			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:73:4: ( gui_request_def ';' )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==22) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:73:5: gui_request_def ';'
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

			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:74:5: ( gui_notify_def ';' )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==21) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:74:6: gui_notify_def ';'
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
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:80:1: gui_command_def : 'command' name= CAPITALIZED_ID '(' ( gui_command_parameter_def )? ')' ;
	public final void gui_command_def() throws RecognitionException {
		Token name=null;

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:80:17: ( 'command' name= CAPITALIZED_ID '(' ( gui_command_parameter_def )? ')' )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:81:5: 'command' name= CAPITALIZED_ID '(' ( gui_command_parameter_def )? ')'
			{
			match(input,18,FOLLOW_18_in_gui_command_def460); 
			name=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_gui_command_def467); 
			match(input,8,FOLLOW_8_in_gui_command_def469); 
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:81:42: ( gui_command_parameter_def )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==ID) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:81:43: gui_command_parameter_def
					{
					pushFollow(FOLLOW_gui_command_parameter_def_in_gui_command_def472);
					gui_command_parameter_def();
					state._fsp--;

					}
					break;

			}

			match(input,9,FOLLOW_9_in_gui_command_def476); 
			 
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
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:88:1: gui_command_parameter_def : lc_id ( ',' gui_command_parameter_def )? ;
	public final void gui_command_parameter_def() throws RecognitionException {
		ParserRuleReturnScope lc_id5 =null;

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:88:27: ( lc_id ( ',' gui_command_parameter_def )? )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:89:5: lc_id ( ',' gui_command_parameter_def )?
			{
			pushFollow(FOLLOW_lc_id_in_gui_command_parameter_def499);
			lc_id5=lc_id();
			state._fsp--;

			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:89:11: ( ',' gui_command_parameter_def )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==10) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:89:12: ',' gui_command_parameter_def
					{
					match(input,10,FOLLOW_10_in_gui_command_parameter_def502); 
					pushFollow(FOLLOW_gui_command_parameter_def_in_gui_command_parameter_def504);
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
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:95:1: gui_action_def : 'action' name= CAPITALIZED_ID '(' ( gui_action_parameter_def )? ')' 'with' ui= lc_id ;
	public final void gui_action_def() throws RecognitionException {
		Token name=null;
		ParserRuleReturnScope ui =null;

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:95:15: ( 'action' name= CAPITALIZED_ID '(' ( gui_action_parameter_def )? ')' 'with' ui= lc_id )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:96:5: 'action' name= CAPITALIZED_ID '(' ( gui_action_parameter_def )? ')' 'with' ui= lc_id
			{
			match(input,16,FOLLOW_16_in_gui_action_def525); 
			name=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_gui_action_def531); 
			match(input,8,FOLLOW_8_in_gui_action_def533); 
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:96:40: ( gui_action_parameter_def )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==ID) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:96:41: gui_action_parameter_def
					{
					pushFollow(FOLLOW_gui_action_parameter_def_in_gui_action_def536);
					gui_action_parameter_def();
					state._fsp--;

					}
					break;

			}

			match(input,9,FOLLOW_9_in_gui_action_def540); 
			match(input,26,FOLLOW_26_in_gui_action_def542); 
			pushFollow(FOLLOW_lc_id_in_gui_action_def548);
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
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:100:1: gui_action_parameter_def : lc_id ':' CAPITALIZED_ID ( ',' gui_action_parameter_def )? ;
	public final void gui_action_parameter_def() throws RecognitionException {
		Token CAPITALIZED_ID7=null;
		ParserRuleReturnScope lc_id6 =null;

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:100:26: ( lc_id ':' CAPITALIZED_ID ( ',' gui_action_parameter_def )? )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:101:5: lc_id ':' CAPITALIZED_ID ( ',' gui_action_parameter_def )?
			{
			pushFollow(FOLLOW_lc_id_in_gui_action_parameter_def568);
			lc_id6=lc_id();
			state._fsp--;

			match(input,11,FOLLOW_11_in_gui_action_parameter_def570); 
			CAPITALIZED_ID7=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_gui_action_parameter_def573); 
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:101:31: ( ',' gui_action_parameter_def )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==10) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:101:32: ',' gui_action_parameter_def
					{
					match(input,10,FOLLOW_10_in_gui_action_parameter_def576); 
					pushFollow(FOLLOW_gui_action_parameter_def_in_gui_action_parameter_def578);
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
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:108:1: gui_request_def : 'request' lc_id ;
	public final void gui_request_def() throws RecognitionException {
		ParserRuleReturnScope lc_id8 =null;

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:108:17: ( 'request' lc_id )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:109:4: 'request' lc_id
			{
			match(input,22,FOLLOW_22_in_gui_request_def600); 
			pushFollow(FOLLOW_lc_id_in_gui_request_def602);
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
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:114:1: gui_notify_def : 'notify' ( gui_display_def )* ;
	public final void gui_notify_def() throws RecognitionException {
		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:114:16: ( 'notify' ( gui_display_def )* )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:115:5: 'notify' ( gui_display_def )*
			{
			match(input,21,FOLLOW_21_in_gui_notify_def623); 
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:115:14: ( gui_display_def )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==CAPITALIZED_ID) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:115:15: gui_display_def
					{
					pushFollow(FOLLOW_gui_display_def_in_gui_notify_def626);
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
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:118:1: gui_display_def : CAPITALIZED_ID '(' gui_notify_parameter_def ')' ;
	public final void gui_display_def() throws RecognitionException {
		Token CAPITALIZED_ID9=null;

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:118:17: ( CAPITALIZED_ID '(' gui_notify_parameter_def ')' )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:120:3: CAPITALIZED_ID '(' gui_notify_parameter_def ')'
			{
			CAPITALIZED_ID9=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_gui_display_def645); 

			   context.currentActuator = new ActuatorCompiler((CAPITALIZED_ID9!=null?CAPITALIZED_ID9.getText():null)); 
			match(input,8,FOLLOW_8_in_gui_display_def657); 
			pushFollow(FOLLOW_gui_notify_parameter_def_in_gui_display_def659);
			gui_notify_parameter_def();
			state._fsp--;

			match(input,9,FOLLOW_9_in_gui_display_def661); 

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
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:131:1: gui_notify_parameter_def : lc_id ':' CAPITALIZED_ID ( ',' gui_notify_parameter_def )? ;
	public final void gui_notify_parameter_def() throws RecognitionException {
		Token CAPITALIZED_ID10=null;
		ParserRuleReturnScope lc_id11 =null;

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:131:25: ( lc_id ':' CAPITALIZED_ID ( ',' gui_notify_parameter_def )? )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:133:1: lc_id ':' CAPITALIZED_ID ( ',' gui_notify_parameter_def )?
			{
			pushFollow(FOLLOW_lc_id_in_gui_notify_parameter_def676);
			lc_id11=lc_id();
			state._fsp--;

			match(input,11,FOLLOW_11_in_gui_notify_parameter_def678); 
			CAPITALIZED_ID10=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_gui_notify_parameter_def680); 
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:133:27: ( ',' gui_notify_parameter_def )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==10) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:133:28: ',' gui_notify_parameter_def
					{
					match(input,10,FOLLOW_10_in_gui_notify_parameter_def684); 
					pushFollow(FOLLOW_gui_notify_parameter_def_in_gui_notify_parameter_def686);
					gui_notify_parameter_def();
					state._fsp--;

					}
					break;

			}

			  
			  context.constructActuatorSymblTable((CAPITALIZED_ID10!=null?CAPITALIZED_ID10.getText():null));
			  context.currentActuator.addParameter((lc_id11!=null?input.toString(lc_id11.start,lc_id11.stop):null), (CAPITALIZED_ID10!=null?CAPITALIZED_ID10.getText():null)); 
			  context.currentGUI.setNotifyParameter((CAPITALIZED_ID10!=null?CAPITALIZED_ID10.getText():null));
			   context.constructSymbTable((lc_id11!=null?input.toString(lc_id11.start,lc_id11.stop):null), (CAPITALIZED_ID10!=null?CAPITALIZED_ID10.getText():null));
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
	public static final BitSet FOLLOW_23_in_abilities_def97 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_abilities_def99 = new BitSet(new long[]{0x0000000003000002L});
	public static final BitSet FOLLOW_24_in_abilities_def104 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_abilities_def106 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_struct_def_in_abilities_def108 = new BitSet(new long[]{0x0000000003000002L});
	public static final BitSet FOLLOW_25_in_abilities_def117 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_abilities_def119 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_gui_def_in_abilities_def122 = new BitSet(new long[]{0x0000000002000012L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_struct_def145 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_structField_def_in_struct_def159 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_struct_def161 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_lc_id_in_structField_def184 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_structField_def186 = new BitSet(new long[]{0x00000000001AE000L});
	public static final BitSet FOLLOW_dataType_in_structField_def188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_lc_id205 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveType_in_dataType218 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_primitiveType233 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_primitiveType239 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_primitiveType245 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_primitiveType254 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_primitiveType262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_primitiveType268 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_def396 = new BitSet(new long[]{0x0000000000640002L});
	public static final BitSet FOLLOW_gui_command_def_in_gui_def402 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_gui_def404 = new BitSet(new long[]{0x0000000000640002L});
	public static final BitSet FOLLOW_gui_request_def_in_gui_def415 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_gui_def418 = new BitSet(new long[]{0x0000000000600002L});
	public static final BitSet FOLLOW_gui_notify_def_in_gui_def430 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_gui_def433 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_18_in_gui_command_def460 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_command_def467 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_gui_command_def469 = new BitSet(new long[]{0x0000000000000220L});
	public static final BitSet FOLLOW_gui_command_parameter_def_in_gui_command_def472 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_gui_command_def476 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lc_id_in_gui_command_parameter_def499 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_10_in_gui_command_parameter_def502 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_gui_command_parameter_def_in_gui_command_parameter_def504 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_gui_action_def525 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_action_def531 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_gui_action_def533 = new BitSet(new long[]{0x0000000000000220L});
	public static final BitSet FOLLOW_gui_action_parameter_def_in_gui_action_def536 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_gui_action_def540 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_gui_action_def542 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_lc_id_in_gui_action_def548 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lc_id_in_gui_action_parameter_def568 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_gui_action_parameter_def570 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_action_parameter_def573 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_10_in_gui_action_parameter_def576 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_gui_action_parameter_def_in_gui_action_parameter_def578 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_gui_request_def600 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_lc_id_in_gui_request_def602 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_gui_notify_def623 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_gui_display_def_in_gui_notify_def626 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_display_def645 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_gui_display_def657 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_gui_notify_parameter_def_in_gui_display_def659 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_gui_display_def661 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lc_id_in_gui_notify_parameter_def676 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_gui_notify_parameter_def678 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_notify_parameter_def680 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_10_in_gui_notify_parameter_def684 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_gui_notify_parameter_def_in_gui_notify_parameter_def686 = new BitSet(new long[]{0x0000000000000002L});
}
