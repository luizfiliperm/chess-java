package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import models.chess.ChessException;
import models.chess.ChessMatch;
import models.chess.ChessPiece;
import models.chess.ChessPosition;

public class App {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();
        
        while(true){
            try{

                UI.clearScreen();
                UI.printBoard(chessMatch.getPieces());
                System.out.print("\nSource: ");
                ChessPosition source = UI.readChessPosition(sc);
                
                System.out.print("\nTarget: ");
                ChessPosition target = UI.readChessPosition(sc);
                
                ChessPiece capturedPiece = chessMatch.performChessMove(source, target); 
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
    }
}
