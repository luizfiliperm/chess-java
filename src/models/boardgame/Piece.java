package models.boardgame;

public abstract class Piece {
    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null;
    }

    protected Board getBoard(){
        return board;
    }

    public abstract boolean[][] possibleMoves();

    public boolean possibleMove(Position position){
        return possibleMoves()[position.getRow()][position.getColumn()];
    }

    public boolean isThereAnyPossibleMove(){
        boolean mat[][] = possibleMoves();
        for(boolean i[] : mat){
            for(boolean j: i){
                if(j){
                    return true;
                }
            }
        }

        return false;
    }
}
