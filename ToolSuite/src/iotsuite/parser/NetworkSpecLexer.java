// $ANTLR 3.5.1 S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g 2015-10-17 16:57:55

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
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:16:7: ( 'os' )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:16:9: 'os'
			{
			match("os"); 

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
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:17:7: ( 'protocol' )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:17:9: 'protocol'
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
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:18:7: ( 'region' )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:18:9: 'region'
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
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:19:7: ( 'resources' )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:19:9: 'resources'
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
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:91:12: ( 'true' | 'false' )
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
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:91:15: 'true'
					{
					match("true"); 

					}
					break;
				case 2 :
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:91:24: 'false'
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
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:96:5: ( ( 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' )* ( '0' .. '9' )* ) | '0' .. '9' ( '0' .. '9' )* | '*' )
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
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:96:7: ( 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' )* ( '0' .. '9' )* )
					{
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:96:7: ( 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' )* ( '0' .. '9' )* )
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:96:8: 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' )* ( '0' .. '9' )*
					{
					matchRange('a','z'); 
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:96:18: ( 'a' .. 'z' | 'A' .. 'Z' )*
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

					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:96:42: ( '0' .. '9' )*
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
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:96:56: '0' .. '9' ( '0' .. '9' )*
					{
					matchRange('0','9'); 
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:96:64: ( '0' .. '9' )*
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
					// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:96:76: '*'
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
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:104:15: ( 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' )* ( '0' .. '9' )* )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:104:17: 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' )* ( '0' .. '9' )*
			{
			matchRange('A','Z'); 
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:104:26: ( 'a' .. 'z' | 'A' .. 'Z' )*
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

			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:104:50: ( '0' .. '9' )*
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
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:106:3: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+ )
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:106:5: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
			{
			// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:106:5: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
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
		// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:1:8: ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | MOBILEFLAG | ID | CAPITALIZED_ID | WS )
		int alt9=13;
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
				int LA9_14 = input.LA(3);
				if ( (LA9_14=='v') ) {
					int LA9_21 = input.LA(4);
					if ( (LA9_21=='i') ) {
						int LA9_29 = input.LA(5);
						if ( (LA9_29=='c') ) {
							int LA9_36 = input.LA(6);
							if ( (LA9_36=='e') ) {
								int LA9_43 = input.LA(7);
								if ( (LA9_43=='s') ) {
									int LA9_48 = input.LA(8);
									if ( ((LA9_48 >= '0' && LA9_48 <= '9')||(LA9_48 >= 'A' && LA9_48 <= 'Z')||(LA9_48 >= 'a' && LA9_48 <= 'z')) ) {
										alt9=11;
									}

									else {
										alt9=4;
									}

								}

								else {
									alt9=11;
								}

							}

							else {
								alt9=11;
							}

						}

						else {
							alt9=11;
						}

					}

					else {
						alt9=11;
					}

				}

				else {
					alt9=11;
				}

			}

			else {
				alt9=11;
			}

			}
			break;
		case 'm':
			{
			int LA9_5 = input.LA(2);
			if ( (LA9_5=='o') ) {
				int LA9_15 = input.LA(3);
				if ( (LA9_15=='b') ) {
					int LA9_22 = input.LA(4);
					if ( (LA9_22=='i') ) {
						int LA9_30 = input.LA(5);
						if ( (LA9_30=='l') ) {
							int LA9_37 = input.LA(6);
							if ( (LA9_37=='e') ) {
								int LA9_44 = input.LA(7);
								if ( ((LA9_44 >= '0' && LA9_44 <= '9')||(LA9_44 >= 'A' && LA9_44 <= 'Z')||(LA9_44 >= 'a' && LA9_44 <= 'z')) ) {
									alt9=11;
								}

								else {
									alt9=5;
								}

							}

							else {
								alt9=11;
							}

						}

						else {
							alt9=11;
						}

					}

					else {
						alt9=11;
					}

				}

				else {
					alt9=11;
				}

			}

			else {
				alt9=11;
			}

			}
			break;
		case 'o':
			{
			int LA9_6 = input.LA(2);
			if ( (LA9_6=='s') ) {
				int LA9_16 = input.LA(3);
				if ( ((LA9_16 >= '0' && LA9_16 <= '9')||(LA9_16 >= 'A' && LA9_16 <= 'Z')||(LA9_16 >= 'a' && LA9_16 <= 'z')) ) {
					alt9=11;
				}

				else {
					alt9=6;
				}

			}

			else {
				alt9=11;
			}

			}
			break;
		case 'p':
			{
			int LA9_7 = input.LA(2);
			if ( (LA9_7=='r') ) {
				int LA9_17 = input.LA(3);
				if ( (LA9_17=='o') ) {
					int LA9_24 = input.LA(4);
					if ( (LA9_24=='t') ) {
						int LA9_31 = input.LA(5);
						if ( (LA9_31=='o') ) {
							int LA9_38 = input.LA(6);
							if ( (LA9_38=='c') ) {
								int LA9_45 = input.LA(7);
								if ( (LA9_45=='o') ) {
									int LA9_50 = input.LA(8);
									if ( (LA9_50=='l') ) {
										int LA9_54 = input.LA(9);
										if ( ((LA9_54 >= '0' && LA9_54 <= '9')||(LA9_54 >= 'A' && LA9_54 <= 'Z')||(LA9_54 >= 'a' && LA9_54 <= 'z')) ) {
											alt9=11;
										}

										else {
											alt9=7;
										}

									}

									else {
										alt9=11;
									}

								}

								else {
									alt9=11;
								}

							}

							else {
								alt9=11;
							}

						}

						else {
							alt9=11;
						}

					}

					else {
						alt9=11;
					}

				}

				else {
					alt9=11;
				}

			}

			else {
				alt9=11;
			}

			}
			break;
		case 'r':
			{
			int LA9_8 = input.LA(2);
			if ( (LA9_8=='e') ) {
				switch ( input.LA(3) ) {
				case 'g':
					{
					int LA9_25 = input.LA(4);
					if ( (LA9_25=='i') ) {
						int LA9_32 = input.LA(5);
						if ( (LA9_32=='o') ) {
							int LA9_39 = input.LA(6);
							if ( (LA9_39=='n') ) {
								int LA9_46 = input.LA(7);
								if ( ((LA9_46 >= '0' && LA9_46 <= '9')||(LA9_46 >= 'A' && LA9_46 <= 'Z')||(LA9_46 >= 'a' && LA9_46 <= 'z')) ) {
									alt9=11;
								}

								else {
									alt9=8;
								}

							}

							else {
								alt9=11;
							}

						}

						else {
							alt9=11;
						}

					}

					else {
						alt9=11;
					}

					}
					break;
				case 's':
					{
					int LA9_26 = input.LA(4);
					if ( (LA9_26=='o') ) {
						int LA9_33 = input.LA(5);
						if ( (LA9_33=='u') ) {
							int LA9_40 = input.LA(6);
							if ( (LA9_40=='r') ) {
								int LA9_47 = input.LA(7);
								if ( (LA9_47=='c') ) {
									int LA9_52 = input.LA(8);
									if ( (LA9_52=='e') ) {
										int LA9_55 = input.LA(9);
										if ( (LA9_55=='s') ) {
											int LA9_57 = input.LA(10);
											if ( ((LA9_57 >= '0' && LA9_57 <= '9')||(LA9_57 >= 'A' && LA9_57 <= 'Z')||(LA9_57 >= 'a' && LA9_57 <= 'z')) ) {
												alt9=11;
											}

											else {
												alt9=9;
											}

										}

										else {
											alt9=11;
										}

									}

									else {
										alt9=11;
									}

								}

								else {
									alt9=11;
								}

							}

							else {
								alt9=11;
							}

						}

						else {
							alt9=11;
						}

					}

					else {
						alt9=11;
					}

					}
					break;
				default:
					alt9=11;
				}
			}

			else {
				alt9=11;
			}

			}
			break;
		case 't':
			{
			int LA9_9 = input.LA(2);
			if ( (LA9_9=='r') ) {
				int LA9_19 = input.LA(3);
				if ( (LA9_19=='u') ) {
					int LA9_27 = input.LA(4);
					if ( (LA9_27=='e') ) {
						int LA9_34 = input.LA(5);
						if ( ((LA9_34 >= '0' && LA9_34 <= '9')||(LA9_34 >= 'A' && LA9_34 <= 'Z')||(LA9_34 >= 'a' && LA9_34 <= 'z')) ) {
							alt9=11;
						}

						else {
							alt9=10;
						}

					}

					else {
						alt9=11;
					}

				}

				else {
					alt9=11;
				}

			}

			else {
				alt9=11;
			}

			}
			break;
		case 'f':
			{
			int LA9_10 = input.LA(2);
			if ( (LA9_10=='a') ) {
				int LA9_20 = input.LA(3);
				if ( (LA9_20=='l') ) {
					int LA9_28 = input.LA(4);
					if ( (LA9_28=='s') ) {
						int LA9_35 = input.LA(5);
						if ( (LA9_35=='e') ) {
							int LA9_42 = input.LA(6);
							if ( ((LA9_42 >= '0' && LA9_42 <= '9')||(LA9_42 >= 'A' && LA9_42 <= 'Z')||(LA9_42 >= 'a' && LA9_42 <= 'z')) ) {
								alt9=11;
							}

							else {
								alt9=10;
							}

						}

						else {
							alt9=11;
						}

					}

					else {
						alt9=11;
					}

				}

				else {
					alt9=11;
				}

			}

			else {
				alt9=11;
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
		case 'q':
		case 's':
		case 'u':
		case 'v':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			{
			alt9=11;
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
			alt9=12;
			}
			break;
		case '\t':
		case '\n':
		case '\f':
		case '\r':
		case ' ':
			{
			alt9=13;
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
				// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:1:56: T__16
				{
				mT__16(); 

				}
				break;
			case 10 :
				// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:1:62: MOBILEFLAG
				{
				mMOBILEFLAG(); 

				}
				break;
			case 11 :
				// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:1:73: ID
				{
				mID(); 

				}
				break;
			case 12 :
				// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:1:76: CAPITALIZED_ID
				{
				mCAPITALIZED_ID(); 

				}
				break;
			case 13 :
				// S:\\Thesis\\DevelopmentFramework\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:1:91: WS
				{
				mWS(); 

				}
				break;

		}
	}



}
