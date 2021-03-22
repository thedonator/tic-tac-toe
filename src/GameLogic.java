import java.util.Scanner;

public class GameLogic {

  public static boolean isValidXMove(Scanner in)
  {
    return Board.xMove >= 0 && Board.xMove < 4;
  }

  public static boolean isValidYMove(Scanner in)
  {
    return Board.yMove >= 0 && Board.yMove < 4;
  }

  public static boolean hasTheRightsToBeMoved(Scanner in)
  {
    return Board.isEmpty[Board.yMove][Board.xMove];
  }
}
