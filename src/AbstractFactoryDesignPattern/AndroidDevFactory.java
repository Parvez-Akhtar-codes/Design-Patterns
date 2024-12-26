package AbstractFactoryDesignPattern;

public class AndroidDevFactory extends AbstractEmployeeFactory{

    @Override
    public Employee createEmployee() {
        return new AndroidDeveloper();
    }
}
