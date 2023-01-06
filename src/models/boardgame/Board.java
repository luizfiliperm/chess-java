package models.boardgame;

public class Board {
    private Integer rows;
    private Integer columns;
    private Piece[][] pieces;

    public Board(Integer rows, Integer columns) {
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }
    
    public Integer getRows(){
        return rows;
    }
    
    public Integer getColumns(){
        return columns;
    }
    
}
