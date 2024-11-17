package StrategyPattern;

public class Bird extends Animal {

    public Bird(){
        super();

        setSound("Tweet");
        flytype = new itflys();
    }
}
