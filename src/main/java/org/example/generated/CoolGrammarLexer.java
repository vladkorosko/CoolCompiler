// Generated from C:/Users/Vladyslav/Desktop/���� ��/3 ����/����������/coolcompiler/src/main/resources\CoolGrammar.g4 by ANTLR 4.10.1
package org.example.generated;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CoolGrammarLexer extends Lexer {
    public static final int
            PLUS = 1, MINUS = 2, MUL = 3, DIV = 4, EQUALS = 5, LPAREN = 6, RPAREN = 7, LBRACE = 8,
            RBRACE = 9, COMMA = 10, DOT = 11, SEMICOLON = 12, COLON = 13, LESS = 14, LESSOREQUALS = 15,
            ASSIGN = 16, CASE_ARROW = 17, TILDE = 18, ATSYM = 19, NOT = 20, TRUE = 21, FALSE = 22,
            IF = 23, FI = 24, THEN = 25, ELSE = 26, CASE = 27, ESAC = 28, WHILE = 29, LOOP = 30, POOL = 31,
            CLASS = 32, IN = 33, INHERITS = 34, OF = 35, LET = 36, NEW = 37, ISVOID = 38, WS = 39,
            NUM = 40, STRING_VALUE = 41, COMMENT = 42, BOOL_CONST = 43, INT = 44, STRING = 45,
            OBJECT = 46, MAIN = 47, TYPE = 48, ID = 49, ERROR = 50;
    public static final String[] ruleNames = makeRuleNames();
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\u0004\u00002\u0136\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001" +
                    "\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004" +
                    "\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007" +
                    "\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b" +
                    "\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002" +
                    "\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002" +
                    "\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002" +
                    "\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002" +
                    "\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002" +
                    "\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002" +
                    "\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007" +
                    "!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007" +
                    "&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007" +
                    "+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007" +
                    "0\u00021\u00071\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001" +
                    "\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001" +
                    "\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001" +
                    "\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001" +
                    "\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f" +
                    "\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011" +
                    "\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013" +
                    "\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014" +
                    "\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015" +
                    "\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017" +
                    "\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019" +
                    "\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a" +
                    "\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b" +
                    "\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c" +
                    "\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d" +
                    "\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e" +
                    "\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f" +
                    "\u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001" +
                    "!\u0001!\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001$\u0001" +
                    "$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001" +
                    "&\u0004&\u00ec\b&\u000b&\f&\u00ed\u0001&\u0001&\u0001\'\u0004\'\u00f3" +
                    "\b\'\u000b\'\f\'\u00f4\u0001(\u0001(\u0005(\u00f9\b(\n(\f(\u00fc\t(\u0001" +
                    "(\u0001(\u0001)\u0001)\u0001)\u0001)\u0005)\u0104\b)\n)\f)\u0107\t)\u0001" +
                    ")\u0001)\u0001)\u0001*\u0001*\u0003*\u010e\b*\u0001+\u0001+\u0001+\u0001" +
                    "+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001-\u0001-\u0001" +
                    "-\u0001-\u0001-\u0001-\u0001-\u0001.\u0001.\u0001.\u0001.\u0001.\u0001" +
                    "/\u0001/\u0005/\u0129\b/\n/\f/\u012c\t/\u00010\u00010\u00050\u0130\b0" +
                    "\n0\f0\u0133\t0\u00011\u00011\u0000\u00002\u0001\u0001\u0003\u0002\u0005" +
                    "\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n" +
                    "\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011" +
                    "#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b" +
                    "7\u001c9\u001d;\u001e=\u001f? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_0a1c2\u0001" +
                    "\u0000\u0019\u0002\u0000NNnn\u0002\u0000OOoo\u0002\u0000TTtt\u0002\u0000" +
                    "RRrr\u0002\u0000UUuu\u0002\u0000EEee\u0002\u0000AAaa\u0002\u0000LLll\u0002" +
                    "\u0000SSss\u0002\u0000IIii\u0002\u0000FFff\u0002\u0000HHhh\u0002\u0000" +
                    "CCcc\u0002\u0000WWww\u0002\u0000PPpp\u0002\u0000VVvv\u0002\u0000DDdd\u0003" +
                    "\u0000\t\n\r\r  \u0001\u000009\u0006\u0000 !#&(9@Z__a}\u0002\u0000MMm" +
                    "m\u0001\u0000AZ\u0003\u000009AZaz\u0001\u0000az\u0004\u000009AZ__az\u013c" +
                    "\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000" +
                    "\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000" +
                    "\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000" +
                    "\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011" +
                    "\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015" +
                    "\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019" +
                    "\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d" +
                    "\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001" +
                    "\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000" +
                    "\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000" +
                    "\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/" +
                    "\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000" +
                    "\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000" +
                    "\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000=" +
                    "\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000" +
                    "\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000" +
                    "\u0000G\u0001\u0000\u0000\u0000\u0000I\u0001\u0000\u0000\u0000\u0000K" +
                    "\u0001\u0000\u0000\u0000\u0000M\u0001\u0000\u0000\u0000\u0000O\u0001\u0000" +
                    "\u0000\u0000\u0000Q\u0001\u0000\u0000\u0000\u0000S\u0001\u0000\u0000\u0000" +
                    "\u0000U\u0001\u0000\u0000\u0000\u0000W\u0001\u0000\u0000\u0000\u0000Y" +
                    "\u0001\u0000\u0000\u0000\u0000[\u0001\u0000\u0000\u0000\u0000]\u0001\u0000" +
                    "\u0000\u0000\u0000_\u0001\u0000\u0000\u0000\u0000a\u0001\u0000\u0000\u0000" +
                    "\u0000c\u0001\u0000\u0000\u0000\u0001e\u0001\u0000\u0000\u0000\u0003g" +
                    "\u0001\u0000\u0000\u0000\u0005i\u0001\u0000\u0000\u0000\u0007k\u0001\u0000" +
                    "\u0000\u0000\tm\u0001\u0000\u0000\u0000\u000bo\u0001\u0000\u0000\u0000" +
                    "\rq\u0001\u0000\u0000\u0000\u000fs\u0001\u0000\u0000\u0000\u0011u\u0001" +
                    "\u0000\u0000\u0000\u0013w\u0001\u0000\u0000\u0000\u0015y\u0001\u0000\u0000" +
                    "\u0000\u0017{\u0001\u0000\u0000\u0000\u0019}\u0001\u0000\u0000\u0000\u001b" +
                    "\u007f\u0001\u0000\u0000\u0000\u001d\u0081\u0001\u0000\u0000\u0000\u001f" +
                    "\u0084\u0001\u0000\u0000\u0000!\u0087\u0001\u0000\u0000\u0000#\u008a\u0001" +
                    "\u0000\u0000\u0000%\u008c\u0001\u0000\u0000\u0000\'\u008e\u0001\u0000" +
                    "\u0000\u0000)\u0092\u0001\u0000\u0000\u0000+\u0097\u0001\u0000\u0000\u0000" +
                    "-\u009d\u0001\u0000\u0000\u0000/\u00a0\u0001\u0000\u0000\u00001\u00a3" +
                    "\u0001\u0000\u0000\u00003\u00a8\u0001\u0000\u0000\u00005\u00ad\u0001\u0000" +
                    "\u0000\u00007\u00b2\u0001\u0000\u0000\u00009\u00b7\u0001\u0000\u0000\u0000" +
                    ";\u00bd\u0001\u0000\u0000\u0000=\u00c2\u0001\u0000\u0000\u0000?\u00c7" +
                    "\u0001\u0000\u0000\u0000A\u00cd\u0001\u0000\u0000\u0000C\u00d0\u0001\u0000" +
                    "\u0000\u0000E\u00d8\u0001\u0000\u0000\u0000G\u00db\u0001\u0000\u0000\u0000" +
                    "I\u00df\u0001\u0000\u0000\u0000K\u00e3\u0001\u0000\u0000\u0000M\u00eb" +
                    "\u0001\u0000\u0000\u0000O\u00f2\u0001\u0000\u0000\u0000Q\u00f6\u0001\u0000" +
                    "\u0000\u0000S\u00ff\u0001\u0000\u0000\u0000U\u010d\u0001\u0000\u0000\u0000" +
                    "W\u010f\u0001\u0000\u0000\u0000Y\u0113\u0001\u0000\u0000\u0000[\u011a" +
                    "\u0001\u0000\u0000\u0000]\u0121\u0001\u0000\u0000\u0000_\u0126\u0001\u0000" +
                    "\u0000\u0000a\u012d\u0001\u0000\u0000\u0000c\u0134\u0001\u0000\u0000\u0000" +
                    "ef\u0005+\u0000\u0000f\u0002\u0001\u0000\u0000\u0000gh\u0005-\u0000\u0000" +
                    "h\u0004\u0001\u0000\u0000\u0000ij\u0005*\u0000\u0000j\u0006\u0001\u0000" +
                    "\u0000\u0000kl\u0005/\u0000\u0000l\b\u0001\u0000\u0000\u0000mn\u0005=" +
                    "\u0000\u0000n\n\u0001\u0000\u0000\u0000op\u0005(\u0000\u0000p\f\u0001" +
                    "\u0000\u0000\u0000qr\u0005)\u0000\u0000r\u000e\u0001\u0000\u0000\u0000" +
                    "st\u0005{\u0000\u0000t\u0010\u0001\u0000\u0000\u0000uv\u0005}\u0000\u0000" +
                    "v\u0012\u0001\u0000\u0000\u0000wx\u0005,\u0000\u0000x\u0014\u0001\u0000" +
                    "\u0000\u0000yz\u0005.\u0000\u0000z\u0016\u0001\u0000\u0000\u0000{|\u0005" +
                    ";\u0000\u0000|\u0018\u0001\u0000\u0000\u0000}~\u0005:\u0000\u0000~\u001a" +
                    "\u0001\u0000\u0000\u0000\u007f\u0080\u0005<\u0000\u0000\u0080\u001c\u0001" +
                    "\u0000\u0000\u0000\u0081\u0082\u0005<\u0000\u0000\u0082\u0083\u0005=\u0000" +
                    "\u0000\u0083\u001e\u0001\u0000\u0000\u0000\u0084\u0085\u0005<\u0000\u0000" +
                    "\u0085\u0086\u0005-\u0000\u0000\u0086 \u0001\u0000\u0000\u0000\u0087\u0088" +
                    "\u0005=\u0000\u0000\u0088\u0089\u0005>\u0000\u0000\u0089\"\u0001\u0000" +
                    "\u0000\u0000\u008a\u008b\u0005~\u0000\u0000\u008b$\u0001\u0000\u0000\u0000" +
                    "\u008c\u008d\u0005@\u0000\u0000\u008d&\u0001\u0000\u0000\u0000\u008e\u008f" +
                    "\u0007\u0000\u0000\u0000\u008f\u0090\u0007\u0001\u0000\u0000\u0090\u0091" +
                    "\u0007\u0002\u0000\u0000\u0091(\u0001\u0000\u0000\u0000\u0092\u0093\u0005" +
                    "t\u0000\u0000\u0093\u0094\u0007\u0003\u0000\u0000\u0094\u0095\u0007\u0004" +
                    "\u0000\u0000\u0095\u0096\u0007\u0005\u0000\u0000\u0096*\u0001\u0000\u0000" +
                    "\u0000\u0097\u0098\u0005f\u0000\u0000\u0098\u0099\u0007\u0006\u0000\u0000" +
                    "\u0099\u009a\u0007\u0007\u0000\u0000\u009a\u009b\u0007\b\u0000\u0000\u009b" +
                    "\u009c\u0007\u0005\u0000\u0000\u009c,\u0001\u0000\u0000\u0000\u009d\u009e" +
                    "\u0007\t\u0000\u0000\u009e\u009f\u0007\n\u0000\u0000\u009f.\u0001\u0000" +
                    "\u0000\u0000\u00a0\u00a1\u0007\n\u0000\u0000\u00a1\u00a2\u0007\t\u0000" +
                    "\u0000\u00a20\u0001\u0000\u0000\u0000\u00a3\u00a4\u0007\u0002\u0000\u0000" +
                    "\u00a4\u00a5\u0007\u000b\u0000\u0000\u00a5\u00a6\u0007\u0005\u0000\u0000" +
                    "\u00a6\u00a7\u0007\u0000\u0000\u0000\u00a72\u0001\u0000\u0000\u0000\u00a8" +
                    "\u00a9\u0007\u0005\u0000\u0000\u00a9\u00aa\u0007\u0007\u0000\u0000\u00aa" +
                    "\u00ab\u0007\b\u0000\u0000\u00ab\u00ac\u0007\u0005\u0000\u0000\u00ac4" +
                    "\u0001\u0000\u0000\u0000\u00ad\u00ae\u0007\f\u0000\u0000\u00ae\u00af\u0007" +
                    "\u0006\u0000\u0000\u00af\u00b0\u0007\b\u0000\u0000\u00b0\u00b1\u0007\u0005" +
                    "\u0000\u0000\u00b16\u0001\u0000\u0000\u0000\u00b2\u00b3\u0007\u0005\u0000" +
                    "\u0000\u00b3\u00b4\u0007\b\u0000\u0000\u00b4\u00b5\u0007\u0006\u0000\u0000" +
                    "\u00b5\u00b6\u0007\f\u0000\u0000\u00b68\u0001\u0000\u0000\u0000\u00b7" +
                    "\u00b8\u0007\r\u0000\u0000\u00b8\u00b9\u0007\u000b\u0000\u0000\u00b9\u00ba" +
                    "\u0007\t\u0000\u0000\u00ba\u00bb\u0007\u0007\u0000\u0000\u00bb\u00bc\u0007" +
                    "\u0005\u0000\u0000\u00bc:\u0001\u0000\u0000\u0000\u00bd\u00be\u0007\u0007" +
                    "\u0000\u0000\u00be\u00bf\u0007\u0001\u0000\u0000\u00bf\u00c0\u0007\u0001" +
                    "\u0000\u0000\u00c0\u00c1\u0007\u000e\u0000\u0000\u00c1<\u0001\u0000\u0000" +
                    "\u0000\u00c2\u00c3\u0007\u000e\u0000\u0000\u00c3\u00c4\u0007\u0001\u0000" +
                    "\u0000\u00c4\u00c5\u0007\u0001\u0000\u0000\u00c5\u00c6\u0007\u0007\u0000" +
                    "\u0000\u00c6>\u0001\u0000\u0000\u0000\u00c7\u00c8\u0007\f\u0000\u0000" +
                    "\u00c8\u00c9\u0007\u0007\u0000\u0000\u00c9\u00ca\u0007\u0006\u0000\u0000" +
                    "\u00ca\u00cb\u0007\b\u0000\u0000\u00cb\u00cc\u0007\b\u0000\u0000\u00cc" +
                    "@\u0001\u0000\u0000\u0000\u00cd\u00ce\u0007\t\u0000\u0000\u00ce\u00cf" +
                    "\u0007\u0000\u0000\u0000\u00cfB\u0001\u0000\u0000\u0000\u00d0\u00d1\u0007" +
                    "\t\u0000\u0000\u00d1\u00d2\u0007\u000b\u0000\u0000\u00d2\u00d3\u0007\u0005" +
                    "\u0000\u0000\u00d3\u00d4\u0007\u0003\u0000\u0000\u00d4\u00d5\u0007\t\u0000" +
                    "\u0000\u00d5\u00d6\u0007\u0002\u0000\u0000\u00d6\u00d7\u0007\b\u0000\u0000" +
                    "\u00d7D\u0001\u0000\u0000\u0000\u00d8\u00d9\u0007\u0001\u0000\u0000\u00d9" +
                    "\u00da\u0007\n\u0000\u0000\u00daF\u0001\u0000\u0000\u0000\u00db\u00dc" +
                    "\u0007\u0007\u0000\u0000\u00dc\u00dd\u0007\u0005\u0000\u0000\u00dd\u00de" +
                    "\u0007\u0002\u0000\u0000\u00deH\u0001\u0000\u0000\u0000\u00df\u00e0\u0007" +
                    "\u0000\u0000\u0000\u00e0\u00e1\u0007\u0005\u0000\u0000\u00e1\u00e2\u0007" +
                    "\r\u0000\u0000\u00e2J\u0001\u0000\u0000\u0000\u00e3\u00e4\u0007\t\u0000" +
                    "\u0000\u00e4\u00e5\u0007\b\u0000\u0000\u00e5\u00e6\u0007\u000f\u0000\u0000" +
                    "\u00e6\u00e7\u0007\u0001\u0000\u0000\u00e7\u00e8\u0007\t\u0000\u0000\u00e8" +
                    "\u00e9\u0007\u0010\u0000\u0000\u00e9L\u0001\u0000\u0000\u0000\u00ea\u00ec" +
                    "\u0007\u0011\u0000\u0000\u00eb\u00ea\u0001\u0000\u0000\u0000\u00ec\u00ed" +
                    "\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ee" +
                    "\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\u00f0" +
                    "\u0006&\u0000\u0000\u00f0N\u0001\u0000\u0000\u0000\u00f1\u00f3\u0007\u0012" +
                    "\u0000\u0000\u00f2\u00f1\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000" +
                    "\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000" +
                    "\u0000\u0000\u00f5P\u0001\u0000\u0000\u0000\u00f6\u00fa\u0005\"\u0000" +
                    "\u0000\u00f7\u00f9\u0007\u0013\u0000\u0000\u00f8\u00f7\u0001\u0000\u0000" +
                    "\u0000\u00f9\u00fc\u0001\u0000\u0000\u0000\u00fa\u00f8\u0001\u0000\u0000" +
                    "\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb\u00fd\u0001\u0000\u0000" +
                    "\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fd\u00fe\u0005\"\u0000\u0000" +
                    "\u00feR\u0001\u0000\u0000\u0000\u00ff\u0100\u0005-\u0000\u0000\u0100\u0101" +
                    "\u0005-\u0000\u0000\u0101\u0105\u0001\u0000\u0000\u0000\u0102\u0104\u0007" +
                    "\u0013\u0000\u0000\u0103\u0102\u0001\u0000\u0000\u0000\u0104\u0107\u0001" +
                    "\u0000\u0000\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0105\u0106\u0001" +
                    "\u0000\u0000\u0000\u0106\u0108\u0001\u0000\u0000\u0000\u0107\u0105\u0001" +
                    "\u0000\u0000\u0000\u0108\u0109\u0005-\u0000\u0000\u0109\u010a\u0005-\u0000" +
                    "\u0000\u010aT\u0001\u0000\u0000\u0000\u010b\u010e\u0003)\u0014\u0000\u010c" +
                    "\u010e\u0003+\u0015\u0000\u010d\u010b\u0001\u0000\u0000\u0000\u010d\u010c" +
                    "\u0001\u0000\u0000\u0000\u010eV\u0001\u0000\u0000\u0000\u010f\u0110\u0005" +
                    "I\u0000\u0000\u0110\u0111\u0005n\u0000\u0000\u0111\u0112\u0005t\u0000" +
                    "\u0000\u0112X\u0001\u0000\u0000\u0000\u0113\u0114\u0005S\u0000\u0000\u0114" +
                    "\u0115\u0005t\u0000\u0000\u0115\u0116\u0005r\u0000\u0000\u0116\u0117\u0005" +
                    "i\u0000\u0000\u0117\u0118\u0005n\u0000\u0000\u0118\u0119\u0005g\u0000" +
                    "\u0000\u0119Z\u0001\u0000\u0000\u0000\u011a\u011b\u0005O\u0000\u0000\u011b" +
                    "\u011c\u0005b\u0000\u0000\u011c\u011d\u0005j\u0000\u0000\u011d\u011e\u0005" +
                    "e\u0000\u0000\u011e\u011f\u0005c\u0000\u0000\u011f\u0120\u0005t\u0000" +
                    "\u0000\u0120\\\u0001\u0000\u0000\u0000\u0121\u0122\u0007\u0014\u0000\u0000" +
                    "\u0122\u0123\u0005a\u0000\u0000\u0123\u0124\u0005i\u0000\u0000\u0124\u0125" +
                    "\u0005n\u0000\u0000\u0125^\u0001\u0000\u0000\u0000\u0126\u012a\u0007\u0015" +
                    "\u0000\u0000\u0127\u0129\u0007\u0016\u0000\u0000\u0128\u0127\u0001\u0000" +
                    "\u0000\u0000\u0129\u012c\u0001\u0000\u0000\u0000\u012a\u0128\u0001\u0000" +
                    "\u0000\u0000\u012a\u012b\u0001\u0000\u0000\u0000\u012b`\u0001\u0000\u0000" +
                    "\u0000\u012c\u012a\u0001\u0000\u0000\u0000\u012d\u0131\u0007\u0017\u0000" +
                    "\u0000\u012e\u0130\u0007\u0018\u0000\u0000\u012f\u012e\u0001\u0000\u0000" +
                    "\u0000\u0130\u0133\u0001\u0000\u0000\u0000\u0131\u012f\u0001\u0000\u0000" +
                    "\u0000\u0131\u0132\u0001\u0000\u0000\u0000\u0132b\u0001\u0000\u0000\u0000" +
                    "\u0133\u0131\u0001\u0000\u0000\u0000\u0134\u0135\t\u0000\u0000\u0000\u0135" +
                    "d\u0001\u0000\u0000\u0000\u000b\u0000\u00ed\u00f4\u00f8\u00fa\u0103\u0105" +
                    "\u010d\u012a\u012f\u0131\u0001\u0006\u0000\u0000";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    private static final String[] _LITERAL_NAMES = makeLiteralNames();
    private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);
    public static String[] channelNames = {
            "DEFAULT_TOKEN_CHANNEL", "HIDDEN"
    };
    public static String[] modeNames = {
            "DEFAULT_MODE"
    };

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

    public CoolGrammarLexer(CharStream input) {
        super(input);
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    private static String[] makeRuleNames() {
        return new String[]{
                "PLUS", "MINUS", "MUL", "DIV", "EQUALS", "LPAREN", "RPAREN", "LBRACE",
                "RBRACE", "COMMA", "DOT", "SEMICOLON", "COLON", "LESS", "LESSOREQUALS",
                "ASSIGN", "CASE_ARROW", "TILDE", "ATSYM", "NOT", "TRUE", "FALSE", "IF",
                "FI", "THEN", "ELSE", "CASE", "ESAC", "WHILE", "LOOP", "POOL", "CLASS",
                "IN", "INHERITS", "OF", "LET", "NEW", "ISVOID", "WS", "NUM", "STRING_VALUE",
                "COMMENT", "BOOL_CONST", "INT", "STRING", "OBJECT", "MAIN", "TYPE", "ID",
                "ERROR"
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
    public String[] getChannelNames() {
        return channelNames;
    }

    @Override
    public String[] getModeNames() {
        return modeNames;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }
}