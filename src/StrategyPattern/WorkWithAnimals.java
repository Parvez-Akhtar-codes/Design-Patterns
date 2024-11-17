package StrategyPattern;

public class WorkWithAnimals {
    public static void main(String[] args) {
        Animal doggy  = new Dog();
        Animal tweety = new Bird();

        System.out.println("Dog : "+doggy.tryToFly());
        System.out.println("Bird : "+tweety.tryToFly());

        doggy.setFlyingAbility(new itflys());
        System.out.println("Dog : "+doggy.tryToFly());
    }
}
