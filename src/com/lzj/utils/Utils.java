package com.lzj.utils;

import com.lzj.antlrs.LzjAntlrLexer;
import com.lzj.antlrs.LzjAntlrParser;
import com.lzj.entity.Area;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Utils {

    public static List<Area> areas = new ArrayList<>();

    /**
     * write to file
     *
     * @param path
     * @param context
     * @return
     */
    public static boolean writeFile(String path, String context) {
        try {
            FileWriter writer = new FileWriter(path + "result.txt");
            writer.write(context);
            writer.close();
            return true;
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
    }

    /**
     * read from file
     *
     * @param filePath
     * @return
     */
    public static LzjAntlrLexer getLexer(String filePath) {
        ANTLRInputStream inputStream;
        LzjAntlrLexer lexer = null;
        try {
            inputStream = new ANTLRFileStream(filePath);
            lexer = new LzjAntlrLexer(inputStream);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return lexer;
    }

    /**
     *   read from string list
     * @param sentences
     * @return
     */
    public static LzjAntlrLexer getLexer(List<String> sentences){
        StringBuilder b = new StringBuilder();
        for (String sentence:sentences){
            b.append(sentence);
        }
        ANTLRInputStream inputStream = new ANTLRInputStream(b.toString());
        LzjAntlrLexer lexer = new LzjAntlrLexer(inputStream);
        return lexer;
    }


    /**
     * get the AreasVariables
     *
     * @param root
     * @return
     */

    public static List<Area> getAreasVariable(ParserRuleContext root) {

        /**
         *   we know the areas variable that does not has the tag.so we walk the tree and skip the statement which has tag
         */
        if (root instanceof LzjAntlrParser.ProgramContext) {
            for (LzjAntlrParser.ExpContext state : ((LzjAntlrParser.ProgramContext) root).exp()) {
                getAreasVariable(state);
            }
            return areas;
        }

        /**
         *   when we go to the variable we will save the variable
         //         */
        if (root instanceof LzjAntlrParser.PreStateContext) {
         LzjAntlrParser.PreStateContext ctx = (LzjAntlrParser.PreStateContext) root;
            Area area = new Area();
            if (ctx.not_op() != null) {
                area.result = false;
            }else {
                area.result = true;
            }
            area.var = ctx.var().getText();
            area.predicate = ctx.predicate().getText();
            areas.add(area);
            return areas;
        }

        /**
         *  continual to find the next tree node
         */
        for (int i = 0; i < root.getChildCount(); i++) {
            ParseTree tree = root.getChild(i);
            if (tree instanceof ParserRuleContext) {
                getAreasVariable((ParserRuleContext) tree);
            }
        }
        return areas;
    }


    public static LzjAntlrParser getContext(LzjAntlrLexer lexer) {
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LzjAntlrParser parser = new LzjAntlrParser(tokens);
        return parser;
    }

}
