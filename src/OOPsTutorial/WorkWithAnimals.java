package OOPsTutorial;

public class WorkWithAnimals {
    public static void main(String[] args) {
        Dog grover  = new Dog();
        grover.setName("grover");
        System.out.println(grover.getName());

        grover.holedig();

        grover.setWeight(0);
    }
}
