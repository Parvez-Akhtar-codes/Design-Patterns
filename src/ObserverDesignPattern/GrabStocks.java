package ObserverDesignPattern;

public class GrabStocks {
    public static void main(String[] args) {
        StockGrabber stockGrabber = new StockGrabber();

        StockObserver stockObserver1 = new StockObserver(stockGrabber);

        stockGrabber.setIbmprice(197.00);
        stockGrabber.setAaplprice(677.60);
        stockGrabber.setGoogprice(676.40);

        StockObserver stockObserver2 = new StockObserver(stockGrabber);
        stockGrabber.setIbmprice(197.00);
        stockGrabber.setAaplprice(677.60);
        stockGrabber.setGoogprice(676.40);

        stockGrabber.unregister(stockObserver1);

        stockGrabber.setIbmprice(197.00);
        stockGrabber.setAaplprice(677.60);
        stockGrabber.setGoogprice(676.40);

        Runnable getIBM = new GetTheStock(stockGrabber , 2 , "IBM",197.00);
        Runnable getAAPL = new GetTheStock(stockGrabber , 2 , "AAPL",677.60);
        Runnable getGOOG = new GetTheStock(stockGrabber , 2 , "GOOG",676.40);

        new Thread(getIBM).start();
        new Thread((getAAPL)).start();
        new Thread((getGOOG)).start();

    }
}
