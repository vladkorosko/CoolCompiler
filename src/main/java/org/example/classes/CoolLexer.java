package org.example.classes;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.example.generated.CoolLexerGrammar;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CoolLexer {
    private final CoolLexerGrammar lexer;
    private final List<Token> tokens;
    private List<Token> errors;
    private List<String> outputTokens;

    public CoolLexer(String fileName) {
        CharStream charStream;
        try {
            charStream = CharStreams.fromFileName(fileName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        lexer = new CoolLexerGrammar(charStream);
        CommonTokenStream tokensStream = new CommonTokenStream(lexer);
        tokensStream.fill();
        tokens = tokensStream.getTokens();
        LexTokens();
    }

    private void LexTokens() {
        outputTokens = new ArrayList<>();
        errors = new ArrayList<>();
        String[] ruleNames = lexer.getRuleNames();

        for (Token token : tokens) {
            if (token.getType() > 0) {
                if (ruleNames[token.getType() - 1].equals("ERROR")) {
                    errors.add(token);
                } else {
                    outputTokens.add(Integer.toString(token.getLine()));
                    outputTokens.add(ruleNames[token.getType() - 1]);
                    if (Objects.equals(ruleNames[token.getType() - 1], "ID"))
                        outputTokens.add(token.getText());
                }
            }
        }

        if (errors.size() > 0)
            PrintError();
    }

    public void WriteTokens(String outputFilePath) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath));
            for (String token : outputTokens) {
                writer.write(token + "\n");
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void PrintError() {
        for (Token errorToken : errors) {
            System.out.print("\nLexical error in line: " + errorToken.getLine());
            System.out.print("\nLexical error: " + errorToken.getText());
        }
        System.exit(0);
    }
}
