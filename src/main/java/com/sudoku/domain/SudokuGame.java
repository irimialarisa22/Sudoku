package com.sudoku.domain;

public class SudokuGame {
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

    public int[][] getGridState() {
        return gridState;
    }
}