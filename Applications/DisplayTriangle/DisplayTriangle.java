import java.util.*;

public class DisplayTriangle
{
  public static void main(String[] args)
  {
  System.out.println("Enter the size of a triangle, pick an integer between 1 to 50.");

  Scanner kb = new Scanner(System.in);

  int sizeOfTriangle, a, b;

  sizeOfTriangle = kb.nextInt();

    for (a = 1; a <= sizeOfTriangle; a++) {
      for (b = 1; b <= a; b++) {
        System.out.print("*");
      }
      System.out.println();
    }

    for (a = sizeOfTriangle - 1; a >= 0; a--) {
      for (b = 1; b <= a; b++) {
        System.out.print("*");
      }
      System.out.println();
    }

  }
}
