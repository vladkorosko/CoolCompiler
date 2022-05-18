// Generated from C:/Users/Vladyslav/Desktop/фото дз/3 курс/Компілятори/coolcompiler/src/main/resources\CoolGrammar.g4 by ANTLR 4.10.1
package org.example.generated;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CoolGrammarParser extends Parser {
    public static final int
            PLUS = 1, MINUS = 2, MUL = 3, DIV = 4, EQUALS = 5, LPAREN = 6, RPAREN = 7, LBRACE = 8,
            RBRACE = 9, COMMA = 10, DOT = 11, SEMICOLON = 12, COLON = 13, LESS = 14, LESSOREQUALS = 15,
            ASSIGN = 16, CASE_ARROW = 17, TILDE = 18, ATSYM = 19, NOT = 20, TRUE = 21, FALSE = 22,
            IF = 23, FI = 24, THEN = 25, ELSE = 26, CASE = 27, ESAC = 28, WHILE = 29, LOOP = 30, POOL = 31,
            CLASS = 32, IN = 33, INHERITS = 34, OF = 35, LET = 36, NEW = 37, ISVOID = 38, WS = 39,
            NUM = 40, STRING_VALUE = 41, COMMENT = 42, BOOL_CONST = 43, INT = 44, STRING = 45,
            OBJECT = 46, MAIN = 47, TYPE = 48, ID = 49, ERROR = 50;
    public static final int
            RULE_program = 0, RULE_value = 1, RULE_attribute_without_semicolon = 2,
            RULE_attribute = 3, RULE_assigment = 4, RULE_parameters = 5, RULE_method = 6,
            RULE_conditional = 7, RULE_loop = 8, RULE_block = 9, RULE_let = 10, RULE_case_option = 11,
            RULE_switch_case = 12, RULE_new = 13, RULE_isvoid = 14, RULE_ariphemitic_operation = 15,
            RULE_class = 16, RULE_expr = 17;
    public static final String[] ruleNames = makeRuleNames();
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\u0004\u00012\u00d7\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002" +
                    "\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002" +
                    "\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002" +
                    "\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002" +
                    "\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f" +
                    "\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0004\u0000" +
                    "&\b\u0000\u000b\u0000\f\u0000\'\u0001\u0000\u0005\u0000+\b\u0000\n\u0000" +
                    "\f\u0000.\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001" +
                    "\u0002\u0001\u0002\u0001\u0002\u0003\u00027\b\u0002\u0001\u0003\u0001" +
                    "\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001" +
                    "\u0004\u0003\u0004A\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005" +
                    "\u0005F\b\u0005\n\u0005\f\u0005I\t\u0005\u0001\u0006\u0001\u0006\u0001" +
                    "\u0006\u0003\u0006N\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001" +
                    "\u0006\u0001\u0006\u0005\u0006U\b\u0006\n\u0006\f\u0006X\t\u0006\u0001" +
                    "\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001" +
                    "\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b" +
                    "\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0005" +
                    "\to\b\t\n\t\f\tr\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0004\nx\b\n\u000b" +
                    "\n\f\ny\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001" +
                    "\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0004\f\u0088\b\f\u000b" +
                    "\f\f\f\u0089\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001" +
                    "\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001" +
                    "\u0010\u0001\u0010\u0003\u0010\u009a\b\u0010\u0001\u0010\u0001\u0010\u0005" +
                    "\u0010\u009e\b\u0010\n\u0010\f\u0010\u00a1\t\u0010\u0001\u0010\u0005\u0010" +
                    "\u00a4\b\u0010\n\u0010\f\u0010\u00a7\t\u0010\u0001\u0010\u0001\u0010\u0001" +
                    "\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003" +
                    "\u0011\u00b1\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001" +
                    "\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001" +
                    "\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001" +
                    "\u0011\u0003\u0011\u00c4\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001" +
                    "\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003" +
                    "\u0011\u00cf\b\u0011\u0001\u0011\u0005\u0011\u00d2\b\u0011\n\u0011\f\u0011" +
                    "\u00d5\t\u0011\u0001\u0011\u0000\u0001\"\u0012\u0000\u0002\u0004\u0006" +
                    "\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"\u0000" +
                    "\u0001\u0002\u0000\u0001\u0005\u000e\u000f\u00e4\u0000%\u0001\u0000\u0000" +
                    "\u0000\u0002/\u0001\u0000\u0000\u0000\u00043\u0001\u0000\u0000\u0000\u0006" +
                    "8\u0001\u0000\u0000\u0000\b@\u0001\u0000\u0000\u0000\nB\u0001\u0000\u0000" +
                    "\u0000\fJ\u0001\u0000\u0000\u0000\u000e\\\u0001\u0000\u0000\u0000\u0010" +
                    "d\u0001\u0000\u0000\u0000\u0012j\u0001\u0000\u0000\u0000\u0014u\u0001" +
                    "\u0000\u0000\u0000\u0016~\u0001\u0000\u0000\u0000\u0018\u0083\u0001\u0000" +
                    "\u0000\u0000\u001a\u008d\u0001\u0000\u0000\u0000\u001c\u0090\u0001\u0000" +
                    "\u0000\u0000\u001e\u0093\u0001\u0000\u0000\u0000 \u0095\u0001\u0000\u0000" +
                    "\u0000\"\u00c3\u0001\u0000\u0000\u0000$&\u0003 \u0010\u0000%$\u0001\u0000" +
                    "\u0000\u0000&\'\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000\'(" +
                    "\u0001\u0000\u0000\u0000(,\u0001\u0000\u0000\u0000)+\u0005*\u0000\u0000" +
                    "*)\u0001\u0000\u0000\u0000+.\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000" +
                    "\u0000,-\u0001\u0000\u0000\u0000-\u0001\u0001\u0000\u0000\u0000.,\u0001" +
                    "\u0000\u0000\u0000/0\u00051\u0000\u000001\u0005\r\u0000\u000012\u0005" +
                    "0\u0000\u00002\u0003\u0001\u0000\u0000\u000036\u0003\u0002\u0001\u0000" +
                    "45\u0005\u0010\u0000\u000057\u0003\"\u0011\u000064\u0001\u0000\u0000\u0000" +
                    "67\u0001\u0000\u0000\u00007\u0005\u0001\u0000\u0000\u000089\u0003\u0004" +
                    "\u0002\u00009:\u0005\f\u0000\u0000:\u0007\u0001\u0000\u0000\u0000;<\u0003" +
                    "\u0002\u0001\u0000<=\u0005\u0010\u0000\u0000=>\u0003\"\u0011\u0000>A\u0001" +
                    "\u0000\u0000\u0000?A\u0003\u001a\r\u0000@;\u0001\u0000\u0000\u0000@?\u0001" +
                    "\u0000\u0000\u0000A\t\u0001\u0000\u0000\u0000BG\u0003\u0004\u0002\u0000" +
                    "CD\u0005\n\u0000\u0000DF\u0003\u0004\u0002\u0000EC\u0001\u0000\u0000\u0000" +
                    "FI\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000" +
                    "\u0000H\u000b\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000JK\u0005" +
                    "1\u0000\u0000KM\u0005\b\u0000\u0000LN\u0003\n\u0005\u0000ML\u0001\u0000" +
                    "\u0000\u0000MN\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OP\u0005" +
                    "\t\u0000\u0000PQ\u0005\r\u0000\u0000QR\u00050\u0000\u0000RV\u0005\u0006" +
                    "\u0000\u0000SU\u0003\"\u0011\u0000TS\u0001\u0000\u0000\u0000UX\u0001\u0000" +
                    "\u0000\u0000VT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WY\u0001" +
                    "\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000YZ\u0005\u0007\u0000\u0000" +
                    "Z[\u0005\f\u0000\u0000[\r\u0001\u0000\u0000\u0000\\]\u0005\u0017\u0000" +
                    "\u0000]^\u0003\"\u0011\u0000^_\u0005\u0019\u0000\u0000_`\u0003\"\u0011" +
                    "\u0000`a\u0005\u001a\u0000\u0000ab\u0003\"\u0011\u0000bc\u0005\u0018\u0000" +
                    "\u0000c\u000f\u0001\u0000\u0000\u0000de\u0005\u001d\u0000\u0000ef\u0003" +
                    "\"\u0011\u0000fg\u0005\u001e\u0000\u0000gh\u0003\"\u0011\u0000hi\u0005" +
                    "\u001f\u0000\u0000i\u0011\u0001\u0000\u0000\u0000jp\u0005\b\u0000\u0000" +
                    "kl\u0003\"\u0011\u0000lm\u0005\f\u0000\u0000mo\u0001\u0000\u0000\u0000" +
                    "nk\u0001\u0000\u0000\u0000or\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000" +
                    "\u0000pq\u0001\u0000\u0000\u0000qs\u0001\u0000\u0000\u0000rp\u0001\u0000" +
                    "\u0000\u0000st\u0005\t\u0000\u0000t\u0013\u0001\u0000\u0000\u0000uw\u0005" +
                    "$\u0000\u0000vx\u0003\n\u0005\u0000wv\u0001\u0000\u0000\u0000xy\u0001" +
                    "\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000" +
                    "z{\u0001\u0000\u0000\u0000{|\u0005!\u0000\u0000|}\u0003\"\u0011\u0000" +
                    "}\u0015\u0001\u0000\u0000\u0000~\u007f\u0003\u0002\u0001\u0000\u007f\u0080" +
                    "\u0005\u0011\u0000\u0000\u0080\u0081\u0003\"\u0011\u0000\u0081\u0082\u0005" +
                    "\f\u0000\u0000\u0082\u0017\u0001\u0000\u0000\u0000\u0083\u0084\u0005\u001b" +
                    "\u0000\u0000\u0084\u0085\u0003\"\u0011\u0000\u0085\u0087\u0005#\u0000" +
                    "\u0000\u0086\u0088\u0003\u0016\u000b\u0000\u0087\u0086\u0001\u0000\u0000" +
                    "\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000" +
                    "\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000" +
                    "\u0000\u008b\u008c\u0005\u001c\u0000\u0000\u008c\u0019\u0001\u0000\u0000" +
                    "\u0000\u008d\u008e\u0005%\u0000\u0000\u008e\u008f\u00050\u0000\u0000\u008f" +
                    "\u001b\u0001\u0000\u0000\u0000\u0090\u0091\u0005&\u0000\u0000\u0091\u0092" +
                    "\u0003\"\u0011\u0000\u0092\u001d\u0001\u0000\u0000\u0000\u0093\u0094\u0007" +
                    "\u0000\u0000\u0000\u0094\u001f\u0001\u0000\u0000\u0000\u0095\u0096\u0005" +
                    " \u0000\u0000\u0096\u0099\u00050\u0000\u0000\u0097\u0098\u0005\"\u0000" +
                    "\u0000\u0098\u009a\u00050\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000" +
                    "\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000" +
                    "\u009b\u009f\u0005\b\u0000\u0000\u009c\u009e\u0003\u0006\u0003\u0000\u009d" +
                    "\u009c\u0001\u0000\u0000\u0000\u009e\u00a1\u0001\u0000\u0000\u0000\u009f" +
                    "\u009d\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0" +
                    "\u00a5\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a2" +
                    "\u00a4\u0003\f\u0006\u0000\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a7" +
                    "\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a6" +
                    "\u0001\u0000\u0000\u0000\u00a6\u00a8\u0001\u0000\u0000\u0000\u00a7\u00a5" +
                    "\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005\f\u0000\u0000\u00a9!\u0001" +
                    "\u0000\u0000\u0000\u00aa\u00ab\u0006\u0011\uffff\uffff\u0000\u00ab\u00c4" +
                    "\u0003\u0006\u0003\u0000\u00ac\u00c4\u0003\b\u0004\u0000\u00ad\u00ae\u0005" +
                    "1\u0000\u0000\u00ae\u00b0\u0005\b\u0000\u0000\u00af\u00b1\u0003\n\u0005" +
                    "\u0000\u00b0\u00af\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000" +
                    "\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00c4\u0005\t\u0000\u0000" +
                    "\u00b3\u00c4\u0003\u000e\u0007\u0000\u00b4\u00c4\u0003\u0010\b\u0000\u00b5" +
                    "\u00c4\u0003\u0012\t\u0000\u00b6\u00c4\u0003\u0014\n\u0000\u00b7\u00c4" +
                    "\u0003\u0018\f\u0000\u00b8\u00c4\u0003\u001a\r\u0000\u00b9\u00c4\u0003" +
                    "\u001c\u000e\u0000\u00ba\u00bb\u0005\u0006\u0000\u0000\u00bb\u00bc\u0003" +
                    "\"\u0011\u0000\u00bc\u00bd\u0005\u0007\u0000\u0000\u00bd\u00c4\u0001\u0000" +
                    "\u0000\u0000\u00be\u00c4\u00051\u0000\u0000\u00bf\u00c4\u0005+\u0000\u0000" +
                    "\u00c0\u00c4\u0005)\u0000\u0000\u00c1\u00c4\u0005(\u0000\u0000\u00c2\u00c4" +
                    "\u0005*\u0000\u0000\u00c3\u00aa\u0001\u0000\u0000\u0000\u00c3\u00ac\u0001" +
                    "\u0000\u0000\u0000\u00c3\u00ad\u0001\u0000\u0000\u0000\u00c3\u00b3\u0001" +
                    "\u0000\u0000\u0000\u00c3\u00b4\u0001\u0000\u0000\u0000\u00c3\u00b5\u0001" +
                    "\u0000\u0000\u0000\u00c3\u00b6\u0001\u0000\u0000\u0000\u00c3\u00b7\u0001" +
                    "\u0000\u0000\u0000\u00c3\u00b8\u0001\u0000\u0000\u0000\u00c3\u00b9\u0001" +
                    "\u0000\u0000\u0000\u00c3\u00ba\u0001\u0000\u0000\u0000\u00c3\u00be\u0001" +
                    "\u0000\u0000\u0000\u00c3\u00bf\u0001\u0000\u0000\u0000\u00c3\u00c0\u0001" +
                    "\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c2\u0001" +
                    "\u0000\u0000\u0000\u00c4\u00d3\u0001\u0000\u0000\u0000\u00c5\u00c6\n\u0007" +
                    "\u0000\u0000\u00c6\u00c7\u0003\u001e\u000f\u0000\u00c7\u00c8\u0003\"\u0011" +
                    "\b\u00c8\u00d2\u0001\u0000\u0000\u0000\u00c9\u00ca\n\u0010\u0000\u0000" +
                    "\u00ca\u00cb\u0005\u000b\u0000\u0000\u00cb\u00cc\u00051\u0000\u0000\u00cc" +
                    "\u00ce\u0005\b\u0000\u0000\u00cd\u00cf\u0003\n\u0005\u0000\u00ce\u00cd" +
                    "\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u00d0" +
                    "\u0001\u0000\u0000\u0000\u00d0\u00d2\u0005\t\u0000\u0000\u00d1\u00c5\u0001" +
                    "\u0000\u0000\u0000\u00d1\u00c9\u0001\u0000\u0000\u0000\u00d2\u00d5\u0001" +
                    "\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001" +
                    "\u0000\u0000\u0000\u00d4#\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000" +
                    "\u0000\u0000\u0012\',6@GMVpy\u0089\u0099\u009f\u00a5\u00b0\u00c3\u00ce" +
                    "\u00d1\u00d3";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    private static final String[] _LITERAL_NAMES = makeLiteralNames();
    private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

    static {
        RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION);
    }

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

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }

    public CoolGrammarParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    private static String[] makeRuleNames() {
        return new String[]{
                "program", "value", "attribute_without_semicolon", "attribute", "assigment",
                "parameters", "method", "conditional", "loop", "block", "let", "case_option",
                "switch_case", "new", "isvoid", "ariphemitic_operation", "class", "expr"
        };
    }

    private static String[] makeLiteralNames() {
        return new String[]{
                null, "'+'", "'-'", "'*'", "'/'", "'='", "'('", "')'", "'{'", "'}'",
                "','", "'.'", "';'", "':'", "'<'", "'<='", "'<-'", "'=>'", "'~'", "'@'",
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, null, null, null, null, null,
                "'Int'", "'String'", "'Object'"
        };
    }

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, "PLUS", "MINUS", "MUL", "DIV", "EQUALS", "LPAREN", "RPAREN", "LBRACE",
                "RBRACE", "COMMA", "DOT", "SEMICOLON", "COLON", "LESS", "LESSOREQUALS",
                "ASSIGN", "CASE_ARROW", "TILDE", "ATSYM", "NOT", "TRUE", "FALSE", "IF",
                "FI", "THEN", "ELSE", "CASE", "ESAC", "WHILE", "LOOP", "POOL", "CLASS",
                "IN", "INHERITS", "OF", "LET", "NEW", "ISVOID", "WS", "NUM", "STRING_VALUE",
                "COMMENT", "BOOL_CONST", "INT", "STRING", "OBJECT", "MAIN", "TYPE", "ID",
                "ERROR"
        };
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
    public String getGrammarFileName() {
        return "CoolGrammar.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public final ProgramContext program() throws RecognitionException {
        ProgramContext _localctx = new ProgramContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_program);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(37);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(36);
                            class_();
                        }
                    }
                    setState(39);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while (_la == CLASS);
                {
                    setState(44);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == COMMENT) {
                        {
                            {
                                setState(41);
                                match(COMMENT);
                            }
                        }
                        setState(46);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ValueContext value() throws RecognitionException {
        ValueContext _localctx = new ValueContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_value);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(47);
                match(ID);
                setState(48);
                match(COLON);
                setState(49);
                match(TYPE);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final Attribute_without_semicolonContext attribute_without_semicolon() throws RecognitionException {
        Attribute_without_semicolonContext _localctx = new Attribute_without_semicolonContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_attribute_without_semicolon);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(51);
                value();
                setState(54);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == ASSIGN) {
                    {
                        setState(52);
                        match(ASSIGN);
                        setState(53);
                        expr(0);
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final AttributeContext attribute() throws RecognitionException {
        AttributeContext _localctx = new AttributeContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_attribute);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(56);
                attribute_without_semicolon();
                setState(57);
                match(SEMICOLON);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final AssigmentContext assigment() throws RecognitionException {
        AssigmentContext _localctx = new AssigmentContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_assigment);
        try {
            setState(64);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case ID:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(59);
                    value();
                    setState(60);
                    match(ASSIGN);
                    setState(61);
                    expr(0);
                }
                break;
                case NEW:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(63);
                    new_();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ParametersContext parameters() throws RecognitionException {
        ParametersContext _localctx = new ParametersContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_parameters);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(66);
                attribute_without_semicolon();
                setState(71);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(67);
                            match(COMMA);
                            setState(68);
                            attribute_without_semicolon();
                        }
                    }
                    setState(73);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final MethodContext method() throws RecognitionException {
        MethodContext _localctx = new MethodContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_method);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(74);
                match(ID);
                setState(75);
                match(LBRACE);
                setState(77);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == ID) {
                    {
                        setState(76);
                        parameters();
                    }
                }

                setState(79);
                match(RBRACE);
                setState(80);
                match(COLON);
                setState(81);
                match(TYPE);
                setState(82);
                match(LPAREN);
                {
                    setState(86);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << LBRACE) | (1L << IF) | (1L << CASE) | (1L << WHILE) | (1L << LET) | (1L << NEW) | (1L << ISVOID) | (1L << NUM) | (1L << STRING_VALUE) | (1L << COMMENT) | (1L << BOOL_CONST) | (1L << ID))) != 0)) {
                        {
                            {
                                setState(83);
                                expr(0);
                            }
                        }
                        setState(88);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                setState(89);
                match(RPAREN);
                setState(90);
                match(SEMICOLON);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ConditionalContext conditional() throws RecognitionException {
        ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_conditional);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(92);
                match(IF);
                setState(93);
                expr(0);
                setState(94);
                match(THEN);
                setState(95);
                expr(0);
                setState(96);
                match(ELSE);
                setState(97);
                expr(0);
                setState(98);
                match(FI);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final LoopContext loop() throws RecognitionException {
        LoopContext _localctx = new LoopContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_loop);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(100);
                match(WHILE);
                setState(101);
                expr(0);
                setState(102);
                match(LOOP);
                setState(103);
                expr(0);
                setState(104);
                match(POOL);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final BlockContext block() throws RecognitionException {
        BlockContext _localctx = new BlockContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_block);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(106);
                match(LBRACE);
                {
                    setState(112);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << LBRACE) | (1L << IF) | (1L << CASE) | (1L << WHILE) | (1L << LET) | (1L << NEW) | (1L << ISVOID) | (1L << NUM) | (1L << STRING_VALUE) | (1L << COMMENT) | (1L << BOOL_CONST) | (1L << ID))) != 0)) {
                        {
                            {
                                setState(107);
                                expr(0);
                                setState(108);
                                match(SEMICOLON);
                            }
                        }
                        setState(114);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                setState(115);
                match(RBRACE);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final LetContext let() throws RecognitionException {
        LetContext _localctx = new LetContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_let);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(117);
                match(LET);
                setState(119);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(118);
                            parameters();
                        }
                    }
                    setState(121);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while (_la == ID);
                setState(123);
                match(IN);
                setState(124);
                expr(0);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final Case_optionContext case_option() throws RecognitionException {
        Case_optionContext _localctx = new Case_optionContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_case_option);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(126);
                value();
                setState(127);
                match(CASE_ARROW);
                setState(128);
                expr(0);
                setState(129);
                match(SEMICOLON);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final Switch_caseContext switch_case() throws RecognitionException {
        Switch_caseContext _localctx = new Switch_caseContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_switch_case);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(131);
                match(CASE);
                setState(132);
                expr(0);
                setState(133);
                match(OF);
                setState(135);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(134);
                            case_option();
                        }
                    }
                    setState(137);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while (_la == ID);
                setState(139);
                match(ESAC);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final NewContext new_() throws RecognitionException {
        NewContext _localctx = new NewContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_new);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(141);
                match(NEW);
                setState(142);
                match(TYPE);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final IsvoidContext isvoid() throws RecognitionException {
        IsvoidContext _localctx = new IsvoidContext(_ctx, getState());
        enterRule(_localctx, 28, RULE_isvoid);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(144);
                match(ISVOID);
                setState(145);
                expr(0);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final Ariphemitic_operationContext ariphemitic_operation() throws RecognitionException {
        Ariphemitic_operationContext _localctx = new Ariphemitic_operationContext(_ctx, getState());
        enterRule(_localctx, 30, RULE_ariphemitic_operation);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(147);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MUL) | (1L << DIV) | (1L << EQUALS) | (1L << LESS) | (1L << LESSOREQUALS))) != 0))) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ClassContext class_() throws RecognitionException {
        ClassContext _localctx = new ClassContext(_ctx, getState());
        enterRule(_localctx, 32, RULE_class);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(149);
                match(CLASS);
                setState(150);
                match(TYPE);
                setState(153);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == INHERITS) {
                    {
                        setState(151);
                        match(INHERITS);
                        setState(152);
                        match(TYPE);
                    }
                }

                setState(155);
                match(LBRACE);
                setState(159);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 11, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(156);
                                attribute();
                            }
                        }
                    }
                    setState(161);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 11, _ctx);
                }
                setState(165);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == ID) {
                    {
                        {
                            setState(162);
                            method();
                        }
                    }
                    setState(167);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(168);
                match(SEMICOLON);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ExprContext expr() throws RecognitionException {
        return expr(0);
    }

    private ExprContext expr(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        ExprContext _localctx = new ExprContext(_ctx, _parentState);
        ExprContext _prevctx = _localctx;
        int _startState = 34;
        enterRecursionRule(_localctx, 34, RULE_expr, _p);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(195);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 14, _ctx)) {
                    case 1: {
                        setState(171);
                        attribute();
                    }
                    break;
                    case 2: {
                        setState(172);
                        assigment();
                    }
                    break;
                    case 3: {
                        setState(173);
                        match(ID);
                        setState(174);
                        match(LBRACE);
                        setState(176);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == ID) {
                            {
                                setState(175);
                                parameters();
                            }
                        }

                        setState(178);
                        match(RBRACE);
                    }
                    break;
                    case 4: {
                        setState(179);
                        conditional();
                    }
                    break;
                    case 5: {
                        setState(180);
                        loop();
                    }
                    break;
                    case 6: {
                        setState(181);
                        block();
                    }
                    break;
                    case 7: {
                        setState(182);
                        let();
                    }
                    break;
                    case 8: {
                        setState(183);
                        switch_case();
                    }
                    break;
                    case 9: {
                        setState(184);
                        new_();
                    }
                    break;
                    case 10: {
                        setState(185);
                        isvoid();
                    }
                    break;
                    case 11: {
                        setState(186);
                        match(LPAREN);
                        setState(187);
                        expr(0);
                        setState(188);
                        match(RPAREN);
                    }
                    break;
                    case 12: {
                        setState(190);
                        match(ID);
                    }
                    break;
                    case 13: {
                        setState(191);
                        match(BOOL_CONST);
                    }
                    break;
                    case 14: {
                        setState(192);
                        match(STRING_VALUE);
                    }
                    break;
                    case 15: {
                        setState(193);
                        match(NUM);
                    }
                    break;
                    case 16: {
                        setState(194);
                        match(COMMENT);
                    }
                    break;
                }
                _ctx.stop = _input.LT(-1);
                setState(211);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 17, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(209);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 16, _ctx)) {
                                case 1: {
                                    _localctx = new ExprContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(197);
                                    if (!(precpred(_ctx, 7)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 7)");
                                    setState(198);
                                    ariphemitic_operation();
                                    setState(199);
                                    expr(8);
                                }
                                break;
                                case 2: {
                                    _localctx = new ExprContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(201);
                                    if (!(precpred(_ctx, 16)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 16)");
                                    setState(202);
                                    match(DOT);
                                    setState(203);
                                    match(ID);
                                    setState(204);
                                    match(LBRACE);
                                    setState(206);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                    if (_la == ID) {
                                        {
                                            setState(205);
                                            parameters();
                                        }
                                    }

                                    setState(208);
                                    match(RBRACE);
                                }
                                break;
                            }
                        }
                    }
                    setState(213);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 17, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
        switch (ruleIndex) {
            case 17:
                return expr_sempred((ExprContext) _localctx, predIndex);
        }
        return true;
    }

    private boolean expr_sempred(ExprContext _localctx, int predIndex) {
        switch (predIndex) {
            case 0:
                return precpred(_ctx, 7);
            case 1:
                return precpred(_ctx, 16);
        }
        return true;
    }

    public static class ProgramContext extends ParserRuleContext {
        public ProgramContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<ClassContext> class_() {
            return getRuleContexts(ClassContext.class);
        }

        public ClassContext class_(int i) {
            return getRuleContext(ClassContext.class, i);
        }

        public List<TerminalNode> COMMENT() {
            return getTokens(CoolGrammarParser.COMMENT);
        }

        public TerminalNode COMMENT(int i) {
            return getToken(CoolGrammarParser.COMMENT, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_program;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CoolGrammarListener) ((CoolGrammarListener) listener).enterProgram(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CoolGrammarListener) ((CoolGrammarListener) listener).exitProgram(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CoolGrammarVisitor)
                return ((CoolGrammarVisitor<? extends T>) visitor).visitProgram(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ValueContext extends ParserRuleContext {
        public ValueContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode ID() {
            return getToken(CoolGrammarParser.ID, 0);
        }

        public TerminalNode COLON() {
            return getToken(CoolGrammarParser.COLON, 0);
        }

        public TerminalNode TYPE() {
            return getToken(CoolGrammarParser.TYPE, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_value;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CoolGrammarListener) ((CoolGrammarListener) listener).enterValue(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CoolGrammarListener) ((CoolGrammarListener) listener).exitValue(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CoolGrammarVisitor)
                return ((CoolGrammarVisitor<? extends T>) visitor).visitValue(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Attribute_without_semicolonContext extends ParserRuleContext {
        public Attribute_without_semicolonContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public ValueContext value() {
            return getRuleContext(ValueContext.class, 0);
        }

        public TerminalNode ASSIGN() {
            return getToken(CoolGrammarParser.ASSIGN, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_attribute_without_semicolon;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CoolGrammarListener)
                ((CoolGrammarListener) listener).enterAttribute_without_semicolon(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CoolGrammarListener)
                ((CoolGrammarListener) listener).exitAttribute_without_semicolon(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CoolGrammarVisitor)
                return ((CoolGrammarVisitor<? extends T>) visitor).visitAttribute_without_semicolon(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class AttributeContext extends ParserRuleContext {
        public AttributeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public Attribute_without_semicolonContext attribute_without_semicolon() {
            return getRuleContext(Attribute_without_semicolonContext.class, 0);
        }

        public TerminalNode SEMICOLON() {
            return getToken(CoolGrammarParser.SEMICOLON, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_attribute;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CoolGrammarListener) ((CoolGrammarListener) listener).enterAttribute(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CoolGrammarListener) ((CoolGrammarListener) listener).exitAttribute(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CoolGrammarVisitor)
                return ((CoolGrammarVisitor<? extends T>) visitor).visitAttribute(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class AssigmentContext extends ParserRuleContext {
        public AssigmentContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public ValueContext value() {
            return getRuleContext(ValueContext.class, 0);
        }

        public TerminalNode ASSIGN() {
            return getToken(CoolGrammarParser.ASSIGN, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public NewContext new_() {
            return getRuleContext(NewContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_assigment;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CoolGrammarListener) ((CoolGrammarListener) listener).enterAssigment(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CoolGrammarListener) ((CoolGrammarListener) listener).exitAssigment(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CoolGrammarVisitor)
                return ((CoolGrammarVisitor<? extends T>) visitor).visitAssigment(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ParametersContext extends ParserRuleContext {
        public ParametersContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<Attribute_without_semicolonContext> attribute_without_semicolon() {
            return getRuleContexts(Attribute_without_semicolonContext.class);
        }

        public Attribute_without_semicolonContext attribute_without_semicolon(int i) {
            return getRuleContext(Attribute_without_semicolonContext.class, i);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(CoolGrammarParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(CoolGrammarParser.COMMA, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_parameters;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CoolGrammarListener) ((CoolGrammarListener) listener).enterParameters(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CoolGrammarListener) ((CoolGrammarListener) listener).exitParameters(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CoolGrammarVisitor)
                return ((CoolGrammarVisitor<? extends T>) visitor).visitParameters(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class MethodContext extends ParserRuleContext {
        public MethodContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode ID() {
            return getToken(CoolGrammarParser.ID, 0);
        }

        public TerminalNode LBRACE() {
            return getToken(CoolGrammarParser.LBRACE, 0);
        }

        public TerminalNode RBRACE() {
            return getToken(CoolGrammarParser.RBRACE, 0);
        }

        public TerminalNode COLON() {
            return getToken(CoolGrammarParser.COLON, 0);
        }

        public TerminalNode TYPE() {
            return getToken(CoolGrammarParser.TYPE, 0);
        }

        public TerminalNode LPAREN() {
            return getToken(CoolGrammarParser.LPAREN, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(CoolGrammarParser.RPAREN, 0);
        }

        public TerminalNode SEMICOLON() {
            return getToken(CoolGrammarParser.SEMICOLON, 0);
        }

        public ParametersContext parameters() {
            return getRuleContext(ParametersContext.class, 0);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_method;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CoolGrammarListener) ((CoolGrammarListener) listener).enterMethod(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CoolGrammarListener) ((CoolGrammarListener) listener).exitMethod(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CoolGrammarVisitor)
                return ((CoolGrammarVisitor<? extends T>) visitor).visitMethod(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ConditionalContext extends ParserRuleContext {
        public ConditionalContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode IF() {
            return getToken(CoolGrammarParser.IF, 0);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public TerminalNode THEN() {
            return getToken(CoolGrammarParser.THEN, 0);
        }

        public TerminalNode ELSE() {
            return getToken(CoolGrammarParser.ELSE, 0);
        }

        public TerminalNode FI() {
            return getToken(CoolGrammarParser.FI, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_conditional;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CoolGrammarListener) ((CoolGrammarListener) listener).enterConditional(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CoolGrammarListener) ((CoolGrammarListener) listener).exitConditional(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CoolGrammarVisitor)
                return ((CoolGrammarVisitor<? extends T>) visitor).visitConditional(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class LoopContext extends ParserRuleContext {
        public LoopContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode WHILE() {
            return getToken(CoolGrammarParser.WHILE, 0);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public TerminalNode LOOP() {
            return getToken(CoolGrammarParser.LOOP, 0);
        }

        public TerminalNode POOL() {
            return getToken(CoolGrammarParser.POOL, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_loop;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CoolGrammarListener) ((CoolGrammarListener) listener).enterLoop(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CoolGrammarListener) ((CoolGrammarListener) listener).exitLoop(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CoolGrammarVisitor)
                return ((CoolGrammarVisitor<? extends T>) visitor).visitLoop(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class BlockContext extends ParserRuleContext {
        public BlockContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode LBRACE() {
            return getToken(CoolGrammarParser.LBRACE, 0);
        }

        public TerminalNode RBRACE() {
            return getToken(CoolGrammarParser.RBRACE, 0);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public List<TerminalNode> SEMICOLON() {
            return getTokens(CoolGrammarParser.SEMICOLON);
        }

        public TerminalNode SEMICOLON(int i) {
            return getToken(CoolGrammarParser.SEMICOLON, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_block;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CoolGrammarListener) ((CoolGrammarListener) listener).enterBlock(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CoolGrammarListener) ((CoolGrammarListener) listener).exitBlock(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CoolGrammarVisitor)
                return ((CoolGrammarVisitor<? extends T>) visitor).visitBlock(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class LetContext extends ParserRuleContext {
        public LetContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode LET() {
            return getToken(CoolGrammarParser.LET, 0);
        }

        public TerminalNode IN() {
            return getToken(CoolGrammarParser.IN, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public List<ParametersContext> parameters() {
            return getRuleContexts(ParametersContext.class);
        }

        public ParametersContext parameters(int i) {
            return getRuleContext(ParametersContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_let;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CoolGrammarListener) ((CoolGrammarListener) listener).enterLet(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CoolGrammarListener) ((CoolGrammarListener) listener).exitLet(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CoolGrammarVisitor)
                return ((CoolGrammarVisitor<? extends T>) visitor).visitLet(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Case_optionContext extends ParserRuleContext {
        public Case_optionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public ValueContext value() {
            return getRuleContext(ValueContext.class, 0);
        }

        public TerminalNode CASE_ARROW() {
            return getToken(CoolGrammarParser.CASE_ARROW, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public TerminalNode SEMICOLON() {
            return getToken(CoolGrammarParser.SEMICOLON, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_case_option;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CoolGrammarListener) ((CoolGrammarListener) listener).enterCase_option(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CoolGrammarListener) ((CoolGrammarListener) listener).exitCase_option(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CoolGrammarVisitor)
                return ((CoolGrammarVisitor<? extends T>) visitor).visitCase_option(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Switch_caseContext extends ParserRuleContext {
        public Switch_caseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode CASE() {
            return getToken(CoolGrammarParser.CASE, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public TerminalNode OF() {
            return getToken(CoolGrammarParser.OF, 0);
        }

        public TerminalNode ESAC() {
            return getToken(CoolGrammarParser.ESAC, 0);
        }

        public List<Case_optionContext> case_option() {
            return getRuleContexts(Case_optionContext.class);
        }

        public Case_optionContext case_option(int i) {
            return getRuleContext(Case_optionContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_switch_case;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CoolGrammarListener) ((CoolGrammarListener) listener).enterSwitch_case(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CoolGrammarListener) ((CoolGrammarListener) listener).exitSwitch_case(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CoolGrammarVisitor)
                return ((CoolGrammarVisitor<? extends T>) visitor).visitSwitch_case(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class NewContext extends ParserRuleContext {
        public NewContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode NEW() {
            return getToken(CoolGrammarParser.NEW, 0);
        }

        public TerminalNode TYPE() {
            return getToken(CoolGrammarParser.TYPE, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_new;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CoolGrammarListener) ((CoolGrammarListener) listener).enterNew(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CoolGrammarListener) ((CoolGrammarListener) listener).exitNew(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CoolGrammarVisitor)
                return ((CoolGrammarVisitor<? extends T>) visitor).visitNew(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class IsvoidContext extends ParserRuleContext {
        public IsvoidContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode ISVOID() {
            return getToken(CoolGrammarParser.ISVOID, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_isvoid;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CoolGrammarListener) ((CoolGrammarListener) listener).enterIsvoid(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CoolGrammarListener) ((CoolGrammarListener) listener).exitIsvoid(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CoolGrammarVisitor)
                return ((CoolGrammarVisitor<? extends T>) visitor).visitIsvoid(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Ariphemitic_operationContext extends ParserRuleContext {
        public Ariphemitic_operationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode PLUS() {
            return getToken(CoolGrammarParser.PLUS, 0);
        }

        public TerminalNode MINUS() {
            return getToken(CoolGrammarParser.MINUS, 0);
        }

        public TerminalNode DIV() {
            return getToken(CoolGrammarParser.DIV, 0);
        }

        public TerminalNode MUL() {
            return getToken(CoolGrammarParser.MUL, 0);
        }

        public TerminalNode EQUALS() {
            return getToken(CoolGrammarParser.EQUALS, 0);
        }

        public TerminalNode LESS() {
            return getToken(CoolGrammarParser.LESS, 0);
        }

        public TerminalNode LESSOREQUALS() {
            return getToken(CoolGrammarParser.LESSOREQUALS, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_ariphemitic_operation;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CoolGrammarListener)
                ((CoolGrammarListener) listener).enterAriphemitic_operation(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CoolGrammarListener)
                ((CoolGrammarListener) listener).exitAriphemitic_operation(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CoolGrammarVisitor)
                return ((CoolGrammarVisitor<? extends T>) visitor).visitAriphemitic_operation(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ClassContext extends ParserRuleContext {
        public ClassContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode CLASS() {
            return getToken(CoolGrammarParser.CLASS, 0);
        }

        public List<TerminalNode> TYPE() {
            return getTokens(CoolGrammarParser.TYPE);
        }

        public TerminalNode TYPE(int i) {
            return getToken(CoolGrammarParser.TYPE, i);
        }

        public TerminalNode LBRACE() {
            return getToken(CoolGrammarParser.LBRACE, 0);
        }

        public TerminalNode SEMICOLON() {
            return getToken(CoolGrammarParser.SEMICOLON, 0);
        }

        public TerminalNode INHERITS() {
            return getToken(CoolGrammarParser.INHERITS, 0);
        }

        public List<AttributeContext> attribute() {
            return getRuleContexts(AttributeContext.class);
        }

        public AttributeContext attribute(int i) {
            return getRuleContext(AttributeContext.class, i);
        }

        public List<MethodContext> method() {
            return getRuleContexts(MethodContext.class);
        }

        public MethodContext method(int i) {
            return getRuleContext(MethodContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_class;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CoolGrammarListener) ((CoolGrammarListener) listener).enterClass(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CoolGrammarListener) ((CoolGrammarListener) listener).exitClass(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CoolGrammarVisitor)
                return ((CoolGrammarVisitor<? extends T>) visitor).visitClass(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ExprContext extends ParserRuleContext {
        public ExprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public AttributeContext attribute() {
            return getRuleContext(AttributeContext.class, 0);
        }

        public AssigmentContext assigment() {
            return getRuleContext(AssigmentContext.class, 0);
        }

        public TerminalNode ID() {
            return getToken(CoolGrammarParser.ID, 0);
        }

        public TerminalNode LBRACE() {
            return getToken(CoolGrammarParser.LBRACE, 0);
        }

        public TerminalNode RBRACE() {
            return getToken(CoolGrammarParser.RBRACE, 0);
        }

        public ParametersContext parameters() {
            return getRuleContext(ParametersContext.class, 0);
        }

        public ConditionalContext conditional() {
            return getRuleContext(ConditionalContext.class, 0);
        }

        public LoopContext loop() {
            return getRuleContext(LoopContext.class, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public LetContext let() {
            return getRuleContext(LetContext.class, 0);
        }

        public Switch_caseContext switch_case() {
            return getRuleContext(Switch_caseContext.class, 0);
        }

        public NewContext new_() {
            return getRuleContext(NewContext.class, 0);
        }

        public IsvoidContext isvoid() {
            return getRuleContext(IsvoidContext.class, 0);
        }

        public TerminalNode LPAREN() {
            return getToken(CoolGrammarParser.LPAREN, 0);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public TerminalNode RPAREN() {
            return getToken(CoolGrammarParser.RPAREN, 0);
        }

        public TerminalNode BOOL_CONST() {
            return getToken(CoolGrammarParser.BOOL_CONST, 0);
        }

        public TerminalNode STRING_VALUE() {
            return getToken(CoolGrammarParser.STRING_VALUE, 0);
        }

        public TerminalNode NUM() {
            return getToken(CoolGrammarParser.NUM, 0);
        }

        public TerminalNode COMMENT() {
            return getToken(CoolGrammarParser.COMMENT, 0);
        }

        public Ariphemitic_operationContext ariphemitic_operation() {
            return getRuleContext(Ariphemitic_operationContext.class, 0);
        }

        public TerminalNode DOT() {
            return getToken(CoolGrammarParser.DOT, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CoolGrammarListener) ((CoolGrammarListener) listener).enterExpr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CoolGrammarListener) ((CoolGrammarListener) listener).exitExpr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CoolGrammarVisitor)
                return ((CoolGrammarVisitor<? extends T>) visitor).visitExpr(this);
            else return visitor.visitChildren(this);
        }
    }
}