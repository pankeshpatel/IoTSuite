// $ANTLR 3.5.1 C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g 2015-01-12 15:29:27

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
	public static final int CAPITALIZED_ID=4;
	public static final int ID=5;
	public static final int INT=6;
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
	@Override public String getGrammarFileName() { return "C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g"; }

	// $ANTLR start "T__9"
	public final void mT__9() throws RecognitionException {
		try {
			int _type = T__9;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:11:6: ( ',' )
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:11:8: ','
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
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:12:7: ( ':' )
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:12:9: ':'
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
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:13:7: ( ';' )
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:13:9: ';'
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
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:14:7: ( 'devices' )
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:14:9: 'devices'
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
	// $ANTLR end "T__12"

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:15:7: ( 'mobile' )
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:15:9: 'mobile'
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
	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:16:7: ( 'region' )
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:16:9: 'region'
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
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:17:7: ( 'resources' )
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:17:9: 'resources'
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
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:18:7: ( 'type' )
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:18:9: 'type'
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
	// $ANTLR end "T__16"

	// $ANTLR start "MOBILEFLAG"
	public final void mMOBILEFLAG() throws RecognitionException {
		try {
			int _type = MOBILEFLAG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:82:12: ( 'true' | 'false' )
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
					// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:82:15: 'true'
					{
					match("true"); 

					}
					break;
				case 2 :
					// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:82:24: 'false'
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
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:85:5: ( 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' )* ( '0' .. '9' )* )
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:85:7: 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' )* ( '0' .. '9' )*
			{
			matchRange('a','z'); 
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:85:17: ( 'a' .. 'z' | 'A' .. 'Z' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= 'A' && LA2_0 <= 'Z')||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:
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

			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:85:41: ( '0' .. '9' )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:
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
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:88:5: ( '0' .. '9' ( '0' .. '9' )* )
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:88:7: '0' .. '9' ( '0' .. '9' )*
			{
			matchRange('0','9'); 
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:88:15: ( '0' .. '9' )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:
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
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:90:15: ( 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' )* ( '0' .. '9' )* )
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:90:17: 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' )* ( '0' .. '9' )*
			{
			matchRange('A','Z'); 
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:90:26: ( 'a' .. 'z' | 'A' .. 'Z' )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= 'A' && LA5_0 <= 'Z')||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:
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
					break loop5;
				}
			}

			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:90:50: ( '0' .. '9' )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:
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
	// $ANTLR end "CAPITALIZED_ID"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:92:3: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+ )
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:92:5: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
			{
			// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:92:5: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
			int cnt7=0;
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= '\t' && LA7_0 <= '\n')||(LA7_0 >= '\f' && LA7_0 <= '\r')||LA7_0==' ') ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:
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
					if ( cnt7 >= 1 ) break loop7;
					EarlyExitException eee = new EarlyExitException(7, input);
					throw eee;
				}
				cnt7++;
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
		// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | MOBILEFLAG | ID | INT | CAPITALIZED_ID | WS )
		int alt8=13;
		switch ( input.LA(1) ) {
		case ',':
			{
			alt8=1;
			}
			break;
		case ':':
			{
			alt8=2;
			}
			break;
		case ';':
			{
			alt8=3;
			}
			break;
		case 'd':
			{
			int LA8_4 = input.LA(2);
			if ( (LA8_4=='e') ) {
				int LA8_13 = input.LA(3);
				if ( (LA8_13=='v') ) {
					int LA8_19 = input.LA(4);
					if ( (LA8_19=='i') ) {
						int LA8_26 = input.LA(5);
						if ( (LA8_26=='c') ) {
							int LA8_33 = input.LA(6);
							if ( (LA8_33=='e') ) {
								int LA8_40 = input.LA(7);
								if ( (LA8_40=='s') ) {
									int LA8_44 = input.LA(8);
									if ( ((LA8_44 >= '0' && LA8_44 <= '9')||(LA8_44 >= 'A' && LA8_44 <= 'Z')||(LA8_44 >= 'a' && LA8_44 <= 'z')) ) {
										alt8=10;
									}

									else {
										alt8=4;
									}

								}

								else {
									alt8=10;
								}

							}

							else {
								alt8=10;
							}

						}

						else {
							alt8=10;
						}

					}

					else {
						alt8=10;
					}

				}

				else {
					alt8=10;
				}

			}

			else {
				alt8=10;
			}

			}
			break;
		case 'm':
			{
			int LA8_5 = input.LA(2);
			if ( (LA8_5=='o') ) {
				int LA8_14 = input.LA(3);
				if ( (LA8_14=='b') ) {
					int LA8_20 = input.LA(4);
					if ( (LA8_20=='i') ) {
						int LA8_27 = input.LA(5);
						if ( (LA8_27=='l') ) {
							int LA8_34 = input.LA(6);
							if ( (LA8_34=='e') ) {
								int LA8_41 = input.LA(7);
								if ( ((LA8_41 >= '0' && LA8_41 <= '9')||(LA8_41 >= 'A' && LA8_41 <= 'Z')||(LA8_41 >= 'a' && LA8_41 <= 'z')) ) {
									alt8=10;
								}

								else {
									alt8=5;
								}

							}

							else {
								alt8=10;
							}

						}

						else {
							alt8=10;
						}

					}

					else {
						alt8=10;
					}

				}

				else {
					alt8=10;
				}

			}

			else {
				alt8=10;
			}

			}
			break;
		case 'r':
			{
			int LA8_6 = input.LA(2);
			if ( (LA8_6=='e') ) {
				switch ( input.LA(3) ) {
				case 'g':
					{
					int LA8_21 = input.LA(4);
					if ( (LA8_21=='i') ) {
						int LA8_28 = input.LA(5);
						if ( (LA8_28=='o') ) {
							int LA8_35 = input.LA(6);
							if ( (LA8_35=='n') ) {
								int LA8_42 = input.LA(7);
								if ( ((LA8_42 >= '0' && LA8_42 <= '9')||(LA8_42 >= 'A' && LA8_42 <= 'Z')||(LA8_42 >= 'a' && LA8_42 <= 'z')) ) {
									alt8=10;
								}

								else {
									alt8=6;
								}

							}

							else {
								alt8=10;
							}

						}

						else {
							alt8=10;
						}

					}

					else {
						alt8=10;
					}

					}
					break;
				case 's':
					{
					int LA8_22 = input.LA(4);
					if ( (LA8_22=='o') ) {
						int LA8_29 = input.LA(5);
						if ( (LA8_29=='u') ) {
							int LA8_36 = input.LA(6);
							if ( (LA8_36=='r') ) {
								int LA8_43 = input.LA(7);
								if ( (LA8_43=='c') ) {
									int LA8_47 = input.LA(8);
									if ( (LA8_47=='e') ) {
										int LA8_49 = input.LA(9);
										if ( (LA8_49=='s') ) {
											int LA8_50 = input.LA(10);
											if ( ((LA8_50 >= '0' && LA8_50 <= '9')||(LA8_50 >= 'A' && LA8_50 <= 'Z')||(LA8_50 >= 'a' && LA8_50 <= 'z')) ) {
												alt8=10;
											}

											else {
												alt8=7;
											}

										}

										else {
											alt8=10;
										}

									}

									else {
										alt8=10;
									}

								}

								else {
									alt8=10;
								}

							}

							else {
								alt8=10;
							}

						}

						else {
							alt8=10;
						}

					}

					else {
						alt8=10;
					}

					}
					break;
				default:
					alt8=10;
				}
			}

			else {
				alt8=10;
			}

			}
			break;
		case 't':
			{
			switch ( input.LA(2) ) {
			case 'y':
				{
				int LA8_16 = input.LA(3);
				if ( (LA8_16=='p') ) {
					int LA8_23 = input.LA(4);
					if ( (LA8_23=='e') ) {
						int LA8_30 = input.LA(5);
						if ( ((LA8_30 >= '0' && LA8_30 <= '9')||(LA8_30 >= 'A' && LA8_30 <= 'Z')||(LA8_30 >= 'a' && LA8_30 <= 'z')) ) {
							alt8=10;
						}

						else {
							alt8=8;
						}

					}

					else {
						alt8=10;
					}

				}

				else {
					alt8=10;
				}

				}
				break;
			case 'r':
				{
				int LA8_17 = input.LA(3);
				if ( (LA8_17=='u') ) {
					int LA8_24 = input.LA(4);
					if ( (LA8_24=='e') ) {
						int LA8_31 = input.LA(5);
						if ( ((LA8_31 >= '0' && LA8_31 <= '9')||(LA8_31 >= 'A' && LA8_31 <= 'Z')||(LA8_31 >= 'a' && LA8_31 <= 'z')) ) {
							alt8=10;
						}

						else {
							alt8=9;
						}

					}

					else {
						alt8=10;
					}

				}

				else {
					alt8=10;
				}

				}
				break;
			default:
				alt8=10;
			}
			}
			break;
		case 'f':
			{
			int LA8_8 = input.LA(2);
			if ( (LA8_8=='a') ) {
				int LA8_18 = input.LA(3);
				if ( (LA8_18=='l') ) {
					int LA8_25 = input.LA(4);
					if ( (LA8_25=='s') ) {
						int LA8_32 = input.LA(5);
						if ( (LA8_32=='e') ) {
							int LA8_39 = input.LA(6);
							if ( ((LA8_39 >= '0' && LA8_39 <= '9')||(LA8_39 >= 'A' && LA8_39 <= 'Z')||(LA8_39 >= 'a' && LA8_39 <= 'z')) ) {
								alt8=10;
							}

							else {
								alt8=9;
							}

						}

						else {
							alt8=10;
						}

					}

					else {
						alt8=10;
					}

				}

				else {
					alt8=10;
				}

			}

			else {
				alt8=10;
			}

			}
			break;
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
			alt8=10;
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
			alt8=11;
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
			alt8=12;
			}
			break;
		case '\t':
		case '\n':
		case '\f':
		case '\r':
		case ' ':
			{
			alt8=13;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 8, 0, input);
			throw nvae;
		}
		switch (alt8) {
			case 1 :
				// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:1:10: T__9
				{
				mT__9(); 

				}
				break;
			case 2 :
				// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:1:15: T__10
				{
				mT__10(); 

				}
				break;
			case 3 :
				// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:1:21: T__11
				{
				mT__11(); 

				}
				break;
			case 4 :
				// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:1:27: T__12
				{
				mT__12(); 

				}
				break;
			case 5 :
				// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:1:33: T__13
				{
				mT__13(); 

				}
				break;
			case 6 :
				// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:1:39: T__14
				{
				mT__14(); 

				}
				break;
			case 7 :
				// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:1:45: T__15
				{
				mT__15(); 

				}
				break;
			case 8 :
				// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:1:51: T__16
				{
				mT__16(); 

				}
				break;
			case 9 :
				// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:1:57: MOBILEFLAG
				{
				mMOBILEFLAG(); 

				}
				break;
			case 10 :
				// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:1:68: ID
				{
				mID(); 

				}
				break;
			case 11 :
				// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:1:71: INT
				{
				mINT(); 

				}
				break;
			case 12 :
				// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:1:75: CAPITALIZED_ID
				{
				mCAPITALIZED_ID(); 

				}
				break;
			case 13 :
				// C:\\Users\\inpapat4\\git\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:1:90: WS
				{
				mWS(); 

				}
				break;

		}
	}



}
