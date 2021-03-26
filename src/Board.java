import java.util.Scanner;

public class Board {
  public static int rows = 3;
  public static int columns = 3;
  public static int xMove = -1;
  public static int yMove = -1;

  public static boolean [][] isEmpty  = new boolean [rows][columns];
  public static String [][] signs  = new String [rows][columns];
  public static String [] playerNames = new String [2];

  public static void initializePlayers(Scanner in)
  {
    for (int i = 0; i < 2 ; i++) {
      System.out.println("Insert player name:");
      playerNames[i] = in.nextLine();
    }
  }

  public static void initializeGameBoard()
  {
    for (int i = 0; i < columns; i++) {
      for (int j = 0; j < rows; j++) {
        isEmpty[i][j] = true;
        signs[i][j] = " ";
      }
    }
  }

  public static void printBoard()
  {
    System.out.println("   1   2   3");
    System.out.println(" +---+---+---+");
    System.out.println("1| "+ signs[0][0] +" | "+ signs[0][1]+" | "+ signs[0][2]+" |");
    System.out.println(" +---+---+---+");
    System.out.println("2| "+ signs[1][0] +" | "+ signs[1][1]+" | "+ signs[1][2]+" |");
    System.out.println(" +---+---+---+");
    System.out.println("3| "+ signs[2][0] +" | "+ signs[2][1]+" | "+ signs[2][2]+" |");
    System.out.println(" +---+---+---+");
  }

  public static void updateBoard(Scanner in)
  {
    if (Turn.currentTurn == 0) {
     Board.signs[Board.yMove][Board.xMove] = "X";
    } else {
      Board.signs[Board.yMove][Board.xMove] = "O";
    }
    Board.isEmpty[Board.yMove][Board.xMove] = false;
  }
}
