// $ANTLR 3.5.1 S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g 2016-01-01 11:46:12

package iotsuite.parser;
import iotsuite.compiler.*; 
import iotsuite.semanticmodel.*;  


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class NetworkSpecParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CAPITALIZED_ID", "DESCRIPTION_ID", 
		"ID", "MOBILEFLAG", "WS", "'\"'", "','", "':'", "';'", "'database'", "'description'", 
		"'devices'", "'location'", "'platform'", "'protocol'", "'resources'"
	};
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
	public static final int T__19=19;
	public static final int CAPITALIZED_ID=4;
	public static final int DESCRIPTION_ID=5;
	public static final int ID=6;
	public static final int MOBILEFLAG=7;
	public static final int WS=8;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public NetworkSpecParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public NetworkSpecParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return NetworkSpecParser.tokenNames; }
	@Override public String getGrammarFileName() { return "S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g"; }


	  //Initialize the context
	  private SymbolTable context; 



	// $ANTLR start "networkspec"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:23:1: networkspec : 'devices' ':' ( device_def )* ;
	public final void networkspec() throws RecognitionException {
		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:23:12: ( 'devices' ':' ( device_def )* )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:24:7: 'devices' ':' ( device_def )*
			{
			match(input,15,FOLLOW_15_in_networkspec58); 
			match(input,11,FOLLOW_11_in_networkspec60); 
			 context = new SymbolTable();
			      
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:27:8: ( device_def )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==CAPITALIZED_ID||LA1_0==ID) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:27:9: device_def
					{
					pushFollow(FOLLOW_device_def_in_networkspec78);
					device_def();
					state._fsp--;

					}
					break;

				default :
					break loop1;
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
	// $ANTLR end "networkspec"



	// $ANTLR start "device_def"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:30:1: device_def : deviceName= ( ID | CAPITALIZED_ID ) ':' 'location' ':' ( location_def )* 'platform' ':' ( device_type )* ';' 'resources' ':' ( abilities_def )? ';' 'protocol' ':' ( protocol_value )* ';' ( 'database' ':' database_def ';' )* 'description' ':' ( description_def )* ';' ;
	public final void device_def() throws RecognitionException {
		Token deviceName=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:30:11: (deviceName= ( ID | CAPITALIZED_ID ) ':' 'location' ':' ( location_def )* 'platform' ':' ( device_type )* ';' 'resources' ':' ( abilities_def )? ';' 'protocol' ':' ( protocol_value )* ';' ( 'database' ':' database_def ';' )* 'description' ':' ( description_def )* ';' )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:31:4: deviceName= ( ID | CAPITALIZED_ID ) ':' 'location' ':' ( location_def )* 'platform' ':' ( device_type )* ';' 'resources' ':' ( abilities_def )? ';' 'protocol' ':' ( protocol_value )* ';' ( 'database' ':' database_def ';' )* 'description' ':' ( description_def )* ';'
			{
			deviceName=input.LT(1);
			if ( input.LA(1)==CAPITALIZED_ID||input.LA(1)==ID ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			match(input,11,FOLLOW_11_in_device_def114); 
			 
			   context.currentNetwork = new DeviceCompiler();
			   context.currentNetwork.setDeviceName((deviceName!=null?deviceName.getText():null));
			   
			match(input,16,FOLLOW_16_in_device_def130); 
			match(input,11,FOLLOW_11_in_device_def132); 
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:36:20: ( location_def )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==CAPITALIZED_ID) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:36:21: location_def
					{
					pushFollow(FOLLOW_location_def_in_device_def135);
					location_def();
					state._fsp--;

					}
					break;

				default :
					break loop2;
				}
			}

			match(input,17,FOLLOW_17_in_device_def144); 
			match(input,11,FOLLOW_11_in_device_def146); 
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:37:20: ( device_type )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==CAPITALIZED_ID) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:37:21: device_type
					{
					pushFollow(FOLLOW_device_type_in_device_def149);
					device_type();
					state._fsp--;

					}
					break;

				default :
					break loop3;
				}
			}

			match(input,12,FOLLOW_12_in_device_def153); 
			match(input,19,FOLLOW_19_in_device_def160); 
			match(input,11,FOLLOW_11_in_device_def162); 
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:38:21: ( abilities_def )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==CAPITALIZED_ID) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:38:22: abilities_def
					{
					pushFollow(FOLLOW_abilities_def_in_device_def165);
					abilities_def();
					state._fsp--;

					}
					break;

			}

			match(input,12,FOLLOW_12_in_device_def170); 
			match(input,18,FOLLOW_18_in_device_def176); 
			match(input,11,FOLLOW_11_in_device_def178); 
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:39:20: ( protocol_value )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==ID) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:39:21: protocol_value
					{
					pushFollow(FOLLOW_protocol_value_in_device_def181);
					protocol_value();
					state._fsp--;

					}
					break;

				default :
					break loop5;
				}
			}

			match(input,12,FOLLOW_12_in_device_def185); 
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:40:5: ( 'database' ':' database_def ';' )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==13) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:40:6: 'database' ':' database_def ';'
					{
					match(input,13,FOLLOW_13_in_device_def193); 
					match(input,11,FOLLOW_11_in_device_def195); 
					pushFollow(FOLLOW_database_def_in_device_def197);
					database_def();
					state._fsp--;

					match(input,12,FOLLOW_12_in_device_def199); 
					}
					break;

				default :
					break loop6;
				}
			}

			match(input,14,FOLLOW_14_in_device_def216); 
			match(input,11,FOLLOW_11_in_device_def218); 
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:41:25: ( description_def )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==9) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:41:26: description_def
					{
					pushFollow(FOLLOW_description_def_in_device_def222);
					description_def();
					state._fsp--;

					}
					break;

				default :
					break loop7;
				}
			}

			match(input,12,FOLLOW_12_in_device_def227); 
			 context.currentNetwork.addDeviceObj();
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
	// $ANTLR end "device_def"



	// $ANTLR start "location_def"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:45:1: location_def : CAPITALIZED_ID ':' ID ';' ;
	public final void location_def() throws RecognitionException {
		Token CAPITALIZED_ID1=null;
		Token ID2=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:45:14: ( CAPITALIZED_ID ':' ID ';' )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:46:5: CAPITALIZED_ID ':' ID ';'
			{
			CAPITALIZED_ID1=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_location_def263); 
			match(input,11,FOLLOW_11_in_location_def265); 
			ID2=(Token)match(input,ID,FOLLOW_ID_in_location_def267); 
			match(input,12,FOLLOW_12_in_location_def269); 
			context.currentNetwork.addRegionLabel((CAPITALIZED_ID1!=null?CAPITALIZED_ID1.getText():null));
			    context.currentNetwork.addRegionValue((ID2!=null?ID2.getText():null));
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
	// $ANTLR end "location_def"



	// $ANTLR start "device_type"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:52:1: device_type : CAPITALIZED_ID ;
	public final void device_type() throws RecognitionException {
		Token CAPITALIZED_ID3=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:52:13: ( CAPITALIZED_ID )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:53:6: CAPITALIZED_ID
			{
			CAPITALIZED_ID3=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_device_type296); 
			context.currentNetwork.setDeviceType((CAPITALIZED_ID3!=null?CAPITALIZED_ID3.getText():null));
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
	// $ANTLR end "device_type"



	// $ANTLR start "abilities_def"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:57:1: abilities_def : CAPITALIZED_ID ( ',' abilities_def )? ;
	public final void abilities_def() throws RecognitionException {
		Token CAPITALIZED_ID4=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:57:15: ( CAPITALIZED_ID ( ',' abilities_def )? )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:58:4: CAPITALIZED_ID ( ',' abilities_def )?
			{
			CAPITALIZED_ID4=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_abilities_def315); 
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:58:19: ( ',' abilities_def )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==10) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:58:20: ',' abilities_def
					{
					match(input,10,FOLLOW_10_in_abilities_def318); 
					pushFollow(FOLLOW_abilities_def_in_abilities_def320);
					abilities_def();
					state._fsp--;

					}
					break;

			}

			context.currentNetwork.addDeviceAbilities((CAPITALIZED_ID4!=null?CAPITALIZED_ID4.getText():null));
			  
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



	// $ANTLR start "protocol_value"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:66:1: protocol_value : ID ;
	public final void protocol_value() throws RecognitionException {
		Token ID5=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:66:15: ( ID )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:67:3: ID
			{
			ID5=(Token)match(input,ID,FOLLOW_ID_in_protocol_value346); 
			context.currentNetwork.setProtocol((ID5!=null?ID5.getText():null));
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
	// $ANTLR end "protocol_value"



	// $ANTLR start "description_def"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:71:1: description_def : '\"' DESCRIPTION_ID '\"' ;
	public final void description_def() throws RecognitionException {
		Token DESCRIPTION_ID6=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:71:16: ( '\"' DESCRIPTION_ID '\"' )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:72:4: '\"' DESCRIPTION_ID '\"'
			{
			match(input,9,FOLLOW_9_in_description_def365); 
			DESCRIPTION_ID6=(Token)match(input,DESCRIPTION_ID,FOLLOW_DESCRIPTION_ID_in_description_def366); 
			match(input,9,FOLLOW_9_in_description_def368); 
			context.currentNetwork.setDeviceDescription((DESCRIPTION_ID6!=null?DESCRIPTION_ID6.getText():null));
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
	// $ANTLR end "description_def"



	// $ANTLR start "database_def"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:76:1: database_def : CAPITALIZED_ID ;
	public final void database_def() throws RecognitionException {
		Token CAPITALIZED_ID7=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:76:13: ( CAPITALIZED_ID )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:77:1: CAPITALIZED_ID
			{
			CAPITALIZED_ID7=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_database_def385); 
			context.currentNetwork.setDatabase((CAPITALIZED_ID7!=null?CAPITALIZED_ID7.getText():null));
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
	// $ANTLR end "database_def"

	// Delegated rules



	public static final BitSet FOLLOW_15_in_networkspec58 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_networkspec60 = new BitSet(new long[]{0x0000000000000052L});
	public static final BitSet FOLLOW_device_def_in_networkspec78 = new BitSet(new long[]{0x0000000000000052L});
	public static final BitSet FOLLOW_set_in_device_def108 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_device_def114 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_device_def130 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_device_def132 = new BitSet(new long[]{0x0000000000020010L});
	public static final BitSet FOLLOW_location_def_in_device_def135 = new BitSet(new long[]{0x0000000000020010L});
	public static final BitSet FOLLOW_17_in_device_def144 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_device_def146 = new BitSet(new long[]{0x0000000000001010L});
	public static final BitSet FOLLOW_device_type_in_device_def149 = new BitSet(new long[]{0x0000000000001010L});
	public static final BitSet FOLLOW_12_in_device_def153 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_device_def160 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_device_def162 = new BitSet(new long[]{0x0000000000001010L});
	public static final BitSet FOLLOW_abilities_def_in_device_def165 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_device_def170 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_device_def176 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_device_def178 = new BitSet(new long[]{0x0000000000001040L});
	public static final BitSet FOLLOW_protocol_value_in_device_def181 = new BitSet(new long[]{0x0000000000001040L});
	public static final BitSet FOLLOW_12_in_device_def185 = new BitSet(new long[]{0x0000000000006000L});
	public static final BitSet FOLLOW_13_in_device_def193 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_device_def195 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_database_def_in_device_def197 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_device_def199 = new BitSet(new long[]{0x0000000000006000L});
	public static final BitSet FOLLOW_14_in_device_def216 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_device_def218 = new BitSet(new long[]{0x0000000000001200L});
	public static final BitSet FOLLOW_description_def_in_device_def222 = new BitSet(new long[]{0x0000000000001200L});
	public static final BitSet FOLLOW_12_in_device_def227 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_location_def263 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_location_def265 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_location_def267 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_location_def269 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_device_type296 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_abilities_def315 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_10_in_abilities_def318 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_abilities_def_in_abilities_def320 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_protocol_value346 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_9_in_description_def365 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_DESCRIPTION_ID_in_description_def366 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_description_def368 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_database_def385 = new BitSet(new long[]{0x0000000000000002L});
}
