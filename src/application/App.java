package application;

import models.boardgame.Board;
import models.boardgame.Position;
import models.chess.ChessMatch;

public class App {
    public static void main(String[] args){
        
        ChessMatch chessMatch = new ChessMatch();

        UI.printBoard(chessMatch.getPieces()); 
    }
}
