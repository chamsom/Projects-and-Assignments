import java.util.Scanner;

public class SmallestInteger
{
  public static void main(String[] args)
  {
  System.out.println("Enter three different non-negative integers.");

  Scanner keyboard = new Scanner(System.in);

  int x, y, z, smallestNum;

  x = keyboard.nextInt();
  y = keyboard.nextInt();
  z = keyboard.nextInt();

  if (x < y && x < z) {
    smallestNum = x;
  } else if (y < x && y < z) {
    smallestNum = y;
  } else {
    smallestNum = z;
  }

  System.out.println("The smallest integer is: " + smallestNum);

  }
}
