package com.sudoku.userinterface;

public interface EventListener {
    void onSudokuInput(int x, int y, int input);
    void onDialogClick();
}
