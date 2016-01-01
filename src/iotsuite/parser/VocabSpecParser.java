// $ANTLR 3.5.1 S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g 2015-12-31 17:12:26
 
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
		"'period'", "'periodicSensors'", "'requestBasedSensors'", "'resources'", 
		"'sample'", "'sensors'", "'storages'", "'structs'", "'tags'"
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
			    
			match(input,34,FOLLOW_34_in_vocabSpec75); 
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

			match(input,30,FOLLOW_30_in_vocabSpec90); 
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
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:49:1: abilities_def : ( 'sensors' ':' sensor_def )+ ( 'tags' ':' ( tagsensor_def )* )* ( 'actuators' ':' ( actuator_def )* )* ( 'storages' ':' ( ss_def )* )* ;
	public final void abilities_def() throws RecognitionException {
		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:49:15: ( ( 'sensors' ':' sensor_def )+ ( 'tags' ':' ( tagsensor_def )* )* ( 'actuators' ':' ( actuator_def )* )* ( 'storages' ':' ( ss_def )* )* )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:50:3: ( 'sensors' ':' sensor_def )+ ( 'tags' ':' ( tagsensor_def )* )* ( 'actuators' ':' ( actuator_def )* )* ( 'storages' ':' ( ss_def )* )*
			{
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:50:3: ( 'sensors' ':' sensor_def )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==32) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:50:4: 'sensors' ':' sensor_def
					{
					match(input,32,FOLLOW_32_in_abilities_def186); 
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

			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:51:4: ( 'tags' ':' ( tagsensor_def )* )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==35) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:51:5: 'tags' ':' ( tagsensor_def )*
					{
					match(input,35,FOLLOW_35_in_abilities_def200); 
					match(input,11,FOLLOW_11_in_abilities_def202); 
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:51:16: ( tagsensor_def )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( (LA4_0==CAPITALIZED_ID) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:51:17: tagsensor_def
							{
							pushFollow(FOLLOW_tagsensor_def_in_abilities_def205);
							tagsensor_def();
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

			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:52:4: ( 'actuators' ':' ( actuator_def )* )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==19) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:52:5: 'actuators' ':' ( actuator_def )*
					{
					match(input,19,FOLLOW_19_in_abilities_def216); 
					match(input,11,FOLLOW_11_in_abilities_def218); 
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:52:21: ( actuator_def )*
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( (LA6_0==CAPITALIZED_ID) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:52:22: actuator_def
							{
							pushFollow(FOLLOW_actuator_def_in_abilities_def221);
							actuator_def();
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

			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:53:4: ( 'storages' ':' ( ss_def )* )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==33) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:53:5: 'storages' ':' ( ss_def )*
					{
					match(input,33,FOLLOW_33_in_abilities_def231); 
					match(input,11,FOLLOW_11_in_abilities_def234); 
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:53:21: ( ss_def )*
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( (LA8_0==CAPITALIZED_ID) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:53:22: ss_def
							{
							pushFollow(FOLLOW_ss_def_in_abilities_def237);
							ss_def();
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
	// $ANTLR end "abilities_def"



	// $ANTLR start "sensor_def"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:56:1: sensor_def : ( 'periodicSensors' ':' ( periodicsensor_def )* )* ( 'eventDrivenSensors' ':' ( eventsensor_def )* )* ( 'requestBasedSensors' ':' ( requestsensor_def )* )* ;
	public final void sensor_def() throws RecognitionException {
		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:56:11: ( ( 'periodicSensors' ':' ( periodicsensor_def )* )* ( 'eventDrivenSensors' ':' ( eventsensor_def )* )* ( 'requestBasedSensors' ':' ( requestsensor_def )* )* )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:57:7: ( 'periodicSensors' ':' ( periodicsensor_def )* )* ( 'eventDrivenSensors' ':' ( eventsensor_def )* )* ( 'requestBasedSensors' ':' ( requestsensor_def )* )*
			{
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:57:7: ( 'periodicSensors' ':' ( periodicsensor_def )* )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==28) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:57:8: 'periodicSensors' ':' ( periodicsensor_def )*
					{
					match(input,28,FOLLOW_28_in_sensor_def263); 
					match(input,11,FOLLOW_11_in_sensor_def265); 
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:57:29: ( periodicsensor_def )*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( (LA10_0==CAPITALIZED_ID) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:57:30: periodicsensor_def
							{
							pushFollow(FOLLOW_periodicsensor_def_in_sensor_def267);
							periodicsensor_def();
							state._fsp--;

							}
							break;

						default :
							break loop10;
						}
					}

					}
					break;

				default :
					break loop11;
				}
			}

			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:58:7: ( 'eventDrivenSensors' ':' ( eventsensor_def )* )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==22) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:58:8: 'eventDrivenSensors' ':' ( eventsensor_def )*
					{
					match(input,22,FOLLOW_22_in_sensor_def280); 
					match(input,11,FOLLOW_11_in_sensor_def282); 
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:58:33: ( eventsensor_def )*
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( (LA12_0==CAPITALIZED_ID) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:58:34: eventsensor_def
							{
							pushFollow(FOLLOW_eventsensor_def_in_sensor_def285);
							eventsensor_def();
							state._fsp--;

							}
							break;

						default :
							break loop12;
						}
					}

					}
					break;

				default :
					break loop13;
				}
			}

			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:59:8: ( 'requestBasedSensors' ':' ( requestsensor_def )* )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==29) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:59:9: 'requestBasedSensors' ':' ( requestsensor_def )*
					{
					match(input,29,FOLLOW_29_in_sensor_def301); 
					match(input,11,FOLLOW_11_in_sensor_def303); 
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:59:35: ( requestsensor_def )*
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( (LA14_0==CAPITALIZED_ID) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:59:36: requestsensor_def
							{
							pushFollow(FOLLOW_requestsensor_def_in_sensor_def306);
							requestsensor_def();
							state._fsp--;

							}
							break;

						default :
							break loop14;
						}
					}

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
	// $ANTLR end "sensor_def"



	// $ANTLR start "periodicsensor_def"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:62:1: periodicsensor_def : CAPITALIZED_ID ( sensorMeasurementForPeriodic_def ';' )* ( sensorperiodicMeasurement_def ';' )* ;
	public final void periodicsensor_def() throws RecognitionException {
		Token CAPITALIZED_ID4=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:62:19: ( CAPITALIZED_ID ( sensorMeasurementForPeriodic_def ';' )* ( sensorperiodicMeasurement_def ';' )* )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:63:2: CAPITALIZED_ID ( sensorMeasurementForPeriodic_def ';' )* ( sensorperiodicMeasurement_def ';' )*
			{
			CAPITALIZED_ID4=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_periodicsensor_def320); 
			context.currentSensor = new SensorCompiler((CAPITALIZED_ID4!=null?CAPITALIZED_ID4.getText():null));
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:65:5: ( sensorMeasurementForPeriodic_def ';' )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==24) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:65:6: sensorMeasurementForPeriodic_def ';'
					{
					pushFollow(FOLLOW_sensorMeasurementForPeriodic_def_in_periodicsensor_def333);
					sensorMeasurementForPeriodic_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_periodicsensor_def335); 
					}
					break;

				default :
					break loop16;
				}
			}

			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:66:5: ( sensorperiodicMeasurement_def ';' )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==31) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:66:6: sensorperiodicMeasurement_def ';'
					{
					pushFollow(FOLLOW_sensorperiodicMeasurement_def_in_periodicsensor_def345);
					sensorperiodicMeasurement_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_periodicsensor_def347); 
					}
					break;

				default :
					break loop17;
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



	// $ANTLR start "tagsensor_def"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:72:1: tagsensor_def : CAPITALIZED_ID ( sensorMeasurementForTag_def ';' )* ;
	public final void tagsensor_def() throws RecognitionException {
		Token CAPITALIZED_ID5=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:72:14: ( CAPITALIZED_ID ( sensorMeasurementForTag_def ';' )* )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:73:2: CAPITALIZED_ID ( sensorMeasurementForTag_def ';' )*
			{
			CAPITALIZED_ID5=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_tagsensor_def366); 
			context.currentSensor = new SensorCompiler((CAPITALIZED_ID5!=null?CAPITALIZED_ID5.getText():null));
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:75:5: ( sensorMeasurementForTag_def ';' )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==24) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:75:6: sensorMeasurementForTag_def ';'
					{
					pushFollow(FOLLOW_sensorMeasurementForTag_def_in_tagsensor_def379);
					sensorMeasurementForTag_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_tagsensor_def381); 
					}
					break;

				default :
					break loop18;
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
	// $ANTLR end "tagsensor_def"



	// $ANTLR start "eventsensor_def"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:81:1: eventsensor_def : CAPITALIZED_ID ( sensorMeasurementForEventDriven_def ';' )* ( sensoreventMeasurement_def ';' )* ;
	public final void eventsensor_def() throws RecognitionException {
		Token CAPITALIZED_ID6=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:81:16: ( CAPITALIZED_ID ( sensorMeasurementForEventDriven_def ';' )* ( sensoreventMeasurement_def ';' )* )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:82:2: CAPITALIZED_ID ( sensorMeasurementForEventDriven_def ';' )* ( sensoreventMeasurement_def ';' )*
			{
			CAPITALIZED_ID6=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_eventsensor_def403); 
			context.currentSensor = new SensorCompiler((CAPITALIZED_ID6!=null?CAPITALIZED_ID6.getText():null));
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:84:5: ( sensorMeasurementForEventDriven_def ';' )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==24) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:84:6: sensorMeasurementForEventDriven_def ';'
					{
					pushFollow(FOLLOW_sensorMeasurementForEventDriven_def_in_eventsensor_def416);
					sensorMeasurementForEventDriven_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_eventsensor_def418); 
					}
					break;

				default :
					break loop19;
				}
			}

			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:85:5: ( sensoreventMeasurement_def ';' )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==12||LA20_0==26) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:85:6: sensoreventMeasurement_def ';'
					{
					pushFollow(FOLLOW_sensoreventMeasurement_def_in_eventsensor_def428);
					sensoreventMeasurement_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_eventsensor_def430); 
					}
					break;

				default :
					break loop20;
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



	// $ANTLR start "requestsensor_def"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:91:1: requestsensor_def : CAPITALIZED_ID ( webServiceDataAccess_def ';' )* ( storageActionAccess_def ';' )* ;
	public final void requestsensor_def() throws RecognitionException {
		Token CAPITALIZED_ID7=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:91:18: ( CAPITALIZED_ID ( webServiceDataAccess_def ';' )* ( storageActionAccess_def ';' )* )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:92:3: CAPITALIZED_ID ( webServiceDataAccess_def ';' )* ( storageActionAccess_def ';' )*
			{
			CAPITALIZED_ID7=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_requestsensor_def452); 
			 context.currentStorageService = new StorageCompiler();   
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:94:5: ( webServiceDataAccess_def ';' )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==24) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:94:6: webServiceDataAccess_def ';'
					{
					pushFollow(FOLLOW_webServiceDataAccess_def_in_requestsensor_def467);
					webServiceDataAccess_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_requestsensor_def469); 
					}
					break;

				default :
					break loop21;
				}
			}

			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:95:5: ( storageActionAccess_def ';' )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==12||LA22_0==18) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:95:6: storageActionAccess_def ';'
					{
					pushFollow(FOLLOW_storageActionAccess_def_in_requestsensor_def478);
					storageActionAccess_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_requestsensor_def480); 
					}
					break;

				default :
					break loop22;
				}
			}


			     context.currentStorageService.setStorageServiceName((CAPITALIZED_ID7!=null?CAPITALIZED_ID7.getText():null));
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
	// $ANTLR end "requestsensor_def"



	// $ANTLR start "webServiceDataAccess_def"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:102:1: webServiceDataAccess_def : webServiceGeneratedInfo_def 'accessed-by' webServicedataIndex_def ;
	public final void webServiceDataAccess_def() throws RecognitionException {
		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:102:26: ( webServiceGeneratedInfo_def 'accessed-by' webServicedataIndex_def )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:103:6: webServiceGeneratedInfo_def 'accessed-by' webServicedataIndex_def
			{
			pushFollow(FOLLOW_webServiceGeneratedInfo_def_in_webServiceDataAccess_def509);
			webServiceGeneratedInfo_def();
			state._fsp--;

			match(input,17,FOLLOW_17_in_webServiceDataAccess_def512); 
			pushFollow(FOLLOW_webServicedataIndex_def_in_webServiceDataAccess_def514);
			webServicedataIndex_def();
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
	// $ANTLR end "webServiceDataAccess_def"



	// $ANTLR start "webServiceGeneratedInfo_def"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:107:1: webServiceGeneratedInfo_def : 'generate' lc_id ':' CAPITALIZED_ID ;
	public final void webServiceGeneratedInfo_def() throws RecognitionException {
		Token CAPITALIZED_ID8=null;
		ParserRuleReturnScope lc_id9 =null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:107:29: ( 'generate' lc_id ':' CAPITALIZED_ID )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:108:5: 'generate' lc_id ':' CAPITALIZED_ID
			{
			match(input,24,FOLLOW_24_in_webServiceGeneratedInfo_def532); 
			pushFollow(FOLLOW_lc_id_in_webServiceGeneratedInfo_def534);
			lc_id9=lc_id();
			state._fsp--;

			match(input,11,FOLLOW_11_in_webServiceGeneratedInfo_def536); 
			CAPITALIZED_ID8=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_webServiceGeneratedInfo_def539); 

			     context.constructStorageSymblTable((CAPITALIZED_ID8!=null?CAPITALIZED_ID8.getText():null));
			     context.currentStorageService.addGeneratedInfo((lc_id9!=null?input.toString(lc_id9.start,lc_id9.stop):null), (CAPITALIZED_ID8!=null?CAPITALIZED_ID8.getText():null));  
			      context.constructSymbTable((lc_id9!=null?input.toString(lc_id9.start,lc_id9.stop):null), (CAPITALIZED_ID8!=null?CAPITALIZED_ID8.getText():null));
			   context.constructResponseTypeSymblTable((lc_id9!=null?input.toString(lc_id9.start,lc_id9.stop):null), (CAPITALIZED_ID8!=null?CAPITALIZED_ID8.getText():null));
			    
			   
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
	// $ANTLR end "webServiceGeneratedInfo_def"



	// $ANTLR start "webServicedataIndex_def"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:118:1: webServicedataIndex_def : lc_id ':' dataType ;
	public final void webServicedataIndex_def() throws RecognitionException {
		ParserRuleReturnScope lc_id10 =null;
		ParserRuleReturnScope dataType11 =null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:118:24: ( lc_id ':' dataType )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:119:9: lc_id ':' dataType
			{
			pushFollow(FOLLOW_lc_id_in_webServicedataIndex_def566);
			lc_id10=lc_id();
			state._fsp--;

			match(input,11,FOLLOW_11_in_webServicedataIndex_def568); 
			pushFollow(FOLLOW_dataType_in_webServicedataIndex_def570);
			dataType11=dataType();
			state._fsp--;

			 context.currentStorageService.addDataAccessIndex((lc_id10!=null?input.toString(lc_id10.start,lc_id10.stop):null), (dataType11!=null?input.toString(dataType11.start,dataType11.stop):null)); 
			      context.constructStorageInfoSymblTable((lc_id10!=null?input.toString(lc_id10.start,lc_id10.stop):null), (dataType11!=null?input.toString(dataType11.start,dataType11.stop):null));
			        
			      
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
	// $ANTLR end "webServicedataIndex_def"



	// $ANTLR start "sensorMeasurementForEventDriven_def"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:125:1: sensorMeasurementForEventDriven_def : 'generate' lc_id ':' CAPITALIZED_ID ;
	public final void sensorMeasurementForEventDriven_def() throws RecognitionException {
		Token CAPITALIZED_ID13=null;
		ParserRuleReturnScope lc_id12 =null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:125:36: ( 'generate' lc_id ':' CAPITALIZED_ID )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:126:1: 'generate' lc_id ':' CAPITALIZED_ID
			{
			match(input,24,FOLLOW_24_in_sensorMeasurementForEventDriven_def589); 
			pushFollow(FOLLOW_lc_id_in_sensorMeasurementForEventDriven_def591);
			lc_id12=lc_id();
			state._fsp--;

			match(input,11,FOLLOW_11_in_sensorMeasurementForEventDriven_def593); 
			CAPITALIZED_ID13=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_sensorMeasurementForEventDriven_def596); 
			  
			    context.currentSensor.addSensorMeasurement((lc_id12!=null?input.toString(lc_id12.start,lc_id12.stop):null), (CAPITALIZED_ID13!=null?CAPITALIZED_ID13.getText():null) , context.getStructSymblTable((CAPITALIZED_ID13!=null?CAPITALIZED_ID13.getText():null)) ); 
			    context.constructSymbTable((lc_id12!=null?input.toString(lc_id12.start,lc_id12.stop):null), (CAPITALIZED_ID13!=null?CAPITALIZED_ID13.getText():null));
			    context.constructEventDrivenSymblTable((CAPITALIZED_ID13!=null?CAPITALIZED_ID13.getText():null));
			     
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



	// $ANTLR start "sensorMeasurementForTag_def"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:134:1: sensorMeasurementForTag_def : 'generate' lc_id ':' CAPITALIZED_ID ;
	public final void sensorMeasurementForTag_def() throws RecognitionException {
		Token CAPITALIZED_ID15=null;
		ParserRuleReturnScope lc_id14 =null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:134:28: ( 'generate' lc_id ':' CAPITALIZED_ID )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:135:1: 'generate' lc_id ':' CAPITALIZED_ID
			{
			match(input,24,FOLLOW_24_in_sensorMeasurementForTag_def613); 
			pushFollow(FOLLOW_lc_id_in_sensorMeasurementForTag_def615);
			lc_id14=lc_id();
			state._fsp--;

			match(input,11,FOLLOW_11_in_sensorMeasurementForTag_def617); 
			CAPITALIZED_ID15=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_sensorMeasurementForTag_def620); 
			  
			    context.currentSensor.addSensorMeasurement((lc_id14!=null?input.toString(lc_id14.start,lc_id14.stop):null), (CAPITALIZED_ID15!=null?CAPITALIZED_ID15.getText():null) , context.getStructSymblTable((CAPITALIZED_ID15!=null?CAPITALIZED_ID15.getText():null)) ); 
			    context.constructSymbTable((lc_id14!=null?input.toString(lc_id14.start,lc_id14.stop):null), (CAPITALIZED_ID15!=null?CAPITALIZED_ID15.getText():null));
			  //  context.constructEventDrivenSymblTable((CAPITALIZED_ID15!=null?CAPITALIZED_ID15.getText():null));
			     
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
	// $ANTLR end "sensorMeasurementForTag_def"



	// $ANTLR start "sensorMeasurementForPeriodic_def"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:142:1: sensorMeasurementForPeriodic_def : 'generate' lc_id ':' CAPITALIZED_ID ;
	public final void sensorMeasurementForPeriodic_def() throws RecognitionException {
		Token CAPITALIZED_ID17=null;
		ParserRuleReturnScope lc_id16 =null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:142:34: ( 'generate' lc_id ':' CAPITALIZED_ID )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:143:5: 'generate' lc_id ':' CAPITALIZED_ID
			{
			match(input,24,FOLLOW_24_in_sensorMeasurementForPeriodic_def642); 
			pushFollow(FOLLOW_lc_id_in_sensorMeasurementForPeriodic_def644);
			lc_id16=lc_id();
			state._fsp--;

			match(input,11,FOLLOW_11_in_sensorMeasurementForPeriodic_def646); 
			CAPITALIZED_ID17=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_sensorMeasurementForPeriodic_def649); 
			      
			    context.currentSensor.addSensorMeasurement((lc_id16!=null?input.toString(lc_id16.start,lc_id16.stop):null), (CAPITALIZED_ID17!=null?CAPITALIZED_ID17.getText():null) , context.getStructSymblTable((CAPITALIZED_ID17!=null?CAPITALIZED_ID17.getText():null)) ); 
			    context.constructSymbTable((lc_id16!=null?input.toString(lc_id16.start,lc_id16.stop):null), (CAPITALIZED_ID17!=null?CAPITALIZED_ID17.getText():null));  
			    context.constructPeriodicSymbltable((CAPITALIZED_ID17!=null?CAPITALIZED_ID17.getText():null));
			    
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
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:151:1: sensorperiodicMeasurement_def : 'sample' 'period' ( sample_period_def )* 'for' ( sample_duration_def )* ;
	public final void sensorperiodicMeasurement_def() throws RecognitionException {
		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:151:30: ( 'sample' 'period' ( sample_period_def )* 'for' ( sample_duration_def )* )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:152:2: 'sample' 'period' ( sample_period_def )* 'for' ( sample_duration_def )*
			{
			match(input,31,FOLLOW_31_in_sensorperiodicMeasurement_def674); 
			match(input,27,FOLLOW_27_in_sensorperiodicMeasurement_def676); 
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:152:20: ( sample_period_def )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==INT) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:152:21: sample_period_def
					{
					pushFollow(FOLLOW_sample_period_def_in_sensorperiodicMeasurement_def679);
					sample_period_def();
					state._fsp--;

					}
					break;

				default :
					break loop23;
				}
			}

			match(input,23,FOLLOW_23_in_sensorperiodicMeasurement_def683); 
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:152:47: ( sample_duration_def )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==INT) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:152:48: sample_duration_def
					{
					pushFollow(FOLLOW_sample_duration_def_in_sensorperiodicMeasurement_def686);
					sample_duration_def();
					state._fsp--;

					}
					break;

				default :
					break loop24;
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
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:155:1: sample_period_def : INT ;
	public final void sample_period_def() throws RecognitionException {
		Token INT18=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:155:19: ( INT )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:156:3: INT
			{
			INT18=(Token)match(input,INT,FOLLOW_INT_in_sample_period_def701); 

			context.currentSensor.addSensorMeasurementSamplePeriod((INT18!=null?INT18.getText():null));

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
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:162:1: sample_duration_def : INT ;
	public final void sample_duration_def() throws RecognitionException {
		Token INT19=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:162:21: ( INT )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:163:1: INT
			{
			INT19=(Token)match(input,INT,FOLLOW_INT_in_sample_duration_def714); 

			context.currentSensor.addSensorMeasurementSampleDuration((INT19!=null?INT19.getText():null));

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
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:169:1: sensoreventMeasurement_def : ( 'onCondition' ( ID | ',' ID )* )* ;
	public final void sensoreventMeasurement_def() throws RecognitionException {
		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:169:27: ( ( 'onCondition' ( ID | ',' ID )* )* )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:170:2: ( 'onCondition' ( ID | ',' ID )* )*
			{
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:170:2: ( 'onCondition' ( ID | ',' ID )* )*
			loop26:
			while (true) {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( (LA26_0==26) ) {
					alt26=1;
				}

				switch (alt26) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:170:2: 'onCondition' ( ID | ',' ID )*
					{
					match(input,26,FOLLOW_26_in_sensoreventMeasurement_def726); 
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:170:16: ( ID | ',' ID )*
					loop25:
					while (true) {
						int alt25=3;
						int LA25_0 = input.LA(1);
						if ( (LA25_0==ID) ) {
							alt25=1;
						}
						else if ( (LA25_0==10) ) {
							alt25=2;
						}

						switch (alt25) {
						case 1 :
							// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:170:17: ID
							{
							match(input,ID,FOLLOW_ID_in_sensoreventMeasurement_def729); 
							}
							break;
						case 2 :
							// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:170:21: ',' ID
							{
							match(input,10,FOLLOW_10_in_sensoreventMeasurement_def732); 
							match(input,ID,FOLLOW_ID_in_sensoreventMeasurement_def734); 
							}
							break;

						default :
							break loop25;
						}
					}

					}
					break;

				default :
					break loop26;
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
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:173:1: actuator_def : CAPITALIZED_ID ( action_def ';' )* ;
	public final void actuator_def() throws RecognitionException {
		Token CAPITALIZED_ID20=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:173:13: ( CAPITALIZED_ID ( action_def ';' )* )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:174:4: CAPITALIZED_ID ( action_def ';' )*
			{
			CAPITALIZED_ID20=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_actuator_def749); 
			context.currentActuator = new ActuatorCompiler((CAPITALIZED_ID20!=null?CAPITALIZED_ID20.getText():null));
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:176:4: ( action_def ';' )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==18) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:176:5: action_def ';'
					{
					pushFollow(FOLLOW_action_def_in_actuator_def761);
					action_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_actuator_def763); 
					}
					break;

				default :
					break loop27;
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
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:179:1: action_def : 'action' CAPITALIZED_ID '(' ( parameter_def )? ')' ;
	public final void action_def() throws RecognitionException {
		Token CAPITALIZED_ID21=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:179:11: ( 'action' CAPITALIZED_ID '(' ( parameter_def )? ')' )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:180:5: 'action' CAPITALIZED_ID '(' ( parameter_def )? ')'
			{
			match(input,18,FOLLOW_18_in_action_def785); 
			CAPITALIZED_ID21=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_action_def787); 
			match(input,8,FOLLOW_8_in_action_def789); 
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:180:33: ( parameter_def )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==ID) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:180:34: parameter_def
					{
					pushFollow(FOLLOW_parameter_def_in_action_def792);
					parameter_def();
					state._fsp--;

					}
					break;

			}

			match(input,9,FOLLOW_9_in_action_def796); 
			 context.currentActuator.addAction((CAPITALIZED_ID21!=null?CAPITALIZED_ID21.getText():null)); 
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
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:184:1: parameter_def : lc_id ':' CAPITALIZED_ID ( ',' parameter_def )? ;
	public final void parameter_def() throws RecognitionException {
		Token CAPITALIZED_ID22=null;
		ParserRuleReturnScope lc_id23 =null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:184:15: ( lc_id ':' CAPITALIZED_ID ( ',' parameter_def )? )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:185:5: lc_id ':' CAPITALIZED_ID ( ',' parameter_def )?
			{
			pushFollow(FOLLOW_lc_id_in_parameter_def816);
			lc_id23=lc_id();
			state._fsp--;

			match(input,11,FOLLOW_11_in_parameter_def818); 
			CAPITALIZED_ID22=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_parameter_def821); 
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:185:31: ( ',' parameter_def )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==10) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:185:32: ',' parameter_def
					{
					match(input,10,FOLLOW_10_in_parameter_def824); 
					pushFollow(FOLLOW_parameter_def_in_parameter_def826);
					parameter_def();
					state._fsp--;

					}
					break;

			}

			 
			     context.constructActuatorSymblTable((CAPITALIZED_ID22!=null?CAPITALIZED_ID22.getText():null));    
			     context.currentActuator.addParameter((lc_id23!=null?input.toString(lc_id23.start,lc_id23.stop):null), (CAPITALIZED_ID22!=null?CAPITALIZED_ID22.getText():null)); 
			     context.constructSymbTable((lc_id23!=null?input.toString(lc_id23.start,lc_id23.stop):null), (CAPITALIZED_ID22!=null?CAPITALIZED_ID22.getText():null));
			    
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
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:192:1: ss_def : CAPITALIZED_ID ( storageDataAccess_def ';' )* ( storageActionAccess_def ';' )* ;
	public final void ss_def() throws RecognitionException {
		Token CAPITALIZED_ID24=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:192:7: ( CAPITALIZED_ID ( storageDataAccess_def ';' )* ( storageActionAccess_def ';' )* )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:193:3: CAPITALIZED_ID ( storageDataAccess_def ';' )* ( storageActionAccess_def ';' )*
			{
			CAPITALIZED_ID24=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_ss_def844); 
			 context.currentStorageService = new StorageCompiler();
			    
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:196:5: ( storageDataAccess_def ';' )*
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==24) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:196:6: storageDataAccess_def ';'
					{
					pushFollow(FOLLOW_storageDataAccess_def_in_ss_def859);
					storageDataAccess_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_ss_def861); 
					}
					break;

				default :
					break loop30;
				}
			}

			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:197:5: ( storageActionAccess_def ';' )*
			loop31:
			while (true) {
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( (LA31_0==12||LA31_0==18) ) {
					alt31=1;
				}

				switch (alt31) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:197:6: storageActionAccess_def ';'
					{
					pushFollow(FOLLOW_storageActionAccess_def_in_ss_def870);
					storageActionAccess_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_ss_def872); 
					}
					break;

				default :
					break loop31;
				}
			}


			     context.currentStorageService.setStorageServiceName((CAPITALIZED_ID24!=null?CAPITALIZED_ID24.getText():null));
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
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:205:1: storageActionAccess_def : ( storageAction_def )* ;
	public final void storageActionAccess_def() throws RecognitionException {
		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:205:24: ( ( storageAction_def )* )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:206:4: ( storageAction_def )*
			{
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:206:4: ( storageAction_def )*
			loop32:
			while (true) {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==18) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:206:5: storageAction_def
					{
					pushFollow(FOLLOW_storageAction_def_in_storageActionAccess_def895);
					storageAction_def();
					state._fsp--;

					}
					break;

				default :
					break loop32;
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
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:209:1: storageAction_def : 'action' CAPITALIZED_ID '(' ( storageParameter_def )? ')' ;
	public final void storageAction_def() throws RecognitionException {
		Token CAPITALIZED_ID25=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:209:18: ( 'action' CAPITALIZED_ID '(' ( storageParameter_def )? ')' )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:210:5: 'action' CAPITALIZED_ID '(' ( storageParameter_def )? ')'
			{
			match(input,18,FOLLOW_18_in_storageAction_def920); 
			CAPITALIZED_ID25=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_storageAction_def922); 
			match(input,8,FOLLOW_8_in_storageAction_def924); 
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:210:33: ( storageParameter_def )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==ID) ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:210:34: storageParameter_def
					{
					pushFollow(FOLLOW_storageParameter_def_in_storageAction_def927);
					storageParameter_def();
					state._fsp--;

					}
					break;

			}

			match(input,9,FOLLOW_9_in_storageAction_def931); 
			context.currentStorageService.addAction((CAPITALIZED_ID25!=null?CAPITALIZED_ID25.getText():null));
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
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:214:1: storageParameter_def : lc_id ':' CAPITALIZED_ID ( ',' storageParameter_def )? ;
	public final void storageParameter_def() throws RecognitionException {
		Token CAPITALIZED_ID26=null;
		ParserRuleReturnScope lc_id27 =null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:214:22: ( lc_id ':' CAPITALIZED_ID ( ',' storageParameter_def )? )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:215:5: lc_id ':' CAPITALIZED_ID ( ',' storageParameter_def )?
			{
			pushFollow(FOLLOW_lc_id_in_storageParameter_def951);
			lc_id27=lc_id();
			state._fsp--;

			match(input,11,FOLLOW_11_in_storageParameter_def953); 
			CAPITALIZED_ID26=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_storageParameter_def956); 
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:215:31: ( ',' storageParameter_def )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==10) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:215:32: ',' storageParameter_def
					{
					match(input,10,FOLLOW_10_in_storageParameter_def959); 
					pushFollow(FOLLOW_storageParameter_def_in_storageParameter_def961);
					storageParameter_def();
					state._fsp--;

					}
					break;

			}

			 
			     context.constructStorageActionSymlTable((CAPITALIZED_ID26!=null?CAPITALIZED_ID26.getText():null));    
			     context.currentStorageService.addParameter((lc_id27!=null?input.toString(lc_id27.start,lc_id27.stop):null), (CAPITALIZED_ID26!=null?CAPITALIZED_ID26.getText():null));  
			     context.constructSymbTable((lc_id27!=null?input.toString(lc_id27.start,lc_id27.stop):null), (CAPITALIZED_ID26!=null?CAPITALIZED_ID26.getText():null));
			    
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
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:224:1: storageDataAccess_def : storageGeneratedInfo_def 'accessed-by' storagedataIndex_def ;
	public final void storageDataAccess_def() throws RecognitionException {
		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:224:23: ( storageGeneratedInfo_def 'accessed-by' storagedataIndex_def )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:225:6: storageGeneratedInfo_def 'accessed-by' storagedataIndex_def
			{
			pushFollow(FOLLOW_storageGeneratedInfo_def_in_storageDataAccess_def986);
			storageGeneratedInfo_def();
			state._fsp--;

			match(input,17,FOLLOW_17_in_storageDataAccess_def989); 
			pushFollow(FOLLOW_storagedataIndex_def_in_storageDataAccess_def991);
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
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:229:1: storageGeneratedInfo_def : 'generate' lc_id ':' CAPITALIZED_ID ;
	public final void storageGeneratedInfo_def() throws RecognitionException {
		Token CAPITALIZED_ID28=null;
		ParserRuleReturnScope lc_id29 =null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:229:26: ( 'generate' lc_id ':' CAPITALIZED_ID )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:230:5: 'generate' lc_id ':' CAPITALIZED_ID
			{
			match(input,24,FOLLOW_24_in_storageGeneratedInfo_def1010); 
			pushFollow(FOLLOW_lc_id_in_storageGeneratedInfo_def1012);
			lc_id29=lc_id();
			state._fsp--;

			match(input,11,FOLLOW_11_in_storageGeneratedInfo_def1014); 
			CAPITALIZED_ID28=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_storageGeneratedInfo_def1017); 

			     context.constructStorageSymblTable((CAPITALIZED_ID28!=null?CAPITALIZED_ID28.getText():null));
			     context.currentStorageService.addGeneratedInfo((lc_id29!=null?input.toString(lc_id29.start,lc_id29.stop):null), (CAPITALIZED_ID28!=null?CAPITALIZED_ID28.getText():null));  
			      context.constructSymbTable((lc_id29!=null?input.toString(lc_id29.start,lc_id29.stop):null), (CAPITALIZED_ID28!=null?CAPITALIZED_ID28.getText():null));
			    context.constructResponseTypeSymblTable((lc_id29!=null?input.toString(lc_id29.start,lc_id29.stop):null), (CAPITALIZED_ID28!=null?CAPITALIZED_ID28.getText():null));
			   
			    
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
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:240:1: storagedataIndex_def : lc_id ':' dataType ;
	public final void storagedataIndex_def() throws RecognitionException {
		ParserRuleReturnScope lc_id30 =null;
		ParserRuleReturnScope dataType31 =null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:240:21: ( lc_id ':' dataType )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:241:9: lc_id ':' dataType
			{
			pushFollow(FOLLOW_lc_id_in_storagedataIndex_def1039);
			lc_id30=lc_id();
			state._fsp--;

			match(input,11,FOLLOW_11_in_storagedataIndex_def1041); 
			pushFollow(FOLLOW_dataType_in_storagedataIndex_def1043);
			dataType31=dataType();
			state._fsp--;

			 context.currentStorageService.addDataAccessIndex((lc_id30!=null?input.toString(lc_id30.start,lc_id30.stop):null), (dataType31!=null?input.toString(dataType31.start,dataType31.stop):null)); 
			        context.constructStorageInfoSymblTable((lc_id30!=null?input.toString(lc_id30.start,lc_id30.stop):null), (dataType31!=null?input.toString(dataType31.start,dataType31.stop):null));
			        
			         
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
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:248:1: lc_id : ID ;
	public final VocabSpecParser.lc_id_return lc_id() throws RecognitionException {
		VocabSpecParser.lc_id_return retval = new VocabSpecParser.lc_id_return();
		retval.start = input.LT(1);

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:248:6: ( ID )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:248:8: ID
			{
			match(input,ID,FOLLOW_ID_in_lc_id1061); 
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
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:251:1: dataType : primitiveType ;
	public final VocabSpecParser.dataType_return dataType() throws RecognitionException {
		VocabSpecParser.dataType_return retval = new VocabSpecParser.dataType_return();
		retval.start = input.LT(1);

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:251:9: ( primitiveType )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:252:3: primitiveType
			{
			pushFollow(FOLLOW_primitiveType_in_dataType1074);
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
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:255:1: primitiveType : (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' |id= '_' ) ;
	public final void primitiveType() throws RecognitionException {
		Token id=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:255:14: ( (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' |id= '_' ) )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:256:3: (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' |id= '_' )
			{
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:256:3: (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' |id= '_' )
			int alt35=7;
			switch ( input.LA(1) ) {
			case 14:
				{
				alt35=1;
				}
				break;
			case 13:
				{
				alt35=2;
				}
				break;
			case 15:
				{
				alt35=3;
				}
				break;
			case 21:
				{
				alt35=4;
				}
				break;
			case 25:
				{
				alt35=5;
				}
				break;
			case 20:
				{
				alt35=6;
				}
				break;
			case 16:
				{
				alt35=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 35, 0, input);
				throw nvae;
			}
			switch (alt35) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:256:4: id= 'Integer'
					{
					id=(Token)match(input,14,FOLLOW_14_in_primitiveType1090); 
					}
					break;
				case 2 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:256:19: id= 'Boolean'
					{
					id=(Token)match(input,13,FOLLOW_13_in_primitiveType1096); 
					}
					break;
				case 3 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:256:34: id= 'String'
					{
					id=(Token)match(input,15,FOLLOW_15_in_primitiveType1102); 
					}
					break;
				case 4 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:256:49: id= 'double'
					{
					id=(Token)match(input,21,FOLLOW_21_in_primitiveType1111); 
					}
					break;
				case 5 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:256:65: id= 'long'
					{
					id=(Token)match(input,25,FOLLOW_25_in_primitiveType1119); 
					}
					break;
				case 6 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:256:79: id= 'boolean'
					{
					id=(Token)match(input,20,FOLLOW_20_in_primitiveType1125); 
					}
					break;
				case 7 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:256:92: id= '_'
					{
					id=(Token)match(input,16,FOLLOW_16_in_primitiveType1130); 
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



	public static final BitSet FOLLOW_34_in_vocabSpec75 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_vocabSpec77 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_struct_def_in_vocabSpec80 = new BitSet(new long[]{0x0000000040000010L});
	public static final BitSet FOLLOW_30_in_vocabSpec90 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_vocabSpec92 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_abilities_def_in_vocabSpec94 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_struct_def113 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_structField_def_in_struct_def127 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_struct_def129 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_lc_id_in_structField_def157 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_structField_def159 = new BitSet(new long[]{0x000000000231E000L});
	public static final BitSet FOLLOW_dataType_in_structField_def161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_abilities_def186 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_abilities_def188 = new BitSet(new long[]{0x0000000B30480000L});
	public static final BitSet FOLLOW_sensor_def_in_abilities_def192 = new BitSet(new long[]{0x0000000B00080002L});
	public static final BitSet FOLLOW_35_in_abilities_def200 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_abilities_def202 = new BitSet(new long[]{0x0000000A00080012L});
	public static final BitSet FOLLOW_tagsensor_def_in_abilities_def205 = new BitSet(new long[]{0x0000000A00080012L});
	public static final BitSet FOLLOW_19_in_abilities_def216 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_abilities_def218 = new BitSet(new long[]{0x0000000200080012L});
	public static final BitSet FOLLOW_actuator_def_in_abilities_def221 = new BitSet(new long[]{0x0000000200080012L});
	public static final BitSet FOLLOW_33_in_abilities_def231 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_abilities_def234 = new BitSet(new long[]{0x0000000200000012L});
	public static final BitSet FOLLOW_ss_def_in_abilities_def237 = new BitSet(new long[]{0x0000000200000012L});
	public static final BitSet FOLLOW_28_in_sensor_def263 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_sensor_def265 = new BitSet(new long[]{0x0000000030400012L});
	public static final BitSet FOLLOW_periodicsensor_def_in_sensor_def267 = new BitSet(new long[]{0x0000000030400012L});
	public static final BitSet FOLLOW_22_in_sensor_def280 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_sensor_def282 = new BitSet(new long[]{0x0000000020400012L});
	public static final BitSet FOLLOW_eventsensor_def_in_sensor_def285 = new BitSet(new long[]{0x0000000020400012L});
	public static final BitSet FOLLOW_29_in_sensor_def301 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_sensor_def303 = new BitSet(new long[]{0x0000000020000012L});
	public static final BitSet FOLLOW_requestsensor_def_in_sensor_def306 = new BitSet(new long[]{0x0000000020000012L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_periodicsensor_def320 = new BitSet(new long[]{0x0000000081000002L});
	public static final BitSet FOLLOW_sensorMeasurementForPeriodic_def_in_periodicsensor_def333 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_periodicsensor_def335 = new BitSet(new long[]{0x0000000081000002L});
	public static final BitSet FOLLOW_sensorperiodicMeasurement_def_in_periodicsensor_def345 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_periodicsensor_def347 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_tagsensor_def366 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_sensorMeasurementForTag_def_in_tagsensor_def379 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_tagsensor_def381 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_eventsensor_def403 = new BitSet(new long[]{0x0000000005001002L});
	public static final BitSet FOLLOW_sensorMeasurementForEventDriven_def_in_eventsensor_def416 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_eventsensor_def418 = new BitSet(new long[]{0x0000000005001002L});
	public static final BitSet FOLLOW_sensoreventMeasurement_def_in_eventsensor_def428 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_eventsensor_def430 = new BitSet(new long[]{0x0000000004001002L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_requestsensor_def452 = new BitSet(new long[]{0x0000000001041002L});
	public static final BitSet FOLLOW_webServiceDataAccess_def_in_requestsensor_def467 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_requestsensor_def469 = new BitSet(new long[]{0x0000000001041002L});
	public static final BitSet FOLLOW_storageActionAccess_def_in_requestsensor_def478 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_requestsensor_def480 = new BitSet(new long[]{0x0000000000041002L});
	public static final BitSet FOLLOW_webServiceGeneratedInfo_def_in_webServiceDataAccess_def509 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_webServiceDataAccess_def512 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_webServicedataIndex_def_in_webServiceDataAccess_def514 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_webServiceGeneratedInfo_def532 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_lc_id_in_webServiceGeneratedInfo_def534 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_webServiceGeneratedInfo_def536 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_webServiceGeneratedInfo_def539 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lc_id_in_webServicedataIndex_def566 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_webServicedataIndex_def568 = new BitSet(new long[]{0x000000000231E000L});
	public static final BitSet FOLLOW_dataType_in_webServicedataIndex_def570 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_sensorMeasurementForEventDriven_def589 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_lc_id_in_sensorMeasurementForEventDriven_def591 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_sensorMeasurementForEventDriven_def593 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_sensorMeasurementForEventDriven_def596 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_sensorMeasurementForTag_def613 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_lc_id_in_sensorMeasurementForTag_def615 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_sensorMeasurementForTag_def617 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_sensorMeasurementForTag_def620 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_sensorMeasurementForPeriodic_def642 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_lc_id_in_sensorMeasurementForPeriodic_def644 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_sensorMeasurementForPeriodic_def646 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_sensorMeasurementForPeriodic_def649 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_sensorperiodicMeasurement_def674 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_sensorperiodicMeasurement_def676 = new BitSet(new long[]{0x0000000000800040L});
	public static final BitSet FOLLOW_sample_period_def_in_sensorperiodicMeasurement_def679 = new BitSet(new long[]{0x0000000000800040L});
	public static final BitSet FOLLOW_23_in_sensorperiodicMeasurement_def683 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_sample_duration_def_in_sensorperiodicMeasurement_def686 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_INT_in_sample_period_def701 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_sample_duration_def714 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_sensoreventMeasurement_def726 = new BitSet(new long[]{0x0000000004000422L});
	public static final BitSet FOLLOW_ID_in_sensoreventMeasurement_def729 = new BitSet(new long[]{0x0000000004000422L});
	public static final BitSet FOLLOW_10_in_sensoreventMeasurement_def732 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_sensoreventMeasurement_def734 = new BitSet(new long[]{0x0000000004000422L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_actuator_def749 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_action_def_in_actuator_def761 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_actuator_def763 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_18_in_action_def785 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_action_def787 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_action_def789 = new BitSet(new long[]{0x0000000000000220L});
	public static final BitSet FOLLOW_parameter_def_in_action_def792 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_action_def796 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lc_id_in_parameter_def816 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_parameter_def818 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_parameter_def821 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_10_in_parameter_def824 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_parameter_def_in_parameter_def826 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_ss_def844 = new BitSet(new long[]{0x0000000001041002L});
	public static final BitSet FOLLOW_storageDataAccess_def_in_ss_def859 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_ss_def861 = new BitSet(new long[]{0x0000000001041002L});
	public static final BitSet FOLLOW_storageActionAccess_def_in_ss_def870 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_ss_def872 = new BitSet(new long[]{0x0000000000041002L});
	public static final BitSet FOLLOW_storageAction_def_in_storageActionAccess_def895 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_18_in_storageAction_def920 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_storageAction_def922 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_storageAction_def924 = new BitSet(new long[]{0x0000000000000220L});
	public static final BitSet FOLLOW_storageParameter_def_in_storageAction_def927 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_storageAction_def931 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lc_id_in_storageParameter_def951 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_storageParameter_def953 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_storageParameter_def956 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_10_in_storageParameter_def959 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_storageParameter_def_in_storageParameter_def961 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_storageGeneratedInfo_def_in_storageDataAccess_def986 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_storageDataAccess_def989 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_storagedataIndex_def_in_storageDataAccess_def991 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_storageGeneratedInfo_def1010 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_lc_id_in_storageGeneratedInfo_def1012 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_storageGeneratedInfo_def1014 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_storageGeneratedInfo_def1017 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lc_id_in_storagedataIndex_def1039 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_storagedataIndex_def1041 = new BitSet(new long[]{0x000000000231E000L});
	public static final BitSet FOLLOW_dataType_in_storagedataIndex_def1043 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_lc_id1061 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveType_in_dataType1074 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_primitiveType1090 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_primitiveType1096 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_primitiveType1102 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_primitiveType1111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_primitiveType1119 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_primitiveType1125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_primitiveType1130 = new BitSet(new long[]{0x0000000000000002L});
}
