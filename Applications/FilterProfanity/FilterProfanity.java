import java.util.*;

public class FilterProfanity
{
  public static void main(String[] args)
  {
  System.out.println("Write a sentence with either cat, dog, or llama.");

  Scanner keyboard = new Scanner(System.in);

  String cat, dog, llama, userInput;

  userInput = keyboard.nextLine();

  userInput = userInput.toLowerCase();

    if (userInput.matches(".*\\bcat\\b.*")) {
      userInput = userInput.replaceAll("\\bcat\\b", "***");
      System.out.println("How profane! I have altered your post to appear as: "  + userInput);
    }

    else if (userInput.matches(".*\\bdog\\b.*")) {
      userInput = userInput.replaceAll("\\bdog\\b", "***");
      System.out.println("How profane! I have altered your post to appear as: "  + userInput);
    }

    else if (userInput.matches(".*\\bllama\\b.*")) {
      userInput = userInput.replaceAll("\\bllama\\b", "*****");
      System.out.println("How profane! I have altered your post to appear as: "  + userInput);
    }

    else {
      System.out.println("No profanity detected!");
    }

  }
}
