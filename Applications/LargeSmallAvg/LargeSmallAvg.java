import java.util.*;

public class LargeSmallAvg
{
  public static void main(String[] args)
  {

  int smallestNum = Integer.MAX_VALUE;
  int largestNum = 0;
  int number;
  double numAvg = 0;
  double numSum = 0;
  int count = 0;

  Scanner keyboard = new Scanner(System.in);

  System.out.println("Please enter a list of nonnegative integers. Enter a negative number when you are finished");
  while(true) {
    number = keyboard.nextInt();

    if (number <= -1) {
      System.out.println("You have entered a negative number, terminating...");
      break;
    }
    else {
      count += 1;
    }

    if (number < smallestNum) {
      smallestNum = number;
    }

    if (number > largestNum) {
      largestNum = number;
    }

    numSum += number;
    numAvg = (numSum / count);
  }

  System.out.println("The smallest number is: " + smallestNum);
  System.out.println("The largest number is: " + largestNum);
  System.out.println("The total sum is: " + numSum);
  System.out.println("The total average is: " + numAvg + "\n");
  System.out.println("Terminating program...");
  }
}
