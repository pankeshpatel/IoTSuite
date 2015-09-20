// $ANTLR 3.5.1 S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g 2015-09-20 23:51:26

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
		"WS", "'('", "')'", "':'", "';'", "'Aggregator'", "'Boolean'", "'COMPUTE('", 
		"'Controller'", "'Coordinator'", "'Integer'", "'String'", "'boolean'", 
		"'command'", "'computationalService'", "'consume'", "'double'", "'from'", 
		"'generate'", "'long'", "'partition-per'", "'region-hops'", "'request'", 
		"'softwarecomponents'", "'structs'", "'to'"
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
	@Override public String getGrammarFileName() { return "S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g"; }


	  private SymbolTable context;     



	// $ANTLR start "archSpec"
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:23:1: archSpec : ( 'structs' ':' struct_def )* 'softwarecomponents' ':' ( component_def )+ ;
	public final void archSpec() throws RecognitionException {
		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:23:10: ( ( 'structs' ':' struct_def )* 'softwarecomponents' ':' ( component_def )+ )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:24:5: ( 'structs' ':' struct_def )* 'softwarecomponents' ':' ( component_def )+
			{
			 context = new SymbolTable();
			   context.currentRegion = new RegionCompiler();
			    context.currentMappingConstraint = new MapperCompiler(); 
			    
			 context.currentRegion.generateRegionCode(); 
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:29:5: ( 'structs' ':' struct_def )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==31) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:29:6: 'structs' ':' struct_def
					{
					match(input,31,FOLLOW_31_in_archSpec90); 
					match(input,10,FOLLOW_10_in_archSpec92); 
					pushFollow(FOLLOW_struct_def_in_archSpec94);
					struct_def();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}

			match(input,30,FOLLOW_30_in_archSpec104); 
			match(input,10,FOLLOW_10_in_archSpec106); 
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:30:31: ( component_def )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==21) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:30:32: component_def
					{
					pushFollow(FOLLOW_component_def_in_archSpec109);
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
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:33:1: component_def : 'computationalService' ':' ( cs_def ) ;
	public final void component_def() throws RecognitionException {
		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:33:15: ( 'computationalService' ':' ( cs_def ) )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:34:5: 'computationalService' ':' ( cs_def )
			{
			match(input,21,FOLLOW_21_in_component_def129); 
			match(input,10,FOLLOW_10_in_component_def131); 
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:34:32: ( cs_def )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:34:33: cs_def
			{
			pushFollow(FOLLOW_cs_def_in_component_def134);
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
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:39:1: struct_def : CAPITALIZED_ID ( structField_def ';' )+ ;
	public final void struct_def() throws RecognitionException {
		Token CAPITALIZED_ID1=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:39:11: ( CAPITALIZED_ID ( structField_def ';' )+ )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:40:5: CAPITALIZED_ID ( structField_def ';' )+
			{
			CAPITALIZED_ID1=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_struct_def154); 
			context.currentStruct = new StructCompiler((CAPITALIZED_ID1!=null?CAPITALIZED_ID1.getText():null));
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:42:5: ( structField_def ';' )+
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
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:42:6: structField_def ';'
					{
					pushFollow(FOLLOW_structField_def_in_struct_def168);
					structField_def();
					state._fsp--;

					match(input,11,FOLLOW_11_in_struct_def170); 
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
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:45:1: structField_def : lc_id ':' dataType ;
	public final void structField_def() throws RecognitionException {
		ParserRuleReturnScope lc_id2 =null;
		ParserRuleReturnScope dataType3 =null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:45:16: ( lc_id ':' dataType )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:46:3: lc_id ':' dataType
			{
			pushFollow(FOLLOW_lc_id_in_structField_def193);
			lc_id2=lc_id();
			state._fsp--;

			match(input,10,FOLLOW_10_in_structField_def195); 
			pushFollow(FOLLOW_dataType_in_structField_def197);
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
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:54:1: cs_def : ( 'Aggregator' ':' ( agg_cs_def )* )* ( 'Coordinator' ':' ( coordinator_def )* )* ( 'Controller' ':' ( controller_def )* )* ;
	public final void cs_def() throws RecognitionException {
		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:54:7: ( ( 'Aggregator' ':' ( agg_cs_def )* )* ( 'Coordinator' ':' ( coordinator_def )* )* ( 'Controller' ':' ( controller_def )* )* )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:56:5: ( 'Aggregator' ':' ( agg_cs_def )* )* ( 'Coordinator' ':' ( coordinator_def )* )* ( 'Controller' ':' ( controller_def )* )*
			{
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:56:5: ( 'Aggregator' ':' ( agg_cs_def )* )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==12) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:56:6: 'Aggregator' ':' ( agg_cs_def )*
					{
					match(input,12,FOLLOW_12_in_cs_def228); 
					match(input,10,FOLLOW_10_in_cs_def229); 
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:56:23: ( agg_cs_def )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( (LA4_0==CAPITALIZED_ID) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:56:24: agg_cs_def
							{
							pushFollow(FOLLOW_agg_cs_def_in_cs_def233);
							agg_cs_def();
							state._fsp--;

							}
							break;

						default :
							break loop4;
						}
					}

					}
					break;

				default :
					break loop5;
				}
			}

			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:58:5: ( 'Coordinator' ':' ( coordinator_def )* )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==16) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:58:6: 'Coordinator' ':' ( coordinator_def )*
					{
					match(input,16,FOLLOW_16_in_cs_def248); 
					match(input,10,FOLLOW_10_in_cs_def249); 
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:58:23: ( coordinator_def )*
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( (LA6_0==CAPITALIZED_ID) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:58:24: coordinator_def
							{
							pushFollow(FOLLOW_coordinator_def_in_cs_def252);
							coordinator_def();
							state._fsp--;

							}
							break;

						default :
							break loop6;
						}
					}

					}
					break;

				default :
					break loop7;
				}
			}

			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:60:5: ( 'Controller' ':' ( controller_def )* )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==15) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:60:6: 'Controller' ':' ( controller_def )*
					{
					match(input,15,FOLLOW_15_in_cs_def269); 
					match(input,10,FOLLOW_10_in_cs_def270); 
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:60:22: ( controller_def )*
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( (LA8_0==CAPITALIZED_ID) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:60:23: controller_def
							{
							pushFollow(FOLLOW_controller_def_in_cs_def273);
							controller_def();
							state._fsp--;

							}
							break;

						default :
							break loop8;
						}
					}

					}
					break;

				default :
					break loop9;
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
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:67:1: agg_cs_def : CAPITALIZED_ID ( csConsumeInfo_def ';' )* ( csOperation_def ';' )* ( csGeneratedInfoForAggregator_def ';' )* ( partition_def ';' )+ ;
	public final void agg_cs_def() throws RecognitionException {
		Token CAPITALIZED_ID4=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:67:11: ( CAPITALIZED_ID ( csConsumeInfo_def ';' )* ( csOperation_def ';' )* ( csGeneratedInfoForAggregator_def ';' )* ( partition_def ';' )+ )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:69:2: CAPITALIZED_ID ( csConsumeInfo_def ';' )* ( csOperation_def ';' )* ( csGeneratedInfoForAggregator_def ';' )* ( partition_def ';' )+
			{
			CAPITALIZED_ID4=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_agg_cs_def300); 
			 
			     context.currentComputationalService = new ComputationalServiceCompiler(); 
			     context.currentMappingConstraint.setSoftwareComponentName((CAPITALIZED_ID4!=null?CAPITALIZED_ID4.getText():null));
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:73:5: ( csConsumeInfo_def ';' )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==22) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:73:6: csConsumeInfo_def ';'
					{
					pushFollow(FOLLOW_csConsumeInfo_def_in_agg_cs_def314);
					csConsumeInfo_def();
					state._fsp--;

					match(input,11,FOLLOW_11_in_agg_cs_def316); 
					}
					break;

				default :
					break loop10;
				}
			}

			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:74:5: ( csOperation_def ';' )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==14) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:74:6: csOperation_def ';'
					{
					pushFollow(FOLLOW_csOperation_def_in_agg_cs_def326);
					csOperation_def();
					state._fsp--;

					match(input,11,FOLLOW_11_in_agg_cs_def328); 
					}
					break;

				default :
					break loop11;
				}
			}

			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:75:6: ( csGeneratedInfoForAggregator_def ';' )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==25) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:75:7: csGeneratedInfoForAggregator_def ';'
					{
					pushFollow(FOLLOW_csGeneratedInfoForAggregator_def_in_agg_cs_def338);
					csGeneratedInfoForAggregator_def();
					state._fsp--;

					match(input,11,FOLLOW_11_in_agg_cs_def340); 
					}
					break;

				default :
					break loop12;
				}
			}

			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:76:5: ( partition_def ';' )+
			int cnt13=0;
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==27) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:76:6: partition_def ';'
					{
					pushFollow(FOLLOW_partition_def_in_agg_cs_def349);
					partition_def();
					state._fsp--;

					match(input,11,FOLLOW_11_in_agg_cs_def351); 
					}
					break;

				default :
					if ( cnt13 >= 1 ) break loop13;
					EarlyExitException eee = new EarlyExitException(13, input);
					throw eee;
				}
				cnt13++;
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
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:86:1: coordinator_def : CAPITALIZED_ID ( csConsumeInfo_def ';' )* ( csRequest_def ';' )* ( csGeneratedInfo_def ';' )* ( partition_def ';' )+ ;
	public final void coordinator_def() throws RecognitionException {
		Token CAPITALIZED_ID5=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:86:16: ( CAPITALIZED_ID ( csConsumeInfo_def ';' )* ( csRequest_def ';' )* ( csGeneratedInfo_def ';' )* ( partition_def ';' )+ )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:88:1: CAPITALIZED_ID ( csConsumeInfo_def ';' )* ( csRequest_def ';' )* ( csGeneratedInfo_def ';' )* ( partition_def ';' )+
			{
			CAPITALIZED_ID5=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_coordinator_def370); 
			 
			     context.currentComputationalService = new ComputationalServiceCompiler(); 
			     context.currentMappingConstraint.setSoftwareComponentName((CAPITALIZED_ID5!=null?CAPITALIZED_ID5.getText():null));
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:92:5: ( csConsumeInfo_def ';' )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==22) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:92:6: csConsumeInfo_def ';'
					{
					pushFollow(FOLLOW_csConsumeInfo_def_in_coordinator_def384);
					csConsumeInfo_def();
					state._fsp--;

					match(input,11,FOLLOW_11_in_coordinator_def386); 
					}
					break;

				default :
					break loop14;
				}
			}

			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:93:5: ( csRequest_def ';' )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==29) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:93:6: csRequest_def ';'
					{
					pushFollow(FOLLOW_csRequest_def_in_coordinator_def396);
					csRequest_def();
					state._fsp--;

					match(input,11,FOLLOW_11_in_coordinator_def398); 
					}
					break;

				default :
					break loop15;
				}
			}

			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:94:7: ( csGeneratedInfo_def ';' )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==25) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:94:8: csGeneratedInfo_def ';'
					{
					pushFollow(FOLLOW_csGeneratedInfo_def_in_coordinator_def409);
					csGeneratedInfo_def();
					state._fsp--;

					match(input,11,FOLLOW_11_in_coordinator_def411); 
					}
					break;

				default :
					break loop16;
				}
			}

			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:95:4: ( partition_def ';' )+
			int cnt17=0;
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==27) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:95:5: partition_def ';'
					{
					pushFollow(FOLLOW_partition_def_in_coordinator_def419);
					partition_def();
					state._fsp--;

					match(input,11,FOLLOW_11_in_coordinator_def421); 
					}
					break;

				default :
					if ( cnt17 >= 1 ) break loop17;
					EarlyExitException eee = new EarlyExitException(17, input);
					throw eee;
				}
				cnt17++;
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
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:106:1: controller_def : CAPITALIZED_ID ( csConsumeInfo_def ';' )* ( cntrlCommand_def ';' )* ( partition_def ';' )+ ;
	public final void controller_def() throws RecognitionException {
		Token CAPITALIZED_ID6=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:106:15: ( CAPITALIZED_ID ( csConsumeInfo_def ';' )* ( cntrlCommand_def ';' )* ( partition_def ';' )+ )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:108:2: CAPITALIZED_ID ( csConsumeInfo_def ';' )* ( cntrlCommand_def ';' )* ( partition_def ';' )+
			{
			CAPITALIZED_ID6=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_controller_def441); 
			 
			     context.currentComputationalService = new ComputationalServiceCompiler(); 
			     context.currentMappingConstraint.setSoftwareComponentName((CAPITALIZED_ID6!=null?CAPITALIZED_ID6.getText():null));
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:112:5: ( csConsumeInfo_def ';' )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==22) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:112:6: csConsumeInfo_def ';'
					{
					pushFollow(FOLLOW_csConsumeInfo_def_in_controller_def455);
					csConsumeInfo_def();
					state._fsp--;

					match(input,11,FOLLOW_11_in_controller_def457); 
					}
					break;

				default :
					break loop18;
				}
			}

			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:113:5: ( cntrlCommand_def ';' )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==20) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:113:6: cntrlCommand_def ';'
					{
					pushFollow(FOLLOW_cntrlCommand_def_in_controller_def467);
					cntrlCommand_def();
					state._fsp--;

					match(input,11,FOLLOW_11_in_controller_def469); 
					}
					break;

				default :
					break loop19;
				}
			}

			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:114:5: ( partition_def ';' )+
			int cnt20=0;
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==27) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:114:6: partition_def ';'
					{
					pushFollow(FOLLOW_partition_def_in_controller_def481);
					partition_def();
					state._fsp--;

					match(input,11,FOLLOW_11_in_controller_def483); 
					}
					break;

				default :
					if ( cnt20 >= 1 ) break loop20;
					EarlyExitException eee = new EarlyExitException(20, input);
					throw eee;
				}
				cnt20++;
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
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:125:1: csOperation_def : 'COMPUTE(' CAPITALIZED_ID ')' ;
	public final void csOperation_def() throws RecognitionException {
		Token CAPITALIZED_ID7=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:125:17: ( 'COMPUTE(' CAPITALIZED_ID ')' )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:126:5: 'COMPUTE(' CAPITALIZED_ID ')'
			{
			match(input,14,FOLLOW_14_in_csOperation_def508); 
			CAPITALIZED_ID7=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_csOperation_def510); 
			match(input,9,FOLLOW_9_in_csOperation_def511); 
			 context.currentComputationalService.addOperation((CAPITALIZED_ID7!=null?CAPITALIZED_ID7.getText():null));  
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
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:130:1: csGeneratedInfoForAggregator_def : 'generate' lc_id ':' CAPITALIZED_ID ;
	public final void csGeneratedInfoForAggregator_def() throws RecognitionException {
		Token CAPITALIZED_ID9=null;
		ParserRuleReturnScope lc_id8 =null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:130:33: ( 'generate' lc_id ':' CAPITALIZED_ID )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:131:2: 'generate' lc_id ':' CAPITALIZED_ID
			{
			match(input,25,FOLLOW_25_in_csGeneratedInfoForAggregator_def532); 
			pushFollow(FOLLOW_lc_id_in_csGeneratedInfoForAggregator_def534);
			lc_id8=lc_id();
			state._fsp--;

			match(input,10,FOLLOW_10_in_csGeneratedInfoForAggregator_def536); 
			CAPITALIZED_ID9=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_csGeneratedInfoForAggregator_def539); 
			 context.currentComputationalService.addGeneratedInfo((lc_id8!=null?input.toString(lc_id8.start,lc_id8.stop):null), (CAPITALIZED_ID9!=null?CAPITALIZED_ID9.getText():null)); 
			    context.constructSymbTable((lc_id8!=null?input.toString(lc_id8.start,lc_id8.stop):null), (CAPITALIZED_ID9!=null?CAPITALIZED_ID9.getText():null));
			    context.constructAggregatorSymblTable((CAPITALIZED_ID9!=null?CAPITALIZED_ID9.getText():null));
			    
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
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:139:1: csGeneratedInfo_def : 'generate' lc_id ':' CAPITALIZED_ID ;
	public final void csGeneratedInfo_def() throws RecognitionException {
		Token CAPITALIZED_ID11=null;
		ParserRuleReturnScope lc_id10 =null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:139:20: ( 'generate' lc_id ':' CAPITALIZED_ID )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:140:5: 'generate' lc_id ':' CAPITALIZED_ID
			{
			match(input,25,FOLLOW_25_in_csGeneratedInfo_def558); 
			pushFollow(FOLLOW_lc_id_in_csGeneratedInfo_def560);
			lc_id10=lc_id();
			state._fsp--;

			match(input,10,FOLLOW_10_in_csGeneratedInfo_def562); 
			CAPITALIZED_ID11=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_csGeneratedInfo_def565); 
			 context.currentComputationalService.addGeneratedInfo((lc_id10!=null?input.toString(lc_id10.start,lc_id10.stop):null), (CAPITALIZED_ID11!=null?CAPITALIZED_ID11.getText():null)); 
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
	// $ANTLR end "csGeneratedInfo_def"



	// $ANTLR start "csConsumeInfo_def"
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:145:1: csConsumeInfo_def : 'consume' lc_id 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID ;
	public final void csConsumeInfo_def() throws RecognitionException {
		ParserRuleReturnScope lc_id12 =null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:145:18: ( 'consume' lc_id 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:147:6: 'consume' lc_id 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID
			{
			match(input,22,FOLLOW_22_in_csConsumeInfo_def591); 
			pushFollow(FOLLOW_lc_id_in_csConsumeInfo_def593);
			lc_id12=lc_id();
			state._fsp--;

			match(input,24,FOLLOW_24_in_csConsumeInfo_def595); 
			match(input,28,FOLLOW_28_in_csConsumeInfo_def597); 
			match(input,10,FOLLOW_10_in_csConsumeInfo_def599); 
			match(input,INT,FOLLOW_INT_in_csConsumeInfo_def601); 
			match(input,10,FOLLOW_10_in_csConsumeInfo_def603); 
			match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_csConsumeInfo_def605); 
			 context.currentComputationalService.addConsumedInfo((lc_id12!=null?input.toString(lc_id12.start,lc_id12.stop):null));  
			    
			   
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
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:153:1: csRequest_def : 'request' lc_id ;
	public final void csRequest_def() throws RecognitionException {
		ParserRuleReturnScope lc_id13 =null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:153:15: ( 'request' lc_id )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:154:4: 'request' lc_id
			{
			match(input,29,FOLLOW_29_in_csRequest_def633); 
			pushFollow(FOLLOW_lc_id_in_csRequest_def635);
			lc_id13=lc_id();
			state._fsp--;

			 context.currentComputationalService.getDataAccessListFromSymblTable((lc_id13!=null?input.toString(lc_id13.start,lc_id13.stop):null));
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
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:159:1: cntrlCommand_def : 'command' name= CAPITALIZED_ID '(' ( cntrlParameter_def )? ')' 'to' 'region-hops' ':' INT ':' CAPITALIZED_ID ;
	public final void cntrlCommand_def() throws RecognitionException {
		Token name=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:159:18: ( 'command' name= CAPITALIZED_ID '(' ( cntrlParameter_def )? ')' 'to' 'region-hops' ':' INT ':' CAPITALIZED_ID )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:160:5: 'command' name= CAPITALIZED_ID '(' ( cntrlParameter_def )? ')' 'to' 'region-hops' ':' INT ':' CAPITALIZED_ID
			{
			match(input,20,FOLLOW_20_in_cntrlCommand_def657); 
			name=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_cntrlCommand_def664); 
			match(input,8,FOLLOW_8_in_cntrlCommand_def666); 
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:160:42: ( cntrlParameter_def )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==ID) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:160:43: cntrlParameter_def
					{
					pushFollow(FOLLOW_cntrlParameter_def_in_cntrlCommand_def669);
					cntrlParameter_def();
					state._fsp--;

					}
					break;

			}

			match(input,9,FOLLOW_9_in_cntrlCommand_def673); 
			match(input,32,FOLLOW_32_in_cntrlCommand_def675); 
			match(input,28,FOLLOW_28_in_cntrlCommand_def678); 
			match(input,10,FOLLOW_10_in_cntrlCommand_def680); 
			match(input,INT,FOLLOW_INT_in_cntrlCommand_def682); 
			match(input,10,FOLLOW_10_in_cntrlCommand_def684); 
			match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_cntrlCommand_def686); 
			 
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
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:167:1: cntrlParameter_def : lc_id ;
	public final void cntrlParameter_def() throws RecognitionException {
		ParserRuleReturnScope lc_id14 =null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:167:20: ( lc_id )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:168:5: lc_id
			{
			pushFollow(FOLLOW_lc_id_in_cntrlParameter_def710);
			lc_id14=lc_id();
			state._fsp--;

			 context.currentComputationalService.addParameter((lc_id14!=null?input.toString(lc_id14.start,lc_id14.stop):null)); 
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



	// $ANTLR start "partition_def"
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:177:1: partition_def : csDeploymentConstraint= 'partition-per' ':' CAPITALIZED_ID ;
	public final void partition_def() throws RecognitionException {
		Token csDeploymentConstraint=null;
		Token CAPITALIZED_ID15=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:177:14: (csDeploymentConstraint= 'partition-per' ':' CAPITALIZED_ID )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:178:5: csDeploymentConstraint= 'partition-per' ':' CAPITALIZED_ID
			{
			csDeploymentConstraint=(Token)match(input,27,FOLLOW_27_in_partition_def743); 
			match(input,10,FOLLOW_10_in_partition_def745); 
			CAPITALIZED_ID15=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_partition_def747); 
			 
			    context.currentComputationalService.addPartitionAttribute((CAPITALIZED_ID15!=null?CAPITALIZED_ID15.getText():null));   
			    // Next two lines are for  Mapping constraints
			    context.currentMappingConstraint.setAttributeName((csDeploymentConstraint!=null?csDeploymentConstraint.getText():null));  
			    context.currentMappingConstraint.setAttributeValue((CAPITALIZED_ID15!=null?CAPITALIZED_ID15.getText():null)); 
			   
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
	// $ANTLR end "partition_def"


	public static class lc_id_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "lc_id"
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:187:1: lc_id : ID ;
	public final ArchSpecParser.lc_id_return lc_id() throws RecognitionException {
		ArchSpecParser.lc_id_return retval = new ArchSpecParser.lc_id_return();
		retval.start = input.LT(1);

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:187:6: ( ID )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:187:8: ID
			{
			match(input,ID,FOLLOW_ID_in_lc_id765); 
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
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:190:1: dataType : primitiveType ;
	public final ArchSpecParser.dataType_return dataType() throws RecognitionException {
		ArchSpecParser.dataType_return retval = new ArchSpecParser.dataType_return();
		retval.start = input.LT(1);

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:190:9: ( primitiveType )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:191:3: primitiveType
			{
			pushFollow(FOLLOW_primitiveType_in_dataType779);
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
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:194:1: primitiveType : (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' ) ;
	public final void primitiveType() throws RecognitionException {
		Token id=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:194:14: ( (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' ) )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:195:3: (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' )
			{
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:195:3: (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' )
			int alt22=6;
			switch ( input.LA(1) ) {
			case 17:
				{
				alt22=1;
				}
				break;
			case 13:
				{
				alt22=2;
				}
				break;
			case 18:
				{
				alt22=3;
				}
				break;
			case 23:
				{
				alt22=4;
				}
				break;
			case 26:
				{
				alt22=5;
				}
				break;
			case 19:
				{
				alt22=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}
			switch (alt22) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:195:4: id= 'Integer'
					{
					id=(Token)match(input,17,FOLLOW_17_in_primitiveType794); 
					}
					break;
				case 2 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:195:19: id= 'Boolean'
					{
					id=(Token)match(input,13,FOLLOW_13_in_primitiveType800); 
					}
					break;
				case 3 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:195:34: id= 'String'
					{
					id=(Token)match(input,18,FOLLOW_18_in_primitiveType806); 
					}
					break;
				case 4 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:195:49: id= 'double'
					{
					id=(Token)match(input,23,FOLLOW_23_in_primitiveType815); 
					}
					break;
				case 5 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:195:65: id= 'long'
					{
					id=(Token)match(input,26,FOLLOW_26_in_primitiveType823); 
					}
					break;
				case 6 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:195:79: id= 'boolean'
					{
					id=(Token)match(input,19,FOLLOW_19_in_primitiveType829); 
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



	public static final BitSet FOLLOW_31_in_archSpec90 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_archSpec92 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_struct_def_in_archSpec94 = new BitSet(new long[]{0x00000000C0000000L});
	public static final BitSet FOLLOW_30_in_archSpec104 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_archSpec106 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_component_def_in_archSpec109 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_21_in_component_def129 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_component_def131 = new BitSet(new long[]{0x0000000000019000L});
	public static final BitSet FOLLOW_cs_def_in_component_def134 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_struct_def154 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_structField_def_in_struct_def168 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_struct_def170 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_lc_id_in_structField_def193 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_structField_def195 = new BitSet(new long[]{0x00000000048E2000L});
	public static final BitSet FOLLOW_dataType_in_structField_def197 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_cs_def228 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_cs_def229 = new BitSet(new long[]{0x0000000000019012L});
	public static final BitSet FOLLOW_agg_cs_def_in_cs_def233 = new BitSet(new long[]{0x0000000000019012L});
	public static final BitSet FOLLOW_16_in_cs_def248 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_cs_def249 = new BitSet(new long[]{0x0000000000018012L});
	public static final BitSet FOLLOW_coordinator_def_in_cs_def252 = new BitSet(new long[]{0x0000000000018012L});
	public static final BitSet FOLLOW_15_in_cs_def269 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_cs_def270 = new BitSet(new long[]{0x0000000000008012L});
	public static final BitSet FOLLOW_controller_def_in_cs_def273 = new BitSet(new long[]{0x0000000000008012L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_agg_cs_def300 = new BitSet(new long[]{0x000000000A404000L});
	public static final BitSet FOLLOW_csConsumeInfo_def_in_agg_cs_def314 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_agg_cs_def316 = new BitSet(new long[]{0x000000000A404000L});
	public static final BitSet FOLLOW_csOperation_def_in_agg_cs_def326 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_agg_cs_def328 = new BitSet(new long[]{0x000000000A004000L});
	public static final BitSet FOLLOW_csGeneratedInfoForAggregator_def_in_agg_cs_def338 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_agg_cs_def340 = new BitSet(new long[]{0x000000000A000000L});
	public static final BitSet FOLLOW_partition_def_in_agg_cs_def349 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_agg_cs_def351 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_coordinator_def370 = new BitSet(new long[]{0x000000002A400000L});
	public static final BitSet FOLLOW_csConsumeInfo_def_in_coordinator_def384 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_coordinator_def386 = new BitSet(new long[]{0x000000002A400000L});
	public static final BitSet FOLLOW_csRequest_def_in_coordinator_def396 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_coordinator_def398 = new BitSet(new long[]{0x000000002A000000L});
	public static final BitSet FOLLOW_csGeneratedInfo_def_in_coordinator_def409 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_coordinator_def411 = new BitSet(new long[]{0x000000000A000000L});
	public static final BitSet FOLLOW_partition_def_in_coordinator_def419 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_coordinator_def421 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_controller_def441 = new BitSet(new long[]{0x0000000008500000L});
	public static final BitSet FOLLOW_csConsumeInfo_def_in_controller_def455 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_controller_def457 = new BitSet(new long[]{0x0000000008500000L});
	public static final BitSet FOLLOW_cntrlCommand_def_in_controller_def467 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_controller_def469 = new BitSet(new long[]{0x0000000008100000L});
	public static final BitSet FOLLOW_partition_def_in_controller_def481 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_controller_def483 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_14_in_csOperation_def508 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_csOperation_def510 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_csOperation_def511 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_csGeneratedInfoForAggregator_def532 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_lc_id_in_csGeneratedInfoForAggregator_def534 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_csGeneratedInfoForAggregator_def536 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_csGeneratedInfoForAggregator_def539 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_csGeneratedInfo_def558 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_lc_id_in_csGeneratedInfo_def560 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_csGeneratedInfo_def562 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_csGeneratedInfo_def565 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_csConsumeInfo_def591 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_lc_id_in_csConsumeInfo_def593 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_csConsumeInfo_def595 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_csConsumeInfo_def597 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_csConsumeInfo_def599 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_INT_in_csConsumeInfo_def601 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_csConsumeInfo_def603 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_csConsumeInfo_def605 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_csRequest_def633 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_lc_id_in_csRequest_def635 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_cntrlCommand_def657 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_cntrlCommand_def664 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_cntrlCommand_def666 = new BitSet(new long[]{0x0000000000000220L});
	public static final BitSet FOLLOW_cntrlParameter_def_in_cntrlCommand_def669 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_cntrlCommand_def673 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_cntrlCommand_def675 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_cntrlCommand_def678 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_cntrlCommand_def680 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_INT_in_cntrlCommand_def682 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_cntrlCommand_def684 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_cntrlCommand_def686 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lc_id_in_cntrlParameter_def710 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_partition_def743 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_partition_def745 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_partition_def747 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_lc_id765 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveType_in_dataType779 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_primitiveType794 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_primitiveType800 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_primitiveType806 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_primitiveType815 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_primitiveType823 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_primitiveType829 = new BitSet(new long[]{0x0000000000000002L});
}
