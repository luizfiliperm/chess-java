package models.chess.pieces;

import models.boardgame.Board;
import models.chess.ChessPiece;
import models.chess.Color;

public class Knight extends ChessPiece{
    
    public Knight(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "H";
    }
    
    @Override
    public boolean[][] possibleMoves() {
        boolean mat[][] = new boolean[getBoard().getRows()][getBoard().getColumns()];
        return mat;
    }
}
