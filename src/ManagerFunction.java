import model.Employee;
import model.FullTime;
import model.PartTime;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagerFunction {
    ArrayList<Employee> listEmployee = new ArrayList<>();
    public ManagerFunction(){

    }
    public static Employee input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Input Full-time employee");
        System.out.println("2. Input Part-time employee");
        int a = sc.nextInt();
        Employee employee = null;
        switch (a){
            case 1:{
                employee = new FullTime();
                System.out.print("Input ID: ");
                employee.setID(sc.next());
                sc.nextLine();
                System.out.print("\nInput Name: ");
                employee.setName(sc.nextLine());
                System.out.print("\nInput date of birth: ");
                employee.setDateOfBirth(sc.next());
                sc.nextLine();
                System.out.print("\nInput salary: ");
                employee.setSalary(sc.nextInt());
                System.out.print("\nInput work day: ");
                ((FullTime) employee).setWorkDay(sc.nextInt());
                break;
            }
            case 2:{
                employee = new PartTime();
                System.out.print("Input ID: ");
                employee.setID(sc.next());
                sc.nextLine();
                System.out.print("\nInput Name: ");
                employee.setName(sc.nextLine());
                System.out.print("\nInput date of birth: ");
                employee.setDateOfBirth(sc.next());
                sc.nextLine();
                System.out.print("\nInput salary: ");
                employee.setSalary(sc.nextInt());
                System.out.print("\nInput work day: ");
                ((PartTime) employee).setWorkDay(sc.nextInt());
                break;
            }
        }
        return employee;
    }
    public static void showAllEmployee(){

    }
    public static void updateEmployeeById(){

    }
    public static void deleteEmployeeById(){

    }
    public static void sortName(){

    }
    public static void getTotalSalaryOfAllEmployee(){

    }
    public static void printMenu(){
        System.out.println("MENU: ");
        System.out.println("1. Input employee (Full-time and part-time)");
        System.out.println("2. Show payroll list");
        System.out.println("3. Update or edit of an employee by ID");
        System.out.println("4. Delete and employee by ID");
        System.out.println("5. Show total salary");
        System.out.println("6. Exit!");
    }
}
