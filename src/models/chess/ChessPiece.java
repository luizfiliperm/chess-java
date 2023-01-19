package models.chess;

import models.boardgame.Board;
import models.boardgame.Piece;
import models.boardgame.Position;

public abstract class ChessPiece extends Piece {

    private Color color;
    private Integer moveCount = 0;
    
    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public Integer getMoveCount(){
        return moveCount;
    }

    public void increaseMoveCount(){
        moveCount++;
    }

    public void decreaseMoveCount(){
        moveCount--;
    }

    public ChessPosition getChessPosition(){
        return ChessPosition.fromPosition(position);
    }

    protected boolean isThereOpponentPiece(Position position){
        ChessPiece p = (ChessPiece)getBoard().piece(position);
        return p != null & p.getColor() != color;
    }
    
}
