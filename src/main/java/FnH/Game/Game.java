package FnH.Game;

import FnH.Board.Gameboard;
import java.util.Scanner;

public class Game {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Gameboard myGame = new Gameboard();
    do{
      myGame.PrintBoard();
      int row;
      int col;
      do{
        System.out.println("Player: " + myGame.GetCurrentToken() + ", enter an empty row and column to move to!");
        row = in.nextInt() -1;
        col = in.nextInt() -1;

      }while (myGame.NextStep(row, col));
      myGame.ChangeSide();

    }while (myGame.IsFoxWin());
  }
}