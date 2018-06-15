public class NFactorialDemo
{
  public static void main(String[] args)
  {
    NFactorial userFactorial = new NFactorial();
    userFactorial.readInput();
    int calculateFactorial = userFactorial.nFactorial();
    System.out.println("The factorial of your integer is: " + calculateFactorial);
  }
}
