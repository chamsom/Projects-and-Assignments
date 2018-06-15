import java.util.*;

public class Palindrome
{
  public static void main(String[] args)
  {
    String original, reverse = "";
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Enter a string to see if it's a palindrome");
    original = keyboard.nextLine().toLowerCase();

    int length = original.length();

    for (int i = length - 1; i >= 0; i--)
      reverse = reverse + original.charAt(i);

    if (original.equals(reverse)) {
      System.out.println("Entered string is a palindrome. The reverse of that string is: " + reverse);
    }

    else {
      System.out.println("Entered string is not a palindrome. Please try again.");
    }

  }
}
