package models.chess.pieces;

import models.boardgame.Board;
import models.boardgame.Position;
import models.chess.ChessPiece;
import models.chess.Color;

public class Pawn extends ChessPiece{

    public Pawn(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "P";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean mat[][] = new boolean[getBoard().getRows()][getBoard().getColumns()];
        Position p = new Position(0,0);

        // above

        // if(getColor() == Color.WHITE){
        //     p.setValues(position.getRow()-1, position.getColumn());
        //     if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
        //         mat[p.getRow()][p.getColumn()] = true;
        //         p.setRow(p.getRow() - 1);
        //     }  

        //     p.setValues(position.getRow()-1, position.getColumn());
        //     if(getMoveCount() == 0){
        //         for
        //     }
        //     if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p) && getMoveCount() == 0){
        //         mat[p.getRow()][p.getColumn()] = true;
        //         p.setRow(p.getRow() - 1);
        //     }
            
        // }

        return mat;
    }
    
    
}
