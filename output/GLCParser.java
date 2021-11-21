// $ANTLR 3.5.1 E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g 2021-11-21 10:45:03

	import java.util.HashMap;
	import java.util.Map;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings("all")
public class GLCParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ATTRIB", "CHAR", "COMMENT", "CONST", 
		"ESC_SEQ", "FLOAT", "RELAT_OP", "SEMICOLON", "STRING", "VARIABLE", "WS", 
		"'('", "')'", "'*'", "'+'", "'-'", "'/'", "'do'", "'else'", "'end'", "'if'", 
		"'then'", "'while'"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "expr_attrib", "conditional_else", "loop", "expr_relat", 
		"prog", "commands", "conditional", "expr_arith"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false, false
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


		Map<String, Double> map = new HashMap<>();
		String variable = "";
		String variable_temp = "";
		boolean validate_condition = true;
		double condition_validator = 0.0;
		String condition_op = "";
		double aux = 0.0;



	// $ANTLR start "prog"
	// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:22:1: prog : ( commands )+ ;
	public final void prog() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "prog");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(22, 0);

		try {
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:22:5: ( ( commands )+ )
			dbg.enterAlt(1);

			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:22:9: ( commands )+
			{
			dbg.location(22,9);
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:22:9: ( commands )+
			int cnt1=0;
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( (LA1_0==SEMICOLON||LA1_0==VARIABLE||LA1_0==24||LA1_0==26) ) {
					alt1=1;
				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:22:9: commands
					{
					dbg.location(22,9);
					pushFollow(FOLLOW_commands_in_prog37);
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
		dbg.location(22, 17);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "prog");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "prog"



	// $ANTLR start "commands"
	// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:24:1: commands : ( conditional | loop | expr_attrib | SEMICOLON );
	public final void commands() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "commands");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(24, 0);

		try {
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:25:5: ( conditional | loop | expr_attrib | SEMICOLON )
			int alt2=4;
			try { dbg.enterDecision(2, decisionCanBacktrack[2]);

			switch ( input.LA(1) ) {
			case 24:
				{
				alt2=1;
				}
				break;
			case 26:
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

					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:25:7: conditional
					{
					dbg.location(25,7);
					pushFollow(FOLLOW_conditional_in_commands50);
					conditional();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:26:7: loop
					{
					dbg.location(26,7);
					pushFollow(FOLLOW_loop_in_commands58);
					loop();
					state._fsp--;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:27:7: expr_attrib
					{
					dbg.location(27,7);
					pushFollow(FOLLOW_expr_attrib_in_commands66);
					expr_attrib();
					state._fsp--;

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:28:7: SEMICOLON
					{
					dbg.location(28,7);
					match(input,SEMICOLON,FOLLOW_SEMICOLON_in_commands74); 
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
		dbg.location(29, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "commands");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "commands"



	// $ANTLR start "conditional"
	// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:31:1: conditional returns [ double v ] : 'if' e= expr_relat 'then' ( commands )+ ( conditional_else )? 'end' ;
	public final double conditional() throws RecognitionException {
		double v = 0.0;


		double e =0.0;

		try { dbg.enterRule(getGrammarFileName(), "conditional");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(31, 0);

		try {
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:32:5: ( 'if' e= expr_relat 'then' ( commands )+ ( conditional_else )? 'end' )
			dbg.enterAlt(1);

			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:32:7: 'if' e= expr_relat 'then' ( commands )+ ( conditional_else )? 'end'
			{
			dbg.location(32,7);
			match(input,24,FOLLOW_24_in_conditional100); dbg.location(32,15);
			pushFollow(FOLLOW_expr_relat_in_conditional107);
			e=expr_relat();
			state._fsp--;
			dbg.location(32,28);
			v = e;dbg.location(32,41);
			match(input,25,FOLLOW_25_in_conditional111); dbg.location(32,48);
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:32:48: ( commands )+
			int cnt3=0;
			try { dbg.enterSubRule(3);

			loop3:
			while (true) {
				int alt3=2;
				try { dbg.enterDecision(3, decisionCanBacktrack[3]);

				int LA3_0 = input.LA(1);
				if ( (LA3_0==SEMICOLON||LA3_0==VARIABLE||LA3_0==24||LA3_0==26) ) {
					alt3=1;
				}

				} finally {dbg.exitDecision(3);}

				switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:32:48: commands
					{
					dbg.location(32,48);
					pushFollow(FOLLOW_commands_in_conditional113);
					commands();
					state._fsp--;

					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					dbg.recognitionException(eee);

					throw eee;
				}
				cnt3++;
			}
			} finally {dbg.exitSubRule(3);}
			dbg.location(32,58);
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:32:58: ( conditional_else )?
			int alt4=2;
			try { dbg.enterSubRule(4);
			try { dbg.enterDecision(4, decisionCanBacktrack[4]);

			int LA4_0 = input.LA(1);
			if ( (LA4_0==22) ) {
				alt4=1;
			}
			} finally {dbg.exitDecision(4);}

			switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:32:58: conditional_else
					{
					dbg.location(32,58);
					pushFollow(FOLLOW_conditional_else_in_conditional116);
					conditional_else();
					state._fsp--;

					}
					break;

			}
			} finally {dbg.exitSubRule(4);}
			dbg.location(32,76);
			match(input,23,FOLLOW_23_in_conditional119); dbg.location(32,82);
			if (v == 1) validate_condition = true;
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
			dbg.exitRule(getGrammarFileName(), "conditional");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return v;
	}
	// $ANTLR end "conditional"



	// $ANTLR start "conditional_else"
	// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:35:1: conditional_else : 'else' ( commands )+ ;
	public final void conditional_else() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "conditional_else");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(35, 0);

		try {
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:36:5: ( 'else' ( commands )+ )
			dbg.enterAlt(1);

			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:36:7: 'else' ( commands )+
			{
			dbg.location(36,7);
			match(input,22,FOLLOW_22_in_conditional_else138); dbg.location(36,14);
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:36:14: ( commands )+
			int cnt5=0;
			try { dbg.enterSubRule(5);

			loop5:
			while (true) {
				int alt5=2;
				try { dbg.enterDecision(5, decisionCanBacktrack[5]);

				int LA5_0 = input.LA(1);
				if ( (LA5_0==SEMICOLON||LA5_0==VARIABLE||LA5_0==24||LA5_0==26) ) {
					alt5=1;
				}

				} finally {dbg.exitDecision(5);}

				switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:36:14: commands
					{
					dbg.location(36,14);
					pushFollow(FOLLOW_commands_in_conditional_else140);
					commands();
					state._fsp--;

					}
					break;

				default :
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					dbg.recognitionException(eee);

					throw eee;
				}
				cnt5++;
			}
			} finally {dbg.exitSubRule(5);}

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
			dbg.exitRule(getGrammarFileName(), "conditional_else");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "conditional_else"



	// $ANTLR start "loop"
	// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:39:1: loop returns [ double v ] : 'while' e= expr_relat 'do' ( commands )+ 'end' ;
	public final double loop() throws RecognitionException {
		double v = 0.0;


		double e =0.0;

		try { dbg.enterRule(getGrammarFileName(), "loop");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(39, 0);

		try {
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:40:5: ( 'while' e= expr_relat 'do' ( commands )+ 'end' )
			dbg.enterAlt(1);

			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:40:7: 'while' e= expr_relat 'do' ( commands )+ 'end'
			{
			dbg.location(40,7);
			match(input,26,FOLLOW_26_in_loop168); dbg.location(40,17);
			pushFollow(FOLLOW_expr_relat_in_loop174);
			e=expr_relat();
			state._fsp--;
			dbg.location(40,30);
			v = e;dbg.location(40,43);
			match(input,21,FOLLOW_21_in_loop178); dbg.location(40,48);
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:40:48: ( commands )+
			int cnt6=0;
			try { dbg.enterSubRule(6);

			loop6:
			while (true) {
				int alt6=2;
				try { dbg.enterDecision(6, decisionCanBacktrack[6]);

				int LA6_0 = input.LA(1);
				if ( (LA6_0==SEMICOLON||LA6_0==VARIABLE||LA6_0==24||LA6_0==26) ) {
					alt6=1;
				}

				} finally {dbg.exitDecision(6);}

				switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:40:48: commands
					{
					dbg.location(40,48);
					pushFollow(FOLLOW_commands_in_loop180);
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
			dbg.location(40,58);
			match(input,23,FOLLOW_23_in_loop183); dbg.location(40,64);
			if (v == 1) validate_condition = true;
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
			dbg.exitRule(getGrammarFileName(), "loop");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return v;
	}
	// $ANTLR end "loop"



	// $ANTLR start "expr_attrib"
	// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:43:1: expr_attrib returns [ double v ] : VARIABLE ATTRIB e= expr_arith ;
	public final double expr_attrib() throws RecognitionException {
		double v = 0.0;


		Token VARIABLE1=null;
		double e =0.0;

		try { dbg.enterRule(getGrammarFileName(), "expr_attrib");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(43, 0);

		try {
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:44:5: ( VARIABLE ATTRIB e= expr_arith )
			dbg.enterAlt(1);

			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:44:7: VARIABLE ATTRIB e= expr_arith
			{
			dbg.location(44,7);
			VARIABLE1=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_expr_attrib210); dbg.location(44,16);
			variable = (VARIABLE1!=null?VARIABLE1.getText():null);dbg.location(44,45);
			match(input,ATTRIB,FOLLOW_ATTRIB_in_expr_attrib214); dbg.location(44,54);
			pushFollow(FOLLOW_expr_arith_in_expr_attrib220);
			e=expr_arith();
			state._fsp--;
			dbg.location(44,67);

			    		v = e;
					if(validate_condition) { 
						System.out.println(variable + " = "  + v); 
						map.put(variable, v);
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
		dbg.location(51, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expr_attrib");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return v;
	}
	// $ANTLR end "expr_attrib"



	// $ANTLR start "expr_arith"
	// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:53:1: expr_arith returns [ double v ] : ( ( CONST | VARIABLE ) ( '*' e= expr_arith | '/' e= expr_arith | '+' e= expr_arith | '-' e= expr_arith )? | '(' e= expr_arith ')' );
	public final double expr_arith() throws RecognitionException {
		double v = 0.0;


		Token CONST2=null;
		Token VARIABLE3=null;
		double e =0.0;

		try { dbg.enterRule(getGrammarFileName(), "expr_arith");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(53, 0);

		try {
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:54:5: ( ( CONST | VARIABLE ) ( '*' e= expr_arith | '/' e= expr_arith | '+' e= expr_arith | '-' e= expr_arith )? | '(' e= expr_arith ')' )
			int alt9=2;
			try { dbg.enterDecision(9, decisionCanBacktrack[9]);

			int LA9_0 = input.LA(1);
			if ( (LA9_0==CONST||LA9_0==VARIABLE) ) {
				alt9=1;
			}
			else if ( (LA9_0==15) ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(9);}

			switch (alt9) {
				case 1 :
					dbg.enterAlt(1);

					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:54:9: ( CONST | VARIABLE ) ( '*' e= expr_arith | '/' e= expr_arith | '+' e= expr_arith | '-' e= expr_arith )?
					{
					dbg.location(54,9);
					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:54:9: ( CONST | VARIABLE )
					int alt7=2;
					try { dbg.enterSubRule(7);
					try { dbg.enterDecision(7, decisionCanBacktrack[7]);

					int LA7_0 = input.LA(1);
					if ( (LA7_0==CONST) ) {
						alt7=1;
					}
					else if ( (LA7_0==VARIABLE) ) {
						alt7=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 7, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(7);}

					switch (alt7) {
						case 1 :
							dbg.enterAlt(1);

							// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:55:10: CONST
							{
							dbg.location(55,10);
							CONST2=(Token)match(input,CONST,FOLLOW_CONST_in_expr_arith260); dbg.location(55,16);
							v = Double.parseDouble((CONST2!=null?CONST2.getText():null));
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:56:9: VARIABLE
							{
							dbg.location(56,9);
							VARIABLE3=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_expr_arith272); dbg.location(56,18);
							 variable_temp = (VARIABLE3!=null?VARIABLE3.getText():null);
							                   	if(map.get(variable_temp) != null) {
										   v = map.get(variable_temp);
									   	} else {
										   System.out.println("ERROR: Variable " + variable_temp + " does not exist.");
									        }
							                    
							}
							break;

					}
					} finally {dbg.exitSubRule(7);}
					dbg.location(64,9);
					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:64:9: ( '*' e= expr_arith | '/' e= expr_arith | '+' e= expr_arith | '-' e= expr_arith )?
					int alt8=5;
					try { dbg.enterSubRule(8);
					try { dbg.enterDecision(8, decisionCanBacktrack[8]);

					switch ( input.LA(1) ) {
						case 17:
							{
							alt8=1;
							}
							break;
						case 20:
							{
							alt8=2;
							}
							break;
						case 18:
							{
							alt8=3;
							}
							break;
						case 19:
							{
							alt8=4;
							}
							break;
					}
					} finally {dbg.exitDecision(8);}

					switch (alt8) {
						case 1 :
							dbg.enterAlt(1);

							// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:66:14: '*' e= expr_arith
							{
							dbg.location(66,14);
							match(input,17,FOLLOW_17_in_expr_arith338); dbg.location(66,20);
							pushFollow(FOLLOW_expr_arith_in_expr_arith344);
							e=expr_arith();
							state._fsp--;
							dbg.location(66,33);

										v *= e;
									    
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:69:8: '/' e= expr_arith
							{
							dbg.location(69,8);
							match(input,20,FOLLOW_20_in_expr_arith355); dbg.location(69,14);
							pushFollow(FOLLOW_expr_arith_in_expr_arith361);
							e=expr_arith();
							state._fsp--;
							dbg.location(69,27);

										if(e == 0) {
											System.out.println("ERROR: Division by 0.");
										} else {
											v /= e;
										}
									    
							}
							break;
						case 3 :
							dbg.enterAlt(3);

							// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:76:8: '+' e= expr_arith
							{
							dbg.location(76,8);
							match(input,18,FOLLOW_18_in_expr_arith372); dbg.location(76,14);
							pushFollow(FOLLOW_expr_arith_in_expr_arith378);
							e=expr_arith();
							state._fsp--;
							dbg.location(76,27);

										v += e;
									    
							}
							break;
						case 4 :
							dbg.enterAlt(4);

							// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:79:8: '-' e= expr_arith
							{
							dbg.location(79,8);
							match(input,19,FOLLOW_19_in_expr_arith389); dbg.location(79,14);
							pushFollow(FOLLOW_expr_arith_in_expr_arith395);
							e=expr_arith();
							state._fsp--;
							dbg.location(79,27);

										v -= e;
									    
							}
							break;

					}
					} finally {dbg.exitSubRule(8);}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:83:8: '(' e= expr_arith ')'
					{
					dbg.location(83,8);
					match(input,15,FOLLOW_15_in_expr_arith410); dbg.location(83,14);
					pushFollow(FOLLOW_expr_arith_in_expr_arith416);
					e=expr_arith();
					state._fsp--;
					dbg.location(83,27);
					v = e;dbg.location(83,40);
					match(input,16,FOLLOW_16_in_expr_arith420); 
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
		dbg.location(84, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expr_arith");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return v;
	}
	// $ANTLR end "expr_arith"



	// $ANTLR start "expr_relat"
	// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:86:1: expr_relat returns [ double v ] : e= expr_arith RELAT_OP e= expr_arith ;
	public final double expr_relat() throws RecognitionException {
		double v = 0.0;


		Token RELAT_OP4=null;
		double e =0.0;

		try { dbg.enterRule(getGrammarFileName(), "expr_relat");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(86, 0);

		try {
			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:87:5: (e= expr_arith RELAT_OP e= expr_arith )
			dbg.enterAlt(1);

			// E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\GLC.g:87:7: e= expr_arith RELAT_OP e= expr_arith
			{
			dbg.location(87,9);
			pushFollow(FOLLOW_expr_arith_in_expr_relat450);
			e=expr_arith();
			state._fsp--;
			dbg.location(87,22);

			 	    condition_validator = e;
			        dbg.location(90,6);
			RELAT_OP4=(Token)match(input,RELAT_OP,FOLLOW_RELAT_OP_in_expr_relat460); dbg.location(90,15);
			condition_op = (RELAT_OP4!=null?RELAT_OP4.getText():null);dbg.location(91,4);
			pushFollow(FOLLOW_expr_arith_in_expr_relat474);
			e=expr_arith();
			state._fsp--;
			dbg.location(91,17);

					aux = e;
					
					if (validate_condition) {
						v = 1.0;
						if(condition_op.equals("=") && condition_validator == aux) {
							validate_condition = true;
						} else if(condition_op.equals("<>") && condition_validator != aux) {
							validate_condition = true;
						} else if(condition_op.equals("<") && condition_validator < aux) {
							validate_condition = true;
						} else if(condition_op.equals(">") && condition_validator > aux) {
							validate_condition = true;
						} else if(condition_op.equals("<=") && condition_validator <= aux) {
							validate_condition = true;
						} else if(condition_op.equals(">=") && condition_validator >= aux) {
							validate_condition = true;
						} else {
							System.out.println("Not a true condition.");
							validate_condition = false;
							v = 0.0;
						}
					} else {
						v = 0.0;
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
		dbg.location(117, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expr_relat");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return v;
	}
	// $ANTLR end "expr_relat"

	// Delegated rules



	public static final BitSet FOLLOW_commands_in_prog37 = new BitSet(new long[]{0x0000000005002802L});
	public static final BitSet FOLLOW_conditional_in_commands50 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_loop_in_commands58 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_attrib_in_commands66 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMICOLON_in_commands74 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_conditional100 = new BitSet(new long[]{0x000000000000A080L});
	public static final BitSet FOLLOW_expr_relat_in_conditional107 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_conditional111 = new BitSet(new long[]{0x0000000005002800L});
	public static final BitSet FOLLOW_commands_in_conditional113 = new BitSet(new long[]{0x0000000005C02800L});
	public static final BitSet FOLLOW_conditional_else_in_conditional116 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_conditional119 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_conditional_else138 = new BitSet(new long[]{0x0000000005002800L});
	public static final BitSet FOLLOW_commands_in_conditional_else140 = new BitSet(new long[]{0x0000000005002802L});
	public static final BitSet FOLLOW_26_in_loop168 = new BitSet(new long[]{0x000000000000A080L});
	public static final BitSet FOLLOW_expr_relat_in_loop174 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_loop178 = new BitSet(new long[]{0x0000000005002800L});
	public static final BitSet FOLLOW_commands_in_loop180 = new BitSet(new long[]{0x0000000005802800L});
	public static final BitSet FOLLOW_23_in_loop183 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_expr_attrib210 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ATTRIB_in_expr_attrib214 = new BitSet(new long[]{0x000000000000A080L});
	public static final BitSet FOLLOW_expr_arith_in_expr_attrib220 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONST_in_expr_arith260 = new BitSet(new long[]{0x00000000001E0002L});
	public static final BitSet FOLLOW_VARIABLE_in_expr_arith272 = new BitSet(new long[]{0x00000000001E0002L});
	public static final BitSet FOLLOW_17_in_expr_arith338 = new BitSet(new long[]{0x000000000000A080L});
	public static final BitSet FOLLOW_expr_arith_in_expr_arith344 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_expr_arith355 = new BitSet(new long[]{0x000000000000A080L});
	public static final BitSet FOLLOW_expr_arith_in_expr_arith361 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_expr_arith372 = new BitSet(new long[]{0x000000000000A080L});
	public static final BitSet FOLLOW_expr_arith_in_expr_arith378 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_expr_arith389 = new BitSet(new long[]{0x000000000000A080L});
	public static final BitSet FOLLOW_expr_arith_in_expr_arith395 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_expr_arith410 = new BitSet(new long[]{0x000000000000A080L});
	public static final BitSet FOLLOW_expr_arith_in_expr_arith416 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_expr_arith420 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_arith_in_expr_relat450 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_RELAT_OP_in_expr_relat460 = new BitSet(new long[]{0x000000000000A080L});
	public static final BitSet FOLLOW_expr_arith_in_expr_relat474 = new BitSet(new long[]{0x0000000000000002L});
}
