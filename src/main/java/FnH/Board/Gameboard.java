package FnH.Board;

public class Gameboard {
  private char[][] board;
  char CurrentToken;
  public Gameboard() {
    board = new char[8][8];
    CurrentToken = 'x';
    Fill();
  }
    public void Fill()
    {
      for (int i = 0; i < 8; i++)
      {
        for (int j = 0; j < 8; j++)
        {
          board[i][j] = '0';
      }
    }
  }
  public void PrintBoard()
  {
    System.out.println("---------------");
    for (int i = 0; i < 8; i++)
    {
      System.out.print("| ");
      for (int j = 0; j < 8; j++)
      {
        System.out.print(board[i][j]);
      }
    System.out.print(" |\n");
    }
    System.out.println("---------------");
  }
  public boolean IsFoxWin() {
    boolean FoxWin = true;
    for (int i = 0; i < 8; i++){
      for (int j = 0; j < 8; j++){
        if (board[1][j] == '-'){
          FoxWin = false;
        }
      }
    }
    return FoxWin;
  }
  public char GetCurrentToken(){
    return CurrentToken;
  }
  public boolean NextStep(int row, int col){
    if ((row >= 0) && (row < 8)){
      if ((col >= 0) && (col < 8)){
        if (board [row][col] == '0'){
          board [row][col] =CurrentToken;
          return true;
        }
      }
    }
    return false;
  }
  public void ChangeSide(){
    if  (CurrentToken == '-')
         CurrentToken = 'x';
    else CurrentToken = '-';
  }
}