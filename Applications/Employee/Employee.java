public class Employee extends Person
{
  private double salary;
  private int hireDate;
  private String idNumber;

  public Employee() {
    super();
    salary = 0;
    hireDate = 0;
    idNumber = "Unknown ID number";
  }

  public Employee(String name, double salary,int hireDate,String idNumber) {
    super(name);
    this.salary=salary;
    this.hireDate = hireDate;
    this.idNumber = idNumber;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public void setHireDate(int hireDate) {
    this.hireDate = hireDate;
  }

  public void setIdNumber(String idNumber) {
    this.idNumber = idNumber;
  }

  public double getSalary() {
    return salary;
  }

  public int getHireDate() {
    return hireDate;
  }

  public String getIdNumber()
  {
    return idNumber;
  }

  public boolean equals(Employee employee) {
    return this.getName().equals(employee.getName()) && this.salary==employee.salary && this.hireDate==employee.hireDate && this.idNumber==employee.idNumber;
  }

  public void writeOutput() {
    System.out.println("Name: " + this.getName());
    System.out.println("Salary: $" + salary);
    System.out.println("Hire Date: " + hireDate);
    System.out.println("ID Number: " + idNumber);
    System.out.println();
  }

  public double promote() {
    return 2*salary;
  }
}
