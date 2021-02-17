package com.sudoku.domain;

import com.sudoku.states.GameState;
import com.sudoku.utilities.SudokuUtilities;

import java.io.Serializable;

public class SudokuGame implements Serializable {
    private final GameState gameState;
    private final int[][] gridState;

    public SudokuGame(GameState gameState, int[][] gridState) {
        this.gameState = gameState;
        this.gridState = gridState;
    }

    public static final int GRID_BOUNDARY = 9;

    public GameState getGameState() {
        return gameState;
    }

    // We will work with a copy of the grid state
    public int[][] getCopyOfGridState() {
        return SudokuUtilities.copyToNewArray(gridState);
    }
}
