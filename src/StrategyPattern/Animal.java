package StrategyPattern;

public class Animal {
    private String name;
    private int weight;
    private int height;
    private int speed;
    private String sound;

    public Fly flytype;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String tryToFly(){
        return flytype.fly();
    }

    public void setFlyingAbility(Fly newFlytype){
        flytype = newFlytype;
    }
}
