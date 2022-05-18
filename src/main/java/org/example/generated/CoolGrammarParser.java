// Generated from C:/Users/Vladyslav/Desktop/фото дз/3 курс/Компілятори/coolcompiler/src/main/resources\CoolGrammar.g4 by ANTLR 4.10.1
package org.example.generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CoolGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PLUS=1, MINUS=2, MUL=3, DIV=4, EQUALS=5, LPAREN=6, RPAREN=7, LBRACE=8, 
		RBRACE=9, COMMA=10, DOT=11, SEMICOLON=12, COLON=13, LESS=14, LESSOREQUALS=15, 
		ASSIGN=16, CASE_ARROW=17, TILDE=18, ATSYM=19, NOT=20, TRUE=21, FALSE=22, 
		IF=23, FI=24, THEN=25, ELSE=26, CASE=27, ESAC=28, WHILE=29, LOOP=30, POOL=31, 
		CLASS=32, IN=33, INHERITS=34, OF=35, LET=36, NEW=37, ISVOID=38, WS=39, 
		NUM=40, STRING_VALUE=41, COMMENT=42, INT=43, BOOL=44, STRING=45, OBJECT=46, 
		MAIN=47, TYPE=48, ID=49, ERROR=50;
	public static final int
		RULE_program = 0, RULE_type = 1, RULE_value = 2, RULE_attribute_without_semicolon = 3, 
		RULE_attribute = 4, RULE_assigment = 5, RULE_parameters = 6, RULE_method = 7, 
		RULE_conditional = 8, RULE_loop = 9, RULE_block = 10, RULE_let = 11, RULE_case_option = 12, 
		RULE_switch_case = 13, RULE_new = 14, RULE_isvoid = 15, RULE_ariphemitic_operation = 16, 
		RULE_class = 17, RULE_expr = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "type", "value", "attribute_without_semicolon", "attribute", 
			"assigment", "parameters", "method", "conditional", "loop", "block", 
			"let", "case_option", "switch_case", "new", "isvoid", "ariphemitic_operation", 
			"class", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'='", "'('", "')'", "'{'", "'}'", 
			"','", "'.'", "';'", "':'", "'<'", "'<='", "'<-'", "'=>'", "'~'", "'@'", 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "'Int'", 
			"'Bool'", "'String'", "'Object'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PLUS", "MINUS", "MUL", "DIV", "EQUALS", "LPAREN", "RPAREN", "LBRACE", 
			"RBRACE", "COMMA", "DOT", "SEMICOLON", "COLON", "LESS", "LESSOREQUALS", 
			"ASSIGN", "CASE_ARROW", "TILDE", "ATSYM", "NOT", "TRUE", "FALSE", "IF", 
			"FI", "THEN", "ELSE", "CASE", "ESAC", "WHILE", "LOOP", "POOL", "CLASS", 
			"IN", "INHERITS", "OF", "LET", "NEW", "ISVOID", "WS", "NUM", "STRING_VALUE", 
			"COMMENT", "INT", "BOOL", "STRING", "OBJECT", "MAIN", "TYPE", "ID", "ERROR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "CoolGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CoolGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<ClassContext> class_() {
			return getRuleContexts(ClassContext.class);
		}
		public ClassContext class_(int i) {
			return getRuleContext(ClassContext.class,i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(CoolGrammarParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(CoolGrammarParser.COMMENT, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolGrammarListener ) ((CoolGrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolGrammarListener ) ((CoolGrammarListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolGrammarVisitor ) return ((CoolGrammarVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(38);
				class_();
				}
				}
				setState(41); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CLASS );
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(43);
				match(COMMENT);
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(CoolGrammarParser.INT, 0); }
		public TerminalNode STRING() { return getToken(CoolGrammarParser.STRING, 0); }
		public TerminalNode TYPE() { return getToken(CoolGrammarParser.TYPE, 0); }
		public TerminalNode BOOL() { return getToken(CoolGrammarParser.BOOL, 0); }
		public TerminalNode OBJECT() { return getToken(CoolGrammarParser.OBJECT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolGrammarListener ) ((CoolGrammarListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolGrammarListener ) ((CoolGrammarListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolGrammarVisitor ) return ((CoolGrammarVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << STRING) | (1L << OBJECT) | (1L << TYPE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CoolGrammarParser.ID, 0); }
		public TerminalNode COLON() { return getToken(CoolGrammarParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolGrammarListener ) ((CoolGrammarListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolGrammarListener ) ((CoolGrammarListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolGrammarVisitor ) return ((CoolGrammarVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(ID);
			setState(52);
			match(COLON);
			setState(53);
			type();
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

	public static class Attribute_without_semicolonContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CoolGrammarParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Attribute_without_semicolonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_without_semicolon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolGrammarListener ) ((CoolGrammarListener)listener).enterAttribute_without_semicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolGrammarListener ) ((CoolGrammarListener)listener).exitAttribute_without_semicolon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolGrammarVisitor ) return ((CoolGrammarVisitor<? extends T>)visitor).visitAttribute_without_semicolon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribute_without_semicolonContext attribute_without_semicolon() throws RecognitionException {
		Attribute_without_semicolonContext _localctx = new Attribute_without_semicolonContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_attribute_without_semicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			value();
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(56);
				match(ASSIGN);
				setState(57);
				expr(0);
				}
			}

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

	public static class AttributeContext extends ParserRuleContext {
		public Attribute_without_semicolonContext attribute_without_semicolon() {
			return getRuleContext(Attribute_without_semicolonContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CoolGrammarParser.SEMICOLON, 0); }
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolGrammarListener ) ((CoolGrammarListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolGrammarListener ) ((CoolGrammarListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolGrammarVisitor ) return ((CoolGrammarVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			attribute_without_semicolon();
			setState(61);
			match(SEMICOLON);
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

	public static class AssigmentContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(CoolGrammarParser.ASSIGN, 0); }
		public TerminalNode SEMICOLON() { return getToken(CoolGrammarParser.SEMICOLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode ID() { return getToken(CoolGrammarParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NewContext new_() {
			return getRuleContext(NewContext.class,0);
		}
		public AssigmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assigment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolGrammarListener ) ((CoolGrammarListener)listener).enterAssigment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolGrammarListener ) ((CoolGrammarListener)listener).exitAssigment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolGrammarVisitor ) return ((CoolGrammarVisitor<? extends T>)visitor).visitAssigment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssigmentContext assigment() throws RecognitionException {
		AssigmentContext _localctx = new AssigmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assigment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(63);
				value();
				}
				break;
			case 2:
				{
				setState(64);
				match(ID);
				}
				break;
			}
			setState(67);
			match(ASSIGN);
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(68);
				expr(0);
				}
				break;
			case 2:
				{
				setState(69);
				new_();
				}
				break;
			}
			setState(72);
			match(SEMICOLON);
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

	public static class ParametersContext extends ParserRuleContext {
		public List<Attribute_without_semicolonContext> attribute_without_semicolon() {
			return getRuleContexts(Attribute_without_semicolonContext.class);
		}
		public Attribute_without_semicolonContext attribute_without_semicolon(int i) {
			return getRuleContext(Attribute_without_semicolonContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CoolGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoolGrammarParser.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolGrammarListener ) ((CoolGrammarListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolGrammarListener ) ((CoolGrammarListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolGrammarVisitor ) return ((CoolGrammarVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			attribute_without_semicolon();
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(75);
				match(COMMA);
				setState(76);
				attribute_without_semicolon();
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class MethodContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(CoolGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CoolGrammarParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(CoolGrammarParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(CoolGrammarParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CoolGrammarParser.RBRACE, 0); }
		public TerminalNode SEMICOLON() { return getToken(CoolGrammarParser.SEMICOLON, 0); }
		public TerminalNode ID() { return getToken(CoolGrammarParser.ID, 0); }
		public TerminalNode MAIN() { return getToken(CoolGrammarParser.MAIN, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolGrammarListener ) ((CoolGrammarListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolGrammarListener ) ((CoolGrammarListener)listener).exitMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolGrammarVisitor ) return ((CoolGrammarVisitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_la = _input.LA(1);
			if ( !(_la==MAIN || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(83);
			match(LPAREN);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(84);
				parameters();
				}
			}

			setState(87);
			match(RPAREN);
			setState(88);
			match(COLON);
			setState(89);
			type();
			setState(90);
			match(LBRACE);
			{
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << LBRACE) | (1L << TRUE) | (1L << FALSE) | (1L << IF) | (1L << CASE) | (1L << WHILE) | (1L << LET) | (1L << NEW) | (1L << ISVOID) | (1L << NUM) | (1L << STRING_VALUE) | (1L << COMMENT) | (1L << ID) | (1L << ERROR))) != 0)) {
				{
				{
				setState(91);
				expr(0);
				}
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(97);
			match(RBRACE);
			setState(98);
			match(SEMICOLON);
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

	public static class ConditionalContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(CoolGrammarParser.IF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode THEN() { return getToken(CoolGrammarParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(CoolGrammarParser.ELSE, 0); }
		public TerminalNode FI() { return getToken(CoolGrammarParser.FI, 0); }
		public TerminalNode SEMICOLON() { return getToken(CoolGrammarParser.SEMICOLON, 0); }
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolGrammarListener ) ((CoolGrammarListener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolGrammarListener ) ((CoolGrammarListener)listener).exitConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolGrammarVisitor ) return ((CoolGrammarVisitor<? extends T>)visitor).visitConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_conditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(IF);
			setState(101);
			expr(0);
			setState(102);
			match(THEN);
			setState(103);
			expr(0);
			setState(104);
			match(ELSE);
			setState(105);
			expr(0);
			setState(106);
			match(FI);
			setState(107);
			match(SEMICOLON);
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

	public static class LoopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(CoolGrammarParser.WHILE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LOOP() { return getToken(CoolGrammarParser.LOOP, 0); }
		public TerminalNode POOL() { return getToken(CoolGrammarParser.POOL, 0); }
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolGrammarListener ) ((CoolGrammarListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolGrammarListener ) ((CoolGrammarListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolGrammarVisitor ) return ((CoolGrammarVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(WHILE);
			setState(110);
			expr(0);
			setState(111);
			match(LOOP);
			setState(112);
			expr(0);
			setState(113);
			match(POOL);
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(CoolGrammarParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CoolGrammarParser.RBRACE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(CoolGrammarParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CoolGrammarParser.SEMICOLON, i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolGrammarListener ) ((CoolGrammarListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolGrammarListener ) ((CoolGrammarListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolGrammarVisitor ) return ((CoolGrammarVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(LBRACE);
			{
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << LBRACE) | (1L << TRUE) | (1L << FALSE) | (1L << IF) | (1L << CASE) | (1L << WHILE) | (1L << LET) | (1L << NEW) | (1L << ISVOID) | (1L << NUM) | (1L << STRING_VALUE) | (1L << COMMENT) | (1L << ID) | (1L << ERROR))) != 0)) {
				{
				{
				setState(116);
				expr(0);
				setState(117);
				match(SEMICOLON);
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(124);
			match(RBRACE);
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

	public static class LetContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(CoolGrammarParser.LET, 0); }
		public TerminalNode IN() { return getToken(CoolGrammarParser.IN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<ParametersContext> parameters() {
			return getRuleContexts(ParametersContext.class);
		}
		public ParametersContext parameters(int i) {
			return getRuleContext(ParametersContext.class,i);
		}
		public LetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_let; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolGrammarListener ) ((CoolGrammarListener)listener).enterLet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolGrammarListener ) ((CoolGrammarListener)listener).exitLet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolGrammarVisitor ) return ((CoolGrammarVisitor<? extends T>)visitor).visitLet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetContext let() throws RecognitionException {
		LetContext _localctx = new LetContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_let);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(LET);
			setState(128); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(127);
				parameters();
				}
				}
				setState(130); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(132);
			match(IN);
			setState(133);
			expr(0);
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

	public static class Case_optionContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode CASE_ARROW() { return getToken(CoolGrammarParser.CASE_ARROW, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CoolGrammarParser.SEMICOLON, 0); }
		public Case_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolGrammarListener ) ((CoolGrammarListener)listener).enterCase_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolGrammarListener ) ((CoolGrammarListener)listener).exitCase_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolGrammarVisitor ) return ((CoolGrammarVisitor<? extends T>)visitor).visitCase_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_optionContext case_option() throws RecognitionException {
		Case_optionContext _localctx = new Case_optionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_case_option);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			value();
			setState(136);
			match(CASE_ARROW);
			setState(137);
			expr(0);
			setState(138);
			match(SEMICOLON);
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

	public static class Switch_caseContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(CoolGrammarParser.CASE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode OF() { return getToken(CoolGrammarParser.OF, 0); }
		public TerminalNode ESAC() { return getToken(CoolGrammarParser.ESAC, 0); }
		public List<Case_optionContext> case_option() {
			return getRuleContexts(Case_optionContext.class);
		}
		public Case_optionContext case_option(int i) {
			return getRuleContext(Case_optionContext.class,i);
		}
		public Switch_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_case; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolGrammarListener ) ((CoolGrammarListener)listener).enterSwitch_case(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolGrammarListener ) ((CoolGrammarListener)listener).exitSwitch_case(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolGrammarVisitor ) return ((CoolGrammarVisitor<? extends T>)visitor).visitSwitch_case(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_caseContext switch_case() throws RecognitionException {
		Switch_caseContext _localctx = new Switch_caseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_switch_case);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(CASE);
			setState(141);
			expr(0);
			setState(142);
			match(OF);
			setState(144); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(143);
				case_option();
				}
				}
				setState(146); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(148);
			match(ESAC);
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

	public static class NewContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(CoolGrammarParser.NEW, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public NewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolGrammarListener ) ((CoolGrammarListener)listener).enterNew(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolGrammarListener ) ((CoolGrammarListener)listener).exitNew(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolGrammarVisitor ) return ((CoolGrammarVisitor<? extends T>)visitor).visitNew(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewContext new_() throws RecognitionException {
		NewContext _localctx = new NewContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_new);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(NEW);
			setState(151);
			type();
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

	public static class IsvoidContext extends ParserRuleContext {
		public TerminalNode ISVOID() { return getToken(CoolGrammarParser.ISVOID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IsvoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isvoid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolGrammarListener ) ((CoolGrammarListener)listener).enterIsvoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolGrammarListener ) ((CoolGrammarListener)listener).exitIsvoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolGrammarVisitor ) return ((CoolGrammarVisitor<? extends T>)visitor).visitIsvoid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsvoidContext isvoid() throws RecognitionException {
		IsvoidContext _localctx = new IsvoidContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_isvoid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(ISVOID);
			setState(154);
			expr(0);
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

	public static class Ariphemitic_operationContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(CoolGrammarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CoolGrammarParser.MINUS, 0); }
		public TerminalNode DIV() { return getToken(CoolGrammarParser.DIV, 0); }
		public TerminalNode MUL() { return getToken(CoolGrammarParser.MUL, 0); }
		public TerminalNode EQUALS() { return getToken(CoolGrammarParser.EQUALS, 0); }
		public TerminalNode LESS() { return getToken(CoolGrammarParser.LESS, 0); }
		public TerminalNode LESSOREQUALS() { return getToken(CoolGrammarParser.LESSOREQUALS, 0); }
		public Ariphemitic_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ariphemitic_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolGrammarListener ) ((CoolGrammarListener)listener).enterAriphemitic_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolGrammarListener ) ((CoolGrammarListener)listener).exitAriphemitic_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolGrammarVisitor ) return ((CoolGrammarVisitor<? extends T>)visitor).visitAriphemitic_operation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ariphemitic_operationContext ariphemitic_operation() throws RecognitionException {
		Ariphemitic_operationContext _localctx = new Ariphemitic_operationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ariphemitic_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MUL) | (1L << DIV) | (1L << EQUALS) | (1L << LESS) | (1L << LESSOREQUALS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class ClassContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(CoolGrammarParser.CLASS, 0); }
		public TerminalNode LBRACE() { return getToken(CoolGrammarParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CoolGrammarParser.RBRACE, 0); }
		public TerminalNode SEMICOLON() { return getToken(CoolGrammarParser.SEMICOLON, 0); }
		public List<TerminalNode> TYPE() { return getTokens(CoolGrammarParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(CoolGrammarParser.TYPE, i);
		}
		public TerminalNode MAIN() { return getToken(CoolGrammarParser.MAIN, 0); }
		public TerminalNode INHERITS() { return getToken(CoolGrammarParser.INHERITS, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<MethodContext> method() {
			return getRuleContexts(MethodContext.class);
		}
		public MethodContext method(int i) {
			return getRuleContext(MethodContext.class,i);
		}
		public ClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolGrammarListener ) ((CoolGrammarListener)listener).enterClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolGrammarListener ) ((CoolGrammarListener)listener).exitClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolGrammarVisitor ) return ((CoolGrammarVisitor<? extends T>)visitor).visitClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassContext class_() throws RecognitionException {
		ClassContext _localctx = new ClassContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_class);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(CLASS);
			setState(159);
			_la = _input.LA(1);
			if ( !(_la==MAIN || _la==TYPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INHERITS) {
				{
				setState(160);
				match(INHERITS);
				setState(161);
				match(TYPE);
				}
			}

			setState(164);
			match(LBRACE);
			setState(168);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(165);
					attribute();
					}
					} 
				}
				setState(170);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MAIN || _la==ID) {
				{
				{
				setState(171);
				method();
				}
				}
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(177);
			match(RBRACE);
			setState(178);
			match(SEMICOLON);
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

	public static class ExprContext extends ParserRuleContext {
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public AssigmentContext assigment() {
			return getRuleContext(AssigmentContext.class,0);
		}
		public TerminalNode ID() { return getToken(CoolGrammarParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(CoolGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CoolGrammarParser.RPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LetContext let() {
			return getRuleContext(LetContext.class,0);
		}
		public Switch_caseContext switch_case() {
			return getRuleContext(Switch_caseContext.class,0);
		}
		public NewContext new_() {
			return getRuleContext(NewContext.class,0);
		}
		public IsvoidContext isvoid() {
			return getRuleContext(IsvoidContext.class,0);
		}
		public TerminalNode TRUE() { return getToken(CoolGrammarParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CoolGrammarParser.FALSE, 0); }
		public TerminalNode STRING_VALUE() { return getToken(CoolGrammarParser.STRING_VALUE, 0); }
		public TerminalNode NUM() { return getToken(CoolGrammarParser.NUM, 0); }
		public TerminalNode ERROR() { return getToken(CoolGrammarParser.ERROR, 0); }
		public TerminalNode COMMENT() { return getToken(CoolGrammarParser.COMMENT, 0); }
		public Ariphemitic_operationContext ariphemitic_operation() {
			return getRuleContext(Ariphemitic_operationContext.class,0);
		}
		public TerminalNode DOT() { return getToken(CoolGrammarParser.DOT, 0); }
		public TerminalNode ATSYM() { return getToken(CoolGrammarParser.ATSYM, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolGrammarListener ) ((CoolGrammarListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolGrammarListener ) ((CoolGrammarListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolGrammarVisitor ) return ((CoolGrammarVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(181);
				attribute();
				}
				break;
			case 2:
				{
				setState(182);
				assigment();
				}
				break;
			case 3:
				{
				setState(183);
				match(ID);
				setState(184);
				match(LPAREN);
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << LBRACE) | (1L << TRUE) | (1L << FALSE) | (1L << IF) | (1L << CASE) | (1L << WHILE) | (1L << LET) | (1L << NEW) | (1L << ISVOID) | (1L << NUM) | (1L << STRING_VALUE) | (1L << COMMENT) | (1L << ID) | (1L << ERROR))) != 0)) {
					{
					setState(185);
					expr(0);
					}
				}

				setState(188);
				match(RPAREN);
				}
				break;
			case 4:
				{
				setState(189);
				conditional();
				}
				break;
			case 5:
				{
				setState(190);
				loop();
				}
				break;
			case 6:
				{
				setState(191);
				block();
				}
				break;
			case 7:
				{
				setState(192);
				let();
				}
				break;
			case 8:
				{
				setState(193);
				switch_case();
				}
				break;
			case 9:
				{
				setState(194);
				new_();
				}
				break;
			case 10:
				{
				setState(195);
				isvoid();
				}
				break;
			case 11:
				{
				setState(196);
				match(LPAREN);
				setState(197);
				expr(0);
				setState(198);
				match(RPAREN);
				}
				break;
			case 12:
				{
				setState(200);
				match(ID);
				}
				break;
			case 13:
				{
				setState(201);
				match(TRUE);
				}
				break;
			case 14:
				{
				setState(202);
				match(FALSE);
				}
				break;
			case 15:
				{
				setState(203);
				match(STRING_VALUE);
				}
				break;
			case 16:
				{
				setState(204);
				match(NUM);
				}
				break;
			case 17:
				{
				setState(205);
				match(ERROR);
				}
				break;
			case 18:
				{
				setState(206);
				match(COMMENT);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(234);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(232);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(209);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(210);
						ariphemitic_operation();
						setState(211);
						expr(10);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(213);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(214);
						match(DOT);
						setState(215);
						match(ID);
						setState(216);
						match(LPAREN);
						setState(218);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << LBRACE) | (1L << TRUE) | (1L << FALSE) | (1L << IF) | (1L << CASE) | (1L << WHILE) | (1L << LET) | (1L << NEW) | (1L << ISVOID) | (1L << NUM) | (1L << STRING_VALUE) | (1L << COMMENT) | (1L << ID) | (1L << ERROR))) != 0)) {
							{
							setState(217);
							expr(0);
							}
						}

						setState(220);
						match(RPAREN);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(221);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(222);
						match(ATSYM);
						setState(223);
						type();
						setState(224);
						match(DOT);
						setState(225);
						match(ID);
						setState(226);
						match(LPAREN);
						setState(228);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << LBRACE) | (1L << TRUE) | (1L << FALSE) | (1L << IF) | (1L << CASE) | (1L << WHILE) | (1L << LET) | (1L << NEW) | (1L << ISVOID) | (1L << NUM) | (1L << STRING_VALUE) | (1L << COMMENT) | (1L << ID) | (1L << ERROR))) != 0)) {
							{
							setState(227);
							expr(0);
							}
						}

						setState(230);
						match(RPAREN);
						}
						break;
					}
					} 
				}
				setState(236);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 18:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 19);
		case 2:
			return precpred(_ctx, 17);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00012\u00ee\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0001\u0000\u0004\u0000(\b\u0000\u000b\u0000\f\u0000)\u0001\u0000\u0005"+
		"\u0000-\b\u0000\n\u0000\f\u00000\t\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003;\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0003\u0005B\b\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005G\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006N\b\u0006\n\u0006\f\u0006Q\t\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007V\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007]\b\u0007\n\u0007"+
		"\f\u0007`\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0005"+
		"\nx\b\n\n\n\f\n{\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0004\u000b"+
		"\u0081\b\u000b\u000b\u000b\f\u000b\u0082\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0004\r\u0091\b\r\u000b\r\f\r\u0092\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u00a3\b\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00a7\b\u0011\n\u0011"+
		"\f\u0011\u00aa\t\u0011\u0001\u0011\u0005\u0011\u00ad\b\u0011\n\u0011\f"+
		"\u0011\u00b0\t\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00bb"+
		"\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u00d0\b\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u00db\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00e5"+
		"\b\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u00e9\b\u0012\n\u0012\f\u0012"+
		"\u00ec\t\u0012\u0001\u0012\u0000\u0001$\u0013\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$\u0000"+
		"\u0004\u0002\u0000+.00\u0002\u0000//11\u0002\u0000\u0001\u0005\u000e\u000f"+
		"\u0001\u0000/0\u00ff\u0000\'\u0001\u0000\u0000\u0000\u00021\u0001\u0000"+
		"\u0000\u0000\u00043\u0001\u0000\u0000\u0000\u00067\u0001\u0000\u0000\u0000"+
		"\b<\u0001\u0000\u0000\u0000\nA\u0001\u0000\u0000\u0000\fJ\u0001\u0000"+
		"\u0000\u0000\u000eR\u0001\u0000\u0000\u0000\u0010d\u0001\u0000\u0000\u0000"+
		"\u0012m\u0001\u0000\u0000\u0000\u0014s\u0001\u0000\u0000\u0000\u0016~"+
		"\u0001\u0000\u0000\u0000\u0018\u0087\u0001\u0000\u0000\u0000\u001a\u008c"+
		"\u0001\u0000\u0000\u0000\u001c\u0096\u0001\u0000\u0000\u0000\u001e\u0099"+
		"\u0001\u0000\u0000\u0000 \u009c\u0001\u0000\u0000\u0000\"\u009e\u0001"+
		"\u0000\u0000\u0000$\u00cf\u0001\u0000\u0000\u0000&(\u0003\"\u0011\u0000"+
		"\'&\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000"+
		"\u0000)*\u0001\u0000\u0000\u0000*.\u0001\u0000\u0000\u0000+-\u0005*\u0000"+
		"\u0000,+\u0001\u0000\u0000\u0000-0\u0001\u0000\u0000\u0000.,\u0001\u0000"+
		"\u0000\u0000./\u0001\u0000\u0000\u0000/\u0001\u0001\u0000\u0000\u0000"+
		"0.\u0001\u0000\u0000\u000012\u0007\u0000\u0000\u00002\u0003\u0001\u0000"+
		"\u0000\u000034\u00051\u0000\u000045\u0005\r\u0000\u000056\u0003\u0002"+
		"\u0001\u00006\u0005\u0001\u0000\u0000\u00007:\u0003\u0004\u0002\u0000"+
		"89\u0005\u0010\u0000\u00009;\u0003$\u0012\u0000:8\u0001\u0000\u0000\u0000"+
		":;\u0001\u0000\u0000\u0000;\u0007\u0001\u0000\u0000\u0000<=\u0003\u0006"+
		"\u0003\u0000=>\u0005\f\u0000\u0000>\t\u0001\u0000\u0000\u0000?B\u0003"+
		"\u0004\u0002\u0000@B\u00051\u0000\u0000A?\u0001\u0000\u0000\u0000A@\u0001"+
		"\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CF\u0005\u0010\u0000\u0000"+
		"DG\u0003$\u0012\u0000EG\u0003\u001c\u000e\u0000FD\u0001\u0000\u0000\u0000"+
		"FE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HI\u0005\f\u0000\u0000"+
		"I\u000b\u0001\u0000\u0000\u0000JO\u0003\u0006\u0003\u0000KL\u0005\n\u0000"+
		"\u0000LN\u0003\u0006\u0003\u0000MK\u0001\u0000\u0000\u0000NQ\u0001\u0000"+
		"\u0000\u0000OM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000P\r\u0001"+
		"\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000RS\u0007\u0001\u0000\u0000"+
		"SU\u0005\u0006\u0000\u0000TV\u0003\f\u0006\u0000UT\u0001\u0000\u0000\u0000"+
		"UV\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WX\u0005\u0007\u0000"+
		"\u0000XY\u0005\r\u0000\u0000YZ\u0003\u0002\u0001\u0000Z^\u0005\b\u0000"+
		"\u0000[]\u0003$\u0012\u0000\\[\u0001\u0000\u0000\u0000]`\u0001\u0000\u0000"+
		"\u0000^\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_a\u0001\u0000"+
		"\u0000\u0000`^\u0001\u0000\u0000\u0000ab\u0005\t\u0000\u0000bc\u0005\f"+
		"\u0000\u0000c\u000f\u0001\u0000\u0000\u0000de\u0005\u0017\u0000\u0000"+
		"ef\u0003$\u0012\u0000fg\u0005\u0019\u0000\u0000gh\u0003$\u0012\u0000h"+
		"i\u0005\u001a\u0000\u0000ij\u0003$\u0012\u0000jk\u0005\u0018\u0000\u0000"+
		"kl\u0005\f\u0000\u0000l\u0011\u0001\u0000\u0000\u0000mn\u0005\u001d\u0000"+
		"\u0000no\u0003$\u0012\u0000op\u0005\u001e\u0000\u0000pq\u0003$\u0012\u0000"+
		"qr\u0005\u001f\u0000\u0000r\u0013\u0001\u0000\u0000\u0000sy\u0005\b\u0000"+
		"\u0000tu\u0003$\u0012\u0000uv\u0005\f\u0000\u0000vx\u0001\u0000\u0000"+
		"\u0000wt\u0001\u0000\u0000\u0000x{\u0001\u0000\u0000\u0000yw\u0001\u0000"+
		"\u0000\u0000yz\u0001\u0000\u0000\u0000z|\u0001\u0000\u0000\u0000{y\u0001"+
		"\u0000\u0000\u0000|}\u0005\t\u0000\u0000}\u0015\u0001\u0000\u0000\u0000"+
		"~\u0080\u0005$\u0000\u0000\u007f\u0081\u0003\f\u0006\u0000\u0080\u007f"+
		"\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0080"+
		"\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u0001\u0000\u0000\u0000\u0084\u0085\u0005!\u0000\u0000\u0085\u0086\u0003"+
		"$\u0012\u0000\u0086\u0017\u0001\u0000\u0000\u0000\u0087\u0088\u0003\u0004"+
		"\u0002\u0000\u0088\u0089\u0005\u0011\u0000\u0000\u0089\u008a\u0003$\u0012"+
		"\u0000\u008a\u008b\u0005\f\u0000\u0000\u008b\u0019\u0001\u0000\u0000\u0000"+
		"\u008c\u008d\u0005\u001b\u0000\u0000\u008d\u008e\u0003$\u0012\u0000\u008e"+
		"\u0090\u0005#\u0000\u0000\u008f\u0091\u0003\u0018\f\u0000\u0090\u008f"+
		"\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0090"+
		"\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0094"+
		"\u0001\u0000\u0000\u0000\u0094\u0095\u0005\u001c\u0000\u0000\u0095\u001b"+
		"\u0001\u0000\u0000\u0000\u0096\u0097\u0005%\u0000\u0000\u0097\u0098\u0003"+
		"\u0002\u0001\u0000\u0098\u001d\u0001\u0000\u0000\u0000\u0099\u009a\u0005"+
		"&\u0000\u0000\u009a\u009b\u0003$\u0012\u0000\u009b\u001f\u0001\u0000\u0000"+
		"\u0000\u009c\u009d\u0007\u0002\u0000\u0000\u009d!\u0001\u0000\u0000\u0000"+
		"\u009e\u009f\u0005 \u0000\u0000\u009f\u00a2\u0007\u0003\u0000\u0000\u00a0"+
		"\u00a1\u0005\"\u0000\u0000\u00a1\u00a3\u00050\u0000\u0000\u00a2\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a8\u0005\b\u0000\u0000\u00a5\u00a7\u0003"+
		"\b\u0004\u0000\u00a6\u00a5\u0001\u0000\u0000\u0000\u00a7\u00aa\u0001\u0000"+
		"\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000"+
		"\u0000\u0000\u00a9\u00ae\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000"+
		"\u0000\u0000\u00ab\u00ad\u0003\u000e\u0007\u0000\u00ac\u00ab\u0001\u0000"+
		"\u0000\u0000\u00ad\u00b0\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000"+
		"\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005\t\u0000"+
		"\u0000\u00b2\u00b3\u0005\f\u0000\u0000\u00b3#\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b5\u0006\u0012\uffff\uffff\u0000\u00b5\u00d0\u0003\b\u0004\u0000"+
		"\u00b6\u00d0\u0003\n\u0005\u0000\u00b7\u00b8\u00051\u0000\u0000\u00b8"+
		"\u00ba\u0005\u0006\u0000\u0000\u00b9\u00bb\u0003$\u0012\u0000\u00ba\u00b9"+
		"\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00bc"+
		"\u0001\u0000\u0000\u0000\u00bc\u00d0\u0005\u0007\u0000\u0000\u00bd\u00d0"+
		"\u0003\u0010\b\u0000\u00be\u00d0\u0003\u0012\t\u0000\u00bf\u00d0\u0003"+
		"\u0014\n\u0000\u00c0\u00d0\u0003\u0016\u000b\u0000\u00c1\u00d0\u0003\u001a"+
		"\r\u0000\u00c2\u00d0\u0003\u001c\u000e\u0000\u00c3\u00d0\u0003\u001e\u000f"+
		"\u0000\u00c4\u00c5\u0005\u0006\u0000\u0000\u00c5\u00c6\u0003$\u0012\u0000"+
		"\u00c6\u00c7\u0005\u0007\u0000\u0000\u00c7\u00d0\u0001\u0000\u0000\u0000"+
		"\u00c8\u00d0\u00051\u0000\u0000\u00c9\u00d0\u0005\u0015\u0000\u0000\u00ca"+
		"\u00d0\u0005\u0016\u0000\u0000\u00cb\u00d0\u0005)\u0000\u0000\u00cc\u00d0"+
		"\u0005(\u0000\u0000\u00cd\u00d0\u00052\u0000\u0000\u00ce\u00d0\u0005*"+
		"\u0000\u0000\u00cf\u00b4\u0001\u0000\u0000\u0000\u00cf\u00b6\u0001\u0000"+
		"\u0000\u0000\u00cf\u00b7\u0001\u0000\u0000\u0000\u00cf\u00bd\u0001\u0000"+
		"\u0000\u0000\u00cf\u00be\u0001\u0000\u0000\u0000\u00cf\u00bf\u0001\u0000"+
		"\u0000\u0000\u00cf\u00c0\u0001\u0000\u0000\u0000\u00cf\u00c1\u0001\u0000"+
		"\u0000\u0000\u00cf\u00c2\u0001\u0000\u0000\u0000\u00cf\u00c3\u0001\u0000"+
		"\u0000\u0000\u00cf\u00c4\u0001\u0000\u0000\u0000\u00cf\u00c8\u0001\u0000"+
		"\u0000\u0000\u00cf\u00c9\u0001\u0000\u0000\u0000\u00cf\u00ca\u0001\u0000"+
		"\u0000\u0000\u00cf\u00cb\u0001\u0000\u0000\u0000\u00cf\u00cc\u0001\u0000"+
		"\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf\u00ce\u0001\u0000"+
		"\u0000\u0000\u00d0\u00ea\u0001\u0000\u0000\u0000\u00d1\u00d2\n\t\u0000"+
		"\u0000\u00d2\u00d3\u0003 \u0010\u0000\u00d3\u00d4\u0003$\u0012\n\u00d4"+
		"\u00e9\u0001\u0000\u0000\u0000\u00d5\u00d6\n\u0013\u0000\u0000\u00d6\u00d7"+
		"\u0005\u000b\u0000\u0000\u00d7\u00d8\u00051\u0000\u0000\u00d8\u00da\u0005"+
		"\u0006\u0000\u0000\u00d9\u00db\u0003$\u0012\u0000\u00da\u00d9\u0001\u0000"+
		"\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000"+
		"\u0000\u0000\u00dc\u00e9\u0005\u0007\u0000\u0000\u00dd\u00de\n\u0011\u0000"+
		"\u0000\u00de\u00df\u0005\u0013\u0000\u0000\u00df\u00e0\u0003\u0002\u0001"+
		"\u0000\u00e0\u00e1\u0005\u000b\u0000\u0000\u00e1\u00e2\u00051\u0000\u0000"+
		"\u00e2\u00e4\u0005\u0006\u0000\u0000\u00e3\u00e5\u0003$\u0012\u0000\u00e4"+
		"\u00e3\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5"+
		"\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005\u0007\u0000\u0000\u00e7"+
		"\u00e9\u0001\u0000\u0000\u0000\u00e8\u00d1\u0001\u0000\u0000\u0000\u00e8"+
		"\u00d5\u0001\u0000\u0000\u0000\u00e8\u00dd\u0001\u0000\u0000\u0000\u00e9"+
		"\u00ec\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00ea"+
		"\u00eb\u0001\u0000\u0000\u0000\u00eb%\u0001\u0000\u0000\u0000\u00ec\u00ea"+
		"\u0001\u0000\u0000\u0000\u0014).:AFOU^y\u0082\u0092\u00a2\u00a8\u00ae"+
		"\u00ba\u00cf\u00da\u00e4\u00e8\u00ea";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}