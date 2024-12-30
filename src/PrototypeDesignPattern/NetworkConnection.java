package PrototypeDesignPattern;

public class NetworkConnection implements Cloneable{
    private String ip;
    private String importantData;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getImportantData() {
        return importantData;
    }

    public void setImportantData(String importantData) {
        this.importantData = importantData;
    }

    public void loadedData() throws InterruptedException {
        this.importantData = "this is very important data";
        Thread.sleep(5000);
    }

    @Override
    public String toString() {
        return this.ip+" : "+this.importantData;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
