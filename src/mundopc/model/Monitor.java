package mundopc.model;

public class Monitor {
    private final int idMonitor;
    private String brand;
    private double size;
    private static int counterMonitor;

    public Monitor() {
        this.idMonitor = ++counterMonitor;
    }

    public Monitor(String brand, double size) {
        this();
        this.brand = brand;
        this.size = size;
    }

    public int getIdMonitor() {
        return idMonitor;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "monitor [" +
                "idMonitor=" + idMonitor +
                ", brand=" + brand +
                ", size=" + size + " inches]";
    }
}
