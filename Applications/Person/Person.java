public class Person {

  private static String name;
  private static int age;

  public Person() {
    name = "No name yet";
    age = 0;
  }

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public void setAge() {
    this.age = age;
  }

  public void setName(String first, String last) {
    this.name = first + " " + last;
  }

  public void setName(String name) {
    this.name = name;
  }

  public static Person createToddler() {
    return new Person("A toddler:", 2);
  }

  public static Person createPreschooler() {
    return new Person("A preschooler:", 5);
  }

  public static Person createAdolescent() {
    return new Person("An adolescent:", 9);
  }

  public static Person createTeenager() {
    return new Person("A teenager", 15);
  }

  public static Person createAdult() { /* Assumes you have a Person constructor */
    return new Person("An adult:", 21); /* Creating Person object with keyword "new" */
  } /* Returning a new instance of the Person object that's inside the Person class */

  public void displayOutput() {
    System.out.println(name + " " + age);
  }

}
