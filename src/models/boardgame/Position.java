package models.boardgame;

public class Position {
    private int row;
    private int column;

    public Position() {
    }

    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public void setColumn(int column) {
        this.column = column;
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
