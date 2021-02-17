package com.sudoku;

import com.sudoku.userinterface.UserInterface;
import javafx.application.Application;
import javafx.stage.Stage;



public class SudokuApplication extends Application {
    private UserInterface userInterface;

    @Override
    public void start(Stage primaryStage) throws Exception {
        userInterface = new UserInterface(primaryStage);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
