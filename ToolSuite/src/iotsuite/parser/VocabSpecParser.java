// $ANTLR 3.5.1 C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g 2015-02-07 21:49:52
 
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
		"'String'", "'TextBox'", "'TextView'", "'accessed-by'", "'action'", "'actuators'", 
		"'boolean'", "'command'", "'double'", "'generate'", "'long'", "'regions'", 
		"'request'", "'resources'", "'sensors'", "'storages'", "'structs'", "'with'"
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
	@Override public String getGrammarFileName() { return "C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g"; }


	  //Initialize the context
	  private SymbolTable context;



	// $ANTLR start "vocabSpec"
	// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:24:1: vocabSpec : 'regions' ':' ( region_def )+ 'structs' ':' ( struct_def )+ 'resources' ':' abilities_def ;
	public final void vocabSpec() throws RecognitionException {
		try {
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:24:11: ( 'regions' ':' ( region_def )+ 'structs' ':' ( struct_def )+ 'resources' ':' abilities_def )
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:25:5: 'regions' ':' ( region_def )+ 'structs' ':' ( struct_def )+ 'resources' ':' abilities_def
			{
			match(input,27,FOLLOW_27_in_vocabSpec67); 
			 context = new SymbolTable();
			    context.currentRegion = new RegionCompiler();
			    // context.currentMappingConstraint = new MappingConstraint(); 
			    
			match(input,11,FOLLOW_11_in_vocabSpec79); 
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:30:9: ( region_def )+
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
					// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:30:10: region_def
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
			match(input,32,FOLLOW_32_in_vocabSpec103); 
			match(input,11,FOLLOW_11_in_vocabSpec105); 
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:32:19: ( struct_def )+
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
					// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:32:20: struct_def
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

			match(input,29,FOLLOW_29_in_vocabSpec122); 
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
	// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:40:1: region_def : CAPITALIZED_ID ':' dataType ';' ;
	public final void region_def() throws RecognitionException {
		Token CAPITALIZED_ID1=null;
		ParserRuleReturnScope dataType2 =null;

		try {
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:40:12: ( CAPITALIZED_ID ':' dataType ';' )
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:42:6: CAPITALIZED_ID ':' dataType ';'
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
	// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:55:1: struct_def : CAPITALIZED_ID ( structField_def ';' )* ;
	public final void struct_def() throws RecognitionException {
		Token CAPITALIZED_ID3=null;

		try {
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:55:11: ( CAPITALIZED_ID ( structField_def ';' )* )
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:56:5: CAPITALIZED_ID ( structField_def ';' )*
			{
			CAPITALIZED_ID3=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_struct_def188); 
			context.currentStruct = new StructCompiler((CAPITALIZED_ID3!=null?CAPITALIZED_ID3.getText():null));
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:58:5: ( structField_def ';' )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==ID) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:58:6: structField_def ';'
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
	// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:61:1: structField_def : lc_id ':' dataType ;
	public final void structField_def() throws RecognitionException {
		ParserRuleReturnScope lc_id4 =null;
		ParserRuleReturnScope dataType5 =null;

		try {
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:61:16: ( lc_id ':' dataType )
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:62:3: lc_id ':' dataType
			{
			pushFollow(FOLLOW_lc_id_in_structField_def227);
			lc_id4=lc_id();
			state._fsp--;

			match(input,11,FOLLOW_11_in_structField_def229); 
			pushFollow(FOLLOW_dataType_in_structField_def231);
			dataType5=dataType();
			state._fsp--;

			 context.currentStruct.addField((lc_id4!=null?input.toString(lc_id4.start,lc_id4.stop):null), (dataType5!=null?input.toString(dataType5.start,dataType5.stop):null));
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
	// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:69:1: abilities_def : 'sensors' ':' ( sensor_def )+ 'actuators' ':' ( actuator_def )+ ( 'storages' ':' ss_def )* ;
	public final void abilities_def() throws RecognitionException {
		try {
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:69:15: ( 'sensors' ':' ( sensor_def )+ 'actuators' ':' ( actuator_def )+ ( 'storages' ':' ss_def )* )
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:70:3: 'sensors' ':' ( sensor_def )+ 'actuators' ':' ( actuator_def )+ ( 'storages' ':' ss_def )*
			{
			match(input,30,FOLLOW_30_in_abilities_def253); 
			match(input,11,FOLLOW_11_in_abilities_def255); 
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:70:19: ( sensor_def )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==CAPITALIZED_ID) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:70:20: sensor_def
					{
					pushFollow(FOLLOW_sensor_def_in_abilities_def260);
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

			match(input,21,FOLLOW_21_in_abilities_def266); 
			match(input,11,FOLLOW_11_in_abilities_def268); 
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:71:19: ( actuator_def )+
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
					// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:71:20: actuator_def
					{
					pushFollow(FOLLOW_actuator_def_in_abilities_def271);
					actuator_def();
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

			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:72:3: ( 'storages' ':' ss_def )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==31) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:72:4: 'storages' ':' ss_def
					{
					match(input,31,FOLLOW_31_in_abilities_def278); 
					match(input,11,FOLLOW_11_in_abilities_def281); 
					pushFollow(FOLLOW_ss_def_in_abilities_def283);
					ss_def();
					state._fsp--;

					}
					break;

				default :
					break loop6;
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
	// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:80:1: sensor_def : CAPITALIZED_ID ( sensorMeasurement_def ';' )* ;
	public final void sensor_def() throws RecognitionException {
		Token CAPITALIZED_ID6=null;

		try {
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:80:11: ( CAPITALIZED_ID ( sensorMeasurement_def ';' )* )
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:81:5: CAPITALIZED_ID ( sensorMeasurement_def ';' )*
			{
			CAPITALIZED_ID6=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_sensor_def305); 
			context.currentSensor = new SensorCompiler((CAPITALIZED_ID6!=null?CAPITALIZED_ID6.getText():null));
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:83:5: ( sensorMeasurement_def ';' )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==25) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:83:6: sensorMeasurement_def ';'
					{
					pushFollow(FOLLOW_sensorMeasurement_def_in_sensor_def318);
					sensorMeasurement_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_sensor_def320); 
					}
					break;

				default :
					break loop7;
				}
			}

			context.currentSensor.generateSensorCode();
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



	// $ANTLR start "sensorMeasurement_def"
	// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:88:1: sensorMeasurement_def : 'generate' lc_id ':' CAPITALIZED_ID ;
	public final void sensorMeasurement_def() throws RecognitionException {
		Token CAPITALIZED_ID8=null;
		ParserRuleReturnScope lc_id7 =null;

		try {
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:88:23: ( 'generate' lc_id ':' CAPITALIZED_ID )
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:89:5: 'generate' lc_id ':' CAPITALIZED_ID
			{
			match(input,25,FOLLOW_25_in_sensorMeasurement_def344); 
			pushFollow(FOLLOW_lc_id_in_sensorMeasurement_def346);
			lc_id7=lc_id();
			state._fsp--;

			match(input,11,FOLLOW_11_in_sensorMeasurement_def348); 
			CAPITALIZED_ID8=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_sensorMeasurement_def351); 
			 context.currentSensor.addSensorMeasurement((lc_id7!=null?input.toString(lc_id7.start,lc_id7.stop):null), (CAPITALIZED_ID8!=null?CAPITALIZED_ID8.getText():null) ,context.getStructSymblTable((CAPITALIZED_ID8!=null?CAPITALIZED_ID8.getText():null)) ); 
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
	// $ANTLR end "sensorMeasurement_def"



	// $ANTLR start "actuator_def"
	// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:101:1: actuator_def : CAPITALIZED_ID ( action_def ';' )* ;
	public final void actuator_def() throws RecognitionException {
		Token CAPITALIZED_ID9=null;

		try {
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:101:13: ( CAPITALIZED_ID ( action_def ';' )* )
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:102:4: CAPITALIZED_ID ( action_def ';' )*
			{
			CAPITALIZED_ID9=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_actuator_def376); 
			context.currentActuator = new ActuatorCompiler((CAPITALIZED_ID9!=null?CAPITALIZED_ID9.getText():null));
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:104:4: ( action_def ';' )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==20) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:104:5: action_def ';'
					{
					pushFollow(FOLLOW_action_def_in_actuator_def387);
					action_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_actuator_def389); 
					}
					break;

				default :
					break loop8;
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
	// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:109:1: action_def : 'action' CAPITALIZED_ID '(' ( parameter_def )? ')' ;
	public final void action_def() throws RecognitionException {
		Token CAPITALIZED_ID10=null;

		try {
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:109:11: ( 'action' CAPITALIZED_ID '(' ( parameter_def )? ')' )
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:110:5: 'action' CAPITALIZED_ID '(' ( parameter_def )? ')'
			{
			match(input,20,FOLLOW_20_in_action_def413); 
			CAPITALIZED_ID10=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_action_def415); 
			match(input,8,FOLLOW_8_in_action_def417); 
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:110:33: ( parameter_def )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==ID) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:110:34: parameter_def
					{
					pushFollow(FOLLOW_parameter_def_in_action_def420);
					parameter_def();
					state._fsp--;

					}
					break;

			}

			match(input,9,FOLLOW_9_in_action_def424); 
			 context.currentActuator.addAction((CAPITALIZED_ID10!=null?CAPITALIZED_ID10.getText():null)); 
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
	// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:114:1: parameter_def : lc_id ':' CAPITALIZED_ID ( ',' parameter_def )? ;
	public final void parameter_def() throws RecognitionException {
		Token CAPITALIZED_ID12=null;
		ParserRuleReturnScope lc_id11 =null;

		try {
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:114:15: ( lc_id ':' CAPITALIZED_ID ( ',' parameter_def )? )
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:115:5: lc_id ':' CAPITALIZED_ID ( ',' parameter_def )?
			{
			pushFollow(FOLLOW_lc_id_in_parameter_def444);
			lc_id11=lc_id();
			state._fsp--;

			match(input,11,FOLLOW_11_in_parameter_def446); 
			CAPITALIZED_ID12=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_parameter_def449); 
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:115:31: ( ',' parameter_def )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==10) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:115:32: ',' parameter_def
					{
					match(input,10,FOLLOW_10_in_parameter_def452); 
					pushFollow(FOLLOW_parameter_def_in_parameter_def454);
					parameter_def();
					state._fsp--;

					}
					break;

			}

			 
			    context.currentActuator.addParameter((lc_id11!=null?input.toString(lc_id11.start,lc_id11.stop):null), (CAPITALIZED_ID12!=null?CAPITALIZED_ID12.getText():null)); 
			    context.constructSymbTable((lc_id11!=null?input.toString(lc_id11.start,lc_id11.stop):null), (CAPITALIZED_ID12!=null?CAPITALIZED_ID12.getText():null));
			    
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
	// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:129:1: ss_def : CAPITALIZED_ID ( storageDataAccess_def ';' )* ;
	public final void ss_def() throws RecognitionException {
		Token CAPITALIZED_ID13=null;

		try {
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:129:7: ( CAPITALIZED_ID ( storageDataAccess_def ';' )* )
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:130:3: CAPITALIZED_ID ( storageDataAccess_def ';' )*
			{
			CAPITALIZED_ID13=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_ss_def481); 
			 context.currentStorageService = new StorageCompiler();
			      //context.currentStorageService = new Storage((CAPITALIZED_ID13!=null?CAPITALIZED_ID13.getText():null));
			      
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:135:5: ( storageDataAccess_def ';' )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==25) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:135:6: storageDataAccess_def ';'
					{
					pushFollow(FOLLOW_storageDataAccess_def_in_ss_def498);
					storageDataAccess_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_ss_def500); 
					}
					break;

				default :
					break loop11;
				}
			}


			     context.currentStorageService.setStorageServiceName((CAPITALIZED_ID13!=null?CAPITALIZED_ID13.getText():null));
			     context.currentStorageService.createStorageObject();
			     context.currentStorageService.generateStorageCode(); 
			    // context.currentMappingConstraint.setSoftwareComponentName((CAPITALIZED_ID13!=null?CAPITALIZED_ID13.getText():null));
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
	// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:148:1: storageDataAccess_def : storageGeneratedInfo_def 'accessed-by' storagedataIndex_def ;
	public final void storageDataAccess_def() throws RecognitionException {
		try {
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:148:23: ( storageGeneratedInfo_def 'accessed-by' storagedataIndex_def )
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:149:6: storageGeneratedInfo_def 'accessed-by' storagedataIndex_def
			{
			pushFollow(FOLLOW_storageGeneratedInfo_def_in_storageDataAccess_def531);
			storageGeneratedInfo_def();
			state._fsp--;

			match(input,19,FOLLOW_19_in_storageDataAccess_def534); 
			pushFollow(FOLLOW_storagedataIndex_def_in_storageDataAccess_def536);
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
	// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:153:1: storageGeneratedInfo_def : 'generate' lc_id ':' CAPITALIZED_ID ;
	public final void storageGeneratedInfo_def() throws RecognitionException {
		Token CAPITALIZED_ID15=null;
		ParserRuleReturnScope lc_id14 =null;

		try {
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:153:26: ( 'generate' lc_id ':' CAPITALIZED_ID )
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:154:5: 'generate' lc_id ':' CAPITALIZED_ID
			{
			match(input,25,FOLLOW_25_in_storageGeneratedInfo_def555); 
			pushFollow(FOLLOW_lc_id_in_storageGeneratedInfo_def557);
			lc_id14=lc_id();
			state._fsp--;

			match(input,11,FOLLOW_11_in_storageGeneratedInfo_def559); 
			CAPITALIZED_ID15=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_storageGeneratedInfo_def562); 
			 context.currentStorageService.addGeneratedInfo((lc_id14!=null?input.toString(lc_id14.start,lc_id14.stop):null), (CAPITALIZED_ID15!=null?CAPITALIZED_ID15.getText():null));  
			    context.constructSymbTable((lc_id14!=null?input.toString(lc_id14.start,lc_id14.stop):null), (CAPITALIZED_ID15!=null?CAPITALIZED_ID15.getText():null));
			    context.constructResponseTypeSymblTable((lc_id14!=null?input.toString(lc_id14.start,lc_id14.stop):null), (CAPITALIZED_ID15!=null?CAPITALIZED_ID15.getText():null));
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
	// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:160:1: storagedataIndex_def : lc_id ':' dataType ;
	public final void storagedataIndex_def() throws RecognitionException {
		ParserRuleReturnScope lc_id16 =null;
		ParserRuleReturnScope dataType17 =null;

		try {
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:160:21: ( lc_id ':' dataType )
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:161:9: lc_id ':' dataType
			{
			pushFollow(FOLLOW_lc_id_in_storagedataIndex_def584);
			lc_id16=lc_id();
			state._fsp--;

			match(input,11,FOLLOW_11_in_storagedataIndex_def586); 
			pushFollow(FOLLOW_dataType_in_storagedataIndex_def588);
			dataType17=dataType();
			state._fsp--;

			 context.currentStorageService.addDataAccessIndex((lc_id16!=null?input.toString(lc_id16.start,lc_id16.stop):null), (dataType17!=null?input.toString(dataType17.start,dataType17.stop):null));  
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
	// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:180:1: lc_id : ID ;
	public final VocabSpecParser.lc_id_return lc_id() throws RecognitionException {
		VocabSpecParser.lc_id_return retval = new VocabSpecParser.lc_id_return();
		retval.start = input.LT(1);

		try {
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:180:6: ( ID )
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:180:8: ID
			{
			match(input,ID,FOLLOW_ID_in_lc_id616); 
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
	// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:183:1: dataType : primitiveType ;
	public final VocabSpecParser.dataType_return dataType() throws RecognitionException {
		VocabSpecParser.dataType_return retval = new VocabSpecParser.dataType_return();
		retval.start = input.LT(1);

		try {
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:183:9: ( primitiveType )
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:184:3: primitiveType
			{
			pushFollow(FOLLOW_primitiveType_in_dataType629);
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
	// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:187:1: primitiveType : (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' ) ;
	public final void primitiveType() throws RecognitionException {
		Token id=null;

		try {
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:187:14: ( (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' ) )
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:188:3: (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' )
			{
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:188:3: (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' )
			int alt12=6;
			switch ( input.LA(1) ) {
			case 15:
				{
				alt12=1;
				}
				break;
			case 13:
				{
				alt12=2;
				}
				break;
			case 16:
				{
				alt12=3;
				}
				break;
			case 24:
				{
				alt12=4;
				}
				break;
			case 26:
				{
				alt12=5;
				}
				break;
			case 22:
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
					// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:188:4: id= 'Integer'
					{
					id=(Token)match(input,15,FOLLOW_15_in_primitiveType644); 
					}
					break;
				case 2 :
					// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:188:19: id= 'Boolean'
					{
					id=(Token)match(input,13,FOLLOW_13_in_primitiveType650); 
					}
					break;
				case 3 :
					// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:188:34: id= 'String'
					{
					id=(Token)match(input,16,FOLLOW_16_in_primitiveType656); 
					}
					break;
				case 4 :
					// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:188:49: id= 'double'
					{
					id=(Token)match(input,24,FOLLOW_24_in_primitiveType665); 
					}
					break;
				case 5 :
					// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:188:65: id= 'long'
					{
					id=(Token)match(input,26,FOLLOW_26_in_primitiveType673); 
					}
					break;
				case 6 :
					// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:188:79: id= 'boolean'
					{
					id=(Token)match(input,22,FOLLOW_22_in_primitiveType679); 
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
	// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:209:1: gui_def : CAPITALIZED_ID ( gui_command_def ';' )* ( gui_request_def ';' )* ;
	public final void gui_def() throws RecognitionException {
		Token CAPITALIZED_ID18=null;

		try {
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:209:8: ( CAPITALIZED_ID ( gui_command_def ';' )* ( gui_request_def ';' )* )
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:210:3: CAPITALIZED_ID ( gui_command_def ';' )* ( gui_request_def ';' )*
			{
			context.currentGUI = new UserInterfaceCompiler();
			CAPITALIZED_ID18=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_gui_def816); 
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:214:4: ( gui_command_def ';' )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==23) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:214:5: gui_command_def ';'
					{
					pushFollow(FOLLOW_gui_command_def_in_gui_def842);
					gui_command_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_gui_def844); 
					}
					break;

				default :
					break loop13;
				}
			}

			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:215:4: ( gui_request_def ';' )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==28) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:215:5: gui_request_def ';'
					{
					pushFollow(FOLLOW_gui_request_def_in_gui_def855);
					gui_request_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_gui_def858); 
					}
					break;

				default :
					break loop14;
				}
			}

			context.currentGUI.setGUIName((CAPITALIZED_ID18!=null?CAPITALIZED_ID18.getText():null)); 
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
	// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:221:1: gui_command_def : 'command' name= CAPITALIZED_ID '(' ( gui_command_parameter_def )? ')' ;
	public final void gui_command_def() throws RecognitionException {
		Token name=null;

		try {
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:221:17: ( 'command' name= CAPITALIZED_ID '(' ( gui_command_parameter_def )? ')' )
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:222:5: 'command' name= CAPITALIZED_ID '(' ( gui_command_parameter_def )? ')'
			{
			match(input,23,FOLLOW_23_in_gui_command_def884); 
			name=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_gui_command_def891); 
			match(input,8,FOLLOW_8_in_gui_command_def893); 
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:222:42: ( gui_command_parameter_def )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==ID) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:222:43: gui_command_parameter_def
					{
					pushFollow(FOLLOW_gui_command_parameter_def_in_gui_command_def896);
					gui_command_parameter_def();
					state._fsp--;

					}
					break;

			}

			match(input,9,FOLLOW_9_in_gui_command_def900); 
			 
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
	// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:229:1: gui_command_parameter_def : lc_id ( ',' gui_command_parameter_def )? ;
	public final void gui_command_parameter_def() throws RecognitionException {
		ParserRuleReturnScope lc_id19 =null;

		try {
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:229:27: ( lc_id ( ',' gui_command_parameter_def )? )
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:230:5: lc_id ( ',' gui_command_parameter_def )?
			{
			pushFollow(FOLLOW_lc_id_in_gui_command_parameter_def923);
			lc_id19=lc_id();
			state._fsp--;

			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:230:11: ( ',' gui_command_parameter_def )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==10) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:230:12: ',' gui_command_parameter_def
					{
					match(input,10,FOLLOW_10_in_gui_command_parameter_def926); 
					pushFollow(FOLLOW_gui_command_parameter_def_in_gui_command_parameter_def928);
					gui_command_parameter_def();
					state._fsp--;

					}
					break;

			}

			 
			    context.currentGUI.addCommandParameter((lc_id19!=null?input.toString(lc_id19.start,lc_id19.stop):null)); 
			    
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
	// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:239:1: gui_action_def : 'action' name= CAPITALIZED_ID '(' ( gui_action_parameter_def )? ')' 'with' ui= lc_id ;
	public final void gui_action_def() throws RecognitionException {
		Token name=null;
		ParserRuleReturnScope ui =null;

		try {
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:239:15: ( 'action' name= CAPITALIZED_ID '(' ( gui_action_parameter_def )? ')' 'with' ui= lc_id )
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:240:5: 'action' name= CAPITALIZED_ID '(' ( gui_action_parameter_def )? ')' 'with' ui= lc_id
			{
			match(input,20,FOLLOW_20_in_gui_action_def952); 
			name=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_gui_action_def958); 
			match(input,8,FOLLOW_8_in_gui_action_def960); 
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:240:40: ( gui_action_parameter_def )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==ID) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:240:41: gui_action_parameter_def
					{
					pushFollow(FOLLOW_gui_action_parameter_def_in_gui_action_def963);
					gui_action_parameter_def();
					state._fsp--;

					}
					break;

			}

			match(input,9,FOLLOW_9_in_gui_action_def967); 
			match(input,33,FOLLOW_33_in_gui_action_def969); 
			pushFollow(FOLLOW_lc_id_in_gui_action_def975);
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
	// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:250:1: gui_action_parameter_def : lc_id ':' CAPITALIZED_ID ( ',' gui_action_parameter_def )? ;
	public final void gui_action_parameter_def() throws RecognitionException {
		Token CAPITALIZED_ID21=null;
		ParserRuleReturnScope lc_id20 =null;

		try {
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:250:26: ( lc_id ':' CAPITALIZED_ID ( ',' gui_action_parameter_def )? )
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:251:5: lc_id ':' CAPITALIZED_ID ( ',' gui_action_parameter_def )?
			{
			pushFollow(FOLLOW_lc_id_in_gui_action_parameter_def1001);
			lc_id20=lc_id();
			state._fsp--;

			match(input,11,FOLLOW_11_in_gui_action_parameter_def1003); 
			CAPITALIZED_ID21=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_gui_action_parameter_def1006); 
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:251:31: ( ',' gui_action_parameter_def )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==10) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:251:32: ',' gui_action_parameter_def
					{
					match(input,10,FOLLOW_10_in_gui_action_parameter_def1009); 
					pushFollow(FOLLOW_gui_action_parameter_def_in_gui_action_parameter_def1011);
					gui_action_parameter_def();
					state._fsp--;

					}
					break;

			}

			 
			    context.currentGUI.addActionParameter((lc_id20!=null?input.toString(lc_id20.start,lc_id20.stop):null), (CAPITALIZED_ID21!=null?CAPITALIZED_ID21.getText():null)); 
			    context.constructSymbTable((lc_id20!=null?input.toString(lc_id20.start,lc_id20.stop):null), (CAPITALIZED_ID21!=null?CAPITALIZED_ID21.getText():null));
			    
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
	// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:258:1: gui_request_def : 'request' lc_id ;
	public final void gui_request_def() throws RecognitionException {
		ParserRuleReturnScope lc_id22 =null;

		try {
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:258:17: ( 'request' lc_id )
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:259:4: 'request' lc_id
			{
			match(input,28,FOLLOW_28_in_gui_request_def1033); 
			pushFollow(FOLLOW_lc_id_in_gui_request_def1035);
			lc_id22=lc_id();
			state._fsp--;

			 context.currentGUI.getDataAccessListFromSymblTable((lc_id22!=null?input.toString(lc_id22.start,lc_id22.stop):null));
			     context.currentGUI.setRequestType(context.getResponseTypeSymblTable((lc_id22!=null?input.toString(lc_id22.start,lc_id22.stop):null)));
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
	// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:294:1: bt_id : ID ;
	public final void bt_id() throws RecognitionException {
		try {
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:294:7: ( ID )
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:294:10: ID
			{
			match(input,ID,FOLLOW_ID_in_bt_id1081); 
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
	// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:296:1: txtbx_id : ID ;
	public final void txtbx_id() throws RecognitionException {
		try {
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:296:10: ( ID )
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:296:13: ID
			{
			match(input,ID,FOLLOW_ID_in_txtbx_id1091); 
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
	// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:298:1: txtview_id : ID ;
	public final void txtview_id() throws RecognitionException {
		try {
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:298:12: ( ID )
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:298:15: ID
			{
			match(input,ID,FOLLOW_ID_in_txtview_id1101); 
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
	// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:316:1: widget_def : ( 'TextView' textview_def ';' )* ( 'Button' button_def ';' )* ( 'TextBox' textbox_def ';' )* ;
	public final void widget_def() throws RecognitionException {
		try {
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:316:12: ( ( 'TextView' textview_def ';' )* ( 'Button' button_def ';' )* ( 'TextBox' textbox_def ';' )* )
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:317:5: ( 'TextView' textview_def ';' )* ( 'Button' button_def ';' )* ( 'TextBox' textbox_def ';' )*
			{
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:317:5: ( 'TextView' textview_def ';' )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==18) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:317:6: 'TextView' textview_def ';'
					{
					match(input,18,FOLLOW_18_in_widget_def1133); 
					pushFollow(FOLLOW_textview_def_in_widget_def1135);
					textview_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_widget_def1137); 
					}
					break;

				default :
					break loop19;
				}
			}

			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:318:5: ( 'Button' button_def ';' )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==14) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:318:6: 'Button' button_def ';'
					{
					match(input,14,FOLLOW_14_in_widget_def1146); 
					pushFollow(FOLLOW_button_def_in_widget_def1149);
					button_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_widget_def1151); 
					}
					break;

				default :
					break loop20;
				}
			}

			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:319:5: ( 'TextBox' textbox_def ';' )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==17) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:319:6: 'TextBox' textbox_def ';'
					{
					match(input,17,FOLLOW_17_in_widget_def1160); 
					pushFollow(FOLLOW_textbox_def_in_widget_def1162);
					textbox_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_widget_def1164); 
					}
					break;

				default :
					break loop21;
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
	// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:326:1: textview_def : lc_id ( ',' textview_def )? ;
	public final void textview_def() throws RecognitionException {
		try {
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:326:14: ( lc_id ( ',' textview_def )? )
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:327:5: lc_id ( ',' textview_def )?
			{
			pushFollow(FOLLOW_lc_id_in_textview_def1189);
			lc_id();
			state._fsp--;

			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:327:12: ( ',' textview_def )?
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==10) ) {
				alt22=1;
			}
			switch (alt22) {
				case 1 :
					// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:327:13: ',' textview_def
					{
					match(input,10,FOLLOW_10_in_textview_def1193); 
					pushFollow(FOLLOW_textview_def_in_textview_def1195);
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
	// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:330:1: button_def : lc_id ( ',' button_def )? ;
	public final void button_def() throws RecognitionException {
		try {
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:330:12: ( lc_id ( ',' button_def )? )
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:331:5: lc_id ( ',' button_def )?
			{
			pushFollow(FOLLOW_lc_id_in_button_def1210);
			lc_id();
			state._fsp--;

			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:331:12: ( ',' button_def )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==10) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:331:13: ',' button_def
					{
					match(input,10,FOLLOW_10_in_button_def1214); 
					pushFollow(FOLLOW_button_def_in_button_def1216);
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
	// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:334:1: textbox_def : lc_id ( ',' textbox_def )? ;
	public final void textbox_def() throws RecognitionException {
		try {
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:334:13: ( lc_id ( ',' textbox_def )? )
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:335:5: lc_id ( ',' textbox_def )?
			{
			pushFollow(FOLLOW_lc_id_in_textbox_def1232);
			lc_id();
			state._fsp--;

			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:335:11: ( ',' textbox_def )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==10) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\VocabSpec.g:335:12: ',' textbox_def
					{
					match(input,10,FOLLOW_10_in_textbox_def1235); 
					pushFollow(FOLLOW_textbox_def_in_textbox_def1237);
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



	public static final BitSet FOLLOW_27_in_vocabSpec67 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_vocabSpec79 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_region_def_in_vocabSpec82 = new BitSet(new long[]{0x0000000100000010L});
	public static final BitSet FOLLOW_32_in_vocabSpec103 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_vocabSpec105 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_struct_def_in_vocabSpec108 = new BitSet(new long[]{0x0000000020000010L});
	public static final BitSet FOLLOW_29_in_vocabSpec122 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_vocabSpec124 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_abilities_def_in_vocabSpec126 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_region_def156 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_region_def158 = new BitSet(new long[]{0x000000000541A000L});
	public static final BitSet FOLLOW_dataType_in_region_def160 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_region_def163 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_struct_def188 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_structField_def_in_struct_def202 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_struct_def204 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_lc_id_in_structField_def227 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_structField_def229 = new BitSet(new long[]{0x000000000541A000L});
	public static final BitSet FOLLOW_dataType_in_structField_def231 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_abilities_def253 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_abilities_def255 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_sensor_def_in_abilities_def260 = new BitSet(new long[]{0x0000000000200010L});
	public static final BitSet FOLLOW_21_in_abilities_def266 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_abilities_def268 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_actuator_def_in_abilities_def271 = new BitSet(new long[]{0x0000000080000012L});
	public static final BitSet FOLLOW_31_in_abilities_def278 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_abilities_def281 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ss_def_in_abilities_def283 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_sensor_def305 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_sensorMeasurement_def_in_sensor_def318 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_sensor_def320 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_25_in_sensorMeasurement_def344 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_lc_id_in_sensorMeasurement_def346 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_sensorMeasurement_def348 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_sensorMeasurement_def351 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_actuator_def376 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_action_def_in_actuator_def387 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_actuator_def389 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_20_in_action_def413 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_action_def415 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_action_def417 = new BitSet(new long[]{0x0000000000000220L});
	public static final BitSet FOLLOW_parameter_def_in_action_def420 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_action_def424 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lc_id_in_parameter_def444 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_parameter_def446 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_parameter_def449 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_10_in_parameter_def452 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_parameter_def_in_parameter_def454 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_ss_def481 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_storageDataAccess_def_in_ss_def498 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_ss_def500 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_storageGeneratedInfo_def_in_storageDataAccess_def531 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_storageDataAccess_def534 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_storagedataIndex_def_in_storageDataAccess_def536 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_storageGeneratedInfo_def555 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_lc_id_in_storageGeneratedInfo_def557 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_storageGeneratedInfo_def559 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_storageGeneratedInfo_def562 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lc_id_in_storagedataIndex_def584 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_storagedataIndex_def586 = new BitSet(new long[]{0x000000000541A000L});
	public static final BitSet FOLLOW_dataType_in_storagedataIndex_def588 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_lc_id616 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveType_in_dataType629 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_primitiveType644 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_primitiveType650 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_primitiveType656 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_primitiveType665 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_primitiveType673 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_primitiveType679 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_def816 = new BitSet(new long[]{0x0000000010800002L});
	public static final BitSet FOLLOW_gui_command_def_in_gui_def842 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_gui_def844 = new BitSet(new long[]{0x0000000010800002L});
	public static final BitSet FOLLOW_gui_request_def_in_gui_def855 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_gui_def858 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_23_in_gui_command_def884 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_command_def891 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_gui_command_def893 = new BitSet(new long[]{0x0000000000000220L});
	public static final BitSet FOLLOW_gui_command_parameter_def_in_gui_command_def896 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_gui_command_def900 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lc_id_in_gui_command_parameter_def923 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_10_in_gui_command_parameter_def926 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_gui_command_parameter_def_in_gui_command_parameter_def928 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_gui_action_def952 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_action_def958 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_gui_action_def960 = new BitSet(new long[]{0x0000000000000220L});
	public static final BitSet FOLLOW_gui_action_parameter_def_in_gui_action_def963 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_gui_action_def967 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_gui_action_def969 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_lc_id_in_gui_action_def975 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lc_id_in_gui_action_parameter_def1001 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_gui_action_parameter_def1003 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_action_parameter_def1006 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_10_in_gui_action_parameter_def1009 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_gui_action_parameter_def_in_gui_action_parameter_def1011 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_gui_request_def1033 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_lc_id_in_gui_request_def1035 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_bt_id1081 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_txtbx_id1091 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_txtview_id1101 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_widget_def1133 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_textview_def_in_widget_def1135 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_widget_def1137 = new BitSet(new long[]{0x0000000000064002L});
	public static final BitSet FOLLOW_14_in_widget_def1146 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_button_def_in_widget_def1149 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_widget_def1151 = new BitSet(new long[]{0x0000000000024002L});
	public static final BitSet FOLLOW_17_in_widget_def1160 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_textbox_def_in_widget_def1162 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_widget_def1164 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_lc_id_in_textview_def1189 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_10_in_textview_def1193 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_textview_def_in_textview_def1195 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lc_id_in_button_def1210 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_10_in_button_def1214 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_button_def_in_button_def1216 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lc_id_in_textbox_def1232 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_10_in_textbox_def1235 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_textbox_def_in_textbox_def1237 = new BitSet(new long[]{0x0000000000000002L});
}
