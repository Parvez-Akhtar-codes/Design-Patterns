package FactoryDesignPattern;

public class DeveloperClient {
    public static void main(String[] args) {


        Employee employee = EmployeeFactory.getEmployee("android developer");
        System.out.println(employee);
        int salary = employee.salary();
        System.out.println("Employee salary : "+salary);
    }
}
