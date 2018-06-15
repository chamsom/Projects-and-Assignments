import java.util.*;

public class Counter
{
  private int count = 0;

  public int getCount() {
    return count;
  }

  public int incrementCount() {
    return count++;
  }

  public int decrementCount() {
    return count--;
  }

  public void displayCount() {
    System.out.println("Current count is: " + count);
  }
}
