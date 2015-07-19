// $ANTLR 3.5.1 S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g 2015-07-19 22:20:23

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
	@Override public String getGrammarFileName() { return "S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g"; }

	// $ANTLR start "T__8"
	public final void mT__8() throws RecognitionException {
		try {
			int _type = T__8;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:11:6: ( ',' )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:11:8: ','
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
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:12:6: ( ':' )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:12:8: ':'
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
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:13:7: ( ';' )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:13:9: ';'
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
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:14:7: ( 'devices' )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:14:9: 'devices'
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
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:15:7: ( 'mobile' )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:15:9: 'mobile'
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
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:16:7: ( 'region' )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:16:9: 'region'
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
	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:17:7: ( 'resources' )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:17:9: 'resources'
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
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:18:7: ( 'type' )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:18:9: 'type'
			{
			match("type"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__15"

	// $ANTLR start "MOBILEFLAG"
	public final void mMOBILEFLAG() throws RecognitionException {
		try {
			int _type = MOBILEFLAG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:85:12: ( 'true' | 'false' )
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
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:85:15: 'true'
					{
					match("true"); 

					}
					break;
				case 2 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:85:24: 'false'
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
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:90:5: ( ( 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' )* ( '0' .. '9' )* ) | '0' .. '9' ( '0' .. '9' )* | '*' )
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
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:90:7: ( 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' )* ( '0' .. '9' )* )
					{
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:90:7: ( 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' )* ( '0' .. '9' )* )
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:90:8: 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' )* ( '0' .. '9' )*
					{
					matchRange('a','z'); 
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:90:18: ( 'a' .. 'z' | 'A' .. 'Z' )*
					loop2:
					while (true) {
						int alt2=2;
						int LA2_0 = input.LA(1);
						if ( ((LA2_0 >= 'A' && LA2_0 <= 'Z')||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
							alt2=1;
						}

						switch (alt2) {
						case 1 :
							// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:
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

					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:90:42: ( '0' .. '9' )*
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:
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
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:90:56: '0' .. '9' ( '0' .. '9' )*
					{
					matchRange('0','9'); 
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:90:64: ( '0' .. '9' )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:
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
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:90:76: '*'
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
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:98:15: ( 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' )* ( '0' .. '9' )* )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:98:17: 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' )* ( '0' .. '9' )*
			{
			matchRange('A','Z'); 
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:98:26: ( 'a' .. 'z' | 'A' .. 'Z' )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= 'A' && LA6_0 <= 'Z')||(LA6_0 >= 'a' && LA6_0 <= 'z')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:
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

			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:98:50: ( '0' .. '9' )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:
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
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:100:3: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+ )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:100:5: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
			{
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:100:5: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
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
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:
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
		// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:1:8: ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | MOBILEFLAG | ID | CAPITALIZED_ID | WS )
		int alt9=12;
		switch ( input.LA(1) ) {
		case ',':
			{
			alt9=1;
			}
			break;
		case ':':
			{
			alt9=2;
			}
			break;
		case ';':
			{
			alt9=3;
			}
			break;
		case 'd':
			{
			int LA9_4 = input.LA(2);
			if ( (LA9_4=='e') ) {
				int LA9_12 = input.LA(3);
				if ( (LA9_12=='v') ) {
					int LA9_18 = input.LA(4);
					if ( (LA9_18=='i') ) {
						int LA9_25 = input.LA(5);
						if ( (LA9_25=='c') ) {
							int LA9_32 = input.LA(6);
							if ( (LA9_32=='e') ) {
								int LA9_39 = input.LA(7);
								if ( (LA9_39=='s') ) {
									int LA9_43 = input.LA(8);
									if ( ((LA9_43 >= '0' && LA9_43 <= '9')||(LA9_43 >= 'A' && LA9_43 <= 'Z')||(LA9_43 >= 'a' && LA9_43 <= 'z')) ) {
										alt9=10;
									}

									else {
										alt9=4;
									}

								}

								else {
									alt9=10;
								}

							}

							else {
								alt9=10;
							}

						}

						else {
							alt9=10;
						}

					}

					else {
						alt9=10;
					}

				}

				else {
					alt9=10;
				}

			}

			else {
				alt9=10;
			}

			}
			break;
		case 'm':
			{
			int LA9_5 = input.LA(2);
			if ( (LA9_5=='o') ) {
				int LA9_13 = input.LA(3);
				if ( (LA9_13=='b') ) {
					int LA9_19 = input.LA(4);
					if ( (LA9_19=='i') ) {
						int LA9_26 = input.LA(5);
						if ( (LA9_26=='l') ) {
							int LA9_33 = input.LA(6);
							if ( (LA9_33=='e') ) {
								int LA9_40 = input.LA(7);
								if ( ((LA9_40 >= '0' && LA9_40 <= '9')||(LA9_40 >= 'A' && LA9_40 <= 'Z')||(LA9_40 >= 'a' && LA9_40 <= 'z')) ) {
									alt9=10;
								}

								else {
									alt9=5;
								}

							}

							else {
								alt9=10;
							}

						}

						else {
							alt9=10;
						}

					}

					else {
						alt9=10;
					}

				}

				else {
					alt9=10;
				}

			}

			else {
				alt9=10;
			}

			}
			break;
		case 'r':
			{
			int LA9_6 = input.LA(2);
			if ( (LA9_6=='e') ) {
				switch ( input.LA(3) ) {
				case 'g':
					{
					int LA9_20 = input.LA(4);
					if ( (LA9_20=='i') ) {
						int LA9_27 = input.LA(5);
						if ( (LA9_27=='o') ) {
							int LA9_34 = input.LA(6);
							if ( (LA9_34=='n') ) {
								int LA9_41 = input.LA(7);
								if ( ((LA9_41 >= '0' && LA9_41 <= '9')||(LA9_41 >= 'A' && LA9_41 <= 'Z')||(LA9_41 >= 'a' && LA9_41 <= 'z')) ) {
									alt9=10;
								}

								else {
									alt9=6;
								}

							}

							else {
								alt9=10;
							}

						}

						else {
							alt9=10;
						}

					}

					else {
						alt9=10;
					}

					}
					break;
				case 's':
					{
					int LA9_21 = input.LA(4);
					if ( (LA9_21=='o') ) {
						int LA9_28 = input.LA(5);
						if ( (LA9_28=='u') ) {
							int LA9_35 = input.LA(6);
							if ( (LA9_35=='r') ) {
								int LA9_42 = input.LA(7);
								if ( (LA9_42=='c') ) {
									int LA9_46 = input.LA(8);
									if ( (LA9_46=='e') ) {
										int LA9_48 = input.LA(9);
										if ( (LA9_48=='s') ) {
											int LA9_49 = input.LA(10);
											if ( ((LA9_49 >= '0' && LA9_49 <= '9')||(LA9_49 >= 'A' && LA9_49 <= 'Z')||(LA9_49 >= 'a' && LA9_49 <= 'z')) ) {
												alt9=10;
											}

											else {
												alt9=7;
											}

										}

										else {
											alt9=10;
										}

									}

									else {
										alt9=10;
									}

								}

								else {
									alt9=10;
								}

							}

							else {
								alt9=10;
							}

						}

						else {
							alt9=10;
						}

					}

					else {
						alt9=10;
					}

					}
					break;
				default:
					alt9=10;
				}
			}

			else {
				alt9=10;
			}

			}
			break;
		case 't':
			{
			switch ( input.LA(2) ) {
			case 'y':
				{
				int LA9_15 = input.LA(3);
				if ( (LA9_15=='p') ) {
					int LA9_22 = input.LA(4);
					if ( (LA9_22=='e') ) {
						int LA9_29 = input.LA(5);
						if ( ((LA9_29 >= '0' && LA9_29 <= '9')||(LA9_29 >= 'A' && LA9_29 <= 'Z')||(LA9_29 >= 'a' && LA9_29 <= 'z')) ) {
							alt9=10;
						}

						else {
							alt9=8;
						}

					}

					else {
						alt9=10;
					}

				}

				else {
					alt9=10;
				}

				}
				break;
			case 'r':
				{
				int LA9_16 = input.LA(3);
				if ( (LA9_16=='u') ) {
					int LA9_23 = input.LA(4);
					if ( (LA9_23=='e') ) {
						int LA9_30 = input.LA(5);
						if ( ((LA9_30 >= '0' && LA9_30 <= '9')||(LA9_30 >= 'A' && LA9_30 <= 'Z')||(LA9_30 >= 'a' && LA9_30 <= 'z')) ) {
							alt9=10;
						}

						else {
							alt9=9;
						}

					}

					else {
						alt9=10;
					}

				}

				else {
					alt9=10;
				}

				}
				break;
			default:
				alt9=10;
			}
			}
			break;
		case 'f':
			{
			int LA9_8 = input.LA(2);
			if ( (LA9_8=='a') ) {
				int LA9_17 = input.LA(3);
				if ( (LA9_17=='l') ) {
					int LA9_24 = input.LA(4);
					if ( (LA9_24=='s') ) {
						int LA9_31 = input.LA(5);
						if ( (LA9_31=='e') ) {
							int LA9_38 = input.LA(6);
							if ( ((LA9_38 >= '0' && LA9_38 <= '9')||(LA9_38 >= 'A' && LA9_38 <= 'Z')||(LA9_38 >= 'a' && LA9_38 <= 'z')) ) {
								alt9=10;
							}

							else {
								alt9=9;
							}

						}

						else {
							alt9=10;
						}

					}

					else {
						alt9=10;
					}

				}

				else {
					alt9=10;
				}

			}

			else {
				alt9=10;
			}

			}
			break;
		case '*':
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
		case 'a':
		case 'b':
		case 'c':
		case 'e':
		case 'g':
		case 'h':
		case 'i':
		case 'j':
		case 'k':
		case 'l':
		case 'n':
		case 'o':
		case 'p':
		case 'q':
		case 's':
		case 'u':
		case 'v':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			{
			alt9=10;
			}
			break;
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'E':
		case 'F':
		case 'G':
		case 'H':
		case 'I':
		case 'J':
		case 'K':
		case 'L':
		case 'M':
		case 'N':
		case 'O':
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
			{
			alt9=11;
			}
			break;
		case '\t':
		case '\n':
		case '\f':
		case '\r':
		case ' ':
			{
			alt9=12;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 9, 0, input);
			throw nvae;
		}
		switch (alt9) {
			case 1 :
				// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:1:10: T__8
				{
				mT__8(); 

				}
				break;
			case 2 :
				// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:1:15: T__9
				{
				mT__9(); 

				}
				break;
			case 3 :
				// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:1:20: T__10
				{
				mT__10(); 

				}
				break;
			case 4 :
				// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:1:26: T__11
				{
				mT__11(); 

				}
				break;
			case 5 :
				// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:1:32: T__12
				{
				mT__12(); 

				}
				break;
			case 6 :
				// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:1:38: T__13
				{
				mT__13(); 

				}
				break;
			case 7 :
				// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:1:44: T__14
				{
				mT__14(); 

				}
				break;
			case 8 :
				// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:1:50: T__15
				{
				mT__15(); 

				}
				break;
			case 9 :
				// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:1:56: MOBILEFLAG
				{
				mMOBILEFLAG(); 

				}
				break;
			case 10 :
				// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:1:67: ID
				{
				mID(); 

				}
				break;
			case 11 :
				// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:1:70: CAPITALIZED_ID
				{
				mCAPITALIZED_ID(); 

				}
				break;
			case 12 :
				// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:1:85: WS
				{
				mWS(); 

				}
				break;

		}
	}



}
