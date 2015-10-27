// $ANTLR 3.5.1 S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g 2015-10-27 22:57:08

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
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CAPITALIZED_ID", "ID", "MOBILEFLAG", 
		"WS", "','", "':'", "';'", "'devices'", "'mobile'", "'platform'", "'protocol'", 
		"'region'", "'resources'"
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
	public static final int CAPITALIZED_ID=4;
	public static final int ID=5;
	public static final int MOBILEFLAG=6;
	public static final int WS=7;

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
	@Override public String getGrammarFileName() { return "S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g"; }


	  //Initialize the context
	  private SymbolTable context; 



	// $ANTLR start "networkspec"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:23:1: networkspec : 'devices' ':' ( device_def )* ;
	public final void networkspec() throws RecognitionException {
		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:23:12: ( 'devices' ':' ( device_def )* )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:24:7: 'devices' ':' ( device_def )*
			{
			match(input,11,FOLLOW_11_in_networkspec58); 
			match(input,9,FOLLOW_9_in_networkspec60); 
			 context = new SymbolTable();
			      
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:27:8: ( device_def )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= CAPITALIZED_ID && LA1_0 <= ID)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:27:9: device_def
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
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:30:1: device_def : deviceName= ( ID | CAPITALIZED_ID ) ':' 'region' ':' ( location_def )* 'platform' ':' ( device_type )* ';' 'resources' ':' ( abilities_def )? ';' 'protocol' ':' ( protocol_value )* ';' ;
	public final void device_def() throws RecognitionException {
		Token deviceName=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:30:11: (deviceName= ( ID | CAPITALIZED_ID ) ':' 'region' ':' ( location_def )* 'platform' ':' ( device_type )* ';' 'resources' ':' ( abilities_def )? ';' 'protocol' ':' ( protocol_value )* ';' )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:31:4: deviceName= ( ID | CAPITALIZED_ID ) ':' 'region' ':' ( location_def )* 'platform' ':' ( device_type )* ';' 'resources' ':' ( abilities_def )? ';' 'protocol' ':' ( protocol_value )* ';'
			{
			deviceName=input.LT(1);
			if ( (input.LA(1) >= CAPITALIZED_ID && input.LA(1) <= ID) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			match(input,9,FOLLOW_9_in_device_def114); 
			 
			   context.currentNetwork = new DeviceCompiler();
			   context.currentNetwork.setDeviceName((deviceName!=null?deviceName.getText():null));
			   
			match(input,15,FOLLOW_15_in_device_def128); 
			match(input,9,FOLLOW_9_in_device_def130); 
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:36:18: ( location_def )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==CAPITALIZED_ID) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:36:19: location_def
					{
					pushFollow(FOLLOW_location_def_in_device_def133);
					location_def();
					state._fsp--;

					}
					break;

				default :
					break loop2;
				}
			}

			match(input,13,FOLLOW_13_in_device_def142); 
			match(input,9,FOLLOW_9_in_device_def144); 
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:37:20: ( device_type )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==CAPITALIZED_ID) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:37:21: device_type
					{
					pushFollow(FOLLOW_device_type_in_device_def147);
					device_type();
					state._fsp--;

					}
					break;

				default :
					break loop3;
				}
			}

			match(input,10,FOLLOW_10_in_device_def151); 
			match(input,16,FOLLOW_16_in_device_def158); 
			match(input,9,FOLLOW_9_in_device_def160); 
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:38:21: ( abilities_def )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==CAPITALIZED_ID) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:38:22: abilities_def
					{
					pushFollow(FOLLOW_abilities_def_in_device_def163);
					abilities_def();
					state._fsp--;

					}
					break;

			}

			match(input,10,FOLLOW_10_in_device_def168); 
			match(input,14,FOLLOW_14_in_device_def174); 
			match(input,9,FOLLOW_9_in_device_def176); 
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:39:20: ( protocol_value )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==ID) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:39:21: protocol_value
					{
					pushFollow(FOLLOW_protocol_value_in_device_def179);
					protocol_value();
					state._fsp--;

					}
					break;

				default :
					break loop5;
				}
			}

			match(input,10,FOLLOW_10_in_device_def183); 
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
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:47:1: location_def : CAPITALIZED_ID ':' ID ';' ;
	public final void location_def() throws RecognitionException {
		Token CAPITALIZED_ID1=null;
		Token ID2=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:47:14: ( CAPITALIZED_ID ':' ID ';' )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:48:5: CAPITALIZED_ID ':' ID ';'
			{
			CAPITALIZED_ID1=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_location_def213); 
			match(input,9,FOLLOW_9_in_location_def215); 
			ID2=(Token)match(input,ID,FOLLOW_ID_in_location_def217); 
			match(input,10,FOLLOW_10_in_location_def219); 
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
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:54:1: device_type : CAPITALIZED_ID ;
	public final void device_type() throws RecognitionException {
		Token CAPITALIZED_ID3=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:54:13: ( CAPITALIZED_ID )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:55:6: CAPITALIZED_ID
			{
			CAPITALIZED_ID3=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_device_type244); 
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
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:60:1: abilities_def : CAPITALIZED_ID ( ',' abilities_def )? ;
	public final void abilities_def() throws RecognitionException {
		Token CAPITALIZED_ID4=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:60:15: ( CAPITALIZED_ID ( ',' abilities_def )? )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:61:4: CAPITALIZED_ID ( ',' abilities_def )?
			{
			CAPITALIZED_ID4=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_abilities_def264); 
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:61:19: ( ',' abilities_def )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==8) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:61:20: ',' abilities_def
					{
					match(input,8,FOLLOW_8_in_abilities_def267); 
					pushFollow(FOLLOW_abilities_def_in_abilities_def269);
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



	// $ANTLR start "mobileFlag_def"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:67:1: mobileFlag_def : 'mobile' ':' MOBILEFLAG ;
	public final void mobileFlag_def() throws RecognitionException {
		Token MOBILEFLAG5=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:67:16: ( 'mobile' ':' MOBILEFLAG )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:68:4: 'mobile' ':' MOBILEFLAG
			{
			match(input,12,FOLLOW_12_in_mobileFlag_def288); 
			match(input,9,FOLLOW_9_in_mobileFlag_def290); 
			MOBILEFLAG5=(Token)match(input,MOBILEFLAG,FOLLOW_MOBILEFLAG_in_mobileFlag_def292); 
			context.currentNetwork.setMobileFlag((MOBILEFLAG5!=null?MOBILEFLAG5.getText():null));
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
	// $ANTLR end "mobileFlag_def"



	// $ANTLR start "protocol_value"
	// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:72:1: protocol_value : ID ;
	public final void protocol_value() throws RecognitionException {
		Token ID6=null;

		try {
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:72:15: ( ID )
			// S:\\Thesis\\DevelopmentFramework\\ToolSuite\\IoTSuite\\ToolSuite\\src\\iotsuite\\parser\\NetworkSpec.g:73:3: ID
			{
			ID6=(Token)match(input,ID,FOLLOW_ID_in_protocol_value308); 
			context.currentNetwork.setProtocol((ID6!=null?ID6.getText():null));
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

	// Delegated rules



	public static final BitSet FOLLOW_11_in_networkspec58 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_networkspec60 = new BitSet(new long[]{0x0000000000000032L});
	public static final BitSet FOLLOW_device_def_in_networkspec78 = new BitSet(new long[]{0x0000000000000032L});
	public static final BitSet FOLLOW_set_in_device_def108 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_device_def114 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_device_def128 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_device_def130 = new BitSet(new long[]{0x0000000000002010L});
	public static final BitSet FOLLOW_location_def_in_device_def133 = new BitSet(new long[]{0x0000000000002010L});
	public static final BitSet FOLLOW_13_in_device_def142 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_device_def144 = new BitSet(new long[]{0x0000000000000410L});
	public static final BitSet FOLLOW_device_type_in_device_def147 = new BitSet(new long[]{0x0000000000000410L});
	public static final BitSet FOLLOW_10_in_device_def151 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_device_def158 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_device_def160 = new BitSet(new long[]{0x0000000000000410L});
	public static final BitSet FOLLOW_abilities_def_in_device_def163 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_device_def168 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_device_def174 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_device_def176 = new BitSet(new long[]{0x0000000000000420L});
	public static final BitSet FOLLOW_protocol_value_in_device_def179 = new BitSet(new long[]{0x0000000000000420L});
	public static final BitSet FOLLOW_10_in_device_def183 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_location_def213 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_location_def215 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_location_def217 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_location_def219 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_device_type244 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_abilities_def264 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_8_in_abilities_def267 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_abilities_def_in_abilities_def269 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_mobileFlag_def288 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_mobileFlag_def290 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_MOBILEFLAG_in_mobileFlag_def292 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_protocol_value308 = new BitSet(new long[]{0x0000000000000002L});
}
