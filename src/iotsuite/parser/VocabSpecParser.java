// $ANTLR 3.5.1 C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g 2015-10-27 00:02:29
 
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
		"WS", "'('", "')'", "','", "':'", "';'", "'Boolean'", "'Integer'", "'String'", 
		"'_'", "'accessed-by'", "'action'", "'actuators'", "'boolean'", "'command'", 
		"'double'", "'eventdriven'", "'for'", "'generate'", "'interactions'", 
		"'long'", "'onCondition'", "'period'", "'periodicsensors'", "'regions'", 
		"'request'", "'resources'", "'sample'", "'sensors'", "'storages'", "'structs'", 
		"'with'"
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
	@Override public String getGrammarFileName() { return "C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g"; }


	  //Initialize the context
	  private SymbolTable context;



	// $ANTLR start "vocabSpec"
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:24:1: vocabSpec : 'regions' ':' ( region_def )+ 'structs' ':' ( struct_def )+ 'resources' ':' abilities_def ;
	public final void vocabSpec() throws RecognitionException {
		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:24:11: ( 'regions' ':' ( region_def )+ 'structs' ':' ( struct_def )+ 'resources' ':' abilities_def )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:25:5: 'regions' ':' ( region_def )+ 'structs' ':' ( struct_def )+ 'resources' ':' abilities_def
			{
			match(input,31,FOLLOW_31_in_vocabSpec67); 
			 context = new SymbolTable();
			    context.currentRegion = new RegionCompiler();
			    // context.currentMappingConstraint = new MappingConstraint(); 
			    
			match(input,11,FOLLOW_11_in_vocabSpec79); 
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:30:9: ( region_def )+
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
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:30:10: region_def
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
			match(input,37,FOLLOW_37_in_vocabSpec103); 
			match(input,11,FOLLOW_11_in_vocabSpec105); 
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:32:19: ( struct_def )+
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
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:32:20: struct_def
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

			match(input,33,FOLLOW_33_in_vocabSpec122); 
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
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:40:1: region_def : CAPITALIZED_ID ':' dataType ';' ;
	public final void region_def() throws RecognitionException {
		Token CAPITALIZED_ID1=null;
		ParserRuleReturnScope dataType2 =null;

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:40:12: ( CAPITALIZED_ID ':' dataType ';' )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:42:6: CAPITALIZED_ID ':' dataType ';'
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
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:55:1: struct_def : CAPITALIZED_ID ( structField_def ';' )* ;
	public final void struct_def() throws RecognitionException {
		Token CAPITALIZED_ID3=null;

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:55:11: ( CAPITALIZED_ID ( structField_def ';' )* )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:56:5: CAPITALIZED_ID ( structField_def ';' )*
			{
			CAPITALIZED_ID3=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_struct_def188); 
			context.currentStruct = new StructCompiler((CAPITALIZED_ID3!=null?CAPITALIZED_ID3.getText():null));
			    context.constructStructNameSymblTable((CAPITALIZED_ID3!=null?CAPITALIZED_ID3.getText():null));
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:59:5: ( structField_def ';' )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==ID) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:59:6: structField_def ';'
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
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:68:1: structField_def : lc_id ':' dataType ;
	public final void structField_def() throws RecognitionException {
		ParserRuleReturnScope lc_id4 =null;
		ParserRuleReturnScope dataType5 =null;

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:68:16: ( lc_id ':' dataType )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:69:3: lc_id ':' dataType
			{
			pushFollow(FOLLOW_lc_id_in_structField_def227);
			lc_id4=lc_id();
			state._fsp--;

			match(input,11,FOLLOW_11_in_structField_def229); 
			pushFollow(FOLLOW_dataType_in_structField_def231);
			dataType5=dataType();
			state._fsp--;

			 
			    context.currentStruct.addField((lc_id4!=null?input.toString(lc_id4.start,lc_id4.stop):null), (dataType5!=null?input.toString(dataType5.start,dataType5.stop):null));
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
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:78:1: abilities_def : ( 'sensors' ':' sensor_def )+ ( 'actuators' ':' actuator_def )* ( 'storages' ':' ss_def )* ( 'interactions' ':' ( gui_def )+ )* ;
	public final void abilities_def() throws RecognitionException {
		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:78:15: ( ( 'sensors' ':' sensor_def )+ ( 'actuators' ':' actuator_def )* ( 'storages' ':' ss_def )* ( 'interactions' ':' ( gui_def )+ )* )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:80:3: ( 'sensors' ':' sensor_def )+ ( 'actuators' ':' actuator_def )* ( 'storages' ':' ss_def )* ( 'interactions' ':' ( gui_def )+ )*
			{
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:80:3: ( 'sensors' ':' sensor_def )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==35) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:80:4: 'sensors' ':' sensor_def
					{
					match(input,35,FOLLOW_35_in_abilities_def257); 
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

			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:81:4: ( 'actuators' ':' actuator_def )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==19) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:81:5: 'actuators' ':' actuator_def
					{
					match(input,19,FOLLOW_19_in_abilities_def271); 
					match(input,11,FOLLOW_11_in_abilities_def273); 
					pushFollow(FOLLOW_actuator_def_in_abilities_def275);
					actuator_def();
					state._fsp--;

					}
					break;

				default :
					break loop5;
				}
			}

			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:82:3: ( 'storages' ':' ss_def )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==36) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:82:4: 'storages' ':' ss_def
					{
					match(input,36,FOLLOW_36_in_abilities_def282); 
					match(input,11,FOLLOW_11_in_abilities_def285); 
					pushFollow(FOLLOW_ss_def_in_abilities_def287);
					ss_def();
					state._fsp--;

					}
					break;

				default :
					break loop6;
				}
			}

			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:83:3: ( 'interactions' ':' ( gui_def )+ )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==26) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:83:4: 'interactions' ':' ( gui_def )+
					{
					match(input,26,FOLLOW_26_in_abilities_def294); 
					match(input,11,FOLLOW_11_in_abilities_def296); 
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:83:23: ( gui_def )+
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
							// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:83:24: gui_def
							{
							pushFollow(FOLLOW_gui_def_in_abilities_def299);
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
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:90:1: sensor_def : ( 'periodicsensors' ':' ( periodicsensor_def )* )* ( 'eventdriven' ':' ( eventsensor_def )* )* ;
	public final void sensor_def() throws RecognitionException {
		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:90:11: ( ( 'periodicsensors' ':' ( periodicsensor_def )* )* ( 'eventdriven' ':' ( eventsensor_def )* )* )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:92:7: ( 'periodicsensors' ':' ( periodicsensor_def )* )* ( 'eventdriven' ':' ( eventsensor_def )* )*
			{
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:92:7: ( 'periodicsensors' ':' ( periodicsensor_def )* )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==30) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:92:8: 'periodicsensors' ':' ( periodicsensor_def )*
					{
					match(input,30,FOLLOW_30_in_sensor_def334); 
					match(input,11,FOLLOW_11_in_sensor_def336); 
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:92:29: ( periodicsensor_def )*
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( (LA9_0==CAPITALIZED_ID) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:92:30: periodicsensor_def
							{
							pushFollow(FOLLOW_periodicsensor_def_in_sensor_def338);
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

			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:94:7: ( 'eventdriven' ':' ( eventsensor_def )* )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==23) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:94:8: 'eventdriven' ':' ( eventsensor_def )*
					{
					match(input,23,FOLLOW_23_in_sensor_def352); 
					match(input,11,FOLLOW_11_in_sensor_def354); 
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:94:26: ( eventsensor_def )*
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( (LA11_0==CAPITALIZED_ID) ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:94:27: eventsensor_def
							{
							pushFollow(FOLLOW_eventsensor_def_in_sensor_def357);
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
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:98:1: periodicsensor_def : CAPITALIZED_ID ( sensorMeasurementForPeriodic_def ';' )* ( sensorperiodicMeasurement_def ';' )* ;
	public final void periodicsensor_def() throws RecognitionException {
		Token CAPITALIZED_ID6=null;

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:98:19: ( CAPITALIZED_ID ( sensorMeasurementForPeriodic_def ';' )* ( sensorperiodicMeasurement_def ';' )* )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:99:2: CAPITALIZED_ID ( sensorMeasurementForPeriodic_def ';' )* ( sensorperiodicMeasurement_def ';' )*
			{
			CAPITALIZED_ID6=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_periodicsensor_def372); 
			context.currentSensor = new SensorCompiler((CAPITALIZED_ID6!=null?CAPITALIZED_ID6.getText():null));
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:101:5: ( sensorMeasurementForPeriodic_def ';' )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==25) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:101:6: sensorMeasurementForPeriodic_def ';'
					{
					pushFollow(FOLLOW_sensorMeasurementForPeriodic_def_in_periodicsensor_def385);
					sensorMeasurementForPeriodic_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_periodicsensor_def387); 
					}
					break;

				default :
					break loop13;
				}
			}

			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:102:5: ( sensorperiodicMeasurement_def ';' )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==34) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:102:6: sensorperiodicMeasurement_def ';'
					{
					pushFollow(FOLLOW_sensorperiodicMeasurement_def_in_periodicsensor_def397);
					sensorperiodicMeasurement_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_periodicsensor_def399); 
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
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:107:1: eventsensor_def : CAPITALIZED_ID ( sensorMeasurementForEventDriven_def ';' )* ( sensoreventMeasurement_def ';' )* ;
	public final void eventsensor_def() throws RecognitionException {
		Token CAPITALIZED_ID7=null;

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:107:16: ( CAPITALIZED_ID ( sensorMeasurementForEventDriven_def ';' )* ( sensoreventMeasurement_def ';' )* )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:108:2: CAPITALIZED_ID ( sensorMeasurementForEventDriven_def ';' )* ( sensoreventMeasurement_def ';' )*
			{
			CAPITALIZED_ID7=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_eventsensor_def416); 
			context.currentSensor = new SensorCompiler((CAPITALIZED_ID7!=null?CAPITALIZED_ID7.getText():null));
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:110:5: ( sensorMeasurementForEventDriven_def ';' )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==25) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:110:6: sensorMeasurementForEventDriven_def ';'
					{
					pushFollow(FOLLOW_sensorMeasurementForEventDriven_def_in_eventsensor_def429);
					sensorMeasurementForEventDriven_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_eventsensor_def431); 
					}
					break;

				default :
					break loop15;
				}
			}

			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:111:5: ( sensoreventMeasurement_def ';' )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==12||LA16_0==28) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:111:6: sensoreventMeasurement_def ';'
					{
					pushFollow(FOLLOW_sensoreventMeasurement_def_in_eventsensor_def441);
					sensoreventMeasurement_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_eventsensor_def443); 
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
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:116:1: sensorMeasurementForEventDriven_def : 'generate' lc_id ':' CAPITALIZED_ID ;
	public final void sensorMeasurementForEventDriven_def() throws RecognitionException {
		Token CAPITALIZED_ID9=null;
		ParserRuleReturnScope lc_id8 =null;

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:116:36: ( 'generate' lc_id ':' CAPITALIZED_ID )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:117:1: 'generate' lc_id ':' CAPITALIZED_ID
			{
			match(input,25,FOLLOW_25_in_sensorMeasurementForEventDriven_def460); 
			pushFollow(FOLLOW_lc_id_in_sensorMeasurementForEventDriven_def462);
			lc_id8=lc_id();
			state._fsp--;

			match(input,11,FOLLOW_11_in_sensorMeasurementForEventDriven_def464); 
			CAPITALIZED_ID9=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_sensorMeasurementForEventDriven_def467); 

			      
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
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:129:1: sensorMeasurementForPeriodic_def : 'generate' lc_id ':' CAPITALIZED_ID ;
	public final void sensorMeasurementForPeriodic_def() throws RecognitionException {
		Token CAPITALIZED_ID11=null;
		ParserRuleReturnScope lc_id10 =null;

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:129:34: ( 'generate' lc_id ':' CAPITALIZED_ID )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:130:5: 'generate' lc_id ':' CAPITALIZED_ID
			{
			match(input,25,FOLLOW_25_in_sensorMeasurementForPeriodic_def494); 
			pushFollow(FOLLOW_lc_id_in_sensorMeasurementForPeriodic_def496);
			lc_id10=lc_id();
			state._fsp--;

			match(input,11,FOLLOW_11_in_sensorMeasurementForPeriodic_def498); 
			CAPITALIZED_ID11=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_sensorMeasurementForPeriodic_def501); 

			      
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
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:141:1: sensorperiodicMeasurement_def : 'sample' 'period' ( sample_period_def )* 'for' ( sample_duration_def )* ;
	public final void sensorperiodicMeasurement_def() throws RecognitionException {
		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:141:30: ( 'sample' 'period' ( sample_period_def )* 'for' ( sample_duration_def )* )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:142:2: 'sample' 'period' ( sample_period_def )* 'for' ( sample_duration_def )*
			{
			match(input,34,FOLLOW_34_in_sensorperiodicMeasurement_def529); 
			match(input,29,FOLLOW_29_in_sensorperiodicMeasurement_def531); 
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:142:20: ( sample_period_def )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==INT) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:142:21: sample_period_def
					{
					pushFollow(FOLLOW_sample_period_def_in_sensorperiodicMeasurement_def534);
					sample_period_def();
					state._fsp--;

					}
					break;

				default :
					break loop17;
				}
			}

			match(input,24,FOLLOW_24_in_sensorperiodicMeasurement_def538); 
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:142:47: ( sample_duration_def )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==INT) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:142:48: sample_duration_def
					{
					pushFollow(FOLLOW_sample_duration_def_in_sensorperiodicMeasurement_def541);
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
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:145:1: sample_period_def : INT ;
	public final void sample_period_def() throws RecognitionException {
		Token INT12=null;

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:145:19: ( INT )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:146:3: INT
			{
			INT12=(Token)match(input,INT,FOLLOW_INT_in_sample_period_def556); 

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
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:153:1: sample_duration_def : INT ;
	public final void sample_duration_def() throws RecognitionException {
		Token INT13=null;

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:153:21: ( INT )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:154:1: INT
			{
			INT13=(Token)match(input,INT,FOLLOW_INT_in_sample_duration_def570); 

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
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:163:1: sensoreventMeasurement_def : ( 'onCondition' ( ID | ',' ID )* )* ;
	public final void sensoreventMeasurement_def() throws RecognitionException {
		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:163:27: ( ( 'onCondition' ( ID | ',' ID )* )* )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:164:2: ( 'onCondition' ( ID | ',' ID )* )*
			{
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:164:2: ( 'onCondition' ( ID | ',' ID )* )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==28) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:164:2: 'onCondition' ( ID | ',' ID )*
					{
					match(input,28,FOLLOW_28_in_sensoreventMeasurement_def588); 
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:164:16: ( ID | ',' ID )*
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
							// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:164:17: ID
							{
							match(input,ID,FOLLOW_ID_in_sensoreventMeasurement_def591); 
							}
							break;
						case 2 :
							// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:164:21: ',' ID
							{
							match(input,10,FOLLOW_10_in_sensoreventMeasurement_def594); 
							match(input,ID,FOLLOW_ID_in_sensoreventMeasurement_def596); 
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
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:175:1: actuator_def : CAPITALIZED_ID ( action_def ';' )* ;
	public final void actuator_def() throws RecognitionException {
		Token CAPITALIZED_ID14=null;

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:175:13: ( CAPITALIZED_ID ( action_def ';' )* )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:176:4: CAPITALIZED_ID ( action_def ';' )*
			{
			CAPITALIZED_ID14=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_actuator_def619); 
			context.currentActuator = new ActuatorCompiler((CAPITALIZED_ID14!=null?CAPITALIZED_ID14.getText():null));
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:178:4: ( action_def ';' )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==18) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:178:5: action_def ';'
					{
					pushFollow(FOLLOW_action_def_in_actuator_def631);
					action_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_actuator_def633); 
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
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:183:1: action_def : 'action' CAPITALIZED_ID '(' ( parameter_def )? ')' ;
	public final void action_def() throws RecognitionException {
		Token CAPITALIZED_ID15=null;

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:183:11: ( 'action' CAPITALIZED_ID '(' ( parameter_def )? ')' )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:184:5: 'action' CAPITALIZED_ID '(' ( parameter_def )? ')'
			{
			match(input,18,FOLLOW_18_in_action_def657); 
			CAPITALIZED_ID15=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_action_def659); 
			match(input,8,FOLLOW_8_in_action_def661); 
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:184:33: ( parameter_def )?
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==ID) ) {
				alt22=1;
			}
			switch (alt22) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:184:34: parameter_def
					{
					pushFollow(FOLLOW_parameter_def_in_action_def664);
					parameter_def();
					state._fsp--;

					}
					break;

			}

			match(input,9,FOLLOW_9_in_action_def668); 
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
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:188:1: parameter_def : lc_id ':' CAPITALIZED_ID ( ',' parameter_def )? ;
	public final void parameter_def() throws RecognitionException {
		Token CAPITALIZED_ID16=null;
		ParserRuleReturnScope lc_id17 =null;

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:188:15: ( lc_id ':' CAPITALIZED_ID ( ',' parameter_def )? )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:189:5: lc_id ':' CAPITALIZED_ID ( ',' parameter_def )?
			{
			pushFollow(FOLLOW_lc_id_in_parameter_def688);
			lc_id17=lc_id();
			state._fsp--;

			match(input,11,FOLLOW_11_in_parameter_def690); 
			CAPITALIZED_ID16=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_parameter_def693); 
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:189:31: ( ',' parameter_def )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==10) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:189:32: ',' parameter_def
					{
					match(input,10,FOLLOW_10_in_parameter_def696); 
					pushFollow(FOLLOW_parameter_def_in_parameter_def698);
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
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:206:1: ss_def : CAPITALIZED_ID ( storageDataAccess_def ';' )* ;
	public final void ss_def() throws RecognitionException {
		Token CAPITALIZED_ID18=null;

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:206:7: ( CAPITALIZED_ID ( storageDataAccess_def ';' )* )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:207:3: CAPITALIZED_ID ( storageDataAccess_def ';' )*
			{
			CAPITALIZED_ID18=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_ss_def725); 
			 context.currentStorageService = new StorageCompiler();
			      
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:211:5: ( storageDataAccess_def ';' )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==25) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:211:6: storageDataAccess_def ';'
					{
					pushFollow(FOLLOW_storageDataAccess_def_in_ss_def742);
					storageDataAccess_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_ss_def744); 
					}
					break;

				default :
					break loop24;
				}
			}


			     context.currentStorageService.setStorageServiceName((CAPITALIZED_ID18!=null?CAPITALIZED_ID18.getText():null));
			     context.currentStorageService.createStorageObject();
			     context.currentStorageService.generateStorageCode(); 
			     
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
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:222:1: storageDataAccess_def : storageGeneratedInfo_def 'accessed-by' storagedataIndex_def ;
	public final void storageDataAccess_def() throws RecognitionException {
		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:222:23: ( storageGeneratedInfo_def 'accessed-by' storagedataIndex_def )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:223:6: storageGeneratedInfo_def 'accessed-by' storagedataIndex_def
			{
			pushFollow(FOLLOW_storageGeneratedInfo_def_in_storageDataAccess_def775);
			storageGeneratedInfo_def();
			state._fsp--;

			match(input,17,FOLLOW_17_in_storageDataAccess_def778); 
			pushFollow(FOLLOW_storagedataIndex_def_in_storageDataAccess_def780);
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
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:227:1: storageGeneratedInfo_def : 'generate' lc_id ':' CAPITALIZED_ID ;
	public final void storageGeneratedInfo_def() throws RecognitionException {
		Token CAPITALIZED_ID19=null;
		ParserRuleReturnScope lc_id20 =null;

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:227:26: ( 'generate' lc_id ':' CAPITALIZED_ID )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:228:5: 'generate' lc_id ':' CAPITALIZED_ID
			{
			match(input,25,FOLLOW_25_in_storageGeneratedInfo_def799); 
			pushFollow(FOLLOW_lc_id_in_storageGeneratedInfo_def801);
			lc_id20=lc_id();
			state._fsp--;

			match(input,11,FOLLOW_11_in_storageGeneratedInfo_def803); 
			CAPITALIZED_ID19=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_storageGeneratedInfo_def806); 

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
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:238:1: storagedataIndex_def : lc_id ':' dataType ;
	public final void storagedataIndex_def() throws RecognitionException {
		ParserRuleReturnScope lc_id21 =null;
		ParserRuleReturnScope dataType22 =null;

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:238:21: ( lc_id ':' dataType )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:239:9: lc_id ':' dataType
			{
			pushFollow(FOLLOW_lc_id_in_storagedataIndex_def828);
			lc_id21=lc_id();
			state._fsp--;

			match(input,11,FOLLOW_11_in_storagedataIndex_def830); 
			pushFollow(FOLLOW_dataType_in_storagedataIndex_def832);
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
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:246:1: lc_id : ID ;
	public final VocabSpecParser.lc_id_return lc_id() throws RecognitionException {
		VocabSpecParser.lc_id_return retval = new VocabSpecParser.lc_id_return();
		retval.start = input.LT(1);

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:246:6: ( ID )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:246:8: ID
			{
			match(input,ID,FOLLOW_ID_in_lc_id850); 
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
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:249:1: dataType : primitiveType ;
	public final VocabSpecParser.dataType_return dataType() throws RecognitionException {
		VocabSpecParser.dataType_return retval = new VocabSpecParser.dataType_return();
		retval.start = input.LT(1);

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:249:9: ( primitiveType )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:250:3: primitiveType
			{
			pushFollow(FOLLOW_primitiveType_in_dataType863);
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
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:253:1: primitiveType : (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' |id= '_' ) ;
	public final void primitiveType() throws RecognitionException {
		Token id=null;

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:253:14: ( (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' |id= '_' ) )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:254:3: (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' |id= '_' )
			{
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:254:3: (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' |id= '_' )
			int alt25=7;
			switch ( input.LA(1) ) {
			case 14:
				{
				alt25=1;
				}
				break;
			case 13:
				{
				alt25=2;
				}
				break;
			case 15:
				{
				alt25=3;
				}
				break;
			case 22:
				{
				alt25=4;
				}
				break;
			case 27:
				{
				alt25=5;
				}
				break;
			case 20:
				{
				alt25=6;
				}
				break;
			case 16:
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
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:254:4: id= 'Integer'
					{
					id=(Token)match(input,14,FOLLOW_14_in_primitiveType878); 
					}
					break;
				case 2 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:254:19: id= 'Boolean'
					{
					id=(Token)match(input,13,FOLLOW_13_in_primitiveType884); 
					}
					break;
				case 3 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:254:34: id= 'String'
					{
					id=(Token)match(input,15,FOLLOW_15_in_primitiveType890); 
					}
					break;
				case 4 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:254:49: id= 'double'
					{
					id=(Token)match(input,22,FOLLOW_22_in_primitiveType899); 
					}
					break;
				case 5 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:254:65: id= 'long'
					{
					id=(Token)match(input,27,FOLLOW_27_in_primitiveType907); 
					}
					break;
				case 6 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:254:79: id= 'boolean'
					{
					id=(Token)match(input,20,FOLLOW_20_in_primitiveType913); 
					}
					break;
				case 7 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:254:92: id= '_'
					{
					id=(Token)match(input,16,FOLLOW_16_in_primitiveType918); 
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
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:276:1: gui_def : CAPITALIZED_ID ( gui_command_def ';' )* ( gui_request_def ';' )* ;
	public final void gui_def() throws RecognitionException {
		Token CAPITALIZED_ID23=null;

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:276:8: ( CAPITALIZED_ID ( gui_command_def ';' )* ( gui_request_def ';' )* )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:277:3: CAPITALIZED_ID ( gui_command_def ';' )* ( gui_request_def ';' )*
			{
			context.currentGUI = new UserInterfaceCompiler();
			CAPITALIZED_ID23=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_gui_def1051); 
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:281:4: ( gui_command_def ';' )*
			loop26:
			while (true) {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( (LA26_0==21) ) {
					alt26=1;
				}

				switch (alt26) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:281:5: gui_command_def ';'
					{
					pushFollow(FOLLOW_gui_command_def_in_gui_def1077);
					gui_command_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_gui_def1079); 
					}
					break;

				default :
					break loop26;
				}
			}

			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:282:4: ( gui_request_def ';' )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==32) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:282:5: gui_request_def ';'
					{
					pushFollow(FOLLOW_gui_request_def_in_gui_def1090);
					gui_request_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_gui_def1093); 
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
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:288:1: gui_command_def : 'command' name= CAPITALIZED_ID '(' ( gui_command_parameter_def )? ')' ;
	public final void gui_command_def() throws RecognitionException {
		Token name=null;

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:288:17: ( 'command' name= CAPITALIZED_ID '(' ( gui_command_parameter_def )? ')' )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:289:5: 'command' name= CAPITALIZED_ID '(' ( gui_command_parameter_def )? ')'
			{
			match(input,21,FOLLOW_21_in_gui_command_def1119); 
			name=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_gui_command_def1126); 
			match(input,8,FOLLOW_8_in_gui_command_def1128); 
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:289:42: ( gui_command_parameter_def )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==ID) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:289:43: gui_command_parameter_def
					{
					pushFollow(FOLLOW_gui_command_parameter_def_in_gui_command_def1131);
					gui_command_parameter_def();
					state._fsp--;

					}
					break;

			}

			match(input,9,FOLLOW_9_in_gui_command_def1135); 
			 
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
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:296:1: gui_command_parameter_def : lc_id ( ',' gui_command_parameter_def )? ;
	public final void gui_command_parameter_def() throws RecognitionException {
		ParserRuleReturnScope lc_id24 =null;

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:296:27: ( lc_id ( ',' gui_command_parameter_def )? )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:297:5: lc_id ( ',' gui_command_parameter_def )?
			{
			pushFollow(FOLLOW_lc_id_in_gui_command_parameter_def1158);
			lc_id24=lc_id();
			state._fsp--;

			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:297:11: ( ',' gui_command_parameter_def )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==10) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:297:12: ',' gui_command_parameter_def
					{
					match(input,10,FOLLOW_10_in_gui_command_parameter_def1161); 
					pushFollow(FOLLOW_gui_command_parameter_def_in_gui_command_parameter_def1163);
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
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:306:1: gui_action_def : 'action' name= CAPITALIZED_ID '(' ( gui_action_parameter_def )? ')' 'with' ui= lc_id ;
	public final void gui_action_def() throws RecognitionException {
		Token name=null;
		ParserRuleReturnScope ui =null;

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:306:15: ( 'action' name= CAPITALIZED_ID '(' ( gui_action_parameter_def )? ')' 'with' ui= lc_id )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:307:5: 'action' name= CAPITALIZED_ID '(' ( gui_action_parameter_def )? ')' 'with' ui= lc_id
			{
			match(input,18,FOLLOW_18_in_gui_action_def1187); 
			name=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_gui_action_def1193); 
			match(input,8,FOLLOW_8_in_gui_action_def1195); 
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:307:40: ( gui_action_parameter_def )?
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==ID) ) {
				alt30=1;
			}
			switch (alt30) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:307:41: gui_action_parameter_def
					{
					pushFollow(FOLLOW_gui_action_parameter_def_in_gui_action_def1198);
					gui_action_parameter_def();
					state._fsp--;

					}
					break;

			}

			match(input,9,FOLLOW_9_in_gui_action_def1202); 
			match(input,38,FOLLOW_38_in_gui_action_def1204); 
			pushFollow(FOLLOW_lc_id_in_gui_action_def1210);
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
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:311:1: gui_action_parameter_def : lc_id ':' CAPITALIZED_ID ( ',' gui_action_parameter_def )? ;
	public final void gui_action_parameter_def() throws RecognitionException {
		Token CAPITALIZED_ID26=null;
		ParserRuleReturnScope lc_id25 =null;

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:311:26: ( lc_id ':' CAPITALIZED_ID ( ',' gui_action_parameter_def )? )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:312:5: lc_id ':' CAPITALIZED_ID ( ',' gui_action_parameter_def )?
			{
			pushFollow(FOLLOW_lc_id_in_gui_action_parameter_def1230);
			lc_id25=lc_id();
			state._fsp--;

			match(input,11,FOLLOW_11_in_gui_action_parameter_def1232); 
			CAPITALIZED_ID26=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_gui_action_parameter_def1235); 
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:312:31: ( ',' gui_action_parameter_def )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==10) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:312:32: ',' gui_action_parameter_def
					{
					match(input,10,FOLLOW_10_in_gui_action_parameter_def1238); 
					pushFollow(FOLLOW_gui_action_parameter_def_in_gui_action_parameter_def1240);
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
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:319:1: gui_request_def : 'request' lc_id ;
	public final void gui_request_def() throws RecognitionException {
		ParserRuleReturnScope lc_id27 =null;

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:319:17: ( 'request' lc_id )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:320:4: 'request' lc_id
			{
			match(input,32,FOLLOW_32_in_gui_request_def1263); 
			pushFollow(FOLLOW_lc_id_in_gui_request_def1265);
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
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:326:1: bt_id : ID ;
	public final void bt_id() throws RecognitionException {
		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:326:7: ( ID )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:326:10: ID
			{
			match(input,ID,FOLLOW_ID_in_bt_id1282); 
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
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:328:1: txtbx_id : ID ;
	public final void txtbx_id() throws RecognitionException {
		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:328:10: ( ID )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:328:13: ID
			{
			match(input,ID,FOLLOW_ID_in_txtbx_id1292); 
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
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:330:1: txtview_id : ID ;
	public final void txtview_id() throws RecognitionException {
		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:330:12: ( ID )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:330:15: ID
			{
			match(input,ID,FOLLOW_ID_in_txtview_id1302); 
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

	// Delegated rules



	public static final BitSet FOLLOW_31_in_vocabSpec67 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_vocabSpec79 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_region_def_in_vocabSpec82 = new BitSet(new long[]{0x0000002000000010L});
	public static final BitSet FOLLOW_37_in_vocabSpec103 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_vocabSpec105 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_struct_def_in_vocabSpec108 = new BitSet(new long[]{0x0000000200000010L});
	public static final BitSet FOLLOW_33_in_vocabSpec122 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_vocabSpec124 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_abilities_def_in_vocabSpec126 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_region_def156 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_region_def158 = new BitSet(new long[]{0x000000000851E000L});
	public static final BitSet FOLLOW_dataType_in_region_def160 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_region_def163 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_struct_def188 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_structField_def_in_struct_def202 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_struct_def204 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_lc_id_in_structField_def227 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_structField_def229 = new BitSet(new long[]{0x000000000851E000L});
	public static final BitSet FOLLOW_dataType_in_structField_def231 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_abilities_def257 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_abilities_def259 = new BitSet(new long[]{0x0000001844880000L});
	public static final BitSet FOLLOW_sensor_def_in_abilities_def263 = new BitSet(new long[]{0x0000001804080002L});
	public static final BitSet FOLLOW_19_in_abilities_def271 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_abilities_def273 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_actuator_def_in_abilities_def275 = new BitSet(new long[]{0x0000001004080002L});
	public static final BitSet FOLLOW_36_in_abilities_def282 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_abilities_def285 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ss_def_in_abilities_def287 = new BitSet(new long[]{0x0000001004000002L});
	public static final BitSet FOLLOW_26_in_abilities_def294 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_abilities_def296 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_gui_def_in_abilities_def299 = new BitSet(new long[]{0x0000000004000012L});
	public static final BitSet FOLLOW_30_in_sensor_def334 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_sensor_def336 = new BitSet(new long[]{0x0000000040800012L});
	public static final BitSet FOLLOW_periodicsensor_def_in_sensor_def338 = new BitSet(new long[]{0x0000000040800012L});
	public static final BitSet FOLLOW_23_in_sensor_def352 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_sensor_def354 = new BitSet(new long[]{0x0000000000800012L});
	public static final BitSet FOLLOW_eventsensor_def_in_sensor_def357 = new BitSet(new long[]{0x0000000000800012L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_periodicsensor_def372 = new BitSet(new long[]{0x0000000402000002L});
	public static final BitSet FOLLOW_sensorMeasurementForPeriodic_def_in_periodicsensor_def385 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_periodicsensor_def387 = new BitSet(new long[]{0x0000000402000002L});
	public static final BitSet FOLLOW_sensorperiodicMeasurement_def_in_periodicsensor_def397 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_periodicsensor_def399 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_eventsensor_def416 = new BitSet(new long[]{0x0000000012001002L});
	public static final BitSet FOLLOW_sensorMeasurementForEventDriven_def_in_eventsensor_def429 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_eventsensor_def431 = new BitSet(new long[]{0x0000000012001002L});
	public static final BitSet FOLLOW_sensoreventMeasurement_def_in_eventsensor_def441 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_eventsensor_def443 = new BitSet(new long[]{0x0000000010001002L});
	public static final BitSet FOLLOW_25_in_sensorMeasurementForEventDriven_def460 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_lc_id_in_sensorMeasurementForEventDriven_def462 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_sensorMeasurementForEventDriven_def464 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_sensorMeasurementForEventDriven_def467 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_sensorMeasurementForPeriodic_def494 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_lc_id_in_sensorMeasurementForPeriodic_def496 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_sensorMeasurementForPeriodic_def498 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_sensorMeasurementForPeriodic_def501 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_sensorperiodicMeasurement_def529 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_sensorperiodicMeasurement_def531 = new BitSet(new long[]{0x0000000001000040L});
	public static final BitSet FOLLOW_sample_period_def_in_sensorperiodicMeasurement_def534 = new BitSet(new long[]{0x0000000001000040L});
	public static final BitSet FOLLOW_24_in_sensorperiodicMeasurement_def538 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_sample_duration_def_in_sensorperiodicMeasurement_def541 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_INT_in_sample_period_def556 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_sample_duration_def570 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_sensoreventMeasurement_def588 = new BitSet(new long[]{0x0000000010000422L});
	public static final BitSet FOLLOW_ID_in_sensoreventMeasurement_def591 = new BitSet(new long[]{0x0000000010000422L});
	public static final BitSet FOLLOW_10_in_sensoreventMeasurement_def594 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_sensoreventMeasurement_def596 = new BitSet(new long[]{0x0000000010000422L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_actuator_def619 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_action_def_in_actuator_def631 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_actuator_def633 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_18_in_action_def657 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_action_def659 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_action_def661 = new BitSet(new long[]{0x0000000000000220L});
	public static final BitSet FOLLOW_parameter_def_in_action_def664 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_action_def668 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lc_id_in_parameter_def688 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_parameter_def690 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_parameter_def693 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_10_in_parameter_def696 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_parameter_def_in_parameter_def698 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_ss_def725 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_storageDataAccess_def_in_ss_def742 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_ss_def744 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_storageGeneratedInfo_def_in_storageDataAccess_def775 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_storageDataAccess_def778 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_storagedataIndex_def_in_storageDataAccess_def780 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_storageGeneratedInfo_def799 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_lc_id_in_storageGeneratedInfo_def801 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_storageGeneratedInfo_def803 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_storageGeneratedInfo_def806 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lc_id_in_storagedataIndex_def828 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_storagedataIndex_def830 = new BitSet(new long[]{0x000000000851E000L});
	public static final BitSet FOLLOW_dataType_in_storagedataIndex_def832 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_lc_id850 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveType_in_dataType863 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_primitiveType878 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_primitiveType884 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_primitiveType890 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_primitiveType899 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_primitiveType907 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_primitiveType913 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_primitiveType918 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_def1051 = new BitSet(new long[]{0x0000000100200002L});
	public static final BitSet FOLLOW_gui_command_def_in_gui_def1077 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_gui_def1079 = new BitSet(new long[]{0x0000000100200002L});
	public static final BitSet FOLLOW_gui_request_def_in_gui_def1090 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_gui_def1093 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_21_in_gui_command_def1119 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_command_def1126 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_gui_command_def1128 = new BitSet(new long[]{0x0000000000000220L});
	public static final BitSet FOLLOW_gui_command_parameter_def_in_gui_command_def1131 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_gui_command_def1135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lc_id_in_gui_command_parameter_def1158 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_10_in_gui_command_parameter_def1161 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_gui_command_parameter_def_in_gui_command_parameter_def1163 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_gui_action_def1187 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_action_def1193 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_gui_action_def1195 = new BitSet(new long[]{0x0000000000000220L});
	public static final BitSet FOLLOW_gui_action_parameter_def_in_gui_action_def1198 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_gui_action_def1202 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_gui_action_def1204 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_lc_id_in_gui_action_def1210 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lc_id_in_gui_action_parameter_def1230 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_gui_action_parameter_def1232 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_action_parameter_def1235 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_10_in_gui_action_parameter_def1238 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_gui_action_parameter_def_in_gui_action_parameter_def1240 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_gui_request_def1263 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_lc_id_in_gui_request_def1265 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_bt_id1282 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_txtbx_id1292 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_txtview_id1302 = new BitSet(new long[]{0x0000000000000002L});
}
