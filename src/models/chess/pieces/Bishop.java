package models.chess.pieces;

import models.boardgame.Board;
import models.chess.ChessPiece;
import models.chess.Color;

public class Bishop extends ChessPiece {

    public Bishop(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "B";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean mat[][] = new boolean[getBoard().getRows()][getBoard().getColumns()];
        return mat;
    }
    
}
