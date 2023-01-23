package models.chess.pieces;

import models.boardgame.Board;
import models.boardgame.Position;
import models.chess.ChessMatch;
import models.chess.ChessPiece;
import models.chess.Color;

public class Pawn extends ChessPiece{

    private ChessMatch chessMatch;

    public Pawn(Board board, Color color, ChessMatch chessMatch) {
        super(board, color);
        this.chessMatch = chessMatch;
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

        if(getColor() == Color.WHITE){

            p.setValues(position.getRow()-1, position.getColumn());
                for(int i = 0; i < 2;i++){
                    if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
                        mat[p.getRow()][p.getColumn()] = true;
                        p.setRow(p.getRow() - 1);
                    }
                    if(i == 0){
                        i = getMoveCount() == 0 ? 0 : 1;
                    }
                }
            
            // diagonal up left
            p.setValues(position.getRow() - 1, position.getColumn() - 1);
            if(getBoard().positionExists(p) && isThereOpponentPiece(p)){
                mat[p.getRow()][p.getColumn()] = true;
            }

            // diagonal up right
            p.setValues(position.getRow() - 1, position.getColumn() + 1);
            if(getBoard().positionExists(p) && isThereOpponentPiece(p)){
                mat[p.getRow()][p.getColumn()] = true;
            }

            // En Passant - White

            // Left
            if(position.getRow() == 3){
                Position left = new Position(position.getRow(), position.getColumn() - 1);
                if(getBoard().positionExists(left) && isThereOpponentPiece(left) && getBoard().piece(left) == chessMatch.getEnPassantVulnerable()){
                    mat[position.getRow() - 1][position.getColumn() - 1] = true;
                }

            }

            // Right
            if(position.getRow() == 3){
                Position right = new Position(position.getRow(), position.getColumn() + 1);
                if(getBoard().positionExists(right) && isThereOpponentPiece(right) && getBoard().piece(right) == chessMatch.getEnPassantVulnerable()){
                    mat[position.getRow() - 1][position.getColumn() + 1] = true;
                }

            }
        }

        // below
        else{
            p.setValues(position.getRow() + 1, position.getColumn());
                for(int i = 0; i < 2;i++){
                    if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
                        mat[p.getRow()][p.getColumn()] = true;
                        p.setRow(p.getRow()+1);
                    }
                    if(i == 0){
                        i = getMoveCount() == 0 ? 0 : 1;
                    }
                }

            // diagonal down left
            p.setValues(position.getRow() + 1, position.getColumn() - 1);
            if(getBoard().positionExists(p) && isThereOpponentPiece(p)){
                mat[p.getRow()][p.getColumn()] = true;
            }

            // diagonal down right
            p.setValues(position.getRow() + 1, position.getColumn() + 1);
            if(getBoard().positionExists(p) && isThereOpponentPiece(p)){
                mat[p.getRow()][p.getColumn()] = true;
            }

            // En Passant - Black

            // Left
            if(position.getRow() == 4){
                Position left = new Position(position.getRow(), position.getColumn() - 1);
                if(getBoard().positionExists(left) && isThereOpponentPiece(left) && getBoard().piece(left) == chessMatch.getEnPassantVulnerable()){
                    mat[position.getRow() + 1][position.getColumn() - 1] = true;
                }

            }

            // Right
            if(position.getRow() == 4){
                Position right = new Position(position.getRow(), position.getColumn() + 1);
                if(getBoard().positionExists(right) && isThereOpponentPiece(right) && getBoard().piece(right) == chessMatch.getEnPassantVulnerable()){
                    mat[position.getRow() + 1][position.getColumn() + 1] = true;
                }

            }
        }

        return mat;
    }
    
    
}
