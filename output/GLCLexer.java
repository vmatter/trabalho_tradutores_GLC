// $ANTLR 3.5.1 E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g 2021-11-23 10:37:03

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class GLCLexer extends Lexer {
	public static final int EOF=-1;
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
	public static final int ATTRIB=4;
	public static final int CHAR=5;
	public static final int COMMENT=6;
	public static final int CONST=7;
	public static final int ESC_SEQ=8;
	public static final int FLOAT=9;
	public static final int RELAT_OP=10;
	public static final int SEMICOLON=11;
	public static final int STRING=12;
	public static final int VARIABLE=13;
	public static final int WS=14;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public GLCLexer() {} 
	public GLCLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public GLCLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g"; }

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:7:7: ( '(' )
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:7:9: '('
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
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:8:7: ( ')' )
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:8:9: ')'
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
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:9:7: ( '*' )
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:9:9: '*'
			{
			match('*'); 
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
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:10:7: ( '+' )
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:10:9: '+'
			{
			match('+'); 
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
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:11:7: ( '-' )
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:11:9: '-'
			{
			match('-'); 
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
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:12:7: ( '/' )
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:12:9: '/'
			{
			match('/'); 
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
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:13:7: ( 'do' )
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:13:9: 'do'
			{
			match("do"); 

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
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:14:7: ( 'else' )
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:14:9: 'else'
			{
			match("else"); 

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
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:15:7: ( 'end' )
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:15:9: 'end'
			{
			match("end"); 

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
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:16:7: ( 'if' )
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:16:9: 'if'
			{
			match("if"); 

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
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:17:7: ( 'then' )
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:17:9: 'then'
			{
			match("then"); 

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
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:18:7: ( 'while' )
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:18:9: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__26"

	// $ANTLR start "VARIABLE"
	public final void mVARIABLE() throws RecognitionException {
		try {
			int _type = VARIABLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:128:5: ( ( 'a' .. 'z' | 'A' .. 'Z' )+ )
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:128:7: ( 'a' .. 'z' | 'A' .. 'Z' )+
			{
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:128:7: ( 'a' .. 'z' | 'A' .. 'Z' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:
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
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VARIABLE"

	// $ANTLR start "CONST"
	public final void mCONST() throws RecognitionException {
		try {
			int _type = CONST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:131:7: ( ( '0' .. '9' )+ )
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:131:9: ( '0' .. '9' )+
			{
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:131:9: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:
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
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONST"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:135:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* | '.' ( '0' .. '9' )+ )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
				alt6=1;
			}
			else if ( (LA6_0=='.') ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:135:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )*
					{
					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:135:9: ( '0' .. '9' )+
					int cnt3=0;
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:
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
							if ( cnt3 >= 1 ) break loop3;
							EarlyExitException eee = new EarlyExitException(3, input);
							throw eee;
						}
						cnt3++;
					}

					match('.'); 
					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:135:25: ( '0' .. '9' )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:
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
				case 2 :
					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:136:9: '.' ( '0' .. '9' )+
					{
					match('.'); 
					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:136:13: ( '0' .. '9' )+
					int cnt5=0;
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:
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
							if ( cnt5 >= 1 ) break loop5;
							EarlyExitException eee = new EarlyExitException(5, input);
							throw eee;
						}
						cnt5++;
					}

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
	// $ANTLR end "FLOAT"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:140:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( . )* '*/' )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0=='/') ) {
				int LA10_1 = input.LA(2);
				if ( (LA10_1=='/') ) {
					alt10=1;
				}
				else if ( (LA10_1=='*') ) {
					alt10=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 10, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:140:7: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:140:12: (~ ( '\\n' | '\\r' ) )*
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( ((LA7_0 >= '\u0000' && LA7_0 <= '\t')||(LA7_0 >= '\u000B' && LA7_0 <= '\f')||(LA7_0 >= '\u000E' && LA7_0 <= '\uFFFF')) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
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

					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:140:26: ( '\\r' )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0=='\r') ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:140:26: '\\r'
							{
							match('\r'); 
							}
							break;

					}

					match('\n'); 
					skip();
					}
					break;
				case 2 :
					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:141:9: '/*' ( . )* '*/'
					{
					match("/*"); 

					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:141:13: ( . )*
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( (LA9_0=='*') ) {
							int LA9_1 = input.LA(2);
							if ( (LA9_1=='/') ) {
								alt9=2;
							}
							else if ( ((LA9_1 >= '\u0000' && LA9_1 <= '.')||(LA9_1 >= '0' && LA9_1 <= '\uFFFF')) ) {
								alt9=1;
							}

						}
						else if ( ((LA9_0 >= '\u0000' && LA9_0 <= ')')||(LA9_0 >= '+' && LA9_0 <= '\uFFFF')) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:141:13: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop9;
						}
					}

					match("*/"); 

					_channel=HIDDEN;
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
	// $ANTLR end "COMMENT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:144:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:144:9: ( ' ' | '\\t' | '\\r' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:152:5: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:152:8: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:152:12: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
			loop11:
			while (true) {
				int alt11=3;
				int LA11_0 = input.LA(1);
				if ( (LA11_0=='\\') ) {
					alt11=1;
				}
				else if ( ((LA11_0 >= '\u0000' && LA11_0 <= '!')||(LA11_0 >= '#' && LA11_0 <= '[')||(LA11_0 >= ']' && LA11_0 <= '\uFFFF')) ) {
					alt11=2;
				}

				switch (alt11) {
				case 1 :
					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:152:14: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:152:24: ~ ( '\\\\' | '\"' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
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
					break loop11;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "CHAR"
	public final void mCHAR() throws RecognitionException {
		try {
			int _type = CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:155:5: ( '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\'' )
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:155:8: '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\''
			{
			match('\''); 
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:155:13: ( ESC_SEQ |~ ( '\\'' | '\\\\' ) )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0=='\\') ) {
				alt12=1;
			}
			else if ( ((LA12_0 >= '\u0000' && LA12_0 <= '&')||(LA12_0 >= '(' && LA12_0 <= '[')||(LA12_0 >= ']' && LA12_0 <= '\uFFFF')) ) {
				alt12=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:155:15: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:155:25: ~ ( '\\'' | '\\\\' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR"

	// $ANTLR start "RELAT_OP"
	public final void mRELAT_OP() throws RecognitionException {
		try {
			int _type = RELAT_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:159:5: ( '=' | '<>' | '<' | '>' | '<=' | '>=' )
			int alt13=6;
			switch ( input.LA(1) ) {
			case '=':
				{
				alt13=1;
				}
				break;
			case '<':
				{
				switch ( input.LA(2) ) {
				case '>':
					{
					alt13=2;
					}
					break;
				case '=':
					{
					alt13=5;
					}
					break;
				default:
					alt13=3;
				}
				}
				break;
			case '>':
				{
				int LA13_3 = input.LA(2);
				if ( (LA13_3=='=') ) {
					alt13=6;
				}

				else {
					alt13=4;
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:159:7: '='
					{
					match('='); 
					}
					break;
				case 2 :
					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:159:11: '<>'
					{
					match("<>"); 

					}
					break;
				case 3 :
					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:159:16: '<'
					{
					match('<'); 
					}
					break;
				case 4 :
					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:159:20: '>'
					{
					match('>'); 
					}
					break;
				case 5 :
					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:159:24: '<='
					{
					match("<="); 

					}
					break;
				case 6 :
					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:159:29: '>='
					{
					match(">="); 

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
	// $ANTLR end "RELAT_OP"

	// $ANTLR start "ATTRIB"
	public final void mATTRIB() throws RecognitionException {
		try {
			int _type = ATTRIB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:163:5: ( ':=' )
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:163:7: ':='
			{
			match(":="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ATTRIB"

	// $ANTLR start "SEMICOLON"
	public final void mSEMICOLON() throws RecognitionException {
		try {
			int _type = SEMICOLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:167:5: ( ';' )
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:167:7: ';'
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
	// $ANTLR end "SEMICOLON"

	// $ANTLR start "ESC_SEQ"
	public final void mESC_SEQ() throws RecognitionException {
		try {
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:173:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:173:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
			{
			match('\\'); 
			if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ESC_SEQ"

	@Override
	public void mTokens() throws RecognitionException {
		// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | VARIABLE | CONST | FLOAT | COMMENT | WS | STRING | CHAR | RELAT_OP | ATTRIB | SEMICOLON )
		int alt14=22;
		alt14 = dfa14.predict(input);
		switch (alt14) {
			case 1 :
				// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:1:10: T__15
				{
				mT__15(); 

				}
				break;
			case 2 :
				// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:1:16: T__16
				{
				mT__16(); 

				}
				break;
			case 3 :
				// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:1:22: T__17
				{
				mT__17(); 

				}
				break;
			case 4 :
				// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:1:28: T__18
				{
				mT__18(); 

				}
				break;
			case 5 :
				// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:1:34: T__19
				{
				mT__19(); 

				}
				break;
			case 6 :
				// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:1:40: T__20
				{
				mT__20(); 

				}
				break;
			case 7 :
				// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:1:46: T__21
				{
				mT__21(); 

				}
				break;
			case 8 :
				// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:1:52: T__22
				{
				mT__22(); 

				}
				break;
			case 9 :
				// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:1:58: T__23
				{
				mT__23(); 

				}
				break;
			case 10 :
				// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:1:64: T__24
				{
				mT__24(); 

				}
				break;
			case 11 :
				// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:1:70: T__25
				{
				mT__25(); 

				}
				break;
			case 12 :
				// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:1:76: T__26
				{
				mT__26(); 

				}
				break;
			case 13 :
				// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:1:82: VARIABLE
				{
				mVARIABLE(); 

				}
				break;
			case 14 :
				// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:1:91: CONST
				{
				mCONST(); 

				}
				break;
			case 15 :
				// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:1:97: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 16 :
				// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:1:103: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 17 :
				// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:1:111: WS
				{
				mWS(); 

				}
				break;
			case 18 :
				// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:1:114: STRING
				{
				mSTRING(); 

				}
				break;
			case 19 :
				// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:1:121: CHAR
				{
				mCHAR(); 

				}
				break;
			case 20 :
				// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:1:126: RELAT_OP
				{
				mRELAT_OP(); 

				}
				break;
			case 21 :
				// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:1:135: ATTRIB
				{
				mATTRIB(); 

				}
				break;
			case 22 :
				// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:1:142: SEMICOLON
				{
				mSEMICOLON(); 

				}
				break;

		}
	}


	protected DFA14 dfa14 = new DFA14(this);
	static final String DFA14_eotS =
		"\6\uffff\1\26\5\14\1\uffff\1\35\11\uffff\1\36\2\14\1\41\2\14\2\uffff\1"+
		"\14\1\45\1\uffff\2\14\1\50\1\uffff\1\51\1\14\2\uffff\1\53\1\uffff";
	static final String DFA14_eofS =
		"\54\uffff";
	static final String DFA14_minS =
		"\1\11\5\uffff\1\52\1\157\1\154\1\146\2\150\1\uffff\1\56\11\uffff\1\101"+
		"\1\163\1\144\1\101\1\145\1\151\2\uffff\1\145\1\101\1\uffff\1\156\1\154"+
		"\1\101\1\uffff\1\101\1\145\2\uffff\1\101\1\uffff";
	static final String DFA14_maxS =
		"\1\172\5\uffff\1\57\1\157\1\156\1\146\2\150\1\uffff\1\71\11\uffff\1\172"+
		"\1\163\1\144\1\172\1\145\1\151\2\uffff\1\145\1\172\1\uffff\1\156\1\154"+
		"\1\172\1\uffff\1\172\1\145\2\uffff\1\172\1\uffff";
	static final String DFA14_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\6\uffff\1\15\1\uffff\1\17\1\21\1\22\1\23"+
		"\1\24\1\25\1\26\1\20\1\6\6\uffff\1\16\1\7\2\uffff\1\12\3\uffff\1\11\2"+
		"\uffff\1\10\1\13\1\uffff\1\14";
	static final String DFA14_specialS =
		"\54\uffff}>";
	static final String[] DFA14_transitionS = {
			"\2\17\2\uffff\1\17\22\uffff\1\17\1\uffff\1\20\4\uffff\1\21\1\1\1\2\1"+
			"\3\1\4\1\uffff\1\5\1\16\1\6\12\15\1\23\1\24\3\22\2\uffff\32\14\6\uffff"+
			"\3\14\1\7\1\10\3\14\1\11\12\14\1\12\2\14\1\13\3\14",
			"",
			"",
			"",
			"",
			"",
			"\1\25\4\uffff\1\25",
			"\1\27",
			"\1\30\1\uffff\1\31",
			"\1\32",
			"\1\33",
			"\1\34",
			"",
			"\1\16\1\uffff\12\15",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\32\14\6\uffff\32\14",
			"\1\37",
			"\1\40",
			"\32\14\6\uffff\32\14",
			"\1\42",
			"\1\43",
			"",
			"",
			"\1\44",
			"\32\14\6\uffff\32\14",
			"",
			"\1\46",
			"\1\47",
			"\32\14\6\uffff\32\14",
			"",
			"\32\14\6\uffff\32\14",
			"\1\52",
			"",
			"",
			"\32\14\6\uffff\32\14",
			""
	};

	static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
	static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
	static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
	static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
	static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
	static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
	static final short[][] DFA14_transition;

	static {
		int numStates = DFA14_transitionS.length;
		DFA14_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
		}
	}

	protected class DFA14 extends DFA {

		public DFA14(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 14;
			this.eot = DFA14_eot;
			this.eof = DFA14_eof;
			this.min = DFA14_min;
			this.max = DFA14_max;
			this.accept = DFA14_accept;
			this.special = DFA14_special;
			this.transition = DFA14_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | VARIABLE | CONST | FLOAT | COMMENT | WS | STRING | CHAR | RELAT_OP | ATTRIB | SEMICOLON );";
		}
	}

}
