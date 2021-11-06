// $ANTLR 3.5.1 E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g 2021-11-06 11:46:22

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings("all")
public class GLCParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARITH_OP", "ATTRIB", "CHAR", 
		"COMMENT", "ESC_SEQ", "FLOAT", "ID", "INT", "RELAT_OP", "SEMICOLON", "STRING", 
		"WS", "'('", "')'", "'*'", "'+'", "'-'", "'/'"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "prog", "stat", "expr"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public GLCParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public GLCParser(TokenStream input, int port, RecognizerSharedState state) {
		super(input, state);
		DebugEventSocketProxy proxy =
			new DebugEventSocketProxy(this, port, null);

		setDebugListener(proxy);
		try {
			proxy.handshake();
		}
		catch (IOException ioe) {
			reportError(ioe);
		}
	}

	public GLCParser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg, new RecognizerSharedState());
	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

	@Override public String[] getTokenNames() { return GLCParser.tokenNames; }
	@Override public String getGrammarFileName() { return "E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g"; }


	String s;



	// $ANTLR start "prog"
	// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:9:1: prog : ( stat )+ ;
	public final void prog() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "prog");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(9, 0);

		try {
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:9:5: ( ( stat )+ )
			dbg.enterAlt(1);

			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:9:9: ( stat )+
			{
			dbg.location(9,9);
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:9:9: ( stat )+
			int cnt1=0;
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				switch ( input.LA(1) ) {
				case ID:
					{
					alt1=1;
					}
					break;
				}
				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:9:9: stat
					{
					dbg.location(9,9);
					pushFollow(FOLLOW_stat_in_prog29);
					stat();
					state._fsp--;

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					dbg.recognitionException(eee);

					throw eee;
				}
				cnt1++;
			}
			} finally {dbg.exitSubRule(1);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(9, 14);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "prog");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "prog"



	// $ANTLR start "stat"
	// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:11:1: stat : ID ATTRIB expr SEMICOLON ;
	public final void stat() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "stat");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(11, 0);

		try {
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:11:6: ( ID ATTRIB expr SEMICOLON )
			dbg.enterAlt(1);

			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:11:8: ID ATTRIB expr SEMICOLON
			{
			dbg.location(11,8);
			match(input,ID,FOLLOW_ID_in_stat40); dbg.location(11,11);
			match(input,ATTRIB,FOLLOW_ATTRIB_in_stat42); dbg.location(11,18);
			pushFollow(FOLLOW_expr_in_stat44);
			expr();
			state._fsp--;
			dbg.location(11,23);
			match(input,SEMICOLON,FOLLOW_SEMICOLON_in_stat46); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(12, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "stat");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "stat"



	// $ANTLR start "expr"
	// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:14:1: expr : ( ID ( '*' | '/' | '+' | '-' ) expr | INT ( '*' | '/' | '+' | '-' ) expr | INT | ID | '(' expr ')' );
	public final void expr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "expr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(14, 0);

		try {
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:15:5: ( ID ( '*' | '/' | '+' | '-' ) expr | INT ( '*' | '/' | '+' | '-' ) expr | INT | ID | '(' expr ')' )
			int alt2=5;
			try { dbg.enterDecision(2, decisionCanBacktrack[2]);

			switch ( input.LA(1) ) {
			case ID:
				{
				switch ( input.LA(2) ) {
				case 18:
				case 19:
				case 20:
				case 21:
					{
					alt2=1;
					}
					break;
				case SEMICOLON:
				case 17:
					{
					alt2=4;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 1, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case INT:
				{
				switch ( input.LA(2) ) {
				case 18:
				case 19:
				case 20:
				case 21:
					{
					alt2=2;
					}
					break;
				case SEMICOLON:
				case 17:
					{
					alt2=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 2, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 16:
				{
				alt2=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(2);}

			switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:15:9: ID ( '*' | '/' | '+' | '-' ) expr
					{
					dbg.location(15,9);
					match(input,ID,FOLLOW_ID_in_expr63); dbg.location(15,12);
					if ( (input.LA(1) >= 18 && input.LA(1) <= 21) ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}dbg.location(15,30);
					pushFollow(FOLLOW_expr_in_expr75);
					expr();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:16:7: INT ( '*' | '/' | '+' | '-' ) expr
					{
					dbg.location(16,7);
					match(input,INT,FOLLOW_INT_in_expr83); dbg.location(16,11);
					if ( (input.LA(1) >= 18 && input.LA(1) <= 21) ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}dbg.location(16,29);
					pushFollow(FOLLOW_expr_in_expr95);
					expr();
					state._fsp--;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:17:9: INT
					{
					dbg.location(17,9);
					match(input,INT,FOLLOW_INT_in_expr105); 
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:18:9: ID
					{
					dbg.location(18,9);
					match(input,ID,FOLLOW_ID_in_expr135); 
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:19:9: '(' expr ')'
					{
					dbg.location(19,9);
					match(input,16,FOLLOW_16_in_expr165); dbg.location(19,13);
					pushFollow(FOLLOW_expr_in_expr167);
					expr();
					state._fsp--;
					dbg.location(19,18);
					match(input,17,FOLLOW_17_in_expr169); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(20, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "expr"

	// Delegated rules



	public static final BitSet FOLLOW_stat_in_prog29 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_ID_in_stat40 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ATTRIB_in_stat42 = new BitSet(new long[]{0x0000000000010C00L});
	public static final BitSet FOLLOW_expr_in_stat44 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_SEMICOLON_in_stat46 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_expr63 = new BitSet(new long[]{0x00000000003C0000L});
	public static final BitSet FOLLOW_set_in_expr65 = new BitSet(new long[]{0x0000000000010C00L});
	public static final BitSet FOLLOW_expr_in_expr75 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_expr83 = new BitSet(new long[]{0x00000000003C0000L});
	public static final BitSet FOLLOW_set_in_expr85 = new BitSet(new long[]{0x0000000000010C00L});
	public static final BitSet FOLLOW_expr_in_expr95 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_expr105 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_expr135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_expr165 = new BitSet(new long[]{0x0000000000010C00L});
	public static final BitSet FOLLOW_expr_in_expr167 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_expr169 = new BitSet(new long[]{0x0000000000000002L});
}
