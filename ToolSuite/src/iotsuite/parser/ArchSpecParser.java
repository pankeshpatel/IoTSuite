// $ANTLR 3.5.1 C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g 2014-02-16 16:44:24

package iotsuite.parser;

import iotsuite.compiler.*;
import iotsuite.semanticmodel.*;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ArchSpecParser extends Parser {
	public static final String[] tokenNames = new String[] { "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CAPITALIZED_ID", "ID", "INT", "WS", "'('", "')'", "','", "':'", "';'", "'Boolean'", "'Integer'",
			"'String'", "'accessed-by'", "'action'", "'attribute'", "'boolean'", "'command'", "'computationalService'", "'consume'", "'deployment-instance'", "'double'", "'from'", "'generate'",
			"'long'", "'partition-per'", "'region-hops'", "'request'", "'singleton'", "'softwarecomponents'", "'structs'", "'to'" };
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
	public static final int T__29 = 29;
	public static final int T__30 = 30;
	public static final int T__31 = 31;
	public static final int T__32 = 32;
	public static final int T__33 = 33;
	public static final int T__34 = 34;
	public static final int CAPITALIZED_ID = 4;
	public static final int ID = 5;
	public static final int INT = 6;
	public static final int WS = 7;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators

	public ArchSpecParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}

	public ArchSpecParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override
	public String[] getTokenNames() {
		return ArchSpecParser.tokenNames;
	}

	@Override
	public String getGrammarFileName() {
		return "C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g";
	}

	// Initialize the context
	private SymbolTable context;

	// $ANTLR start "archSpec"
	// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:24:1:
	// archSpec : ( 'structs' ':' struct_def )* 'softwarecomponents' ':'
	// component_def ;
	public final void archSpec() throws RecognitionException {
		try {
			// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:24:10:
			// ( ( 'structs' ':' struct_def )* 'softwarecomponents' ':'
			// component_def )
			// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:25:5:
			// ( 'structs' ':' struct_def )* 'softwarecomponents' ':'
			// component_def
			{
				context = new SymbolTable();
				context.currentRegion = new RegionCompiler();
				context.currentMappingConstraint = new MapperCompiler();
				context.currentRegion.generateRegionCode();
				// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:29:5:
				// ( 'structs' ':' struct_def )*
				loop1: while (true) {
					int alt1 = 2;
					int LA1_0 = input.LA(1);
					if ((LA1_0 == 33)) {
						alt1 = 1;
					}

					switch (alt1) {
					case 1:
						// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:29:6:
						// 'structs' ':' struct_def
					{
						match(input, 33, FOLLOW_33_in_archSpec83);
						match(input, 11, FOLLOW_11_in_archSpec85);
						pushFollow(FOLLOW_struct_def_in_archSpec87);
						struct_def();
						state._fsp--;

					}
						break;

					default:
						break loop1;
					}
				}

				match(input, 32, FOLLOW_32_in_archSpec98);
				match(input, 11, FOLLOW_11_in_archSpec100);
				pushFollow(FOLLOW_component_def_in_archSpec102);
				component_def();
				state._fsp--;

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "archSpec"

	// $ANTLR start "component_def"
	// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:41:1:
	// component_def : 'computationalService' ':' ( cs_def )+ ;
	public final void component_def() throws RecognitionException {
		try {
			// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:41:15:
			// ( 'computationalService' ':' ( cs_def )+ )
			// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:43:4:
			// 'computationalService' ':' ( cs_def )+
			{
				match(input, 21, FOLLOW_21_in_component_def129);
				match(input, 11, FOLLOW_11_in_component_def131);
				// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:43:31:
				// ( cs_def )+
				int cnt2 = 0;
				loop2: while (true) {
					int alt2 = 2;
					int LA2_0 = input.LA(1);
					if ((LA2_0 == CAPITALIZED_ID)) {
						alt2 = 1;
					}

					switch (alt2) {
					case 1:
						// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:43:32:
						// cs_def
					{
						pushFollow(FOLLOW_cs_def_in_component_def134);
						cs_def();
						state._fsp--;

					}
						break;

					default:
						if (cnt2 >= 1)
							break loop2;
						EarlyExitException eee = new EarlyExitException(2, input);
						throw eee;
					}
					cnt2++;
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "component_def"

	// $ANTLR start "cs_def"
	// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:51:1:
	// cs_def : CAPITALIZED_ID ( csAttribute_def ';' )* ( csGeneratedInfo_def
	// ';' )* ( csConsumeInfo_def ';' )* ( csRequest_def ';' )* (
	// cntrlCommand_def ';' )* ( partition_def ';' )* ;
	public final void cs_def() throws RecognitionException {
		Token CAPITALIZED_ID1 = null;

		try {
			// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:51:7:
			// ( CAPITALIZED_ID ( csAttribute_def ';' )* ( csGeneratedInfo_def
			// ';' )* ( csConsumeInfo_def ';' )* ( csRequest_def ';' )* (
			// cntrlCommand_def ';' )* ( partition_def ';' )* )
			// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:52:3:
			// CAPITALIZED_ID ( csAttribute_def ';' )* ( csGeneratedInfo_def ';'
			// )* ( csConsumeInfo_def ';' )* ( csRequest_def ';' )* (
			// cntrlCommand_def ';' )* ( partition_def ';' )*
			{
				CAPITALIZED_ID1 = (Token) match(input, CAPITALIZED_ID, FOLLOW_CAPITALIZED_ID_in_cs_def167);

				context.currentComputationalService = new ComputationalServiceCompiler();
				context.currentMappingConstraint.setSoftwareComponentName((CAPITALIZED_ID1 != null ? CAPITALIZED_ID1.getText() : null));
				// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:56:5:
				// ( csAttribute_def ';' )*
				loop3: while (true) {
					int alt3 = 2;
					int LA3_0 = input.LA(1);
					if ((LA3_0 == 18)) {
						alt3 = 1;
					}

					switch (alt3) {
					case 1:
						// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:56:6:
						// csAttribute_def ';'
					{
						pushFollow(FOLLOW_csAttribute_def_in_cs_def180);
						csAttribute_def();
						state._fsp--;

						match(input, 12, FOLLOW_12_in_cs_def182);
					}
						break;

					default:
						break loop3;
					}
				}

				// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:57:5:
				// ( csGeneratedInfo_def ';' )*
				loop4: while (true) {
					int alt4 = 2;
					int LA4_0 = input.LA(1);
					if ((LA4_0 == 26)) {
						alt4 = 1;
					}

					switch (alt4) {
					case 1:
						// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:57:6:
						// csGeneratedInfo_def ';'
					{
						pushFollow(FOLLOW_csGeneratedInfo_def_in_cs_def191);
						csGeneratedInfo_def();
						state._fsp--;

						match(input, 12, FOLLOW_12_in_cs_def193);
					}
						break;

					default:
						break loop4;
					}
				}

				// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:58:5:
				// ( csConsumeInfo_def ';' )*
				loop5: while (true) {
					int alt5 = 2;
					int LA5_0 = input.LA(1);
					if ((LA5_0 == 22)) {
						alt5 = 1;
					}

					switch (alt5) {
					case 1:
						// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:58:6:
						// csConsumeInfo_def ';'
					{
						pushFollow(FOLLOW_csConsumeInfo_def_in_cs_def203);
						csConsumeInfo_def();
						state._fsp--;

						match(input, 12, FOLLOW_12_in_cs_def205);
					}
						break;

					default:
						break loop5;
					}
				}

				// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:59:5:
				// ( csRequest_def ';' )*
				loop6: while (true) {
					int alt6 = 2;
					int LA6_0 = input.LA(1);
					if ((LA6_0 == 30)) {
						alt6 = 1;
					}

					switch (alt6) {
					case 1:
						// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:59:6:
						// csRequest_def ';'
					{
						pushFollow(FOLLOW_csRequest_def_in_cs_def215);
						csRequest_def();
						state._fsp--;

						match(input, 12, FOLLOW_12_in_cs_def218);
					}
						break;

					default:
						break loop6;
					}
				}

				// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:60:5:
				// ( cntrlCommand_def ';' )*
				loop7: while (true) {
					int alt7 = 2;
					int LA7_0 = input.LA(1);
					if ((LA7_0 == 20)) {
						alt7 = 1;
					}

					switch (alt7) {
					case 1:
						// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:60:6:
						// cntrlCommand_def ';'
					{
						pushFollow(FOLLOW_cntrlCommand_def_in_cs_def227);
						cntrlCommand_def();
						state._fsp--;

						match(input, 12, FOLLOW_12_in_cs_def229);
					}
						break;

					default:
						break loop7;
					}
				}

				// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:61:5:
				// ( partition_def ';' )*
				loop8: while (true) {
					int alt8 = 2;
					int LA8_0 = input.LA(1);
					if ((LA8_0 == 28)) {
						alt8 = 1;
					}

					switch (alt8) {
					case 1:
						// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:61:6:
						// partition_def ';'
					{
						pushFollow(FOLLOW_partition_def_in_cs_def239);
						partition_def();
						state._fsp--;

						match(input, 12, FOLLOW_12_in_cs_def241);
					}
						break;

					default:
						break loop8;
					}
				}

				context.currentComputationalService.setComputationalServiceName((CAPITALIZED_ID1 != null ? CAPITALIZED_ID1.getText() : null));
				context.currentComputationalService.createCSObject();
				context.currentComputationalService.generateComputationalServiceCode();
				// Next line is for Software Component Name
				context.currentMappingConstraint.setSoftwareComponentName((CAPITALIZED_ID1 != null ? CAPITALIZED_ID1.getText() : null));
				context.currentMappingConstraint.addDeployementConstraintObj(); // This
																				// line
																				// creates
																				// a
																				// Symbol
																				// Table

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "cs_def"

	// $ANTLR start "ss_def"
	// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:73:1:
	// ss_def : CAPITALIZED_ID ( storageAttribute_def ';' )* (
	// storageDataAccess_def ';' )* ( storagePartition_def ';' )* ;
	public final void ss_def() throws RecognitionException {
		Token CAPITALIZED_ID2 = null;

		try {
			// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:73:7:
			// ( CAPITALIZED_ID ( storageAttribute_def ';' )* (
			// storageDataAccess_def ';' )* ( storagePartition_def ';' )* )
			// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:74:3:
			// CAPITALIZED_ID ( storageAttribute_def ';' )* (
			// storageDataAccess_def ';' )* ( storagePartition_def ';' )*
			{
				CAPITALIZED_ID2 = (Token) match(input, CAPITALIZED_ID, FOLLOW_CAPITALIZED_ID_in_ss_def259);
				context.currentStorageService = new StorageCompiler();
				// context.currentStorageService = new
				// Storage((CAPITALIZED_ID2!=null?CAPITALIZED_ID2.getText():null));

				// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:78:5:
				// ( storageAttribute_def ';' )*
				loop9: while (true) {
					int alt9 = 2;
					int LA9_0 = input.LA(1);
					if ((LA9_0 == 18)) {
						alt9 = 1;
					}

					switch (alt9) {
					case 1:
						// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:78:6:
						// storageAttribute_def ';'
					{
						pushFollow(FOLLOW_storageAttribute_def_in_ss_def272);
						storageAttribute_def();
						state._fsp--;

						match(input, 12, FOLLOW_12_in_ss_def274);
					}
						break;

					default:
						break loop9;
					}
				}

				// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:79:5:
				// ( storageDataAccess_def ';' )*
				loop10: while (true) {
					int alt10 = 2;
					int LA10_0 = input.LA(1);
					if ((LA10_0 == 26)) {
						alt10 = 1;
					}

					switch (alt10) {
					case 1:
						// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:79:6:
						// storageDataAccess_def ';'
					{
						pushFollow(FOLLOW_storageDataAccess_def_in_ss_def283);
						storageDataAccess_def();
						state._fsp--;

						match(input, 12, FOLLOW_12_in_ss_def285);
					}
						break;

					default:
						break loop10;
					}
				}

				// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:80:5:
				// ( storagePartition_def ';' )*
				loop11: while (true) {
					int alt11 = 2;
					int LA11_0 = input.LA(1);
					if ((LA11_0 == 23)) {
						alt11 = 1;
					}

					switch (alt11) {
					case 1:
						// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:80:6:
						// storagePartition_def ';'
					{
						pushFollow(FOLLOW_storagePartition_def_in_ss_def295);
						storagePartition_def();
						state._fsp--;

						match(input, 12, FOLLOW_12_in_ss_def297);
					}
						break;

					default:
						break loop11;
					}
				}

				context.currentStorageService.setStorageServiceName((CAPITALIZED_ID2 != null ? CAPITALIZED_ID2.getText() : null));
				context.currentStorageService.createStorageObject();
				context.currentStorageService.generateStorageCode();
				context.currentMappingConstraint.setSoftwareComponentName((CAPITALIZED_ID2 != null ? CAPITALIZED_ID2.getText() : null));
				context.currentMappingConstraint.addDeployementConstraintObj(); // This
																				// line
																				// creates
																				// a
																				// Symbol
																				// Table

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "ss_def"

	// $ANTLR start "storageAttribute_def"
	// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:92:1:
	// storageAttribute_def : 'attribute' lc_id ':' dataType ;
	public final void storageAttribute_def() throws RecognitionException {
		ParserRuleReturnScope lc_id3 = null;
		ParserRuleReturnScope dataType4 = null;

		try {
			// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:92:21:
			// ( 'attribute' lc_id ':' dataType )
			// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:93:3:
			// 'attribute' lc_id ':' dataType
			{
				match(input, 18, FOLLOW_18_in_storageAttribute_def317);
				pushFollow(FOLLOW_lc_id_in_storageAttribute_def319);
				lc_id3 = lc_id();
				state._fsp--;

				match(input, 11, FOLLOW_11_in_storageAttribute_def321);
				pushFollow(FOLLOW_dataType_in_storageAttribute_def323);
				dataType4 = dataType();
				state._fsp--;

				/*
				 * context.currentStorageService.addAttribute((lc_id3 != null ?
				 * input.toString(lc_id3.start, lc_id3.stop) : null), (dataType4
				 * != null ? input.toString(dataType4.start, dataType4.stop) :
				 * null));
				 */
			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "storageAttribute_def"

	// $ANTLR start "storageDataAccess_def"
	// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:97:1:
	// storageDataAccess_def : storageGeneratedInfo_def 'accessed-by'
	// storagedataIndex_def ;
	public final void storageDataAccess_def() throws RecognitionException {
		try {
			// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:97:23:
			// ( storageGeneratedInfo_def 'accessed-by' storagedataIndex_def )
			// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:98:6:
			// storageGeneratedInfo_def 'accessed-by' storagedataIndex_def
			{
				pushFollow(FOLLOW_storageGeneratedInfo_def_in_storageDataAccess_def344);
				storageGeneratedInfo_def();
				state._fsp--;

				match(input, 16, FOLLOW_16_in_storageDataAccess_def347);
				pushFollow(FOLLOW_storagedataIndex_def_in_storageDataAccess_def349);
				storagedataIndex_def();
				state._fsp--;

				context.currentStorageService.addDataAccess();
			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "storageDataAccess_def"

	// $ANTLR start "storageGeneratedInfo_def"
	// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:102:1:
	// storageGeneratedInfo_def : 'generate' lc_id ':' CAPITALIZED_ID ;
	public final void storageGeneratedInfo_def() throws RecognitionException {
		Token CAPITALIZED_ID6 = null;
		ParserRuleReturnScope lc_id5 = null;

		try {
			// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:102:26:
			// ( 'generate' lc_id ':' CAPITALIZED_ID )
			// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:103:5:
			// 'generate' lc_id ':' CAPITALIZED_ID
			{
				match(input, 26, FOLLOW_26_in_storageGeneratedInfo_def368);
				pushFollow(FOLLOW_lc_id_in_storageGeneratedInfo_def370);
				lc_id5 = lc_id();
				state._fsp--;

				match(input, 11, FOLLOW_11_in_storageGeneratedInfo_def372);
				CAPITALIZED_ID6 = (Token) match(input, CAPITALIZED_ID, FOLLOW_CAPITALIZED_ID_in_storageGeneratedInfo_def375);
				context.currentStorageService.addGeneratedInfo((lc_id5 != null ? input.toString(lc_id5.start, lc_id5.stop) : null), (CAPITALIZED_ID6 != null ? CAPITALIZED_ID6.getText() : null));
				context.constructSymbTable((lc_id5 != null ? input.toString(lc_id5.start, lc_id5.stop) : null), (CAPITALIZED_ID6 != null ? CAPITALIZED_ID6.getText() : null));
			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "storageGeneratedInfo_def"

	// $ANTLR start "storagedataIndex_def"
	// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:108:1:
	// storagedataIndex_def : lc_id ':' dataType ;
	public final void storagedataIndex_def() throws RecognitionException {
		ParserRuleReturnScope lc_id7 = null;
		ParserRuleReturnScope dataType8 = null;

		try {
			// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:108:21:
			// ( lc_id ':' dataType )
			// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:109:9:
			// lc_id ':' dataType
			{
				pushFollow(FOLLOW_lc_id_in_storagedataIndex_def397);
				lc_id7 = lc_id();
				state._fsp--;

				match(input, 11, FOLLOW_11_in_storagedataIndex_def399);
				pushFollow(FOLLOW_dataType_in_storagedataIndex_def401);
				dataType8 = dataType();
				state._fsp--;

				context.currentStorageService.addDataAccessIndex((lc_id7 != null ? input.toString(lc_id7.start, lc_id7.stop) : null),
						(dataType8 != null ? input.toString(dataType8.start, dataType8.stop) : null));
			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "storagedataIndex_def"

	// $ANTLR start "storagePartition_def"
	// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:113:1:
	// storagePartition_def : storageDeploymentConstraint= 'deployment-instance'
	// ':' storageDeploymentConstraintValue= 'singleton' ;
	public final void storagePartition_def() throws RecognitionException {
		Token storageDeploymentConstraint = null;
		Token storageDeploymentConstraintValue = null;

		try {
			// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:113:22:
			// (storageDeploymentConstraint= 'deployment-instance' ':'
			// storageDeploymentConstraintValue= 'singleton' )
			// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:114:5:
			// storageDeploymentConstraint= 'deployment-instance' ':'
			// storageDeploymentConstraintValue= 'singleton'
			{
				storageDeploymentConstraint = (Token) match(input, 23, FOLLOW_23_in_storagePartition_def430);
				match(input, 11, FOLLOW_11_in_storagePartition_def432);
				storageDeploymentConstraintValue = (Token) match(input, 31, FOLLOW_31_in_storagePartition_def438);

				// Next two lines are for Mapping constraints
				context.currentMappingConstraint.setAttributeName((storageDeploymentConstraint != null ? storageDeploymentConstraint.getText() : null));
				context.currentMappingConstraint.setAttributeValue((storageDeploymentConstraintValue != null ? storageDeploymentConstraintValue.getText() : null));

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "storagePartition_def"

	// $ANTLR start "cntrlAttribute_def"
	// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:154:1:
	// cntrlAttribute_def : 'attribute' lc_id ':' dataType ;
	public final void cntrlAttribute_def() throws RecognitionException {
		ParserRuleReturnScope lc_id9 = null;
		ParserRuleReturnScope dataType10 = null;

		try {
			// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:154:19:
			// ( 'attribute' lc_id ':' dataType )
			// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:155:3:
			// 'attribute' lc_id ':' dataType
			{
				match(input, 18, FOLLOW_18_in_cntrlAttribute_def499);
				pushFollow(FOLLOW_lc_id_in_cntrlAttribute_def501);
				lc_id9 = lc_id();
				state._fsp--;

				match(input, 11, FOLLOW_11_in_cntrlAttribute_def503);
				pushFollow(FOLLOW_dataType_in_cntrlAttribute_def505);
				dataType10 = dataType();
				state._fsp--;

				/*
				 * context.currentController.addAttribute((lc_id9 != null ?
				 * input.toString(lc_id9.start, lc_id9.stop) : null),
				 * (dataType10 != null ? input.toString(dataType10.start,
				 * dataType10.stop) : null));
				 */
			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "cntrlAttribute_def"

	// $ANTLR start "cntrlConsumeInfo_def"
	// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:159:1:
	// cntrlConsumeInfo_def : 'consume' lc_id ( 'from' 'region-hops' ':' INT ':'
	// CAPITALIZED_ID )? ;
	public final void cntrlConsumeInfo_def() throws RecognitionException {
		ParserRuleReturnScope lc_id11 = null;

		try {
			// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:159:21:
			// ( 'consume' lc_id ( 'from' 'region-hops' ':' INT ':'
			// CAPITALIZED_ID )? )
			// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:160:3:
			// 'consume' lc_id ( 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID
			// )?
			{
				match(input, 22, FOLLOW_22_in_cntrlConsumeInfo_def522);
				pushFollow(FOLLOW_lc_id_in_cntrlConsumeInfo_def524);
				lc_id11 = lc_id();
				state._fsp--;

				// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:160:19:
				// ( 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID )?
				int alt12 = 2;
				int LA12_0 = input.LA(1);
				if ((LA12_0 == 25)) {
					alt12 = 1;
				}
				switch (alt12) {
				case 1:
					// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:160:20:
					// 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID
				{
					match(input, 25, FOLLOW_25_in_cntrlConsumeInfo_def527);
					match(input, 29, FOLLOW_29_in_cntrlConsumeInfo_def529);
					match(input, 11, FOLLOW_11_in_cntrlConsumeInfo_def531);
					match(input, INT, FOLLOW_INT_in_cntrlConsumeInfo_def533);
					match(input, 11, FOLLOW_11_in_cntrlConsumeInfo_def535);
					match(input, CAPITALIZED_ID, FOLLOW_CAPITALIZED_ID_in_cntrlConsumeInfo_def537);
				}
					break;

				}

				//context.currentController.addConsumedInfo((lc_id11 != null ? input.toString(lc_id11.start, lc_id11.stop) : null));
			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "cntrlConsumeInfo_def"

	// $ANTLR start "cntrlCommand_def"
	// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:164:1:
	// cntrlCommand_def : 'command' name= CAPITALIZED_ID '(' (
	// cntrlParameter_def )? ')' 'to' 'region-hops' ':' INT ':' CAPITALIZED_ID ;
	public final void cntrlCommand_def() throws RecognitionException {
		Token name = null;

		try {
			// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:164:18:
			// ( 'command' name= CAPITALIZED_ID '(' ( cntrlParameter_def )? ')'
			// 'to' 'region-hops' ':' INT ':' CAPITALIZED_ID )
			// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:165:5:
			// 'command' name= CAPITALIZED_ID '(' ( cntrlParameter_def )? ')'
			// 'to' 'region-hops' ':' INT ':' CAPITALIZED_ID
			{
				match(input, 20, FOLLOW_20_in_cntrlCommand_def562);
				name = (Token) match(input, CAPITALIZED_ID, FOLLOW_CAPITALIZED_ID_in_cntrlCommand_def569);
				match(input, 8, FOLLOW_8_in_cntrlCommand_def571);
				// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:165:42:
				// ( cntrlParameter_def )?
				int alt13 = 2;
				int LA13_0 = input.LA(1);
				if ((LA13_0 == ID)) {
					alt13 = 1;
				}
				switch (alt13) {
				case 1:
					// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:165:43:
					// cntrlParameter_def
				{
					pushFollow(FOLLOW_cntrlParameter_def_in_cntrlCommand_def574);
					cntrlParameter_def();
					state._fsp--;

				}
					break;

				}

				match(input, 9, FOLLOW_9_in_cntrlCommand_def578);
				match(input, 34, FOLLOW_34_in_cntrlCommand_def580);
				match(input, 29, FOLLOW_29_in_cntrlCommand_def583);
				match(input, 11, FOLLOW_11_in_cntrlCommand_def585);
				match(input, INT, FOLLOW_INT_in_cntrlCommand_def587);
				match(input, 11, FOLLOW_11_in_cntrlCommand_def589);
				match(input, CAPITALIZED_ID, FOLLOW_CAPITALIZED_ID_in_cntrlCommand_def591);

				context.currentComputationalService.addCommand((name != null ? name.getText() : null));

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "cntrlCommand_def"

	// $ANTLR start "cntrlParameter_def"
	// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:171:1:
	// cntrlParameter_def : lc_id ( ',' parameter_def )? ;
	public final void cntrlParameter_def() throws RecognitionException {
		ParserRuleReturnScope lc_id12 = null;

		try {
			// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:171:20:
			// ( lc_id ( ',' parameter_def )? )
			// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:172:5:
			// lc_id ( ',' parameter_def )?
			{
				pushFollow(FOLLOW_lc_id_in_cntrlParameter_def611);
				lc_id12 = lc_id();
				state._fsp--;

				// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:172:12:
				// ( ',' parameter_def )?
				int alt14 = 2;
				int LA14_0 = input.LA(1);
				if ((LA14_0 == 10)) {
					alt14 = 1;
				}
				switch (alt14) {
				case 1:
					// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:172:13:
					// ',' parameter_def
				{
					match(input, 10, FOLLOW_10_in_cntrlParameter_def615);
					pushFollow(FOLLOW_parameter_def_in_cntrlParameter_def617);
					parameter_def();
					state._fsp--;

				}
					break;

				}

				context.currentComputationalService.addParameter((lc_id12 != null ? input.toString(lc_id12.start, lc_id12.stop) : null));
			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "cntrlParameter_def"

	// $ANTLR start "csAttribute_def"
	// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:178:1:
	// csAttribute_def : 'attribute' lc_id ':' dataType ;
	public final void csAttribute_def() throws RecognitionException {
		ParserRuleReturnScope lc_id13 = null;
		ParserRuleReturnScope dataType14 = null;

		try {
			// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:178:17:
			// ( 'attribute' lc_id ':' dataType )
			// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:179:5:
			// 'attribute' lc_id ':' dataType
			{
				match(input, 18, FOLLOW_18_in_csAttribute_def643);
				pushFollow(FOLLOW_lc_id_in_csAttribute_def645);
				lc_id13 = lc_id();
				state._fsp--;

				match(input, 11, FOLLOW_11_in_csAttribute_def647);
				pushFollow(FOLLOW_dataType_in_csAttribute_def649);
				dataType14 = dataType();
				state._fsp--;

				/*
				 * context.currentComputationalService.addAttribute((lc_id13 !=
				 * null ? input.toString(lc_id13.start, lc_id13.stop) : null),
				 * (dataType14 != null ? input.toString(dataType14.start,
				 * dataType14.stop) : null));
				 */
			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "csAttribute_def"

	// $ANTLR start "csGeneratedInfo_def"
	// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:183:1:
	// csGeneratedInfo_def : 'generate' lc_id ':' CAPITALIZED_ID ;
	public final void csGeneratedInfo_def() throws RecognitionException {
		Token CAPITALIZED_ID16 = null;
		ParserRuleReturnScope lc_id15 = null;

		try {
			// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:183:20:
			// ( 'generate' lc_id ':' CAPITALIZED_ID )
			// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:184:5:
			// 'generate' lc_id ':' CAPITALIZED_ID
			{
				match(input, 26, FOLLOW_26_in_csGeneratedInfo_def669);
				pushFollow(FOLLOW_lc_id_in_csGeneratedInfo_def671);
				lc_id15 = lc_id();
				state._fsp--;

				match(input, 11, FOLLOW_11_in_csGeneratedInfo_def673);
				CAPITALIZED_ID16 = (Token) match(input, CAPITALIZED_ID, FOLLOW_CAPITALIZED_ID_in_csGeneratedInfo_def676);
				context.currentComputationalService.addGeneratedInfo((lc_id15 != null ? input.toString(lc_id15.start, lc_id15.stop) : null), (CAPITALIZED_ID16 != null ? CAPITALIZED_ID16.getText()
						: null));
				context.constructSymbTable((lc_id15 != null ? input.toString(lc_id15.start, lc_id15.stop) : null), (CAPITALIZED_ID16 != null ? CAPITALIZED_ID16.getText() : null));
			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "csGeneratedInfo_def"

	// $ANTLR start "csConsumeInfo_def"
	// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:189:1:
	// csConsumeInfo_def : 'consume' lc_id ( 'from' 'region-hops' ':' INT ':'
	// CAPITALIZED_ID )? ;
	public final void csConsumeInfo_def() throws RecognitionException {
		ParserRuleReturnScope lc_id17 = null;

		try {
			// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:189:18:
			// ( 'consume' lc_id ( 'from' 'region-hops' ':' INT ':'
			// CAPITALIZED_ID )? )
			// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:190:3:
			// 'consume' lc_id ( 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID
			// )?
			{
				match(input, 22, FOLLOW_22_in_csConsumeInfo_def694);
				pushFollow(FOLLOW_lc_id_in_csConsumeInfo_def696);
				lc_id17 = lc_id();
				state._fsp--;

				// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:190:19:
				// ( 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID )?
				int alt15 = 2;
				int LA15_0 = input.LA(1);
				if ((LA15_0 == 25)) {
					alt15 = 1;
				}
				switch (alt15) {
				case 1:
					// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:190:20:
					// 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID
				{
					match(input, 25, FOLLOW_25_in_csConsumeInfo_def699);
					match(input, 29, FOLLOW_29_in_csConsumeInfo_def701);
					match(input, 11, FOLLOW_11_in_csConsumeInfo_def703);
					match(input, INT, FOLLOW_INT_in_csConsumeInfo_def705);
					match(input, 11, FOLLOW_11_in_csConsumeInfo_def707);
					match(input, CAPITALIZED_ID, FOLLOW_CAPITALIZED_ID_in_csConsumeInfo_def709);
				}
					break;

				}

				context.currentComputationalService.addConsumedInfo((lc_id17 != null ? input.toString(lc_id17.start, lc_id17.stop) : null));

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "csConsumeInfo_def"

	// $ANTLR start "csRequest_def"
	// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:196:1:
	// csRequest_def : 'request' lc_id ;
	public final void csRequest_def() throws RecognitionException {
		ParserRuleReturnScope lc_id18 = null;

		try {
			// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:196:15:
			// ( 'request' lc_id )
			// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:197:4:
			// 'request' lc_id
			{
				match(input, 30, FOLLOW_30_in_csRequest_def731);
				pushFollow(FOLLOW_lc_id_in_csRequest_def733);
				lc_id18 = lc_id();
				state._fsp--;

				context.currentComputationalService.getDataAccessListFromSymblTable((lc_id18 != null ? input.toString(lc_id18.start, lc_id18.stop) : null));
			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "csRequest_def"

	// $ANTLR start "partition_def"
	// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:201:1:
	// partition_def : csDeploymentConstraint= 'partition-per' ':'
	// CAPITALIZED_ID ;
	public final void partition_def() throws RecognitionException {
		Token csDeploymentConstraint = null;
		Token CAPITALIZED_ID19 = null;

		try {
			// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:201:14:
			// (csDeploymentConstraint= 'partition-per' ':' CAPITALIZED_ID )
			// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:202:5:
			// csDeploymentConstraint= 'partition-per' ':' CAPITALIZED_ID
			{
				csDeploymentConstraint = (Token) match(input, 28, FOLLOW_28_in_partition_def753);
				match(input, 11, FOLLOW_11_in_partition_def755);
				CAPITALIZED_ID19 = (Token) match(input, CAPITALIZED_ID, FOLLOW_CAPITALIZED_ID_in_partition_def757);

				context.currentComputationalService.addPartitionAttribute((CAPITALIZED_ID19 != null ? CAPITALIZED_ID19.getText() : null));
				// Next two lines are for Mapping constraints
				context.currentMappingConstraint.setAttributeName((csDeploymentConstraint != null ? csDeploymentConstraint.getText() : null));
				context.currentMappingConstraint.setAttributeValue((CAPITALIZED_ID19 != null ? CAPITALIZED_ID19.getText() : null));

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "partition_def"

	// $ANTLR start "struct_def"
	// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:211:1:
	// struct_def : CAPITALIZED_ID ( structField_def ';' )* ;
	public final void struct_def() throws RecognitionException {
		Token CAPITALIZED_ID20 = null;

		try {
			// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:211:11:
			// ( CAPITALIZED_ID ( structField_def ';' )* )
			// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:212:5:
			// CAPITALIZED_ID ( structField_def ';' )*
			{
				CAPITALIZED_ID20 = (Token) match(input, CAPITALIZED_ID, FOLLOW_CAPITALIZED_ID_in_struct_def777);
				context.currentStruct = new StructCompiler((CAPITALIZED_ID20 != null ? CAPITALIZED_ID20.getText() : null));
				// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:214:5:
				// ( structField_def ';' )*
				loop16: while (true) {
					int alt16 = 2;
					int LA16_0 = input.LA(1);
					if ((LA16_0 == ID)) {
						alt16 = 1;
					}

					switch (alt16) {
					case 1:
						// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:214:6:
						// structField_def ';'
					{
						pushFollow(FOLLOW_structField_def_in_struct_def791);
						structField_def();
						state._fsp--;

						match(input, 12, FOLLOW_12_in_struct_def793);
					}
						break;

					default:
						break loop16;
					}
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
	// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:217:1:
	// structField_def : lc_id ':' dataType ;
	public final void structField_def() throws RecognitionException {
		ParserRuleReturnScope lc_id21 = null;
		ParserRuleReturnScope dataType22 = null;

		try {
			// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:217:16:
			// ( lc_id ':' dataType )
			// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:218:3:
			// lc_id ':' dataType
			{
				pushFollow(FOLLOW_lc_id_in_structField_def815);
				lc_id21 = lc_id();
				state._fsp--;

				match(input, 11, FOLLOW_11_in_structField_def817);
				pushFollow(FOLLOW_dataType_in_structField_def819);
				dataType22 = dataType();
				state._fsp--;

				context.currentStruct.addField((lc_id21 != null ? input.toString(lc_id21.start, lc_id21.stop) : null), (dataType22 != null ? input.toString(dataType22.start, dataType22.stop) : null));
				context.constructStructSymblTable(context.currentStruct.getStructName(), context.currentStruct);
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
	// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:223:1:
	// lc_id : ID ;
	public final ArchSpecParser.lc_id_return lc_id() throws RecognitionException {
		ArchSpecParser.lc_id_return retval = new ArchSpecParser.lc_id_return();
		retval.start = input.LT(1);

		try {
			// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:223:6:
			// ( ID )
			// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:223:8:
			// ID
			{
				match(input, ID, FOLLOW_ID_in_lc_id835);
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
	// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:226:1:
	// dataType : primitiveType ;
	public final ArchSpecParser.dataType_return dataType() throws RecognitionException {
		ArchSpecParser.dataType_return retval = new ArchSpecParser.dataType_return();
		retval.start = input.LT(1);

		try {
			// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:226:9:
			// ( primitiveType )
			// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:227:3:
			// primitiveType
			{
				pushFollow(FOLLOW_primitiveType_in_dataType848);
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
	// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:230:1:
	// primitiveType : (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double'
	// |id= 'long' |id= 'boolean' ) ;
	public final void primitiveType() throws RecognitionException {
		Token id = null;

		try {
			// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:230:14:
			// ( (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id=
			// 'long' |id= 'boolean' ) )
			// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:231:3:
			// (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id=
			// 'long' |id= 'boolean' )
			{
				// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:231:3:
				// (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double'
				// |id= 'long' |id= 'boolean' )
				int alt17 = 6;
				switch (input.LA(1)) {
				case 14: {
					alt17 = 1;
				}
					break;
				case 13: {
					alt17 = 2;
				}
					break;
				case 15: {
					alt17 = 3;
				}
					break;
				case 24: {
					alt17 = 4;
				}
					break;
				case 27: {
					alt17 = 5;
				}
					break;
				case 19: {
					alt17 = 6;
				}
					break;
				default:
					NoViableAltException nvae = new NoViableAltException("", 17, 0, input);
					throw nvae;
				}
				switch (alt17) {
				case 1:
					// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:231:4:
					// id= 'Integer'
				{
					id = (Token) match(input, 14, FOLLOW_14_in_primitiveType863);
				}
					break;
				case 2:
					// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:231:19:
					// id= 'Boolean'
				{
					id = (Token) match(input, 13, FOLLOW_13_in_primitiveType869);
				}
					break;
				case 3:
					// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:231:34:
					// id= 'String'
				{
					id = (Token) match(input, 15, FOLLOW_15_in_primitiveType875);
				}
					break;
				case 4:
					// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:231:49:
					// id= 'double'
				{
					id = (Token) match(input, 24, FOLLOW_24_in_primitiveType884);
				}
					break;
				case 5:
					// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:231:65:
					// id= 'long'
				{
					id = (Token) match(input, 27, FOLLOW_27_in_primitiveType892);
				}
					break;
				case 6:
					// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:231:79:
					// id= 'boolean'
				{
					id = (Token) match(input, 19, FOLLOW_19_in_primitiveType898);
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

	// $ANTLR start "actuator_def"
	// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:258:1:
	// actuator_def : CAPITALIZED_ID ( actuatorAttribute_def ';' )* ( action_def
	// ';' )* ;
	public final void actuator_def() throws RecognitionException {
		Token CAPITALIZED_ID23 = null;

		try {
			// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:258:13:
			// ( CAPITALIZED_ID ( actuatorAttribute_def ';' )* ( action_def ';'
			// )* )
			// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:259:4:
			// CAPITALIZED_ID ( actuatorAttribute_def ';' )* ( action_def ';' )*
			{
				CAPITALIZED_ID23 = (Token) match(input, CAPITALIZED_ID, FOLLOW_CAPITALIZED_ID_in_actuator_def935);
				context.currentActuator = new ActuatorCompiler((CAPITALIZED_ID23 != null ? CAPITALIZED_ID23.getText() : null));
				// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:261:4:
				// ( actuatorAttribute_def ';' )*
				loop18: while (true) {
					int alt18 = 2;
					int LA18_0 = input.LA(1);
					if ((LA18_0 == 18)) {
						alt18 = 1;
					}

					switch (alt18) {
					case 1:
						// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:261:5:
						// actuatorAttribute_def ';'
					{
						pushFollow(FOLLOW_actuatorAttribute_def_in_actuator_def946);
						actuatorAttribute_def();
						state._fsp--;

						match(input, 12, FOLLOW_12_in_actuator_def948);
					}
						break;

					default:
						break loop18;
					}
				}

				// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:262:4:
				// ( action_def ';' )*
				loop19: while (true) {
					int alt19 = 2;
					int LA19_0 = input.LA(1);
					if ((LA19_0 == 17)) {
						alt19 = 1;
					}

					switch (alt19) {
					case 1:
						// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:262:5:
						// action_def ';'
					{
						pushFollow(FOLLOW_action_def_in_actuator_def956);
						action_def();
						state._fsp--;

						match(input, 12, FOLLOW_12_in_actuator_def958);
					}
						break;

					default:
						break loop19;
					}
				}

				context.currentActuator.generateActuatorCode();
			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "actuator_def"

	// $ANTLR start "actuatorAttribute_def"
	// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:266:1:
	// actuatorAttribute_def : 'attribute' lc_id ':' dataType ;
	public final void actuatorAttribute_def() throws RecognitionException {
		ParserRuleReturnScope lc_id24 = null;
		ParserRuleReturnScope dataType25 = null;

		try {
			// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:266:22:
			// ( 'attribute' lc_id ':' dataType )
			// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:267:6:
			// 'attribute' lc_id ':' dataType
			{
				match(input, 18, FOLLOW_18_in_actuatorAttribute_def981);
				pushFollow(FOLLOW_lc_id_in_actuatorAttribute_def983);
				lc_id24 = lc_id();
				state._fsp--;

				match(input, 11, FOLLOW_11_in_actuatorAttribute_def985);
				pushFollow(FOLLOW_dataType_in_actuatorAttribute_def987);
				dataType25 = dataType();
				state._fsp--;

				// context.currentActuator.addAttribute((lc_id24 != null ?
				// input.toString(lc_id24.start, lc_id24.stop) : null),
				// (dataType25 != null ? input.toString(dataType25.start,
				// dataType25.stop)
				// : null));
			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "actuatorAttribute_def"

	// $ANTLR start "action_def"
	// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:271:1:
	// action_def : 'action' CAPITALIZED_ID '(' ( parameter_def )? ')' ;
	public final void action_def() throws RecognitionException {
		Token CAPITALIZED_ID26 = null;

		try {
			// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:271:11:
			// ( 'action' CAPITALIZED_ID '(' ( parameter_def )? ')' )
			// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:272:5:
			// 'action' CAPITALIZED_ID '(' ( parameter_def )? ')'
			{
				match(input, 17, FOLLOW_17_in_action_def1006);
				CAPITALIZED_ID26 = (Token) match(input, CAPITALIZED_ID, FOLLOW_CAPITALIZED_ID_in_action_def1008);
				match(input, 8, FOLLOW_8_in_action_def1010);
				// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:272:33:
				// ( parameter_def )?
				int alt20 = 2;
				int LA20_0 = input.LA(1);
				if ((LA20_0 == ID)) {
					alt20 = 1;
				}
				switch (alt20) {
				case 1:
					// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:272:34:
					// parameter_def
				{
					pushFollow(FOLLOW_parameter_def_in_action_def1013);
					parameter_def();
					state._fsp--;

				}
					break;

				}

				match(input, 9, FOLLOW_9_in_action_def1017);
				context.currentActuator.addAction((CAPITALIZED_ID26 != null ? CAPITALIZED_ID26.getText() : null));
			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "action_def"

	// $ANTLR start "parameter_def"
	// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:276:1:
	// parameter_def : lc_id ':' CAPITALIZED_ID ( ',' parameter_def )? ;
	public final void parameter_def() throws RecognitionException {
		Token CAPITALIZED_ID28 = null;
		ParserRuleReturnScope lc_id27 = null;

		try {
			// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:276:15:
			// ( lc_id ':' CAPITALIZED_ID ( ',' parameter_def )? )
			// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:277:5:
			// lc_id ':' CAPITALIZED_ID ( ',' parameter_def )?
			{
				pushFollow(FOLLOW_lc_id_in_parameter_def1037);
				lc_id27 = lc_id();
				state._fsp--;

				match(input, 11, FOLLOW_11_in_parameter_def1039);
				CAPITALIZED_ID28 = (Token) match(input, CAPITALIZED_ID, FOLLOW_CAPITALIZED_ID_in_parameter_def1042);
				// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:277:31:
				// ( ',' parameter_def )?
				int alt21 = 2;
				int LA21_0 = input.LA(1);
				if ((LA21_0 == 10)) {
					alt21 = 1;
				}
				switch (alt21) {
				case 1:
					// C:\\Users\\Dell-3\\workspace\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:277:32:
					// ',' parameter_def
				{
					match(input, 10, FOLLOW_10_in_parameter_def1045);
					pushFollow(FOLLOW_parameter_def_in_parameter_def1047);
					parameter_def();
					state._fsp--;

				}
					break;

				}

				context.currentActuator.addParameter((lc_id27 != null ? input.toString(lc_id27.start, lc_id27.stop) : null), (CAPITALIZED_ID28 != null ? CAPITALIZED_ID28.getText() : null));
				context.constructSymbTable((lc_id27 != null ? input.toString(lc_id27.start, lc_id27.stop) : null), (CAPITALIZED_ID28 != null ? CAPITALIZED_ID28.getText() : null));

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "parameter_def"

	// Delegated rules

	public static final BitSet FOLLOW_33_in_archSpec83 = new BitSet(new long[] { 0x0000000000000800L });
	public static final BitSet FOLLOW_11_in_archSpec85 = new BitSet(new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_struct_def_in_archSpec87 = new BitSet(new long[] { 0x0000000300000000L });
	public static final BitSet FOLLOW_32_in_archSpec98 = new BitSet(new long[] { 0x0000000000000800L });
	public static final BitSet FOLLOW_11_in_archSpec100 = new BitSet(new long[] { 0x0000000000200000L });
	public static final BitSet FOLLOW_component_def_in_archSpec102 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_21_in_component_def129 = new BitSet(new long[] { 0x0000000000000800L });
	public static final BitSet FOLLOW_11_in_component_def131 = new BitSet(new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_cs_def_in_component_def134 = new BitSet(new long[] { 0x0000000000000012L });
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_cs_def167 = new BitSet(new long[] { 0x0000000054540002L });
	public static final BitSet FOLLOW_csAttribute_def_in_cs_def180 = new BitSet(new long[] { 0x0000000000001000L });
	public static final BitSet FOLLOW_12_in_cs_def182 = new BitSet(new long[] { 0x0000000054540002L });
	public static final BitSet FOLLOW_csGeneratedInfo_def_in_cs_def191 = new BitSet(new long[] { 0x0000000000001000L });
	public static final BitSet FOLLOW_12_in_cs_def193 = new BitSet(new long[] { 0x0000000054500002L });
	public static final BitSet FOLLOW_csConsumeInfo_def_in_cs_def203 = new BitSet(new long[] { 0x0000000000001000L });
	public static final BitSet FOLLOW_12_in_cs_def205 = new BitSet(new long[] { 0x0000000050500002L });
	public static final BitSet FOLLOW_csRequest_def_in_cs_def215 = new BitSet(new long[] { 0x0000000000001000L });
	public static final BitSet FOLLOW_12_in_cs_def218 = new BitSet(new long[] { 0x0000000050100002L });
	public static final BitSet FOLLOW_cntrlCommand_def_in_cs_def227 = new BitSet(new long[] { 0x0000000000001000L });
	public static final BitSet FOLLOW_12_in_cs_def229 = new BitSet(new long[] { 0x0000000010100002L });
	public static final BitSet FOLLOW_partition_def_in_cs_def239 = new BitSet(new long[] { 0x0000000000001000L });
	public static final BitSet FOLLOW_12_in_cs_def241 = new BitSet(new long[] { 0x0000000010000002L });
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_ss_def259 = new BitSet(new long[] { 0x0000000004840002L });
	public static final BitSet FOLLOW_storageAttribute_def_in_ss_def272 = new BitSet(new long[] { 0x0000000000001000L });
	public static final BitSet FOLLOW_12_in_ss_def274 = new BitSet(new long[] { 0x0000000004840002L });
	public static final BitSet FOLLOW_storageDataAccess_def_in_ss_def283 = new BitSet(new long[] { 0x0000000000001000L });
	public static final BitSet FOLLOW_12_in_ss_def285 = new BitSet(new long[] { 0x0000000004800002L });
	public static final BitSet FOLLOW_storagePartition_def_in_ss_def295 = new BitSet(new long[] { 0x0000000000001000L });
	public static final BitSet FOLLOW_12_in_ss_def297 = new BitSet(new long[] { 0x0000000000800002L });
	public static final BitSet FOLLOW_18_in_storageAttribute_def317 = new BitSet(new long[] { 0x0000000000000020L });
	public static final BitSet FOLLOW_lc_id_in_storageAttribute_def319 = new BitSet(new long[] { 0x0000000000000800L });
	public static final BitSet FOLLOW_11_in_storageAttribute_def321 = new BitSet(new long[] { 0x000000000908E000L });
	public static final BitSet FOLLOW_dataType_in_storageAttribute_def323 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_storageGeneratedInfo_def_in_storageDataAccess_def344 = new BitSet(new long[] { 0x0000000000010000L });
	public static final BitSet FOLLOW_16_in_storageDataAccess_def347 = new BitSet(new long[] { 0x0000000000000020L });
	public static final BitSet FOLLOW_storagedataIndex_def_in_storageDataAccess_def349 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_26_in_storageGeneratedInfo_def368 = new BitSet(new long[] { 0x0000000000000020L });
	public static final BitSet FOLLOW_lc_id_in_storageGeneratedInfo_def370 = new BitSet(new long[] { 0x0000000000000800L });
	public static final BitSet FOLLOW_11_in_storageGeneratedInfo_def372 = new BitSet(new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_storageGeneratedInfo_def375 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_lc_id_in_storagedataIndex_def397 = new BitSet(new long[] { 0x0000000000000800L });
	public static final BitSet FOLLOW_11_in_storagedataIndex_def399 = new BitSet(new long[] { 0x000000000908E000L });
	public static final BitSet FOLLOW_dataType_in_storagedataIndex_def401 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_23_in_storagePartition_def430 = new BitSet(new long[] { 0x0000000000000800L });
	public static final BitSet FOLLOW_11_in_storagePartition_def432 = new BitSet(new long[] { 0x0000000080000000L });
	public static final BitSet FOLLOW_31_in_storagePartition_def438 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_18_in_cntrlAttribute_def499 = new BitSet(new long[] { 0x0000000000000020L });
	public static final BitSet FOLLOW_lc_id_in_cntrlAttribute_def501 = new BitSet(new long[] { 0x0000000000000800L });
	public static final BitSet FOLLOW_11_in_cntrlAttribute_def503 = new BitSet(new long[] { 0x000000000908E000L });
	public static final BitSet FOLLOW_dataType_in_cntrlAttribute_def505 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_22_in_cntrlConsumeInfo_def522 = new BitSet(new long[] { 0x0000000000000020L });
	public static final BitSet FOLLOW_lc_id_in_cntrlConsumeInfo_def524 = new BitSet(new long[] { 0x0000000002000002L });
	public static final BitSet FOLLOW_25_in_cntrlConsumeInfo_def527 = new BitSet(new long[] { 0x0000000020000000L });
	public static final BitSet FOLLOW_29_in_cntrlConsumeInfo_def529 = new BitSet(new long[] { 0x0000000000000800L });
	public static final BitSet FOLLOW_11_in_cntrlConsumeInfo_def531 = new BitSet(new long[] { 0x0000000000000040L });
	public static final BitSet FOLLOW_INT_in_cntrlConsumeInfo_def533 = new BitSet(new long[] { 0x0000000000000800L });
	public static final BitSet FOLLOW_11_in_cntrlConsumeInfo_def535 = new BitSet(new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_cntrlConsumeInfo_def537 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_20_in_cntrlCommand_def562 = new BitSet(new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_cntrlCommand_def569 = new BitSet(new long[] { 0x0000000000000100L });
	public static final BitSet FOLLOW_8_in_cntrlCommand_def571 = new BitSet(new long[] { 0x0000000000000220L });
	public static final BitSet FOLLOW_cntrlParameter_def_in_cntrlCommand_def574 = new BitSet(new long[] { 0x0000000000000200L });
	public static final BitSet FOLLOW_9_in_cntrlCommand_def578 = new BitSet(new long[] { 0x0000000400000000L });
	public static final BitSet FOLLOW_34_in_cntrlCommand_def580 = new BitSet(new long[] { 0x0000000020000000L });
	public static final BitSet FOLLOW_29_in_cntrlCommand_def583 = new BitSet(new long[] { 0x0000000000000800L });
	public static final BitSet FOLLOW_11_in_cntrlCommand_def585 = new BitSet(new long[] { 0x0000000000000040L });
	public static final BitSet FOLLOW_INT_in_cntrlCommand_def587 = new BitSet(new long[] { 0x0000000000000800L });
	public static final BitSet FOLLOW_11_in_cntrlCommand_def589 = new BitSet(new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_cntrlCommand_def591 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_lc_id_in_cntrlParameter_def611 = new BitSet(new long[] { 0x0000000000000402L });
	public static final BitSet FOLLOW_10_in_cntrlParameter_def615 = new BitSet(new long[] { 0x0000000000000020L });
	public static final BitSet FOLLOW_parameter_def_in_cntrlParameter_def617 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_18_in_csAttribute_def643 = new BitSet(new long[] { 0x0000000000000020L });
	public static final BitSet FOLLOW_lc_id_in_csAttribute_def645 = new BitSet(new long[] { 0x0000000000000800L });
	public static final BitSet FOLLOW_11_in_csAttribute_def647 = new BitSet(new long[] { 0x000000000908E000L });
	public static final BitSet FOLLOW_dataType_in_csAttribute_def649 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_26_in_csGeneratedInfo_def669 = new BitSet(new long[] { 0x0000000000000020L });
	public static final BitSet FOLLOW_lc_id_in_csGeneratedInfo_def671 = new BitSet(new long[] { 0x0000000000000800L });
	public static final BitSet FOLLOW_11_in_csGeneratedInfo_def673 = new BitSet(new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_csGeneratedInfo_def676 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_22_in_csConsumeInfo_def694 = new BitSet(new long[] { 0x0000000000000020L });
	public static final BitSet FOLLOW_lc_id_in_csConsumeInfo_def696 = new BitSet(new long[] { 0x0000000002000002L });
	public static final BitSet FOLLOW_25_in_csConsumeInfo_def699 = new BitSet(new long[] { 0x0000000020000000L });
	public static final BitSet FOLLOW_29_in_csConsumeInfo_def701 = new BitSet(new long[] { 0x0000000000000800L });
	public static final BitSet FOLLOW_11_in_csConsumeInfo_def703 = new BitSet(new long[] { 0x0000000000000040L });
	public static final BitSet FOLLOW_INT_in_csConsumeInfo_def705 = new BitSet(new long[] { 0x0000000000000800L });
	public static final BitSet FOLLOW_11_in_csConsumeInfo_def707 = new BitSet(new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_csConsumeInfo_def709 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_30_in_csRequest_def731 = new BitSet(new long[] { 0x0000000000000020L });
	public static final BitSet FOLLOW_lc_id_in_csRequest_def733 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_28_in_partition_def753 = new BitSet(new long[] { 0x0000000000000800L });
	public static final BitSet FOLLOW_11_in_partition_def755 = new BitSet(new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_partition_def757 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_struct_def777 = new BitSet(new long[] { 0x0000000000000022L });
	public static final BitSet FOLLOW_structField_def_in_struct_def791 = new BitSet(new long[] { 0x0000000000001000L });
	public static final BitSet FOLLOW_12_in_struct_def793 = new BitSet(new long[] { 0x0000000000000022L });
	public static final BitSet FOLLOW_lc_id_in_structField_def815 = new BitSet(new long[] { 0x0000000000000800L });
	public static final BitSet FOLLOW_11_in_structField_def817 = new BitSet(new long[] { 0x000000000908E000L });
	public static final BitSet FOLLOW_dataType_in_structField_def819 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ID_in_lc_id835 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_primitiveType_in_dataType848 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_14_in_primitiveType863 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_13_in_primitiveType869 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_15_in_primitiveType875 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_24_in_primitiveType884 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_27_in_primitiveType892 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_19_in_primitiveType898 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_actuator_def935 = new BitSet(new long[] { 0x0000000000060002L });
	public static final BitSet FOLLOW_actuatorAttribute_def_in_actuator_def946 = new BitSet(new long[] { 0x0000000000001000L });
	public static final BitSet FOLLOW_12_in_actuator_def948 = new BitSet(new long[] { 0x0000000000060002L });
	public static final BitSet FOLLOW_action_def_in_actuator_def956 = new BitSet(new long[] { 0x0000000000001000L });
	public static final BitSet FOLLOW_12_in_actuator_def958 = new BitSet(new long[] { 0x0000000000020002L });
	public static final BitSet FOLLOW_18_in_actuatorAttribute_def981 = new BitSet(new long[] { 0x0000000000000020L });
	public static final BitSet FOLLOW_lc_id_in_actuatorAttribute_def983 = new BitSet(new long[] { 0x0000000000000800L });
	public static final BitSet FOLLOW_11_in_actuatorAttribute_def985 = new BitSet(new long[] { 0x000000000908E000L });
	public static final BitSet FOLLOW_dataType_in_actuatorAttribute_def987 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_17_in_action_def1006 = new BitSet(new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_action_def1008 = new BitSet(new long[] { 0x0000000000000100L });
	public static final BitSet FOLLOW_8_in_action_def1010 = new BitSet(new long[] { 0x0000000000000220L });
	public static final BitSet FOLLOW_parameter_def_in_action_def1013 = new BitSet(new long[] { 0x0000000000000200L });
	public static final BitSet FOLLOW_9_in_action_def1017 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_lc_id_in_parameter_def1037 = new BitSet(new long[] { 0x0000000000000800L });
	public static final BitSet FOLLOW_11_in_parameter_def1039 = new BitSet(new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_parameter_def1042 = new BitSet(new long[] { 0x0000000000000402L });
	public static final BitSet FOLLOW_10_in_parameter_def1045 = new BitSet(new long[] { 0x0000000000000020L });
	public static final BitSet FOLLOW_parameter_def_in_parameter_def1047 = new BitSet(new long[] { 0x0000000000000002L });
}
