package org.example.classes;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.example.generated.CoolLexerGrammar;

import java.util.List;

public class CoolLexer {
    private CoolLexerGrammar lexer;
    private CommonTokenStream tokensStream;
    private List<Token> tokens;
    private List<Token> errors;
    private List<String> outputTokens;
}
