// $ANTLR 3.5.1 C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g 2015-11-17 22:32:16

  package iotsuite.parser; 
  


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class VocabSpecLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public VocabSpecLexer() {} 
	public VocabSpecLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public VocabSpecLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g"; }

	// $ANTLR start "T__8"
	public final void mT__8() throws RecognitionException {
		try {
			int _type = T__8;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:12:6: ( '(' )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:12:8: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__8"

	// $ANTLR start "T__9"
	public final void mT__9() throws RecognitionException {
		try {
			int _type = T__9;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:13:6: ( ')' )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:13:8: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__9"

	// $ANTLR start "T__10"
	public final void mT__10() throws RecognitionException {
		try {
			int _type = T__10;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:14:7: ( ',' )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:14:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__10"

	// $ANTLR start "T__11"
	public final void mT__11() throws RecognitionException {
		try {
			int _type = T__11;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:15:7: ( ':' )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:15:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__11"

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:16:7: ( ';' )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:16:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__12"

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:17:7: ( 'Boolean' )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:17:9: 'Boolean'
			{
			match("Boolean"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:18:7: ( 'Integer' )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:18:9: 'Integer'
			{
			match("Integer"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:19:7: ( 'String' )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:19:9: 'String'
			{
			match("String"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:20:7: ( '_' )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:20:9: '_'
			{
			match('_'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:21:7: ( 'accessed-by' )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:21:9: 'accessed-by'
			{
			match("accessed-by"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:22:7: ( 'action' )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:22:9: 'action'
			{
			match("action"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:23:7: ( 'actuators' )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:23:9: 'actuators'
			{
			match("actuators"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:24:7: ( 'boolean' )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:24:9: 'boolean'
			{
			match("boolean"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:25:7: ( 'double' )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:25:9: 'double'
			{
			match("double"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:26:7: ( 'eventDrivenSensors' )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:26:9: 'eventDrivenSensors'
			{
			match("eventDrivenSensors"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:27:7: ( 'for' )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:27:9: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:28:7: ( 'generate' )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:28:9: 'generate'
			{
			match("generate"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:29:7: ( 'long' )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:29:9: 'long'
			{
			match("long"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:30:7: ( 'onCondition' )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:30:9: 'onCondition'
			{
			match("onCondition"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:31:7: ( 'period' )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:31:9: 'period'
			{
			match("period"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:32:7: ( 'periodicSensors' )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:32:9: 'periodicSensors'
			{
			match("periodicSensors"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:33:7: ( 'resources' )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:33:9: 'resources'
			{
			match("resources"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:34:7: ( 'sample' )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:34:9: 'sample'
			{
			match("sample"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:35:7: ( 'sensors' )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:35:9: 'sensors'
			{
			match("sensors"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:36:7: ( 'storages' )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:36:9: 'storages'
			{
			match("storages"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__32"

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:37:7: ( 'structs' )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:37:9: 'structs'
			{
			match("structs"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__33"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:204:5: ( 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:204:7: 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			{
			matchRange('a','z'); 
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:204:17: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:206:5: ( '0' .. '9' ( '0' .. '9' )* )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:206:7: '0' .. '9' ( '0' .. '9' )*
			{
			matchRange('0','9'); 
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:206:15: ( '0' .. '9' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop2;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "CAPITALIZED_ID"
	public final void mCAPITALIZED_ID() throws RecognitionException {
		try {
			int _type = CAPITALIZED_ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:209:15: ( 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' )* )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:209:17: 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' )*
			{
			matchRange('A','Z'); 
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:209:26: ( 'a' .. 'z' | 'A' .. 'Z' )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= 'A' && LA3_0 <= 'Z')||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:
					{
					if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop3;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CAPITALIZED_ID"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:211:3: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+ )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:211:5: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
			{
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:211:5: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '\t' && LA4_0 <= '\n')||(LA4_0 >= '\f' && LA4_0 <= '\r')||LA4_0==' ') ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			_channel = HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:1:8: ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | ID | INT | CAPITALIZED_ID | WS )
		int alt5=30;
		alt5 = dfa5.predict(input);
		switch (alt5) {
			case 1 :
				// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:1:10: T__8
				{
				mT__8(); 

				}
				break;
			case 2 :
				// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:1:15: T__9
				{
				mT__9(); 

				}
				break;
			case 3 :
				// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:1:20: T__10
				{
				mT__10(); 

				}
				break;
			case 4 :
				// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:1:26: T__11
				{
				mT__11(); 

				}
				break;
			case 5 :
				// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:1:32: T__12
				{
				mT__12(); 

				}
				break;
			case 6 :
				// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:1:38: T__13
				{
				mT__13(); 

				}
				break;
			case 7 :
				// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:1:44: T__14
				{
				mT__14(); 

				}
				break;
			case 8 :
				// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:1:50: T__15
				{
				mT__15(); 

				}
				break;
			case 9 :
				// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:1:56: T__16
				{
				mT__16(); 

				}
				break;
			case 10 :
				// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:1:62: T__17
				{
				mT__17(); 

				}
				break;
			case 11 :
				// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:1:68: T__18
				{
				mT__18(); 

				}
				break;
			case 12 :
				// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:1:74: T__19
				{
				mT__19(); 

				}
				break;
			case 13 :
				// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:1:80: T__20
				{
				mT__20(); 

				}
				break;
			case 14 :
				// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:1:86: T__21
				{
				mT__21(); 

				}
				break;
			case 15 :
				// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:1:92: T__22
				{
				mT__22(); 

				}
				break;
			case 16 :
				// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:1:98: T__23
				{
				mT__23(); 

				}
				break;
			case 17 :
				// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:1:104: T__24
				{
				mT__24(); 

				}
				break;
			case 18 :
				// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:1:110: T__25
				{
				mT__25(); 

				}
				break;
			case 19 :
				// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:1:116: T__26
				{
				mT__26(); 

				}
				break;
			case 20 :
				// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:1:122: T__27
				{
				mT__27(); 

				}
				break;
			case 21 :
				// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:1:128: T__28
				{
				mT__28(); 

				}
				break;
			case 22 :
				// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:1:134: T__29
				{
				mT__29(); 

				}
				break;
			case 23 :
				// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:1:140: T__30
				{
				mT__30(); 

				}
				break;
			case 24 :
				// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:1:146: T__31
				{
				mT__31(); 

				}
				break;
			case 25 :
				// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:1:152: T__32
				{
				mT__32(); 

				}
				break;
			case 26 :
				// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:1:158: T__33
				{
				mT__33(); 

				}
				break;
			case 27 :
				// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:1:164: ID
				{
				mID(); 

				}
				break;
			case 28 :
				// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:1:167: INT
				{
				mINT(); 

				}
				break;
			case 29 :
				// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:1:171: CAPITALIZED_ID
				{
				mCAPITALIZED_ID(); 

				}
				break;
			case 30 :
				// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\VocabSpec.g:1:186: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA5 dfa5 = new DFA5(this);
	static final String DFA5_eotS =
		"\6\uffff\3\27\1\uffff\13\25\4\uffff\3\27\15\25\3\27\5\25\1\104\11\25\3"+
		"\27\6\25\1\uffff\1\25\1\130\7\25\3\27\7\25\1\uffff\7\25\2\27\1\163\1\25"+
		"\1\165\2\25\1\170\3\25\1\175\1\25\1\177\3\25\1\u0083\1\u0084\1\uffff\1"+
		"\25\1\uffff\1\25\1\u0087\1\uffff\4\25\1\uffff\1\25\1\uffff\1\u008d\1\25"+
		"\1\u008f\2\uffff\2\25\1\uffff\1\25\1\u0093\3\25\1\uffff\1\u0097\2\uffff"+
		"\1\u0098\1\25\1\uffff\2\25\1\u009c\2\uffff\3\25\1\uffff\1\25\1\u00a1\2"+
		"\25\1\uffff\6\25\1\u00aa\1\25\1\uffff\1\25\1\u00ad\1\uffff";
	static final String DFA5_eofS =
		"\u00ae\uffff";
	static final String DFA5_minS =
		"\1\11\5\uffff\1\157\1\156\1\164\1\uffff\1\143\2\157\1\166\1\157\1\145"+
		"\1\157\1\156\2\145\1\141\4\uffff\1\157\1\164\1\162\1\143\1\157\1\165\1"+
		"\145\1\162\2\156\1\103\1\162\1\163\1\155\1\156\1\157\1\154\1\145\1\151"+
		"\1\145\1\151\1\154\1\142\1\156\1\60\1\145\1\147\1\157\1\151\1\157\1\160"+
		"\1\163\1\162\1\165\1\145\1\147\1\156\1\163\1\157\1\141\1\145\1\154\1\164"+
		"\1\uffff\1\162\1\60\1\156\1\157\1\165\1\154\1\157\1\141\1\143\1\141\1"+
		"\145\1\147\1\163\1\156\1\164\1\141\1\145\1\104\1\141\1\uffff\2\144\1\162"+
		"\1\145\1\162\1\147\1\164\1\156\1\162\1\101\1\145\1\60\1\157\1\156\1\60"+
		"\1\162\1\164\1\151\1\60\1\143\1\60\1\163\1\145\1\163\2\101\1\uffff\1\144"+
		"\1\uffff\1\162\1\60\1\uffff\1\151\1\145\1\164\1\143\1\uffff\1\145\1\uffff"+
		"\1\60\1\163\1\60\2\uffff\1\55\1\163\1\uffff\1\166\1\60\1\151\1\123\1\163"+
		"\1\uffff\1\60\2\uffff\1\60\1\145\1\uffff\1\157\1\145\1\60\2\uffff\3\156"+
		"\1\uffff\1\123\1\60\1\163\1\145\1\uffff\1\157\1\156\1\162\2\163\1\157"+
		"\1\60\1\162\1\uffff\1\163\1\60\1\uffff";
	static final String DFA5_maxS =
		"\1\172\5\uffff\1\157\1\156\1\164\1\uffff\1\143\2\157\1\166\1\157\1\145"+
		"\1\157\1\156\2\145\1\164\4\uffff\1\157\1\164\1\162\1\164\1\157\1\165\1"+
		"\145\1\162\2\156\1\103\1\162\1\163\1\155\1\156\1\162\1\154\1\145\1\151"+
		"\1\145\1\165\1\154\1\142\1\156\1\172\1\145\1\147\1\157\1\151\1\157\1\160"+
		"\1\163\1\162\1\165\1\145\1\147\1\156\1\163\1\157\1\141\1\145\1\154\1\164"+
		"\1\uffff\1\162\1\172\1\156\1\157\1\165\1\154\1\157\1\141\1\143\1\141\1"+
		"\145\1\147\1\163\1\156\1\164\1\141\1\145\1\104\1\141\1\uffff\2\144\1\162"+
		"\1\145\1\162\1\147\1\164\1\156\1\162\1\172\1\145\1\172\1\157\1\156\1\172"+
		"\1\162\1\164\1\151\1\172\1\143\1\172\1\163\1\145\1\163\2\172\1\uffff\1"+
		"\144\1\uffff\1\162\1\172\1\uffff\1\151\1\145\1\164\1\143\1\uffff\1\145"+
		"\1\uffff\1\172\1\163\1\172\2\uffff\1\55\1\163\1\uffff\1\166\1\172\1\151"+
		"\1\123\1\163\1\uffff\1\172\2\uffff\1\172\1\145\1\uffff\1\157\1\145\1\172"+
		"\2\uffff\3\156\1\uffff\1\123\1\172\1\163\1\145\1\uffff\1\157\1\156\1\162"+
		"\2\163\1\157\1\172\1\162\1\uffff\1\163\1\172\1\uffff";
	static final String DFA5_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\3\uffff\1\11\13\uffff\1\33\1\34\1\35\1\36"+
		"\53\uffff\1\20\23\uffff\1\22\32\uffff\1\10\1\uffff\1\13\2\uffff\1\16\4"+
		"\uffff\1\24\1\uffff\1\27\3\uffff\1\6\1\7\2\uffff\1\15\5\uffff\1\30\1\uffff"+
		"\1\32\1\12\2\uffff\1\21\3\uffff\1\31\1\14\3\uffff\1\26\4\uffff\1\23\10"+
		"\uffff\1\25\2\uffff\1\17";
	static final String DFA5_specialS =
		"\u00ae\uffff}>";
	static final String[] DFA5_transitionS = {
			"\2\30\1\uffff\2\30\22\uffff\1\30\7\uffff\1\1\1\2\2\uffff\1\3\3\uffff"+
			"\12\26\1\4\1\5\5\uffff\1\27\1\6\6\27\1\7\11\27\1\10\7\27\4\uffff\1\11"+
			"\1\uffff\1\12\1\13\1\25\1\14\1\15\1\16\1\17\4\25\1\20\2\25\1\21\1\22"+
			"\1\25\1\23\1\24\7\25",
			"",
			"",
			"",
			"",
			"",
			"\1\31",
			"\1\32",
			"\1\33",
			"",
			"\1\34",
			"\1\35",
			"\1\36",
			"\1\37",
			"\1\40",
			"\1\41",
			"\1\42",
			"\1\43",
			"\1\44",
			"\1\45",
			"\1\46\3\uffff\1\47\16\uffff\1\50",
			"",
			"",
			"",
			"",
			"\1\51",
			"\1\52",
			"\1\53",
			"\1\54\20\uffff\1\55",
			"\1\56",
			"\1\57",
			"\1\60",
			"\1\61",
			"\1\62",
			"\1\63",
			"\1\64",
			"\1\65",
			"\1\66",
			"\1\67",
			"\1\70",
			"\1\71\2\uffff\1\72",
			"\1\73",
			"\1\74",
			"\1\75",
			"\1\76",
			"\1\77\13\uffff\1\100",
			"\1\101",
			"\1\102",
			"\1\103",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\1\105",
			"\1\106",
			"\1\107",
			"\1\110",
			"\1\111",
			"\1\112",
			"\1\113",
			"\1\114",
			"\1\115",
			"\1\116",
			"\1\117",
			"\1\120",
			"\1\121",
			"\1\122",
			"\1\123",
			"\1\124",
			"\1\125",
			"\1\126",
			"",
			"\1\127",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\1\131",
			"\1\132",
			"\1\133",
			"\1\134",
			"\1\135",
			"\1\136",
			"\1\137",
			"\1\140",
			"\1\141",
			"\1\142",
			"\1\143",
			"\1\144",
			"\1\145",
			"\1\146",
			"\1\147",
			"\1\150",
			"\1\151",
			"",
			"\1\152",
			"\1\153",
			"\1\154",
			"\1\155",
			"\1\156",
			"\1\157",
			"\1\160",
			"\1\161",
			"\1\162",
			"\32\27\6\uffff\32\27",
			"\1\164",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\1\166",
			"\1\167",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\1\171",
			"\1\172",
			"\1\173",
			"\12\25\7\uffff\32\25\6\uffff\10\25\1\174\21\25",
			"\1\176",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\1\u0080",
			"\1\u0081",
			"\1\u0082",
			"\32\27\6\uffff\32\27",
			"\32\27\6\uffff\32\27",
			"",
			"\1\u0085",
			"",
			"\1\u0086",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"",
			"\1\u0088",
			"\1\u0089",
			"\1\u008a",
			"\1\u008b",
			"",
			"\1\u008c",
			"",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\1\u008e",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"",
			"",
			"\1\u0090",
			"\1\u0091",
			"",
			"\1\u0092",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\1\u0094",
			"\1\u0095",
			"\1\u0096",
			"",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"",
			"",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\1\u0099",
			"",
			"\1\u009a",
			"\1\u009b",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"",
			"",
			"\1\u009d",
			"\1\u009e",
			"\1\u009f",
			"",
			"\1\u00a0",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\1\u00a2",
			"\1\u00a3",
			"",
			"\1\u00a4",
			"\1\u00a5",
			"\1\u00a6",
			"\1\u00a7",
			"\1\u00a8",
			"\1\u00a9",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\1\u00ab",
			"",
			"\1\u00ac",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			""
	};

	static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
	static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
	static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
	static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
	static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
	static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
	static final short[][] DFA5_transition;

	static {
		int numStates = DFA5_transitionS.length;
		DFA5_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
		}
	}

	protected class DFA5 extends DFA {

		public DFA5(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 5;
			this.eot = DFA5_eot;
			this.eof = DFA5_eof;
			this.min = DFA5_min;
			this.max = DFA5_max;
			this.accept = DFA5_accept;
			this.special = DFA5_special;
			this.transition = DFA5_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | ID | INT | CAPITALIZED_ID | WS );";
		}
	}

}
