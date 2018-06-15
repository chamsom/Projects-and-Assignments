import java.util.*;

public class Circle
{
  private String color;
  private double radius;
  private static double PI = 3.14;

  public String getColor()
  {
    return color;
  }

  public void setColor(String color)
  {
    this.color = color;
  }

  public double getRadius()
  {
    return radius;
  }

  public void setRadius(double radius)
  {
    this.radius = radius;
  }

  public void display()
  {
    System.out.println("I am a Circle.");
    System.out.println("My color is: " + getColor());
    System.out.println("My radius is: " + getRadius());
  }

  public double computeArea()
  {
    return PI * radius * radius;
  }

  public double computeCircumference()
  {
    return 2 * PI * radius;
  }
}
