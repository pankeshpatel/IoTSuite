// $ANTLR 3.5.1 C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\NetworkSpec.g 2015-10-27 11:55:57

  package iotsuite.parser; 


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class NetworkSpecLexer extends Lexer {
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
	public static final int CAPITALIZED_ID=4;
	public static final int ID=5;
	public static final int MOBILEFLAG=6;
	public static final int WS=7;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public NetworkSpecLexer() {} 
	public NetworkSpecLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public NetworkSpecLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\NetworkSpec.g"; }

	// $ANTLR start "T__8"
	public final void mT__8() throws RecognitionException {
		try {
			int _type = T__8;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\NetworkSpec.g:11:6: ( ',' )
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\NetworkSpec.g:11:8: ','
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
	// $ANTLR end "T__8"

	// $ANTLR start "T__9"
	public final void mT__9() throws RecognitionException {
		try {
			int _type = T__9;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\NetworkSpec.g:12:6: ( ':' )
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\NetworkSpec.g:12:8: ':'
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
	// $ANTLR end "T__9"

	// $ANTLR start "T__10"
	public final void mT__10() throws RecognitionException {
		try {
			int _type = T__10;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\NetworkSpec.g:13:7: ( ';' )
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\NetworkSpec.g:13:9: ';'
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
	// $ANTLR end "T__10"

	// $ANTLR start "T__11"
	public final void mT__11() throws RecognitionException {
		try {
			int _type = T__11;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\NetworkSpec.g:14:7: ( 'devices' )
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\NetworkSpec.g:14:9: 'devices'
			{
			match("devices"); 

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
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\NetworkSpec.g:15:7: ( 'mobile' )
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\NetworkSpec.g:15:9: 'mobile'
			{
			match("mobile"); 

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
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\NetworkSpec.g:16:7: ( 'platform' )
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\NetworkSpec.g:16:9: 'platform'
			{
			match("platform"); 

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
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\NetworkSpec.g:17:7: ( 'protocol' )
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\NetworkSpec.g:17:9: 'protocol'
			{
			match("protocol"); 

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
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\NetworkSpec.g:18:7: ( 'region' )
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\NetworkSpec.g:18:9: 'region'
			{
			match("region"); 

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
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\NetworkSpec.g:19:7: ( 'resources' )
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\NetworkSpec.g:19:9: 'resources'
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
	// $ANTLR end "T__16"

	// $ANTLR start "MOBILEFLAG"
	public final void mMOBILEFLAG() throws RecognitionException {
		try {
			int _type = MOBILEFLAG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\NetworkSpec.g:91:12: ( 'true' | 'false' )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='t') ) {
				alt1=1;
			}
			else if ( (LA1_0=='f') ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\NetworkSpec.g:91:15: 'true'
					{
					match("true"); 

					}
					break;
				case 2 :
					// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\NetworkSpec.g:91:24: 'false'
					{
					match("false"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOBILEFLAG"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\NetworkSpec.g:96:5: ( ( 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' )* ( '0' .. '9' )* ) | '0' .. '9' ( '0' .. '9' )* | '*' )
			int alt5=3;
			switch ( input.LA(1) ) {
			case 'a':
			case 'b':
			case 'c':
			case 'd':
			case 'e':
			case 'f':
			case 'g':
			case 'h':
			case 'i':
			case 'j':
			case 'k':
			case 'l':
			case 'm':
			case 'n':
			case 'o':
			case 'p':
			case 'q':
			case 'r':
			case 's':
			case 't':
			case 'u':
			case 'v':
			case 'w':
			case 'x':
			case 'y':
			case 'z':
				{
				alt5=1;
				}
				break;
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				{
				alt5=2;
				}
				break;
			case '*':
				{
				alt5=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\NetworkSpec.g:96:7: ( 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' )* ( '0' .. '9' )* )
					{
					// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\NetworkSpec.g:96:7: ( 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' )* ( '0' .. '9' )* )
					// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\NetworkSpec.g:96:8: 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' )* ( '0' .. '9' )*
					{
					matchRange('a','z'); 
					// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\NetworkSpec.g:96:18: ( 'a' .. 'z' | 'A' .. 'Z' )*
					loop2:
					while (true) {
						int alt2=2;
						int LA2_0 = input.LA(1);
						if ( ((LA2_0 >= 'A' && LA2_0 <= 'Z')||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
							alt2=1;
						}

						switch (alt2) {
						case 1 :
							// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\NetworkSpec.g:
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
							break loop2;
						}
					}

					// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\NetworkSpec.g:96:42: ( '0' .. '9' )*
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\NetworkSpec.g:
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
							break loop3;
						}
					}

					}

					}
					break;
				case 2 :
					// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\NetworkSpec.g:96:56: '0' .. '9' ( '0' .. '9' )*
					{
					matchRange('0','9'); 
					// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\NetworkSpec.g:96:64: ( '0' .. '9' )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\NetworkSpec.g:
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
							break loop4;
						}
					}

					}
					break;
				case 3 :
					// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\NetworkSpec.g:96:76: '*'
					{
					match('*'); 
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "CAPITALIZED_ID"
	public final void mCAPITALIZED_ID() throws RecognitionException {
		try {
			int _type = CAPITALIZED_ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\NetworkSpec.g:104:15: ( 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' )* ( '0' .. '9' )* )
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\NetworkSpec.g:104:17: 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' )* ( '0' .. '9' )*
			{
			matchRange('A','Z'); 
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\NetworkSpec.g:104:26: ( 'a' .. 'z' | 'A' .. 'Z' )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= 'A' && LA6_0 <= 'Z')||(LA6_0 >= 'a' && LA6_0 <= 'z')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\NetworkSpec.g:
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
					break loop6;
				}
			}

			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\NetworkSpec.g:104:50: ( '0' .. '9' )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\NetworkSpec.g:
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
					break loop7;
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
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\NetworkSpec.g:106:3: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+ )
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\NetworkSpec.g:106:5: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
			{
			// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\NetworkSpec.g:106:5: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
			int cnt8=0;
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( ((LA8_0 >= '\t' && LA8_0 <= '\n')||(LA8_0 >= '\f' && LA8_0 <= '\r')||LA8_0==' ') ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\NetworkSpec.g:
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
					if ( cnt8 >= 1 ) break loop8;
					EarlyExitException eee = new EarlyExitException(8, input);
					throw eee;
				}
				cnt8++;
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
		// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\NetworkSpec.g:1:8: ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | MOBILEFLAG | ID | CAPITALIZED_ID | WS )
		int alt9=13;
		alt9 = dfa9.predict(input);
		switch (alt9) {
			case 1 :
				// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\NetworkSpec.g:1:10: T__8
				{
				mT__8(); 

				}
				break;
			case 2 :
				// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\NetworkSpec.g:1:15: T__9
				{
				mT__9(); 

				}
				break;
			case 3 :
				// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\NetworkSpec.g:1:20: T__10
				{
				mT__10(); 

				}
				break;
			case 4 :
				// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\NetworkSpec.g:1:26: T__11
				{
				mT__11(); 

				}
				break;
			case 5 :
				// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\NetworkSpec.g:1:32: T__12
				{
				mT__12(); 

				}
				break;
			case 6 :
				// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\NetworkSpec.g:1:38: T__13
				{
				mT__13(); 

				}
				break;
			case 7 :
				// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\NetworkSpec.g:1:44: T__14
				{
				mT__14(); 

				}
				break;
			case 8 :
				// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\NetworkSpec.g:1:50: T__15
				{
				mT__15(); 

				}
				break;
			case 9 :
				// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\NetworkSpec.g:1:56: T__16
				{
				mT__16(); 

				}
				break;
			case 10 :
				// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\NetworkSpec.g:1:62: MOBILEFLAG
				{
				mMOBILEFLAG(); 

				}
				break;
			case 11 :
				// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\NetworkSpec.g:1:73: ID
				{
				mID(); 

				}
				break;
			case 12 :
				// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\NetworkSpec.g:1:76: CAPITALIZED_ID
				{
				mCAPITALIZED_ID(); 

				}
				break;
			case 13 :
				// C:\\IoTSuite\\IoTSuite\\ToolSuite\\bin\\iotsuite\\parser\\NetworkSpec.g:1:91: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA9 dfa9 = new DFA9(this);
	static final String DFA9_eotS =
		"\4\uffff\6\12\3\uffff\25\12\1\52\7\12\1\uffff\1\52\1\12\1\63\2\12\1\66"+
		"\1\12\1\70\1\uffff\2\12\1\uffff\1\12\1\uffff\1\74\1\75\1\12\2\uffff\1"+
		"\77\1\uffff";
	static final String DFA9_eofS =
		"\100\uffff";
	static final String DFA9_minS =
		"\1\11\3\uffff\1\145\1\157\1\154\1\145\1\162\1\141\3\uffff\1\166\1\142"+
		"\1\141\1\157\1\147\1\165\1\154\2\151\2\164\1\151\1\157\1\145\1\163\1\143"+
		"\1\154\1\146\2\157\1\165\1\60\3\145\1\157\1\143\1\156\1\162\1\uffff\1"+
		"\60\1\163\1\60\1\162\1\157\1\60\1\143\1\60\1\uffff\1\155\1\154\1\uffff"+
		"\1\145\1\uffff\2\60\1\163\2\uffff\1\60\1\uffff";
	static final String DFA9_maxS =
		"\1\172\3\uffff\1\145\1\157\1\162\1\145\1\162\1\141\3\uffff\1\166\1\142"+
		"\1\141\1\157\1\163\1\165\1\154\2\151\2\164\1\151\1\157\1\145\1\163\1\143"+
		"\1\154\1\146\2\157\1\165\1\172\3\145\1\157\1\143\1\156\1\162\1\uffff\1"+
		"\172\1\163\1\172\1\162\1\157\1\172\1\143\1\172\1\uffff\1\155\1\154\1\uffff"+
		"\1\145\1\uffff\2\172\1\163\2\uffff\1\172\1\uffff";
	static final String DFA9_acceptS =
		"\1\uffff\1\1\1\2\1\3\6\uffff\1\13\1\14\1\15\35\uffff\1\12\10\uffff\1\5"+
		"\2\uffff\1\10\1\uffff\1\4\3\uffff\1\6\1\7\1\uffff\1\11";
	static final String DFA9_specialS =
		"\100\uffff}>";
	static final String[] DFA9_transitionS = {
			"\2\14\1\uffff\2\14\22\uffff\1\14\11\uffff\1\12\1\uffff\1\1\3\uffff\12"+
			"\12\1\2\1\3\5\uffff\32\13\6\uffff\3\12\1\4\1\12\1\11\6\12\1\5\2\12\1"+
			"\6\1\12\1\7\1\12\1\10\6\12",
			"",
			"",
			"",
			"\1\15",
			"\1\16",
			"\1\17\5\uffff\1\20",
			"\1\21",
			"\1\22",
			"\1\23",
			"",
			"",
			"",
			"\1\24",
			"\1\25",
			"\1\26",
			"\1\27",
			"\1\30\13\uffff\1\31",
			"\1\32",
			"\1\33",
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
			"\1\46",
			"\1\47",
			"\1\50",
			"\1\51",
			"\12\12\7\uffff\32\12\6\uffff\32\12",
			"\1\53",
			"\1\54",
			"\1\55",
			"\1\56",
			"\1\57",
			"\1\60",
			"\1\61",
			"",
			"\12\12\7\uffff\32\12\6\uffff\32\12",
			"\1\62",
			"\12\12\7\uffff\32\12\6\uffff\32\12",
			"\1\64",
			"\1\65",
			"\12\12\7\uffff\32\12\6\uffff\32\12",
			"\1\67",
			"\12\12\7\uffff\32\12\6\uffff\32\12",
			"",
			"\1\71",
			"\1\72",
			"",
			"\1\73",
			"",
			"\12\12\7\uffff\32\12\6\uffff\32\12",
			"\12\12\7\uffff\32\12\6\uffff\32\12",
			"\1\76",
			"",
			"",
			"\12\12\7\uffff\32\12\6\uffff\32\12",
			""
	};

	static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
	static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
	static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
	static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
	static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
	static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
	static final short[][] DFA9_transition;

	static {
		int numStates = DFA9_transitionS.length;
		DFA9_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
		}
	}

	protected class DFA9 extends DFA {

		public DFA9(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 9;
			this.eot = DFA9_eot;
			this.eof = DFA9_eof;
			this.min = DFA9_min;
			this.max = DFA9_max;
			this.accept = DFA9_accept;
			this.special = DFA9_special;
			this.transition = DFA9_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | MOBILEFLAG | ID | CAPITALIZED_ID | WS );";
		}
	}

}
