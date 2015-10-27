// $ANTLR 3.5.1 C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g 2015-10-27 18:16:37

package iotsuite.parser;
import iotsuite.compiler.*; 
import iotsuite.semanticmodel.*;  
   


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ArchSpecParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CAPITALIZED_ID", "ID", "INT", 
		"WS", "'('", "')'", "','", "':'", "';'", "'Boolean'", "'COMPUTE('", "'Controller'", 
		"'Custom'", "'InBuilt'", "'Integer'", "'String'", "'_BY_SAMPLE'", "'boolean'", 
		"'command'", "'computationalService'", "'consume'", "'double'", "'from'", 
		"'generate'", "'long'", "'request'", "'softwarecomponents'", "'structs'", 
		"'to'"
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
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int CAPITALIZED_ID=4;
	public static final int ID=5;
	public static final int INT=6;
	public static final int WS=7;

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

	@Override public String[] getTokenNames() { return ArchSpecParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g"; }


	  private SymbolTable context;     



	// $ANTLR start "archSpec"
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:23:1: archSpec : ( 'structs' ':' struct_def )* 'softwarecomponents' ':' ( component_def )+ ;
	public final void archSpec() throws RecognitionException {
		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:23:10: ( ( 'structs' ':' struct_def )* 'softwarecomponents' ':' ( component_def )+ )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:24:5: ( 'structs' ':' struct_def )* 'softwarecomponents' ':' ( component_def )+
			{
			 context = new SymbolTable();
			   context.currentRegion = new RegionCompiler();
			    context.currentMappingConstraint = new MapperCompiler(); 
			    
			 context.currentRegion.generateRegionCode(); 
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:29:5: ( 'structs' ':' struct_def )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==31) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:29:6: 'structs' ':' struct_def
					{
					match(input,31,FOLLOW_31_in_archSpec90); 
					match(input,11,FOLLOW_11_in_archSpec92); 
					pushFollow(FOLLOW_struct_def_in_archSpec94);
					struct_def();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}

			match(input,30,FOLLOW_30_in_archSpec105); 
			match(input,11,FOLLOW_11_in_archSpec107); 
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:30:31: ( component_def )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==23) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:30:32: component_def
					{
					pushFollow(FOLLOW_component_def_in_archSpec110);
					component_def();
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

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "archSpec"



	// $ANTLR start "component_def"
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:33:1: component_def : 'computationalService' ':' ( cs_def ) ;
	public final void component_def() throws RecognitionException {
		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:33:15: ( 'computationalService' ':' ( cs_def ) )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:34:5: 'computationalService' ':' ( cs_def )
			{
			match(input,23,FOLLOW_23_in_component_def130); 
			match(input,11,FOLLOW_11_in_component_def132); 
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:34:32: ( cs_def )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:34:33: cs_def
			{
			pushFollow(FOLLOW_cs_def_in_component_def135);
			cs_def();
			state._fsp--;

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
	// $ANTLR end "component_def"



	// $ANTLR start "struct_def"
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:37:1: struct_def : CAPITALIZED_ID ( structField_def ';' )+ ;
	public final void struct_def() throws RecognitionException {
		Token CAPITALIZED_ID1=null;

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:37:11: ( CAPITALIZED_ID ( structField_def ';' )+ )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:38:5: CAPITALIZED_ID ( structField_def ';' )+
			{
			CAPITALIZED_ID1=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_struct_def152); 
			context.currentStruct = new StructCompiler((CAPITALIZED_ID1!=null?CAPITALIZED_ID1.getText():null));
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:40:5: ( structField_def ';' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==ID) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:40:6: structField_def ';'
					{
					pushFollow(FOLLOW_structField_def_in_struct_def166);
					structField_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_struct_def168); 
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
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
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:43:1: structField_def : lc_id ':' dataType ;
	public final void structField_def() throws RecognitionException {
		ParserRuleReturnScope lc_id2 =null;
		ParserRuleReturnScope dataType3 =null;

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:43:16: ( lc_id ':' dataType )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:44:3: lc_id ':' dataType
			{
			pushFollow(FOLLOW_lc_id_in_structField_def191);
			lc_id2=lc_id();
			state._fsp--;

			match(input,11,FOLLOW_11_in_structField_def193); 
			pushFollow(FOLLOW_dataType_in_structField_def195);
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



	// $ANTLR start "cs_def"
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:49:1: cs_def : 'InBuilt' ':' ( agg_cs_def )* ( 'Custom' ':' ( coordinator_def )* )* ( 'Controller' ':' ( controller_def )* )* ;
	public final void cs_def() throws RecognitionException {
		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:49:7: ( 'InBuilt' ':' ( agg_cs_def )* ( 'Custom' ':' ( coordinator_def )* )* ( 'Controller' ':' ( controller_def )* )* )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:50:5: 'InBuilt' ':' ( agg_cs_def )* ( 'Custom' ':' ( coordinator_def )* )* ( 'Controller' ':' ( controller_def )* )*
			{
			match(input,17,FOLLOW_17_in_cs_def222); 
			match(input,11,FOLLOW_11_in_cs_def224); 
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:51:8: ( agg_cs_def )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==CAPITALIZED_ID) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:51:9: agg_cs_def
					{
					pushFollow(FOLLOW_agg_cs_def_in_cs_def236);
					agg_cs_def();
					state._fsp--;

					}
					break;

				default :
					break loop4;
				}
			}

			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:52:6: ( 'Custom' ':' ( coordinator_def )* )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==16) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:52:7: 'Custom' ':' ( coordinator_def )*
					{
					match(input,16,FOLLOW_16_in_cs_def247); 
					match(input,11,FOLLOW_11_in_cs_def253); 
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:52:24: ( coordinator_def )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0==CAPITALIZED_ID) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:52:25: coordinator_def
							{
							pushFollow(FOLLOW_coordinator_def_in_cs_def256);
							coordinator_def();
							state._fsp--;

							}
							break;

						default :
							break loop5;
						}
					}

					}
					break;

				default :
					break loop6;
				}
			}

			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:53:6: ( 'Controller' ':' ( controller_def )* )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==15) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:53:7: 'Controller' ':' ( controller_def )*
					{
					match(input,15,FOLLOW_15_in_cs_def269); 
					match(input,11,FOLLOW_11_in_cs_def271); 
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:53:24: ( controller_def )*
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( (LA7_0==CAPITALIZED_ID) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:53:25: controller_def
							{
							pushFollow(FOLLOW_controller_def_in_cs_def274);
							controller_def();
							state._fsp--;

							}
							break;

						default :
							break loop7;
						}
					}

					}
					break;

				default :
					break loop8;
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
	// $ANTLR end "cs_def"



	// $ANTLR start "agg_cs_def"
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:57:1: agg_cs_def : CAPITALIZED_ID ( csConsumeInfo_def ';' )* ( csOperation_def ';' )* ( csGeneratedInfoForAggregator_def ';' )* ;
	public final void agg_cs_def() throws RecognitionException {
		Token CAPITALIZED_ID4=null;

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:57:11: ( CAPITALIZED_ID ( csConsumeInfo_def ';' )* ( csOperation_def ';' )* ( csGeneratedInfoForAggregator_def ';' )* )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:59:2: CAPITALIZED_ID ( csConsumeInfo_def ';' )* ( csOperation_def ';' )* ( csGeneratedInfoForAggregator_def ';' )*
			{
			CAPITALIZED_ID4=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_agg_cs_def298); 
			 
			     context.currentComputationalService = new ComputationalServiceCompiler(); 
			     context.currentMappingConstraint.setSoftwareComponentName((CAPITALIZED_ID4!=null?CAPITALIZED_ID4.getText():null));
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:63:5: ( csConsumeInfo_def ';' )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==24) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:63:6: csConsumeInfo_def ';'
					{
					pushFollow(FOLLOW_csConsumeInfo_def_in_agg_cs_def312);
					csConsumeInfo_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_agg_cs_def314); 
					}
					break;

				default :
					break loop9;
				}
			}

			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:64:5: ( csOperation_def ';' )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==14) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:64:6: csOperation_def ';'
					{
					pushFollow(FOLLOW_csOperation_def_in_agg_cs_def324);
					csOperation_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_agg_cs_def326); 
					}
					break;

				default :
					break loop10;
				}
			}

			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:65:5: ( csGeneratedInfoForAggregator_def ';' )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==27) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:65:6: csGeneratedInfoForAggregator_def ';'
					{
					pushFollow(FOLLOW_csGeneratedInfoForAggregator_def_in_agg_cs_def335);
					csGeneratedInfoForAggregator_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_agg_cs_def337); 
					}
					break;

				default :
					break loop11;
				}
			}

			   
			     context.currentComputationalService.setComputationalServiceName((CAPITALIZED_ID4!=null?CAPITALIZED_ID4.getText():null));
			     context.currentComputationalService.createCSObject();
			   context.currentMappingConstraint.setSoftwareComponentName((CAPITALIZED_ID4!=null?CAPITALIZED_ID4.getText():null));
			    context.currentMappingConstraint.addDeployementConstraintObj(); // This line creates a  Symbol Table
			      context.currentComputationalService.generateAggregatorComputationalServiceCode(); 
			    
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
	// $ANTLR end "agg_cs_def"



	// $ANTLR start "coordinator_def"
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:76:1: coordinator_def : CAPITALIZED_ID ( csConsumeInfo_def ';' )* ( csRequest_def ';' )* ( csGeneratedInfo_def ';' )* ;
	public final void coordinator_def() throws RecognitionException {
		Token CAPITALIZED_ID5=null;

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:76:16: ( CAPITALIZED_ID ( csConsumeInfo_def ';' )* ( csRequest_def ';' )* ( csGeneratedInfo_def ';' )* )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:78:1: CAPITALIZED_ID ( csConsumeInfo_def ';' )* ( csRequest_def ';' )* ( csGeneratedInfo_def ';' )*
			{
			CAPITALIZED_ID5=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_coordinator_def358); 
			 
			     context.currentComputationalService = new ComputationalServiceCompiler(); 
			     context.currentMappingConstraint.setSoftwareComponentName((CAPITALIZED_ID5!=null?CAPITALIZED_ID5.getText():null));
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:82:5: ( csConsumeInfo_def ';' )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==24) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:82:6: csConsumeInfo_def ';'
					{
					pushFollow(FOLLOW_csConsumeInfo_def_in_coordinator_def372);
					csConsumeInfo_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_coordinator_def374); 
					}
					break;

				default :
					break loop12;
				}
			}

			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:83:5: ( csRequest_def ';' )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==29) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:83:6: csRequest_def ';'
					{
					pushFollow(FOLLOW_csRequest_def_in_coordinator_def384);
					csRequest_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_coordinator_def386); 
					}
					break;

				default :
					break loop13;
				}
			}

			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:84:5: ( csGeneratedInfo_def ';' )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==27) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:84:6: csGeneratedInfo_def ';'
					{
					pushFollow(FOLLOW_csGeneratedInfo_def_in_coordinator_def395);
					csGeneratedInfo_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_coordinator_def397); 
					}
					break;

				default :
					break loop14;
				}
			}

			 
			    context.currentComputationalService.setComputationalServiceName((CAPITALIZED_ID5!=null?CAPITALIZED_ID5.getText():null));
			     context.currentComputationalService.createCSObject();
			    context.currentComputationalService.generateComputationalServiceCode(); 
			   context.currentMappingConstraint.setSoftwareComponentName((CAPITALIZED_ID5!=null?CAPITALIZED_ID5.getText():null));
			   context.currentMappingConstraint.addDeployementConstraintObj(); // This line creates a  Symbol Table
			   
			    
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
	// $ANTLR end "coordinator_def"



	// $ANTLR start "controller_def"
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:96:1: controller_def : CAPITALIZED_ID ( csConsumeInfo_def ';' )* ( cntrlCommand_def ';' )* ;
	public final void controller_def() throws RecognitionException {
		Token CAPITALIZED_ID6=null;

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:96:15: ( CAPITALIZED_ID ( csConsumeInfo_def ';' )* ( cntrlCommand_def ';' )* )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:98:2: CAPITALIZED_ID ( csConsumeInfo_def ';' )* ( cntrlCommand_def ';' )*
			{
			CAPITALIZED_ID6=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_controller_def420); 
			 
			     context.currentComputationalService = new ComputationalServiceCompiler(); 
			     context.currentMappingConstraint.setSoftwareComponentName((CAPITALIZED_ID6!=null?CAPITALIZED_ID6.getText():null));
			     
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:103:5: ( csConsumeInfo_def ';' )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==24) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:103:6: csConsumeInfo_def ';'
					{
					pushFollow(FOLLOW_csConsumeInfo_def_in_controller_def434);
					csConsumeInfo_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_controller_def436); 
					}
					break;

				default :
					break loop15;
				}
			}

			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:104:5: ( cntrlCommand_def ';' )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==22) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:104:6: cntrlCommand_def ';'
					{
					pushFollow(FOLLOW_cntrlCommand_def_in_controller_def446);
					cntrlCommand_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_controller_def448); 
					}
					break;

				default :
					break loop16;
				}
			}

			 
			    context.currentComputationalService.setComputationalServiceName((CAPITALIZED_ID6!=null?CAPITALIZED_ID6.getText():null));
			     context.currentComputationalService.createCSObject();
			    context.currentComputationalService.generateComputationalServiceCode(); 
			   context.currentMappingConstraint.setSoftwareComponentName((CAPITALIZED_ID6!=null?CAPITALIZED_ID6.getText():null));
			   context.currentMappingConstraint.addDeployementConstraintObj(); // This line creates a  Symbol Table
			   
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
	// $ANTLR end "controller_def"



	// $ANTLR start "csOperation_def"
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:115:1: csOperation_def : 'COMPUTE(' CAPITALIZED_ID '_BY_SAMPLE' ',' INT ')' ;
	public final void csOperation_def() throws RecognitionException {
		Token CAPITALIZED_ID7=null;
		Token INT8=null;

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:115:17: ( 'COMPUTE(' CAPITALIZED_ID '_BY_SAMPLE' ',' INT ')' )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:116:5: 'COMPUTE(' CAPITALIZED_ID '_BY_SAMPLE' ',' INT ')'
			{
			match(input,14,FOLLOW_14_in_csOperation_def479); 
			CAPITALIZED_ID7=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_csOperation_def481); 
			match(input,20,FOLLOW_20_in_csOperation_def482); 
			match(input,10,FOLLOW_10_in_csOperation_def484); 
			INT8=(Token)match(input,INT,FOLLOW_INT_in_csOperation_def486); 
			match(input,9,FOLLOW_9_in_csOperation_def488); 
			 context.currentComputationalService.addOperation((CAPITALIZED_ID7!=null?CAPITALIZED_ID7.getText():null),(INT8!=null?INT8.getText():null));  
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
	// $ANTLR end "csOperation_def"



	// $ANTLR start "csGeneratedInfoForAggregator_def"
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:120:1: csGeneratedInfoForAggregator_def : 'generate' lc_id ':' CAPITALIZED_ID ;
	public final void csGeneratedInfoForAggregator_def() throws RecognitionException {
		Token CAPITALIZED_ID10=null;
		ParserRuleReturnScope lc_id9 =null;

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:120:33: ( 'generate' lc_id ':' CAPITALIZED_ID )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:121:2: 'generate' lc_id ':' CAPITALIZED_ID
			{
			match(input,27,FOLLOW_27_in_csGeneratedInfoForAggregator_def509); 
			pushFollow(FOLLOW_lc_id_in_csGeneratedInfoForAggregator_def511);
			lc_id9=lc_id();
			state._fsp--;

			match(input,11,FOLLOW_11_in_csGeneratedInfoForAggregator_def513); 
			CAPITALIZED_ID10=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_csGeneratedInfoForAggregator_def516); 
			 
			    context.currentComputationalService.addGeneratedInfo((lc_id9!=null?input.toString(lc_id9.start,lc_id9.stop):null), (CAPITALIZED_ID10!=null?CAPITALIZED_ID10.getText():null)); 
			    context.constructSymbTable((lc_id9!=null?input.toString(lc_id9.start,lc_id9.stop):null), (CAPITALIZED_ID10!=null?CAPITALIZED_ID10.getText():null));
			    context.constructAggregatorSymblTable((CAPITALIZED_ID10!=null?CAPITALIZED_ID10.getText():null));
			     context.constructGUISymblTable((lc_id9!=null?input.toString(lc_id9.start,lc_id9.stop):null), (CAPITALIZED_ID10!=null?CAPITALIZED_ID10.getText():null));   
			    
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
	// $ANTLR end "csGeneratedInfoForAggregator_def"



	// $ANTLR start "csGeneratedInfo_def"
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:131:1: csGeneratedInfo_def : 'generate' lc_id ':' CAPITALIZED_ID ;
	public final void csGeneratedInfo_def() throws RecognitionException {
		Token CAPITALIZED_ID12=null;
		ParserRuleReturnScope lc_id11 =null;

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:131:20: ( 'generate' lc_id ':' CAPITALIZED_ID )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:132:5: 'generate' lc_id ':' CAPITALIZED_ID
			{
			match(input,27,FOLLOW_27_in_csGeneratedInfo_def535); 
			pushFollow(FOLLOW_lc_id_in_csGeneratedInfo_def537);
			lc_id11=lc_id();
			state._fsp--;

			match(input,11,FOLLOW_11_in_csGeneratedInfo_def539); 
			CAPITALIZED_ID12=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_csGeneratedInfo_def542); 
			 context.currentComputationalService.addGeneratedInfo((lc_id11!=null?input.toString(lc_id11.start,lc_id11.stop):null), (CAPITALIZED_ID12!=null?CAPITALIZED_ID12.getText():null)); 
			    context.constructSymbTable((lc_id11!=null?input.toString(lc_id11.start,lc_id11.stop):null), (CAPITALIZED_ID12!=null?CAPITALIZED_ID12.getText():null));
			    context.constructGUISymblTable((lc_id11!=null?input.toString(lc_id11.start,lc_id11.stop):null), (CAPITALIZED_ID12!=null?CAPITALIZED_ID12.getText():null));
			     
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
	// $ANTLR end "csGeneratedInfo_def"



	// $ANTLR start "csConsumeInfo_def"
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:139:1: csConsumeInfo_def : 'consume' lc_id 'from' CAPITALIZED_ID ;
	public final void csConsumeInfo_def() throws RecognitionException {
		ParserRuleReturnScope lc_id13 =null;

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:139:18: ( 'consume' lc_id 'from' CAPITALIZED_ID )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:141:5: 'consume' lc_id 'from' CAPITALIZED_ID
			{
			match(input,24,FOLLOW_24_in_csConsumeInfo_def570); 
			pushFollow(FOLLOW_lc_id_in_csConsumeInfo_def572);
			lc_id13=lc_id();
			state._fsp--;

			match(input,26,FOLLOW_26_in_csConsumeInfo_def575); 
			match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_csConsumeInfo_def578); 
			 context.currentComputationalService.addConsumedInfo((lc_id13!=null?input.toString(lc_id13.start,lc_id13.stop):null));    
			   
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
	// $ANTLR end "csConsumeInfo_def"



	// $ANTLR start "csRequest_def"
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:146:1: csRequest_def : 'request' lc_id 'to' CAPITALIZED_ID ;
	public final void csRequest_def() throws RecognitionException {
		ParserRuleReturnScope lc_id14 =null;

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:146:15: ( 'request' lc_id 'to' CAPITALIZED_ID )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:147:4: 'request' lc_id 'to' CAPITALIZED_ID
			{
			match(input,29,FOLLOW_29_in_csRequest_def609); 
			pushFollow(FOLLOW_lc_id_in_csRequest_def611);
			lc_id14=lc_id();
			state._fsp--;

			match(input,32,FOLLOW_32_in_csRequest_def613); 
			match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_csRequest_def615); 
			 context.currentComputationalService.getDataAccessListFromSymblTable((lc_id14!=null?input.toString(lc_id14.start,lc_id14.stop):null));
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
	// $ANTLR end "csRequest_def"



	// $ANTLR start "cntrlCommand_def"
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:152:1: cntrlCommand_def : 'command' name= CAPITALIZED_ID '(' ( cntrlParameter_def )? ')' 'to' CAPITALIZED_ID ;
	public final void cntrlCommand_def() throws RecognitionException {
		Token name=null;

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:152:18: ( 'command' name= CAPITALIZED_ID '(' ( cntrlParameter_def )? ')' 'to' CAPITALIZED_ID )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:154:6: 'command' name= CAPITALIZED_ID '(' ( cntrlParameter_def )? ')' 'to' CAPITALIZED_ID
			{
			match(input,22,FOLLOW_22_in_cntrlCommand_def642); 
			name=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_cntrlCommand_def649); 
			match(input,8,FOLLOW_8_in_cntrlCommand_def651); 
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:154:43: ( cntrlParameter_def )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==ID) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:154:44: cntrlParameter_def
					{
					pushFollow(FOLLOW_cntrlParameter_def_in_cntrlCommand_def654);
					cntrlParameter_def();
					state._fsp--;

					}
					break;

			}

			match(input,9,FOLLOW_9_in_cntrlCommand_def658); 
			match(input,32,FOLLOW_32_in_cntrlCommand_def660); 
			match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_cntrlCommand_def663); 
			 
			      context.currentComputationalService.addCommand((name!=null?name.getText():null));  
			    
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
	// $ANTLR end "cntrlCommand_def"



	// $ANTLR start "cntrlParameter_def"
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:160:1: cntrlParameter_def : lc_id ;
	public final void cntrlParameter_def() throws RecognitionException {
		ParserRuleReturnScope lc_id15 =null;

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:160:20: ( lc_id )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:161:5: lc_id
			{
			pushFollow(FOLLOW_lc_id_in_cntrlParameter_def682);
			lc_id15=lc_id();
			state._fsp--;

			 context.currentComputationalService.addParameter((lc_id15!=null?input.toString(lc_id15.start,lc_id15.stop):null)); 
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
	// $ANTLR end "cntrlParameter_def"


	public static class lc_id_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "lc_id"
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:174:1: lc_id : ID ;
	public final ArchSpecParser.lc_id_return lc_id() throws RecognitionException {
		ArchSpecParser.lc_id_return retval = new ArchSpecParser.lc_id_return();
		retval.start = input.LT(1);

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:174:6: ( ID )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:174:8: ID
			{
			match(input,ID,FOLLOW_ID_in_lc_id714); 
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
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:177:1: dataType : primitiveType ;
	public final ArchSpecParser.dataType_return dataType() throws RecognitionException {
		ArchSpecParser.dataType_return retval = new ArchSpecParser.dataType_return();
		retval.start = input.LT(1);

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:177:9: ( primitiveType )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:178:3: primitiveType
			{
			pushFollow(FOLLOW_primitiveType_in_dataType728);
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
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:181:1: primitiveType : (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' ) ;
	public final void primitiveType() throws RecognitionException {
		Token id=null;

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:181:14: ( (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' ) )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:182:3: (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' )
			{
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:182:3: (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' )
			int alt18=6;
			switch ( input.LA(1) ) {
			case 18:
				{
				alt18=1;
				}
				break;
			case 13:
				{
				alt18=2;
				}
				break;
			case 19:
				{
				alt18=3;
				}
				break;
			case 25:
				{
				alt18=4;
				}
				break;
			case 28:
				{
				alt18=5;
				}
				break;
			case 21:
				{
				alt18=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}
			switch (alt18) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:182:4: id= 'Integer'
					{
					id=(Token)match(input,18,FOLLOW_18_in_primitiveType743); 
					}
					break;
				case 2 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:182:19: id= 'Boolean'
					{
					id=(Token)match(input,13,FOLLOW_13_in_primitiveType749); 
					}
					break;
				case 3 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:182:34: id= 'String'
					{
					id=(Token)match(input,19,FOLLOW_19_in_primitiveType755); 
					}
					break;
				case 4 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:182:49: id= 'double'
					{
					id=(Token)match(input,25,FOLLOW_25_in_primitiveType764); 
					}
					break;
				case 5 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:182:65: id= 'long'
					{
					id=(Token)match(input,28,FOLLOW_28_in_primitiveType772); 
					}
					break;
				case 6 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:182:79: id= 'boolean'
					{
					id=(Token)match(input,21,FOLLOW_21_in_primitiveType778); 
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

	// Delegated rules



	public static final BitSet FOLLOW_31_in_archSpec90 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_archSpec92 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_struct_def_in_archSpec94 = new BitSet(new long[]{0x00000000C0000000L});
	public static final BitSet FOLLOW_30_in_archSpec105 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_archSpec107 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_component_def_in_archSpec110 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_23_in_component_def130 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_component_def132 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_cs_def_in_component_def135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_struct_def152 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_structField_def_in_struct_def166 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_struct_def168 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_lc_id_in_structField_def191 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_structField_def193 = new BitSet(new long[]{0x00000000122C2000L});
	public static final BitSet FOLLOW_dataType_in_structField_def195 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_cs_def222 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_cs_def224 = new BitSet(new long[]{0x0000000000018012L});
	public static final BitSet FOLLOW_agg_cs_def_in_cs_def236 = new BitSet(new long[]{0x0000000000018012L});
	public static final BitSet FOLLOW_16_in_cs_def247 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_cs_def253 = new BitSet(new long[]{0x0000000000018012L});
	public static final BitSet FOLLOW_coordinator_def_in_cs_def256 = new BitSet(new long[]{0x0000000000018012L});
	public static final BitSet FOLLOW_15_in_cs_def269 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_cs_def271 = new BitSet(new long[]{0x0000000000008012L});
	public static final BitSet FOLLOW_controller_def_in_cs_def274 = new BitSet(new long[]{0x0000000000008012L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_agg_cs_def298 = new BitSet(new long[]{0x0000000009004002L});
	public static final BitSet FOLLOW_csConsumeInfo_def_in_agg_cs_def312 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_agg_cs_def314 = new BitSet(new long[]{0x0000000009004002L});
	public static final BitSet FOLLOW_csOperation_def_in_agg_cs_def324 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_agg_cs_def326 = new BitSet(new long[]{0x0000000008004002L});
	public static final BitSet FOLLOW_csGeneratedInfoForAggregator_def_in_agg_cs_def335 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_agg_cs_def337 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_coordinator_def358 = new BitSet(new long[]{0x0000000029000002L});
	public static final BitSet FOLLOW_csConsumeInfo_def_in_coordinator_def372 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_coordinator_def374 = new BitSet(new long[]{0x0000000029000002L});
	public static final BitSet FOLLOW_csRequest_def_in_coordinator_def384 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_coordinator_def386 = new BitSet(new long[]{0x0000000028000002L});
	public static final BitSet FOLLOW_csGeneratedInfo_def_in_coordinator_def395 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_coordinator_def397 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_controller_def420 = new BitSet(new long[]{0x0000000001400002L});
	public static final BitSet FOLLOW_csConsumeInfo_def_in_controller_def434 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_controller_def436 = new BitSet(new long[]{0x0000000001400002L});
	public static final BitSet FOLLOW_cntrlCommand_def_in_controller_def446 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_controller_def448 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_14_in_csOperation_def479 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_csOperation_def481 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_csOperation_def482 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_csOperation_def484 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_INT_in_csOperation_def486 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_csOperation_def488 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_csGeneratedInfoForAggregator_def509 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_lc_id_in_csGeneratedInfoForAggregator_def511 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_csGeneratedInfoForAggregator_def513 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_csGeneratedInfoForAggregator_def516 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_csGeneratedInfo_def535 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_lc_id_in_csGeneratedInfo_def537 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_csGeneratedInfo_def539 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_csGeneratedInfo_def542 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_csConsumeInfo_def570 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_lc_id_in_csConsumeInfo_def572 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_csConsumeInfo_def575 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_csConsumeInfo_def578 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_csRequest_def609 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_lc_id_in_csRequest_def611 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_csRequest_def613 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_csRequest_def615 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_cntrlCommand_def642 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_cntrlCommand_def649 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_cntrlCommand_def651 = new BitSet(new long[]{0x0000000000000220L});
	public static final BitSet FOLLOW_cntrlParameter_def_in_cntrlCommand_def654 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_cntrlCommand_def658 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_cntrlCommand_def660 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_cntrlCommand_def663 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lc_id_in_cntrlParameter_def682 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_lc_id714 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveType_in_dataType728 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_primitiveType743 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_primitiveType749 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_primitiveType755 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_primitiveType764 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_primitiveType772 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_primitiveType778 = new BitSet(new long[]{0x0000000000000002L});
}
