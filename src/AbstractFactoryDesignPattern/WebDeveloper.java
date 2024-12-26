package AbstractFactoryDesignPattern;

public class WebDeveloper implements Employee{
    @Override
    public int salary() {
        return 40000;
    }

    @Override
    public void name() {
        System.out.println("I'm Web Developer");
    }
}
