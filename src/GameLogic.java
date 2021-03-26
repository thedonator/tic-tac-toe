public class GameLogic {

  public static int fullCells = 0;
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

  public static void checkVerticalWin()
  {
    if((Board.signs[0][0] == "X" &&
    Board.signs[1][0] == "X" &&
    Board.signs[2][0] == "X") ||
    (Board.signs[0][1] == "X" &&
    Board.signs[1][1] == "X" &&
    Board.signs[2][1] == "X") || 
    (Board.signs[0][2] == "X" &&
    Board.signs[1][2] == "X" &&
    Board.signs[2][2] == "X"))
    {
      System.out.println("The player "+
      Board.playerNames[0] + " has won the game");
      Game.hasEnded = true;
    }
    if((Board.signs[0][0] == "O" &&
    Board.signs[1][0] == "O" &&
    Board.signs[2][0] == "O") ||
    (Board.signs[0][1] == "O" &&
    Board.signs[1][1] == "O" &&
    Board.signs[2][1] == "O") || 
    (Board.signs[0][2] == "O" &&
    Board.signs[1][2] == "O" &&
    Board.signs[2][2] == "O"))
    {
      System.out.println("The player "+
      Board.playerNames[1] + " has won the game");
      Game.hasEnded = true;
    }
  }

  public static void checkHorizontalWin()
  {
    if((Board.signs[0][0] == "X" &&
    Board.signs[0][1] == "X" &&
    Board.signs[0][2] == "X") ||
    (Board.signs[1][0] == "X" &&
    Board.signs[1][1] == "X" &&
    Board.signs[1][2] == "X") || 
    (Board.signs[2][0] == "X" &&
    Board.signs[2][1] == "X" &&
    Board.signs[2][2] == "X"))
    {
      System.out.println("The player "+
      Board.playerNames[0] + " has won the game");
      Game.hasEnded = true;
    }
    if((Board.signs[0][0] == "O" &&
    Board.signs[0][1] == "O" &&
    Board.signs[0][2] == "O") ||
    (Board.signs[1][0] == "O" &&
    Board.signs[1][1] == "O" &&
    Board.signs[1][2] == "O") || 
    (Board.signs[2][0] == "O" &&
    Board.signs[2][1] == "O" &&
    Board.signs[2][2] == "O"))
    {
      System.out.println("The player "+
      Board.playerNames[1] + " has won the game");
      Game.hasEnded = true;
    }
  }

  public static void checkPar()
  {
    for (int i = 0; i < 3; i++) 
    {
      for (int j = 0; j < 3; j++) {
        if(Board.isEmpty[i][j]) fullCells ++;
      }
    }

    if(GameLogic.fullCells == 9) Game.hasEnded = true;
  }

  public static void controlWin()
  {
    GameLogic.checkDiagonalWin();
    if(!Game.hasEnded) GameLogic.checkHorizontalWin();
    if(!Game.hasEnded) GameLogic.checkVerticalWin();
    if(!Game.hasEnded) GameLogic.checkPar();
  }
}
