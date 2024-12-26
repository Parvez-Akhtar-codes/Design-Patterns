package AbstractFactoryDesignPattern;

public class AndroidDeveloper implements Employee {
    @Override
    public int salary() {
        return 50000;
    }
    public void name(){
        System.out.println("I'm Android Developer");
    }
}
