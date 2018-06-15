import java.util.Scanner;

public class BirthdayWizard
{
  public static void main(String[] args)
  {
  System.out.println("Greetings Human!");
  System.out.println("I will now try and compute your nth birthday or if it has occurred!");

  int birthYear;
  int age;

  Scanner keyboard = new Scanner(System.in);

  System.out.println("What's your year of birth?");
  birthYear = keyboard.nextInt();

  System.out.println("How old are you?");
  age = keyboard.nextInt();

  System.out.println("You will be: " + age + " in " + (birthYear + age));
  }
}
