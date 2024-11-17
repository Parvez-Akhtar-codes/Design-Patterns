package StrategyPattern;

public class Dog extends Animal{
    public void dighole(){
        System.out.println("digs a hole");
    }
    public Dog(){
        super();
        setSound("bark");

        flytype = new cantfly();
    }
}
