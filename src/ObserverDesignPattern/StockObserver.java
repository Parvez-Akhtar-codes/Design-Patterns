package ObserverDesignPattern;

public class StockObserver implements Observer{
    private double ibmprice;
    private double aaplprice;
    private double googprice;

    private static int ObserverTrackerID = 0;
    private int observerId ;
    private Subject StockGrabber;

    public StockObserver(Subject StockGrabber){
        this.StockGrabber = StockGrabber;
        this.observerId = ++ObserverTrackerID;
        System.out.println("new Observer : "+this.observerId);
        StockGrabber.register(this);
    }
    @Override
    public void update(double ibmprice, double aaplprice, double googprice) {
        this.ibmprice = ibmprice;
        this.aaplprice = aaplprice;
        this.googprice = googprice;
        printThePrices();
    }

    public void printThePrices(){
        System.out.println(observerId  +"\nIBM : "+ibmprice+"\nAAPL : "+aaplprice+"\nGOOG : "+googprice+"\n");
    }


}
