package com.lzj;

import com.lzj.antlrs.LzjAntlrLexer;

import com.lzj.antlrs.LzjAntlrParser;
import com.lzj.common.LParseListener;
import com.lzj.utils.Utils;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {

        LzjAntlrLexer l = Utils.getLexer("./test.txt");
        CommonTokenStream tokens = new CommonTokenStream(l);
        LzjAntlrParser parser = new LzjAntlrParser(tokens);
        parser.setBuildParseTree(true);
        LzjAntlrParser.ProgramContext root = parser.program();
        System.out.println(Utils.getAreasVariable(root).toString());  // using first

       Trees.inspect(root, parser);

        LParseListener lParseListener = new LParseListener();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(lParseListener, root);



        // launch(args);
    }
}
