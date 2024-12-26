package FactoryDesignPattern;

public class Androideveloper implements Employee{
    @Override
    public int salary() {
        System.out.println("Android developer salary : ");
        return 50000;
    }
}
