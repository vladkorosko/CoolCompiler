package org.example;

import org.example.classes.CoolLexer;

public class Main {
    public static void main(String[] args){
        try {
            String fileForLexing = "coolfiles/test_good_cool_file.cl";
            if (args.length >= 1)
                fileForLexing = args[0];
            CoolLexer lexer = new CoolLexer(fileForLexing);
            lexer.WriteTokens(fileForLexing + "-lex");
        }
        catch (Exception e){
            System.out.println("Error is:" + e);
        }
    }
}