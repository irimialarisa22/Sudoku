package com.sudoku.utilities;

import com.sudoku.domain.SudokuGame;

public class SudokuUtilities {

    /*
    * Creates and returns a new Array with the same values as the inputted array
    * i represents x-indexes and j represents y-indexes
     */
    public static int[][] copyToNewArray(int[][] oldArray) {
        int[][] newArray = new int[SudokuGame.GRID_BOUNDARY][SudokuGame.GRID_BOUNDARY];
        for (int i = 0; i < SudokuGame.GRID_BOUNDARY; i++){
            for (int j = 0; j < SudokuGame.GRID_BOUNDARY; j++ ){
                newArray[i][j] = oldArray[i][i];
            }
        }
        return newArray;
    }
}
