import java.util.Scanner;

public class EvenOdd
{
  public static void main(String[] args)
  {
  System.out.println("Even or Odd?");
  System.out.println("Please input a number.");

  int x;

  Scanner keyboard = new Scanner(System.in);

  x = keyboard.nextInt();

  if (x % 2 == 0) {
    System.out.println("Your number is even!");
  }
  else {
    System.out.println("Your number is odd!");
  }
  }
}
