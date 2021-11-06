import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        GLCLexer lex = new GLCLexer(new ANTLRFileStream("E:\\vitor_desktop\\Unisinos\\Tradutores\\trabalho GB\\trabalho\\trabalho_tradutores_GLC\\output\\__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        GLCParser g = new GLCParser(tokens, 49100, null);
        try {
            g.prog();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}