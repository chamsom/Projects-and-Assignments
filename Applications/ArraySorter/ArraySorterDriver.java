import java.util.*;

public class ArraySorterDriver
{
  public static void main(String[] args)
  {
    int[]a = new int[] {14,5,23,44,452,142};
    ArraySorter.bubbleSort(a);
    for (int element : a)
    {
      System.out.print(element + " ");
    }
   System.out.println();

   int[]b = new int[] {15,18,80,42,451,92};
    ArraySorter.bubbleSort(b);
    for (int element : b)
    {
      System.out.print(element + " ");
    }
   System.out.println();
  }
}
