import java.util.Scanner;

public class IntegerScan
{
  public static void main(String[] args)
  {

    System.out.println("I will now try to read two integers and display the number of integers that lie between them!");
    System.out.println("Please provide me with 2 integers");

    int n1, n2;
    int totalNumOfInt;

    Scanner keyboard = new Scanner(System.in);
    n1 = keyboard.nextInt();
    n2 = keyboard.nextInt();
    totalNumOfInt = n2 - n1 + 1;

    System.out.println(totalNumOfInt + " integers lie between " + n1 + " and " + n2);
  }
}
