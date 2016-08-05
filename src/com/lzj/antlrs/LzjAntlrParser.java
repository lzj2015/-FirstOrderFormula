// Generated from LzjAntlr.g by ANTLR 4.5.3
package com.lzj.antlrs;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LzjAntlrParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, LContent=14, RContent=15, Lower=16, 
		Upper=17, Digit=18, WS=19;
	public static final int
		RULE_program = 0, RULE_tagState = 1, RULE_tag = 2, RULE_key = 3, RULE_exp = 4, 
		RULE_to_op = 5, RULE_term = 6, RULE_or_op = 7, RULE_factor = 8, RULE_and_op = 9, 
		RULE_other = 10, RULE_preState = 11, RULE_logicState = 12, RULE_predicate = 13, 
		RULE_var = 14, RULE_compare_op = 15, RULE_not_op = 16;
	public static final String[] ruleNames = {
		"program", "tagState", "tag", "key", "exp", "to_op", "term", "or_op", 
		"factor", "and_op", "other", "preState", "logicState", "predicate", "var", 
		"compare_op", "not_op"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'$'", "'%'", "'->'", "'||'", "'&&'", "'>'", "'<'", "'='", 
		"'!='", "'>='", "'<='", "'~'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "LContent", "RContent", "Lower", "Upper", "Digit", "WS"
	};
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
	public String getGrammarFileName() { return "LzjAntlr.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LzjAntlrParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<TagStateContext> tagState() {
			return getRuleContexts(TagStateContext.class);
		}
		public TagStateContext tagState(int i) {
			return getRuleContext(TagStateContext.class,i);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LzjAntlrListener ) ((LzjAntlrListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LzjAntlrListener ) ((LzjAntlrListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__12) | (1L << LContent) | (1L << Lower) | (1L << Upper) | (1L << Digit))) != 0)) {
				{
				{
				setState(36);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(34);
					tagState();
					}
					break;
				case 2:
					{
					setState(35);
					exp();
					}
					break;
				}
				setState(38);
				match(T__0);
				}
				}
				setState(44);
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

	public static class TagStateContext extends ParserRuleContext {
		public TagContext tag() {
			return getRuleContext(TagContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode LContent() { return getToken(LzjAntlrParser.LContent, 0); }
		public TerminalNode RContent() { return getToken(LzjAntlrParser.RContent, 0); }
		public TagStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LzjAntlrListener ) ((LzjAntlrListener)listener).enterTagState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LzjAntlrListener ) ((LzjAntlrListener)listener).exitTagState(this);
		}
	}

	public final TagStateContext tagState() throws RecognitionException {
		TagStateContext _localctx = new TagStateContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_tagState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			tag();
			setState(47);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(46);
				match(LContent);
				}
				break;
			}
			setState(49);
			exp();
			setState(51);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(50);
				match(RContent);
				}
				break;
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

	public static class TagContext extends ParserRuleContext {
		public List<KeyContext> key() {
			return getRuleContexts(KeyContext.class);
		}
		public KeyContext key(int i) {
			return getRuleContext(KeyContext.class,i);
		}
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public TagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LzjAntlrListener ) ((LzjAntlrListener)listener).enterTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LzjAntlrListener ) ((LzjAntlrListener)listener).exitTag(this);
		}
	}

	public final TagContext tag() throws RecognitionException {
		TagContext _localctx = new TagContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tag);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(56); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(53);
					key();
					setState(54);
					var();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(58); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class KeyContext extends ParserRuleContext {
		public KeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LzjAntlrListener ) ((LzjAntlrListener)listener).enterKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LzjAntlrListener ) ((LzjAntlrListener)listener).exitKey(this);
		}
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_la = _input.LA(1);
			if ( !(_la==T__1 || _la==T__2) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class ExpContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<To_opContext> to_op() {
			return getRuleContexts(To_opContext.class);
		}
		public To_opContext to_op(int i) {
			return getRuleContext(To_opContext.class,i);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LzjAntlrListener ) ((LzjAntlrListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LzjAntlrListener ) ((LzjAntlrListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_exp);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			term();
			setState(68);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(63);
					to_op();
					setState(64);
					term();
					}
					} 
				}
				setState(70);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class To_opContext extends ParserRuleContext {
		public To_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_to_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LzjAntlrListener ) ((LzjAntlrListener)listener).enterTo_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LzjAntlrListener ) ((LzjAntlrListener)listener).exitTo_op(this);
		}
	}

	public final To_opContext to_op() throws RecognitionException {
		To_opContext _localctx = new To_opContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_to_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(T__3);
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

	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<Or_opContext> or_op() {
			return getRuleContexts(Or_opContext.class);
		}
		public Or_opContext or_op(int i) {
			return getRuleContext(Or_opContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LzjAntlrListener ) ((LzjAntlrListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LzjAntlrListener ) ((LzjAntlrListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_term);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			factor();
			setState(79);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(74);
					or_op();
					setState(75);
					factor();
					}
					} 
				}
				setState(81);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class Or_opContext extends ParserRuleContext {
		public Or_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LzjAntlrListener ) ((LzjAntlrListener)listener).enterOr_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LzjAntlrListener ) ((LzjAntlrListener)listener).exitOr_op(this);
		}
	}

	public final Or_opContext or_op() throws RecognitionException {
		Or_opContext _localctx = new Or_opContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_or_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(T__4);
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

	public static class FactorContext extends ParserRuleContext {
		public List<OtherContext> other() {
			return getRuleContexts(OtherContext.class);
		}
		public OtherContext other(int i) {
			return getRuleContext(OtherContext.class,i);
		}
		public List<And_opContext> and_op() {
			return getRuleContexts(And_opContext.class);
		}
		public And_opContext and_op(int i) {
			return getRuleContext(And_opContext.class,i);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LzjAntlrListener ) ((LzjAntlrListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LzjAntlrListener ) ((LzjAntlrListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_factor);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			other();
			setState(90);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(85);
					and_op();
					setState(86);
					other();
					}
					} 
				}
				setState(92);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class And_opContext extends ParserRuleContext {
		public And_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LzjAntlrListener ) ((LzjAntlrListener)listener).enterAnd_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LzjAntlrListener ) ((LzjAntlrListener)listener).exitAnd_op(this);
		}
	}

	public final And_opContext and_op() throws RecognitionException {
		And_opContext _localctx = new And_opContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_and_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(T__5);
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

	public static class OtherContext extends ParserRuleContext {
		public TagStateContext tagState() {
			return getRuleContext(TagStateContext.class,0);
		}
		public PreStateContext preState() {
			return getRuleContext(PreStateContext.class,0);
		}
		public LogicStateContext logicState() {
			return getRuleContext(LogicStateContext.class,0);
		}
		public TerminalNode LContent() { return getToken(LzjAntlrParser.LContent, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RContent() { return getToken(LzjAntlrParser.RContent, 0); }
		public OtherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_other; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LzjAntlrListener ) ((LzjAntlrListener)listener).enterOther(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LzjAntlrListener ) ((LzjAntlrListener)listener).exitOther(this);
		}
	}

	public final OtherContext other() throws RecognitionException {
		OtherContext _localctx = new OtherContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_other);
		try {
			setState(102);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				tagState();
				}
				break;
			case T__12:
			case Lower:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				preState();
				}
				break;
			case Upper:
			case Digit:
				enterOuterAlt(_localctx, 3);
				{
				setState(97);
				logicState();
				}
				break;
			case LContent:
				enterOuterAlt(_localctx, 4);
				{
				setState(98);
				match(LContent);
				setState(99);
				exp();
				setState(100);
				match(RContent);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class PreStateContext extends ParserRuleContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode LContent() { return getToken(LzjAntlrParser.LContent, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode RContent() { return getToken(LzjAntlrParser.RContent, 0); }
		public Not_opContext not_op() {
			return getRuleContext(Not_opContext.class,0);
		}
		public PreStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LzjAntlrListener ) ((LzjAntlrListener)listener).enterPreState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LzjAntlrListener ) ((LzjAntlrListener)listener).exitPreState(this);
		}
	}

	public final PreStateContext preState() throws RecognitionException {
		PreStateContext _localctx = new PreStateContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_preState);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(104);
				not_op();
				}
			}

			setState(107);
			predicate();
			setState(108);
			match(LContent);
			setState(109);
			var();
			setState(110);
			match(RContent);
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

	public static class LogicStateContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public Compare_opContext compare_op() {
			return getRuleContext(Compare_opContext.class,0);
		}
		public LogicStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LzjAntlrListener ) ((LzjAntlrListener)listener).enterLogicState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LzjAntlrListener ) ((LzjAntlrListener)listener).exitLogicState(this);
		}
	}

	public final LogicStateContext logicState() throws RecognitionException {
		LogicStateContext _localctx = new LogicStateContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_logicState);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			var();
			setState(116);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) {
				{
				setState(113);
				compare_op();
				setState(114);
				var();
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

	public static class PredicateContext extends ParserRuleContext {
		public TerminalNode Lower() { return getToken(LzjAntlrParser.Lower, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LzjAntlrListener ) ((LzjAntlrListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LzjAntlrListener ) ((LzjAntlrListener)listener).exitPredicate(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_predicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(Lower);
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode Upper() { return getToken(LzjAntlrParser.Upper, 0); }
		public TerminalNode Digit() { return getToken(LzjAntlrParser.Digit, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LzjAntlrListener ) ((LzjAntlrListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LzjAntlrListener ) ((LzjAntlrListener)listener).exitVar(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_la = _input.LA(1);
			if ( !(_la==Upper || _la==Digit) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Compare_opContext extends ParserRuleContext {
		public Compare_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LzjAntlrListener ) ((LzjAntlrListener)listener).enterCompare_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LzjAntlrListener ) ((LzjAntlrListener)listener).exitCompare_op(this);
		}
	}

	public final Compare_opContext compare_op() throws RecognitionException {
		Compare_opContext _localctx = new Compare_opContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_compare_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Not_opContext extends ParserRuleContext {
		public Not_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LzjAntlrListener ) ((LzjAntlrListener)listener).enterNot_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LzjAntlrListener ) ((LzjAntlrListener)listener).exitNot_op(this);
		}
	}

	public final Not_opContext not_op() throws RecognitionException {
		Not_opContext _localctx = new Not_opContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_not_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(T__12);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\25\u0081\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\5\2\'\n\2\3\2\3\2\7\2+\n\2\f\2\16\2.\13\2\3\3\3\3\5\3\62\n\3"+
		"\3\3\3\3\5\3\66\n\3\3\4\3\4\3\4\6\4;\n\4\r\4\16\4<\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\7\6E\n\6\f\6\16\6H\13\6\3\7\3\7\3\b\3\b\3\b\3\b\7\bP\n\b\f\b\16\b"+
		"S\13\b\3\t\3\t\3\n\3\n\3\n\3\n\7\n[\n\n\f\n\16\n^\13\n\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\5\fi\n\f\3\r\5\rl\n\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\5\16w\n\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22"+
		"\2\2\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\5\3\2\4\5\3\2\23\24"+
		"\3\2\t\16|\2,\3\2\2\2\4/\3\2\2\2\6:\3\2\2\2\b>\3\2\2\2\n@\3\2\2\2\fI\3"+
		"\2\2\2\16K\3\2\2\2\20T\3\2\2\2\22V\3\2\2\2\24_\3\2\2\2\26h\3\2\2\2\30"+
		"k\3\2\2\2\32r\3\2\2\2\34x\3\2\2\2\36z\3\2\2\2 |\3\2\2\2\"~\3\2\2\2$\'"+
		"\5\4\3\2%\'\5\n\6\2&$\3\2\2\2&%\3\2\2\2\'(\3\2\2\2()\7\3\2\2)+\3\2\2\2"+
		"*&\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\3\3\2\2\2.,\3\2\2\2/\61\5\6"+
		"\4\2\60\62\7\20\2\2\61\60\3\2\2\2\61\62\3\2\2\2\62\63\3\2\2\2\63\65\5"+
		"\n\6\2\64\66\7\21\2\2\65\64\3\2\2\2\65\66\3\2\2\2\66\5\3\2\2\2\678\5\b"+
		"\5\289\5\36\20\29;\3\2\2\2:\67\3\2\2\2;<\3\2\2\2<:\3\2\2\2<=\3\2\2\2="+
		"\7\3\2\2\2>?\t\2\2\2?\t\3\2\2\2@F\5\16\b\2AB\5\f\7\2BC\5\16\b\2CE\3\2"+
		"\2\2DA\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2G\13\3\2\2\2HF\3\2\2\2IJ\7"+
		"\6\2\2J\r\3\2\2\2KQ\5\22\n\2LM\5\20\t\2MN\5\22\n\2NP\3\2\2\2OL\3\2\2\2"+
		"PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\17\3\2\2\2SQ\3\2\2\2TU\7\7\2\2U\21\3\2"+
		"\2\2V\\\5\26\f\2WX\5\24\13\2XY\5\26\f\2Y[\3\2\2\2ZW\3\2\2\2[^\3\2\2\2"+
		"\\Z\3\2\2\2\\]\3\2\2\2]\23\3\2\2\2^\\\3\2\2\2_`\7\b\2\2`\25\3\2\2\2ai"+
		"\5\4\3\2bi\5\30\r\2ci\5\32\16\2de\7\20\2\2ef\5\n\6\2fg\7\21\2\2gi\3\2"+
		"\2\2ha\3\2\2\2hb\3\2\2\2hc\3\2\2\2hd\3\2\2\2i\27\3\2\2\2jl\5\"\22\2kj"+
		"\3\2\2\2kl\3\2\2\2lm\3\2\2\2mn\5\34\17\2no\7\20\2\2op\5\36\20\2pq\7\21"+
		"\2\2q\31\3\2\2\2rv\5\36\20\2st\5 \21\2tu\5\36\20\2uw\3\2\2\2vs\3\2\2\2"+
		"vw\3\2\2\2w\33\3\2\2\2xy\7\22\2\2y\35\3\2\2\2z{\t\3\2\2{\37\3\2\2\2|}"+
		"\t\4\2\2}!\3\2\2\2~\177\7\17\2\2\177#\3\2\2\2\r&,\61\65<FQ\\hkv";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}