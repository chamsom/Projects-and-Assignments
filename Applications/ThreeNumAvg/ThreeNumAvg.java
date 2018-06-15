import java.util.Scanner;

public class ThreeNumAvg
{
  public static void main(String[] args)
  {
  System.out.println("I will take 3 whole numbers and display the average.");
  System.out.println("Input 3 whole numbers.");

  double n1, n2, n3;

  /* Make sure your data type is correct. Double does not truncate values. */

  Scanner keyboard = new Scanner(System.in);
  n1 = keyboard.nextInt();
  n2 = keyboard.nextInt();
  n3 = keyboard.nextInt();

  double avg = (n1 + n2 + n3) / 3;

  /* Method: Variable avg w/ data type double, stores the result of (n1 + n2 + n3) / 3. */

  System.out.println("The average of your 3 numbers is: " + avg);
  }
}
