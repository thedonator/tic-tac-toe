import java.util.Scanner;

public class GetMoves {

  public static void getX(Scanner in)
  {
    System.out.println(Board.playerNames[Turn.currentTurn] +
    " Insert X move:");

    //we put -1 because we get in input numbers from 1 to 3
    //but the arrays go from 0 to 2 so whe don't have to change indexes
    //when we are inserting the values
    Board.xMove = in.nextInt() -1;

  }


  public static void getY(Scanner in)
  {
    System.out.println(Board.playerNames[Turn.currentTurn] +
    " Insert Y move:");
    Board.yMove = in.nextInt()-1;
  }

}
