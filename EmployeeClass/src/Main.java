import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Employee Jeff=new Employee();
        Employee Jack= new Employee("John", "Generic",2600 );
        System.out.println(Jeff.getName());
        System.out.println(Jack.getName());
        System.out.println(Jeff.getId());
        System.out.println(Jack.getId());
        System.out.println(Jeff.getSalary());
        System.out.println(Jack.getSalary());
        System.out.println(Jeff.getYearSalary());
        System.out.println(Jack.getYearSalary());
        System.out.println(Jeff);
        System.out.println(Jack);
        Jeff.raiseSalary(28);
        Jack.raiseSalary(125);
        System.out.println(Jeff.getSalary());
        System.out.println(Jeff.getYearSalary());
        System.out.println(Jack.getSalary());
        System.out.println(Jack.getYearSalary());

    }
}