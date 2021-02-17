package com.sudoku.userinterface;

import javafx.scene.control.TextField;

public class SudokuTextField extends TextField {
    private final int x;
    private final int y;

    public SudokuTextField(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public void replaceText(int i1, int i2, String s) {
        if(!s.matches("[0-9]")) {
            super.replaceText(i1, i2, s);
        }
    }

    @Override
    public void replaceSelection(String s) {
        if(!s.matches("[0-9]"))
            super.replaceSelection(s);
    }
}
