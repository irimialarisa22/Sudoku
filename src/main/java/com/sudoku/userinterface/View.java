package com.sudoku.userinterface;

import com.sudoku.domain.SudokuGame;

public interface View {
    void setListener(EventListener listener);
    //update a single square after user input
    void updateSquare(int x, int y, int input);

    //update the entire board, such as after game completion or initial execution of the program
    void updateBoard(SudokuGame game);
    void showDialog(String message);
    void showError(String message);
}
