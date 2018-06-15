import java.util.Scanner;

public class HateLove
{
  public static void main(String[] args)
  {
  System.out.println("Enter a line of text with the word: hate");

  Scanner keyboard = new Scanner(System.in);

  String userInput = keyboard.nextLine();

  System.out.println("I have replaced that line to read: " + '\n' + userInput.replace("hate", "love"));

  }
}
