// $ANTLR 3.5.1 S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g 2015-09-15 16:07:54

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
		"WS", "'('", "')'", "':'", "';'", "'AGG'", "'Boolean'", "'COMPUTE('", 
		"'Integer'", "'String'", "'boolean'", "'command'", "'computationalService'", 
		"'consume'", "'double'", "'from'", "'generate'", "'long'", "'partition-per'", 
		"'region-hops'", "'request'", "'softwarecomponents'", "'structs'", "'to'"
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
				if ( (LA1_0==29) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:29:6: 'structs' ':' struct_def
					{
					match(input,29,FOLLOW_29_in_archSpec90); 
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

			match(input,28,FOLLOW_28_in_archSpec104); 
			match(input,10,FOLLOW_10_in_archSpec106); 
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:30:31: ( component_def )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==19) ) {
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
			match(input,19,FOLLOW_19_in_component_def129); 
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
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:54:1: cs_def : ( agg_cs_def )* ( computatinal_def )+ ;
	public final void cs_def() throws RecognitionException {
		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:54:7: ( ( agg_cs_def )* ( computatinal_def )+ )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:56:5: ( agg_cs_def )* ( computatinal_def )+
			{
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:56:5: ( agg_cs_def )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==12) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:56:6: agg_cs_def
					{
					pushFollow(FOLLOW_agg_cs_def_in_cs_def222);
					agg_cs_def();
					state._fsp--;

					}
					break;

				default :
					break loop4;
				}
			}

			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:57:5: ( computatinal_def )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==CAPITALIZED_ID) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:57:6: computatinal_def
					{
					pushFollow(FOLLOW_computatinal_def_in_cs_def231);
					computatinal_def();
					state._fsp--;

					}
					break;

				default :
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
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
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:63:1: agg_cs_def : ( 'AGG' ':' ) CAPITALIZED_ID ( csConsumeInfo_def ';' )* ( csOperation_def ';' )* ( csGeneratedInfo_def ';' )* ( partition_def ';' )+ ;
	public final void agg_cs_def() throws RecognitionException {
		Token CAPITALIZED_ID4=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:63:11: ( ( 'AGG' ':' ) CAPITALIZED_ID ( csConsumeInfo_def ';' )* ( csOperation_def ';' )* ( csGeneratedInfo_def ';' )* ( partition_def ';' )+ )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:65:2: ( 'AGG' ':' ) CAPITALIZED_ID ( csConsumeInfo_def ';' )* ( csOperation_def ';' )* ( csGeneratedInfo_def ';' )* ( partition_def ';' )+
			{
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:65:2: ( 'AGG' ':' )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:65:3: 'AGG' ':'
			{
			match(input,12,FOLLOW_12_in_agg_cs_def252); 
			match(input,10,FOLLOW_10_in_agg_cs_def253); 
			}

			CAPITALIZED_ID4=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_agg_cs_def256); 
			 
			     context.currentComputationalService = new ComputationalServiceCompiler(); 
			     context.currentMappingConstraint.setSoftwareComponentName((CAPITALIZED_ID4!=null?CAPITALIZED_ID4.getText():null));
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:69:5: ( csConsumeInfo_def ';' )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==20) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:69:6: csConsumeInfo_def ';'
					{
					pushFollow(FOLLOW_csConsumeInfo_def_in_agg_cs_def270);
					csConsumeInfo_def();
					state._fsp--;

					match(input,11,FOLLOW_11_in_agg_cs_def272); 
					}
					break;

				default :
					break loop6;
				}
			}

			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:70:5: ( csOperation_def ';' )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==14) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:70:6: csOperation_def ';'
					{
					pushFollow(FOLLOW_csOperation_def_in_agg_cs_def282);
					csOperation_def();
					state._fsp--;

					match(input,11,FOLLOW_11_in_agg_cs_def284); 
					}
					break;

				default :
					break loop7;
				}
			}

			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:71:6: ( csGeneratedInfo_def ';' )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==23) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:71:7: csGeneratedInfo_def ';'
					{
					pushFollow(FOLLOW_csGeneratedInfo_def_in_agg_cs_def294);
					csGeneratedInfo_def();
					state._fsp--;

					match(input,11,FOLLOW_11_in_agg_cs_def296); 
					}
					break;

				default :
					break loop8;
				}
			}

			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:72:5: ( partition_def ';' )+
			int cnt9=0;
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==25) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:72:6: partition_def ';'
					{
					pushFollow(FOLLOW_partition_def_in_agg_cs_def305);
					partition_def();
					state._fsp--;

					match(input,11,FOLLOW_11_in_agg_cs_def307); 
					}
					break;

				default :
					if ( cnt9 >= 1 ) break loop9;
					EarlyExitException eee = new EarlyExitException(9, input);
					throw eee;
				}
				cnt9++;
			}

			  
			     context.currentComputationalService.setComputationalServiceName((CAPITALIZED_ID4!=null?CAPITALIZED_ID4.getText():null));
			     context.currentComputationalService.createCSObject();
			   context.currentComputationalService.generateAggregatorComputationalServiceCode(); 
			    context.currentMappingConstraint.setSoftwareComponentName((CAPITALIZED_ID4!=null?CAPITALIZED_ID4.getText():null));
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
	// $ANTLR end "agg_cs_def"



	// $ANTLR start "computatinal_def"
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:85:1: computatinal_def : CAPITALIZED_ID ( csConsumeInfo_def ';' )* ( csRequest_def ';' )* ( csGeneratedInfo_def ';' )* ( cntrlCommand_def ';' )* ( partition_def ';' )+ ;
	public final void computatinal_def() throws RecognitionException {
		Token CAPITALIZED_ID5=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:85:17: ( CAPITALIZED_ID ( csConsumeInfo_def ';' )* ( csRequest_def ';' )* ( csGeneratedInfo_def ';' )* ( cntrlCommand_def ';' )* ( partition_def ';' )+ )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:87:2: CAPITALIZED_ID ( csConsumeInfo_def ';' )* ( csRequest_def ';' )* ( csGeneratedInfo_def ';' )* ( cntrlCommand_def ';' )* ( partition_def ';' )+
			{
			CAPITALIZED_ID5=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_computatinal_def329); 
			 
			     context.currentComputationalService = new ComputationalServiceCompiler(); 
			     context.currentMappingConstraint.setSoftwareComponentName((CAPITALIZED_ID5!=null?CAPITALIZED_ID5.getText():null));
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:91:5: ( csConsumeInfo_def ';' )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==20) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:91:6: csConsumeInfo_def ';'
					{
					pushFollow(FOLLOW_csConsumeInfo_def_in_computatinal_def343);
					csConsumeInfo_def();
					state._fsp--;

					match(input,11,FOLLOW_11_in_computatinal_def345); 
					}
					break;

				default :
					break loop10;
				}
			}

			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:92:5: ( csRequest_def ';' )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==27) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:92:6: csRequest_def ';'
					{
					pushFollow(FOLLOW_csRequest_def_in_computatinal_def355);
					csRequest_def();
					state._fsp--;

					match(input,11,FOLLOW_11_in_computatinal_def358); 
					}
					break;

				default :
					break loop11;
				}
			}

			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:93:5: ( csGeneratedInfo_def ';' )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==23) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:93:6: csGeneratedInfo_def ';'
					{
					pushFollow(FOLLOW_csGeneratedInfo_def_in_computatinal_def367);
					csGeneratedInfo_def();
					state._fsp--;

					match(input,11,FOLLOW_11_in_computatinal_def369); 
					}
					break;

				default :
					break loop12;
				}
			}

			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:94:5: ( cntrlCommand_def ';' )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==18) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:94:6: cntrlCommand_def ';'
					{
					pushFollow(FOLLOW_cntrlCommand_def_in_computatinal_def378);
					cntrlCommand_def();
					state._fsp--;

					match(input,11,FOLLOW_11_in_computatinal_def380); 
					}
					break;

				default :
					break loop13;
				}
			}

			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:95:5: ( partition_def ';' )+
			int cnt14=0;
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==25) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:95:6: partition_def ';'
					{
					pushFollow(FOLLOW_partition_def_in_computatinal_def392);
					partition_def();
					state._fsp--;

					match(input,11,FOLLOW_11_in_computatinal_def394); 
					}
					break;

				default :
					if ( cnt14 >= 1 ) break loop14;
					EarlyExitException eee = new EarlyExitException(14, input);
					throw eee;
				}
				cnt14++;
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
	// $ANTLR end "computatinal_def"



	// $ANTLR start "csOperation_def"
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:106:1: csOperation_def : 'COMPUTE(' CAPITALIZED_ID ')' ;
	public final void csOperation_def() throws RecognitionException {
		Token CAPITALIZED_ID6=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:106:17: ( 'COMPUTE(' CAPITALIZED_ID ')' )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:107:5: 'COMPUTE(' CAPITALIZED_ID ')'
			{
			match(input,14,FOLLOW_14_in_csOperation_def419); 
			CAPITALIZED_ID6=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_csOperation_def421); 
			match(input,9,FOLLOW_9_in_csOperation_def422); 
			 context.currentComputationalService.addOperation((CAPITALIZED_ID6!=null?CAPITALIZED_ID6.getText():null));  
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



	// $ANTLR start "csGeneratedInfo_def"
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:111:1: csGeneratedInfo_def : 'generate' lc_id ':' CAPITALIZED_ID ;
	public final void csGeneratedInfo_def() throws RecognitionException {
		Token CAPITALIZED_ID8=null;
		ParserRuleReturnScope lc_id7 =null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:111:20: ( 'generate' lc_id ':' CAPITALIZED_ID )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:112:5: 'generate' lc_id ':' CAPITALIZED_ID
			{
			match(input,23,FOLLOW_23_in_csGeneratedInfo_def446); 
			pushFollow(FOLLOW_lc_id_in_csGeneratedInfo_def448);
			lc_id7=lc_id();
			state._fsp--;

			match(input,10,FOLLOW_10_in_csGeneratedInfo_def450); 
			CAPITALIZED_ID8=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_csGeneratedInfo_def453); 
			 context.currentComputationalService.addGeneratedInfo((lc_id7!=null?input.toString(lc_id7.start,lc_id7.stop):null), (CAPITALIZED_ID8!=null?CAPITALIZED_ID8.getText():null)); 
			    context.constructSymbTable((lc_id7!=null?input.toString(lc_id7.start,lc_id7.stop):null), (CAPITALIZED_ID8!=null?CAPITALIZED_ID8.getText():null)); 
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
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:117:1: csConsumeInfo_def : 'consume' lc_id 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID ;
	public final void csConsumeInfo_def() throws RecognitionException {
		ParserRuleReturnScope lc_id9 =null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:117:18: ( 'consume' lc_id 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:119:6: 'consume' lc_id 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID
			{
			match(input,20,FOLLOW_20_in_csConsumeInfo_def479); 
			pushFollow(FOLLOW_lc_id_in_csConsumeInfo_def481);
			lc_id9=lc_id();
			state._fsp--;

			match(input,22,FOLLOW_22_in_csConsumeInfo_def483); 
			match(input,26,FOLLOW_26_in_csConsumeInfo_def485); 
			match(input,10,FOLLOW_10_in_csConsumeInfo_def487); 
			match(input,INT,FOLLOW_INT_in_csConsumeInfo_def489); 
			match(input,10,FOLLOW_10_in_csConsumeInfo_def491); 
			match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_csConsumeInfo_def493); 
			 context.currentComputationalService.addConsumedInfo((lc_id9!=null?input.toString(lc_id9.start,lc_id9.stop):null));  
			    
			   
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
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:125:1: csRequest_def : 'request' lc_id ;
	public final void csRequest_def() throws RecognitionException {
		ParserRuleReturnScope lc_id10 =null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:125:15: ( 'request' lc_id )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:126:4: 'request' lc_id
			{
			match(input,27,FOLLOW_27_in_csRequest_def521); 
			pushFollow(FOLLOW_lc_id_in_csRequest_def523);
			lc_id10=lc_id();
			state._fsp--;

			 context.currentComputationalService.getDataAccessListFromSymblTable((lc_id10!=null?input.toString(lc_id10.start,lc_id10.stop):null));
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
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:131:1: cntrlCommand_def : 'command' name= CAPITALIZED_ID '(' ( cntrlParameter_def )? ')' 'to' 'region-hops' ':' INT ':' CAPITALIZED_ID ;
	public final void cntrlCommand_def() throws RecognitionException {
		Token name=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:131:18: ( 'command' name= CAPITALIZED_ID '(' ( cntrlParameter_def )? ')' 'to' 'region-hops' ':' INT ':' CAPITALIZED_ID )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:132:5: 'command' name= CAPITALIZED_ID '(' ( cntrlParameter_def )? ')' 'to' 'region-hops' ':' INT ':' CAPITALIZED_ID
			{
			match(input,18,FOLLOW_18_in_cntrlCommand_def545); 
			name=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_cntrlCommand_def552); 
			match(input,8,FOLLOW_8_in_cntrlCommand_def554); 
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:132:42: ( cntrlParameter_def )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==ID) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:132:43: cntrlParameter_def
					{
					pushFollow(FOLLOW_cntrlParameter_def_in_cntrlCommand_def557);
					cntrlParameter_def();
					state._fsp--;

					}
					break;

			}

			match(input,9,FOLLOW_9_in_cntrlCommand_def561); 
			match(input,30,FOLLOW_30_in_cntrlCommand_def563); 
			match(input,26,FOLLOW_26_in_cntrlCommand_def566); 
			match(input,10,FOLLOW_10_in_cntrlCommand_def568); 
			match(input,INT,FOLLOW_INT_in_cntrlCommand_def570); 
			match(input,10,FOLLOW_10_in_cntrlCommand_def572); 
			match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_cntrlCommand_def574); 
			 
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
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:139:1: cntrlParameter_def : lc_id ;
	public final void cntrlParameter_def() throws RecognitionException {
		ParserRuleReturnScope lc_id11 =null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:139:20: ( lc_id )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:140:5: lc_id
			{
			pushFollow(FOLLOW_lc_id_in_cntrlParameter_def598);
			lc_id11=lc_id();
			state._fsp--;

			 context.currentComputationalService.addParameter((lc_id11!=null?input.toString(lc_id11.start,lc_id11.stop):null)); 
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
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:149:1: partition_def : csDeploymentConstraint= 'partition-per' ':' CAPITALIZED_ID ;
	public final void partition_def() throws RecognitionException {
		Token csDeploymentConstraint=null;
		Token CAPITALIZED_ID12=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:149:14: (csDeploymentConstraint= 'partition-per' ':' CAPITALIZED_ID )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:150:5: csDeploymentConstraint= 'partition-per' ':' CAPITALIZED_ID
			{
			csDeploymentConstraint=(Token)match(input,25,FOLLOW_25_in_partition_def631); 
			match(input,10,FOLLOW_10_in_partition_def633); 
			CAPITALIZED_ID12=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_partition_def635); 
			 
			    context.currentComputationalService.addPartitionAttribute((CAPITALIZED_ID12!=null?CAPITALIZED_ID12.getText():null));   
			    // Next two lines are for  Mapping constraints
			    context.currentMappingConstraint.setAttributeName((csDeploymentConstraint!=null?csDeploymentConstraint.getText():null));  
			    context.currentMappingConstraint.setAttributeValue((CAPITALIZED_ID12!=null?CAPITALIZED_ID12.getText():null)); 
			   
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
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:159:1: lc_id : ID ;
	public final ArchSpecParser.lc_id_return lc_id() throws RecognitionException {
		ArchSpecParser.lc_id_return retval = new ArchSpecParser.lc_id_return();
		retval.start = input.LT(1);

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:159:6: ( ID )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:159:8: ID
			{
			match(input,ID,FOLLOW_ID_in_lc_id653); 
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
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:162:1: dataType : primitiveType ;
	public final ArchSpecParser.dataType_return dataType() throws RecognitionException {
		ArchSpecParser.dataType_return retval = new ArchSpecParser.dataType_return();
		retval.start = input.LT(1);

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:162:9: ( primitiveType )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:163:3: primitiveType
			{
			pushFollow(FOLLOW_primitiveType_in_dataType667);
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
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:166:1: primitiveType : (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' ) ;
	public final void primitiveType() throws RecognitionException {
		Token id=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:166:14: ( (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' ) )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:167:3: (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' )
			{
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:167:3: (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' )
			int alt16=6;
			switch ( input.LA(1) ) {
			case 15:
				{
				alt16=1;
				}
				break;
			case 13:
				{
				alt16=2;
				}
				break;
			case 16:
				{
				alt16=3;
				}
				break;
			case 21:
				{
				alt16=4;
				}
				break;
			case 24:
				{
				alt16=5;
				}
				break;
			case 17:
				{
				alt16=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}
			switch (alt16) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:167:4: id= 'Integer'
					{
					id=(Token)match(input,15,FOLLOW_15_in_primitiveType682); 
					}
					break;
				case 2 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:167:19: id= 'Boolean'
					{
					id=(Token)match(input,13,FOLLOW_13_in_primitiveType688); 
					}
					break;
				case 3 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:167:34: id= 'String'
					{
					id=(Token)match(input,16,FOLLOW_16_in_primitiveType694); 
					}
					break;
				case 4 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:167:49: id= 'double'
					{
					id=(Token)match(input,21,FOLLOW_21_in_primitiveType703); 
					}
					break;
				case 5 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:167:65: id= 'long'
					{
					id=(Token)match(input,24,FOLLOW_24_in_primitiveType711); 
					}
					break;
				case 6 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:167:79: id= 'boolean'
					{
					id=(Token)match(input,17,FOLLOW_17_in_primitiveType717); 
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



	public static final BitSet FOLLOW_29_in_archSpec90 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_archSpec92 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_struct_def_in_archSpec94 = new BitSet(new long[]{0x0000000030000000L});
	public static final BitSet FOLLOW_28_in_archSpec104 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_archSpec106 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_component_def_in_archSpec109 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_19_in_component_def129 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_component_def131 = new BitSet(new long[]{0x0000000000001010L});
	public static final BitSet FOLLOW_cs_def_in_component_def134 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_struct_def154 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_structField_def_in_struct_def168 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_struct_def170 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_lc_id_in_structField_def193 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_structField_def195 = new BitSet(new long[]{0x000000000123A000L});
	public static final BitSet FOLLOW_dataType_in_structField_def197 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_agg_cs_def_in_cs_def222 = new BitSet(new long[]{0x0000000000001010L});
	public static final BitSet FOLLOW_computatinal_def_in_cs_def231 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_12_in_agg_cs_def252 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_agg_cs_def253 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_agg_cs_def256 = new BitSet(new long[]{0x0000000002904000L});
	public static final BitSet FOLLOW_csConsumeInfo_def_in_agg_cs_def270 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_agg_cs_def272 = new BitSet(new long[]{0x0000000002904000L});
	public static final BitSet FOLLOW_csOperation_def_in_agg_cs_def282 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_agg_cs_def284 = new BitSet(new long[]{0x0000000002804000L});
	public static final BitSet FOLLOW_csGeneratedInfo_def_in_agg_cs_def294 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_agg_cs_def296 = new BitSet(new long[]{0x0000000002800000L});
	public static final BitSet FOLLOW_partition_def_in_agg_cs_def305 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_agg_cs_def307 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_computatinal_def329 = new BitSet(new long[]{0x000000000A940000L});
	public static final BitSet FOLLOW_csConsumeInfo_def_in_computatinal_def343 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_computatinal_def345 = new BitSet(new long[]{0x000000000A940000L});
	public static final BitSet FOLLOW_csRequest_def_in_computatinal_def355 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_computatinal_def358 = new BitSet(new long[]{0x000000000A840000L});
	public static final BitSet FOLLOW_csGeneratedInfo_def_in_computatinal_def367 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_computatinal_def369 = new BitSet(new long[]{0x0000000002840000L});
	public static final BitSet FOLLOW_cntrlCommand_def_in_computatinal_def378 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_computatinal_def380 = new BitSet(new long[]{0x0000000002040000L});
	public static final BitSet FOLLOW_partition_def_in_computatinal_def392 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_computatinal_def394 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_14_in_csOperation_def419 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_csOperation_def421 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_csOperation_def422 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_csGeneratedInfo_def446 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_lc_id_in_csGeneratedInfo_def448 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_csGeneratedInfo_def450 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_csGeneratedInfo_def453 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_csConsumeInfo_def479 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_lc_id_in_csConsumeInfo_def481 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_csConsumeInfo_def483 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_csConsumeInfo_def485 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_csConsumeInfo_def487 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_INT_in_csConsumeInfo_def489 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_csConsumeInfo_def491 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_csConsumeInfo_def493 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_csRequest_def521 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_lc_id_in_csRequest_def523 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_cntrlCommand_def545 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_cntrlCommand_def552 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_cntrlCommand_def554 = new BitSet(new long[]{0x0000000000000220L});
	public static final BitSet FOLLOW_cntrlParameter_def_in_cntrlCommand_def557 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_cntrlCommand_def561 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_cntrlCommand_def563 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_cntrlCommand_def566 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_cntrlCommand_def568 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_INT_in_cntrlCommand_def570 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_cntrlCommand_def572 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_cntrlCommand_def574 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lc_id_in_cntrlParameter_def598 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_partition_def631 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_partition_def633 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_partition_def635 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_lc_id653 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveType_in_dataType667 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_primitiveType682 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_primitiveType688 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_primitiveType694 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_primitiveType703 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_primitiveType711 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_primitiveType717 = new BitSet(new long[]{0x0000000000000002L});
}
