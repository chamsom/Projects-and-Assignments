import java.util.Scanner;

public class TwoStrings
{
  public static void main(String[] args)
  {
  String firstString = "Hello";
  int first = firstString.length();

  String secondString = "World!";
  int second = secondString.length();

  String newString = firstString + " " + secondString;
  int combinedString = newString.length();

  System.out.println(firstString + " has " + first + " characters.");
  System.out.println(secondString + " has " + second + " characters.");
  System.out.println("\n");
  System.out.println(newString + " has " + combinedString + " characters.");
  }
}
