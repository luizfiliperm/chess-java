package models.chess;

import models.boardgame.Board;
import models.boardgame.Piece;

public class ChessPiece extends Piece {

    private Color color;
    
    public ChessPiece(Board board, Color color, Integer moveCount) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    
    
}
