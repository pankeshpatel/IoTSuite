// $ANTLR 3.5.1 S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g 2015-11-26 21:49:04

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
		"WS", "'('", "')'", "','", "':'", "';'", "'Boolean'", "'COMPUTE('", "'Custom'", 
		"'InBuilt'", "'Integer'", "'String'", "'_BY_SAMPLE'", "'boolean'", "'command'", 
		"'computationalService'", "'consume'", "'double'", "'from'", "'generate'", 
		"'long'", "'request'", "'softwareComponents'", "'structs'", "'to'"
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
	@Override public String getGrammarFileName() { return "S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g"; }


	  private SymbolTable context;     



	// $ANTLR start "archSpec"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:23:1: archSpec : ( 'structs' ':' struct_def )* 'softwareComponents' ':' ( component_def )+ ;
	public final void archSpec() throws RecognitionException {
		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:23:10: ( ( 'structs' ':' struct_def )* 'softwareComponents' ':' ( component_def )+ )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:24:5: ( 'structs' ':' struct_def )* 'softwareComponents' ':' ( component_def )+
			{
			 context = new SymbolTable();
			    context.currentMappingConstraint = new MapperCompiler(); 
			    
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:27:5: ( 'structs' ':' struct_def )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==30) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:27:6: 'structs' ':' struct_def
					{
					match(input,30,FOLLOW_30_in_archSpec86); 
					match(input,11,FOLLOW_11_in_archSpec88); 
					pushFollow(FOLLOW_struct_def_in_archSpec90);
					struct_def();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}

			match(input,29,FOLLOW_29_in_archSpec101); 
			match(input,11,FOLLOW_11_in_archSpec103); 
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:28:31: ( component_def )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==22) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:28:32: component_def
					{
					pushFollow(FOLLOW_component_def_in_archSpec106);
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
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:31:1: component_def : 'computationalService' ':' ( cs_def ) ;
	public final void component_def() throws RecognitionException {
		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:31:15: ( 'computationalService' ':' ( cs_def ) )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:32:5: 'computationalService' ':' ( cs_def )
			{
			match(input,22,FOLLOW_22_in_component_def128); 
			match(input,11,FOLLOW_11_in_component_def130); 
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:32:32: ( cs_def )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:32:33: cs_def
			{
			pushFollow(FOLLOW_cs_def_in_component_def133);
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
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:35:1: struct_def : CAPITALIZED_ID ( structField_def ';' )+ ;
	public final void struct_def() throws RecognitionException {
		Token CAPITALIZED_ID1=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:35:11: ( CAPITALIZED_ID ( structField_def ';' )+ )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:36:5: CAPITALIZED_ID ( structField_def ';' )+
			{
			CAPITALIZED_ID1=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_struct_def150); 
			context.currentStruct = new StructCompiler((CAPITALIZED_ID1!=null?CAPITALIZED_ID1.getText():null));
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:38:5: ( structField_def ';' )+
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
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:38:6: structField_def ';'
					{
					pushFollow(FOLLOW_structField_def_in_struct_def164);
					structField_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_struct_def166); 
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
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:41:1: structField_def : lc_id ':' dataType ;
	public final void structField_def() throws RecognitionException {
		ParserRuleReturnScope lc_id2 =null;
		ParserRuleReturnScope dataType3 =null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:41:16: ( lc_id ':' dataType )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:42:3: lc_id ':' dataType
			{
			pushFollow(FOLLOW_lc_id_in_structField_def190);
			lc_id2=lc_id();
			state._fsp--;

			match(input,11,FOLLOW_11_in_structField_def192); 
			pushFollow(FOLLOW_dataType_in_structField_def194);
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
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:47:1: cs_def : 'InBuilt' ':' ( agg_cs_def )* 'Custom' ':' ( controller_def )* ;
	public final void cs_def() throws RecognitionException {
		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:47:7: ( 'InBuilt' ':' ( agg_cs_def )* 'Custom' ':' ( controller_def )* )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:48:5: 'InBuilt' ':' ( agg_cs_def )* 'Custom' ':' ( controller_def )*
			{
			match(input,16,FOLLOW_16_in_cs_def221); 
			match(input,11,FOLLOW_11_in_cs_def223); 
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:49:8: ( agg_cs_def )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==CAPITALIZED_ID) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:49:9: agg_cs_def
					{
					pushFollow(FOLLOW_agg_cs_def_in_cs_def235);
					agg_cs_def();
					state._fsp--;

					}
					break;

				default :
					break loop4;
				}
			}

			match(input,15,FOLLOW_15_in_cs_def245); 
			match(input,11,FOLLOW_11_in_cs_def247); 
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:51:9: ( controller_def )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==CAPITALIZED_ID) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:51:10: controller_def
					{
					pushFollow(FOLLOW_controller_def_in_cs_def259);
					controller_def();
					state._fsp--;

					}
					break;

				default :
					break loop5;
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
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:58:1: agg_cs_def : CAPITALIZED_ID ( csConsumeInfo_def ';' )* ( csOperation_def ';' )* ( csGeneratedInfoForAggregator_def ';' )* ;
	public final void agg_cs_def() throws RecognitionException {
		Token CAPITALIZED_ID4=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:58:11: ( CAPITALIZED_ID ( csConsumeInfo_def ';' )* ( csOperation_def ';' )* ( csGeneratedInfoForAggregator_def ';' )* )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:60:2: CAPITALIZED_ID ( csConsumeInfo_def ';' )* ( csOperation_def ';' )* ( csGeneratedInfoForAggregator_def ';' )*
			{
			CAPITALIZED_ID4=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_agg_cs_def303); 
			 
			     context.currentComputationalService = new ComputationalServiceCompiler(); 
			     context.currentMappingConstraint.setSoftwareComponentName((CAPITALIZED_ID4!=null?CAPITALIZED_ID4.getText():null));
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:64:5: ( csConsumeInfo_def ';' )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==23) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:64:6: csConsumeInfo_def ';'
					{
					pushFollow(FOLLOW_csConsumeInfo_def_in_agg_cs_def317);
					csConsumeInfo_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_agg_cs_def319); 
					}
					break;

				default :
					break loop6;
				}
			}

			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:65:5: ( csOperation_def ';' )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==14) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:65:6: csOperation_def ';'
					{
					pushFollow(FOLLOW_csOperation_def_in_agg_cs_def329);
					csOperation_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_agg_cs_def331); 
					}
					break;

				default :
					break loop7;
				}
			}

			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:66:5: ( csGeneratedInfoForAggregator_def ';' )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==26) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:66:6: csGeneratedInfoForAggregator_def ';'
					{
					pushFollow(FOLLOW_csGeneratedInfoForAggregator_def_in_agg_cs_def340);
					csGeneratedInfoForAggregator_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_agg_cs_def342); 
					}
					break;

				default :
					break loop8;
				}
			}

			   
			     context.currentComputationalService.setComputationalServiceName((CAPITALIZED_ID4!=null?CAPITALIZED_ID4.getText():null));
			     context.currentComputationalService.createCSObject();
			     context.currentMappingConstraint.setSoftwareComponentName((CAPITALIZED_ID4!=null?CAPITALIZED_ID4.getText():null));
			     context.currentMappingConstraint.setSoftwareComponentType("inbuilt");       
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



	// $ANTLR start "controller_def"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:99:1: controller_def : CAPITALIZED_ID ( csConsumeInfo_def ';' )* ( csRequest_def ';' )* ( csGeneratedInfo_def ';' )* ( cntrlCommand_def ';' )* ;
	public final void controller_def() throws RecognitionException {
		Token CAPITALIZED_ID5=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:99:15: ( CAPITALIZED_ID ( csConsumeInfo_def ';' )* ( csRequest_def ';' )* ( csGeneratedInfo_def ';' )* ( cntrlCommand_def ';' )* )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:101:2: CAPITALIZED_ID ( csConsumeInfo_def ';' )* ( csRequest_def ';' )* ( csGeneratedInfo_def ';' )* ( cntrlCommand_def ';' )*
			{
			CAPITALIZED_ID5=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_controller_def391); 
			 
			     context.currentComputationalService = new ComputationalServiceCompiler(); 
			     context.currentMappingConstraint.setSoftwareComponentName((CAPITALIZED_ID5!=null?CAPITALIZED_ID5.getText():null));
			     
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:106:5: ( csConsumeInfo_def ';' )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==23) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:106:6: csConsumeInfo_def ';'
					{
					pushFollow(FOLLOW_csConsumeInfo_def_in_controller_def405);
					csConsumeInfo_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_controller_def407); 
					}
					break;

				default :
					break loop9;
				}
			}

			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:107:6: ( csRequest_def ';' )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==28) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:107:7: csRequest_def ';'
					{
					pushFollow(FOLLOW_csRequest_def_in_controller_def419);
					csRequest_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_controller_def421); 
					}
					break;

				default :
					break loop10;
				}
			}

			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:108:5: ( csGeneratedInfo_def ';' )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==26) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:108:6: csGeneratedInfo_def ';'
					{
					pushFollow(FOLLOW_csGeneratedInfo_def_in_controller_def432);
					csGeneratedInfo_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_controller_def434); 
					}
					break;

				default :
					break loop11;
				}
			}

			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:109:5: ( cntrlCommand_def ';' )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==21) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:109:6: cntrlCommand_def ';'
					{
					pushFollow(FOLLOW_cntrlCommand_def_in_controller_def446);
					cntrlCommand_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_controller_def448); 
					}
					break;

				default :
					break loop12;
				}
			}

			 
			    context.currentComputationalService.setComputationalServiceName((CAPITALIZED_ID5!=null?CAPITALIZED_ID5.getText():null));
			     context.currentComputationalService.createCSObject();
			    context.currentComputationalService.generateComputationalServiceCode(); 
			   context.currentMappingConstraint.setSoftwareComponentName((CAPITALIZED_ID5!=null?CAPITALIZED_ID5.getText():null));
			      context.currentMappingConstraint.setSoftwareComponentType("custom");  
			   context.currentMappingConstraint.addDeployementConstraintObj(); 
			   
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
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:121:1: csOperation_def : 'COMPUTE(' CAPITALIZED_ID '_BY_SAMPLE' ',' INT ')' ;
	public final void csOperation_def() throws RecognitionException {
		Token CAPITALIZED_ID6=null;
		Token INT7=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:121:17: ( 'COMPUTE(' CAPITALIZED_ID '_BY_SAMPLE' ',' INT ')' )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:122:5: 'COMPUTE(' CAPITALIZED_ID '_BY_SAMPLE' ',' INT ')'
			{
			match(input,14,FOLLOW_14_in_csOperation_def479); 
			CAPITALIZED_ID6=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_csOperation_def481); 
			match(input,19,FOLLOW_19_in_csOperation_def482); 
			match(input,10,FOLLOW_10_in_csOperation_def484); 
			INT7=(Token)match(input,INT,FOLLOW_INT_in_csOperation_def486); 
			match(input,9,FOLLOW_9_in_csOperation_def488); 
			 context.currentComputationalService.addOperation((CAPITALIZED_ID6!=null?CAPITALIZED_ID6.getText():null),(INT7!=null?INT7.getText():null));  
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
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:126:1: csGeneratedInfoForAggregator_def : 'generate' lc_id ':' CAPITALIZED_ID ;
	public final void csGeneratedInfoForAggregator_def() throws RecognitionException {
		Token CAPITALIZED_ID9=null;
		ParserRuleReturnScope lc_id8 =null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:126:33: ( 'generate' lc_id ':' CAPITALIZED_ID )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:127:2: 'generate' lc_id ':' CAPITALIZED_ID
			{
			match(input,26,FOLLOW_26_in_csGeneratedInfoForAggregator_def509); 
			pushFollow(FOLLOW_lc_id_in_csGeneratedInfoForAggregator_def511);
			lc_id8=lc_id();
			state._fsp--;

			match(input,11,FOLLOW_11_in_csGeneratedInfoForAggregator_def513); 
			CAPITALIZED_ID9=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_csGeneratedInfoForAggregator_def516); 
			 
			    context.currentComputationalService.addGeneratedInfo((lc_id8!=null?input.toString(lc_id8.start,lc_id8.stop):null), (CAPITALIZED_ID9!=null?CAPITALIZED_ID9.getText():null)); 
			    context.constructSymbTable((lc_id8!=null?input.toString(lc_id8.start,lc_id8.stop):null), (CAPITALIZED_ID9!=null?CAPITALIZED_ID9.getText():null));
			    context.constructAggregatorSymblTable((CAPITALIZED_ID9!=null?CAPITALIZED_ID9.getText():null));
			     context.constructGUISymblTable((lc_id8!=null?input.toString(lc_id8.start,lc_id8.stop):null), (CAPITALIZED_ID9!=null?CAPITALIZED_ID9.getText():null));   
			    
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
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:137:1: csGeneratedInfo_def : 'generate' lc_id ':' CAPITALIZED_ID ;
	public final void csGeneratedInfo_def() throws RecognitionException {
		Token CAPITALIZED_ID11=null;
		ParserRuleReturnScope lc_id10 =null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:137:20: ( 'generate' lc_id ':' CAPITALIZED_ID )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:138:5: 'generate' lc_id ':' CAPITALIZED_ID
			{
			match(input,26,FOLLOW_26_in_csGeneratedInfo_def535); 
			pushFollow(FOLLOW_lc_id_in_csGeneratedInfo_def537);
			lc_id10=lc_id();
			state._fsp--;

			match(input,11,FOLLOW_11_in_csGeneratedInfo_def539); 
			CAPITALIZED_ID11=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_csGeneratedInfo_def542); 
			 context.currentComputationalService.addGeneratedInfo((lc_id10!=null?input.toString(lc_id10.start,lc_id10.stop):null), (CAPITALIZED_ID11!=null?CAPITALIZED_ID11.getText():null)); 
			    context.constructSymbTable((lc_id10!=null?input.toString(lc_id10.start,lc_id10.stop):null), (CAPITALIZED_ID11!=null?CAPITALIZED_ID11.getText():null));
			    context.constructGUISymblTable((lc_id10!=null?input.toString(lc_id10.start,lc_id10.stop):null), (CAPITALIZED_ID11!=null?CAPITALIZED_ID11.getText():null));
			     
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
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:145:1: csConsumeInfo_def : 'consume' lc_id 'from' CAPITALIZED_ID ;
	public final void csConsumeInfo_def() throws RecognitionException {
		ParserRuleReturnScope lc_id12 =null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:145:18: ( 'consume' lc_id 'from' CAPITALIZED_ID )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:147:5: 'consume' lc_id 'from' CAPITALIZED_ID
			{
			match(input,23,FOLLOW_23_in_csConsumeInfo_def570); 
			pushFollow(FOLLOW_lc_id_in_csConsumeInfo_def572);
			lc_id12=lc_id();
			state._fsp--;

			match(input,25,FOLLOW_25_in_csConsumeInfo_def575); 
			match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_csConsumeInfo_def578); 
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
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:152:1: csRequest_def : 'request' lc_id 'to' CAPITALIZED_ID ;
	public final void csRequest_def() throws RecognitionException {
		ParserRuleReturnScope lc_id13 =null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:152:15: ( 'request' lc_id 'to' CAPITALIZED_ID )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:153:4: 'request' lc_id 'to' CAPITALIZED_ID
			{
			match(input,28,FOLLOW_28_in_csRequest_def609); 
			pushFollow(FOLLOW_lc_id_in_csRequest_def611);
			lc_id13=lc_id();
			state._fsp--;

			match(input,31,FOLLOW_31_in_csRequest_def613); 
			match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_csRequest_def615); 
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
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:158:1: cntrlCommand_def : 'command' name= CAPITALIZED_ID '(' ( cntrlParameter_def )? ')' 'to' CAPITALIZED_ID ;
	public final void cntrlCommand_def() throws RecognitionException {
		Token name=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:158:18: ( 'command' name= CAPITALIZED_ID '(' ( cntrlParameter_def )? ')' 'to' CAPITALIZED_ID )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:160:6: 'command' name= CAPITALIZED_ID '(' ( cntrlParameter_def )? ')' 'to' CAPITALIZED_ID
			{
			match(input,21,FOLLOW_21_in_cntrlCommand_def642); 
			name=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_cntrlCommand_def649); 
			match(input,8,FOLLOW_8_in_cntrlCommand_def651); 
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:160:43: ( cntrlParameter_def )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==ID) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:160:44: cntrlParameter_def
					{
					pushFollow(FOLLOW_cntrlParameter_def_in_cntrlCommand_def654);
					cntrlParameter_def();
					state._fsp--;

					}
					break;

			}

			match(input,9,FOLLOW_9_in_cntrlCommand_def658); 
			match(input,31,FOLLOW_31_in_cntrlCommand_def660); 
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
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:166:1: cntrlParameter_def : lc_id ;
	public final void cntrlParameter_def() throws RecognitionException {
		ParserRuleReturnScope lc_id14 =null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:166:20: ( lc_id )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:167:5: lc_id
			{
			pushFollow(FOLLOW_lc_id_in_cntrlParameter_def682);
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


	public static class lc_id_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "lc_id"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:180:1: lc_id : ID ;
	public final ArchSpecParser.lc_id_return lc_id() throws RecognitionException {
		ArchSpecParser.lc_id_return retval = new ArchSpecParser.lc_id_return();
		retval.start = input.LT(1);

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:180:6: ( ID )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:180:8: ID
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
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:183:1: dataType : primitiveType ;
	public final ArchSpecParser.dataType_return dataType() throws RecognitionException {
		ArchSpecParser.dataType_return retval = new ArchSpecParser.dataType_return();
		retval.start = input.LT(1);

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:183:9: ( primitiveType )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:184:3: primitiveType
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
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:187:1: primitiveType : (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' ) ;
	public final void primitiveType() throws RecognitionException {
		Token id=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:187:14: ( (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' ) )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:188:3: (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' )
			{
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:188:3: (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' )
			int alt14=6;
			switch ( input.LA(1) ) {
			case 17:
				{
				alt14=1;
				}
				break;
			case 13:
				{
				alt14=2;
				}
				break;
			case 18:
				{
				alt14=3;
				}
				break;
			case 24:
				{
				alt14=4;
				}
				break;
			case 27:
				{
				alt14=5;
				}
				break;
			case 20:
				{
				alt14=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}
			switch (alt14) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:188:4: id= 'Integer'
					{
					id=(Token)match(input,17,FOLLOW_17_in_primitiveType743); 
					}
					break;
				case 2 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:188:19: id= 'Boolean'
					{
					id=(Token)match(input,13,FOLLOW_13_in_primitiveType749); 
					}
					break;
				case 3 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:188:34: id= 'String'
					{
					id=(Token)match(input,18,FOLLOW_18_in_primitiveType755); 
					}
					break;
				case 4 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:188:49: id= 'double'
					{
					id=(Token)match(input,24,FOLLOW_24_in_primitiveType764); 
					}
					break;
				case 5 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:188:65: id= 'long'
					{
					id=(Token)match(input,27,FOLLOW_27_in_primitiveType772); 
					}
					break;
				case 6 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\ArchSpec.g:188:79: id= 'boolean'
					{
					id=(Token)match(input,20,FOLLOW_20_in_primitiveType778); 
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



	public static final BitSet FOLLOW_30_in_archSpec86 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_archSpec88 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_struct_def_in_archSpec90 = new BitSet(new long[]{0x0000000060000000L});
	public static final BitSet FOLLOW_29_in_archSpec101 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_archSpec103 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_component_def_in_archSpec106 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_22_in_component_def128 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_component_def130 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_cs_def_in_component_def133 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_struct_def150 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_structField_def_in_struct_def164 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_struct_def166 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_lc_id_in_structField_def190 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_structField_def192 = new BitSet(new long[]{0x0000000009162000L});
	public static final BitSet FOLLOW_dataType_in_structField_def194 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_cs_def221 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_cs_def223 = new BitSet(new long[]{0x0000000000008010L});
	public static final BitSet FOLLOW_agg_cs_def_in_cs_def235 = new BitSet(new long[]{0x0000000000008010L});
	public static final BitSet FOLLOW_15_in_cs_def245 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_cs_def247 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_controller_def_in_cs_def259 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_agg_cs_def303 = new BitSet(new long[]{0x0000000004804002L});
	public static final BitSet FOLLOW_csConsumeInfo_def_in_agg_cs_def317 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_agg_cs_def319 = new BitSet(new long[]{0x0000000004804002L});
	public static final BitSet FOLLOW_csOperation_def_in_agg_cs_def329 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_agg_cs_def331 = new BitSet(new long[]{0x0000000004004002L});
	public static final BitSet FOLLOW_csGeneratedInfoForAggregator_def_in_agg_cs_def340 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_agg_cs_def342 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_controller_def391 = new BitSet(new long[]{0x0000000014A00002L});
	public static final BitSet FOLLOW_csConsumeInfo_def_in_controller_def405 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_controller_def407 = new BitSet(new long[]{0x0000000014A00002L});
	public static final BitSet FOLLOW_csRequest_def_in_controller_def419 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_controller_def421 = new BitSet(new long[]{0x0000000014200002L});
	public static final BitSet FOLLOW_csGeneratedInfo_def_in_controller_def432 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_controller_def434 = new BitSet(new long[]{0x0000000004200002L});
	public static final BitSet FOLLOW_cntrlCommand_def_in_controller_def446 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_controller_def448 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_14_in_csOperation_def479 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_csOperation_def481 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_csOperation_def482 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_csOperation_def484 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_INT_in_csOperation_def486 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_csOperation_def488 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_csGeneratedInfoForAggregator_def509 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_lc_id_in_csGeneratedInfoForAggregator_def511 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_csGeneratedInfoForAggregator_def513 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_csGeneratedInfoForAggregator_def516 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_csGeneratedInfo_def535 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_lc_id_in_csGeneratedInfo_def537 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_csGeneratedInfo_def539 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_csGeneratedInfo_def542 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_csConsumeInfo_def570 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_lc_id_in_csConsumeInfo_def572 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_csConsumeInfo_def575 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_csConsumeInfo_def578 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_csRequest_def609 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_lc_id_in_csRequest_def611 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_csRequest_def613 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_csRequest_def615 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_cntrlCommand_def642 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_cntrlCommand_def649 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_cntrlCommand_def651 = new BitSet(new long[]{0x0000000000000220L});
	public static final BitSet FOLLOW_cntrlParameter_def_in_cntrlCommand_def654 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_cntrlCommand_def658 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_cntrlCommand_def660 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_cntrlCommand_def663 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lc_id_in_cntrlParameter_def682 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_lc_id714 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveType_in_dataType728 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_primitiveType743 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_primitiveType749 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_primitiveType755 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_primitiveType764 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_primitiveType772 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_primitiveType778 = new BitSet(new long[]{0x0000000000000002L});
}
