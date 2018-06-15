public class PersonDriver {

  public static void main(String[] args) {

    Person personOne = new Person();
    personOne.createToddler().displayOutput();
    personOne.createPreschooler().displayOutput();
    personOne.createAdolescent().displayOutput();
    personOne.createTeenager().displayOutput();
    personOne.createAdult().displayOutput();

  }

}
