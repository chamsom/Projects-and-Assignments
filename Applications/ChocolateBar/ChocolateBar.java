import java.util.Scanner;

public class ChocolateBar
{
  public static void main(String[] args)
  {
  System.out.println("Please input your weight in pounds, height in inches, and age in years.");

  Scanner keyboard = new Scanner(System.in);

  int pounds = keyboard.nextInt();
  int inches = keyboard.nextInt();
  int years = keyboard.nextInt();

  int chocolateBar = 230;

  double mBMR = 655 + (4.3 * pounds) + (4.7 * inches) - (4.7 * years);
  String convertMBR = String.format("%.1f", mBMR);

  double fBMR = 66 + (6.3 * pounds) + (12.9 * inches) - (6.8 * years);
  String convertFBMR = String.format("%.1f", fBMR);

  double totalMaleBars = mBMR / chocolateBar;
  String convertMBars = String.format("%.1f", totalMaleBars);

  double totalFemaleBars = fBMR / chocolateBar;
  String convertFBars = String.format("%.1f", totalFemaleBars);

  System.out.println("\n" + "As a male, your daily caloric intake to maintain weight is: " + convertMBR + " calories.");
  System.out.println("Consume this many chocolate bars to maintain weight: " + convertMBars + "\n");

  System.out.println("As a female, your daily caloric intake to maintain weight is: " + convertFBMR + " calories.");
  System.out.println("Consume this many chocolate bars to maintain weight: " + convertFBars);
  }
}
