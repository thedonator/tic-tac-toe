public class Turn {

  /**
   *
   * @return returns a number between 0 and 1
   * this number is used to determine what player makes the
   * first move
   */
  public static int startingTurn()
  {
    return (int) (Math.random()*2);
  }

  public static void changeTurn(int currentTurn)
  {
    if (currentTurn == 0)
    {
      currentTurn = 1;
    }else{
      currentTurn = 0;
    }
  }
}
