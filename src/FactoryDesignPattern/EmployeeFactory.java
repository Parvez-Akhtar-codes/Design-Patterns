package FactoryDesignPattern;

public class EmployeeFactory {
    public static Employee getEmployee(String emptype){
        if(emptype.trim().equalsIgnoreCase("Android developer")){
            return new Androideveloper();
        } else if (emptype.trim().equalsIgnoreCase("Web developer")) {
            return new WebDeveloper();
        }else {
            return null;
        }
    }
}
