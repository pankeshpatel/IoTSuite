// $ANTLR 3.5.1 C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g 2015-11-12 23:56:18

  package iotsuite.parser; 


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class NetworkSpecLexer extends Lexer {
	public static final int EOF=-1;
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
	public static final int CAPITALIZED_ID=4;
	public static final int DESCRIPTION_ID=5;
	public static final int ID=6;
	public static final int MOBILEFLAG=7;
	public static final int WS=8;

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
	@Override public String getGrammarFileName() { return "C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g"; }

	// $ANTLR start "T__9"
	public final void mT__9() throws RecognitionException {
		try {
			int _type = T__9;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:11:6: ( ',' )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:11:8: ','
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
	// $ANTLR end "T__9"

	// $ANTLR start "T__10"
	public final void mT__10() throws RecognitionException {
		try {
			int _type = T__10;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:12:7: ( ':' )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:12:9: ':'
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
	// $ANTLR end "T__10"

	// $ANTLR start "T__11"
	public final void mT__11() throws RecognitionException {
		try {
			int _type = T__11;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:13:7: ( ';' )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:13:9: ';'
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
	// $ANTLR end "T__11"

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:14:7: ( 'database' )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:14:9: 'database'
			{
			match("database"); 

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
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:15:7: ( 'description' )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:15:9: 'description'
			{
			match("description"); 

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
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:16:7: ( 'devices' )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:16:9: 'devices'
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
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:17:7: ( 'location' )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:17:9: 'location'
			{
			match("location"); 

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
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:18:7: ( 'platform' )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:18:9: 'platform'
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
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:19:7: ( 'protocol' )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:19:9: 'protocol'
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
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:20:7: ( 'resources' )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:20:9: 'resources'
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
	// $ANTLR end "T__18"

	// $ANTLR start "MOBILEFLAG"
	public final void mMOBILEFLAG() throws RecognitionException {
		try {
			int _type = MOBILEFLAG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:78:12: ( 'true' | 'false' )
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
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:78:15: 'true'
					{
					match("true"); 

					}
					break;
				case 2 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:78:24: 'false'
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
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:83:5: ( ( 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' )* ( '0' .. '9' )* ) | '0' .. '9' ( '0' .. '9' )* | '*' )
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
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:83:7: ( 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' )* ( '0' .. '9' )* )
					{
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:83:7: ( 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' )* ( '0' .. '9' )* )
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:83:8: 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' )* ( '0' .. '9' )*
					{
					matchRange('a','z'); 
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:83:18: ( 'a' .. 'z' | 'A' .. 'Z' )*
					loop2:
					while (true) {
						int alt2=2;
						int LA2_0 = input.LA(1);
						if ( ((LA2_0 >= 'A' && LA2_0 <= 'Z')||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
							alt2=1;
						}

						switch (alt2) {
						case 1 :
							// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:
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

					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:83:42: ( '0' .. '9' )*
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:
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
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:83:56: '0' .. '9' ( '0' .. '9' )*
					{
					matchRange('0','9'); 
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:83:64: ( '0' .. '9' )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:
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
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:83:76: '*'
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

	// $ANTLR start "DESCRIPTION_ID"
	public final void mDESCRIPTION_ID() throws RecognitionException {
		try {
			int _type = DESCRIPTION_ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:85:15: ( ( 'a' .. 'z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | ' ' )* )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:85:19: ( 'a' .. 'z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | ' ' )*
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:85:38: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | ' ' )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==' '||(LA6_0 >= '0' && LA6_0 <= '9')||(LA6_0 >= 'A' && LA6_0 <= 'Z')||(LA6_0 >= 'a' && LA6_0 <= 'z')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:
					{
					if ( input.LA(1)==' '||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DESCRIPTION_ID"

	// $ANTLR start "CAPITALIZED_ID"
	public final void mCAPITALIZED_ID() throws RecognitionException {
		try {
			int _type = CAPITALIZED_ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:87:15: ( 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' )* ( '0' .. '9' )* )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:87:17: 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' )* ( '0' .. '9' )*
			{
			matchRange('A','Z'); 
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:87:26: ( 'a' .. 'z' | 'A' .. 'Z' )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= 'A' && LA7_0 <= 'Z')||(LA7_0 >= 'a' && LA7_0 <= 'z')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:
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
					break loop7;
				}
			}

			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:87:50: ( '0' .. '9' )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:
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
					break loop8;
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
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:90:3: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+ )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:90:5: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
			{
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:90:5: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
			int cnt9=0;
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( ((LA9_0 >= '\t' && LA9_0 <= '\n')||(LA9_0 >= '\f' && LA9_0 <= '\r')||LA9_0==' ') ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:
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
					if ( cnt9 >= 1 ) break loop9;
					EarlyExitException eee = new EarlyExitException(9, input);
					throw eee;
				}
				cnt9++;
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
		// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | MOBILEFLAG | ID | DESCRIPTION_ID | CAPITALIZED_ID | WS )
		int alt10=15;
		alt10 = dfa10.predict(input);
		switch (alt10) {
			case 1 :
				// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:1:10: T__9
				{
				mT__9(); 

				}
				break;
			case 2 :
				// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:1:15: T__10
				{
				mT__10(); 

				}
				break;
			case 3 :
				// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:1:21: T__11
				{
				mT__11(); 

				}
				break;
			case 4 :
				// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:1:27: T__12
				{
				mT__12(); 

				}
				break;
			case 5 :
				// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:1:33: T__13
				{
				mT__13(); 

				}
				break;
			case 6 :
				// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:1:39: T__14
				{
				mT__14(); 

				}
				break;
			case 7 :
				// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:1:45: T__15
				{
				mT__15(); 

				}
				break;
			case 8 :
				// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:1:51: T__16
				{
				mT__16(); 

				}
				break;
			case 9 :
				// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:1:57: T__17
				{
				mT__17(); 

				}
				break;
			case 10 :
				// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:1:63: T__18
				{
				mT__18(); 

				}
				break;
			case 11 :
				// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:1:69: MOBILEFLAG
				{
				mMOBILEFLAG(); 

				}
				break;
			case 12 :
				// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:1:80: ID
				{
				mID(); 

				}
				break;
			case 13 :
				// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:1:83: DESCRIPTION_ID
				{
				mDESCRIPTION_ID(); 

				}
				break;
			case 14 :
				// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:1:98: CAPITALIZED_ID
				{
				mCAPITALIZED_ID(); 

				}
				break;
			case 15 :
				// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:1:113: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA10 dfa10 = new DFA10(this);
	static final String DFA10_eotS =
		"\4\uffff\10\14\3\uffff\4\14\1\uffff\27\14\1\64\10\14\1\uffff\1\64\11\14"+
		"\1\106\4\14\1\113\1\14\1\uffff\1\115\1\116\1\117\1\14\1\uffff\1\14\3\uffff"+
		"\1\122\1\14\1\uffff\1\124\1\uffff";
	static final String DFA10_eofS =
		"\125\uffff";
	static final String DFA10_minS =
		"\1\11\3\uffff\10\40\3\uffff\4\40\1\uffff\40\40\1\uffff\21\40\1\uffff\4"+
		"\40\1\uffff\1\40\3\uffff\2\40\1\uffff\1\40\1\uffff";
	static final String DFA10_maxS =
		"\1\172\3\uffff\10\172\3\uffff\4\172\1\uffff\40\172\1\uffff\21\172\1\uffff"+
		"\4\172\1\uffff\1\172\3\uffff\2\172\1\uffff\1\172\1\uffff";
	static final String DFA10_acceptS =
		"\1\uffff\1\1\1\2\1\3\10\uffff\1\14\1\16\1\17\4\uffff\1\15\40\uffff\1\13"+
		"\21\uffff\1\6\4\uffff\1\4\1\uffff\1\7\1\10\1\11\2\uffff\1\12\1\uffff\1"+
		"\5";
	static final String DFA10_specialS =
		"\125\uffff}>";
	static final String[] DFA10_transitionS = {
			"\2\16\1\uffff\2\16\22\uffff\1\16\11\uffff\1\14\1\uffff\1\1\3\uffff\12"+
			"\13\1\2\1\3\5\uffff\32\15\6\uffff\3\12\1\4\1\12\1\11\5\12\1\5\3\12\1"+
			"\6\1\12\1\7\1\12\1\10\6\12",
			"",
			"",
			"",
			"\1\23\17\uffff\12\22\7\uffff\32\21\6\uffff\1\17\3\21\1\20\25\21",
			"\1\23\17\uffff\12\22\7\uffff\32\21\6\uffff\16\21\1\24\13\21",
			"\1\23\17\uffff\12\22\7\uffff\32\21\6\uffff\13\21\1\25\5\21\1\26\10\21",
			"\1\23\17\uffff\12\22\7\uffff\32\21\6\uffff\4\21\1\27\25\21",
			"\1\23\17\uffff\12\22\7\uffff\32\21\6\uffff\21\21\1\30\10\21",
			"\1\23\17\uffff\12\22\7\uffff\32\21\6\uffff\1\31\31\21",
			"\1\23\17\uffff\12\22\7\uffff\32\21\6\uffff\32\21",
			"\1\23\17\uffff\12\32\7\uffff\32\23\6\uffff\32\23",
			"",
			"",
			"",
			"\1\23\17\uffff\12\22\7\uffff\32\21\6\uffff\23\21\1\33\6\21",
			"\1\23\17\uffff\12\22\7\uffff\32\21\6\uffff\22\21\1\34\2\21\1\35\4\21",
			"\1\23\17\uffff\12\22\7\uffff\32\21\6\uffff\32\21",
			"\1\23\17\uffff\12\22\7\uffff\32\23\6\uffff\32\23",
			"",
			"\1\23\17\uffff\12\22\7\uffff\32\21\6\uffff\2\21\1\36\27\21",
			"\1\23\17\uffff\12\22\7\uffff\32\21\6\uffff\1\37\31\21",
			"\1\23\17\uffff\12\22\7\uffff\32\21\6\uffff\16\21\1\40\13\21",
			"\1\23\17\uffff\12\22\7\uffff\32\21\6\uffff\22\21\1\41\7\21",
			"\1\23\17\uffff\12\22\7\uffff\32\21\6\uffff\24\21\1\42\5\21",
			"\1\23\17\uffff\12\22\7\uffff\32\21\6\uffff\13\21\1\43\16\21",
			"\1\23\17\uffff\12\32\7\uffff\32\23\6\uffff\32\23",
			"\1\23\17\uffff\12\22\7\uffff\32\21\6\uffff\1\44\31\21",
			"\1\23\17\uffff\12\22\7\uffff\32\21\6\uffff\2\21\1\45\27\21",
			"\1\23\17\uffff\12\22\7\uffff\32\21\6\uffff\10\21\1\46\21\21",
			"\1\23\17\uffff\12\22\7\uffff\32\21\6\uffff\1\47\31\21",
			"\1\23\17\uffff\12\22\7\uffff\32\21\6\uffff\23\21\1\50\6\21",
			"\1\23\17\uffff\12\22\7\uffff\32\21\6\uffff\23\21\1\51\6\21",
			"\1\23\17\uffff\12\22\7\uffff\32\21\6\uffff\16\21\1\52\13\21",
			"\1\23\17\uffff\12\22\7\uffff\32\21\6\uffff\4\21\1\53\25\21",
			"\1\23\17\uffff\12\22\7\uffff\32\21\6\uffff\22\21\1\54\7\21",
			"\1\23\17\uffff\12\22\7\uffff\32\21\6\uffff\1\21\1\55\30\21",
			"\1\23\17\uffff\12\22\7\uffff\32\21\6\uffff\21\21\1\56\10\21",
			"\1\23\17\uffff\12\22\7\uffff\32\21\6\uffff\2\21\1\57\27\21",
			"\1\23\17\uffff\12\22\7\uffff\32\21\6\uffff\23\21\1\60\6\21",
			"\1\23\17\uffff\12\22\7\uffff\32\21\6\uffff\5\21\1\61\24\21",
			"\1\23\17\uffff\12\22\7\uffff\32\21\6\uffff\16\21\1\62\13\21",
			"\1\23\17\uffff\12\22\7\uffff\32\21\6\uffff\24\21\1\63\5\21",
			"\1\23\17\uffff\12\22\7\uffff\32\21\6\uffff\32\21",
			"\1\23\17\uffff\12\22\7\uffff\32\21\6\uffff\4\21\1\65\25\21",
			"\1\23\17\uffff\12\22\7\uffff\32\21\6\uffff\1\66\31\21",
			"\1\23\17\uffff\12\22\7\uffff\32\21\6\uffff\10\21\1\67\21\21",
			"\1\23\17\uffff\12\22\7\uffff\32\21\6\uffff\4\21\1\70\25\21",
			"\1\23\17\uffff\12\22\7\uffff\32\21\6\uffff\10\21\1\71\21\21",
			"\1\23\17\uffff\12\22\7\uffff\32\21\6\uffff\16\21\1\72\13\21",
			"\1\23\17\uffff\12\22\7\uffff\32\21\6\uffff\2\21\1\73\27\21",
			"\1\23\17\uffff\12\22\7\uffff\32\21\6\uffff\21\21\1\74\10\21",
			"",
			"\1\23\17\uffff\12\22\7\uffff\32\21\6\uffff\32\21",
			"\1\23\17\uffff\12\22\7\uffff\32\21\6\uffff\22\21\1\75\7\21",
			"\1\23\17\uffff\12\22\7\uffff\32\21\6\uffff\17\21\1\76\12\21",
			"\1\23\17\uffff\12\22\7\uffff\32\21\6\uffff\22\21\1\77\7\21",
			"\1\23\17\uffff\12\22\7\uffff\32\21\6\uffff\16\21\1\100\13\21",
			"\1\23\17\uffff\12\22\7\uffff\32\21\6\uffff\21\21\1\101\10\21",
			"\1\23\17\uffff\12\22\7\uffff\32\21\6\uffff\16\21\1\102\13\21",
			"\1\23\17\uffff\12\22\7\uffff\32\21\6\uffff\2\21\1\103\27\21",
			"\1\23\17\uffff\12\22\7\uffff\32\21\6\uffff\4\21\1\104\25\21",
			"\1\23\17\uffff\12\22\7\uffff\32\21\6\uffff\23\21\1\105\6\21",
			"\1\23\17\uffff\12\22\7\uffff\32\21\6\uffff\32\21",
			"\1\23\17\uffff\12\22\7\uffff\32\21\6\uffff\15\21\1\107\14\21",
			"\1\23\17\uffff\12\22\7\uffff\32\21\6\uffff\14\21\1\110\15\21",
			"\1\23\17\uffff\12\22\7\uffff\32\21\6\uffff\13\21\1\111\16\21",
			"\1\23\17\uffff\12\22\7\uffff\32\21\6\uffff\4\21\1\112\25\21",
			"\1\23\17\uffff\12\22\7\uffff\32\21\6\uffff\32\21",
			"\1\23\17\uffff\12\22\7\uffff\32\21\6\uffff\10\21\1\114\21\21",
			"",
			"\1\23\17\uffff\12\22\7\uffff\32\21\6\uffff\32\21",
			"\1\23\17\uffff\12\22\7\uffff\32\21\6\uffff\32\21",
			"\1\23\17\uffff\12\22\7\uffff\32\21\6\uffff\32\21",
			"\1\23\17\uffff\12\22\7\uffff\32\21\6\uffff\22\21\1\120\7\21",
			"",
			"\1\23\17\uffff\12\22\7\uffff\32\21\6\uffff\16\21\1\121\13\21",
			"",
			"",
			"",
			"\1\23\17\uffff\12\22\7\uffff\32\21\6\uffff\32\21",
			"\1\23\17\uffff\12\22\7\uffff\32\21\6\uffff\15\21\1\123\14\21",
			"",
			"\1\23\17\uffff\12\22\7\uffff\32\21\6\uffff\32\21",
			""
	};

	static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
	static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
	static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
	static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
	static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
	static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
	static final short[][] DFA10_transition;

	static {
		int numStates = DFA10_transitionS.length;
		DFA10_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
		}
	}

	protected class DFA10 extends DFA {

		public DFA10(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 10;
			this.eot = DFA10_eot;
			this.eof = DFA10_eof;
			this.min = DFA10_min;
			this.max = DFA10_max;
			this.accept = DFA10_accept;
			this.special = DFA10_special;
			this.transition = DFA10_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | MOBILEFLAG | ID | DESCRIPTION_ID | CAPITALIZED_ID | WS );";
		}
	}

}
