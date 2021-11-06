// $ANTLR 3.5.1 E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g 2021-11-06 11:46:22

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class GLCLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int ARITH_OP=4;
	public static final int ATTRIB=5;
	public static final int CHAR=6;
	public static final int COMMENT=7;
	public static final int ESC_SEQ=8;
	public static final int FLOAT=9;
	public static final int ID=10;
	public static final int INT=11;
	public static final int RELAT_OP=12;
	public static final int SEMICOLON=13;
	public static final int STRING=14;
	public static final int WS=15;

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

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
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
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
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
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
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
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
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
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
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
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
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
	// $ANTLR end "T__21"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:22:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:22:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:22:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop1:
			while (true) {
				int alt1=2;
				switch ( input.LA(1) ) {
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
				case '_':
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
					alt1=1;
					}
					break;
				}
				switch (alt1) {
				case 1 :
					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:26:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* | '.' ( '0' .. '9' )+ )
			int alt5=2;
			switch ( input.LA(1) ) {
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
				alt5=1;
				}
				break;
			case '.':
				{
				alt5=2;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:26:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )*
					{
					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:26:9: ( '0' .. '9' )+
					int cnt2=0;
					loop2:
					while (true) {
						int alt2=2;
						switch ( input.LA(1) ) {
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
							alt2=1;
							}
							break;
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

					match('.'); 
					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:26:25: ( '0' .. '9' )*
					loop3:
					while (true) {
						int alt3=2;
						switch ( input.LA(1) ) {
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
							alt3=1;
							}
							break;
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
							break loop3;
						}
					}

					}
					break;
				case 2 :
					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:27:9: '.' ( '0' .. '9' )+
					{
					match('.'); 
					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:27:13: ( '0' .. '9' )+
					int cnt4=0;
					loop4:
					while (true) {
						int alt4=2;
						switch ( input.LA(1) ) {
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
							alt4=1;
							}
							break;
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
							if ( cnt4 >= 1 ) break loop4;
							EarlyExitException eee = new EarlyExitException(4, input);
							throw eee;
						}
						cnt4++;
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
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:31:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			int alt9=2;
			switch ( input.LA(1) ) {
			case '/':
				{
				switch ( input.LA(2) ) {
				case '/':
					{
					alt9=1;
					}
					break;
				case '*':
					{
					alt9=2;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 9, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:31:7: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:31:12: (~ ( '\\n' | '\\r' ) )*
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( ((LA6_0 >= '\u0000' && LA6_0 <= '\t')||(LA6_0 >= '\u000B' && LA6_0 <= '\f')||(LA6_0 >= '\u000E' && LA6_0 <= '\uFFFF')) ) {
							alt6=1;
						}

						switch (alt6) {
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
							break loop6;
						}
					}

					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:31:26: ( '\\r' )?
					int alt7=2;
					switch ( input.LA(1) ) {
						case '\r':
							{
							alt7=1;
							}
							break;
					}
					switch (alt7) {
						case 1 :
							// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:31:26: '\\r'
							{
							match('\r'); 
							}
							break;

					}

					match('\n'); 
					_channel=HIDDEN;
					}
					break;
				case 2 :
					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:32:9: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:32:14: ( options {greedy=false; } : . )*
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( (LA8_0=='*') ) {
							int LA8_1 = input.LA(2);
							if ( (LA8_1=='/') ) {
								alt8=2;
							}
							else if ( ((LA8_1 >= '\u0000' && LA8_1 <= '.')||(LA8_1 >= '0' && LA8_1 <= '\uFFFF')) ) {
								alt8=1;
							}

						}
						else if ( ((LA8_0 >= '\u0000' && LA8_0 <= ')')||(LA8_0 >= '+' && LA8_0 <= '\uFFFF')) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:32:42: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop8;
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
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:35:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:35:9: ( ' ' | '\\t' | '\\r' | '\\n' )
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
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:43:5: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:43:8: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:43:12: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
			loop10:
			while (true) {
				int alt10=3;
				int LA10_0 = input.LA(1);
				if ( (LA10_0=='\\') ) {
					alt10=1;
				}
				else if ( ((LA10_0 >= '\u0000' && LA10_0 <= '!')||(LA10_0 >= '#' && LA10_0 <= '[')||(LA10_0 >= ']' && LA10_0 <= '\uFFFF')) ) {
					alt10=2;
				}

				switch (alt10) {
				case 1 :
					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:43:14: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:43:24: ~ ( '\\\\' | '\"' )
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
					break loop10;
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
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:46:5: ( '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\'' )
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:46:8: '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\''
			{
			match('\''); 
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:46:13: ( ESC_SEQ |~ ( '\\'' | '\\\\' ) )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0=='\\') ) {
				alt11=1;
			}
			else if ( ((LA11_0 >= '\u0000' && LA11_0 <= '&')||(LA11_0 >= '(' && LA11_0 <= '[')||(LA11_0 >= ']' && LA11_0 <= '\uFFFF')) ) {
				alt11=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:46:15: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:46:25: ~ ( '\\'' | '\\\\' )
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

	// $ANTLR start "ARITH_OP"
	public final void mARITH_OP() throws RecognitionException {
		try {
			int _type = ARITH_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:50:5: ( '++' | '+' | '--' | '-' | '*' | '/' )
			int alt12=6;
			switch ( input.LA(1) ) {
			case '+':
				{
				switch ( input.LA(2) ) {
				case '+':
					{
					alt12=1;
					}
					break;
				default:
					alt12=2;
				}
				}
				break;
			case '-':
				{
				switch ( input.LA(2) ) {
				case '-':
					{
					alt12=3;
					}
					break;
				default:
					alt12=4;
				}
				}
				break;
			case '*':
				{
				alt12=5;
				}
				break;
			case '/':
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
					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:50:7: '++'
					{
					match("++"); 

					}
					break;
				case 2 :
					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:50:12: '+'
					{
					match('+'); 
					}
					break;
				case 3 :
					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:50:16: '--'
					{
					match("--"); 

					}
					break;
				case 4 :
					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:50:21: '-'
					{
					match('-'); 
					}
					break;
				case 5 :
					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:50:25: '*'
					{
					match('*'); 
					}
					break;
				case 6 :
					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:50:29: '/'
					{
					match('/'); 
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
	// $ANTLR end "ARITH_OP"

	// $ANTLR start "RELAT_OP"
	public final void mRELAT_OP() throws RecognitionException {
		try {
			int _type = RELAT_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:54:5: ( '<' | '<=' | '==' | '!=' | '>=' | '>' )
			int alt13=6;
			switch ( input.LA(1) ) {
			case '<':
				{
				switch ( input.LA(2) ) {
				case '=':
					{
					alt13=2;
					}
					break;
				default:
					alt13=1;
				}
				}
				break;
			case '=':
				{
				alt13=3;
				}
				break;
			case '!':
				{
				alt13=4;
				}
				break;
			case '>':
				{
				switch ( input.LA(2) ) {
				case '=':
					{
					alt13=5;
					}
					break;
				default:
					alt13=6;
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
					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:54:7: '<'
					{
					match('<'); 
					}
					break;
				case 2 :
					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:54:11: '<='
					{
					match("<="); 

					}
					break;
				case 3 :
					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:54:16: '=='
					{
					match("=="); 

					}
					break;
				case 4 :
					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:54:21: '!='
					{
					match("!="); 

					}
					break;
				case 5 :
					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:54:26: '>='
					{
					match(">="); 

					}
					break;
				case 6 :
					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:54:31: '>'
					{
					match('>'); 
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
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:58:5: ( ':=' )
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:58:7: ':='
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
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:62:5: ( ';' )
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:62:7: ';'
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

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:65:5: ( ( '0' .. '9' )+ )
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:65:7: ( '0' .. '9' )+
			{
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:65:7: ( '0' .. '9' )+
			int cnt14=0;
			loop14:
			while (true) {
				int alt14=2;
				switch ( input.LA(1) ) {
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
					alt14=1;
					}
					break;
				}
				switch (alt14) {
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
					if ( cnt14 >= 1 ) break loop14;
					EarlyExitException eee = new EarlyExitException(14, input);
					throw eee;
				}
				cnt14++;
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

	// $ANTLR start "ESC_SEQ"
	public final void mESC_SEQ() throws RecognitionException {
		try {
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:71:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:71:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
		// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | ID | FLOAT | COMMENT | WS | STRING | CHAR | ARITH_OP | RELAT_OP | ATTRIB | SEMICOLON | INT )
		int alt15=17;
		alt15 = dfa15.predict(input);
		switch (alt15) {
			case 1 :
				// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:1:10: T__16
				{
				mT__16(); 

				}
				break;
			case 2 :
				// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:1:16: T__17
				{
				mT__17(); 

				}
				break;
			case 3 :
				// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:1:22: T__18
				{
				mT__18(); 

				}
				break;
			case 4 :
				// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:1:28: T__19
				{
				mT__19(); 

				}
				break;
			case 5 :
				// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:1:34: T__20
				{
				mT__20(); 

				}
				break;
			case 6 :
				// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:1:40: T__21
				{
				mT__21(); 

				}
				break;
			case 7 :
				// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:1:46: ID
				{
				mID(); 

				}
				break;
			case 8 :
				// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:1:49: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 9 :
				// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:1:55: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 10 :
				// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:1:63: WS
				{
				mWS(); 

				}
				break;
			case 11 :
				// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:1:66: STRING
				{
				mSTRING(); 

				}
				break;
			case 12 :
				// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:1:73: CHAR
				{
				mCHAR(); 

				}
				break;
			case 13 :
				// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:1:78: ARITH_OP
				{
				mARITH_OP(); 

				}
				break;
			case 14 :
				// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:1:87: RELAT_OP
				{
				mRELAT_OP(); 

				}
				break;
			case 15 :
				// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:1:96: ATTRIB
				{
				mATTRIB(); 

				}
				break;
			case 16 :
				// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:1:103: SEMICOLON
				{
				mSEMICOLON(); 

				}
				break;
			case 17 :
				// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:1:113: INT
				{
				mINT(); 

				}
				break;

		}
	}


	protected DFA15 dfa15 = new DFA15(this);
	static final String DFA15_eotS =
		"\4\uffff\1\22\1\23\1\25\1\uffff\1\26\16\uffff";
	static final String DFA15_eofS =
		"\27\uffff";
	static final String DFA15_minS =
		"\1\11\3\uffff\1\53\1\55\1\52\1\uffff\1\56\16\uffff";
	static final String DFA15_maxS =
		"\1\172\3\uffff\1\53\1\55\1\57\1\uffff\1\71\16\uffff";
	static final String DFA15_acceptS =
		"\1\uffff\1\1\1\2\1\3\3\uffff\1\7\1\uffff\1\10\1\12\1\13\1\14\1\16\1\17"+
		"\1\20\1\3\1\15\1\4\1\5\1\11\1\6\1\21";
	static final String DFA15_specialS =
		"\27\uffff}>";
	static final String[] DFA15_transitionS = {
			"\2\12\2\uffff\1\12\22\uffff\1\12\1\15\1\13\4\uffff\1\14\1\1\1\2\1\3\1"+
			"\4\1\uffff\1\5\1\11\1\6\12\10\1\16\1\17\3\15\2\uffff\32\7\4\uffff\1\7"+
			"\1\uffff\32\7",
			"",
			"",
			"",
			"\1\21",
			"\1\21",
			"\1\24\4\uffff\1\24",
			"",
			"\1\11\1\uffff\12\10",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
	static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
	static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
	static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
	static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
	static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
	static final short[][] DFA15_transition;

	static {
		int numStates = DFA15_transitionS.length;
		DFA15_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
		}
	}

	protected class DFA15 extends DFA {

		public DFA15(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 15;
			this.eot = DFA15_eot;
			this.eof = DFA15_eof;
			this.min = DFA15_min;
			this.max = DFA15_max;
			this.accept = DFA15_accept;
			this.special = DFA15_special;
			this.transition = DFA15_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | ID | FLOAT | COMMENT | WS | STRING | CHAR | ARITH_OP | RELAT_OP | ATTRIB | SEMICOLON | INT );";
		}
	}

}
