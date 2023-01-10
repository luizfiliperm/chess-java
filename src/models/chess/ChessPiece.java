package models.chess;

import models.boardgame.Board;
import models.boardgame.Piece;

public abstract class ChessPiece extends Piece {

    private Color color;
    
    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    
    
}
