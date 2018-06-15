import java.util.*;

public class RPS
{
  public static void main(String[] args)
  {
  System.out.println("Let's play a game of Rock, Paper, Scissors!");
  System.out.println("Please enter R, P, or S for Rock, Paper, and Scissors." + '\n');

  Scanner keyboard = new Scanner(System.in);

  String pOne, pTwo;

  System.out.println("Player 1 enter your choice...");
  pOne = keyboard.nextLine();
  pOne = pOne.toLowerCase();

  System.out.println("Player 2 enter your choice...");
  pTwo = keyboard.nextLine();
  pTwo = pTwo.toLowerCase();

    if (pOne.matches("r") && pTwo.matches("p")) {
      System.out.println("Paper beats rock, Player 2 wins!");
    }

    else if (pOne.matches("r") && pTwo.matches("s")) {
      System.out.println("Rock beats scissors, Player 1 wins!");
    }

    else if (pOne.matches("p") && pTwo.matches("r")) {
      System.out.println("Paper beats rock, Player 1 wins!");
    }

    else if (pOne.matches("p") && pTwo.matches("s")) {
      System.out.println("Scissors beats paper, Player 2 wins!");
    }

    else if (pOne.matches("s") && pTwo.matches("r")) {
      System.out.println("Rock beats scissors, Player 2 wins!");
    }

    else if (pOne.matches("s") &&  pTwo.matches("p")) {
      System.out.println("Scissors beats paper, Player 1 wins!");
    }

    else {
      System.out.println("Nobody wins. It's a draw!");
    }

  }
}
