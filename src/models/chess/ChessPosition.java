package models.chess;

import models.boardgame.Position;

public class ChessPosition {
    private char column;
    private Integer row;

    public ChessPosition(char column, Integer row) {
        if(column < 'a' || column > 'h' || row < 1 || row > 8){
            throw new ChessException("Column or row invalid. Valid values are from a1 to h8");
        }
        this.column = column;
        this.row = row;
    }

    public char getColumn() {
        return column;
    }

    public Integer getRow() {
        return row;
    }


    protected Position toPosition(){
        return new Position(8 - row, column - 'a');
    }

    protected static ChessPosition fromPosition(Position position){
        return new ChessPosition((char)('a' - position.getColumn()), 8 - position.getRow());
    }

    @Override
    public String toString() {
        return "" + column + row;
    }
    
    
}
