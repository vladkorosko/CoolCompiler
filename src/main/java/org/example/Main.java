package org.example;

import org.example.classes.CoolLexer;
import org.example.classes.CoolParser;

public class Main {
    public static void main(String[] args){
        try {
            String fileForCompiler = "coolfiles/test_good_cool_file.cl";
            if (args.length >= 1)
                fileForCompiler = args[0];
            CoolLexer lexer = new CoolLexer(fileForCompiler);
            lexer.WriteTokens(fileForCompiler + "-lexer");
            CoolParser parser = new CoolParser(lexer);
            parser.WriteCST(fileForCompiler + "-parser");
        }
        catch (Exception e){
            System.out.println("Error is:" + e);
        }
    }
}