package ObserverDesignPattern;
import java.text.DecimalFormat;


public class GetTheStock implements Runnable{

    private int startTime;
    private String stock;
    private double price;

    private Subject stockGrabber;

    public GetTheStock(Subject stockGrabber , int newStarttime , String newstock , double newprice){
        this.stockGrabber = stockGrabber;
        startTime = newStarttime;
        stock = newstock;
        price = newprice;

    }

    @Override
    public void run() {
        for(int i=1; i<=20;i++){
            try{
                Thread.sleep(2000);
            }
            catch (InterruptedException e){}
            double randnum = (Math.random()*(.06))-0.3;

            DecimalFormat df = new DecimalFormat("#.##");

            price = Double.valueOf(df.format(price+randnum));

            if(stock == "IBM") ((StockGrabber)stockGrabber).setIbmprice(price);
            if(stock == "AAPL") ((StockGrabber)stockGrabber).setAaplprice(price);
            if(stock == "GOOG") ((StockGrabber)stockGrabber).setGoogprice(price);

            System.out.println(stock +" : "+df.format(price+randnum)+" "+df.format(randnum));
            System.out.println();
        }
    }
}
