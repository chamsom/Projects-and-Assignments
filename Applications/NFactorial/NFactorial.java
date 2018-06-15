import java.util.*;

public class NFactorial
{
  public int userInput;

  public void readInput()
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter an integer to view it's equivalent factorial:");
    userInput = keyboard.nextInt();
  }

  public int nFactorial (int n)
  {
    if (n == 0)
      return 1;

    return n * nFactorial (n-1);
  }
}
