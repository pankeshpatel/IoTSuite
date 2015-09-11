// $ANTLR 3.5.1 S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g 2015-09-09 11:49:18

package iotsuite.parser;

import iotsuite.compiler.*;
import iotsuite.semanticmodel.*;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class VocabSpecParser extends Parser {
	public static final String[] tokenNames = new String[] { "<invalid>",
			"<EOR>", "<DOWN>", "<UP>", "CAPITALIZED_ID", "ID", "INT", "WS",
			"'('", "')'", "','", "':'", "';'", "'Boolean'", "'Button'",
			"'Integer'", "'SAMPLEDURATION'", "'SAMPLEPERIOD'", "'String'",
			"'TextBox'", "'TextView'", "'_'", "'accessed-by'", "'action'",
			"'actuators'", "'boolean'", "'command'", "'double'",
			"'eventdriven'", "'for'", "'generate'", "'interactions'", "'long'",
			"'onCondition'", "'period'", "'periodicsensors'", "'regions'",
			"'request'", "'resources'", "'sample'", "'sensors'", "'storages'",
			"'structs'", "'with'" };
	public static final int EOF = -1;
	public static final int T__8 = 8;
	public static final int T__9 = 9;
	public static final int T__10 = 10;
	public static final int T__11 = 11;
	public static final int T__12 = 12;
	public static final int T__13 = 13;
	public static final int T__14 = 14;
	public static final int T__15 = 15;
	public static final int T__16 = 16;
	public static final int T__17 = 17;
	public static final int T__18 = 18;
	public static final int T__19 = 19;
	public static final int T__20 = 20;
	public static final int T__21 = 21;
	public static final int T__22 = 22;
	public static final int T__23 = 23;
	public static final int T__24 = 24;
	public static final int T__25 = 25;
	public static final int T__26 = 26;
	public static final int T__27 = 27;
	public static final int T__28 = 28;
	public static final int T__29 = 29;
	public static final int T__30 = 30;
	public static final int T__31 = 31;
	public static final int T__32 = 32;
	public static final int T__33 = 33;
	public static final int T__34 = 34;
	public static final int T__35 = 35;
	public static final int T__36 = 36;
	public static final int T__37 = 37;
	public static final int T__38 = 38;
	public static final int T__39 = 39;
	public static final int T__40 = 40;
	public static final int T__41 = 41;
	public static final int T__42 = 42;
	public static final int T__43 = 43;
	public static final int CAPITALIZED_ID = 4;
	public static final int ID = 5;
	public static final int INT = 6;
	public static final int WS = 7;

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

	@Override
	public String[] getTokenNames() {
		return VocabSpecParser.tokenNames;
	}

	@Override
	public String getGrammarFileName() {
		return "S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g";
	}

	// Initialize the context
	private SymbolTable context;

	// $ANTLR start "vocabSpec"
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:24:1:
	// vocabSpec : 'regions' ':' ( region_def )+ 'structs' ':' ( struct_def )+
	// 'resources' ':' abilities_def ;
	public final void vocabSpec() throws RecognitionException {
		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:24:11:
			// ( 'regions' ':' ( region_def )+ 'structs' ':' ( struct_def )+
			// 'resources' ':' abilities_def )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:25:5:
			// 'regions' ':' ( region_def )+ 'structs' ':' ( struct_def )+
			// 'resources' ':' abilities_def
			{
				match(input, 36, FOLLOW_36_in_vocabSpec67);
				context = new SymbolTable();
				context.currentRegion = new RegionCompiler();
				// context.currentMappingConstraint = new MappingConstraint();

				match(input, 11, FOLLOW_11_in_vocabSpec79);
				// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:30:9:
				// ( region_def )+
				int cnt1 = 0;
				loop1: while (true) {
					int alt1 = 2;
					int LA1_0 = input.LA(1);
					if ((LA1_0 == CAPITALIZED_ID)) {
						alt1 = 1;
					}

					switch (alt1) {
					case 1:
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:30:10:
					// region_def
					{
						pushFollow(FOLLOW_region_def_in_vocabSpec82);
						region_def();
						state._fsp--;

					}
						break;

					default:
						if (cnt1 >= 1)
							break loop1;
						EarlyExitException eee = new EarlyExitException(1,
								input);
						throw eee;
					}
					cnt1++;
				}

				context.currentRegion.generateRegionCode();
				match(input, 42, FOLLOW_42_in_vocabSpec103);
				match(input, 11, FOLLOW_11_in_vocabSpec105);
				// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:32:19:
				// ( struct_def )+
				int cnt2 = 0;
				loop2: while (true) {
					int alt2 = 2;
					int LA2_0 = input.LA(1);
					if ((LA2_0 == CAPITALIZED_ID)) {
						alt2 = 1;
					}

					switch (alt2) {
					case 1:
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:32:20:
					// struct_def
					{
						pushFollow(FOLLOW_struct_def_in_vocabSpec108);
						struct_def();
						state._fsp--;

					}
						break;

					default:
						if (cnt2 >= 1)
							break loop2;
						EarlyExitException eee = new EarlyExitException(2,
								input);
						throw eee;
					}
					cnt2++;
				}

				match(input, 38, FOLLOW_38_in_vocabSpec122);
				match(input, 11, FOLLOW_11_in_vocabSpec124);
				pushFollow(FOLLOW_abilities_def_in_vocabSpec126);
				abilities_def();
				state._fsp--;

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "vocabSpec"

	// $ANTLR start "region_def"
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:40:1:
	// region_def : CAPITALIZED_ID ':' dataType ';' ;
	public final void region_def() throws RecognitionException {
		Token CAPITALIZED_ID1 = null;
		ParserRuleReturnScope dataType2 = null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:40:12:
			// ( CAPITALIZED_ID ':' dataType ';' )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:42:6:
			// CAPITALIZED_ID ':' dataType ';'
			{
				CAPITALIZED_ID1 = (Token) match(input, CAPITALIZED_ID,
						FOLLOW_CAPITALIZED_ID_in_region_def156);
				match(input, 11, FOLLOW_11_in_region_def158);
				pushFollow(FOLLOW_dataType_in_region_def160);
				dataType2 = dataType();
				state._fsp--;

				match(input, 12, FOLLOW_12_in_region_def163);

				context.currentRegion.addRegion(
						(CAPITALIZED_ID1 != null ? CAPITALIZED_ID1.getText()
								: null),
						(dataType2 != null ? input.toString(dataType2.start,
								dataType2.stop) : null));

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "region_def"

	// $ANTLR start "struct_def"
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:55:1:
	// struct_def : CAPITALIZED_ID ( structField_def ';' )* ;
	public final void struct_def() throws RecognitionException {
		Token CAPITALIZED_ID3 = null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:55:11:
			// ( CAPITALIZED_ID ( structField_def ';' )* )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:56:5:
			// CAPITALIZED_ID ( structField_def ';' )*
			{
				CAPITALIZED_ID3 = (Token) match(input, CAPITALIZED_ID,
						FOLLOW_CAPITALIZED_ID_in_struct_def188);
				context.currentStruct = new StructCompiler(
						(CAPITALIZED_ID3 != null ? CAPITALIZED_ID3.getText()
								: null));
				context.constructStructNameSymblTable((CAPITALIZED_ID3 != null ? CAPITALIZED_ID3
						.getText() : null));
				// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:59:5:
				// ( structField_def ';' )*
				loop3: while (true) {
					int alt3 = 2;
					int LA3_0 = input.LA(1);
					if ((LA3_0 == ID)) {
						alt3 = 1;
					}

					switch (alt3) {
					case 1:
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:59:6:
					// structField_def ';'
					{
						pushFollow(FOLLOW_structField_def_in_struct_def202);
						structField_def();
						state._fsp--;

						match(input, 12, FOLLOW_12_in_struct_def204);
					}
						break;

					default:
						break loop3;
					}
				}

				context.currentStruct.generateStructureCode();

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "struct_def"

	// $ANTLR start "structField_def"
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:68:1:
	// structField_def : lc_id ':' dataType ;
	public final void structField_def() throws RecognitionException {
		ParserRuleReturnScope lc_id4 = null;
		ParserRuleReturnScope dataType5 = null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:68:16:
			// ( lc_id ':' dataType )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:69:3:
			// lc_id ':' dataType
			{
				pushFollow(FOLLOW_lc_id_in_structField_def227);
				lc_id4 = lc_id();
				state._fsp--;

				match(input, 11, FOLLOW_11_in_structField_def229);
				pushFollow(FOLLOW_dataType_in_structField_def231);
				dataType5 = dataType();
				state._fsp--;

				context.currentStruct.addField(
						(lc_id4 != null ? input.toString(lc_id4.start,
								lc_id4.stop) : null),
						(dataType5 != null ? input.toString(dataType5.start,
								dataType5.stop) : null));
				// context.constructStructureSymbTable((lc_id4!=null?input.toString(lc_id4.start,lc_id4.stop):null),(dataType5!=null?input.toString(dataType5.start,dataType5.stop):null));
				// context.constructStructResponseTypeSymblTable((lc_id4!=null?input.toString(lc_id4.start,lc_id4.stop):null),(dataType5!=null?input.toString(dataType5.start,dataType5.stop):null));
				context.constructStructFieldSymblTable(
						(lc_id4 != null ? input.toString(lc_id4.start,
								lc_id4.stop) : null),
						(dataType5 != null ? input.toString(dataType5.start,
								dataType5.stop) : null));
				context.constructStructSymblTable(
						context.currentStruct.getStructName(),
						context.currentStruct);
			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "structField_def"

	// $ANTLR start "abilities_def"
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:79:1:
	// abilities_def : ( 'sensors' ':' sensor_def )+ ( 'actuators' ':'
	// actuator_def )* ( 'storages' ':' ss_def )* ( 'interactions' ':' ( gui_def
	// )+ )* ;
	public final void abilities_def() throws RecognitionException {
		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:79:15:
			// ( ( 'sensors' ':' sensor_def )+ ( 'actuators' ':' actuator_def )*
			// ( 'storages' ':' ss_def )* ( 'interactions' ':' ( gui_def )+ )* )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:81:3:
			// ( 'sensors' ':' sensor_def )+ ( 'actuators' ':' actuator_def )* (
			// 'storages' ':' ss_def )* ( 'interactions' ':' ( gui_def )+ )*
			{
				// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:81:3:
				// ( 'sensors' ':' sensor_def )+
				int cnt4 = 0;
				loop4: while (true) {
					int alt4 = 2;
					int LA4_0 = input.LA(1);
					if ((LA4_0 == 40)) {
						alt4 = 1;
					}

					switch (alt4) {
					case 1:
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:81:4:
					// 'sensors' ':' sensor_def
					{
						match(input, 40, FOLLOW_40_in_abilities_def257);
						match(input, 11, FOLLOW_11_in_abilities_def259);
						pushFollow(FOLLOW_sensor_def_in_abilities_def263);
						sensor_def();
						state._fsp--;

					}
						break;

					default:
						if (cnt4 >= 1)
							break loop4;
						EarlyExitException eee = new EarlyExitException(4,
								input);
						throw eee;
					}
					cnt4++;
				}

				// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:83:4:
				// ( 'actuators' ':' actuator_def )*
				loop5: while (true) {
					int alt5 = 2;
					int LA5_0 = input.LA(1);
					if ((LA5_0 == 24)) {
						alt5 = 1;
					}

					switch (alt5) {
					case 1:
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:83:5:
					// 'actuators' ':' actuator_def
					{
						match(input, 24, FOLLOW_24_in_abilities_def273);
						match(input, 11, FOLLOW_11_in_abilities_def275);
						pushFollow(FOLLOW_actuator_def_in_abilities_def277);
						actuator_def();
						state._fsp--;

					}
						break;

					default:
						break loop5;
					}
				}

				// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:84:3:
				// ( 'storages' ':' ss_def )*
				loop6: while (true) {
					int alt6 = 2;
					int LA6_0 = input.LA(1);
					if ((LA6_0 == 41)) {
						alt6 = 1;
					}

					switch (alt6) {
					case 1:
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:84:4:
					// 'storages' ':' ss_def
					{
						match(input, 41, FOLLOW_41_in_abilities_def284);
						match(input, 11, FOLLOW_11_in_abilities_def287);
						pushFollow(FOLLOW_ss_def_in_abilities_def289);
						ss_def();
						state._fsp--;

					}
						break;

					default:
						break loop6;
					}
				}

				// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:85:3:
				// ( 'interactions' ':' ( gui_def )+ )*
				loop8: while (true) {
					int alt8 = 2;
					int LA8_0 = input.LA(1);
					if ((LA8_0 == 31)) {
						alt8 = 1;
					}

					switch (alt8) {
					case 1:
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:85:4:
					// 'interactions' ':' ( gui_def )+
					{
						match(input, 31, FOLLOW_31_in_abilities_def296);
						match(input, 11, FOLLOW_11_in_abilities_def298);
						// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:85:23:
						// ( gui_def )+
						int cnt7 = 0;
						loop7: while (true) {
							int alt7 = 2;
							int LA7_0 = input.LA(1);
							if ((LA7_0 == CAPITALIZED_ID)) {
								alt7 = 1;
							}

							switch (alt7) {
							case 1:
							// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:85:24:
							// gui_def
							{
								pushFollow(FOLLOW_gui_def_in_abilities_def301);
								gui_def();
								state._fsp--;

							}
								break;

							default:
								if (cnt7 >= 1)
									break loop7;
								EarlyExitException eee = new EarlyExitException(
										7, input);
								throw eee;
							}
							cnt7++;
						}

					}
						break;

					default:
						break loop8;
					}
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "abilities_def"

	// $ANTLR start "sensor_def"
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:92:1:
	// sensor_def : ( 'periodicsensors' ':' periodicsensor_def )* (
	// 'eventdriven' ':' eventsensor_def )* ;
	public final void sensor_def() throws RecognitionException {
		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:92:11:
			// ( ( 'periodicsensors' ':' periodicsensor_def )* ( 'eventdriven'
			// ':' eventsensor_def )* )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:94:7:
			// ( 'periodicsensors' ':' periodicsensor_def )* ( 'eventdriven' ':'
			// eventsensor_def )*
			{
				// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:94:7:
				// ( 'periodicsensors' ':' periodicsensor_def )*
				loop9: while (true) {
					int alt9 = 2;
					int LA9_0 = input.LA(1);
					if ((LA9_0 == 35)) {
						alt9 = 1;
					}

					switch (alt9) {
					case 1:
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:94:8:
					// 'periodicsensors' ':' periodicsensor_def
					{
						match(input, 35, FOLLOW_35_in_sensor_def336);
						match(input, 11, FOLLOW_11_in_sensor_def338);
						pushFollow(FOLLOW_periodicsensor_def_in_sensor_def340);
						periodicsensor_def();
						state._fsp--;

					}
						break;

					default:
						break loop9;
					}
				}

				// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:97:7:
				// ( 'eventdriven' ':' eventsensor_def )*
				loop10: while (true) {
					int alt10 = 2;
					int LA10_0 = input.LA(1);
					if ((LA10_0 == 28)) {
						alt10 = 1;
					}

					switch (alt10) {
					case 1:
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:97:8:
					// 'eventdriven' ':' eventsensor_def
					{
						match(input, 28, FOLLOW_28_in_sensor_def363);
						match(input, 11, FOLLOW_11_in_sensor_def365);
						pushFollow(FOLLOW_eventsensor_def_in_sensor_def367);
						eventsensor_def();
						state._fsp--;

					}
						break;

					default:
						break loop10;
					}
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "sensor_def"

	// $ANTLR start "periodicsensor_def"
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:105:1:
	// periodicsensor_def : CAPITALIZED_ID ( sensorMeasurement_def ';' )* (
	// sensorperiodicMeasurement_def ';' )* ;
	public final void periodicsensor_def() throws RecognitionException {
		Token CAPITALIZED_ID6 = null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:105:19:
			// ( CAPITALIZED_ID ( sensorMeasurement_def ';' )* (
			// sensorperiodicMeasurement_def ';' )* )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:106:2:
			// CAPITALIZED_ID ( sensorMeasurement_def ';' )* (
			// sensorperiodicMeasurement_def ';' )*
			{
				CAPITALIZED_ID6 = (Token) match(input, CAPITALIZED_ID,
						FOLLOW_CAPITALIZED_ID_in_periodicsensor_def384);
				context.currentSensor = new SensorCompiler(
						(CAPITALIZED_ID6 != null ? CAPITALIZED_ID6.getText()
								: null));
				// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:108:5:
				// ( sensorMeasurement_def ';' )*
				loop11: while (true) {
					int alt11 = 2;
					int LA11_0 = input.LA(1);
					if ((LA11_0 == 30)) {
						alt11 = 1;
					}

					switch (alt11) {
					case 1:
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:108:6:
					// sensorMeasurement_def ';'
					{
						pushFollow(FOLLOW_sensorMeasurement_def_in_periodicsensor_def397);
						sensorMeasurement_def();
						state._fsp--;

						match(input, 12, FOLLOW_12_in_periodicsensor_def399);
					}
						break;

					default:
						break loop11;
					}
				}

				// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:109:5:
				// ( sensorperiodicMeasurement_def ';' )*
				loop12: while (true) {
					int alt12 = 2;
					int LA12_0 = input.LA(1);
					if ((LA12_0 == 39)) {
						alt12 = 1;
					}

					switch (alt12) {
					case 1:
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:109:6:
					// sensorperiodicMeasurement_def ';'
					{
						pushFollow(FOLLOW_sensorperiodicMeasurement_def_in_periodicsensor_def409);
						sensorperiodicMeasurement_def();
						state._fsp--;

						match(input, 12, FOLLOW_12_in_periodicsensor_def411);
					}
						break;

					default:
						break loop12;
					}
				}

				context.currentSensor.generatePeriodicSensorCode();
			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "periodicsensor_def"

	// $ANTLR start "eventsensor_def"
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:113:1:
	// eventsensor_def : CAPITALIZED_ID ( sensorMeasurement_def ';' )* (
	// sensoreventMeasurement_def ';' )* ;
	public final void eventsensor_def() throws RecognitionException {
		Token CAPITALIZED_ID7 = null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:113:16:
			// ( CAPITALIZED_ID ( sensorMeasurement_def ';' )* (
			// sensoreventMeasurement_def ';' )* )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:114:2:
			// CAPITALIZED_ID ( sensorMeasurement_def ';' )* (
			// sensoreventMeasurement_def ';' )*
			{
				CAPITALIZED_ID7 = (Token) match(input, CAPITALIZED_ID,
						FOLLOW_CAPITALIZED_ID_in_eventsensor_def428);
				context.currentSensor = new SensorCompiler(
						(CAPITALIZED_ID7 != null ? CAPITALIZED_ID7.getText()
								: null));
				// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:116:5:
				// ( sensorMeasurement_def ';' )*
				loop13: while (true) {
					int alt13 = 2;
					int LA13_0 = input.LA(1);
					if ((LA13_0 == 30)) {
						alt13 = 1;
					}

					switch (alt13) {
					case 1:
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:116:6:
					// sensorMeasurement_def ';'
					{
						pushFollow(FOLLOW_sensorMeasurement_def_in_eventsensor_def441);
						sensorMeasurement_def();
						state._fsp--;

						match(input, 12, FOLLOW_12_in_eventsensor_def443);
					}
						break;

					default:
						break loop13;
					}
				}

				// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:117:5:
				// ( sensoreventMeasurement_def ';' )*
				loop14: while (true) {
					int alt14 = 2;
					int LA14_0 = input.LA(1);
					if ((LA14_0 == 12 || LA14_0 == 33)) {
						alt14 = 1;
					}

					switch (alt14) {
					case 1:
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:117:6:
					// sensoreventMeasurement_def ';'
					{
						pushFollow(FOLLOW_sensoreventMeasurement_def_in_eventsensor_def453);
						sensoreventMeasurement_def();
						state._fsp--;

						match(input, 12, FOLLOW_12_in_eventsensor_def455);
					}
						break;

					default:
						break loop14;
					}
				}

				context.currentSensor.generateEventDrivenSensorCode();
			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "eventsensor_def"

	// $ANTLR start "sensorMeasurement_def"
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:125:1:
	// sensorMeasurement_def : 'generate' lc_id ':' CAPITALIZED_ID ;
	public final void sensorMeasurement_def() throws RecognitionException {
		Token CAPITALIZED_ID9 = null;
		ParserRuleReturnScope lc_id8 = null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:125:23:
			// ( 'generate' lc_id ':' CAPITALIZED_ID )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:126:5:
			// 'generate' lc_id ':' CAPITALIZED_ID
			{
				match(input, 30, FOLLOW_30_in_sensorMeasurement_def481);
				pushFollow(FOLLOW_lc_id_in_sensorMeasurement_def483);
				lc_id8 = lc_id();
				state._fsp--;

				match(input, 11, FOLLOW_11_in_sensorMeasurement_def485);
				CAPITALIZED_ID9 = (Token) match(input, CAPITALIZED_ID,
						FOLLOW_CAPITALIZED_ID_in_sensorMeasurement_def488);
				context.currentSensor
						.addSensorMeasurement(
								(lc_id8 != null ? input.toString(lc_id8.start,
										lc_id8.stop) : null),
								(CAPITALIZED_ID9 != null ? CAPITALIZED_ID9
										.getText() : null),
								context.getStructSymblTable((CAPITALIZED_ID9 != null ? CAPITALIZED_ID9
										.getText() : null)));
				context.constructSymbTable(
						(lc_id8 != null ? input.toString(lc_id8.start,
								lc_id8.stop) : null),
						(CAPITALIZED_ID9 != null ? CAPITALIZED_ID9.getText()
								: null));
			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "sensorMeasurement_def"

	// $ANTLR start "sensorperiodicMeasurement_def"
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:133:1:
	// sensorperiodicMeasurement_def : 'sample' 'period' 'SAMPLEPERIOD' 'for'
	// 'SAMPLEDURATION' ;
	public final void sensorperiodicMeasurement_def()
			throws RecognitionException {
		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:133:30:
			// ( 'sample' 'period' 'SAMPLEPERIOD' 'for' 'SAMPLEDURATION' )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:134:2:
			// 'sample' 'period' 'SAMPLEPERIOD' 'for' 'SAMPLEDURATION'
			{
				match(input, 39, FOLLOW_39_in_sensorperiodicMeasurement_def512);
				match(input, 34, FOLLOW_34_in_sensorperiodicMeasurement_def514);
				match(input, 17, FOLLOW_17_in_sensorperiodicMeasurement_def516);
				match(input, 29, FOLLOW_29_in_sensorperiodicMeasurement_def518);
				match(input, 16, FOLLOW_16_in_sensorperiodicMeasurement_def520);
			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "sensorperiodicMeasurement_def"

	// $ANTLR start "sensoreventMeasurement_def"
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:139:1:
	// sensoreventMeasurement_def : ( 'onCondition' ( ID | ',' ID )* )* ;
	public final void sensoreventMeasurement_def() throws RecognitionException {
		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:139:27:
			// ( ( 'onCondition' ( ID | ',' ID )* )* )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:141:2:
			// ( 'onCondition' ( ID | ',' ID )* )*
			{
				// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:141:2:
				// ( 'onCondition' ( ID | ',' ID )* )*
				loop16: while (true) {
					int alt16 = 2;
					int LA16_0 = input.LA(1);
					if ((LA16_0 == 33)) {
						alt16 = 1;
					}

					switch (alt16) {
					case 1:
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:141:2:
					// 'onCondition' ( ID | ',' ID )*
					{
						match(input, 33,
								FOLLOW_33_in_sensoreventMeasurement_def537);
						// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:141:16:
						// ( ID | ',' ID )*
						loop15: while (true) {
							int alt15 = 3;
							int LA15_0 = input.LA(1);
							if ((LA15_0 == ID)) {
								alt15 = 1;
							} else if ((LA15_0 == 10)) {
								alt15 = 2;
							}

							switch (alt15) {
							case 1:
							// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:141:17:
							// ID
							{
								match(input, ID,
										FOLLOW_ID_in_sensoreventMeasurement_def540);
							}
								break;
							case 2:
							// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:141:21:
							// ',' ID
							{
								match(input, 10,
										FOLLOW_10_in_sensoreventMeasurement_def543);
								match(input, ID,
										FOLLOW_ID_in_sensoreventMeasurement_def545);
							}
								break;

							default:
								break loop15;
							}
						}

					}
						break;

					default:
						break loop16;
					}
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "sensoreventMeasurement_def"

	// $ANTLR start "actuator_def"
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:152:1:
	// actuator_def : CAPITALIZED_ID ( action_def ';' )* ;
	public final void actuator_def() throws RecognitionException {
		Token CAPITALIZED_ID10 = null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:152:13:
			// ( CAPITALIZED_ID ( action_def ';' )* )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:153:4:
			// CAPITALIZED_ID ( action_def ';' )*
			{
				CAPITALIZED_ID10 = (Token) match(input, CAPITALIZED_ID,
						FOLLOW_CAPITALIZED_ID_in_actuator_def568);
				context.currentActuator = new ActuatorCompiler(
						(CAPITALIZED_ID10 != null ? CAPITALIZED_ID10.getText()
								: null));
				// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:155:4:
				// ( action_def ';' )*
				loop17: while (true) {
					int alt17 = 2;
					int LA17_0 = input.LA(1);
					if ((LA17_0 == 23)) {
						alt17 = 1;
					}

					switch (alt17) {
					case 1:
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:155:5:
					// action_def ';'
					{
						pushFollow(FOLLOW_action_def_in_actuator_def579);
						action_def();
						state._fsp--;

						match(input, 12, FOLLOW_12_in_actuator_def581);
					}
						break;

					default:
						break loop17;
					}
				}

				context.currentActuator.generateActuatorCode();
			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "actuator_def"

	// $ANTLR start "action_def"
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:160:1:
	// action_def : 'action' CAPITALIZED_ID '(' ( parameter_def )? ')' ;
	public final void action_def() throws RecognitionException {
		Token CAPITALIZED_ID11 = null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:160:11:
			// ( 'action' CAPITALIZED_ID '(' ( parameter_def )? ')' )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:161:5:
			// 'action' CAPITALIZED_ID '(' ( parameter_def )? ')'
			{
				match(input, 23, FOLLOW_23_in_action_def605);
				CAPITALIZED_ID11 = (Token) match(input, CAPITALIZED_ID,
						FOLLOW_CAPITALIZED_ID_in_action_def607);
				match(input, 8, FOLLOW_8_in_action_def609);
				// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:161:33:
				// ( parameter_def )?
				int alt18 = 2;
				int LA18_0 = input.LA(1);
				if ((LA18_0 == ID)) {
					alt18 = 1;
				}
				switch (alt18) {
				case 1:
				// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:161:34:
				// parameter_def
				{
					pushFollow(FOLLOW_parameter_def_in_action_def612);
					parameter_def();
					state._fsp--;

				}
					break;

				}

				match(input, 9, FOLLOW_9_in_action_def616);
				context.currentActuator
						.addAction((CAPITALIZED_ID11 != null ? CAPITALIZED_ID11
								.getText() : null));
			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "action_def"

	// $ANTLR start "parameter_def"
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:165:1:
	// parameter_def : lc_id ':' CAPITALIZED_ID ( ',' parameter_def )? ;
	public final void parameter_def() throws RecognitionException {
		Token CAPITALIZED_ID13 = null;
		ParserRuleReturnScope lc_id12 = null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:165:15:
			// ( lc_id ':' CAPITALIZED_ID ( ',' parameter_def )? )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:166:5:
			// lc_id ':' CAPITALIZED_ID ( ',' parameter_def )?
			{
				pushFollow(FOLLOW_lc_id_in_parameter_def636);
				lc_id12 = lc_id();
				state._fsp--;

				match(input, 11, FOLLOW_11_in_parameter_def638);
				CAPITALIZED_ID13 = (Token) match(input, CAPITALIZED_ID,
						FOLLOW_CAPITALIZED_ID_in_parameter_def641);
				// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:166:31:
				// ( ',' parameter_def )?
				int alt19 = 2;
				int LA19_0 = input.LA(1);
				if ((LA19_0 == 10)) {
					alt19 = 1;
				}
				switch (alt19) {
				case 1:
				// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:166:32:
				// ',' parameter_def
				{
					match(input, 10, FOLLOW_10_in_parameter_def644);
					pushFollow(FOLLOW_parameter_def_in_parameter_def646);
					parameter_def();
					state._fsp--;

				}
					break;

				}

				context.currentActuator.addParameter(
						(lc_id12 != null ? input.toString(lc_id12.start,
								lc_id12.stop) : null),
						(CAPITALIZED_ID13 != null ? CAPITALIZED_ID13.getText()
								: null));
				context.constructSymbTable(
						(lc_id12 != null ? input.toString(lc_id12.start,
								lc_id12.stop) : null),
						(CAPITALIZED_ID13 != null ? CAPITALIZED_ID13.getText()
								: null));

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "parameter_def"

	// $ANTLR start "ss_def"
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:180:1:
	// ss_def : CAPITALIZED_ID ( storageDataAccess_def ';' )* ;
	public final void ss_def() throws RecognitionException {
		Token CAPITALIZED_ID14 = null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:180:7:
			// ( CAPITALIZED_ID ( storageDataAccess_def ';' )* )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:181:3:
			// CAPITALIZED_ID ( storageDataAccess_def ';' )*
			{
				CAPITALIZED_ID14 = (Token) match(input, CAPITALIZED_ID,
						FOLLOW_CAPITALIZED_ID_in_ss_def673);
				context.currentStorageService = new StorageCompiler();
				// context.currentStorageService = new
				// Storage((CAPITALIZED_ID14!=null?CAPITALIZED_ID14.getText():null));

				// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:186:5:
				// ( storageDataAccess_def ';' )*
				loop20: while (true) {
					int alt20 = 2;
					int LA20_0 = input.LA(1);
					if ((LA20_0 == 30)) {
						alt20 = 1;
					}

					switch (alt20) {
					case 1:
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:186:6:
					// storageDataAccess_def ';'
					{
						pushFollow(FOLLOW_storageDataAccess_def_in_ss_def690);
						storageDataAccess_def();
						state._fsp--;

						match(input, 12, FOLLOW_12_in_ss_def692);
					}
						break;

					default:
						break loop20;
					}
				}

				context.currentStorageService
						.setStorageServiceName((CAPITALIZED_ID14 != null ? CAPITALIZED_ID14
								.getText() : null));
				context.currentStorageService.createStorageObject();
				context.currentStorageService.generateStorageCode();
				// context.currentMappingConstraint.setSoftwareComponentName((CAPITALIZED_ID14!=null?CAPITALIZED_ID14.getText():null));
				// context.currentMappingConstraint.addDeployementConstraintObj();
				// // This line creates a Symbol Table

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "ss_def"

	// $ANTLR start "storageDataAccess_def"
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:199:1:
	// storageDataAccess_def : storageGeneratedInfo_def 'accessed-by'
	// storagedataIndex_def ;
	public final void storageDataAccess_def() throws RecognitionException {
		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:199:23:
			// ( storageGeneratedInfo_def 'accessed-by' storagedataIndex_def )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:200:6:
			// storageGeneratedInfo_def 'accessed-by' storagedataIndex_def
			{
				pushFollow(FOLLOW_storageGeneratedInfo_def_in_storageDataAccess_def723);
				storageGeneratedInfo_def();
				state._fsp--;

				match(input, 22, FOLLOW_22_in_storageDataAccess_def726);
				pushFollow(FOLLOW_storagedataIndex_def_in_storageDataAccess_def728);
				storagedataIndex_def();
				state._fsp--;

				context.currentStorageService.addDataAccess();
			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "storageDataAccess_def"

	// $ANTLR start "storageGeneratedInfo_def"
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:204:1:
	// storageGeneratedInfo_def : 'generate' lc_id ':' CAPITALIZED_ID ;
	public final void storageGeneratedInfo_def() throws RecognitionException {
		Token CAPITALIZED_ID16 = null;
		ParserRuleReturnScope lc_id15 = null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:204:26:
			// ( 'generate' lc_id ':' CAPITALIZED_ID )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:205:5:
			// 'generate' lc_id ':' CAPITALIZED_ID
			{
				match(input, 30, FOLLOW_30_in_storageGeneratedInfo_def747);
				pushFollow(FOLLOW_lc_id_in_storageGeneratedInfo_def749);
				lc_id15 = lc_id();
				state._fsp--;

				match(input, 11, FOLLOW_11_in_storageGeneratedInfo_def751);
				CAPITALIZED_ID16 = (Token) match(input, CAPITALIZED_ID,
						FOLLOW_CAPITALIZED_ID_in_storageGeneratedInfo_def754);
				context.currentStorageService.addGeneratedInfo(
						(lc_id15 != null ? input.toString(lc_id15.start,
								lc_id15.stop) : null),
						(CAPITALIZED_ID16 != null ? CAPITALIZED_ID16.getText()
								: null));
				context.constructSymbTable(
						(lc_id15 != null ? input.toString(lc_id15.start,
								lc_id15.stop) : null),
						(CAPITALIZED_ID16 != null ? CAPITALIZED_ID16.getText()
								: null));
				context.constructResponseTypeSymblTable(
						(lc_id15 != null ? input.toString(lc_id15.start,
								lc_id15.stop) : null),
						(CAPITALIZED_ID16 != null ? CAPITALIZED_ID16.getText()
								: null));

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "storageGeneratedInfo_def"

	// $ANTLR start "storagedataIndex_def"
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:212:1:
	// storagedataIndex_def : lc_id ':' dataType ;
	public final void storagedataIndex_def() throws RecognitionException {
		ParserRuleReturnScope lc_id17 = null;
		ParserRuleReturnScope dataType18 = null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:212:21:
			// ( lc_id ':' dataType )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:213:9:
			// lc_id ':' dataType
			{
				pushFollow(FOLLOW_lc_id_in_storagedataIndex_def776);
				lc_id17 = lc_id();
				state._fsp--;

				match(input, 11, FOLLOW_11_in_storagedataIndex_def778);
				pushFollow(FOLLOW_dataType_in_storagedataIndex_def780);
				dataType18 = dataType();
				state._fsp--;

				context.currentStorageService.addDataAccessIndex(
						(lc_id17 != null ? input.toString(lc_id17.start,
								lc_id17.stop) : null),
						(dataType18 != null ? input.toString(dataType18.start,
								dataType18.stop) : null));
				context.constructStorageInfoSymblTable(
						(lc_id17 != null ? input.toString(lc_id17.start,
								lc_id17.stop) : null),
						(dataType18 != null ? input.toString(dataType18.start,
								dataType18.stop) : null));

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "storagedataIndex_def"

	public static class lc_id_return extends ParserRuleReturnScope {
	};

	// $ANTLR start "lc_id"
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:235:1:
	// lc_id : ID ;
	public final VocabSpecParser.lc_id_return lc_id()
			throws RecognitionException {
		VocabSpecParser.lc_id_return retval = new VocabSpecParser.lc_id_return();
		retval.start = input.LT(1);

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:235:6:
			// ( ID )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:235:8:
			// ID
			{
				match(input, ID, FOLLOW_ID_in_lc_id808);
			}

			retval.stop = input.LT(-1);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return retval;
	}

	// $ANTLR end "lc_id"

	public static class dataType_return extends ParserRuleReturnScope {
	};

	// $ANTLR start "dataType"
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:238:1:
	// dataType : primitiveType ;
	public final VocabSpecParser.dataType_return dataType()
			throws RecognitionException {
		VocabSpecParser.dataType_return retval = new VocabSpecParser.dataType_return();
		retval.start = input.LT(1);

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:238:9:
			// ( primitiveType )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:239:3:
			// primitiveType
			{
				pushFollow(FOLLOW_primitiveType_in_dataType821);
				primitiveType();
				state._fsp--;

			}

			retval.stop = input.LT(-1);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return retval;
	}

	// $ANTLR end "dataType"

	// $ANTLR start "primitiveType"
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:242:1:
	// primitiveType : (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double'
	// |id= 'long' |id= 'boolean' |id= '_' ) ;
	public final void primitiveType() throws RecognitionException {
		Token id = null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:242:14:
			// ( (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id=
			// 'long' |id= 'boolean' |id= '_' ) )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:243:3:
			// (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id=
			// 'long' |id= 'boolean' |id= '_' )
			{
				// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:243:3:
				// (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double'
				// |id= 'long' |id= 'boolean' |id= '_' )
				int alt21 = 7;
				switch (input.LA(1)) {
				case 15: {
					alt21 = 1;
				}
					break;
				case 13: {
					alt21 = 2;
				}
					break;
				case 18: {
					alt21 = 3;
				}
					break;
				case 27: {
					alt21 = 4;
				}
					break;
				case 32: {
					alt21 = 5;
				}
					break;
				case 25: {
					alt21 = 6;
				}
					break;
				case 21: {
					alt21 = 7;
				}
					break;
				default:
					NoViableAltException nvae = new NoViableAltException("",
							21, 0, input);
					throw nvae;
				}
				switch (alt21) {
				case 1:
				// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:243:4:
				// id= 'Integer'
				{
					id = (Token) match(input, 15, FOLLOW_15_in_primitiveType836);
				}
					break;
				case 2:
				// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:243:19:
				// id= 'Boolean'
				{
					id = (Token) match(input, 13, FOLLOW_13_in_primitiveType842);
				}
					break;
				case 3:
				// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:243:34:
				// id= 'String'
				{
					id = (Token) match(input, 18, FOLLOW_18_in_primitiveType848);
				}
					break;
				case 4:
				// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:243:49:
				// id= 'double'
				{
					id = (Token) match(input, 27, FOLLOW_27_in_primitiveType857);
				}
					break;
				case 5:
				// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:243:65:
				// id= 'long'
				{
					id = (Token) match(input, 32, FOLLOW_32_in_primitiveType865);
				}
					break;
				case 6:
				// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:243:79:
				// id= 'boolean'
				{
					id = (Token) match(input, 25, FOLLOW_25_in_primitiveType871);
				}
					break;
				case 7:
				// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:243:92:
				// id= '_'
				{
					id = (Token) match(input, 21, FOLLOW_21_in_primitiveType876);
				}
					break;

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "primitiveType"

	// $ANTLR start "gui_def"
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:264:1:
	// gui_def : CAPITALIZED_ID ( gui_command_def ';' )* ( gui_request_def ';'
	// )* ;
	public final void gui_def() throws RecognitionException {
		Token CAPITALIZED_ID19 = null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:264:8:
			// ( CAPITALIZED_ID ( gui_command_def ';' )* ( gui_request_def ';'
			// )* )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:265:3:
			// CAPITALIZED_ID ( gui_command_def ';' )* ( gui_request_def ';' )*
			{
				context.currentGUI = new UserInterfaceCompiler();
				CAPITALIZED_ID19 = (Token) match(input, CAPITALIZED_ID,
						FOLLOW_CAPITALIZED_ID_in_gui_def1012);
				// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:269:4:
				// ( gui_command_def ';' )*
				loop22: while (true) {
					int alt22 = 2;
					int LA22_0 = input.LA(1);
					if ((LA22_0 == 26)) {
						alt22 = 1;
					}

					switch (alt22) {
					case 1:
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:269:5:
					// gui_command_def ';'
					{
						pushFollow(FOLLOW_gui_command_def_in_gui_def1038);
						gui_command_def();
						state._fsp--;

						match(input, 12, FOLLOW_12_in_gui_def1040);
					}
						break;

					default:
						break loop22;
					}
				}

				// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:270:4:
				// ( gui_request_def ';' )*
				loop23: while (true) {
					int alt23 = 2;
					int LA23_0 = input.LA(1);
					if ((LA23_0 == 37)) {
						alt23 = 1;
					}

					switch (alt23) {
					case 1:
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:270:5:
					// gui_request_def ';'
					{
						pushFollow(FOLLOW_gui_request_def_in_gui_def1051);
						gui_request_def();
						state._fsp--;

						match(input, 12, FOLLOW_12_in_gui_def1054);
					}
						break;

					default:
						break loop23;
					}
				}

				context.currentGUI
						.setGUIName((CAPITALIZED_ID19 != null ? CAPITALIZED_ID19
								.getText() : null));
				context.currentGUI.createGUIObject();
				context.currentGUI.generateCode();
			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "gui_def"

	// $ANTLR start "gui_command_def"
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:276:1:
	// gui_command_def : 'command' name= CAPITALIZED_ID '(' (
	// gui_command_parameter_def )? ')' ;
	public final void gui_command_def() throws RecognitionException {
		Token name = null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:276:17:
			// ( 'command' name= CAPITALIZED_ID '(' ( gui_command_parameter_def
			// )? ')' )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:277:5:
			// 'command' name= CAPITALIZED_ID '(' ( gui_command_parameter_def )?
			// ')'
			{
				match(input, 26, FOLLOW_26_in_gui_command_def1080);
				name = (Token) match(input, CAPITALIZED_ID,
						FOLLOW_CAPITALIZED_ID_in_gui_command_def1087);
				match(input, 8, FOLLOW_8_in_gui_command_def1089);
				// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:277:42:
				// ( gui_command_parameter_def )?
				int alt24 = 2;
				int LA24_0 = input.LA(1);
				if ((LA24_0 == ID)) {
					alt24 = 1;
				}
				switch (alt24) {
				case 1:
				// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:277:43:
				// gui_command_parameter_def
				{
					pushFollow(FOLLOW_gui_command_parameter_def_in_gui_command_def1092);
					gui_command_parameter_def();
					state._fsp--;

				}
					break;

				}

				match(input, 9, FOLLOW_9_in_gui_command_def1096);

				context.currentGUI.addCommand((name != null ? name.getText()
						: null));

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "gui_command_def"

	// $ANTLR start "gui_command_parameter_def"
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:284:1:
	// gui_command_parameter_def : lc_id ( ',' gui_command_parameter_def )? ;
	public final void gui_command_parameter_def() throws RecognitionException {
		ParserRuleReturnScope lc_id20 = null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:284:27:
			// ( lc_id ( ',' gui_command_parameter_def )? )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:285:5:
			// lc_id ( ',' gui_command_parameter_def )?
			{
				pushFollow(FOLLOW_lc_id_in_gui_command_parameter_def1119);
				lc_id20 = lc_id();
				state._fsp--;

				// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:285:11:
				// ( ',' gui_command_parameter_def )?
				int alt25 = 2;
				int LA25_0 = input.LA(1);
				if ((LA25_0 == 10)) {
					alt25 = 1;
				}
				switch (alt25) {
				case 1:
				// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:285:12:
				// ',' gui_command_parameter_def
				{
					match(input, 10, FOLLOW_10_in_gui_command_parameter_def1122);
					pushFollow(FOLLOW_gui_command_parameter_def_in_gui_command_parameter_def1124);
					gui_command_parameter_def();
					state._fsp--;

				}
					break;

				}

				context.currentGUI.addCommandParameter((lc_id20 != null ? input
						.toString(lc_id20.start, lc_id20.stop) : null));

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "gui_command_parameter_def"

	// $ANTLR start "gui_action_def"
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:294:1:
	// gui_action_def : 'action' name= CAPITALIZED_ID '(' (
	// gui_action_parameter_def )? ')' 'with' ui= lc_id ;
	public final void gui_action_def() throws RecognitionException {
		Token name = null;
		ParserRuleReturnScope ui = null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:294:15:
			// ( 'action' name= CAPITALIZED_ID '(' ( gui_action_parameter_def )?
			// ')' 'with' ui= lc_id )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:295:5:
			// 'action' name= CAPITALIZED_ID '(' ( gui_action_parameter_def )?
			// ')' 'with' ui= lc_id
			{
				match(input, 23, FOLLOW_23_in_gui_action_def1148);
				name = (Token) match(input, CAPITALIZED_ID,
						FOLLOW_CAPITALIZED_ID_in_gui_action_def1154);
				match(input, 8, FOLLOW_8_in_gui_action_def1156);
				// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:295:40:
				// ( gui_action_parameter_def )?
				int alt26 = 2;
				int LA26_0 = input.LA(1);
				if ((LA26_0 == ID)) {
					alt26 = 1;
				}
				switch (alt26) {
				case 1:
				// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:295:41:
				// gui_action_parameter_def
				{
					pushFollow(FOLLOW_gui_action_parameter_def_in_gui_action_def1159);
					gui_action_parameter_def();
					state._fsp--;

				}
					break;

				}

				match(input, 9, FOLLOW_9_in_gui_action_def1163);
				match(input, 43, FOLLOW_43_in_gui_action_def1165);
				pushFollow(FOLLOW_lc_id_in_gui_action_def1171);
				ui = lc_id();
				state._fsp--;

				context.currentGUI
						.addAction((name != null ? name.getText() : null),
								(ui != null ? input.toString(ui.start, ui.stop)
										: null));
			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "gui_action_def"

	// $ANTLR start "gui_action_parameter_def"
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:305:1:
	// gui_action_parameter_def : lc_id ':' CAPITALIZED_ID ( ','
	// gui_action_parameter_def )? ;
	public final void gui_action_parameter_def() throws RecognitionException {
		Token CAPITALIZED_ID22 = null;
		ParserRuleReturnScope lc_id21 = null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:305:26:
			// ( lc_id ':' CAPITALIZED_ID ( ',' gui_action_parameter_def )? )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:306:5:
			// lc_id ':' CAPITALIZED_ID ( ',' gui_action_parameter_def )?
			{
				pushFollow(FOLLOW_lc_id_in_gui_action_parameter_def1197);
				lc_id21 = lc_id();
				state._fsp--;

				match(input, 11, FOLLOW_11_in_gui_action_parameter_def1199);
				CAPITALIZED_ID22 = (Token) match(input, CAPITALIZED_ID,
						FOLLOW_CAPITALIZED_ID_in_gui_action_parameter_def1202);
				// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:306:31:
				// ( ',' gui_action_parameter_def )?
				int alt27 = 2;
				int LA27_0 = input.LA(1);
				if ((LA27_0 == 10)) {
					alt27 = 1;
				}
				switch (alt27) {
				case 1:
				// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:306:32:
				// ',' gui_action_parameter_def
				{
					match(input, 10, FOLLOW_10_in_gui_action_parameter_def1205);
					pushFollow(FOLLOW_gui_action_parameter_def_in_gui_action_parameter_def1207);
					gui_action_parameter_def();
					state._fsp--;

				}
					break;

				}

				context.currentGUI.addActionParameter(
						(lc_id21 != null ? input.toString(lc_id21.start,
								lc_id21.stop) : null),
						(CAPITALIZED_ID22 != null ? CAPITALIZED_ID22.getText()
								: null));
				context.constructSymbTable(
						(lc_id21 != null ? input.toString(lc_id21.start,
								lc_id21.stop) : null),
						(CAPITALIZED_ID22 != null ? CAPITALIZED_ID22.getText()
								: null));

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "gui_action_parameter_def"

	// $ANTLR start "gui_request_def"
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:313:1:
	// gui_request_def : 'request' lc_id ;
	public final void gui_request_def() throws RecognitionException {
		ParserRuleReturnScope lc_id23 = null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:313:17:
			// ( 'request' lc_id )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:314:4:
			// 'request' lc_id
			{
				match(input, 37, FOLLOW_37_in_gui_request_def1229);
				pushFollow(FOLLOW_lc_id_in_gui_request_def1231);
				lc_id23 = lc_id();
				state._fsp--;

				context.currentGUI
						.getDataAccessListFromSymblTable((lc_id23 != null ? input
								.toString(lc_id23.start, lc_id23.stop) : null));
				context.currentGUI
						.setRequestType(context
								.getResponseTypeSymblTable((lc_id23 != null ? input
										.toString(lc_id23.start, lc_id23.stop)
										: null)));
			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "gui_request_def"

	// $ANTLR start "bt_id"
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:349:1:
	// bt_id : ID ;
	public final void bt_id() throws RecognitionException {
		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:349:7:
			// ( ID )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:349:10:
			// ID
			{
				match(input, ID, FOLLOW_ID_in_bt_id1277);
			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "bt_id"

	// $ANTLR start "txtbx_id"
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:351:1:
	// txtbx_id : ID ;
	public final void txtbx_id() throws RecognitionException {
		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:351:10:
			// ( ID )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:351:13:
			// ID
			{
				match(input, ID, FOLLOW_ID_in_txtbx_id1287);
			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "txtbx_id"

	// $ANTLR start "txtview_id"
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:353:1:
	// txtview_id : ID ;
	public final void txtview_id() throws RecognitionException {
		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:353:12:
			// ( ID )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:353:15:
			// ID
			{
				match(input, ID, FOLLOW_ID_in_txtview_id1297);
			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "txtview_id"

	// $ANTLR start "widget_def"
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:371:1:
	// widget_def : ( 'TextView' textview_def ';' )* ( 'Button' button_def ';'
	// )* ( 'TextBox' textbox_def ';' )* ;
	public final void widget_def() throws RecognitionException {
		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:371:12:
			// ( ( 'TextView' textview_def ';' )* ( 'Button' button_def ';' )* (
			// 'TextBox' textbox_def ';' )* )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:372:5:
			// ( 'TextView' textview_def ';' )* ( 'Button' button_def ';' )* (
			// 'TextBox' textbox_def ';' )*
			{
				// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:372:5:
				// ( 'TextView' textview_def ';' )*
				loop28: while (true) {
					int alt28 = 2;
					int LA28_0 = input.LA(1);
					if ((LA28_0 == 20)) {
						alt28 = 1;
					}

					switch (alt28) {
					case 1:
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:372:6:
					// 'TextView' textview_def ';'
					{
						match(input, 20, FOLLOW_20_in_widget_def1329);
						pushFollow(FOLLOW_textview_def_in_widget_def1331);
						textview_def();
						state._fsp--;

						match(input, 12, FOLLOW_12_in_widget_def1333);
					}
						break;

					default:
						break loop28;
					}
				}

				// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:373:5:
				// ( 'Button' button_def ';' )*
				loop29: while (true) {
					int alt29 = 2;
					int LA29_0 = input.LA(1);
					if ((LA29_0 == 14)) {
						alt29 = 1;
					}

					switch (alt29) {
					case 1:
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:373:6:
					// 'Button' button_def ';'
					{
						match(input, 14, FOLLOW_14_in_widget_def1342);
						pushFollow(FOLLOW_button_def_in_widget_def1345);
						button_def();
						state._fsp--;

						match(input, 12, FOLLOW_12_in_widget_def1347);
					}
						break;

					default:
						break loop29;
					}
				}

				// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:374:5:
				// ( 'TextBox' textbox_def ';' )*
				loop30: while (true) {
					int alt30 = 2;
					int LA30_0 = input.LA(1);
					if ((LA30_0 == 19)) {
						alt30 = 1;
					}

					switch (alt30) {
					case 1:
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:374:6:
					// 'TextBox' textbox_def ';'
					{
						match(input, 19, FOLLOW_19_in_widget_def1356);
						pushFollow(FOLLOW_textbox_def_in_widget_def1358);
						textbox_def();
						state._fsp--;

						match(input, 12, FOLLOW_12_in_widget_def1360);
					}
						break;

					default:
						break loop30;
					}
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "widget_def"

	// $ANTLR start "textview_def"
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:381:1:
	// textview_def : lc_id ( ',' textview_def )? ;
	public final void textview_def() throws RecognitionException {
		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:381:14:
			// ( lc_id ( ',' textview_def )? )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:382:5:
			// lc_id ( ',' textview_def )?
			{
				pushFollow(FOLLOW_lc_id_in_textview_def1385);
				lc_id();
				state._fsp--;

				// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:382:12:
				// ( ',' textview_def )?
				int alt31 = 2;
				int LA31_0 = input.LA(1);
				if ((LA31_0 == 10)) {
					alt31 = 1;
				}
				switch (alt31) {
				case 1:
				// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:382:13:
				// ',' textview_def
				{
					match(input, 10, FOLLOW_10_in_textview_def1389);
					pushFollow(FOLLOW_textview_def_in_textview_def1391);
					textview_def();
					state._fsp--;

				}
					break;

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "textview_def"

	// $ANTLR start "button_def"
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:385:1:
	// button_def : lc_id ( ',' button_def )? ;
	public final void button_def() throws RecognitionException {
		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:385:12:
			// ( lc_id ( ',' button_def )? )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:386:5:
			// lc_id ( ',' button_def )?
			{
				pushFollow(FOLLOW_lc_id_in_button_def1406);
				lc_id();
				state._fsp--;

				// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:386:12:
				// ( ',' button_def )?
				int alt32 = 2;
				int LA32_0 = input.LA(1);
				if ((LA32_0 == 10)) {
					alt32 = 1;
				}
				switch (alt32) {
				case 1:
				// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:386:13:
				// ',' button_def
				{
					match(input, 10, FOLLOW_10_in_button_def1410);
					pushFollow(FOLLOW_button_def_in_button_def1412);
					button_def();
					state._fsp--;

				}
					break;

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "button_def"

	// $ANTLR start "textbox_def"
	// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:389:1:
	// textbox_def : lc_id ( ',' textbox_def )? ;
	public final void textbox_def() throws RecognitionException {
		try {
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:389:13:
			// ( lc_id ( ',' textbox_def )? )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:390:5:
			// lc_id ( ',' textbox_def )?
			{
				pushFollow(FOLLOW_lc_id_in_textbox_def1428);
				lc_id();
				state._fsp--;

				// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:390:11:
				// ( ',' textbox_def )?
				int alt33 = 2;
				int LA33_0 = input.LA(1);
				if ((LA33_0 == 10)) {
					alt33 = 1;
				}
				switch (alt33) {
				case 1:
				// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:390:12:
				// ',' textbox_def
				{
					match(input, 10, FOLLOW_10_in_textbox_def1431);
					pushFollow(FOLLOW_textbox_def_in_textbox_def1433);
					textbox_def();
					state._fsp--;

				}
					break;

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "textbox_def"

	// Delegated rules

	public static final BitSet FOLLOW_36_in_vocabSpec67 = new BitSet(
			new long[] { 0x0000000000000800L });
	public static final BitSet FOLLOW_11_in_vocabSpec79 = new BitSet(
			new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_region_def_in_vocabSpec82 = new BitSet(
			new long[] { 0x0000040000000010L });
	public static final BitSet FOLLOW_42_in_vocabSpec103 = new BitSet(
			new long[] { 0x0000000000000800L });
	public static final BitSet FOLLOW_11_in_vocabSpec105 = new BitSet(
			new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_struct_def_in_vocabSpec108 = new BitSet(
			new long[] { 0x0000004000000010L });
	public static final BitSet FOLLOW_38_in_vocabSpec122 = new BitSet(
			new long[] { 0x0000000000000800L });
	public static final BitSet FOLLOW_11_in_vocabSpec124 = new BitSet(
			new long[] { 0x0000010000000000L });
	public static final BitSet FOLLOW_abilities_def_in_vocabSpec126 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_region_def156 = new BitSet(
			new long[] { 0x0000000000000800L });
	public static final BitSet FOLLOW_11_in_region_def158 = new BitSet(
			new long[] { 0x000000010A24A000L });
	public static final BitSet FOLLOW_dataType_in_region_def160 = new BitSet(
			new long[] { 0x0000000000001000L });
	public static final BitSet FOLLOW_12_in_region_def163 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_struct_def188 = new BitSet(
			new long[] { 0x0000000000000022L });
	public static final BitSet FOLLOW_structField_def_in_struct_def202 = new BitSet(
			new long[] { 0x0000000000001000L });
	public static final BitSet FOLLOW_12_in_struct_def204 = new BitSet(
			new long[] { 0x0000000000000022L });
	public static final BitSet FOLLOW_lc_id_in_structField_def227 = new BitSet(
			new long[] { 0x0000000000000800L });
	public static final BitSet FOLLOW_11_in_structField_def229 = new BitSet(
			new long[] { 0x000000010A24A000L });
	public static final BitSet FOLLOW_dataType_in_structField_def231 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_40_in_abilities_def257 = new BitSet(
			new long[] { 0x0000000000000800L });
	public static final BitSet FOLLOW_11_in_abilities_def259 = new BitSet(
			new long[] { 0x0000030891000000L });
	public static final BitSet FOLLOW_sensor_def_in_abilities_def263 = new BitSet(
			new long[] { 0x0000030081000002L });
	public static final BitSet FOLLOW_24_in_abilities_def273 = new BitSet(
			new long[] { 0x0000000000000800L });
	public static final BitSet FOLLOW_11_in_abilities_def275 = new BitSet(
			new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_actuator_def_in_abilities_def277 = new BitSet(
			new long[] { 0x0000020081000002L });
	public static final BitSet FOLLOW_41_in_abilities_def284 = new BitSet(
			new long[] { 0x0000000000000800L });
	public static final BitSet FOLLOW_11_in_abilities_def287 = new BitSet(
			new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_ss_def_in_abilities_def289 = new BitSet(
			new long[] { 0x0000020080000002L });
	public static final BitSet FOLLOW_31_in_abilities_def296 = new BitSet(
			new long[] { 0x0000000000000800L });
	public static final BitSet FOLLOW_11_in_abilities_def298 = new BitSet(
			new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_gui_def_in_abilities_def301 = new BitSet(
			new long[] { 0x0000000080000012L });
	public static final BitSet FOLLOW_35_in_sensor_def336 = new BitSet(
			new long[] { 0x0000000000000800L });
	public static final BitSet FOLLOW_11_in_sensor_def338 = new BitSet(
			new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_periodicsensor_def_in_sensor_def340 = new BitSet(
			new long[] { 0x0000000810000002L });
	public static final BitSet FOLLOW_28_in_sensor_def363 = new BitSet(
			new long[] { 0x0000000000000800L });
	public static final BitSet FOLLOW_11_in_sensor_def365 = new BitSet(
			new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_eventsensor_def_in_sensor_def367 = new BitSet(
			new long[] { 0x0000000010000002L });
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_periodicsensor_def384 = new BitSet(
			new long[] { 0x0000008040000002L });
	public static final BitSet FOLLOW_sensorMeasurement_def_in_periodicsensor_def397 = new BitSet(
			new long[] { 0x0000000000001000L });
	public static final BitSet FOLLOW_12_in_periodicsensor_def399 = new BitSet(
			new long[] { 0x0000008040000002L });
	public static final BitSet FOLLOW_sensorperiodicMeasurement_def_in_periodicsensor_def409 = new BitSet(
			new long[] { 0x0000000000001000L });
	public static final BitSet FOLLOW_12_in_periodicsensor_def411 = new BitSet(
			new long[] { 0x0000008000000002L });
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_eventsensor_def428 = new BitSet(
			new long[] { 0x0000000240001002L });
	public static final BitSet FOLLOW_sensorMeasurement_def_in_eventsensor_def441 = new BitSet(
			new long[] { 0x0000000000001000L });
	public static final BitSet FOLLOW_12_in_eventsensor_def443 = new BitSet(
			new long[] { 0x0000000240001002L });
	public static final BitSet FOLLOW_sensoreventMeasurement_def_in_eventsensor_def453 = new BitSet(
			new long[] { 0x0000000000001000L });
	public static final BitSet FOLLOW_12_in_eventsensor_def455 = new BitSet(
			new long[] { 0x0000000200001002L });
	public static final BitSet FOLLOW_30_in_sensorMeasurement_def481 = new BitSet(
			new long[] { 0x0000000000000020L });
	public static final BitSet FOLLOW_lc_id_in_sensorMeasurement_def483 = new BitSet(
			new long[] { 0x0000000000000800L });
	public static final BitSet FOLLOW_11_in_sensorMeasurement_def485 = new BitSet(
			new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_sensorMeasurement_def488 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_39_in_sensorperiodicMeasurement_def512 = new BitSet(
			new long[] { 0x0000000400000000L });
	public static final BitSet FOLLOW_34_in_sensorperiodicMeasurement_def514 = new BitSet(
			new long[] { 0x0000000000020000L });
	public static final BitSet FOLLOW_17_in_sensorperiodicMeasurement_def516 = new BitSet(
			new long[] { 0x0000000020000000L });
	public static final BitSet FOLLOW_29_in_sensorperiodicMeasurement_def518 = new BitSet(
			new long[] { 0x0000000000010000L });
	public static final BitSet FOLLOW_16_in_sensorperiodicMeasurement_def520 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_33_in_sensoreventMeasurement_def537 = new BitSet(
			new long[] { 0x0000000200000422L });
	public static final BitSet FOLLOW_ID_in_sensoreventMeasurement_def540 = new BitSet(
			new long[] { 0x0000000200000422L });
	public static final BitSet FOLLOW_10_in_sensoreventMeasurement_def543 = new BitSet(
			new long[] { 0x0000000000000020L });
	public static final BitSet FOLLOW_ID_in_sensoreventMeasurement_def545 = new BitSet(
			new long[] { 0x0000000200000422L });
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_actuator_def568 = new BitSet(
			new long[] { 0x0000000000800002L });
	public static final BitSet FOLLOW_action_def_in_actuator_def579 = new BitSet(
			new long[] { 0x0000000000001000L });
	public static final BitSet FOLLOW_12_in_actuator_def581 = new BitSet(
			new long[] { 0x0000000000800002L });
	public static final BitSet FOLLOW_23_in_action_def605 = new BitSet(
			new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_action_def607 = new BitSet(
			new long[] { 0x0000000000000100L });
	public static final BitSet FOLLOW_8_in_action_def609 = new BitSet(
			new long[] { 0x0000000000000220L });
	public static final BitSet FOLLOW_parameter_def_in_action_def612 = new BitSet(
			new long[] { 0x0000000000000200L });
	public static final BitSet FOLLOW_9_in_action_def616 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_lc_id_in_parameter_def636 = new BitSet(
			new long[] { 0x0000000000000800L });
	public static final BitSet FOLLOW_11_in_parameter_def638 = new BitSet(
			new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_parameter_def641 = new BitSet(
			new long[] { 0x0000000000000402L });
	public static final BitSet FOLLOW_10_in_parameter_def644 = new BitSet(
			new long[] { 0x0000000000000020L });
	public static final BitSet FOLLOW_parameter_def_in_parameter_def646 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_ss_def673 = new BitSet(
			new long[] { 0x0000000040000002L });
	public static final BitSet FOLLOW_storageDataAccess_def_in_ss_def690 = new BitSet(
			new long[] { 0x0000000000001000L });
	public static final BitSet FOLLOW_12_in_ss_def692 = new BitSet(
			new long[] { 0x0000000040000002L });
	public static final BitSet FOLLOW_storageGeneratedInfo_def_in_storageDataAccess_def723 = new BitSet(
			new long[] { 0x0000000000400000L });
	public static final BitSet FOLLOW_22_in_storageDataAccess_def726 = new BitSet(
			new long[] { 0x0000000000000020L });
	public static final BitSet FOLLOW_storagedataIndex_def_in_storageDataAccess_def728 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_30_in_storageGeneratedInfo_def747 = new BitSet(
			new long[] { 0x0000000000000020L });
	public static final BitSet FOLLOW_lc_id_in_storageGeneratedInfo_def749 = new BitSet(
			new long[] { 0x0000000000000800L });
	public static final BitSet FOLLOW_11_in_storageGeneratedInfo_def751 = new BitSet(
			new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_storageGeneratedInfo_def754 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_lc_id_in_storagedataIndex_def776 = new BitSet(
			new long[] { 0x0000000000000800L });
	public static final BitSet FOLLOW_11_in_storagedataIndex_def778 = new BitSet(
			new long[] { 0x000000010A24A000L });
	public static final BitSet FOLLOW_dataType_in_storagedataIndex_def780 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ID_in_lc_id808 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_primitiveType_in_dataType821 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_15_in_primitiveType836 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_13_in_primitiveType842 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_18_in_primitiveType848 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_27_in_primitiveType857 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_32_in_primitiveType865 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_25_in_primitiveType871 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_21_in_primitiveType876 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_def1012 = new BitSet(
			new long[] { 0x0000002004000002L });
	public static final BitSet FOLLOW_gui_command_def_in_gui_def1038 = new BitSet(
			new long[] { 0x0000000000001000L });
	public static final BitSet FOLLOW_12_in_gui_def1040 = new BitSet(
			new long[] { 0x0000002004000002L });
	public static final BitSet FOLLOW_gui_request_def_in_gui_def1051 = new BitSet(
			new long[] { 0x0000000000001000L });
	public static final BitSet FOLLOW_12_in_gui_def1054 = new BitSet(
			new long[] { 0x0000002000000002L });
	public static final BitSet FOLLOW_26_in_gui_command_def1080 = new BitSet(
			new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_command_def1087 = new BitSet(
			new long[] { 0x0000000000000100L });
	public static final BitSet FOLLOW_8_in_gui_command_def1089 = new BitSet(
			new long[] { 0x0000000000000220L });
	public static final BitSet FOLLOW_gui_command_parameter_def_in_gui_command_def1092 = new BitSet(
			new long[] { 0x0000000000000200L });
	public static final BitSet FOLLOW_9_in_gui_command_def1096 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_lc_id_in_gui_command_parameter_def1119 = new BitSet(
			new long[] { 0x0000000000000402L });
	public static final BitSet FOLLOW_10_in_gui_command_parameter_def1122 = new BitSet(
			new long[] { 0x0000000000000020L });
	public static final BitSet FOLLOW_gui_command_parameter_def_in_gui_command_parameter_def1124 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_23_in_gui_action_def1148 = new BitSet(
			new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_action_def1154 = new BitSet(
			new long[] { 0x0000000000000100L });
	public static final BitSet FOLLOW_8_in_gui_action_def1156 = new BitSet(
			new long[] { 0x0000000000000220L });
	public static final BitSet FOLLOW_gui_action_parameter_def_in_gui_action_def1159 = new BitSet(
			new long[] { 0x0000000000000200L });
	public static final BitSet FOLLOW_9_in_gui_action_def1163 = new BitSet(
			new long[] { 0x0000080000000000L });
	public static final BitSet FOLLOW_43_in_gui_action_def1165 = new BitSet(
			new long[] { 0x0000000000000020L });
	public static final BitSet FOLLOW_lc_id_in_gui_action_def1171 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_lc_id_in_gui_action_parameter_def1197 = new BitSet(
			new long[] { 0x0000000000000800L });
	public static final BitSet FOLLOW_11_in_gui_action_parameter_def1199 = new BitSet(
			new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_action_parameter_def1202 = new BitSet(
			new long[] { 0x0000000000000402L });
	public static final BitSet FOLLOW_10_in_gui_action_parameter_def1205 = new BitSet(
			new long[] { 0x0000000000000020L });
	public static final BitSet FOLLOW_gui_action_parameter_def_in_gui_action_parameter_def1207 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_37_in_gui_request_def1229 = new BitSet(
			new long[] { 0x0000000000000020L });
	public static final BitSet FOLLOW_lc_id_in_gui_request_def1231 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ID_in_bt_id1277 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ID_in_txtbx_id1287 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ID_in_txtview_id1297 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_20_in_widget_def1329 = new BitSet(
			new long[] { 0x0000000000000020L });
	public static final BitSet FOLLOW_textview_def_in_widget_def1331 = new BitSet(
			new long[] { 0x0000000000001000L });
	public static final BitSet FOLLOW_12_in_widget_def1333 = new BitSet(
			new long[] { 0x0000000000184002L });
	public static final BitSet FOLLOW_14_in_widget_def1342 = new BitSet(
			new long[] { 0x0000000000000020L });
	public static final BitSet FOLLOW_button_def_in_widget_def1345 = new BitSet(
			new long[] { 0x0000000000001000L });
	public static final BitSet FOLLOW_12_in_widget_def1347 = new BitSet(
			new long[] { 0x0000000000084002L });
	public static final BitSet FOLLOW_19_in_widget_def1356 = new BitSet(
			new long[] { 0x0000000000000020L });
	public static final BitSet FOLLOW_textbox_def_in_widget_def1358 = new BitSet(
			new long[] { 0x0000000000001000L });
	public static final BitSet FOLLOW_12_in_widget_def1360 = new BitSet(
			new long[] { 0x0000000000080002L });
	public static final BitSet FOLLOW_lc_id_in_textview_def1385 = new BitSet(
			new long[] { 0x0000000000000402L });
	public static final BitSet FOLLOW_10_in_textview_def1389 = new BitSet(
			new long[] { 0x0000000000000020L });
	public static final BitSet FOLLOW_textview_def_in_textview_def1391 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_lc_id_in_button_def1406 = new BitSet(
			new long[] { 0x0000000000000402L });
	public static final BitSet FOLLOW_10_in_button_def1410 = new BitSet(
			new long[] { 0x0000000000000020L });
	public static final BitSet FOLLOW_button_def_in_button_def1412 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_lc_id_in_textbox_def1428 = new BitSet(
			new long[] { 0x0000000000000402L });
	public static final BitSet FOLLOW_10_in_textbox_def1431 = new BitSet(
			new long[] { 0x0000000000000020L });
	public static final BitSet FOLLOW_textbox_def_in_textbox_def1433 = new BitSet(
			new long[] { 0x0000000000000002L });
}
