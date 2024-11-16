package OOPsTutorial;

public class Animal {
    private String name;
    private String height;
    private int weight;
    private String sound;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if(weight<=0){
            System.out.println("Weight can't be zero or less than zero");
        }else {
           this.weight = weight;
        }
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
