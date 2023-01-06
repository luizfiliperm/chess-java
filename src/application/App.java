package application;

import models.boardgame.Board;
import models.boardgame.Position;

public class App {
    public static void main(String[] args){
        
        Position position = new Position(3, 5);

        System.out.println(position);

        Board board = new Board(8, 8);
    }
}
