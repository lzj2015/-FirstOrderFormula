package com.lzj;

import com.lzj.antlrs.LzjAntlrParser;
import com.lzj.common.LParseListener;
import com.lzj.utils.Utils;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.antlr.v4.gui.Trees;
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
//0
        LzjAntlrParser parser = Utils.getContext(Utils.getLexer("./test.txt"));
        LzjAntlrParser.ProgramContext root = parser.program();
        Utils.getAreasVariable(root);  // using first

        Trees.inspect(root, parser);
//1
        LParseListener lParseListener = new LParseListener();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(lParseListener, root);
//2
        LzjAntlrParser parserVar = Utils.getContext(Utils.getLexer(LParseListener.allSentences));
        LzjAntlrParser.ProgramContext rootVar  = parserVar.program();
       // Trees.inspect(rootVar, parserVar);


        // launch(args);
    }


}
