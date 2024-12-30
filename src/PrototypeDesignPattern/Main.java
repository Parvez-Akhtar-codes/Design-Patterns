package PrototypeDesignPattern;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Creating an object using prototype");
        NetworkConnection nc1 = new NetworkConnection();
        nc1.setIp("92.78.1.0");
        nc1.loadedData();
        System.out.println(nc1);

        try{
            NetworkConnection nc2 = (NetworkConnection) nc1.clone();
            System.out.println(nc2);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
