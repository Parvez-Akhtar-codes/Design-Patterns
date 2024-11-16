package OOPsTutorial;

public class WorkWithAnimals {
    public static void main(String[] args) {
        Dog grover  = new Dog();
        grover.setName("grover");
        System.out.println(grover.getName());

        grover.holedig();

        grover.setWeight(0);

        Animal doggy = new Dog();
        Animal katty = new Cat();

        System.out.println("Doggy says = " +doggy.getSound());
        System.out.println("katty says = " +katty.getSound());

        Animal[] animals = new Animal[4];
        animals[0] = new Cat();
        animals[1] = new Dog();

        System.out.println("animals says = " +animals[0].getSound());

        grover.accessor();

        Giraffe Frank = new Giraffe();
        Frank.setName("Frank");
        System.out.println("Girrafe name is = "+Frank.getName());


    }
}
