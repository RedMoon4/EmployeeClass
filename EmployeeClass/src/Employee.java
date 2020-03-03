public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private double salary;
    private static int employee =1 ;
    private int percent;

    Employee(){
        id= employee;
        employee++;
        firstName= "  ";
        lastName= " ";
        salary=652 ;
    }

    Employee(String firstName, String lastName, double salary){
        id= employee;
        employee++;
        this.firstName=firstName;
        this.lastName=lastName;
        this.salary=salary;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getName(){
        return firstName+lastName;
    }
    public double getYearSalary(){
        return salary*12;
    }
    public void raiseSalary(double percent){
        double decimalPercent=percent/100;
        double extraMoney=salary*decimalPercent;
        salary=salary+extraMoney;
    }
    public String toString(){
        return "\"Employee [ ID: "+id+", name = "+firstName+lastName+", Salary = $"+salary+ " ]\"";
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static int getEmployeeNum() {
        return employee;
    }

    public static void setEmployeeNum(int employeeNum) {
        Employee.employee = employeeNum;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }
}