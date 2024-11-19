package ObserverDesignPattern;

import java.util.ArrayList;

public class StockGrabber implements Subject{
    private ArrayList<Observer> observers;
    private double ibmprice;
    private double aaplprice;
    private double googprice;

    public StockGrabber(){
        observers = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer newObserver) {
        observers.add(newObserver);
    }

    @Override
    public void unregister(Observer deleteObserver) {
        int observerIndex = observers.indexOf(deleteObserver);
        System.out.println("Observer = "+(observerIndex+1)+" deleted");
        observers.remove(observerIndex);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : observers){
            observer.update(ibmprice , aaplprice , googprice);
        }
    }

    public void setIbmprice(double newibmprice){
        this.ibmprice = newibmprice;
        notifyObserver();
    }

    public void setAaplprice(double newaaplprice){
        this.aaplprice = newaaplprice;
        notifyObserver();
    }

    public void setGoogprice(double newgoogprice){
        this.googprice = newgoogprice;
        notifyObserver();
    }


}
