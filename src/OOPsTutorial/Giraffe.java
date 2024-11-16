package OOPsTutorial;

public class Giraffe extends Creature{
    String name;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
