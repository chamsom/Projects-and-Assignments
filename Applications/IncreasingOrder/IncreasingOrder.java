import java.util.*;

public class IncreasingOrder
{
  public static void main(String[] args)
  {
  System.out.println("Enter three non-negative integers on three separate lines.");

  Scanner keyboard = new Scanner(System.in);

  int a, b, c;

  a = keyboard.nextInt();
  b = keyboard.nextInt();
  c = keyboard.nextInt();

  Integer [] numArray = {a, b, c};
  Arrays.sort(numArray);

  System.out.println("Your numbers in increasing order are: " + Arrays.toString(numArray));
  }
}
