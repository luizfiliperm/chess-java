package models.chess.pieces;

import models.boardgame.Board;
import models.boardgame.Position;
import models.chess.ChessPiece;
import models.chess.Color;

public class Knight extends ChessPiece{
    
    public Knight(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "N";
    }
    
    @Override
    public boolean[][] possibleMoves() {
        boolean mat[][] = new boolean[getBoard().getRows()][getBoard().getColumns()];
        Position p = new Position(0, 0);

        // up left
        p.setValues(position.getRow()-2, position.getColumn()-1);
        if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p) || getBoard().positionExists(p) && isThereOpponentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }

        // up right
        p.setValues(position.getRow()-2, position.getColumn()+1);
        if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p) || getBoard().positionExists(p) && isThereOpponentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }

        // right up
        p.setValues(position.getRow()-1, position.getColumn()+2);
        if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p) || getBoard().positionExists(p) && isThereOpponentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }

        // right down
        p.setValues(position.getRow()+1, position.getColumn()+2);
        if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p) || getBoard().positionExists(p) && isThereOpponentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }

        // down right
        p.setValues(position.getRow()+2, position.getColumn()+1);
        if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p) || getBoard().positionExists(p) && isThereOpponentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }

        // down left
        p.setValues(position.getRow()+2, position.getColumn()-1);
        if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p) || getBoard().positionExists(p) && isThereOpponentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }

        // left down
        p.setValues(position.getRow()+1, position.getColumn()-2);
        if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p) || getBoard().positionExists(p) && isThereOpponentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }

        // left up
        p.setValues(position.getRow()-1, position.getColumn()-2);
        if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p) || getBoard().positionExists(p) && isThereOpponentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }
        


        return mat;
    }
}
