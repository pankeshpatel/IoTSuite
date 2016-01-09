// $ANTLR 3.5.1 S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g 2016-01-01 14:10:24

package iotsuite.parser;

import iotsuite.compiler.*;
import iotsuite.semanticmodel.*;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InteractionSpecParser extends Parser {
	public static final String[] tokenNames = new String[] { "<invalid>",
			"<EOR>", "<DOWN>", "<UP>", "CAPITALIZED_ID", "ID", "INT", "WS",
			"'('", "')'", "','", "':'", "';'", "'Boolean'", "'Integer'",
			"'String'", "'action'", "'boolean'", "'command'", "'double'",
			"'from'", "'long'", "'notify'", "'request'", "'resources'",
			"'structs'", "'to'", "'userInteractions'", "'with'" };
	public static final int EOF = -1;
	public static final int T__8 = 8;
	public static final int T__9 = 9;
	public static final int T__10 = 10;
	public static final int T__11 = 11;
	public static final int T__12 = 12;
	public static final int T__13 = 13;
	public static final int T__14 = 14;
	public static final int T__15 = 15;
	public static final int T__16 = 16;
	public static final int T__17 = 17;
	public static final int T__18 = 18;
	public static final int T__19 = 19;
	public static final int T__20 = 20;
	public static final int T__21 = 21;
	public static final int T__22 = 22;
	public static final int T__23 = 23;
	public static final int T__24 = 24;
	public static final int T__25 = 25;
	public static final int T__26 = 26;
	public static final int T__27 = 27;
	public static final int T__28 = 28;
	public static final int CAPITALIZED_ID = 4;
	public static final int ID = 5;
	public static final int INT = 6;
	public static final int WS = 7;

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

	@Override
	public String[] getTokenNames() {
		return InteractionSpecParser.tokenNames;
	}

	@Override
	public String getGrammarFileName() {
		return "S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g";
	}

	private SymbolTable context;

	// $ANTLR start "interactionSpec"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:23:1:
	// interactionSpec : ( 'structs' ':' )* ( struct_def )+ 'resources' ':'
	// 'userInteractions' ':' ( gui_def )* ;
	public final void interactionSpec() throws RecognitionException {
		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:23:17:
			// ( ( 'structs' ':' )* ( struct_def )+ 'resources' ':'
			// 'userInteractions' ':' ( gui_def )* )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:24:5:
			// ( 'structs' ':' )* ( struct_def )+ 'resources' ':'
			// 'userInteractions' ':' ( gui_def )*
			{
				context = new SymbolTable();

				// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:26:5:
				// ( 'structs' ':' )*
				loop1: while (true) {
					int alt1 = 2;
					int LA1_0 = input.LA(1);
					if ((LA1_0 == 25)) {
						alt1 = 1;
					}

					switch (alt1) {
					case 1:
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:26:6:
					// 'structs' ':'
					{
						match(input, 25, FOLLOW_25_in_interactionSpec79);
						match(input, 11, FOLLOW_11_in_interactionSpec81);
					}
						break;

					default:
						break loop1;
					}
				}

				// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:27:8:
				// ( struct_def )+
				int cnt2 = 0;
				loop2: while (true) {
					int alt2 = 2;
					int LA2_0 = input.LA(1);
					if ((LA2_0 == CAPITALIZED_ID)) {
						alt2 = 1;
					}

					switch (alt2) {
					case 1:
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:27:9:
					// struct_def
					{
						pushFollow(FOLLOW_struct_def_in_interactionSpec94);
						struct_def();
						state._fsp--;

					}
						break;

					default:
						if (cnt2 >= 1)
							break loop2;
						EarlyExitException eee = new EarlyExitException(2,
								input);
						throw eee;
					}
					cnt2++;
				}

				match(input, 24, FOLLOW_24_in_interactionSpec106);
				match(input, 11, FOLLOW_11_in_interactionSpec108);
				match(input, 27, FOLLOW_27_in_interactionSpec117);
				match(input, 11, FOLLOW_11_in_interactionSpec119);
				// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:30:11:
				// ( gui_def )*
				loop3: while (true) {
					int alt3 = 2;
					int LA3_0 = input.LA(1);
					if ((LA3_0 == CAPITALIZED_ID)) {
						alt3 = 1;
					}

					switch (alt3) {
					case 1:
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:30:12:
					// gui_def
					{
						pushFollow(FOLLOW_gui_def_in_interactionSpec136);
						gui_def();
						state._fsp--;

					}
						break;

					default:
						break loop3;
					}
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "interactionSpec"

	// $ANTLR start "struct_def"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:33:1:
	// struct_def : CAPITALIZED_ID ( structField_def )+ ;
	public final void struct_def() throws RecognitionException {
		Token CAPITALIZED_ID1 = null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:33:11:
			// ( CAPITALIZED_ID ( structField_def )+ )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:34:5:
			// CAPITALIZED_ID ( structField_def )+
			{
				CAPITALIZED_ID1 = (Token) match(input, CAPITALIZED_ID,
						FOLLOW_CAPITALIZED_ID_in_struct_def167);
				context.currentStruct = new StructCompiler(
						(CAPITALIZED_ID1 != null ? CAPITALIZED_ID1.getText()
								: null));
				// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:36:5:
				// ( structField_def )+
				int cnt4 = 0;
				loop4: while (true) {
					int alt4 = 2;
					int LA4_0 = input.LA(1);
					if ((LA4_0 == ID)) {
						alt4 = 1;
					}

					switch (alt4) {
					case 1:
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:36:6:
					// structField_def
					{
						pushFollow(FOLLOW_structField_def_in_struct_def181);
						structField_def();
						state._fsp--;

					}
						break;

					default:
						if (cnt4 >= 1)
							break loop4;
						EarlyExitException eee = new EarlyExitException(4,
								input);
						throw eee;
					}
					cnt4++;
				}

				context.currentStruct.generateStructureCode();
			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "struct_def"

	// $ANTLR start "structField_def"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:39:1:
	// structField_def : lc_id ':' dataType ';' ;
	public final void structField_def() throws RecognitionException {
		ParserRuleReturnScope lc_id2 = null;
		ParserRuleReturnScope dataType3 = null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:39:16:
			// ( lc_id ':' dataType ';' )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:40:3:
			// lc_id ':' dataType ';'
			{
				pushFollow(FOLLOW_lc_id_in_structField_def203);
				lc_id2 = lc_id();
				state._fsp--;

				match(input, 11, FOLLOW_11_in_structField_def205);
				pushFollow(FOLLOW_dataType_in_structField_def207);
				dataType3 = dataType();
				state._fsp--;

				match(input, 12, FOLLOW_12_in_structField_def209);
				context.currentStruct.addField(
						(lc_id2 != null ? input.toString(lc_id2.start,
								lc_id2.stop) : null),
						(dataType3 != null ? input.toString(dataType3.start,
								dataType3.stop) : null));
				context.constructStructSymblTable(
						context.currentStruct.getStructName(),
						context.currentStruct);
			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "structField_def"

	public static class lc_id_return extends ParserRuleReturnScope {
	};

	// $ANTLR start "lc_id"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:46:1:
	// lc_id : ID ;
	public final InteractionSpecParser.lc_id_return lc_id()
			throws RecognitionException {
		InteractionSpecParser.lc_id_return retval = new InteractionSpecParser.lc_id_return();
		retval.start = input.LT(1);

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:46:6:
			// ( ID )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:46:8:
			// ID
			{
				match(input, ID, FOLLOW_ID_in_lc_id225);
			}

			retval.stop = input.LT(-1);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return retval;
	}

	// $ANTLR end "lc_id"

	public static class dataType_return extends ParserRuleReturnScope {
	};

	// $ANTLR start "dataType"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:49:1:
	// dataType : primitiveType ;
	public final InteractionSpecParser.dataType_return dataType()
			throws RecognitionException {
		InteractionSpecParser.dataType_return retval = new InteractionSpecParser.dataType_return();
		retval.start = input.LT(1);

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:49:9:
			// ( primitiveType )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:50:3:
			// primitiveType
			{
				pushFollow(FOLLOW_primitiveType_in_dataType238);
				primitiveType();
				state._fsp--;

			}

			retval.stop = input.LT(-1);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return retval;
	}

	// $ANTLR end "dataType"

	// $ANTLR start "primitiveType"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:53:1:
	// primitiveType : (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double'
	// |id= 'long' |id= 'boolean' ) ;
	public final void primitiveType() throws RecognitionException {
		Token id = null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:53:14:
			// ( (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id=
			// 'long' |id= 'boolean' ) )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:54:3:
			// (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id=
			// 'long' |id= 'boolean' )
			{
				// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:54:3:
				// (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double'
				// |id= 'long' |id= 'boolean' )
				int alt5 = 6;
				switch (input.LA(1)) {
				case 14: {
					alt5 = 1;
				}
					break;
				case 13: {
					alt5 = 2;
				}
					break;
				case 15: {
					alt5 = 3;
				}
					break;
				case 19: {
					alt5 = 4;
				}
					break;
				case 21: {
					alt5 = 5;
				}
					break;
				case 17: {
					alt5 = 6;
				}
					break;
				default:
					NoViableAltException nvae = new NoViableAltException("", 5,
							0, input);
					throw nvae;
				}
				switch (alt5) {
				case 1:
				// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:54:4:
				// id= 'Integer'
				{
					id = (Token) match(input, 14, FOLLOW_14_in_primitiveType253);
				}
					break;
				case 2:
				// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:54:19:
				// id= 'Boolean'
				{
					id = (Token) match(input, 13, FOLLOW_13_in_primitiveType259);
				}
					break;
				case 3:
				// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:54:34:
				// id= 'String'
				{
					id = (Token) match(input, 15, FOLLOW_15_in_primitiveType265);
				}
					break;
				case 4:
				// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:54:49:
				// id= 'double'
				{
					id = (Token) match(input, 19, FOLLOW_19_in_primitiveType274);
				}
					break;
				case 5:
				// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:54:65:
				// id= 'long'
				{
					id = (Token) match(input, 21, FOLLOW_21_in_primitiveType282);
				}
					break;
				case 6:
				// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:54:79:
				// id= 'boolean'
				{
					id = (Token) match(input, 17, FOLLOW_17_in_primitiveType288);
				}
					break;

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "primitiveType"

	// $ANTLR start "gui_def"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:66:1:
	// gui_def : CAPITALIZED_ID ( gui_command_def ';' )* ( gui_request_def ';'
	// )* ( gui_notify_def ';' )* ;
	public final void gui_def() throws RecognitionException {
		Token CAPITALIZED_ID4 = null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:66:8:
			// ( CAPITALIZED_ID ( gui_command_def ';' )* ( gui_request_def ';'
			// )* ( gui_notify_def ';' )* )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:67:3:
			// CAPITALIZED_ID ( gui_command_def ';' )* ( gui_request_def ';' )*
			// ( gui_notify_def ';' )*
			{
				context.currentGUI = new UserInterfaceCompiler();
				CAPITALIZED_ID4 = (Token) match(input, CAPITALIZED_ID,
						FOLLOW_CAPITALIZED_ID_in_gui_def417);
				// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:69:4:
				// ( gui_command_def ';' )*
				loop6: while (true) {
					int alt6 = 2;
					int LA6_0 = input.LA(1);
					if ((LA6_0 == 18)) {
						alt6 = 1;
					}

					switch (alt6) {
					case 1:
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:69:5:
					// gui_command_def ';'
					{
						pushFollow(FOLLOW_gui_command_def_in_gui_def423);
						gui_command_def();
						state._fsp--;

						match(input, 12, FOLLOW_12_in_gui_def425);
					}
						break;

					default:
						break loop6;
					}
				}

				// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:70:4:
				// ( gui_request_def ';' )*
				loop7: while (true) {
					int alt7 = 2;
					int LA7_0 = input.LA(1);
					if ((LA7_0 == 23)) {
						alt7 = 1;
					}

					switch (alt7) {
					case 1:
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:70:5:
					// gui_request_def ';'
					{
						pushFollow(FOLLOW_gui_request_def_in_gui_def436);
						gui_request_def();
						state._fsp--;

						match(input, 12, FOLLOW_12_in_gui_def439);
					}
						break;

					default:
						break loop7;
					}
				}

				// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:71:5:
				// ( gui_notify_def ';' )*
				loop8: while (true) {
					int alt8 = 2;
					int LA8_0 = input.LA(1);
					if ((LA8_0 == 22)) {
						alt8 = 1;
					}

					switch (alt8) {
					case 1:
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:71:6:
					// gui_notify_def ';'
					{
						pushFollow(FOLLOW_gui_notify_def_in_gui_def451);
						gui_notify_def();
						state._fsp--;

						match(input, 12, FOLLOW_12_in_gui_def454);
					}
						break;

					default:
						break loop8;
					}
				}

				context.currentGUI
						.setGUIName((CAPITALIZED_ID4 != null ? CAPITALIZED_ID4
								.getText() : null));
				context.currentGUI.createGUIObject();
				context.currentGUI.generateCode();
			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "gui_def"

	// $ANTLR start "gui_command_def"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:78:1:
	// gui_command_def : 'command' name= CAPITALIZED_ID '(' (
	// gui_command_parameter_def )? ')' 'to' CAPITALIZED_ID ;
	public final void gui_command_def() throws RecognitionException {
		Token name = null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:78:17:
			// ( 'command' name= CAPITALIZED_ID '(' ( gui_command_parameter_def
			// )? ')' 'to' CAPITALIZED_ID )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:79:5:
			// 'command' name= CAPITALIZED_ID '(' ( gui_command_parameter_def )?
			// ')' 'to' CAPITALIZED_ID
			{
				match(input, 18, FOLLOW_18_in_gui_command_def487);
				name = (Token) match(input, CAPITALIZED_ID,
						FOLLOW_CAPITALIZED_ID_in_gui_command_def494);
				match(input, 8, FOLLOW_8_in_gui_command_def496);
				// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:79:42:
				// ( gui_command_parameter_def )?
				int alt9 = 2;
				int LA9_0 = input.LA(1);
				if ((LA9_0 == ID)) {
					alt9 = 1;
				}
				switch (alt9) {
				case 1:
				// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:79:43:
				// gui_command_parameter_def
				{
					pushFollow(FOLLOW_gui_command_parameter_def_in_gui_command_def499);
					gui_command_parameter_def();
					state._fsp--;

				}
					break;

				}

				match(input, 9, FOLLOW_9_in_gui_command_def503);
				match(input, 26, FOLLOW_26_in_gui_command_def505);
				match(input, CAPITALIZED_ID,
						FOLLOW_CAPITALIZED_ID_in_gui_command_def507);

				context.currentGUI.addCommand((name != null ? name.getText()
						: null));

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "gui_command_def"

	// $ANTLR start "gui_command_parameter_def"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:86:1:
	// gui_command_parameter_def : lc_id ( ',' gui_command_parameter_def )? ;
	public final void gui_command_parameter_def() throws RecognitionException {
		ParserRuleReturnScope lc_id5 = null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:86:27:
			// ( lc_id ( ',' gui_command_parameter_def )? )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:87:5:
			// lc_id ( ',' gui_command_parameter_def )?
			{
				pushFollow(FOLLOW_lc_id_in_gui_command_parameter_def529);
				lc_id5 = lc_id();
				state._fsp--;

				// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:87:11:
				// ( ',' gui_command_parameter_def )?
				int alt10 = 2;
				int LA10_0 = input.LA(1);
				if ((LA10_0 == 10)) {
					alt10 = 1;
				}
				switch (alt10) {
				case 1:
				// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:87:12:
				// ',' gui_command_parameter_def
				{
					match(input, 10, FOLLOW_10_in_gui_command_parameter_def532);
					pushFollow(FOLLOW_gui_command_parameter_def_in_gui_command_parameter_def534);
					gui_command_parameter_def();
					state._fsp--;

				}
					break;

				}

				context.currentGUI.addCommandParameter((lc_id5 != null ? input
						.toString(lc_id5.start, lc_id5.stop) : null));

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "gui_command_parameter_def"

	// $ANTLR start "gui_action_def"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:93:1:
	// gui_action_def : 'action' name= CAPITALIZED_ID '(' (
	// gui_action_parameter_def )? ')' 'with' ui= lc_id ;
	public final void gui_action_def() throws RecognitionException {
		Token name = null;
		ParserRuleReturnScope ui = null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:93:15:
			// ( 'action' name= CAPITALIZED_ID '(' ( gui_action_parameter_def )?
			// ')' 'with' ui= lc_id )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:94:5:
			// 'action' name= CAPITALIZED_ID '(' ( gui_action_parameter_def )?
			// ')' 'with' ui= lc_id
			{
				match(input, 16, FOLLOW_16_in_gui_action_def555);
				name = (Token) match(input, CAPITALIZED_ID,
						FOLLOW_CAPITALIZED_ID_in_gui_action_def561);
				match(input, 8, FOLLOW_8_in_gui_action_def563);
				// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:94:40:
				// ( gui_action_parameter_def )?
				int alt11 = 2;
				int LA11_0 = input.LA(1);
				if ((LA11_0 == ID)) {
					alt11 = 1;
				}
				switch (alt11) {
				case 1:
				// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:94:41:
				// gui_action_parameter_def
				{
					pushFollow(FOLLOW_gui_action_parameter_def_in_gui_action_def566);
					gui_action_parameter_def();
					state._fsp--;

				}
					break;

				}

				match(input, 9, FOLLOW_9_in_gui_action_def570);
				match(input, 28, FOLLOW_28_in_gui_action_def572);
				pushFollow(FOLLOW_lc_id_in_gui_action_def578);
				ui = lc_id();
				state._fsp--;

				context.currentGUI
						.addAction((name != null ? name.getText() : null),
								(ui != null ? input.toString(ui.start, ui.stop)
										: null));
			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "gui_action_def"

	// $ANTLR start "gui_action_parameter_def"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:98:1:
	// gui_action_parameter_def : lc_id ':' CAPITALIZED_ID ( ','
	// gui_action_parameter_def )? ;
	public final void gui_action_parameter_def() throws RecognitionException {
		Token CAPITALIZED_ID7 = null;
		ParserRuleReturnScope lc_id6 = null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:98:26:
			// ( lc_id ':' CAPITALIZED_ID ( ',' gui_action_parameter_def )? )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:99:5:
			// lc_id ':' CAPITALIZED_ID ( ',' gui_action_parameter_def )?
			{
				pushFollow(FOLLOW_lc_id_in_gui_action_parameter_def598);
				lc_id6 = lc_id();
				state._fsp--;

				match(input, 11, FOLLOW_11_in_gui_action_parameter_def600);
				CAPITALIZED_ID7 = (Token) match(input, CAPITALIZED_ID,
						FOLLOW_CAPITALIZED_ID_in_gui_action_parameter_def603);
				// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:99:31:
				// ( ',' gui_action_parameter_def )?
				int alt12 = 2;
				int LA12_0 = input.LA(1);
				if ((LA12_0 == 10)) {
					alt12 = 1;
				}
				switch (alt12) {
				case 1:
				// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:99:32:
				// ',' gui_action_parameter_def
				{
					match(input, 10, FOLLOW_10_in_gui_action_parameter_def606);
					pushFollow(FOLLOW_gui_action_parameter_def_in_gui_action_parameter_def608);
					gui_action_parameter_def();
					state._fsp--;

				}
					break;

				}

				context.currentGUI.addActionParameter(
						(lc_id6 != null ? input.toString(lc_id6.start,
								lc_id6.stop) : null),
						(CAPITALIZED_ID7 != null ? CAPITALIZED_ID7.getText()
								: null));
				context.constructSymbTable(
						(lc_id6 != null ? input.toString(lc_id6.start,
								lc_id6.stop) : null),
						(CAPITALIZED_ID7 != null ? CAPITALIZED_ID7.getText()
								: null));

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "gui_action_parameter_def"

	// $ANTLR start "gui_request_def"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:106:1:
	// gui_request_def : 'request' lc_id 'to' CAPITALIZED_ID ;
	public final void gui_request_def() throws RecognitionException {
		ParserRuleReturnScope lc_id8 = null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:106:17:
			// ( 'request' lc_id 'to' CAPITALIZED_ID )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:107:4:
			// 'request' lc_id 'to' CAPITALIZED_ID
			{
				match(input, 23, FOLLOW_23_in_gui_request_def630);
				pushFollow(FOLLOW_lc_id_in_gui_request_def632);
				lc_id8 = lc_id();
				state._fsp--;

				match(input, 26, FOLLOW_26_in_gui_request_def634);
				match(input, CAPITALIZED_ID,
						FOLLOW_CAPITALIZED_ID_in_gui_request_def636);
				context.currentGUI
						.getDataAccessListFromSymblTable((lc_id8 != null ? input
								.toString(lc_id8.start, lc_id8.stop) : null));
				context.currentGUI.setRequestType(context
						.getResponseTypeSymblTable((lc_id8 != null ? input
								.toString(lc_id8.start, lc_id8.stop) : null)));
			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "gui_request_def"

	// $ANTLR start "gui_notify_def"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:112:1:
	// gui_notify_def : 'notify' ( gui_display_def )* 'from' CAPITALIZED_ID ;
	public final void gui_notify_def() throws RecognitionException {
		Token CAPITALIZED_ID9 = null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:112:16:
			// ( 'notify' ( gui_display_def )* 'from' CAPITALIZED_ID )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:113:5:
			// 'notify' ( gui_display_def )* 'from' CAPITALIZED_ID
			{
				match(input, 22, FOLLOW_22_in_gui_notify_def658);
				// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:113:14:
				// ( gui_display_def )*
				loop13: while (true) {
					int alt13 = 2;
					int LA13_0 = input.LA(1);
					if ((LA13_0 == CAPITALIZED_ID)) {
						alt13 = 1;
					}

					switch (alt13) {
					case 1:
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:113:15:
					// gui_display_def
					{
						pushFollow(FOLLOW_gui_display_def_in_gui_notify_def661);
						gui_display_def();
						state._fsp--;

					}
						break;

					default:
						break loop13;
					}
				}

				match(input, 20, FOLLOW_20_in_gui_notify_def665);
				CAPITALIZED_ID9 = (Token) match(input, CAPITALIZED_ID,
						FOLLOW_CAPITALIZED_ID_in_gui_notify_def667);
				context.currentGUI
						.notifyFrom((CAPITALIZED_ID9 != null ? CAPITALIZED_ID9
								.getText() : null));
			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "gui_notify_def"

	// $ANTLR start "gui_display_def"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:117:1:
	// gui_display_def : CAPITALIZED_ID '(' gui_notify_parameter_def ')' ;
	public final void gui_display_def() throws RecognitionException {
		Token CAPITALIZED_ID10 = null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:117:17:
			// ( CAPITALIZED_ID '(' gui_notify_parameter_def ')' )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:119:3:
			// CAPITALIZED_ID '(' gui_notify_parameter_def ')'
			{
				CAPITALIZED_ID10 = (Token) match(input, CAPITALIZED_ID,
						FOLLOW_CAPITALIZED_ID_in_gui_display_def691);

				context.currentActuator = new ActuatorCompiler(
						(CAPITALIZED_ID10 != null ? CAPITALIZED_ID10.getText()
								: null));
				match(input, 8, FOLLOW_8_in_gui_display_def703);
				pushFollow(FOLLOW_gui_notify_parameter_def_in_gui_display_def705);
				gui_notify_parameter_def();
				state._fsp--;

				match(input, 9, FOLLOW_9_in_gui_display_def707);

				context.currentActuator
						.addAction((CAPITALIZED_ID10 != null ? CAPITALIZED_ID10
								.getText() : null));
				// context.currentActuator.generateActuatorCode();
				context.currentGUI
						.setNotifyName((CAPITALIZED_ID10 != null ? CAPITALIZED_ID10
								.getText() : null));

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "gui_display_def"

	// $ANTLR start "gui_notify_parameter_def"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:130:1:
	// gui_notify_parameter_def : lc_id ':' CAPITALIZED_ID ( ','
	// gui_notify_parameter_def )? ;
	public final void gui_notify_parameter_def() throws RecognitionException {
		Token CAPITALIZED_ID11 = null;
		ParserRuleReturnScope lc_id12 = null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:130:25:
			// ( lc_id ':' CAPITALIZED_ID ( ',' gui_notify_parameter_def )? )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:132:1:
			// lc_id ':' CAPITALIZED_ID ( ',' gui_notify_parameter_def )?
			{
				pushFollow(FOLLOW_lc_id_in_gui_notify_parameter_def724);
				lc_id12 = lc_id();
				state._fsp--;

				match(input, 11, FOLLOW_11_in_gui_notify_parameter_def726);
				CAPITALIZED_ID11 = (Token) match(input, CAPITALIZED_ID,
						FOLLOW_CAPITALIZED_ID_in_gui_notify_parameter_def728);
				// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:132:27:
				// ( ',' gui_notify_parameter_def )?
				int alt14 = 2;
				int LA14_0 = input.LA(1);
				if ((LA14_0 == 10)) {
					alt14 = 1;
				}
				switch (alt14) {
				case 1:
				// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\InteractionSpec.g:132:28:
				// ',' gui_notify_parameter_def
				{
					match(input, 10, FOLLOW_10_in_gui_notify_parameter_def732);
					pushFollow(FOLLOW_gui_notify_parameter_def_in_gui_notify_parameter_def734);
					gui_notify_parameter_def();
					state._fsp--;

				}
					break;

				}

				context.constructActuatorSymblTable((CAPITALIZED_ID11 != null ? CAPITALIZED_ID11
						.getText() : null));
				context.currentActuator.addParameter(
						(lc_id12 != null ? input.toString(lc_id12.start,
								lc_id12.stop) : null),
						(CAPITALIZED_ID11 != null ? CAPITALIZED_ID11.getText()
								: null));
				context.currentGUI
						.setNotifyParameter((CAPITALIZED_ID11 != null ? CAPITALIZED_ID11
								.getText() : null));
				context.constructSymbTable(
						(lc_id12 != null ? input.toString(lc_id12.start,
								lc_id12.stop) : null),
						(CAPITALIZED_ID11 != null ? CAPITALIZED_ID11.getText()
								: null));
			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "gui_notify_parameter_def"

	// Delegated rules

	public static final BitSet FOLLOW_25_in_interactionSpec79 = new BitSet(
			new long[] { 0x0000000000000800L });
	public static final BitSet FOLLOW_11_in_interactionSpec81 = new BitSet(
			new long[] { 0x0000000002000010L });
	public static final BitSet FOLLOW_struct_def_in_interactionSpec94 = new BitSet(
			new long[] { 0x0000000001000010L });
	public static final BitSet FOLLOW_24_in_interactionSpec106 = new BitSet(
			new long[] { 0x0000000000000800L });
	public static final BitSet FOLLOW_11_in_interactionSpec108 = new BitSet(
			new long[] { 0x0000000008000000L });
	public static final BitSet FOLLOW_27_in_interactionSpec117 = new BitSet(
			new long[] { 0x0000000000000800L });
	public static final BitSet FOLLOW_11_in_interactionSpec119 = new BitSet(
			new long[] { 0x0000000000000012L });
	public static final BitSet FOLLOW_gui_def_in_interactionSpec136 = new BitSet(
			new long[] { 0x0000000000000012L });
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_struct_def167 = new BitSet(
			new long[] { 0x0000000000000020L });
	public static final BitSet FOLLOW_structField_def_in_struct_def181 = new BitSet(
			new long[] { 0x0000000000000022L });
	public static final BitSet FOLLOW_lc_id_in_structField_def203 = new BitSet(
			new long[] { 0x0000000000000800L });
	public static final BitSet FOLLOW_11_in_structField_def205 = new BitSet(
			new long[] { 0x00000000002AE000L });
	public static final BitSet FOLLOW_dataType_in_structField_def207 = new BitSet(
			new long[] { 0x0000000000001000L });
	public static final BitSet FOLLOW_12_in_structField_def209 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ID_in_lc_id225 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_primitiveType_in_dataType238 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_14_in_primitiveType253 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_13_in_primitiveType259 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_15_in_primitiveType265 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_19_in_primitiveType274 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_21_in_primitiveType282 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_17_in_primitiveType288 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_def417 = new BitSet(
			new long[] { 0x0000000000C40002L });
	public static final BitSet FOLLOW_gui_command_def_in_gui_def423 = new BitSet(
			new long[] { 0x0000000000001000L });
	public static final BitSet FOLLOW_12_in_gui_def425 = new BitSet(
			new long[] { 0x0000000000C40002L });
	public static final BitSet FOLLOW_gui_request_def_in_gui_def436 = new BitSet(
			new long[] { 0x0000000000001000L });
	public static final BitSet FOLLOW_12_in_gui_def439 = new BitSet(
			new long[] { 0x0000000000C00002L });
	public static final BitSet FOLLOW_gui_notify_def_in_gui_def451 = new BitSet(
			new long[] { 0x0000000000001000L });
	public static final BitSet FOLLOW_12_in_gui_def454 = new BitSet(
			new long[] { 0x0000000000400002L });
	public static final BitSet FOLLOW_18_in_gui_command_def487 = new BitSet(
			new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_command_def494 = new BitSet(
			new long[] { 0x0000000000000100L });
	public static final BitSet FOLLOW_8_in_gui_command_def496 = new BitSet(
			new long[] { 0x0000000000000220L });
	public static final BitSet FOLLOW_gui_command_parameter_def_in_gui_command_def499 = new BitSet(
			new long[] { 0x0000000000000200L });
	public static final BitSet FOLLOW_9_in_gui_command_def503 = new BitSet(
			new long[] { 0x0000000004000000L });
	public static final BitSet FOLLOW_26_in_gui_command_def505 = new BitSet(
			new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_command_def507 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_lc_id_in_gui_command_parameter_def529 = new BitSet(
			new long[] { 0x0000000000000402L });
	public static final BitSet FOLLOW_10_in_gui_command_parameter_def532 = new BitSet(
			new long[] { 0x0000000000000020L });
	public static final BitSet FOLLOW_gui_command_parameter_def_in_gui_command_parameter_def534 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_16_in_gui_action_def555 = new BitSet(
			new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_action_def561 = new BitSet(
			new long[] { 0x0000000000000100L });
	public static final BitSet FOLLOW_8_in_gui_action_def563 = new BitSet(
			new long[] { 0x0000000000000220L });
	public static final BitSet FOLLOW_gui_action_parameter_def_in_gui_action_def566 = new BitSet(
			new long[] { 0x0000000000000200L });
	public static final BitSet FOLLOW_9_in_gui_action_def570 = new BitSet(
			new long[] { 0x0000000010000000L });
	public static final BitSet FOLLOW_28_in_gui_action_def572 = new BitSet(
			new long[] { 0x0000000000000020L });
	public static final BitSet FOLLOW_lc_id_in_gui_action_def578 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_lc_id_in_gui_action_parameter_def598 = new BitSet(
			new long[] { 0x0000000000000800L });
	public static final BitSet FOLLOW_11_in_gui_action_parameter_def600 = new BitSet(
			new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_action_parameter_def603 = new BitSet(
			new long[] { 0x0000000000000402L });
	public static final BitSet FOLLOW_10_in_gui_action_parameter_def606 = new BitSet(
			new long[] { 0x0000000000000020L });
	public static final BitSet FOLLOW_gui_action_parameter_def_in_gui_action_parameter_def608 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_23_in_gui_request_def630 = new BitSet(
			new long[] { 0x0000000000000020L });
	public static final BitSet FOLLOW_lc_id_in_gui_request_def632 = new BitSet(
			new long[] { 0x0000000004000000L });
	public static final BitSet FOLLOW_26_in_gui_request_def634 = new BitSet(
			new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_request_def636 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_22_in_gui_notify_def658 = new BitSet(
			new long[] { 0x0000000000100010L });
	public static final BitSet FOLLOW_gui_display_def_in_gui_notify_def661 = new BitSet(
			new long[] { 0x0000000000100010L });
	public static final BitSet FOLLOW_20_in_gui_notify_def665 = new BitSet(
			new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_notify_def667 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_display_def691 = new BitSet(
			new long[] { 0x0000000000000100L });
	public static final BitSet FOLLOW_8_in_gui_display_def703 = new BitSet(
			new long[] { 0x0000000000000020L });
	public static final BitSet FOLLOW_gui_notify_parameter_def_in_gui_display_def705 = new BitSet(
			new long[] { 0x0000000000000200L });
	public static final BitSet FOLLOW_9_in_gui_display_def707 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_lc_id_in_gui_notify_parameter_def724 = new BitSet(
			new long[] { 0x0000000000000800L });
	public static final BitSet FOLLOW_11_in_gui_notify_parameter_def726 = new BitSet(
			new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_notify_parameter_def728 = new BitSet(
			new long[] { 0x0000000000000402L });
	public static final BitSet FOLLOW_10_in_gui_notify_parameter_def732 = new BitSet(
			new long[] { 0x0000000000000020L });
	public static final BitSet FOLLOW_gui_notify_parameter_def_in_gui_notify_parameter_def734 = new BitSet(
			new long[] { 0x0000000000000002L });
}
