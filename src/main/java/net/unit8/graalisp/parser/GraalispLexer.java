// Generated from Graalisp.g4 by ANTLR 4.3

package net.unit8.graalisp.parser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GraalispLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IDENTIFIER=1, PLUS=2, MINUS=3, MULT=4, DIV=5, OP=6, CP=7, STRING=8, NUMBER=9, 
		WHITESPACE=10, DIGIT=11, LETTER=12, LOWER=13, UPPER=14;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'"
	};
	public static final String[] ruleNames = {
		"IDENTIFIER", "PLUS", "MINUS", "MULT", "DIV", "OP", "CP", "STRING", "NUMBER", 
		"WHITESPACE", "DIGIT", "LETTER", "LOWER", "UPPER"
	};


	public GraalispLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Graalisp.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\20X\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\7\2#\n\2\f\2\16\2"+
		"&\13\2\3\2\3\2\3\2\3\2\5\2,\n\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\t\6\t=\n\t\r\t\16\t>\3\t\3\t\3\n\6\nD\n\n\r\n\16"+
		"\nE\3\13\6\13I\n\13\r\13\16\13J\3\13\3\13\3\f\3\f\3\r\3\r\5\rS\n\r\3\16"+
		"\3\16\3\17\3\17\2\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\3\2\3\5\2\13\f\17\17\"\"b\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\3+\3\2\2\2\5-\3\2\2\2\7/\3\2\2\2\t\61\3\2\2\2\13\63\3"+
		"\2\2\2\r\65\3\2\2\2\17\67\3\2\2\2\219\3\2\2\2\23C\3\2\2\2\25H\3\2\2\2"+
		"\27N\3\2\2\2\31R\3\2\2\2\33T\3\2\2\2\35V\3\2\2\2\37$\5\31\r\2 #\5\31\r"+
		"\2!#\5\27\f\2\" \3\2\2\2\"!\3\2\2\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%,\3"+
		"\2\2\2&$\3\2\2\2\',\5\5\3\2(,\5\7\4\2),\5\t\5\2*,\5\13\6\2+\37\3\2\2\2"+
		"+\'\3\2\2\2+(\3\2\2\2+)\3\2\2\2+*\3\2\2\2,\4\3\2\2\2-.\7-\2\2.\6\3\2\2"+
		"\2/\60\7/\2\2\60\b\3\2\2\2\61\62\7,\2\2\62\n\3\2\2\2\63\64\7\61\2\2\64"+
		"\f\3\2\2\2\65\66\7*\2\2\66\16\3\2\2\2\678\7+\2\28\20\3\2\2\29<\7$\2\2"+
		":=\5\31\r\2;=\5\27\f\2<:\3\2\2\2<;\3\2\2\2=>\3\2\2\2><\3\2\2\2>?\3\2\2"+
		"\2?@\3\2\2\2@A\7$\2\2A\22\3\2\2\2BD\5\27\f\2CB\3\2\2\2DE\3\2\2\2EC\3\2"+
		"\2\2EF\3\2\2\2F\24\3\2\2\2GI\t\2\2\2HG\3\2\2\2IJ\3\2\2\2JH\3\2\2\2JK\3"+
		"\2\2\2KL\3\2\2\2LM\b\13\2\2M\26\3\2\2\2NO\4\62;\2O\30\3\2\2\2PS\5\33\16"+
		"\2QS\5\35\17\2RP\3\2\2\2RQ\3\2\2\2S\32\3\2\2\2TU\4c|\2U\34\3\2\2\2VW\4"+
		"C\\\2W\36\3\2\2\2\13\2\"$+<>EJR\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}