package models.boardgame;

public class Position {
    private Integer row;
    private Integer column;

    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public Integer getRow() {
        return row;
    }

    public Integer getColumn() {
        return column;
    }



    public void setValues(int row, int column){
        this.column = column;
        this.row = row;
    }

    @Override
    public String toString() {
        return row + ", " + column;
    }

    
}
