package mx.unam.fi.compilers.g5.team03;

import mx.unam.fi.compilers.g5.team03.*;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Lexer lexer = new Lexer();
        
        String input = args[0];
        
        List<Token> tokens = lexer.tokenize(input);
        
        for(Token token : tokens) 
            System.out.println(token);
        
        System.out.println("Total tokens: " + countTokens(tokens));
    }
    
    private static int countTokens(List<Token> tokens) {
        int cnt = 0;
        
        for(Token token : tokens) {
            if(token.getType() != TokenType.EOF && token.getType() != TokenType.ERROR)
                cnt++;
        }
        return cnt;
    }
}
