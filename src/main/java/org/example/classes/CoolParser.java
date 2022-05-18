package org.example.classes;

import org.antlr.v4.runtime.tree.ParseTree;
import org.example.generated.CoolGrammarParser;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CoolParser {
    public CoolGrammarParser coolParser;

    public CoolParser(CoolLexer lexer) {

        coolParser = new CoolGrammarParser(lexer.tokensStream);
        coolParser.removeErrorListeners();
        coolParser.addErrorListener(ParserErrorListener.ParserErrorListenerObject);
    }

    public void WriteCST(String outFilePath) {
        ParseTree Tree = coolParser.program();
        String tree = Tree.toStringTree(coolParser);
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outFilePath));
            bufferedWriter.write(tree);
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
