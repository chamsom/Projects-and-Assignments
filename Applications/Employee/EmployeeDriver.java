public class EmployeeDriver
{
  public static void main(String[] args)
  {
    Employee a = new Employee();
    a.setName("Anna");
    a.setSalary(6235.7);
    a.setHireDate(12);
    a.setIdNumber("32");
    a.writeOutput();

    Employee b = new Employee();
    b.setName("Bob");
    b.setSalary(2342.4);
    b.setHireDate(11);
    b.setIdNumber("76");
    b.writeOutput();

    if (a.equals(b)) 
      System.out.println("They are equal.");
    else
      System.out.println("They are not equal.");
      System.out.println();
      System.out.println("Anna's salary after the promotion is: "+ a.promote());
  }
}
