import java.util.Scanner;

public class GetMoves {

  public static void getX(Scanner in)
  {
    System.out.println(Board.playerNames[Turn.currentTurn] +
    " Insert X move:");
    Board.xMove = in.nextInt() -1;

  }


  public static void getY(Scanner in)
  {
    System.out.println(Board.playerNames[Turn.currentTurn] +
    " Insert Y move:");
    Board.yMove = in.nextInt()-1;
  }

}
