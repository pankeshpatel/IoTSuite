// $ANTLR 3.5.1 S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g 2015-08-27 19:18:14

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
		"WS", "'('", "')'", "':'", "';'", "'Boolean'", "'COMPUTE('", "'Integer'", 
		"'String'", "'boolean'", "'command'", "'computationalService'", "'consume'", 
		"'double'", "'from'", "'generate'", "'long'", "'partition-per'", "'region-hops'", 
		"'request'", "'softwarecomponents'", "'structs'", "'to'"
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
				if ( (LA1_0==28) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:29:6: 'structs' ':' struct_def
					{
					match(input,28,FOLLOW_28_in_archSpec90); 
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

			match(input,27,FOLLOW_27_in_archSpec104); 
			match(input,10,FOLLOW_10_in_archSpec106); 
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:30:31: ( component_def )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==18) ) {
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
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:33:1: component_def : 'computationalService' ':' ( cs_def )+ ;
	public final void component_def() throws RecognitionException {
		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:33:15: ( 'computationalService' ':' ( cs_def )+ )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:34:5: 'computationalService' ':' ( cs_def )+
			{
			match(input,18,FOLLOW_18_in_component_def129); 
			match(input,10,FOLLOW_10_in_component_def131); 
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:34:32: ( cs_def )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==CAPITALIZED_ID) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:34:33: cs_def
					{
					pushFollow(FOLLOW_cs_def_in_component_def134);
					cs_def();
					state._fsp--;

					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
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
			CAPITALIZED_ID1=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_struct_def155); 
			context.currentStruct = new StructCompiler((CAPITALIZED_ID1!=null?CAPITALIZED_ID1.getText():null));
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:42:5: ( structField_def ';' )+
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
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:42:6: structField_def ';'
					{
					pushFollow(FOLLOW_structField_def_in_struct_def169);
					structField_def();
					state._fsp--;

					match(input,11,FOLLOW_11_in_struct_def171); 
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
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:45:1: structField_def : lc_id ':' dataType ;
	public final void structField_def() throws RecognitionException {
		ParserRuleReturnScope lc_id2 =null;
		ParserRuleReturnScope dataType3 =null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:45:16: ( lc_id ':' dataType )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:46:3: lc_id ':' dataType
			{
			pushFollow(FOLLOW_lc_id_in_structField_def194);
			lc_id2=lc_id();
			state._fsp--;

			match(input,10,FOLLOW_10_in_structField_def196); 
			pushFollow(FOLLOW_dataType_in_structField_def198);
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
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:54:1: cs_def : CAPITALIZED_ID ( csConsumeInfo_def ';' )* ( csRequest_def ';' )* ( csOperation_def ';' )* ( csGeneratedInfo_def ';' )* ( cntrlCommand_def ';' )* ( partition_def ';' )+ ;
	public final void cs_def() throws RecognitionException {
		Token CAPITALIZED_ID4=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:54:7: ( CAPITALIZED_ID ( csConsumeInfo_def ';' )* ( csRequest_def ';' )* ( csOperation_def ';' )* ( csGeneratedInfo_def ';' )* ( cntrlCommand_def ';' )* ( partition_def ';' )+ )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:55:3: CAPITALIZED_ID ( csConsumeInfo_def ';' )* ( csRequest_def ';' )* ( csOperation_def ';' )* ( csGeneratedInfo_def ';' )* ( cntrlCommand_def ';' )* ( partition_def ';' )+
			{
			CAPITALIZED_ID4=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_cs_def219); 
			 
			     context.currentComputationalService = new ComputationalServiceCompiler(); 
			     context.currentMappingConstraint.setSoftwareComponentName((CAPITALIZED_ID4!=null?CAPITALIZED_ID4.getText():null));
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:59:5: ( csConsumeInfo_def ';' )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==19) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:59:6: csConsumeInfo_def ';'
					{
					pushFollow(FOLLOW_csConsumeInfo_def_in_cs_def233);
					csConsumeInfo_def();
					state._fsp--;

					match(input,11,FOLLOW_11_in_cs_def235); 
					}
					break;

				default :
					break loop5;
				}
			}

			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:60:5: ( csRequest_def ';' )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==26) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:60:6: csRequest_def ';'
					{
					pushFollow(FOLLOW_csRequest_def_in_cs_def245);
					csRequest_def();
					state._fsp--;

					match(input,11,FOLLOW_11_in_cs_def248); 
					}
					break;

				default :
					break loop6;
				}
			}

			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:61:4: ( csOperation_def ';' )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==13) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:61:5: csOperation_def ';'
					{
					pushFollow(FOLLOW_csOperation_def_in_cs_def256);
					csOperation_def();
					state._fsp--;

					match(input,11,FOLLOW_11_in_cs_def258); 
					}
					break;

				default :
					break loop7;
				}
			}

			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:62:6: ( csGeneratedInfo_def ';' )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==22) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:62:7: csGeneratedInfo_def ';'
					{
					pushFollow(FOLLOW_csGeneratedInfo_def_in_cs_def268);
					csGeneratedInfo_def();
					state._fsp--;

					match(input,11,FOLLOW_11_in_cs_def270); 
					}
					break;

				default :
					break loop8;
				}
			}

			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:63:5: ( cntrlCommand_def ';' )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==17) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:63:6: cntrlCommand_def ';'
					{
					pushFollow(FOLLOW_cntrlCommand_def_in_cs_def279);
					cntrlCommand_def();
					state._fsp--;

					match(input,11,FOLLOW_11_in_cs_def281); 
					}
					break;

				default :
					break loop9;
				}
			}

			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:64:5: ( partition_def ';' )+
			int cnt10=0;
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==24) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:64:6: partition_def ';'
					{
					pushFollow(FOLLOW_partition_def_in_cs_def293);
					partition_def();
					state._fsp--;

					match(input,11,FOLLOW_11_in_cs_def295); 
					}
					break;

				default :
					if ( cnt10 >= 1 ) break loop10;
					EarlyExitException eee = new EarlyExitException(10, input);
					throw eee;
				}
				cnt10++;
			}

			 
			     context.currentComputationalService.setComputationalServiceName((CAPITALIZED_ID4!=null?CAPITALIZED_ID4.getText():null));
			     context.currentComputationalService.createCSObject();
			    context.currentComputationalService.generateComputationalServiceCode(); 
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
	// $ANTLR end "cs_def"



	// $ANTLR start "csOperation_def"
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:75:1: csOperation_def : 'COMPUTE(' CAPITALIZED_ID ')' ;
	public final void csOperation_def() throws RecognitionException {
		Token CAPITALIZED_ID5=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:75:17: ( 'COMPUTE(' CAPITALIZED_ID ')' )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:76:5: 'COMPUTE(' CAPITALIZED_ID ')'
			{
			match(input,13,FOLLOW_13_in_csOperation_def320); 
			CAPITALIZED_ID5=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_csOperation_def322); 
			match(input,9,FOLLOW_9_in_csOperation_def323); 
			 context.currentComputationalService.addOperation((CAPITALIZED_ID5!=null?CAPITALIZED_ID5.getText():null));  
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
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:80:1: csGeneratedInfo_def : 'generate' lc_id ':' CAPITALIZED_ID ;
	public final void csGeneratedInfo_def() throws RecognitionException {
		Token CAPITALIZED_ID7=null;
		ParserRuleReturnScope lc_id6 =null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:80:20: ( 'generate' lc_id ':' CAPITALIZED_ID )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:81:5: 'generate' lc_id ':' CAPITALIZED_ID
			{
			match(input,22,FOLLOW_22_in_csGeneratedInfo_def347); 
			pushFollow(FOLLOW_lc_id_in_csGeneratedInfo_def349);
			lc_id6=lc_id();
			state._fsp--;

			match(input,10,FOLLOW_10_in_csGeneratedInfo_def351); 
			CAPITALIZED_ID7=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_csGeneratedInfo_def354); 
			 context.currentComputationalService.addGeneratedInfo((lc_id6!=null?input.toString(lc_id6.start,lc_id6.stop):null), (CAPITALIZED_ID7!=null?CAPITALIZED_ID7.getText():null)); 
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
	// $ANTLR end "csGeneratedInfo_def"



	// $ANTLR start "csConsumeInfo_def"
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:86:1: csConsumeInfo_def : 'consume' lc_id 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID ;
	public final void csConsumeInfo_def() throws RecognitionException {
		ParserRuleReturnScope lc_id8 =null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:86:18: ( 'consume' lc_id 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:88:6: 'consume' lc_id 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID
			{
			match(input,19,FOLLOW_19_in_csConsumeInfo_def380); 
			pushFollow(FOLLOW_lc_id_in_csConsumeInfo_def382);
			lc_id8=lc_id();
			state._fsp--;

			match(input,21,FOLLOW_21_in_csConsumeInfo_def384); 
			match(input,25,FOLLOW_25_in_csConsumeInfo_def386); 
			match(input,10,FOLLOW_10_in_csConsumeInfo_def388); 
			match(input,INT,FOLLOW_INT_in_csConsumeInfo_def390); 
			match(input,10,FOLLOW_10_in_csConsumeInfo_def392); 
			match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_csConsumeInfo_def394); 
			 context.currentComputationalService.addConsumedInfo((lc_id8!=null?input.toString(lc_id8.start,lc_id8.stop):null));  
			    
			   
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
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:94:1: csRequest_def : 'request' lc_id ;
	public final void csRequest_def() throws RecognitionException {
		ParserRuleReturnScope lc_id9 =null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:94:15: ( 'request' lc_id )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:95:4: 'request' lc_id
			{
			match(input,26,FOLLOW_26_in_csRequest_def422); 
			pushFollow(FOLLOW_lc_id_in_csRequest_def424);
			lc_id9=lc_id();
			state._fsp--;

			 context.currentComputationalService.getDataAccessListFromSymblTable((lc_id9!=null?input.toString(lc_id9.start,lc_id9.stop):null));
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
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:100:1: cntrlCommand_def : 'command' name= CAPITALIZED_ID '(' ( cntrlParameter_def )? ')' 'to' 'region-hops' ':' INT ':' CAPITALIZED_ID ;
	public final void cntrlCommand_def() throws RecognitionException {
		Token name=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:100:18: ( 'command' name= CAPITALIZED_ID '(' ( cntrlParameter_def )? ')' 'to' 'region-hops' ':' INT ':' CAPITALIZED_ID )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:101:5: 'command' name= CAPITALIZED_ID '(' ( cntrlParameter_def )? ')' 'to' 'region-hops' ':' INT ':' CAPITALIZED_ID
			{
			match(input,17,FOLLOW_17_in_cntrlCommand_def446); 
			name=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_cntrlCommand_def453); 
			match(input,8,FOLLOW_8_in_cntrlCommand_def455); 
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:101:42: ( cntrlParameter_def )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==ID) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:101:43: cntrlParameter_def
					{
					pushFollow(FOLLOW_cntrlParameter_def_in_cntrlCommand_def458);
					cntrlParameter_def();
					state._fsp--;

					}
					break;

			}

			match(input,9,FOLLOW_9_in_cntrlCommand_def462); 
			match(input,29,FOLLOW_29_in_cntrlCommand_def464); 
			match(input,25,FOLLOW_25_in_cntrlCommand_def467); 
			match(input,10,FOLLOW_10_in_cntrlCommand_def469); 
			match(input,INT,FOLLOW_INT_in_cntrlCommand_def471); 
			match(input,10,FOLLOW_10_in_cntrlCommand_def473); 
			match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_cntrlCommand_def475); 
			 
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
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:108:1: cntrlParameter_def : lc_id ;
	public final void cntrlParameter_def() throws RecognitionException {
		ParserRuleReturnScope lc_id10 =null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:108:20: ( lc_id )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:109:5: lc_id
			{
			pushFollow(FOLLOW_lc_id_in_cntrlParameter_def499);
			lc_id10=lc_id();
			state._fsp--;

			 context.currentComputationalService.addParameter((lc_id10!=null?input.toString(lc_id10.start,lc_id10.stop):null)); 
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
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:118:1: partition_def : csDeploymentConstraint= 'partition-per' ':' CAPITALIZED_ID ;
	public final void partition_def() throws RecognitionException {
		Token csDeploymentConstraint=null;
		Token CAPITALIZED_ID11=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:118:14: (csDeploymentConstraint= 'partition-per' ':' CAPITALIZED_ID )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:119:5: csDeploymentConstraint= 'partition-per' ':' CAPITALIZED_ID
			{
			csDeploymentConstraint=(Token)match(input,24,FOLLOW_24_in_partition_def532); 
			match(input,10,FOLLOW_10_in_partition_def534); 
			CAPITALIZED_ID11=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_partition_def536); 
			 
			    context.currentComputationalService.addPartitionAttribute((CAPITALIZED_ID11!=null?CAPITALIZED_ID11.getText():null));   
			    // Next two lines are for  Mapping constraints
			    context.currentMappingConstraint.setAttributeName((csDeploymentConstraint!=null?csDeploymentConstraint.getText():null));  
			    context.currentMappingConstraint.setAttributeValue((CAPITALIZED_ID11!=null?CAPITALIZED_ID11.getText():null)); 
			   
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
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:128:1: lc_id : ID ;
	public final ArchSpecParser.lc_id_return lc_id() throws RecognitionException {
		ArchSpecParser.lc_id_return retval = new ArchSpecParser.lc_id_return();
		retval.start = input.LT(1);

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:128:6: ( ID )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:128:8: ID
			{
			match(input,ID,FOLLOW_ID_in_lc_id554); 
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
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:131:1: dataType : primitiveType ;
	public final ArchSpecParser.dataType_return dataType() throws RecognitionException {
		ArchSpecParser.dataType_return retval = new ArchSpecParser.dataType_return();
		retval.start = input.LT(1);

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:131:9: ( primitiveType )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:132:3: primitiveType
			{
			pushFollow(FOLLOW_primitiveType_in_dataType568);
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
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:135:1: primitiveType : (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' ) ;
	public final void primitiveType() throws RecognitionException {
		Token id=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:135:14: ( (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' ) )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:136:3: (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' )
			{
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:136:3: (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' )
			int alt12=6;
			switch ( input.LA(1) ) {
			case 14:
				{
				alt12=1;
				}
				break;
			case 12:
				{
				alt12=2;
				}
				break;
			case 15:
				{
				alt12=3;
				}
				break;
			case 20:
				{
				alt12=4;
				}
				break;
			case 23:
				{
				alt12=5;
				}
				break;
			case 16:
				{
				alt12=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:136:4: id= 'Integer'
					{
					id=(Token)match(input,14,FOLLOW_14_in_primitiveType583); 
					}
					break;
				case 2 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:136:19: id= 'Boolean'
					{
					id=(Token)match(input,12,FOLLOW_12_in_primitiveType589); 
					}
					break;
				case 3 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:136:34: id= 'String'
					{
					id=(Token)match(input,15,FOLLOW_15_in_primitiveType595); 
					}
					break;
				case 4 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:136:49: id= 'double'
					{
					id=(Token)match(input,20,FOLLOW_20_in_primitiveType604); 
					}
					break;
				case 5 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:136:65: id= 'long'
					{
					id=(Token)match(input,23,FOLLOW_23_in_primitiveType612); 
					}
					break;
				case 6 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:136:79: id= 'boolean'
					{
					id=(Token)match(input,16,FOLLOW_16_in_primitiveType618); 
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



	public static final BitSet FOLLOW_28_in_archSpec90 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_archSpec92 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_struct_def_in_archSpec94 = new BitSet(new long[]{0x0000000018000000L});
	public static final BitSet FOLLOW_27_in_archSpec104 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_archSpec106 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_component_def_in_archSpec109 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_18_in_component_def129 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_component_def131 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_cs_def_in_component_def134 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_struct_def155 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_structField_def_in_struct_def169 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_struct_def171 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_lc_id_in_structField_def194 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_structField_def196 = new BitSet(new long[]{0x000000000091D000L});
	public static final BitSet FOLLOW_dataType_in_structField_def198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_cs_def219 = new BitSet(new long[]{0x00000000054A2000L});
	public static final BitSet FOLLOW_csConsumeInfo_def_in_cs_def233 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_cs_def235 = new BitSet(new long[]{0x00000000054A2000L});
	public static final BitSet FOLLOW_csRequest_def_in_cs_def245 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_cs_def248 = new BitSet(new long[]{0x0000000005422000L});
	public static final BitSet FOLLOW_csOperation_def_in_cs_def256 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_cs_def258 = new BitSet(new long[]{0x0000000001422000L});
	public static final BitSet FOLLOW_csGeneratedInfo_def_in_cs_def268 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_cs_def270 = new BitSet(new long[]{0x0000000001420000L});
	public static final BitSet FOLLOW_cntrlCommand_def_in_cs_def279 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_cs_def281 = new BitSet(new long[]{0x0000000001020000L});
	public static final BitSet FOLLOW_partition_def_in_cs_def293 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_cs_def295 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_13_in_csOperation_def320 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_csOperation_def322 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_csOperation_def323 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_csGeneratedInfo_def347 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_lc_id_in_csGeneratedInfo_def349 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_csGeneratedInfo_def351 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_csGeneratedInfo_def354 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_csConsumeInfo_def380 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_lc_id_in_csConsumeInfo_def382 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_csConsumeInfo_def384 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_csConsumeInfo_def386 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_csConsumeInfo_def388 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_INT_in_csConsumeInfo_def390 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_csConsumeInfo_def392 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_csConsumeInfo_def394 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_csRequest_def422 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_lc_id_in_csRequest_def424 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_cntrlCommand_def446 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_cntrlCommand_def453 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_cntrlCommand_def455 = new BitSet(new long[]{0x0000000000000220L});
	public static final BitSet FOLLOW_cntrlParameter_def_in_cntrlCommand_def458 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_cntrlCommand_def462 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_cntrlCommand_def464 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_cntrlCommand_def467 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_cntrlCommand_def469 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_INT_in_cntrlCommand_def471 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_cntrlCommand_def473 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_cntrlCommand_def475 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lc_id_in_cntrlParameter_def499 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_partition_def532 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_partition_def534 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_partition_def536 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_lc_id554 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveType_in_dataType568 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_primitiveType583 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_primitiveType589 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_primitiveType595 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_primitiveType604 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_primitiveType612 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_primitiveType618 = new BitSet(new long[]{0x0000000000000002L});
}
