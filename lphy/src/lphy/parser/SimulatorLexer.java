// Generated from /Users/alexeidrummond/Git/graphicalModelSimulation/lphy/src/lphy/parser/Simulator.g4 by ANTLR 4.8
package lphy.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimulatorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, NAME=34, ARROW=35, LENGTH=36, DIM=37, DECIMAL_LITERAL=38, 
		HEX_LITERAL=39, OCT_LITERAL=40, BINARY_LITERAL=41, FLOAT_LITERAL=42, HEX_FLOAT_LITERAL=43, 
		STRING_LITERAL=44, TILDE=45, WS=46, COMMENT=47, LINE_COMMENT=48;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"NAME", "ARROW", "LENGTH", "DIM", "DECIMAL_LITERAL", "HEX_LITERAL", "OCT_LITERAL", 
			"BINARY_LITERAL", "FLOAT_LITERAL", "HEX_FLOAT_LITERAL", "STRING_LITERAL", 
			"TILDE", "WS", "COMMENT", "LINE_COMMENT", "ExponentPart", "EscapeSequence", 
			"HexDigits", "HexDigit", "Digits", "LetterOrDigit", "Letter"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "';'", "'for'", "'('", "'in'", "')'", "'='", "'['", 
			"']'", "','", "'-'", "'true'", "'false'", "'++'", "'--'", "'+'", "'**'", 
			"'*'", "'/'", "'%'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'&'", 
			"'^'", "'|'", "'&&'", "'||'", "':'", null, "'<-'", "'length'", "'dim'", 
			null, null, null, null, null, null, null, "'~'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "NAME", "ARROW", 
			"LENGTH", "DIM", "DECIMAL_LITERAL", "HEX_LITERAL", "OCT_LITERAL", "BINARY_LITERAL", 
			"FLOAT_LITERAL", "HEX_FLOAT_LITERAL", "STRING_LITERAL", "TILDE", "WS", 
			"COMMENT", "LINE_COMMENT"
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


	public SimulatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Simulator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\62\u01b7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\3\3\3\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3"+
		"\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3"+
		"\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3"+
		"!\3\"\3\"\3#\3#\7#\u00c9\n#\f#\16#\u00cc\13#\3$\3$\3$\3%\3%\3%\3%\3%\3"+
		"%\3%\3&\3&\3&\3&\3\'\3\'\3\'\5\'\u00df\n\'\3\'\6\'\u00e2\n\'\r\'\16\'"+
		"\u00e3\3\'\5\'\u00e7\n\'\5\'\u00e9\n\'\3\'\5\'\u00ec\n\'\3(\3(\3(\3(\7"+
		"(\u00f2\n(\f(\16(\u00f5\13(\3(\5(\u00f8\n(\3(\5(\u00fb\n(\3)\3)\7)\u00ff"+
		"\n)\f)\16)\u0102\13)\3)\3)\7)\u0106\n)\f)\16)\u0109\13)\3)\5)\u010c\n"+
		")\3)\5)\u010f\n)\3*\3*\3*\3*\7*\u0115\n*\f*\16*\u0118\13*\3*\5*\u011b"+
		"\n*\3*\5*\u011e\n*\3+\3+\3+\5+\u0123\n+\3+\3+\5+\u0127\n+\3+\5+\u012a"+
		"\n+\3+\5+\u012d\n+\3+\3+\3+\5+\u0132\n+\3+\5+\u0135\n+\5+\u0137\n+\3,"+
		"\3,\3,\3,\5,\u013d\n,\3,\5,\u0140\n,\3,\3,\5,\u0144\n,\3,\3,\5,\u0148"+
		"\n,\3,\3,\5,\u014c\n,\3-\3-\7-\u0150\n-\f-\16-\u0153\13-\3-\3-\3.\3.\3"+
		"/\6/\u015a\n/\r/\16/\u015b\3/\3/\3\60\3\60\3\60\3\60\7\60\u0164\n\60\f"+
		"\60\16\60\u0167\13\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\7\61"+
		"\u0172\n\61\f\61\16\61\u0175\13\61\3\61\3\61\3\62\3\62\5\62\u017b\n\62"+
		"\3\62\3\62\3\63\3\63\3\63\3\63\5\63\u0183\n\63\3\63\5\63\u0186\n\63\3"+
		"\63\3\63\3\63\6\63\u018b\n\63\r\63\16\63\u018c\3\63\3\63\3\63\3\63\3\63"+
		"\5\63\u0194\n\63\3\64\3\64\3\64\7\64\u0199\n\64\f\64\16\64\u019c\13\64"+
		"\3\64\5\64\u019f\n\64\3\65\3\65\3\66\3\66\7\66\u01a5\n\66\f\66\16\66\u01a8"+
		"\13\66\3\66\5\66\u01ab\n\66\3\67\3\67\5\67\u01af\n\67\38\38\38\38\38\5"+
		"8\u01b6\n8\4\u0151\u0165\29\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a"+
		"\62c\2e\2g\2i\2k\2m\2o\2\3\2\33\3\2\63;\4\2NNnn\4\2ZZzz\5\2\62;CHch\6"+
		"\2\62;CHaach\3\2\629\4\2\629aa\4\2DDdd\3\2\62\63\4\2\62\63aa\6\2FFHHf"+
		"fhh\4\2RRrr\4\2--//\5\2\13\f\16\17\"\"\4\2\f\f\17\17\4\2GGgg\n\2$$))^"+
		"^ddhhppttvv\3\2\62\65\3\2\62;\4\2\62;aa\6\2&&C\\aac|\4\2\2\u0081\ud802"+
		"\udc01\3\2\ud802\udc01\3\2\udc02\ue001\3\2\u0372\u0401\2\u01de\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3"+
		"\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2"+
		"\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\3"+
		"q\3\2\2\2\5s\3\2\2\2\7u\3\2\2\2\tw\3\2\2\2\13{\3\2\2\2\r}\3\2\2\2\17\u0080"+
		"\3\2\2\2\21\u0082\3\2\2\2\23\u0084\3\2\2\2\25\u0086\3\2\2\2\27\u0088\3"+
		"\2\2\2\31\u008a\3\2\2\2\33\u008c\3\2\2\2\35\u0091\3\2\2\2\37\u0097\3\2"+
		"\2\2!\u009a\3\2\2\2#\u009d\3\2\2\2%\u009f\3\2\2\2\'\u00a2\3\2\2\2)\u00a4"+
		"\3\2\2\2+\u00a6\3\2\2\2-\u00a8\3\2\2\2/\u00aa\3\2\2\2\61\u00ac\3\2\2\2"+
		"\63\u00af\3\2\2\2\65\u00b2\3\2\2\2\67\u00b5\3\2\2\29\u00b8\3\2\2\2;\u00ba"+
		"\3\2\2\2=\u00bc\3\2\2\2?\u00be\3\2\2\2A\u00c1\3\2\2\2C\u00c4\3\2\2\2E"+
		"\u00c6\3\2\2\2G\u00cd\3\2\2\2I\u00d0\3\2\2\2K\u00d7\3\2\2\2M\u00e8\3\2"+
		"\2\2O\u00ed\3\2\2\2Q\u00fc\3\2\2\2S\u0110\3\2\2\2U\u0136\3\2\2\2W\u0138"+
		"\3\2\2\2Y\u014d\3\2\2\2[\u0156\3\2\2\2]\u0159\3\2\2\2_\u015f\3\2\2\2a"+
		"\u016d\3\2\2\2c\u0178\3\2\2\2e\u0193\3\2\2\2g\u0195\3\2\2\2i\u01a0\3\2"+
		"\2\2k\u01a2\3\2\2\2m\u01ae\3\2\2\2o\u01b5\3\2\2\2qr\7}\2\2r\4\3\2\2\2"+
		"st\7\177\2\2t\6\3\2\2\2uv\7=\2\2v\b\3\2\2\2wx\7h\2\2xy\7q\2\2yz\7t\2\2"+
		"z\n\3\2\2\2{|\7*\2\2|\f\3\2\2\2}~\7k\2\2~\177\7p\2\2\177\16\3\2\2\2\u0080"+
		"\u0081\7+\2\2\u0081\20\3\2\2\2\u0082\u0083\7?\2\2\u0083\22\3\2\2\2\u0084"+
		"\u0085\7]\2\2\u0085\24\3\2\2\2\u0086\u0087\7_\2\2\u0087\26\3\2\2\2\u0088"+
		"\u0089\7.\2\2\u0089\30\3\2\2\2\u008a\u008b\7/\2\2\u008b\32\3\2\2\2\u008c"+
		"\u008d\7v\2\2\u008d\u008e\7t\2\2\u008e\u008f\7w\2\2\u008f\u0090\7g\2\2"+
		"\u0090\34\3\2\2\2\u0091\u0092\7h\2\2\u0092\u0093\7c\2\2\u0093\u0094\7"+
		"n\2\2\u0094\u0095\7u\2\2\u0095\u0096\7g\2\2\u0096\36\3\2\2\2\u0097\u0098"+
		"\7-\2\2\u0098\u0099\7-\2\2\u0099 \3\2\2\2\u009a\u009b\7/\2\2\u009b\u009c"+
		"\7/\2\2\u009c\"\3\2\2\2\u009d\u009e\7-\2\2\u009e$\3\2\2\2\u009f\u00a0"+
		"\7,\2\2\u00a0\u00a1\7,\2\2\u00a1&\3\2\2\2\u00a2\u00a3\7,\2\2\u00a3(\3"+
		"\2\2\2\u00a4\u00a5\7\61\2\2\u00a5*\3\2\2\2\u00a6\u00a7\7\'\2\2\u00a7,"+
		"\3\2\2\2\u00a8\u00a9\7>\2\2\u00a9.\3\2\2\2\u00aa\u00ab\7@\2\2\u00ab\60"+
		"\3\2\2\2\u00ac\u00ad\7>\2\2\u00ad\u00ae\7?\2\2\u00ae\62\3\2\2\2\u00af"+
		"\u00b0\7@\2\2\u00b0\u00b1\7?\2\2\u00b1\64\3\2\2\2\u00b2\u00b3\7?\2\2\u00b3"+
		"\u00b4\7?\2\2\u00b4\66\3\2\2\2\u00b5\u00b6\7#\2\2\u00b6\u00b7\7?\2\2\u00b7"+
		"8\3\2\2\2\u00b8\u00b9\7(\2\2\u00b9:\3\2\2\2\u00ba\u00bb\7`\2\2\u00bb<"+
		"\3\2\2\2\u00bc\u00bd\7~\2\2\u00bd>\3\2\2\2\u00be\u00bf\7(\2\2\u00bf\u00c0"+
		"\7(\2\2\u00c0@\3\2\2\2\u00c1\u00c2\7~\2\2\u00c2\u00c3\7~\2\2\u00c3B\3"+
		"\2\2\2\u00c4\u00c5\7<\2\2\u00c5D\3\2\2\2\u00c6\u00ca\5o8\2\u00c7\u00c9"+
		"\5m\67\2\u00c8\u00c7\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cbF\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\7>\2\2\u00ce"+
		"\u00cf\7/\2\2\u00cfH\3\2\2\2\u00d0\u00d1\7n\2\2\u00d1\u00d2\7g\2\2\u00d2"+
		"\u00d3\7p\2\2\u00d3\u00d4\7i\2\2\u00d4\u00d5\7v\2\2\u00d5\u00d6\7j\2\2"+
		"\u00d6J\3\2\2\2\u00d7\u00d8\7f\2\2\u00d8\u00d9\7k\2\2\u00d9\u00da\7o\2"+
		"\2\u00daL\3\2\2\2\u00db\u00e9\7\62\2\2\u00dc\u00e6\t\2\2\2\u00dd\u00df"+
		"\5k\66\2\u00de\u00dd\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e7\3\2\2\2\u00e0"+
		"\u00e2\7a\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e1\3\2"+
		"\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\5k\66\2\u00e6"+
		"\u00de\3\2\2\2\u00e6\u00e1\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00db\3\2"+
		"\2\2\u00e8\u00dc\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00ec\t\3\2\2\u00eb"+
		"\u00ea\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ecN\3\2\2\2\u00ed\u00ee\7\62\2\2"+
		"\u00ee\u00ef\t\4\2\2\u00ef\u00f7\t\5\2\2\u00f0\u00f2\t\6\2\2\u00f1\u00f0"+
		"\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"\u00f6\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f8\t\5\2\2\u00f7\u00f3\3\2"+
		"\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00fb\t\3\2\2\u00fa"+
		"\u00f9\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fbP\3\2\2\2\u00fc\u0100\7\62\2\2"+
		"\u00fd\u00ff\7a\2\2\u00fe\u00fd\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe"+
		"\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103\3\2\2\2\u0102\u0100\3\2\2\2\u0103"+
		"\u010b\t\7\2\2\u0104\u0106\t\b\2\2\u0105\u0104\3\2\2\2\u0106\u0109\3\2"+
		"\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010a\3\2\2\2\u0109"+
		"\u0107\3\2\2\2\u010a\u010c\t\7\2\2\u010b\u0107\3\2\2\2\u010b\u010c\3\2"+
		"\2\2\u010c\u010e\3\2\2\2\u010d\u010f\t\3\2\2\u010e\u010d\3\2\2\2\u010e"+
		"\u010f\3\2\2\2\u010fR\3\2\2\2\u0110\u0111\7\62\2\2\u0111\u0112\t\t\2\2"+
		"\u0112\u011a\t\n\2\2\u0113\u0115\t\13\2\2\u0114\u0113\3\2\2\2\u0115\u0118"+
		"\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0119\3\2\2\2\u0118"+
		"\u0116\3\2\2\2\u0119\u011b\t\n\2\2\u011a\u0116\3\2\2\2\u011a\u011b\3\2"+
		"\2\2\u011b\u011d\3\2\2\2\u011c\u011e\t\3\2\2\u011d\u011c\3\2\2\2\u011d"+
		"\u011e\3\2\2\2\u011eT\3\2\2\2\u011f\u0120\5k\66\2\u0120\u0122\7\60\2\2"+
		"\u0121\u0123\5k\66\2\u0122\u0121\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0127"+
		"\3\2\2\2\u0124\u0125\7\60\2\2\u0125\u0127\5k\66\2\u0126\u011f\3\2\2\2"+
		"\u0126\u0124\3\2\2\2\u0127\u0129\3\2\2\2\u0128\u012a\5c\62\2\u0129\u0128"+
		"\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012c\3\2\2\2\u012b\u012d\t\f\2\2\u012c"+
		"\u012b\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u0137\3\2\2\2\u012e\u0134\5k"+
		"\66\2\u012f\u0131\5c\62\2\u0130\u0132\t\f\2\2\u0131\u0130\3\2\2\2\u0131"+
		"\u0132\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0135\t\f\2\2\u0134\u012f\3\2"+
		"\2\2\u0134\u0133\3\2\2\2\u0135\u0137\3\2\2\2\u0136\u0126\3\2\2\2\u0136"+
		"\u012e\3\2\2\2\u0137V\3\2\2\2\u0138\u0139\7\62\2\2\u0139\u0143\t\4\2\2"+
		"\u013a\u013c\5g\64\2\u013b\u013d\7\60\2\2\u013c\u013b\3\2\2\2\u013c\u013d"+
		"\3\2\2\2\u013d\u0144\3\2\2\2\u013e\u0140\5g\64\2\u013f\u013e\3\2\2\2\u013f"+
		"\u0140\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0142\7\60\2\2\u0142\u0144\5"+
		"g\64\2\u0143\u013a\3\2\2\2\u0143\u013f\3\2\2\2\u0144\u0145\3\2\2\2\u0145"+
		"\u0147\t\r\2\2\u0146\u0148\t\16\2\2\u0147\u0146\3\2\2\2\u0147\u0148\3"+
		"\2\2\2\u0148\u0149\3\2\2\2\u0149\u014b\5k\66\2\u014a\u014c\t\f\2\2\u014b"+
		"\u014a\3\2\2\2\u014b\u014c\3\2\2\2\u014cX\3\2\2\2\u014d\u0151\7$\2\2\u014e"+
		"\u0150\13\2\2\2\u014f\u014e\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u0152\3"+
		"\2\2\2\u0151\u014f\3\2\2\2\u0152\u0154\3\2\2\2\u0153\u0151\3\2\2\2\u0154"+
		"\u0155\7$\2\2\u0155Z\3\2\2\2\u0156\u0157\7\u0080\2\2\u0157\\\3\2\2\2\u0158"+
		"\u015a\t\17\2\2\u0159\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u0159\3"+
		"\2\2\2\u015b\u015c\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015e\b/\2\2\u015e"+
		"^\3\2\2\2\u015f\u0160\7\61\2\2\u0160\u0161\7,\2\2\u0161\u0165\3\2\2\2"+
		"\u0162\u0164\13\2\2\2\u0163\u0162\3\2\2\2\u0164\u0167\3\2\2\2\u0165\u0166"+
		"\3\2\2\2\u0165\u0163\3\2\2\2\u0166\u0168\3\2\2\2\u0167\u0165\3\2\2\2\u0168"+
		"\u0169\7,\2\2\u0169\u016a\7\61\2\2\u016a\u016b\3\2\2\2\u016b\u016c\b\60"+
		"\2\2\u016c`\3\2\2\2\u016d\u016e\7\61\2\2\u016e\u016f\7\61\2\2\u016f\u0173"+
		"\3\2\2\2\u0170\u0172\n\20\2\2\u0171\u0170\3\2\2\2\u0172\u0175\3\2\2\2"+
		"\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0176\3\2\2\2\u0175\u0173"+
		"\3\2\2\2\u0176\u0177\b\61\2\2\u0177b\3\2\2\2\u0178\u017a\t\21\2\2\u0179"+
		"\u017b\t\16\2\2\u017a\u0179\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017c\3"+
		"\2\2\2\u017c\u017d\5k\66\2\u017dd\3\2\2\2\u017e\u017f\7^\2\2\u017f\u0194"+
		"\t\22\2\2\u0180\u0185\7^\2\2\u0181\u0183\t\23\2\2\u0182\u0181\3\2\2\2"+
		"\u0182\u0183\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0186\t\7\2\2\u0185\u0182"+
		"\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0194\t\7\2\2\u0188"+
		"\u018a\7^\2\2\u0189\u018b\7w\2\2\u018a\u0189\3\2\2\2\u018b\u018c\3\2\2"+
		"\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018f"+
		"\5i\65\2\u018f\u0190\5i\65\2\u0190\u0191\5i\65\2\u0191\u0192\5i\65\2\u0192"+
		"\u0194\3\2\2\2\u0193\u017e\3\2\2\2\u0193\u0180\3\2\2\2\u0193\u0188\3\2"+
		"\2\2\u0194f\3\2\2\2\u0195\u019e\5i\65\2\u0196\u0199\5i\65\2\u0197\u0199"+
		"\7a\2\2\u0198\u0196\3\2\2\2\u0198\u0197\3\2\2\2\u0199\u019c\3\2\2\2\u019a"+
		"\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019d\3\2\2\2\u019c\u019a\3\2"+
		"\2\2\u019d\u019f\5i\65\2\u019e\u019a\3\2\2\2\u019e\u019f\3\2\2\2\u019f"+
		"h\3\2\2\2\u01a0\u01a1\t\5\2\2\u01a1j\3\2\2\2\u01a2\u01aa\t\24\2\2\u01a3"+
		"\u01a5\t\25\2\2\u01a4\u01a3\3\2\2\2\u01a5\u01a8\3\2\2\2\u01a6\u01a4\3"+
		"\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a9\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a9"+
		"\u01ab\t\24\2\2\u01aa\u01a6\3\2\2\2\u01aa\u01ab\3\2\2\2\u01abl\3\2\2\2"+
		"\u01ac\u01af\5o8\2\u01ad\u01af\t\24\2\2\u01ae\u01ac\3\2\2\2\u01ae\u01ad"+
		"\3\2\2\2\u01afn\3\2\2\2\u01b0\u01b6\t\26\2\2\u01b1\u01b6\n\27\2\2\u01b2"+
		"\u01b3\t\30\2\2\u01b3\u01b6\t\31\2\2\u01b4\u01b6\t\32\2\2\u01b5\u01b0"+
		"\3\2\2\2\u01b5\u01b1\3\2\2\2\u01b5\u01b2\3\2\2\2\u01b5\u01b4\3\2\2\2\u01b6"+
		"p\3\2\2\2/\2\u00ca\u00de\u00e3\u00e6\u00e8\u00eb\u00f3\u00f7\u00fa\u0100"+
		"\u0107\u010b\u010e\u0116\u011a\u011d\u0122\u0126\u0129\u012c\u0131\u0134"+
		"\u0136\u013c\u013f\u0143\u0147\u014b\u0151\u015b\u0165\u0173\u017a\u0182"+
		"\u0185\u018c\u0193\u0198\u019a\u019e\u01a6\u01aa\u01ae\u01b5\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}