import java.util.*;

public class ConvertTemp
{
  public static void main(String[] args)
  {
  System.out.println("Enter a numeric temperature: ");

  Scanner scanner = new Scanner(System.in);

  /*Integer.parseInt is using the .parseInt method converts the string into an integer equivalent.*/
  int num = Integer.parseInt(scanner.next());

  System.out.println("Now enter in C or c for Celsius or F or f for Fahrenheit.");

  /*.next reads input only till the space whereas, .nextLine reads input between spaces. Getting input from user.*/
  String temp = scanner.next();

  int degreesF, degreesC;

    if (temp.equals("C") || temp.equals("c"))
    {
      degreesF = (9 * num / 5) + 32;
      System.out.println("The Fahrenheit temperature conversion is: " + degreesF + " F.");
    }

    else if (temp.equals("F") || temp.equals("f"))
    {
      degreesC = (5 * num / 5) + 32;
      System.out.println("The Celsius temperature conversion is: " + degreesC + " C.");
    }

    else
    {
      System.out.println("ERROR! ERROR! ERROR! Please try again!");
    }

  }
}
