/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper_gui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import minesweeperfx_board.Board;

/**
 *
 * @author lukas
 */
public class MineSweeperFX extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Board board = new Board(10);
        board.initilizeBoard(10);
        BoardCanvas canvas = new BoardCanvas(board,500,500);
        Button buttonStart = new Button("Start game");
        TextField textFMines = new TextField("10");
        Label labelMines = new Label("Number of mines:");
        TextField textFSize = new TextField("10");
        Label labelSize = new Label("Size of board:");
        buttonStart.setMaxWidth(200);
        buttonStart.setMinWidth(200);
        buttonStart.setMaxHeight(30);
        buttonStart.setMinHeight(30);
        textFMines.setMaxWidth(100);
        textFMines.setMinWidth(100);
        textFMines.setMaxHeight(30);
        textFMines.setMinHeight(30);
        textFSize.setMaxWidth(100);
        textFSize.setMinWidth(100);
        textFSize.setMaxHeight(30);
        textFSize.setMinHeight(30);
        
        
        
        canvas.printBoard();
        
        
        
        StackPane root = new StackPane();
        root.getChildren().add(canvas);
        root.getChildren().add(buttonStart);
        root.getChildren().add(textFMines);
        root.getChildren().add(labelMines);
        root.getChildren().add(textFSize);
        root.getChildren().add(labelSize);
        
        buttonStart.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                root.getChildren().remove(canvas);
                int size = Integer.parseInt(textFSize.getText());
                Board board = new Board(size);
                int mines = Integer.parseInt(textFMines.getText());
                board.initilizeBoard(mines);
                BoardCanvas canvas = new BoardCanvas(board,500,500);
                root.getChildren().add(canvas);
            }
        });
        
        
        
        
        
        Scene scene = new Scene(root, 800, 850);
        
        buttonStart.setTranslateX((root.getWidth()/2)-110);
        buttonStart.setTranslateY(((root.getHeight()*-1)/2)+25);
        textFMines.setTranslateX(75);
        textFMines.setTranslateY(((root.getHeight()*-1)/2)+25);
        labelMines.setTranslateX(-50);
        labelMines.setTranslateY(((root.getHeight()*-1)/2)+25);
        textFSize.setTranslateX((root.getWidth()/-2)+200);
        textFSize.setTranslateY(((root.getHeight()*-1)/2)+25);
        labelSize.setTranslateX((root.getWidth()/-2)+75);
        labelSize.setTranslateY(((root.getHeight()*-1)/2)+25);
        
        
        
        
       
        
        
        primaryStage.setTitle("MineSweeper");
        primaryStage.setScene(scene);
        primaryStage.show();
        
       
           
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
