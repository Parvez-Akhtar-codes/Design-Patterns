package StrategyPattern;

public interface Fly {
    String fly();
}

 class itflys implements Fly{

    @Override
    public String fly() {
        return "Flying high";
    }
}
 class cantfly implements Fly{
    @Override
    public String fly(){
        return "Can't fly";
    }
}
