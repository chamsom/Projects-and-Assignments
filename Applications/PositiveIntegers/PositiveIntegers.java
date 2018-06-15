import java.util.*;

public class PositiveIntegers
{
  public static void main (String[] args)
  {
  Scanner keyboard = new Scanner(System.in);
  System.out.println("Enter integers to be summed up.");

  int userInput = 0;
  int sum = 0;

    while (userInput >= 0) {
      userInput = keyboard.nextInt();
      sum += userInput;
      System.out.println("You entered: " + userInput + " The sum of your integers is: " + sum);
    }

    if (userInput < 0) {
      System.out.println("You have entered a negative number, terminating now...");
    }
  }
}
