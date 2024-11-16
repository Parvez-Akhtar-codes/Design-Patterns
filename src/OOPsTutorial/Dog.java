package OOPsTutorial;

public class Dog extends Animal {
    void holedig(){
        System.out.println("digs a hole");
    }
    public Dog(){
        setSound("Bark");

    }

    private void beprivate(){
        System.out.println("Inside a private method");
    }

    public void accessor(){
        beprivate();
    }
}
