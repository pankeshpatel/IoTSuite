// $ANTLR 3.5.1 S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g 2015-11-26 22:29:39
 
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
		"'_'", "'accessed-by'", "'action'", "'actuators'", "'boolean'", "'double'", 
		"'eventDrivenSensors'", "'for'", "'generate'", "'long'", "'onCondition'", 
		"'period'", "'periodicSensors'", "'resources'", "'sample'", "'sensors'", 
		"'storages'", "'structs'"
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
	@Override public String getGrammarFileName() { return "S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g"; }


	  private SymbolTable context;



	// $ANTLR start "vocabSpec"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:23:1: vocabSpec : 'structs' ':' ( struct_def )+ 'resources' ':' abilities_def ;
	public final void vocabSpec() throws RecognitionException {
		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:23:11: ( 'structs' ':' ( struct_def )+ 'resources' ':' abilities_def )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:24:4: 'structs' ':' ( struct_def )+ 'resources' ':' abilities_def
			{
			 
			    context = new SymbolTable();
			    
			match(input,33,FOLLOW_33_in_vocabSpec75); 
			match(input,11,FOLLOW_11_in_vocabSpec77); 
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:27:19: ( struct_def )+
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
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:27:20: struct_def
					{
					pushFollow(FOLLOW_struct_def_in_vocabSpec80);
					struct_def();
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

			match(input,29,FOLLOW_29_in_vocabSpec90); 
			match(input,11,FOLLOW_11_in_vocabSpec92); 
			pushFollow(FOLLOW_abilities_def_in_vocabSpec94);
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



	// $ANTLR start "struct_def"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:31:1: struct_def : CAPITALIZED_ID ( structField_def ';' )* ;
	public final void struct_def() throws RecognitionException {
		Token CAPITALIZED_ID1=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:31:11: ( CAPITALIZED_ID ( structField_def ';' )* )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:32:5: CAPITALIZED_ID ( structField_def ';' )*
			{
			CAPITALIZED_ID1=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_struct_def113); 
			context.currentStruct = new StructCompiler((CAPITALIZED_ID1!=null?CAPITALIZED_ID1.getText():null));
			    context.constructStructNameSymblTable((CAPITALIZED_ID1!=null?CAPITALIZED_ID1.getText():null));
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:35:5: ( structField_def ';' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==ID) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:35:6: structField_def ';'
					{
					pushFollow(FOLLOW_structField_def_in_struct_def127);
					structField_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_struct_def129); 
					}
					break;

				default :
					break loop2;
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
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:40:1: structField_def : lc_id ':' dataType ;
	public final void structField_def() throws RecognitionException {
		ParserRuleReturnScope lc_id2 =null;
		ParserRuleReturnScope dataType3 =null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:40:16: ( lc_id ':' dataType )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:41:3: lc_id ':' dataType
			{
			pushFollow(FOLLOW_lc_id_in_structField_def157);
			lc_id2=lc_id();
			state._fsp--;

			match(input,11,FOLLOW_11_in_structField_def159); 
			pushFollow(FOLLOW_dataType_in_structField_def161);
			dataType3=dataType();
			state._fsp--;

			 
			    context.currentStruct.addField((lc_id2!=null?input.toString(lc_id2.start,lc_id2.stop):null), (dataType3!=null?input.toString(dataType3.start,dataType3.stop):null));
			   context.constructStructFieldSymblTable((lc_id2!=null?input.toString(lc_id2.start,lc_id2.stop):null),(dataType3!=null?input.toString(dataType3.start,dataType3.stop):null));
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
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:49:1: abilities_def : ( 'sensors' ':' sensor_def )+ ( 'actuators' ':' actuator_def )* ( 'storages' ':' ss_def )* ;
	public final void abilities_def() throws RecognitionException {
		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:49:15: ( ( 'sensors' ':' sensor_def )+ ( 'actuators' ':' actuator_def )* ( 'storages' ':' ss_def )* )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:50:3: ( 'sensors' ':' sensor_def )+ ( 'actuators' ':' actuator_def )* ( 'storages' ':' ss_def )*
			{
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:50:3: ( 'sensors' ':' sensor_def )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==31) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:50:4: 'sensors' ':' sensor_def
					{
					match(input,31,FOLLOW_31_in_abilities_def186); 
					match(input,11,FOLLOW_11_in_abilities_def188); 
					pushFollow(FOLLOW_sensor_def_in_abilities_def192);
					sensor_def();
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

			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:51:4: ( 'actuators' ':' actuator_def )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==19) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:51:5: 'actuators' ':' actuator_def
					{
					match(input,19,FOLLOW_19_in_abilities_def200); 
					match(input,11,FOLLOW_11_in_abilities_def202); 
					pushFollow(FOLLOW_actuator_def_in_abilities_def204);
					actuator_def();
					state._fsp--;

					}
					break;

				default :
					break loop4;
				}
			}

			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:52:3: ( 'storages' ':' ss_def )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==32) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:52:4: 'storages' ':' ss_def
					{
					match(input,32,FOLLOW_32_in_abilities_def211); 
					match(input,11,FOLLOW_11_in_abilities_def214); 
					pushFollow(FOLLOW_ss_def_in_abilities_def216);
					ss_def();
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
	// $ANTLR end "abilities_def"



	// $ANTLR start "sensor_def"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:55:1: sensor_def : ( 'periodicSensors' ':' ( periodicsensor_def )* )* ( 'eventDrivenSensors' ':' ( eventsensor_def )* )* ;
	public final void sensor_def() throws RecognitionException {
		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:55:11: ( ( 'periodicSensors' ':' ( periodicsensor_def )* )* ( 'eventDrivenSensors' ':' ( eventsensor_def )* )* )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:56:7: ( 'periodicSensors' ':' ( periodicsensor_def )* )* ( 'eventDrivenSensors' ':' ( eventsensor_def )* )*
			{
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:56:7: ( 'periodicSensors' ':' ( periodicsensor_def )* )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==28) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:56:8: 'periodicSensors' ':' ( periodicsensor_def )*
					{
					match(input,28,FOLLOW_28_in_sensor_def239); 
					match(input,11,FOLLOW_11_in_sensor_def241); 
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:56:29: ( periodicsensor_def )*
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( (LA6_0==CAPITALIZED_ID) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:56:30: periodicsensor_def
							{
							pushFollow(FOLLOW_periodicsensor_def_in_sensor_def243);
							periodicsensor_def();
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

			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:57:7: ( 'eventDrivenSensors' ':' ( eventsensor_def )* )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==22) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:57:8: 'eventDrivenSensors' ':' ( eventsensor_def )*
					{
					match(input,22,FOLLOW_22_in_sensor_def256); 
					match(input,11,FOLLOW_11_in_sensor_def258); 
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:57:33: ( eventsensor_def )*
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( (LA8_0==CAPITALIZED_ID) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:57:34: eventsensor_def
							{
							pushFollow(FOLLOW_eventsensor_def_in_sensor_def261);
							eventsensor_def();
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
	// $ANTLR end "sensor_def"



	// $ANTLR start "periodicsensor_def"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:60:1: periodicsensor_def : CAPITALIZED_ID ( sensorMeasurementForPeriodic_def ';' )* ( sensorperiodicMeasurement_def ';' )* ;
	public final void periodicsensor_def() throws RecognitionException {
		Token CAPITALIZED_ID4=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:60:19: ( CAPITALIZED_ID ( sensorMeasurementForPeriodic_def ';' )* ( sensorperiodicMeasurement_def ';' )* )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:61:2: CAPITALIZED_ID ( sensorMeasurementForPeriodic_def ';' )* ( sensorperiodicMeasurement_def ';' )*
			{
			CAPITALIZED_ID4=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_periodicsensor_def277); 
			context.currentSensor = new SensorCompiler((CAPITALIZED_ID4!=null?CAPITALIZED_ID4.getText():null));
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:63:5: ( sensorMeasurementForPeriodic_def ';' )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==24) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:63:6: sensorMeasurementForPeriodic_def ';'
					{
					pushFollow(FOLLOW_sensorMeasurementForPeriodic_def_in_periodicsensor_def290);
					sensorMeasurementForPeriodic_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_periodicsensor_def292); 
					}
					break;

				default :
					break loop10;
				}
			}

			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:64:5: ( sensorperiodicMeasurement_def ';' )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==30) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:64:6: sensorperiodicMeasurement_def ';'
					{
					pushFollow(FOLLOW_sensorperiodicMeasurement_def_in_periodicsensor_def302);
					sensorperiodicMeasurement_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_periodicsensor_def304); 
					}
					break;

				default :
					break loop11;
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
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:69:1: eventsensor_def : CAPITALIZED_ID ( sensorMeasurementForEventDriven_def ';' )* ( sensoreventMeasurement_def ';' )* ;
	public final void eventsensor_def() throws RecognitionException {
		Token CAPITALIZED_ID5=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:69:16: ( CAPITALIZED_ID ( sensorMeasurementForEventDriven_def ';' )* ( sensoreventMeasurement_def ';' )* )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:70:2: CAPITALIZED_ID ( sensorMeasurementForEventDriven_def ';' )* ( sensoreventMeasurement_def ';' )*
			{
			CAPITALIZED_ID5=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_eventsensor_def321); 
			context.currentSensor = new SensorCompiler((CAPITALIZED_ID5!=null?CAPITALIZED_ID5.getText():null));
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:72:5: ( sensorMeasurementForEventDriven_def ';' )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==24) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:72:6: sensorMeasurementForEventDriven_def ';'
					{
					pushFollow(FOLLOW_sensorMeasurementForEventDriven_def_in_eventsensor_def334);
					sensorMeasurementForEventDriven_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_eventsensor_def336); 
					}
					break;

				default :
					break loop12;
				}
			}

			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:73:5: ( sensoreventMeasurement_def ';' )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==12||LA13_0==26) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:73:6: sensoreventMeasurement_def ';'
					{
					pushFollow(FOLLOW_sensoreventMeasurement_def_in_eventsensor_def346);
					sensoreventMeasurement_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_eventsensor_def348); 
					}
					break;

				default :
					break loop13;
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
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:78:1: sensorMeasurementForEventDriven_def : 'generate' lc_id ':' CAPITALIZED_ID ;
	public final void sensorMeasurementForEventDriven_def() throws RecognitionException {
		Token CAPITALIZED_ID7=null;
		ParserRuleReturnScope lc_id6 =null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:78:36: ( 'generate' lc_id ':' CAPITALIZED_ID )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:79:1: 'generate' lc_id ':' CAPITALIZED_ID
			{
			match(input,24,FOLLOW_24_in_sensorMeasurementForEventDriven_def365); 
			pushFollow(FOLLOW_lc_id_in_sensorMeasurementForEventDriven_def367);
			lc_id6=lc_id();
			state._fsp--;

			match(input,11,FOLLOW_11_in_sensorMeasurementForEventDriven_def369); 
			CAPITALIZED_ID7=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_sensorMeasurementForEventDriven_def372); 
			  
			    context.currentSensor.addSensorMeasurement((lc_id6!=null?input.toString(lc_id6.start,lc_id6.stop):null), (CAPITALIZED_ID7!=null?CAPITALIZED_ID7.getText():null) , context.getStructSymblTable((CAPITALIZED_ID7!=null?CAPITALIZED_ID7.getText():null)) ); 
			    context.constructSymbTable((lc_id6!=null?input.toString(lc_id6.start,lc_id6.stop):null), (CAPITALIZED_ID7!=null?CAPITALIZED_ID7.getText():null));
			    context.constructEventDrivenSymblTable((CAPITALIZED_ID7!=null?CAPITALIZED_ID7.getText():null));
			     
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
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:87:1: sensorMeasurementForPeriodic_def : 'generate' lc_id ':' CAPITALIZED_ID ;
	public final void sensorMeasurementForPeriodic_def() throws RecognitionException {
		Token CAPITALIZED_ID9=null;
		ParserRuleReturnScope lc_id8 =null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:87:34: ( 'generate' lc_id ':' CAPITALIZED_ID )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:88:5: 'generate' lc_id ':' CAPITALIZED_ID
			{
			match(input,24,FOLLOW_24_in_sensorMeasurementForPeriodic_def395); 
			pushFollow(FOLLOW_lc_id_in_sensorMeasurementForPeriodic_def397);
			lc_id8=lc_id();
			state._fsp--;

			match(input,11,FOLLOW_11_in_sensorMeasurementForPeriodic_def399); 
			CAPITALIZED_ID9=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_sensorMeasurementForPeriodic_def402); 
			      
			    context.currentSensor.addSensorMeasurement((lc_id8!=null?input.toString(lc_id8.start,lc_id8.stop):null), (CAPITALIZED_ID9!=null?CAPITALIZED_ID9.getText():null) , context.getStructSymblTable((CAPITALIZED_ID9!=null?CAPITALIZED_ID9.getText():null)) ); 
			    context.constructSymbTable((lc_id8!=null?input.toString(lc_id8.start,lc_id8.stop):null), (CAPITALIZED_ID9!=null?CAPITALIZED_ID9.getText():null));  
			    
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
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:95:1: sensorperiodicMeasurement_def : 'sample' 'period' ( sample_period_def )* 'for' ( sample_duration_def )* ;
	public final void sensorperiodicMeasurement_def() throws RecognitionException {
		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:95:30: ( 'sample' 'period' ( sample_period_def )* 'for' ( sample_duration_def )* )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:96:2: 'sample' 'period' ( sample_period_def )* 'for' ( sample_duration_def )*
			{
			match(input,30,FOLLOW_30_in_sensorperiodicMeasurement_def427); 
			match(input,27,FOLLOW_27_in_sensorperiodicMeasurement_def429); 
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:96:20: ( sample_period_def )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==INT) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:96:21: sample_period_def
					{
					pushFollow(FOLLOW_sample_period_def_in_sensorperiodicMeasurement_def432);
					sample_period_def();
					state._fsp--;

					}
					break;

				default :
					break loop14;
				}
			}

			match(input,23,FOLLOW_23_in_sensorperiodicMeasurement_def436); 
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:96:47: ( sample_duration_def )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==INT) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:96:48: sample_duration_def
					{
					pushFollow(FOLLOW_sample_duration_def_in_sensorperiodicMeasurement_def439);
					sample_duration_def();
					state._fsp--;

					}
					break;

				default :
					break loop15;
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
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:99:1: sample_period_def : INT ;
	public final void sample_period_def() throws RecognitionException {
		Token INT10=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:99:19: ( INT )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:100:3: INT
			{
			INT10=(Token)match(input,INT,FOLLOW_INT_in_sample_period_def454); 

			context.currentSensor.addSensorMeasurementSamplePeriod((INT10!=null?INT10.getText():null));

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
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:106:1: sample_duration_def : INT ;
	public final void sample_duration_def() throws RecognitionException {
		Token INT11=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:106:21: ( INT )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:107:1: INT
			{
			INT11=(Token)match(input,INT,FOLLOW_INT_in_sample_duration_def467); 

			context.currentSensor.addSensorMeasurementSampleDuration((INT11!=null?INT11.getText():null));

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
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:113:1: sensoreventMeasurement_def : ( 'onCondition' ( ID | ',' ID )* )* ;
	public final void sensoreventMeasurement_def() throws RecognitionException {
		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:113:27: ( ( 'onCondition' ( ID | ',' ID )* )* )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:114:2: ( 'onCondition' ( ID | ',' ID )* )*
			{
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:114:2: ( 'onCondition' ( ID | ',' ID )* )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==26) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:114:2: 'onCondition' ( ID | ',' ID )*
					{
					match(input,26,FOLLOW_26_in_sensoreventMeasurement_def479); 
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:114:16: ( ID | ',' ID )*
					loop16:
					while (true) {
						int alt16=3;
						int LA16_0 = input.LA(1);
						if ( (LA16_0==ID) ) {
							alt16=1;
						}
						else if ( (LA16_0==10) ) {
							alt16=2;
						}

						switch (alt16) {
						case 1 :
							// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:114:17: ID
							{
							match(input,ID,FOLLOW_ID_in_sensoreventMeasurement_def482); 
							}
							break;
						case 2 :
							// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:114:21: ',' ID
							{
							match(input,10,FOLLOW_10_in_sensoreventMeasurement_def485); 
							match(input,ID,FOLLOW_ID_in_sensoreventMeasurement_def487); 
							}
							break;

						default :
							break loop16;
						}
					}

					}
					break;

				default :
					break loop17;
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
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:117:1: actuator_def : CAPITALIZED_ID ( action_def ';' )* ;
	public final void actuator_def() throws RecognitionException {
		Token CAPITALIZED_ID12=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:117:13: ( CAPITALIZED_ID ( action_def ';' )* )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:118:4: CAPITALIZED_ID ( action_def ';' )*
			{
			CAPITALIZED_ID12=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_actuator_def502); 
			context.currentActuator = new ActuatorCompiler((CAPITALIZED_ID12!=null?CAPITALIZED_ID12.getText():null));
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:120:4: ( action_def ';' )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==18) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:120:5: action_def ';'
					{
					pushFollow(FOLLOW_action_def_in_actuator_def514);
					action_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_actuator_def516); 
					}
					break;

				default :
					break loop18;
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
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:123:1: action_def : 'action' CAPITALIZED_ID '(' ( parameter_def )? ')' ;
	public final void action_def() throws RecognitionException {
		Token CAPITALIZED_ID13=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:123:11: ( 'action' CAPITALIZED_ID '(' ( parameter_def )? ')' )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:124:5: 'action' CAPITALIZED_ID '(' ( parameter_def )? ')'
			{
			match(input,18,FOLLOW_18_in_action_def538); 
			CAPITALIZED_ID13=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_action_def540); 
			match(input,8,FOLLOW_8_in_action_def542); 
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:124:33: ( parameter_def )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==ID) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:124:34: parameter_def
					{
					pushFollow(FOLLOW_parameter_def_in_action_def545);
					parameter_def();
					state._fsp--;

					}
					break;

			}

			match(input,9,FOLLOW_9_in_action_def549); 
			 context.currentActuator.addAction((CAPITALIZED_ID13!=null?CAPITALIZED_ID13.getText():null)); 
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
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:128:1: parameter_def : lc_id ':' CAPITALIZED_ID ( ',' parameter_def )? ;
	public final void parameter_def() throws RecognitionException {
		Token CAPITALIZED_ID14=null;
		ParserRuleReturnScope lc_id15 =null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:128:15: ( lc_id ':' CAPITALIZED_ID ( ',' parameter_def )? )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:129:5: lc_id ':' CAPITALIZED_ID ( ',' parameter_def )?
			{
			pushFollow(FOLLOW_lc_id_in_parameter_def569);
			lc_id15=lc_id();
			state._fsp--;

			match(input,11,FOLLOW_11_in_parameter_def571); 
			CAPITALIZED_ID14=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_parameter_def574); 
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:129:31: ( ',' parameter_def )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==10) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:129:32: ',' parameter_def
					{
					match(input,10,FOLLOW_10_in_parameter_def577); 
					pushFollow(FOLLOW_parameter_def_in_parameter_def579);
					parameter_def();
					state._fsp--;

					}
					break;

			}

			 
			     context.constructActuatorSymblTable((CAPITALIZED_ID14!=null?CAPITALIZED_ID14.getText():null));    
			     context.currentActuator.addParameter((lc_id15!=null?input.toString(lc_id15.start,lc_id15.stop):null), (CAPITALIZED_ID14!=null?CAPITALIZED_ID14.getText():null)); 
			     context.constructSymbTable((lc_id15!=null?input.toString(lc_id15.start,lc_id15.stop):null), (CAPITALIZED_ID14!=null?CAPITALIZED_ID14.getText():null));
			    
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
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:136:1: ss_def : CAPITALIZED_ID ( storageDataAccess_def ';' )* ( storageActionAccess_def ';' )* ;
	public final void ss_def() throws RecognitionException {
		Token CAPITALIZED_ID16=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:136:7: ( CAPITALIZED_ID ( storageDataAccess_def ';' )* ( storageActionAccess_def ';' )* )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:137:3: CAPITALIZED_ID ( storageDataAccess_def ';' )* ( storageActionAccess_def ';' )*
			{
			CAPITALIZED_ID16=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_ss_def597); 
			 context.currentStorageService = new StorageCompiler();
			    
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:140:5: ( storageDataAccess_def ';' )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==24) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:140:6: storageDataAccess_def ';'
					{
					pushFollow(FOLLOW_storageDataAccess_def_in_ss_def612);
					storageDataAccess_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_ss_def614); 
					}
					break;

				default :
					break loop21;
				}
			}

			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:141:5: ( storageActionAccess_def ';' )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==12||LA22_0==18) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:141:6: storageActionAccess_def ';'
					{
					pushFollow(FOLLOW_storageActionAccess_def_in_ss_def623);
					storageActionAccess_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_ss_def625); 
					}
					break;

				default :
					break loop22;
				}
			}


			     context.currentStorageService.setStorageServiceName((CAPITALIZED_ID16!=null?CAPITALIZED_ID16.getText():null));
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



	// $ANTLR start "storageActionAccess_def"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:149:1: storageActionAccess_def : ( storageAction_def )* ;
	public final void storageActionAccess_def() throws RecognitionException {
		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:149:24: ( ( storageAction_def )* )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:150:4: ( storageAction_def )*
			{
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:150:4: ( storageAction_def )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==18) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:150:5: storageAction_def
					{
					pushFollow(FOLLOW_storageAction_def_in_storageActionAccess_def648);
					storageAction_def();
					state._fsp--;

					}
					break;

				default :
					break loop23;
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
	// $ANTLR end "storageActionAccess_def"



	// $ANTLR start "storageAction_def"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:153:1: storageAction_def : 'action' CAPITALIZED_ID '(' ( storageParameter_def )? ')' ;
	public final void storageAction_def() throws RecognitionException {
		Token CAPITALIZED_ID17=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:153:18: ( 'action' CAPITALIZED_ID '(' ( storageParameter_def )? ')' )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:154:5: 'action' CAPITALIZED_ID '(' ( storageParameter_def )? ')'
			{
			match(input,18,FOLLOW_18_in_storageAction_def673); 
			CAPITALIZED_ID17=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_storageAction_def675); 
			match(input,8,FOLLOW_8_in_storageAction_def677); 
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:154:33: ( storageParameter_def )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==ID) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:154:34: storageParameter_def
					{
					pushFollow(FOLLOW_storageParameter_def_in_storageAction_def680);
					storageParameter_def();
					state._fsp--;

					}
					break;

			}

			match(input,9,FOLLOW_9_in_storageAction_def684); 
			context.currentStorageService.addAction((CAPITALIZED_ID17!=null?CAPITALIZED_ID17.getText():null));
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
	// $ANTLR end "storageAction_def"



	// $ANTLR start "storageParameter_def"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:158:1: storageParameter_def : lc_id ':' CAPITALIZED_ID ( ',' storageParameter_def )? ;
	public final void storageParameter_def() throws RecognitionException {
		Token CAPITALIZED_ID18=null;
		ParserRuleReturnScope lc_id19 =null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:158:22: ( lc_id ':' CAPITALIZED_ID ( ',' storageParameter_def )? )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:159:5: lc_id ':' CAPITALIZED_ID ( ',' storageParameter_def )?
			{
			pushFollow(FOLLOW_lc_id_in_storageParameter_def704);
			lc_id19=lc_id();
			state._fsp--;

			match(input,11,FOLLOW_11_in_storageParameter_def706); 
			CAPITALIZED_ID18=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_storageParameter_def709); 
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:159:31: ( ',' storageParameter_def )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==10) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:159:32: ',' storageParameter_def
					{
					match(input,10,FOLLOW_10_in_storageParameter_def712); 
					pushFollow(FOLLOW_storageParameter_def_in_storageParameter_def714);
					storageParameter_def();
					state._fsp--;

					}
					break;

			}

			 
			     context.constructStorageActionSymlTable((CAPITALIZED_ID18!=null?CAPITALIZED_ID18.getText():null));    
			     context.currentStorageService.addParameter((lc_id19!=null?input.toString(lc_id19.start,lc_id19.stop):null), (CAPITALIZED_ID18!=null?CAPITALIZED_ID18.getText():null));  
			     context.constructSymbTable((lc_id19!=null?input.toString(lc_id19.start,lc_id19.stop):null), (CAPITALIZED_ID18!=null?CAPITALIZED_ID18.getText():null));
			    
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
	// $ANTLR end "storageParameter_def"



	// $ANTLR start "storageDataAccess_def"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:168:1: storageDataAccess_def : storageGeneratedInfo_def 'accessed-by' storagedataIndex_def ;
	public final void storageDataAccess_def() throws RecognitionException {
		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:168:23: ( storageGeneratedInfo_def 'accessed-by' storagedataIndex_def )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:169:6: storageGeneratedInfo_def 'accessed-by' storagedataIndex_def
			{
			pushFollow(FOLLOW_storageGeneratedInfo_def_in_storageDataAccess_def739);
			storageGeneratedInfo_def();
			state._fsp--;

			match(input,17,FOLLOW_17_in_storageDataAccess_def742); 
			pushFollow(FOLLOW_storagedataIndex_def_in_storageDataAccess_def744);
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
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:173:1: storageGeneratedInfo_def : 'generate' lc_id ':' CAPITALIZED_ID ;
	public final void storageGeneratedInfo_def() throws RecognitionException {
		Token CAPITALIZED_ID20=null;
		ParserRuleReturnScope lc_id21 =null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:173:26: ( 'generate' lc_id ':' CAPITALIZED_ID )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:174:5: 'generate' lc_id ':' CAPITALIZED_ID
			{
			match(input,24,FOLLOW_24_in_storageGeneratedInfo_def763); 
			pushFollow(FOLLOW_lc_id_in_storageGeneratedInfo_def765);
			lc_id21=lc_id();
			state._fsp--;

			match(input,11,FOLLOW_11_in_storageGeneratedInfo_def767); 
			CAPITALIZED_ID20=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_storageGeneratedInfo_def770); 

			     context.constructStorageSymblTable((CAPITALIZED_ID20!=null?CAPITALIZED_ID20.getText():null));
			     context.currentStorageService.addGeneratedInfo((lc_id21!=null?input.toString(lc_id21.start,lc_id21.stop):null), (CAPITALIZED_ID20!=null?CAPITALIZED_ID20.getText():null));  
			      context.constructSymbTable((lc_id21!=null?input.toString(lc_id21.start,lc_id21.stop):null), (CAPITALIZED_ID20!=null?CAPITALIZED_ID20.getText():null));
			    context.constructResponseTypeSymblTable((lc_id21!=null?input.toString(lc_id21.start,lc_id21.stop):null), (CAPITALIZED_ID20!=null?CAPITALIZED_ID20.getText():null));
			   
			    
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
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:184:1: storagedataIndex_def : lc_id ':' dataType ;
	public final void storagedataIndex_def() throws RecognitionException {
		ParserRuleReturnScope lc_id22 =null;
		ParserRuleReturnScope dataType23 =null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:184:21: ( lc_id ':' dataType )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:185:9: lc_id ':' dataType
			{
			pushFollow(FOLLOW_lc_id_in_storagedataIndex_def792);
			lc_id22=lc_id();
			state._fsp--;

			match(input,11,FOLLOW_11_in_storagedataIndex_def794); 
			pushFollow(FOLLOW_dataType_in_storagedataIndex_def796);
			dataType23=dataType();
			state._fsp--;

			 context.currentStorageService.addDataAccessIndex((lc_id22!=null?input.toString(lc_id22.start,lc_id22.stop):null), (dataType23!=null?input.toString(dataType23.start,dataType23.stop):null)); 
			        context.constructStorageInfoSymblTable((lc_id22!=null?input.toString(lc_id22.start,lc_id22.stop):null), (dataType23!=null?input.toString(dataType23.start,dataType23.stop):null));
			        
			         
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
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:192:1: lc_id : ID ;
	public final VocabSpecParser.lc_id_return lc_id() throws RecognitionException {
		VocabSpecParser.lc_id_return retval = new VocabSpecParser.lc_id_return();
		retval.start = input.LT(1);

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:192:6: ( ID )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:192:8: ID
			{
			match(input,ID,FOLLOW_ID_in_lc_id814); 
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
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:195:1: dataType : primitiveType ;
	public final VocabSpecParser.dataType_return dataType() throws RecognitionException {
		VocabSpecParser.dataType_return retval = new VocabSpecParser.dataType_return();
		retval.start = input.LT(1);

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:195:9: ( primitiveType )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:196:3: primitiveType
			{
			pushFollow(FOLLOW_primitiveType_in_dataType827);
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
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:199:1: primitiveType : (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' |id= '_' ) ;
	public final void primitiveType() throws RecognitionException {
		Token id=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:199:14: ( (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' |id= '_' ) )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:200:3: (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' |id= '_' )
			{
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:200:3: (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' |id= '_' )
			int alt26=7;
			switch ( input.LA(1) ) {
			case 14:
				{
				alt26=1;
				}
				break;
			case 13:
				{
				alt26=2;
				}
				break;
			case 15:
				{
				alt26=3;
				}
				break;
			case 21:
				{
				alt26=4;
				}
				break;
			case 25:
				{
				alt26=5;
				}
				break;
			case 20:
				{
				alt26=6;
				}
				break;
			case 16:
				{
				alt26=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}
			switch (alt26) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:200:4: id= 'Integer'
					{
					id=(Token)match(input,14,FOLLOW_14_in_primitiveType843); 
					}
					break;
				case 2 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:200:19: id= 'Boolean'
					{
					id=(Token)match(input,13,FOLLOW_13_in_primitiveType849); 
					}
					break;
				case 3 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:200:34: id= 'String'
					{
					id=(Token)match(input,15,FOLLOW_15_in_primitiveType855); 
					}
					break;
				case 4 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:200:49: id= 'double'
					{
					id=(Token)match(input,21,FOLLOW_21_in_primitiveType864); 
					}
					break;
				case 5 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:200:65: id= 'long'
					{
					id=(Token)match(input,25,FOLLOW_25_in_primitiveType872); 
					}
					break;
				case 6 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:200:79: id= 'boolean'
					{
					id=(Token)match(input,20,FOLLOW_20_in_primitiveType878); 
					}
					break;
				case 7 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:200:92: id= '_'
					{
					id=(Token)match(input,16,FOLLOW_16_in_primitiveType883); 
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



	public static final BitSet FOLLOW_33_in_vocabSpec75 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_vocabSpec77 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_struct_def_in_vocabSpec80 = new BitSet(new long[]{0x0000000020000010L});
	public static final BitSet FOLLOW_29_in_vocabSpec90 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_vocabSpec92 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_abilities_def_in_vocabSpec94 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_struct_def113 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_structField_def_in_struct_def127 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_struct_def129 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_lc_id_in_structField_def157 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_structField_def159 = new BitSet(new long[]{0x000000000231E000L});
	public static final BitSet FOLLOW_dataType_in_structField_def161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_abilities_def186 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_abilities_def188 = new BitSet(new long[]{0x0000000190480000L});
	public static final BitSet FOLLOW_sensor_def_in_abilities_def192 = new BitSet(new long[]{0x0000000180080002L});
	public static final BitSet FOLLOW_19_in_abilities_def200 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_abilities_def202 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_actuator_def_in_abilities_def204 = new BitSet(new long[]{0x0000000100080002L});
	public static final BitSet FOLLOW_32_in_abilities_def211 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_abilities_def214 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ss_def_in_abilities_def216 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_28_in_sensor_def239 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_sensor_def241 = new BitSet(new long[]{0x0000000010400012L});
	public static final BitSet FOLLOW_periodicsensor_def_in_sensor_def243 = new BitSet(new long[]{0x0000000010400012L});
	public static final BitSet FOLLOW_22_in_sensor_def256 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_sensor_def258 = new BitSet(new long[]{0x0000000000400012L});
	public static final BitSet FOLLOW_eventsensor_def_in_sensor_def261 = new BitSet(new long[]{0x0000000000400012L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_periodicsensor_def277 = new BitSet(new long[]{0x0000000041000002L});
	public static final BitSet FOLLOW_sensorMeasurementForPeriodic_def_in_periodicsensor_def290 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_periodicsensor_def292 = new BitSet(new long[]{0x0000000041000002L});
	public static final BitSet FOLLOW_sensorperiodicMeasurement_def_in_periodicsensor_def302 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_periodicsensor_def304 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_eventsensor_def321 = new BitSet(new long[]{0x0000000005001002L});
	public static final BitSet FOLLOW_sensorMeasurementForEventDriven_def_in_eventsensor_def334 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_eventsensor_def336 = new BitSet(new long[]{0x0000000005001002L});
	public static final BitSet FOLLOW_sensoreventMeasurement_def_in_eventsensor_def346 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_eventsensor_def348 = new BitSet(new long[]{0x0000000004001002L});
	public static final BitSet FOLLOW_24_in_sensorMeasurementForEventDriven_def365 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_lc_id_in_sensorMeasurementForEventDriven_def367 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_sensorMeasurementForEventDriven_def369 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_sensorMeasurementForEventDriven_def372 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_sensorMeasurementForPeriodic_def395 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_lc_id_in_sensorMeasurementForPeriodic_def397 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_sensorMeasurementForPeriodic_def399 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_sensorMeasurementForPeriodic_def402 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_sensorperiodicMeasurement_def427 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_sensorperiodicMeasurement_def429 = new BitSet(new long[]{0x0000000000800040L});
	public static final BitSet FOLLOW_sample_period_def_in_sensorperiodicMeasurement_def432 = new BitSet(new long[]{0x0000000000800040L});
	public static final BitSet FOLLOW_23_in_sensorperiodicMeasurement_def436 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_sample_duration_def_in_sensorperiodicMeasurement_def439 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_INT_in_sample_period_def454 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_sample_duration_def467 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_sensoreventMeasurement_def479 = new BitSet(new long[]{0x0000000004000422L});
	public static final BitSet FOLLOW_ID_in_sensoreventMeasurement_def482 = new BitSet(new long[]{0x0000000004000422L});
	public static final BitSet FOLLOW_10_in_sensoreventMeasurement_def485 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_sensoreventMeasurement_def487 = new BitSet(new long[]{0x0000000004000422L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_actuator_def502 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_action_def_in_actuator_def514 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_actuator_def516 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_18_in_action_def538 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_action_def540 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_action_def542 = new BitSet(new long[]{0x0000000000000220L});
	public static final BitSet FOLLOW_parameter_def_in_action_def545 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_action_def549 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lc_id_in_parameter_def569 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_parameter_def571 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_parameter_def574 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_10_in_parameter_def577 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_parameter_def_in_parameter_def579 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_ss_def597 = new BitSet(new long[]{0x0000000001041002L});
	public static final BitSet FOLLOW_storageDataAccess_def_in_ss_def612 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_ss_def614 = new BitSet(new long[]{0x0000000001041002L});
	public static final BitSet FOLLOW_storageActionAccess_def_in_ss_def623 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_ss_def625 = new BitSet(new long[]{0x0000000000041002L});
	public static final BitSet FOLLOW_storageAction_def_in_storageActionAccess_def648 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_18_in_storageAction_def673 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_storageAction_def675 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_storageAction_def677 = new BitSet(new long[]{0x0000000000000220L});
	public static final BitSet FOLLOW_storageParameter_def_in_storageAction_def680 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_storageAction_def684 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lc_id_in_storageParameter_def704 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_storageParameter_def706 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_storageParameter_def709 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_10_in_storageParameter_def712 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_storageParameter_def_in_storageParameter_def714 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_storageGeneratedInfo_def_in_storageDataAccess_def739 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_storageDataAccess_def742 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_storagedataIndex_def_in_storageDataAccess_def744 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_storageGeneratedInfo_def763 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_lc_id_in_storageGeneratedInfo_def765 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_storageGeneratedInfo_def767 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_storageGeneratedInfo_def770 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lc_id_in_storagedataIndex_def792 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_storagedataIndex_def794 = new BitSet(new long[]{0x000000000231E000L});
	public static final BitSet FOLLOW_dataType_in_storagedataIndex_def796 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_lc_id814 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveType_in_dataType827 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_primitiveType843 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_primitiveType849 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_primitiveType855 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_primitiveType864 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_primitiveType872 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_primitiveType878 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_primitiveType883 = new BitSet(new long[]{0x0000000000000002L});
}
