// $ANTLR 3.5.1 S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g 2015-07-04 23:43:02

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
		"WS", "'('", "')'", "':'", "';'", "'Boolean'", "'Integer'", "'String'", 
		"'boolean'", "'command'", "'computationalService'", "'consume'", "'double'", 
		"'from'", "'generate'", "'long'", "'partition-per'", "'region-hops'", 
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
				if ( (LA1_0==27) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:29:6: 'structs' ':' struct_def
					{
					match(input,27,FOLLOW_27_in_archSpec90); 
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

			match(input,26,FOLLOW_26_in_archSpec104); 
			match(input,10,FOLLOW_10_in_archSpec106); 
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:30:31: ( component_def )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==17) ) {
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
			match(input,17,FOLLOW_17_in_component_def129); 
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
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:54:1: cs_def : CAPITALIZED_ID ( csGeneratedInfo_def ';' )* ( csConsumeInfo_def ';' )* ( csRequest_def ';' )* ( cntrlCommand_def ';' )* ( partition_def ';' )+ ;
	public final void cs_def() throws RecognitionException {
		Token CAPITALIZED_ID4=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:54:7: ( CAPITALIZED_ID ( csGeneratedInfo_def ';' )* ( csConsumeInfo_def ';' )* ( csRequest_def ';' )* ( cntrlCommand_def ';' )* ( partition_def ';' )+ )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:55:3: CAPITALIZED_ID ( csGeneratedInfo_def ';' )* ( csConsumeInfo_def ';' )* ( csRequest_def ';' )* ( cntrlCommand_def ';' )* ( partition_def ';' )+
			{
			CAPITALIZED_ID4=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_cs_def219); 
			 
			     context.currentComputationalService = new ComputationalServiceCompiler(); 
			     context.currentMappingConstraint.setSoftwareComponentName((CAPITALIZED_ID4!=null?CAPITALIZED_ID4.getText():null));
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:59:6: ( csGeneratedInfo_def ';' )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==21) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:59:7: csGeneratedInfo_def ';'
					{
					pushFollow(FOLLOW_csGeneratedInfo_def_in_cs_def233);
					csGeneratedInfo_def();
					state._fsp--;

					match(input,11,FOLLOW_11_in_cs_def235); 
					}
					break;

				default :
					break loop5;
				}
			}

			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:60:5: ( csConsumeInfo_def ';' )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==18) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:60:6: csConsumeInfo_def ';'
					{
					pushFollow(FOLLOW_csConsumeInfo_def_in_cs_def246);
					csConsumeInfo_def();
					state._fsp--;

					match(input,11,FOLLOW_11_in_cs_def248); 
					}
					break;

				default :
					break loop6;
				}
			}

			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:61:5: ( csRequest_def ';' )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==25) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:61:6: csRequest_def ';'
					{
					pushFollow(FOLLOW_csRequest_def_in_cs_def258);
					csRequest_def();
					state._fsp--;

					match(input,11,FOLLOW_11_in_cs_def261); 
					}
					break;

				default :
					break loop7;
				}
			}

			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:62:5: ( cntrlCommand_def ';' )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==16) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:62:6: cntrlCommand_def ';'
					{
					pushFollow(FOLLOW_cntrlCommand_def_in_cs_def270);
					cntrlCommand_def();
					state._fsp--;

					match(input,11,FOLLOW_11_in_cs_def272); 
					}
					break;

				default :
					break loop8;
				}
			}

			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:63:5: ( partition_def ';' )+
			int cnt9=0;
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==23) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:63:6: partition_def ';'
					{
					pushFollow(FOLLOW_partition_def_in_cs_def282);
					partition_def();
					state._fsp--;

					match(input,11,FOLLOW_11_in_cs_def284); 
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



	// $ANTLR start "csGeneratedInfo_def"
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:75:1: csGeneratedInfo_def : 'generate' lc_id ':' CAPITALIZED_ID ;
	public final void csGeneratedInfo_def() throws RecognitionException {
		Token CAPITALIZED_ID6=null;
		ParserRuleReturnScope lc_id5 =null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:75:20: ( 'generate' lc_id ':' CAPITALIZED_ID )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:76:5: 'generate' lc_id ':' CAPITALIZED_ID
			{
			match(input,21,FOLLOW_21_in_csGeneratedInfo_def309); 
			pushFollow(FOLLOW_lc_id_in_csGeneratedInfo_def311);
			lc_id5=lc_id();
			state._fsp--;

			match(input,10,FOLLOW_10_in_csGeneratedInfo_def313); 
			CAPITALIZED_ID6=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_csGeneratedInfo_def316); 
			 context.currentComputationalService.addGeneratedInfo((lc_id5!=null?input.toString(lc_id5.start,lc_id5.stop):null), (CAPITALIZED_ID6!=null?CAPITALIZED_ID6.getText():null)); 
			    context.constructSymbTable((lc_id5!=null?input.toString(lc_id5.start,lc_id5.stop):null), (CAPITALIZED_ID6!=null?CAPITALIZED_ID6.getText():null)); 
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
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:81:1: csConsumeInfo_def : 'consume' lc_id 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID ;
	public final void csConsumeInfo_def() throws RecognitionException {
		ParserRuleReturnScope lc_id7 =null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:81:18: ( 'consume' lc_id 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:83:6: 'consume' lc_id 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID
			{
			match(input,18,FOLLOW_18_in_csConsumeInfo_def342); 
			pushFollow(FOLLOW_lc_id_in_csConsumeInfo_def344);
			lc_id7=lc_id();
			state._fsp--;

			match(input,20,FOLLOW_20_in_csConsumeInfo_def346); 
			match(input,24,FOLLOW_24_in_csConsumeInfo_def348); 
			match(input,10,FOLLOW_10_in_csConsumeInfo_def350); 
			match(input,INT,FOLLOW_INT_in_csConsumeInfo_def352); 
			match(input,10,FOLLOW_10_in_csConsumeInfo_def354); 
			match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_csConsumeInfo_def356); 
			 context.currentComputationalService.addConsumedInfo((lc_id7!=null?input.toString(lc_id7.start,lc_id7.stop):null));  
			    
			   
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
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:89:1: csRequest_def : 'request' lc_id ;
	public final void csRequest_def() throws RecognitionException {
		ParserRuleReturnScope lc_id8 =null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:89:15: ( 'request' lc_id )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:90:4: 'request' lc_id
			{
			match(input,25,FOLLOW_25_in_csRequest_def384); 
			pushFollow(FOLLOW_lc_id_in_csRequest_def386);
			lc_id8=lc_id();
			state._fsp--;

			 context.currentComputationalService.getDataAccessListFromSymblTable((lc_id8!=null?input.toString(lc_id8.start,lc_id8.stop):null));
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
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:95:1: cntrlCommand_def : 'command' name= CAPITALIZED_ID '(' ( cntrlParameter_def )? ')' 'to' 'region-hops' ':' INT ':' CAPITALIZED_ID ;
	public final void cntrlCommand_def() throws RecognitionException {
		Token name=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:95:18: ( 'command' name= CAPITALIZED_ID '(' ( cntrlParameter_def )? ')' 'to' 'region-hops' ':' INT ':' CAPITALIZED_ID )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:96:5: 'command' name= CAPITALIZED_ID '(' ( cntrlParameter_def )? ')' 'to' 'region-hops' ':' INT ':' CAPITALIZED_ID
			{
			match(input,16,FOLLOW_16_in_cntrlCommand_def408); 
			name=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_cntrlCommand_def415); 
			match(input,8,FOLLOW_8_in_cntrlCommand_def417); 
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:96:42: ( cntrlParameter_def )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==ID) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:96:43: cntrlParameter_def
					{
					pushFollow(FOLLOW_cntrlParameter_def_in_cntrlCommand_def420);
					cntrlParameter_def();
					state._fsp--;

					}
					break;

			}

			match(input,9,FOLLOW_9_in_cntrlCommand_def424); 
			match(input,28,FOLLOW_28_in_cntrlCommand_def426); 
			match(input,24,FOLLOW_24_in_cntrlCommand_def429); 
			match(input,10,FOLLOW_10_in_cntrlCommand_def431); 
			match(input,INT,FOLLOW_INT_in_cntrlCommand_def433); 
			match(input,10,FOLLOW_10_in_cntrlCommand_def435); 
			match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_cntrlCommand_def437); 
			 
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
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:103:1: cntrlParameter_def : lc_id ;
	public final void cntrlParameter_def() throws RecognitionException {
		ParserRuleReturnScope lc_id9 =null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:103:20: ( lc_id )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:104:5: lc_id
			{
			pushFollow(FOLLOW_lc_id_in_cntrlParameter_def461);
			lc_id9=lc_id();
			state._fsp--;

			 context.currentComputationalService.addParameter((lc_id9!=null?input.toString(lc_id9.start,lc_id9.stop):null)); 
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
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:113:1: partition_def : csDeploymentConstraint= 'partition-per' ':' CAPITALIZED_ID ;
	public final void partition_def() throws RecognitionException {
		Token csDeploymentConstraint=null;
		Token CAPITALIZED_ID10=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:113:14: (csDeploymentConstraint= 'partition-per' ':' CAPITALIZED_ID )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:114:5: csDeploymentConstraint= 'partition-per' ':' CAPITALIZED_ID
			{
			csDeploymentConstraint=(Token)match(input,23,FOLLOW_23_in_partition_def494); 
			match(input,10,FOLLOW_10_in_partition_def496); 
			CAPITALIZED_ID10=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_partition_def498); 
			 
			    context.currentComputationalService.addPartitionAttribute((CAPITALIZED_ID10!=null?CAPITALIZED_ID10.getText():null));   
			    // Next two lines are for  Mapping constraints
			    context.currentMappingConstraint.setAttributeName((csDeploymentConstraint!=null?csDeploymentConstraint.getText():null));  
			    context.currentMappingConstraint.setAttributeValue((CAPITALIZED_ID10!=null?CAPITALIZED_ID10.getText():null)); 
			   
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
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:123:1: lc_id : ID ;
	public final ArchSpecParser.lc_id_return lc_id() throws RecognitionException {
		ArchSpecParser.lc_id_return retval = new ArchSpecParser.lc_id_return();
		retval.start = input.LT(1);

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:123:6: ( ID )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:123:8: ID
			{
			match(input,ID,FOLLOW_ID_in_lc_id516); 
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
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:126:1: dataType : primitiveType ;
	public final ArchSpecParser.dataType_return dataType() throws RecognitionException {
		ArchSpecParser.dataType_return retval = new ArchSpecParser.dataType_return();
		retval.start = input.LT(1);

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:126:9: ( primitiveType )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:127:3: primitiveType
			{
			pushFollow(FOLLOW_primitiveType_in_dataType530);
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
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:130:1: primitiveType : (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' ) ;
	public final void primitiveType() throws RecognitionException {
		Token id=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:130:14: ( (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' ) )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:131:3: (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' )
			{
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:131:3: (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' )
			int alt11=6;
			switch ( input.LA(1) ) {
			case 13:
				{
				alt11=1;
				}
				break;
			case 12:
				{
				alt11=2;
				}
				break;
			case 14:
				{
				alt11=3;
				}
				break;
			case 19:
				{
				alt11=4;
				}
				break;
			case 22:
				{
				alt11=5;
				}
				break;
			case 15:
				{
				alt11=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:131:4: id= 'Integer'
					{
					id=(Token)match(input,13,FOLLOW_13_in_primitiveType545); 
					}
					break;
				case 2 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:131:19: id= 'Boolean'
					{
					id=(Token)match(input,12,FOLLOW_12_in_primitiveType551); 
					}
					break;
				case 3 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:131:34: id= 'String'
					{
					id=(Token)match(input,14,FOLLOW_14_in_primitiveType557); 
					}
					break;
				case 4 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:131:49: id= 'double'
					{
					id=(Token)match(input,19,FOLLOW_19_in_primitiveType566); 
					}
					break;
				case 5 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:131:65: id= 'long'
					{
					id=(Token)match(input,22,FOLLOW_22_in_primitiveType574); 
					}
					break;
				case 6 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\ArchSpec.g:131:79: id= 'boolean'
					{
					id=(Token)match(input,15,FOLLOW_15_in_primitiveType580); 
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



	public static final BitSet FOLLOW_27_in_archSpec90 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_archSpec92 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_struct_def_in_archSpec94 = new BitSet(new long[]{0x000000000C000000L});
	public static final BitSet FOLLOW_26_in_archSpec104 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_archSpec106 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_component_def_in_archSpec109 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_17_in_component_def129 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_component_def131 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_cs_def_in_component_def134 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_struct_def155 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_structField_def_in_struct_def169 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_struct_def171 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_lc_id_in_structField_def194 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_structField_def196 = new BitSet(new long[]{0x000000000048F000L});
	public static final BitSet FOLLOW_dataType_in_structField_def198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_cs_def219 = new BitSet(new long[]{0x0000000002A50000L});
	public static final BitSet FOLLOW_csGeneratedInfo_def_in_cs_def233 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_cs_def235 = new BitSet(new long[]{0x0000000002A50000L});
	public static final BitSet FOLLOW_csConsumeInfo_def_in_cs_def246 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_cs_def248 = new BitSet(new long[]{0x0000000002850000L});
	public static final BitSet FOLLOW_csRequest_def_in_cs_def258 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_cs_def261 = new BitSet(new long[]{0x0000000002810000L});
	public static final BitSet FOLLOW_cntrlCommand_def_in_cs_def270 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_cs_def272 = new BitSet(new long[]{0x0000000000810000L});
	public static final BitSet FOLLOW_partition_def_in_cs_def282 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_cs_def284 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_21_in_csGeneratedInfo_def309 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_lc_id_in_csGeneratedInfo_def311 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_csGeneratedInfo_def313 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_csGeneratedInfo_def316 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_csConsumeInfo_def342 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_lc_id_in_csConsumeInfo_def344 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_csConsumeInfo_def346 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_csConsumeInfo_def348 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_csConsumeInfo_def350 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_INT_in_csConsumeInfo_def352 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_csConsumeInfo_def354 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_csConsumeInfo_def356 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_csRequest_def384 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_lc_id_in_csRequest_def386 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_cntrlCommand_def408 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_cntrlCommand_def415 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_cntrlCommand_def417 = new BitSet(new long[]{0x0000000000000220L});
	public static final BitSet FOLLOW_cntrlParameter_def_in_cntrlCommand_def420 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_cntrlCommand_def424 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_cntrlCommand_def426 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_cntrlCommand_def429 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_cntrlCommand_def431 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_INT_in_cntrlCommand_def433 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_cntrlCommand_def435 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_cntrlCommand_def437 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lc_id_in_cntrlParameter_def461 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_partition_def494 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_partition_def496 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_partition_def498 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_lc_id516 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveType_in_dataType530 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_primitiveType545 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_primitiveType551 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_primitiveType557 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_primitiveType566 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_primitiveType574 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_primitiveType580 = new BitSet(new long[]{0x0000000000000002L});
}
