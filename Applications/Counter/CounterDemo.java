public class CounterDemo {

  public static void main(String[] args) {

    Counter aCounter = new Counter();

    System.out.println("Current count is: " + aCounter.getCount() + "\n");

    /* Displays count after invoking .incrementCount() method */
    System.out.println("After incrementing by 1...");
    aCounter.incrementCount();
    aCounter.displayCount();
    System.out.println("\n");

    /* Displays count after invoking .incrementCount() method once more */
    System.out.println("After incrementing by another 1...");
    aCounter.incrementCount();
    aCounter.displayCount();
    System.out.println("\n");

    /* Displays count after invoking .decrementCount() method */
    System.out.println("After decrementing by 1...");
    aCounter.decrementCount();
    aCounter.displayCount();
    System.out.println("\n");

    /* Displays count after invoking .decrementCount() method once more */
    System.out.println("After decrementing by another 1...");
    aCounter.decrementCount();
    aCounter.displayCount();
  }
}
