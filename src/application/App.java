package application;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import models.chess.ChessException;
import models.chess.ChessMatch;
import models.chess.ChessPiece;
import models.chess.ChessPosition;

public class App {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();

        List<ChessPiece> captured = new ArrayList<>();

        while(!chessMatch.getCheckMate()){
            try{

                UI.clearScreen();
                UI.printMatch(chessMatch, captured);
                System.out.print("\nSource: ");
                ChessPosition source = UI.readChessPosition(sc);
                
                boolean[][] possibleMoves = chessMatch.possibleMoves(source);
                UI.clearScreen();
                UI.printBoard(chessMatch.getPieces(), possibleMoves);

                System.out.print("\nTarget: ");
                ChessPosition target = UI.readChessPosition(sc);
                
                ChessPiece capturedPiece = chessMatch.performChessMove(source, target); 

                if(capturedPiece != null){
                    captured.add(capturedPiece);
                }
            }
            catch(ChessException e){
                System.out.println(e.getMessage());
                sc.nextLine();
            }
            catch(InputMismatchException e){
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }
        UI.clearScreen();
        UI.printMatch(chessMatch, captured);
        
    }
}
