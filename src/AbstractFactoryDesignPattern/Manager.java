package AbstractFactoryDesignPattern;

public class Manager implements Employee{
    @Override
    public int salary() {
        return 60000;
    }

    @Override
    public void name() {
        System.out.println("I'm manager");
    }
}
