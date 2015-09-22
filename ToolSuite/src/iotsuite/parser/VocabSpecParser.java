// $ANTLR 3.5.1 S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g 2015-09-22 11:15:13
 
package iotsuite.parser;
import iotsuite.compiler.*;  
import iotsuite.semanticmodel.*;   
      


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class VocabSpecParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CAPITALIZED_ID", "ID", "INT", 
		"WS", "'('", "')'", "','", "':'", "';'", "'Boolean'", "'Button'", "'Integer'", 
		"'String'", "'TextBox'", "'TextView'", "'_'", "'accessed-by'", "'action'", 
		"'actuators'", "'boolean'", "'command'", "'double'", "'eventdriven'", 
		"'for'", "'generate'", "'interactions'", "'long'", "'onCondition'", "'period'", 
		"'periodicsensors'", "'regions'", "'request'", "'resources'", "'sample'", 
		"'sensors'", "'storages'", "'structs'", "'with'"
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
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int CAPITALIZED_ID=4;
	public static final int ID=5;
	public static final int INT=6;
	public static final int WS=7;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public VocabSpecParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public VocabSpecParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return VocabSpecParser.tokenNames; }
	@Override public String getGrammarFileName() { return "S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g"; }


	  //Initialize the context
	  private SymbolTable context;



	// $ANTLR start "vocabSpec"
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:24:1: vocabSpec : 'regions' ':' ( region_def )+ 'structs' ':' ( struct_def )+ 'resources' ':' abilities_def ;
	public final void vocabSpec() throws RecognitionException {
		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:24:11: ( 'regions' ':' ( region_def )+ 'structs' ':' ( struct_def )+ 'resources' ':' abilities_def )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:25:5: 'regions' ':' ( region_def )+ 'structs' ':' ( struct_def )+ 'resources' ':' abilities_def
			{
			match(input,34,FOLLOW_34_in_vocabSpec67); 
			 context = new SymbolTable();
			    context.currentRegion = new RegionCompiler();
			    // context.currentMappingConstraint = new MappingConstraint(); 
			    
			match(input,11,FOLLOW_11_in_vocabSpec79); 
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:30:9: ( region_def )+
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
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:30:10: region_def
					{
					pushFollow(FOLLOW_region_def_in_vocabSpec82);
					region_def();
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

			 context.currentRegion.generateRegionCode(); 
			match(input,40,FOLLOW_40_in_vocabSpec103); 
			match(input,11,FOLLOW_11_in_vocabSpec105); 
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:32:19: ( struct_def )+
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
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:32:20: struct_def
					{
					pushFollow(FOLLOW_struct_def_in_vocabSpec108);
					struct_def();
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

			match(input,36,FOLLOW_36_in_vocabSpec122); 
			match(input,11,FOLLOW_11_in_vocabSpec124); 
			pushFollow(FOLLOW_abilities_def_in_vocabSpec126);
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
	// $ANTLR end "vocabSpec"



	// $ANTLR start "region_def"
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:40:1: region_def : CAPITALIZED_ID ':' dataType ';' ;
	public final void region_def() throws RecognitionException {
		Token CAPITALIZED_ID1=null;
		ParserRuleReturnScope dataType2 =null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:40:12: ( CAPITALIZED_ID ':' dataType ';' )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:42:6: CAPITALIZED_ID ':' dataType ';'
			{
			CAPITALIZED_ID1=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_region_def156); 
			match(input,11,FOLLOW_11_in_region_def158); 
			pushFollow(FOLLOW_dataType_in_region_def160);
			dataType2=dataType();
			state._fsp--;

			match(input,12,FOLLOW_12_in_region_def163); 
			 
			    context.currentRegion.addRegion((CAPITALIZED_ID1!=null?CAPITALIZED_ID1.getText():null), (dataType2!=null?input.toString(dataType2.start,dataType2.stop):null)); 
			    
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
	// $ANTLR end "region_def"



	// $ANTLR start "struct_def"
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:55:1: struct_def : CAPITALIZED_ID ( structField_def ';' )* ;
	public final void struct_def() throws RecognitionException {
		Token CAPITALIZED_ID3=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:55:11: ( CAPITALIZED_ID ( structField_def ';' )* )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:56:5: CAPITALIZED_ID ( structField_def ';' )*
			{
			CAPITALIZED_ID3=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_struct_def188); 
			context.currentStruct = new StructCompiler((CAPITALIZED_ID3!=null?CAPITALIZED_ID3.getText():null));
			    context.constructStructNameSymblTable((CAPITALIZED_ID3!=null?CAPITALIZED_ID3.getText():null));
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:59:5: ( structField_def ';' )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==ID) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:59:6: structField_def ';'
					{
					pushFollow(FOLLOW_structField_def_in_struct_def202);
					structField_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_struct_def204); 
					}
					break;

				default :
					break loop3;
				}
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
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:68:1: structField_def : lc_id ':' dataType ;
	public final void structField_def() throws RecognitionException {
		ParserRuleReturnScope lc_id4 =null;
		ParserRuleReturnScope dataType5 =null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:68:16: ( lc_id ':' dataType )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:69:3: lc_id ':' dataType
			{
			pushFollow(FOLLOW_lc_id_in_structField_def227);
			lc_id4=lc_id();
			state._fsp--;

			match(input,11,FOLLOW_11_in_structField_def229); 
			pushFollow(FOLLOW_dataType_in_structField_def231);
			dataType5=dataType();
			state._fsp--;

			 context.currentStruct.addField((lc_id4!=null?input.toString(lc_id4.start,lc_id4.stop):null), (dataType5!=null?input.toString(dataType5.start,dataType5.stop):null));
			   //context.constructStructureSymbTable((lc_id4!=null?input.toString(lc_id4.start,lc_id4.stop):null),(dataType5!=null?input.toString(dataType5.start,dataType5.stop):null));
			   //context.constructStructResponseTypeSymblTable((lc_id4!=null?input.toString(lc_id4.start,lc_id4.stop):null),(dataType5!=null?input.toString(dataType5.start,dataType5.stop):null));
			   context.constructStructFieldSymblTable((lc_id4!=null?input.toString(lc_id4.start,lc_id4.stop):null),(dataType5!=null?input.toString(dataType5.start,dataType5.stop):null));
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



	// $ANTLR start "abilities_def"
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:79:1: abilities_def : ( 'sensors' ':' sensor_def )+ ( 'actuators' ':' actuator_def )* ( 'storages' ':' ss_def )* ( 'interactions' ':' ( gui_def )+ )* ;
	public final void abilities_def() throws RecognitionException {
		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:79:15: ( ( 'sensors' ':' sensor_def )+ ( 'actuators' ':' actuator_def )* ( 'storages' ':' ss_def )* ( 'interactions' ':' ( gui_def )+ )* )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:81:3: ( 'sensors' ':' sensor_def )+ ( 'actuators' ':' actuator_def )* ( 'storages' ':' ss_def )* ( 'interactions' ':' ( gui_def )+ )*
			{
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:81:3: ( 'sensors' ':' sensor_def )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==38) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:81:4: 'sensors' ':' sensor_def
					{
					match(input,38,FOLLOW_38_in_abilities_def257); 
					match(input,11,FOLLOW_11_in_abilities_def259); 
					pushFollow(FOLLOW_sensor_def_in_abilities_def263);
					sensor_def();
					state._fsp--;

					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:83:4: ( 'actuators' ':' actuator_def )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==22) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:83:5: 'actuators' ':' actuator_def
					{
					match(input,22,FOLLOW_22_in_abilities_def273); 
					match(input,11,FOLLOW_11_in_abilities_def275); 
					pushFollow(FOLLOW_actuator_def_in_abilities_def277);
					actuator_def();
					state._fsp--;

					}
					break;

				default :
					break loop5;
				}
			}

			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:84:3: ( 'storages' ':' ss_def )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==39) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:84:4: 'storages' ':' ss_def
					{
					match(input,39,FOLLOW_39_in_abilities_def284); 
					match(input,11,FOLLOW_11_in_abilities_def287); 
					pushFollow(FOLLOW_ss_def_in_abilities_def289);
					ss_def();
					state._fsp--;

					}
					break;

				default :
					break loop6;
				}
			}

			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:85:3: ( 'interactions' ':' ( gui_def )+ )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==29) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:85:4: 'interactions' ':' ( gui_def )+
					{
					match(input,29,FOLLOW_29_in_abilities_def296); 
					match(input,11,FOLLOW_11_in_abilities_def298); 
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:85:23: ( gui_def )+
					int cnt7=0;
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( (LA7_0==CAPITALIZED_ID) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:85:24: gui_def
							{
							pushFollow(FOLLOW_gui_def_in_abilities_def301);
							gui_def();
							state._fsp--;

							}
							break;

						default :
							if ( cnt7 >= 1 ) break loop7;
							EarlyExitException eee = new EarlyExitException(7, input);
							throw eee;
						}
						cnt7++;
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
	// $ANTLR end "abilities_def"



	// $ANTLR start "sensor_def"
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:92:1: sensor_def : ( 'periodicsensors' ':' ( periodicsensor_def )* )* ( 'eventdriven' ':' ( eventsensor_def )* )* ;
	public final void sensor_def() throws RecognitionException {
		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:92:11: ( ( 'periodicsensors' ':' ( periodicsensor_def )* )* ( 'eventdriven' ':' ( eventsensor_def )* )* )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:94:7: ( 'periodicsensors' ':' ( periodicsensor_def )* )* ( 'eventdriven' ':' ( eventsensor_def )* )*
			{
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:94:7: ( 'periodicsensors' ':' ( periodicsensor_def )* )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==33) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:94:8: 'periodicsensors' ':' ( periodicsensor_def )*
					{
					match(input,33,FOLLOW_33_in_sensor_def336); 
					match(input,11,FOLLOW_11_in_sensor_def338); 
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:94:29: ( periodicsensor_def )*
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( (LA9_0==CAPITALIZED_ID) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:94:30: periodicsensor_def
							{
							pushFollow(FOLLOW_periodicsensor_def_in_sensor_def340);
							periodicsensor_def();
							state._fsp--;

							}
							break;

						default :
							break loop9;
						}
					}

					}
					break;

				default :
					break loop10;
				}
			}

			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:97:7: ( 'eventdriven' ':' ( eventsensor_def )* )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==26) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:97:8: 'eventdriven' ':' ( eventsensor_def )*
					{
					match(input,26,FOLLOW_26_in_sensor_def365); 
					match(input,11,FOLLOW_11_in_sensor_def367); 
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:97:26: ( eventsensor_def )*
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( (LA11_0==CAPITALIZED_ID) ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:97:27: eventsensor_def
							{
							pushFollow(FOLLOW_eventsensor_def_in_sensor_def370);
							eventsensor_def();
							state._fsp--;

							}
							break;

						default :
							break loop11;
						}
					}

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
	// $ANTLR end "sensor_def"



	// $ANTLR start "periodicsensor_def"
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:105:1: periodicsensor_def : CAPITALIZED_ID ( sensorMeasurementForPeriodic_def ';' )* ( sensorperiodicMeasurement_def ';' )* ;
	public final void periodicsensor_def() throws RecognitionException {
		Token CAPITALIZED_ID6=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:105:19: ( CAPITALIZED_ID ( sensorMeasurementForPeriodic_def ';' )* ( sensorperiodicMeasurement_def ';' )* )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:106:2: CAPITALIZED_ID ( sensorMeasurementForPeriodic_def ';' )* ( sensorperiodicMeasurement_def ';' )*
			{
			CAPITALIZED_ID6=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_periodicsensor_def389); 
			context.currentSensor = new SensorCompiler((CAPITALIZED_ID6!=null?CAPITALIZED_ID6.getText():null));
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:108:5: ( sensorMeasurementForPeriodic_def ';' )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==28) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:108:6: sensorMeasurementForPeriodic_def ';'
					{
					pushFollow(FOLLOW_sensorMeasurementForPeriodic_def_in_periodicsensor_def402);
					sensorMeasurementForPeriodic_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_periodicsensor_def404); 
					}
					break;

				default :
					break loop13;
				}
			}

			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:109:5: ( sensorperiodicMeasurement_def ';' )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==37) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:109:6: sensorperiodicMeasurement_def ';'
					{
					pushFollow(FOLLOW_sensorperiodicMeasurement_def_in_periodicsensor_def414);
					sensorperiodicMeasurement_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_periodicsensor_def416); 
					}
					break;

				default :
					break loop14;
				}
			}

			context.currentSensor.generatePeriodicSensorCode();        
			    
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
	// $ANTLR end "periodicsensor_def"



	// $ANTLR start "eventsensor_def"
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:114:1: eventsensor_def : CAPITALIZED_ID ( sensorMeasurementForEventDriven_def ';' )* ( sensoreventMeasurement_def ';' )* ;
	public final void eventsensor_def() throws RecognitionException {
		Token CAPITALIZED_ID7=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:114:16: ( CAPITALIZED_ID ( sensorMeasurementForEventDriven_def ';' )* ( sensoreventMeasurement_def ';' )* )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:115:2: CAPITALIZED_ID ( sensorMeasurementForEventDriven_def ';' )* ( sensoreventMeasurement_def ';' )*
			{
			CAPITALIZED_ID7=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_eventsensor_def433); 
			context.currentSensor = new SensorCompiler((CAPITALIZED_ID7!=null?CAPITALIZED_ID7.getText():null));
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:117:5: ( sensorMeasurementForEventDriven_def ';' )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==28) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:117:6: sensorMeasurementForEventDriven_def ';'
					{
					pushFollow(FOLLOW_sensorMeasurementForEventDriven_def_in_eventsensor_def446);
					sensorMeasurementForEventDriven_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_eventsensor_def448); 
					}
					break;

				default :
					break loop15;
				}
			}

			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:118:5: ( sensoreventMeasurement_def ';' )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==12||LA16_0==31) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:118:6: sensoreventMeasurement_def ';'
					{
					pushFollow(FOLLOW_sensoreventMeasurement_def_in_eventsensor_def458);
					sensoreventMeasurement_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_eventsensor_def460); 
					}
					break;

				default :
					break loop16;
				}
			}

			context.currentSensor.generateEventDrivenSensorCode();
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
	// $ANTLR end "eventsensor_def"



	// $ANTLR start "sensorMeasurementForEventDriven_def"
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:123:1: sensorMeasurementForEventDriven_def : 'generate' lc_id ':' CAPITALIZED_ID ;
	public final void sensorMeasurementForEventDriven_def() throws RecognitionException {
		Token CAPITALIZED_ID9=null;
		ParserRuleReturnScope lc_id8 =null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:123:36: ( 'generate' lc_id ':' CAPITALIZED_ID )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:124:1: 'generate' lc_id ':' CAPITALIZED_ID
			{
			match(input,28,FOLLOW_28_in_sensorMeasurementForEventDriven_def477); 
			pushFollow(FOLLOW_lc_id_in_sensorMeasurementForEventDriven_def479);
			lc_id8=lc_id();
			state._fsp--;

			match(input,11,FOLLOW_11_in_sensorMeasurementForEventDriven_def481); 
			CAPITALIZED_ID9=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_sensorMeasurementForEventDriven_def484); 

			      
			    context.currentSensor.addSensorMeasurement((lc_id8!=null?input.toString(lc_id8.start,lc_id8.stop):null), (CAPITALIZED_ID9!=null?CAPITALIZED_ID9.getText():null) , context.getStructSymblTable((CAPITALIZED_ID9!=null?CAPITALIZED_ID9.getText():null)) ); 
			    context.constructSymbTable((lc_id8!=null?input.toString(lc_id8.start,lc_id8.stop):null), (CAPITALIZED_ID9!=null?CAPITALIZED_ID9.getText():null));
			    context.constructEventDrivenSymblTable((CAPITALIZED_ID9!=null?CAPITALIZED_ID9.getText():null));
			    
			  
			      
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
	// $ANTLR end "sensorMeasurementForEventDriven_def"



	// $ANTLR start "sensorMeasurementForPeriodic_def"
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:136:1: sensorMeasurementForPeriodic_def : 'generate' lc_id ':' CAPITALIZED_ID ;
	public final void sensorMeasurementForPeriodic_def() throws RecognitionException {
		Token CAPITALIZED_ID11=null;
		ParserRuleReturnScope lc_id10 =null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:136:34: ( 'generate' lc_id ':' CAPITALIZED_ID )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:137:5: 'generate' lc_id ':' CAPITALIZED_ID
			{
			match(input,28,FOLLOW_28_in_sensorMeasurementForPeriodic_def511); 
			pushFollow(FOLLOW_lc_id_in_sensorMeasurementForPeriodic_def513);
			lc_id10=lc_id();
			state._fsp--;

			match(input,11,FOLLOW_11_in_sensorMeasurementForPeriodic_def515); 
			CAPITALIZED_ID11=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_sensorMeasurementForPeriodic_def518); 

			      
			    context.currentSensor.addSensorMeasurement((lc_id10!=null?input.toString(lc_id10.start,lc_id10.stop):null), (CAPITALIZED_ID11!=null?CAPITALIZED_ID11.getText():null) , context.getStructSymblTable((CAPITALIZED_ID11!=null?CAPITALIZED_ID11.getText():null)) ); 
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
	// $ANTLR end "sensorMeasurementForPeriodic_def"



	// $ANTLR start "sensorperiodicMeasurement_def"
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:148:1: sensorperiodicMeasurement_def : 'sample' 'period' ( sample_period_def )* 'for' ( sample_duration_def )* ;
	public final void sensorperiodicMeasurement_def() throws RecognitionException {
		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:148:30: ( 'sample' 'period' ( sample_period_def )* 'for' ( sample_duration_def )* )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:149:2: 'sample' 'period' ( sample_period_def )* 'for' ( sample_duration_def )*
			{
			match(input,37,FOLLOW_37_in_sensorperiodicMeasurement_def546); 
			match(input,32,FOLLOW_32_in_sensorperiodicMeasurement_def548); 
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:149:20: ( sample_period_def )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==INT) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:149:21: sample_period_def
					{
					pushFollow(FOLLOW_sample_period_def_in_sensorperiodicMeasurement_def551);
					sample_period_def();
					state._fsp--;

					}
					break;

				default :
					break loop17;
				}
			}

			match(input,27,FOLLOW_27_in_sensorperiodicMeasurement_def555); 
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:149:47: ( sample_duration_def )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==INT) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:149:48: sample_duration_def
					{
					pushFollow(FOLLOW_sample_duration_def_in_sensorperiodicMeasurement_def558);
					sample_duration_def();
					state._fsp--;

					}
					break;

				default :
					break loop18;
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
	// $ANTLR end "sensorperiodicMeasurement_def"



	// $ANTLR start "sample_period_def"
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:152:1: sample_period_def : INT ;
	public final void sample_period_def() throws RecognitionException {
		Token INT12=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:152:19: ( INT )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:153:3: INT
			{
			INT12=(Token)match(input,INT,FOLLOW_INT_in_sample_period_def573); 

			context.currentSensor.addSensorMeasurementSamplePeriod((INT12!=null?INT12.getText():null));

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
	// $ANTLR end "sample_period_def"



	// $ANTLR start "sample_duration_def"
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:160:1: sample_duration_def : INT ;
	public final void sample_duration_def() throws RecognitionException {
		Token INT13=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:160:21: ( INT )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:161:1: INT
			{
			INT13=(Token)match(input,INT,FOLLOW_INT_in_sample_duration_def587); 

			context.currentSensor.addSensorMeasurementSampleDuration((INT13!=null?INT13.getText():null));

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
	// $ANTLR end "sample_duration_def"



	// $ANTLR start "sensoreventMeasurement_def"
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:170:1: sensoreventMeasurement_def : ( 'onCondition' ( ID | ',' ID )* )* ;
	public final void sensoreventMeasurement_def() throws RecognitionException {
		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:170:27: ( ( 'onCondition' ( ID | ',' ID )* )* )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:172:2: ( 'onCondition' ( ID | ',' ID )* )*
			{
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:172:2: ( 'onCondition' ( ID | ',' ID )* )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==31) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:172:2: 'onCondition' ( ID | ',' ID )*
					{
					match(input,31,FOLLOW_31_in_sensoreventMeasurement_def606); 
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:172:16: ( ID | ',' ID )*
					loop19:
					while (true) {
						int alt19=3;
						int LA19_0 = input.LA(1);
						if ( (LA19_0==ID) ) {
							alt19=1;
						}
						else if ( (LA19_0==10) ) {
							alt19=2;
						}

						switch (alt19) {
						case 1 :
							// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:172:17: ID
							{
							match(input,ID,FOLLOW_ID_in_sensoreventMeasurement_def609); 
							}
							break;
						case 2 :
							// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:172:21: ',' ID
							{
							match(input,10,FOLLOW_10_in_sensoreventMeasurement_def612); 
							match(input,ID,FOLLOW_ID_in_sensoreventMeasurement_def614); 
							}
							break;

						default :
							break loop19;
						}
					}

					}
					break;

				default :
					break loop20;
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
	// $ANTLR end "sensoreventMeasurement_def"



	// $ANTLR start "actuator_def"
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:183:1: actuator_def : CAPITALIZED_ID ( action_def ';' )* ;
	public final void actuator_def() throws RecognitionException {
		Token CAPITALIZED_ID14=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:183:13: ( CAPITALIZED_ID ( action_def ';' )* )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:184:4: CAPITALIZED_ID ( action_def ';' )*
			{
			CAPITALIZED_ID14=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_actuator_def637); 
			context.currentActuator = new ActuatorCompiler((CAPITALIZED_ID14!=null?CAPITALIZED_ID14.getText():null));
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:186:4: ( action_def ';' )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==21) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:186:5: action_def ';'
					{
					pushFollow(FOLLOW_action_def_in_actuator_def649);
					action_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_actuator_def651); 
					}
					break;

				default :
					break loop21;
				}
			}

			context.currentActuator.generateActuatorCode();
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
	// $ANTLR end "actuator_def"



	// $ANTLR start "action_def"
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:191:1: action_def : 'action' CAPITALIZED_ID '(' ( parameter_def )? ')' ;
	public final void action_def() throws RecognitionException {
		Token CAPITALIZED_ID15=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:191:11: ( 'action' CAPITALIZED_ID '(' ( parameter_def )? ')' )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:192:5: 'action' CAPITALIZED_ID '(' ( parameter_def )? ')'
			{
			match(input,21,FOLLOW_21_in_action_def675); 
			CAPITALIZED_ID15=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_action_def677); 
			match(input,8,FOLLOW_8_in_action_def679); 
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:192:33: ( parameter_def )?
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==ID) ) {
				alt22=1;
			}
			switch (alt22) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:192:34: parameter_def
					{
					pushFollow(FOLLOW_parameter_def_in_action_def682);
					parameter_def();
					state._fsp--;

					}
					break;

			}

			match(input,9,FOLLOW_9_in_action_def686); 
			 context.currentActuator.addAction((CAPITALIZED_ID15!=null?CAPITALIZED_ID15.getText():null)); 
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
	// $ANTLR end "action_def"



	// $ANTLR start "parameter_def"
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:196:1: parameter_def : lc_id ':' CAPITALIZED_ID ( ',' parameter_def )? ;
	public final void parameter_def() throws RecognitionException {
		Token CAPITALIZED_ID16=null;
		ParserRuleReturnScope lc_id17 =null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:196:15: ( lc_id ':' CAPITALIZED_ID ( ',' parameter_def )? )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:197:5: lc_id ':' CAPITALIZED_ID ( ',' parameter_def )?
			{
			pushFollow(FOLLOW_lc_id_in_parameter_def706);
			lc_id17=lc_id();
			state._fsp--;

			match(input,11,FOLLOW_11_in_parameter_def708); 
			CAPITALIZED_ID16=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_parameter_def711); 
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:197:31: ( ',' parameter_def )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==10) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:197:32: ',' parameter_def
					{
					match(input,10,FOLLOW_10_in_parameter_def714); 
					pushFollow(FOLLOW_parameter_def_in_parameter_def716);
					parameter_def();
					state._fsp--;

					}
					break;

			}

			 
			     context.constructActuatorSymblTable((CAPITALIZED_ID16!=null?CAPITALIZED_ID16.getText():null));
			    
			    context.currentActuator.addParameter((lc_id17!=null?input.toString(lc_id17.start,lc_id17.stop):null), (CAPITALIZED_ID16!=null?CAPITALIZED_ID16.getText():null)); 
			    context.constructSymbTable((lc_id17!=null?input.toString(lc_id17.start,lc_id17.stop):null), (CAPITALIZED_ID16!=null?CAPITALIZED_ID16.getText():null));
			   
			    
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
	// $ANTLR end "parameter_def"



	// $ANTLR start "ss_def"
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:214:1: ss_def : CAPITALIZED_ID ( storageDataAccess_def ';' )* ;
	public final void ss_def() throws RecognitionException {
		Token CAPITALIZED_ID18=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:214:7: ( CAPITALIZED_ID ( storageDataAccess_def ';' )* )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:215:3: CAPITALIZED_ID ( storageDataAccess_def ';' )*
			{
			CAPITALIZED_ID18=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_ss_def743); 
			 context.currentStorageService = new StorageCompiler();
			      //context.currentStorageService = new Storage((CAPITALIZED_ID18!=null?CAPITALIZED_ID18.getText():null));
			      
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:220:5: ( storageDataAccess_def ';' )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==28) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:220:6: storageDataAccess_def ';'
					{
					pushFollow(FOLLOW_storageDataAccess_def_in_ss_def760);
					storageDataAccess_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_ss_def762); 
					}
					break;

				default :
					break loop24;
				}
			}


			     context.currentStorageService.setStorageServiceName((CAPITALIZED_ID18!=null?CAPITALIZED_ID18.getText():null));
			     context.currentStorageService.createStorageObject();
			     context.currentStorageService.generateStorageCode(); 
			    // context.currentMappingConstraint.setSoftwareComponentName((CAPITALIZED_ID18!=null?CAPITALIZED_ID18.getText():null));
			    // context.currentMappingConstraint.addDeployementConstraintObj(); // This line creates a  Symbol Table
			     
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
	// $ANTLR end "ss_def"



	// $ANTLR start "storageDataAccess_def"
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:233:1: storageDataAccess_def : storageGeneratedInfo_def 'accessed-by' storagedataIndex_def ;
	public final void storageDataAccess_def() throws RecognitionException {
		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:233:23: ( storageGeneratedInfo_def 'accessed-by' storagedataIndex_def )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:234:6: storageGeneratedInfo_def 'accessed-by' storagedataIndex_def
			{
			pushFollow(FOLLOW_storageGeneratedInfo_def_in_storageDataAccess_def793);
			storageGeneratedInfo_def();
			state._fsp--;

			match(input,20,FOLLOW_20_in_storageDataAccess_def796); 
			pushFollow(FOLLOW_storagedataIndex_def_in_storageDataAccess_def798);
			storagedataIndex_def();
			state._fsp--;

			 context.currentStorageService.addDataAccess(); 
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
	// $ANTLR end "storageDataAccess_def"



	// $ANTLR start "storageGeneratedInfo_def"
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:238:1: storageGeneratedInfo_def : 'generate' lc_id ':' CAPITALIZED_ID ;
	public final void storageGeneratedInfo_def() throws RecognitionException {
		Token CAPITALIZED_ID19=null;
		ParserRuleReturnScope lc_id20 =null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:238:26: ( 'generate' lc_id ':' CAPITALIZED_ID )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:239:5: 'generate' lc_id ':' CAPITALIZED_ID
			{
			match(input,28,FOLLOW_28_in_storageGeneratedInfo_def817); 
			pushFollow(FOLLOW_lc_id_in_storageGeneratedInfo_def819);
			lc_id20=lc_id();
			state._fsp--;

			match(input,11,FOLLOW_11_in_storageGeneratedInfo_def821); 
			CAPITALIZED_ID19=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_storageGeneratedInfo_def824); 

			     context.constructStorageSymblTable((CAPITALIZED_ID19!=null?CAPITALIZED_ID19.getText():null));
			     context.currentStorageService.addGeneratedInfo((lc_id20!=null?input.toString(lc_id20.start,lc_id20.stop):null), (CAPITALIZED_ID19!=null?CAPITALIZED_ID19.getText():null));  
			      context.constructSymbTable((lc_id20!=null?input.toString(lc_id20.start,lc_id20.stop):null), (CAPITALIZED_ID19!=null?CAPITALIZED_ID19.getText():null));
			    context.constructResponseTypeSymblTable((lc_id20!=null?input.toString(lc_id20.start,lc_id20.stop):null), (CAPITALIZED_ID19!=null?CAPITALIZED_ID19.getText():null));
			   
			    
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
	// $ANTLR end "storageGeneratedInfo_def"



	// $ANTLR start "storagedataIndex_def"
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:249:1: storagedataIndex_def : lc_id ':' dataType ;
	public final void storagedataIndex_def() throws RecognitionException {
		ParserRuleReturnScope lc_id21 =null;
		ParserRuleReturnScope dataType22 =null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:249:21: ( lc_id ':' dataType )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:250:9: lc_id ':' dataType
			{
			pushFollow(FOLLOW_lc_id_in_storagedataIndex_def846);
			lc_id21=lc_id();
			state._fsp--;

			match(input,11,FOLLOW_11_in_storagedataIndex_def848); 
			pushFollow(FOLLOW_dataType_in_storagedataIndex_def850);
			dataType22=dataType();
			state._fsp--;

			 context.currentStorageService.addDataAccessIndex((lc_id21!=null?input.toString(lc_id21.start,lc_id21.stop):null), (dataType22!=null?input.toString(dataType22.start,dataType22.stop):null)); 
			        context.constructStorageInfoSymblTable((lc_id21!=null?input.toString(lc_id21.start,lc_id21.stop):null), (dataType22!=null?input.toString(dataType22.start,dataType22.stop):null));
			        
			         
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
	// $ANTLR end "storagedataIndex_def"


	public static class lc_id_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "lc_id"
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:272:1: lc_id : ID ;
	public final VocabSpecParser.lc_id_return lc_id() throws RecognitionException {
		VocabSpecParser.lc_id_return retval = new VocabSpecParser.lc_id_return();
		retval.start = input.LT(1);

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:272:6: ( ID )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:272:8: ID
			{
			match(input,ID,FOLLOW_ID_in_lc_id878); 
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
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:275:1: dataType : primitiveType ;
	public final VocabSpecParser.dataType_return dataType() throws RecognitionException {
		VocabSpecParser.dataType_return retval = new VocabSpecParser.dataType_return();
		retval.start = input.LT(1);

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:275:9: ( primitiveType )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:276:3: primitiveType
			{
			pushFollow(FOLLOW_primitiveType_in_dataType891);
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
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:279:1: primitiveType : (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' |id= '_' ) ;
	public final void primitiveType() throws RecognitionException {
		Token id=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:279:14: ( (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' |id= '_' ) )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:280:3: (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' |id= '_' )
			{
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:280:3: (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' |id= '_' )
			int alt25=7;
			switch ( input.LA(1) ) {
			case 15:
				{
				alt25=1;
				}
				break;
			case 13:
				{
				alt25=2;
				}
				break;
			case 16:
				{
				alt25=3;
				}
				break;
			case 25:
				{
				alt25=4;
				}
				break;
			case 30:
				{
				alt25=5;
				}
				break;
			case 23:
				{
				alt25=6;
				}
				break;
			case 19:
				{
				alt25=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}
			switch (alt25) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:280:4: id= 'Integer'
					{
					id=(Token)match(input,15,FOLLOW_15_in_primitiveType906); 
					}
					break;
				case 2 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:280:19: id= 'Boolean'
					{
					id=(Token)match(input,13,FOLLOW_13_in_primitiveType912); 
					}
					break;
				case 3 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:280:34: id= 'String'
					{
					id=(Token)match(input,16,FOLLOW_16_in_primitiveType918); 
					}
					break;
				case 4 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:280:49: id= 'double'
					{
					id=(Token)match(input,25,FOLLOW_25_in_primitiveType927); 
					}
					break;
				case 5 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:280:65: id= 'long'
					{
					id=(Token)match(input,30,FOLLOW_30_in_primitiveType935); 
					}
					break;
				case 6 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:280:79: id= 'boolean'
					{
					id=(Token)match(input,23,FOLLOW_23_in_primitiveType941); 
					}
					break;
				case 7 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:280:92: id= '_'
					{
					id=(Token)match(input,19,FOLLOW_19_in_primitiveType946); 
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
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:302:1: gui_def : CAPITALIZED_ID ( gui_command_def ';' )* ( gui_request_def ';' )* ;
	public final void gui_def() throws RecognitionException {
		Token CAPITALIZED_ID23=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:302:8: ( CAPITALIZED_ID ( gui_command_def ';' )* ( gui_request_def ';' )* )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:303:3: CAPITALIZED_ID ( gui_command_def ';' )* ( gui_request_def ';' )*
			{
			context.currentGUI = new UserInterfaceCompiler();
			CAPITALIZED_ID23=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_gui_def1079); 
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:307:4: ( gui_command_def ';' )*
			loop26:
			while (true) {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( (LA26_0==24) ) {
					alt26=1;
				}

				switch (alt26) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:307:5: gui_command_def ';'
					{
					pushFollow(FOLLOW_gui_command_def_in_gui_def1105);
					gui_command_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_gui_def1107); 
					}
					break;

				default :
					break loop26;
				}
			}

			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:308:4: ( gui_request_def ';' )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==35) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:308:5: gui_request_def ';'
					{
					pushFollow(FOLLOW_gui_request_def_in_gui_def1118);
					gui_request_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_gui_def1121); 
					}
					break;

				default :
					break loop27;
				}
			}

			context.currentGUI.setGUIName((CAPITALIZED_ID23!=null?CAPITALIZED_ID23.getText():null)); 
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
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:314:1: gui_command_def : 'command' name= CAPITALIZED_ID '(' ( gui_command_parameter_def )? ')' ;
	public final void gui_command_def() throws RecognitionException {
		Token name=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:314:17: ( 'command' name= CAPITALIZED_ID '(' ( gui_command_parameter_def )? ')' )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:315:5: 'command' name= CAPITALIZED_ID '(' ( gui_command_parameter_def )? ')'
			{
			match(input,24,FOLLOW_24_in_gui_command_def1147); 
			name=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_gui_command_def1154); 
			match(input,8,FOLLOW_8_in_gui_command_def1156); 
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:315:42: ( gui_command_parameter_def )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==ID) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:315:43: gui_command_parameter_def
					{
					pushFollow(FOLLOW_gui_command_parameter_def_in_gui_command_def1159);
					gui_command_parameter_def();
					state._fsp--;

					}
					break;

			}

			match(input,9,FOLLOW_9_in_gui_command_def1163); 
			 
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
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:322:1: gui_command_parameter_def : lc_id ( ',' gui_command_parameter_def )? ;
	public final void gui_command_parameter_def() throws RecognitionException {
		ParserRuleReturnScope lc_id24 =null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:322:27: ( lc_id ( ',' gui_command_parameter_def )? )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:323:5: lc_id ( ',' gui_command_parameter_def )?
			{
			pushFollow(FOLLOW_lc_id_in_gui_command_parameter_def1186);
			lc_id24=lc_id();
			state._fsp--;

			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:323:11: ( ',' gui_command_parameter_def )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==10) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:323:12: ',' gui_command_parameter_def
					{
					match(input,10,FOLLOW_10_in_gui_command_parameter_def1189); 
					pushFollow(FOLLOW_gui_command_parameter_def_in_gui_command_parameter_def1191);
					gui_command_parameter_def();
					state._fsp--;

					}
					break;

			}

			 
			    context.currentGUI.addCommandParameter((lc_id24!=null?input.toString(lc_id24.start,lc_id24.stop):null)); 
			    
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
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:332:1: gui_action_def : 'action' name= CAPITALIZED_ID '(' ( gui_action_parameter_def )? ')' 'with' ui= lc_id ;
	public final void gui_action_def() throws RecognitionException {
		Token name=null;
		ParserRuleReturnScope ui =null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:332:15: ( 'action' name= CAPITALIZED_ID '(' ( gui_action_parameter_def )? ')' 'with' ui= lc_id )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:333:5: 'action' name= CAPITALIZED_ID '(' ( gui_action_parameter_def )? ')' 'with' ui= lc_id
			{
			match(input,21,FOLLOW_21_in_gui_action_def1215); 
			name=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_gui_action_def1221); 
			match(input,8,FOLLOW_8_in_gui_action_def1223); 
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:333:40: ( gui_action_parameter_def )?
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==ID) ) {
				alt30=1;
			}
			switch (alt30) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:333:41: gui_action_parameter_def
					{
					pushFollow(FOLLOW_gui_action_parameter_def_in_gui_action_def1226);
					gui_action_parameter_def();
					state._fsp--;

					}
					break;

			}

			match(input,9,FOLLOW_9_in_gui_action_def1230); 
			match(input,41,FOLLOW_41_in_gui_action_def1232); 
			pushFollow(FOLLOW_lc_id_in_gui_action_def1238);
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
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:343:1: gui_action_parameter_def : lc_id ':' CAPITALIZED_ID ( ',' gui_action_parameter_def )? ;
	public final void gui_action_parameter_def() throws RecognitionException {
		Token CAPITALIZED_ID26=null;
		ParserRuleReturnScope lc_id25 =null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:343:26: ( lc_id ':' CAPITALIZED_ID ( ',' gui_action_parameter_def )? )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:344:5: lc_id ':' CAPITALIZED_ID ( ',' gui_action_parameter_def )?
			{
			pushFollow(FOLLOW_lc_id_in_gui_action_parameter_def1264);
			lc_id25=lc_id();
			state._fsp--;

			match(input,11,FOLLOW_11_in_gui_action_parameter_def1266); 
			CAPITALIZED_ID26=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_gui_action_parameter_def1269); 
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:344:31: ( ',' gui_action_parameter_def )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==10) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:344:32: ',' gui_action_parameter_def
					{
					match(input,10,FOLLOW_10_in_gui_action_parameter_def1272); 
					pushFollow(FOLLOW_gui_action_parameter_def_in_gui_action_parameter_def1274);
					gui_action_parameter_def();
					state._fsp--;

					}
					break;

			}

			 
			    context.currentGUI.addActionParameter((lc_id25!=null?input.toString(lc_id25.start,lc_id25.stop):null), (CAPITALIZED_ID26!=null?CAPITALIZED_ID26.getText():null)); 
			    context.constructSymbTable((lc_id25!=null?input.toString(lc_id25.start,lc_id25.stop):null), (CAPITALIZED_ID26!=null?CAPITALIZED_ID26.getText():null));
			    
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
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:351:1: gui_request_def : 'request' lc_id ;
	public final void gui_request_def() throws RecognitionException {
		ParserRuleReturnScope lc_id27 =null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:351:17: ( 'request' lc_id )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:352:4: 'request' lc_id
			{
			match(input,35,FOLLOW_35_in_gui_request_def1296); 
			pushFollow(FOLLOW_lc_id_in_gui_request_def1298);
			lc_id27=lc_id();
			state._fsp--;

			 context.currentGUI.getDataAccessListFromSymblTable((lc_id27!=null?input.toString(lc_id27.start,lc_id27.stop):null));
			     context.currentGUI.setRequestType(context.getResponseTypeSymblTable((lc_id27!=null?input.toString(lc_id27.start,lc_id27.stop):null)));
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
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:387:1: bt_id : ID ;
	public final void bt_id() throws RecognitionException {
		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:387:7: ( ID )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:387:10: ID
			{
			match(input,ID,FOLLOW_ID_in_bt_id1344); 
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
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:389:1: txtbx_id : ID ;
	public final void txtbx_id() throws RecognitionException {
		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:389:10: ( ID )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:389:13: ID
			{
			match(input,ID,FOLLOW_ID_in_txtbx_id1354); 
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
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:391:1: txtview_id : ID ;
	public final void txtview_id() throws RecognitionException {
		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:391:12: ( ID )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:391:15: ID
			{
			match(input,ID,FOLLOW_ID_in_txtview_id1364); 
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
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:409:1: widget_def : ( 'TextView' textview_def ';' )* ( 'Button' button_def ';' )* ( 'TextBox' textbox_def ';' )* ;
	public final void widget_def() throws RecognitionException {
		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:409:12: ( ( 'TextView' textview_def ';' )* ( 'Button' button_def ';' )* ( 'TextBox' textbox_def ';' )* )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:410:5: ( 'TextView' textview_def ';' )* ( 'Button' button_def ';' )* ( 'TextBox' textbox_def ';' )*
			{
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:410:5: ( 'TextView' textview_def ';' )*
			loop32:
			while (true) {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==18) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:410:6: 'TextView' textview_def ';'
					{
					match(input,18,FOLLOW_18_in_widget_def1396); 
					pushFollow(FOLLOW_textview_def_in_widget_def1398);
					textview_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_widget_def1400); 
					}
					break;

				default :
					break loop32;
				}
			}

			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:411:5: ( 'Button' button_def ';' )*
			loop33:
			while (true) {
				int alt33=2;
				int LA33_0 = input.LA(1);
				if ( (LA33_0==14) ) {
					alt33=1;
				}

				switch (alt33) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:411:6: 'Button' button_def ';'
					{
					match(input,14,FOLLOW_14_in_widget_def1409); 
					pushFollow(FOLLOW_button_def_in_widget_def1412);
					button_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_widget_def1414); 
					}
					break;

				default :
					break loop33;
				}
			}

			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:412:5: ( 'TextBox' textbox_def ';' )*
			loop34:
			while (true) {
				int alt34=2;
				int LA34_0 = input.LA(1);
				if ( (LA34_0==17) ) {
					alt34=1;
				}

				switch (alt34) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:412:6: 'TextBox' textbox_def ';'
					{
					match(input,17,FOLLOW_17_in_widget_def1423); 
					pushFollow(FOLLOW_textbox_def_in_widget_def1425);
					textbox_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_widget_def1427); 
					}
					break;

				default :
					break loop34;
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
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:419:1: textview_def : lc_id ( ',' textview_def )? ;
	public final void textview_def() throws RecognitionException {
		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:419:14: ( lc_id ( ',' textview_def )? )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:420:5: lc_id ( ',' textview_def )?
			{
			pushFollow(FOLLOW_lc_id_in_textview_def1452);
			lc_id();
			state._fsp--;

			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:420:12: ( ',' textview_def )?
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==10) ) {
				alt35=1;
			}
			switch (alt35) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:420:13: ',' textview_def
					{
					match(input,10,FOLLOW_10_in_textview_def1456); 
					pushFollow(FOLLOW_textview_def_in_textview_def1458);
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
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:423:1: button_def : lc_id ( ',' button_def )? ;
	public final void button_def() throws RecognitionException {
		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:423:12: ( lc_id ( ',' button_def )? )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:424:5: lc_id ( ',' button_def )?
			{
			pushFollow(FOLLOW_lc_id_in_button_def1473);
			lc_id();
			state._fsp--;

			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:424:12: ( ',' button_def )?
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==10) ) {
				alt36=1;
			}
			switch (alt36) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:424:13: ',' button_def
					{
					match(input,10,FOLLOW_10_in_button_def1477); 
					pushFollow(FOLLOW_button_def_in_button_def1479);
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
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:427:1: textbox_def : lc_id ( ',' textbox_def )? ;
	public final void textbox_def() throws RecognitionException {
		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:427:13: ( lc_id ( ',' textbox_def )? )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:428:5: lc_id ( ',' textbox_def )?
			{
			pushFollow(FOLLOW_lc_id_in_textbox_def1495);
			lc_id();
			state._fsp--;

			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:428:11: ( ',' textbox_def )?
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==10) ) {
				alt37=1;
			}
			switch (alt37) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:428:12: ',' textbox_def
					{
					match(input,10,FOLLOW_10_in_textbox_def1498); 
					pushFollow(FOLLOW_textbox_def_in_textbox_def1500);
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



	public static final BitSet FOLLOW_34_in_vocabSpec67 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_vocabSpec79 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_region_def_in_vocabSpec82 = new BitSet(new long[]{0x0000010000000010L});
	public static final BitSet FOLLOW_40_in_vocabSpec103 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_vocabSpec105 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_struct_def_in_vocabSpec108 = new BitSet(new long[]{0x0000001000000010L});
	public static final BitSet FOLLOW_36_in_vocabSpec122 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_vocabSpec124 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_abilities_def_in_vocabSpec126 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_region_def156 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_region_def158 = new BitSet(new long[]{0x000000004289A000L});
	public static final BitSet FOLLOW_dataType_in_region_def160 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_region_def163 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_struct_def188 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_structField_def_in_struct_def202 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_struct_def204 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_lc_id_in_structField_def227 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_structField_def229 = new BitSet(new long[]{0x000000004289A000L});
	public static final BitSet FOLLOW_dataType_in_structField_def231 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_abilities_def257 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_abilities_def259 = new BitSet(new long[]{0x000000C224400000L});
	public static final BitSet FOLLOW_sensor_def_in_abilities_def263 = new BitSet(new long[]{0x000000C020400002L});
	public static final BitSet FOLLOW_22_in_abilities_def273 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_abilities_def275 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_actuator_def_in_abilities_def277 = new BitSet(new long[]{0x0000008020400002L});
	public static final BitSet FOLLOW_39_in_abilities_def284 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_abilities_def287 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ss_def_in_abilities_def289 = new BitSet(new long[]{0x0000008020000002L});
	public static final BitSet FOLLOW_29_in_abilities_def296 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_abilities_def298 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_gui_def_in_abilities_def301 = new BitSet(new long[]{0x0000000020000012L});
	public static final BitSet FOLLOW_33_in_sensor_def336 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_sensor_def338 = new BitSet(new long[]{0x0000000204000012L});
	public static final BitSet FOLLOW_periodicsensor_def_in_sensor_def340 = new BitSet(new long[]{0x0000000204000012L});
	public static final BitSet FOLLOW_26_in_sensor_def365 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_sensor_def367 = new BitSet(new long[]{0x0000000004000012L});
	public static final BitSet FOLLOW_eventsensor_def_in_sensor_def370 = new BitSet(new long[]{0x0000000004000012L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_periodicsensor_def389 = new BitSet(new long[]{0x0000002010000002L});
	public static final BitSet FOLLOW_sensorMeasurementForPeriodic_def_in_periodicsensor_def402 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_periodicsensor_def404 = new BitSet(new long[]{0x0000002010000002L});
	public static final BitSet FOLLOW_sensorperiodicMeasurement_def_in_periodicsensor_def414 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_periodicsensor_def416 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_eventsensor_def433 = new BitSet(new long[]{0x0000000090001002L});
	public static final BitSet FOLLOW_sensorMeasurementForEventDriven_def_in_eventsensor_def446 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_eventsensor_def448 = new BitSet(new long[]{0x0000000090001002L});
	public static final BitSet FOLLOW_sensoreventMeasurement_def_in_eventsensor_def458 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_eventsensor_def460 = new BitSet(new long[]{0x0000000080001002L});
	public static final BitSet FOLLOW_28_in_sensorMeasurementForEventDriven_def477 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_lc_id_in_sensorMeasurementForEventDriven_def479 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_sensorMeasurementForEventDriven_def481 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_sensorMeasurementForEventDriven_def484 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_sensorMeasurementForPeriodic_def511 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_lc_id_in_sensorMeasurementForPeriodic_def513 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_sensorMeasurementForPeriodic_def515 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_sensorMeasurementForPeriodic_def518 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_sensorperiodicMeasurement_def546 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_sensorperiodicMeasurement_def548 = new BitSet(new long[]{0x0000000008000040L});
	public static final BitSet FOLLOW_sample_period_def_in_sensorperiodicMeasurement_def551 = new BitSet(new long[]{0x0000000008000040L});
	public static final BitSet FOLLOW_27_in_sensorperiodicMeasurement_def555 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_sample_duration_def_in_sensorperiodicMeasurement_def558 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_INT_in_sample_period_def573 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_sample_duration_def587 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_sensoreventMeasurement_def606 = new BitSet(new long[]{0x0000000080000422L});
	public static final BitSet FOLLOW_ID_in_sensoreventMeasurement_def609 = new BitSet(new long[]{0x0000000080000422L});
	public static final BitSet FOLLOW_10_in_sensoreventMeasurement_def612 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_sensoreventMeasurement_def614 = new BitSet(new long[]{0x0000000080000422L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_actuator_def637 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_action_def_in_actuator_def649 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_actuator_def651 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_21_in_action_def675 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_action_def677 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_action_def679 = new BitSet(new long[]{0x0000000000000220L});
	public static final BitSet FOLLOW_parameter_def_in_action_def682 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_action_def686 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lc_id_in_parameter_def706 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_parameter_def708 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_parameter_def711 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_10_in_parameter_def714 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_parameter_def_in_parameter_def716 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_ss_def743 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_storageDataAccess_def_in_ss_def760 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_ss_def762 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_storageGeneratedInfo_def_in_storageDataAccess_def793 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_storageDataAccess_def796 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_storagedataIndex_def_in_storageDataAccess_def798 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_storageGeneratedInfo_def817 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_lc_id_in_storageGeneratedInfo_def819 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_storageGeneratedInfo_def821 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_storageGeneratedInfo_def824 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lc_id_in_storagedataIndex_def846 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_storagedataIndex_def848 = new BitSet(new long[]{0x000000004289A000L});
	public static final BitSet FOLLOW_dataType_in_storagedataIndex_def850 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_lc_id878 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveType_in_dataType891 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_primitiveType906 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_primitiveType912 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_primitiveType918 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_primitiveType927 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_primitiveType935 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_primitiveType941 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_primitiveType946 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_def1079 = new BitSet(new long[]{0x0000000801000002L});
	public static final BitSet FOLLOW_gui_command_def_in_gui_def1105 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_gui_def1107 = new BitSet(new long[]{0x0000000801000002L});
	public static final BitSet FOLLOW_gui_request_def_in_gui_def1118 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_gui_def1121 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_24_in_gui_command_def1147 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_command_def1154 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_gui_command_def1156 = new BitSet(new long[]{0x0000000000000220L});
	public static final BitSet FOLLOW_gui_command_parameter_def_in_gui_command_def1159 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_gui_command_def1163 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lc_id_in_gui_command_parameter_def1186 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_10_in_gui_command_parameter_def1189 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_gui_command_parameter_def_in_gui_command_parameter_def1191 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_gui_action_def1215 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_action_def1221 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_gui_action_def1223 = new BitSet(new long[]{0x0000000000000220L});
	public static final BitSet FOLLOW_gui_action_parameter_def_in_gui_action_def1226 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_gui_action_def1230 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_gui_action_def1232 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_lc_id_in_gui_action_def1238 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lc_id_in_gui_action_parameter_def1264 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_gui_action_parameter_def1266 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_action_parameter_def1269 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_10_in_gui_action_parameter_def1272 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_gui_action_parameter_def_in_gui_action_parameter_def1274 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_gui_request_def1296 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_lc_id_in_gui_request_def1298 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_bt_id1344 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_txtbx_id1354 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_txtview_id1364 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_widget_def1396 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_textview_def_in_widget_def1398 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_widget_def1400 = new BitSet(new long[]{0x0000000000064002L});
	public static final BitSet FOLLOW_14_in_widget_def1409 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_button_def_in_widget_def1412 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_widget_def1414 = new BitSet(new long[]{0x0000000000024002L});
	public static final BitSet FOLLOW_17_in_widget_def1423 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_textbox_def_in_widget_def1425 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_widget_def1427 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_lc_id_in_textview_def1452 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_10_in_textview_def1456 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_textview_def_in_textview_def1458 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lc_id_in_button_def1473 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_10_in_button_def1477 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_button_def_in_button_def1479 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lc_id_in_textbox_def1495 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_10_in_textbox_def1498 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_textbox_def_in_textbox_def1500 = new BitSet(new long[]{0x0000000000000002L});
}
