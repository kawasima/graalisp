// Generated from Graalisp.g4 by ANTLR 4.3

package net.unit8.graalisp.parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GraalispParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IDENTIFIER=1, PLUS=2, MINUS=3, MULT=4, DIV=5, OP=6, CP=7, STRING=8, NUMBER=9, 
		WHITESPACE=10, DIGIT=11, LETTER=12, LOWER=13, UPPER=14;
	public static final String[] tokenNames = {
		"<INVALID>", "IDENTIFIER", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "STRING", 
		"NUMBER", "WHITESPACE", "DIGIT", "LETTER", "LOWER", "UPPER"
	};
	public static final int
		RULE_program = 0, RULE_expression = 1;
	public static final String[] ruleNames = {
		"program", "expression"
	};

	@Override
	public String getGrammarFileName() { return "Graalisp.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GraalispParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(GraalispParser.EOF, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraalispListener ) ((GraalispListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraalispListener ) ((GraalispListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(7);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP) {
				{
				{
				setState(4); expression();
				}
				}
				setState(9);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(10); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode NUMBER(int i) {
			return getToken(GraalispParser.NUMBER, i);
		}
		public TerminalNode OP() { return getToken(GraalispParser.OP, 0); }
		public TerminalNode STRING(int i) {
			return getToken(GraalispParser.STRING, i);
		}
		public TerminalNode IDENTIFIER(int i) {
			return getToken(GraalispParser.IDENTIFIER, i);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> STRING() { return getTokens(GraalispParser.STRING); }
		public List<TerminalNode> NUMBER() { return getTokens(GraalispParser.NUMBER); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(GraalispParser.IDENTIFIER); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode CP() { return getToken(GraalispParser.CP, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraalispListener ) ((GraalispListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraalispListener ) ((GraalispListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12); match(OP);
			setState(13); match(IDENTIFIER);
			setState(20);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << OP) | (1L << STRING) | (1L << NUMBER))) != 0)) {
				{
				setState(18);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(14); match(IDENTIFIER);
					}
					break;
				case STRING:
					{
					setState(15); match(STRING);
					}
					break;
				case NUMBER:
					{
					setState(16); match(NUMBER);
					}
					break;
				case OP:
					{
					setState(17); expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(22);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(23); match(CP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\20\34\4\2\t\2\4\3"+
		"\t\3\3\2\7\2\b\n\2\f\2\16\2\13\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7"+
		"\3\25\n\3\f\3\16\3\30\13\3\3\3\3\3\3\3\2\2\4\2\4\2\2\36\2\t\3\2\2\2\4"+
		"\16\3\2\2\2\6\b\5\4\3\2\7\6\3\2\2\2\b\13\3\2\2\2\t\7\3\2\2\2\t\n\3\2\2"+
		"\2\n\f\3\2\2\2\13\t\3\2\2\2\f\r\7\2\2\3\r\3\3\2\2\2\16\17\7\b\2\2\17\26"+
		"\7\3\2\2\20\25\7\3\2\2\21\25\7\n\2\2\22\25\7\13\2\2\23\25\5\4\3\2\24\20"+
		"\3\2\2\2\24\21\3\2\2\2\24\22\3\2\2\2\24\23\3\2\2\2\25\30\3\2\2\2\26\24"+
		"\3\2\2\2\26\27\3\2\2\2\27\31\3\2\2\2\30\26\3\2\2\2\31\32\7\t\2\2\32\5"+
		"\3\2\2\2\5\t\24\26";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}