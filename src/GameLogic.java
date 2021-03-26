public class GameLogic {


  /**
   * 
   * @return returns true if the move in input is valid
   */
  public static boolean isValidXMove()
  {
    return Board.xMove >= 0 && Board.xMove < 4;
  }


  /**
   * 
   * @return returns true if the move in input is valid
   */
  public static boolean isValidYMove()
  {
    return Board.yMove >= 0 && Board.yMove < 4;
  }

  /**
   * The function checks if the current move goes in a cell that is 
   * already full
   * 
   
   * @return returns true if the move in input is valid
   */
  public static boolean isAFreeCell()
  {
    return Board.isEmpty[Board.yMove][Board.xMove];
  }

  public static void checkDiagonalWin()
  {
    if(Board.signs[0][0] == "X" &&
    Board.signs[1][1] == "X" &&
    Board.signs[2][2] == "X")
    {
      System.out.println("The player "+
      Board.playerNames[0] + " has won the game");
      Game.hasEnded = true;
    }

    if(Board.signs[0][0] == "O" &&
    Board.signs[1][1] == "O" &&
    Board.signs[2][2] == "O")
    {
      System.out.println("The player "+
      Board.playerNames[1] + " has won the game");
      Game.hasEnded = true;
    }
  }
  public static void controlWin()
  {
    GameLogic.checkDiagonalWin();
  }
}
