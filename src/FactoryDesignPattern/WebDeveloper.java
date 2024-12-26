package FactoryDesignPattern;

public class WebDeveloper implements Employee {
    @Override
    public int salary() {
        System.out.println("Web developer salary : ");
        return 40000;
    }
}
