// $ANTLR 3.5.1 E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g 2021-11-19 21:15:06

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
		"COMMENT", "CONST", "ESC_SEQ", "FLOAT", "RELAT_OP", "SEMICOLON", "STRING", 
		"VARIABLE", "WS", "'('", "')'", "'do'", "'else'", "'end'", "'if'", "'then'", 
		"'while'"
	};
	public static final int EOF=-1;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int ARITH_OP=4;
	public static final int ATTRIB=5;
	public static final int CHAR=6;
	public static final int COMMENT=7;
	public static final int CONST=8;
	public static final int ESC_SEQ=9;
	public static final int FLOAT=10;
	public static final int RELAT_OP=11;
	public static final int SEMICOLON=12;
	public static final int STRING=13;
	public static final int VARIABLE=14;
	public static final int WS=15;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "expr_attrib", "conditional_else", "expr_arith", "conditional", 
		"expr_relat", "prog", "commands", "loop"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false
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
	// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:10:1: prog : ( commands )+ ;
	public final void prog() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "prog");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(10, 0);

		try {
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:10:5: ( ( commands )+ )
			dbg.enterAlt(1);

			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:10:9: ( commands )+
			{
			dbg.location(10,9);
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:10:9: ( commands )+
			int cnt1=0;
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( (LA1_0==SEMICOLON||LA1_0==VARIABLE||LA1_0==21||LA1_0==23) ) {
					alt1=1;
				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:10:9: commands
					{
					dbg.location(10,9);
					pushFollow(FOLLOW_commands_in_prog30);
					commands();
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
		dbg.location(10, 17);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "prog");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "prog"



	// $ANTLR start "commands"
	// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:12:1: commands : ( conditional | loop | expr_attrib | SEMICOLON );
	public final void commands() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "commands");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(12, 0);

		try {
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:13:5: ( conditional | loop | expr_attrib | SEMICOLON )
			int alt2=4;
			try { dbg.enterDecision(2, decisionCanBacktrack[2]);

			switch ( input.LA(1) ) {
			case 21:
				{
				alt2=1;
				}
				break;
			case 23:
				{
				alt2=2;
				}
				break;
			case VARIABLE:
				{
				alt2=3;
				}
				break;
			case SEMICOLON:
				{
				alt2=4;
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

					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:13:7: conditional
					{
					dbg.location(13,7);
					pushFollow(FOLLOW_conditional_in_commands43);
					conditional();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:14:7: loop
					{
					dbg.location(14,7);
					pushFollow(FOLLOW_loop_in_commands51);
					loop();
					state._fsp--;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:15:7: expr_attrib
					{
					dbg.location(15,7);
					pushFollow(FOLLOW_expr_attrib_in_commands59);
					expr_attrib();
					state._fsp--;

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:16:7: SEMICOLON
					{
					dbg.location(16,7);
					match(input,SEMICOLON,FOLLOW_SEMICOLON_in_commands67); 
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
		dbg.location(17, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "commands");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "commands"



	// $ANTLR start "expr_arith"
	// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:19:1: expr_arith : ( VARIABLE ARITH_OP expr_arith | CONST ARITH_OP expr_arith | CONST | VARIABLE | '(' expr_arith ')' );
	public final void expr_arith() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "expr_arith");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(19, 0);

		try {
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:20:5: ( VARIABLE ARITH_OP expr_arith | CONST ARITH_OP expr_arith | CONST | VARIABLE | '(' expr_arith ')' )
			int alt3=5;
			try { dbg.enterDecision(3, decisionCanBacktrack[3]);

			switch ( input.LA(1) ) {
			case VARIABLE:
				{
				int LA3_1 = input.LA(2);
				if ( (LA3_1==ARITH_OP) ) {
					alt3=1;
				}
				else if ( (LA3_1==EOF||(LA3_1 >= RELAT_OP && LA3_1 <= SEMICOLON)||LA3_1==VARIABLE||(LA3_1 >= 17 && LA3_1 <= 23)) ) {
					alt3=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 1, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case CONST:
				{
				int LA3_2 = input.LA(2);
				if ( (LA3_2==ARITH_OP) ) {
					alt3=2;
				}
				else if ( (LA3_2==EOF||(LA3_2 >= RELAT_OP && LA3_2 <= SEMICOLON)||LA3_2==VARIABLE||(LA3_2 >= 17 && LA3_2 <= 23)) ) {
					alt3=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 2, input);
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
				alt3=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(3);}

			switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:20:9: VARIABLE ARITH_OP expr_arith
					{
					dbg.location(20,9);
					match(input,VARIABLE,FOLLOW_VARIABLE_in_expr_arith88); dbg.location(20,18);
					match(input,ARITH_OP,FOLLOW_ARITH_OP_in_expr_arith90); dbg.location(20,27);
					pushFollow(FOLLOW_expr_arith_in_expr_arith92);
					expr_arith();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:21:7: CONST ARITH_OP expr_arith
					{
					dbg.location(21,7);
					match(input,CONST,FOLLOW_CONST_in_expr_arith100); dbg.location(21,13);
					match(input,ARITH_OP,FOLLOW_ARITH_OP_in_expr_arith102); dbg.location(21,22);
					pushFollow(FOLLOW_expr_arith_in_expr_arith104);
					expr_arith();
					state._fsp--;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:22:9: CONST
					{
					dbg.location(22,9);
					match(input,CONST,FOLLOW_CONST_in_expr_arith114); 
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:23:9: VARIABLE
					{
					dbg.location(23,9);
					match(input,VARIABLE,FOLLOW_VARIABLE_in_expr_arith144); 
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:24:9: '(' expr_arith ')'
					{
					dbg.location(24,9);
					match(input,16,FOLLOW_16_in_expr_arith174); dbg.location(24,13);
					pushFollow(FOLLOW_expr_arith_in_expr_arith176);
					expr_arith();
					state._fsp--;
					dbg.location(24,24);
					match(input,17,FOLLOW_17_in_expr_arith178); 
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
		dbg.location(25, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expr_arith");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "expr_arith"



	// $ANTLR start "expr_relat"
	// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:27:1: expr_relat : expr_arith RELAT_OP expr_arith ;
	public final void expr_relat() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "expr_relat");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(27, 0);

		try {
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:28:5: ( expr_arith RELAT_OP expr_arith )
			dbg.enterAlt(1);

			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:28:7: expr_arith RELAT_OP expr_arith
			{
			dbg.location(28,7);
			pushFollow(FOLLOW_expr_arith_in_expr_relat209);
			expr_arith();
			state._fsp--;
			dbg.location(28,18);
			match(input,RELAT_OP,FOLLOW_RELAT_OP_in_expr_relat211); dbg.location(28,27);
			pushFollow(FOLLOW_expr_arith_in_expr_relat213);
			expr_arith();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(29, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expr_relat");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "expr_relat"



	// $ANTLR start "expr_attrib"
	// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:31:1: expr_attrib : VARIABLE ATTRIB expr_arith ;
	public final void expr_attrib() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "expr_attrib");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(31, 0);

		try {
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:32:5: ( VARIABLE ATTRIB expr_arith )
			dbg.enterAlt(1);

			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:32:7: VARIABLE ATTRIB expr_arith
			{
			dbg.location(32,7);
			match(input,VARIABLE,FOLLOW_VARIABLE_in_expr_attrib234); dbg.location(32,16);
			match(input,ATTRIB,FOLLOW_ATTRIB_in_expr_attrib236); dbg.location(32,23);
			pushFollow(FOLLOW_expr_arith_in_expr_attrib238);
			expr_arith();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(33, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expr_attrib");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "expr_attrib"



	// $ANTLR start "conditional"
	// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:35:1: conditional : 'if' expr_relat 'then' ( commands )+ ( conditional_else )? 'end' ;
	public final void conditional() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "conditional");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(35, 0);

		try {
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:36:5: ( 'if' expr_relat 'then' ( commands )+ ( conditional_else )? 'end' )
			dbg.enterAlt(1);

			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:36:7: 'if' expr_relat 'then' ( commands )+ ( conditional_else )? 'end'
			{
			dbg.location(36,7);
			match(input,21,FOLLOW_21_in_conditional255); dbg.location(36,13);
			pushFollow(FOLLOW_expr_relat_in_conditional258);
			expr_relat();
			state._fsp--;
			dbg.location(36,24);
			match(input,22,FOLLOW_22_in_conditional260); dbg.location(36,31);
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:36:31: ( commands )+
			int cnt4=0;
			try { dbg.enterSubRule(4);

			loop4:
			while (true) {
				int alt4=2;
				try { dbg.enterDecision(4, decisionCanBacktrack[4]);

				int LA4_0 = input.LA(1);
				if ( (LA4_0==SEMICOLON||LA4_0==VARIABLE||LA4_0==21||LA4_0==23) ) {
					alt4=1;
				}

				} finally {dbg.exitDecision(4);}

				switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:36:31: commands
					{
					dbg.location(36,31);
					pushFollow(FOLLOW_commands_in_conditional262);
					commands();
					state._fsp--;

					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					dbg.recognitionException(eee);

					throw eee;
				}
				cnt4++;
			}
			} finally {dbg.exitSubRule(4);}
			dbg.location(36,41);
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:36:41: ( conditional_else )?
			int alt5=2;
			try { dbg.enterSubRule(5);
			try { dbg.enterDecision(5, decisionCanBacktrack[5]);

			int LA5_0 = input.LA(1);
			if ( (LA5_0==19) ) {
				alt5=1;
			}
			} finally {dbg.exitDecision(5);}

			switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:36:41: conditional_else
					{
					dbg.location(36,41);
					pushFollow(FOLLOW_conditional_else_in_conditional265);
					conditional_else();
					state._fsp--;

					}
					break;

			}
			} finally {dbg.exitSubRule(5);}
			dbg.location(36,59);
			match(input,20,FOLLOW_20_in_conditional268); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(37, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "conditional");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "conditional"



	// $ANTLR start "conditional_else"
	// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:39:1: conditional_else : 'else' ( commands )+ ;
	public final void conditional_else() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "conditional_else");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(39, 0);

		try {
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:40:5: ( 'else' ( commands )+ )
			dbg.enterAlt(1);

			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:40:7: 'else' ( commands )+
			{
			dbg.location(40,7);
			match(input,19,FOLLOW_19_in_conditional_else285); dbg.location(40,14);
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:40:14: ( commands )+
			int cnt6=0;
			try { dbg.enterSubRule(6);

			loop6:
			while (true) {
				int alt6=2;
				try { dbg.enterDecision(6, decisionCanBacktrack[6]);

				int LA6_0 = input.LA(1);
				if ( (LA6_0==SEMICOLON||LA6_0==VARIABLE||LA6_0==21||LA6_0==23) ) {
					alt6=1;
				}

				} finally {dbg.exitDecision(6);}

				switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:40:14: commands
					{
					dbg.location(40,14);
					pushFollow(FOLLOW_commands_in_conditional_else287);
					commands();
					state._fsp--;

					}
					break;

				default :
					if ( cnt6 >= 1 ) break loop6;
					EarlyExitException eee = new EarlyExitException(6, input);
					dbg.recognitionException(eee);

					throw eee;
				}
				cnt6++;
			}
			} finally {dbg.exitSubRule(6);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(41, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "conditional_else");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "conditional_else"



	// $ANTLR start "loop"
	// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:43:1: loop : 'while' expr_relat 'do' ( commands )+ 'end' ;
	public final void loop() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "loop");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(43, 0);

		try {
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:44:5: ( 'while' expr_relat 'do' ( commands )+ 'end' )
			dbg.enterAlt(1);

			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:44:7: 'while' expr_relat 'do' ( commands )+ 'end'
			{
			dbg.location(44,7);
			match(input,23,FOLLOW_23_in_loop311); dbg.location(44,15);
			pushFollow(FOLLOW_expr_relat_in_loop313);
			expr_relat();
			state._fsp--;
			dbg.location(44,26);
			match(input,18,FOLLOW_18_in_loop315); dbg.location(44,31);
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:44:31: ( commands )+
			int cnt7=0;
			try { dbg.enterSubRule(7);

			loop7:
			while (true) {
				int alt7=2;
				try { dbg.enterDecision(7, decisionCanBacktrack[7]);

				int LA7_0 = input.LA(1);
				if ( (LA7_0==SEMICOLON||LA7_0==VARIABLE||LA7_0==21||LA7_0==23) ) {
					alt7=1;
				}

				} finally {dbg.exitDecision(7);}

				switch (alt7) {
				case 1 :
					dbg.enterAlt(1);

					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:44:31: commands
					{
					dbg.location(44,31);
					pushFollow(FOLLOW_commands_in_loop317);
					commands();
					state._fsp--;

					}
					break;

				default :
					if ( cnt7 >= 1 ) break loop7;
					EarlyExitException eee = new EarlyExitException(7, input);
					dbg.recognitionException(eee);

					throw eee;
				}
				cnt7++;
			}
			} finally {dbg.exitSubRule(7);}
			dbg.location(44,41);
			match(input,20,FOLLOW_20_in_loop320); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(45, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "loop");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "loop"

	// Delegated rules



	public static final BitSet FOLLOW_commands_in_prog30 = new BitSet(new long[]{0x0000000000A05002L});
	public static final BitSet FOLLOW_conditional_in_commands43 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_loop_in_commands51 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_attrib_in_commands59 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMICOLON_in_commands67 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_expr_arith88 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARITH_OP_in_expr_arith90 = new BitSet(new long[]{0x0000000000014100L});
	public static final BitSet FOLLOW_expr_arith_in_expr_arith92 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONST_in_expr_arith100 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARITH_OP_in_expr_arith102 = new BitSet(new long[]{0x0000000000014100L});
	public static final BitSet FOLLOW_expr_arith_in_expr_arith104 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONST_in_expr_arith114 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_expr_arith144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_expr_arith174 = new BitSet(new long[]{0x0000000000014100L});
	public static final BitSet FOLLOW_expr_arith_in_expr_arith176 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_expr_arith178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_arith_in_expr_relat209 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_RELAT_OP_in_expr_relat211 = new BitSet(new long[]{0x0000000000014100L});
	public static final BitSet FOLLOW_expr_arith_in_expr_relat213 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_expr_attrib234 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ATTRIB_in_expr_attrib236 = new BitSet(new long[]{0x0000000000014100L});
	public static final BitSet FOLLOW_expr_arith_in_expr_attrib238 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_conditional255 = new BitSet(new long[]{0x0000000000014100L});
	public static final BitSet FOLLOW_expr_relat_in_conditional258 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_conditional260 = new BitSet(new long[]{0x0000000000A05000L});
	public static final BitSet FOLLOW_commands_in_conditional262 = new BitSet(new long[]{0x0000000000B85000L});
	public static final BitSet FOLLOW_conditional_else_in_conditional265 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_conditional268 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_conditional_else285 = new BitSet(new long[]{0x0000000000A05000L});
	public static final BitSet FOLLOW_commands_in_conditional_else287 = new BitSet(new long[]{0x0000000000A05002L});
	public static final BitSet FOLLOW_23_in_loop311 = new BitSet(new long[]{0x0000000000014100L});
	public static final BitSet FOLLOW_expr_relat_in_loop313 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_loop315 = new BitSet(new long[]{0x0000000000A05000L});
	public static final BitSet FOLLOW_commands_in_loop317 = new BitSet(new long[]{0x0000000000B05000L});
	public static final BitSet FOLLOW_20_in_loop320 = new BitSet(new long[]{0x0000000000000002L});
}
