import java.util.*;

public class Circle
{
  private int radius;
  private String color;

  Circle(int radius, String color) {
    this.radius = radius;
    this.color = color;
  }

  public void display() {
    System.out.println("I am a circle.");
    System.out.println("My color is: " + color);
    System.out.println("My radius is: " + radius);
    System.out.println();
  }

  public int doubleRadius() {
    radius = radius * 2;
    return radius;
  }
}
