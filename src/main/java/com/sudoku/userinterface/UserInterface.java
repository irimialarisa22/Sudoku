package com.sudoku.userinterface;

import com.sudoku.domain.SudokuGame;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class UserInterface implements View, EventHandler<KeyEvent> {
    private EventListener listener;

    private final Stage stage;
    private final Group group;

    //Size of the window
    private static final double WINDOW_Y = 732;
    private static final double WINDOW_X = 668;

    private static final Color WINDOW_BACKGROUND_COLOR = Color.rgb(102, 204, 255);

    public UserInterface(Stage stage) {
        this.stage = stage;
        this.group = new Group();
        initializeUserInterface();
    }

    private void initializeUserInterface() {
        drawBackground(group);
        stage.show();
    }

    private void drawBackground(Group group) {
        Scene scene = new Scene(group, WINDOW_X, WINDOW_Y);
        scene.setFill(WINDOW_BACKGROUND_COLOR);
        stage.setScene(scene);
    }

    @Override
    public void setListener(EventListener listener) {
        this.listener = listener;
    }

    @Override
    public void updateSquare(int x, int y, int input) {

    }

    @Override
    public void updateBoard(SudokuGame game) {

    }

    @Override
    public void showDialog(String message) {

    }

    @Override
    public void showError(String message) {

    }

    @Override
    public void handle(KeyEvent event) {

    }
}
