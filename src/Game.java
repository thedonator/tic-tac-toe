import java.util.Scanner;

public class Game {
  public static boolean hasEnded = false;
  
  public static void main(String[] args) {
    
    
    
    Scanner in = new Scanner(System.in);
    Board.initializeGameBoard();
    Board.initializePlayers(in);
    Turn.currentTurn = Turn.startingTurn();
    Board.printBoard();

    while (!hasEnded)
    {
      GetMoves.getX(in);
      GetMoves.getY(in);
      while (!GameLogic.isValidXMove() || 
      !GameLogic.isValidYMove() || 
      !GameLogic.isAFreeCell()) {

        System.out.println("Not a valid move please reinsert:");
        GetMoves.getX(in);
        GetMoves.getY(in);
      }
      Board.updateBoard(in);
      Board.printBoard();
      GameLogic.controlWin();
      Turn.changeTurn(Turn.currentTurn);
    }
  }
}

