import java.util.*;

public class StringNumbers
{
  public static void main(String[] args)
  {
  Scanner keyboard = new Scanner(System.in);

  String sentence;
  int wordCount;

  System.out.println("Enter a sentence and I will return the word count: ");
  sentence = keyboard.nextLine();

  String[] wordArray = sentence.trim().split("\\s+");
  wordCount = wordArray.length;

  System.out.println("The number of words in the sentence are: " + wordCount);
  }
}
