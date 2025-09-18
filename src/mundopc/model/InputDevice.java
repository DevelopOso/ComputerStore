package mundopc.model;

public class InputDevice {
    private String inputType;
    private String brand;

    public InputDevice(String inputType, String brand) {
        this.inputType = inputType;
        this.brand = brand;
    }

    public String getInputType() {
        return inputType;
    }
    public String getBrand() {
        return brand;
    }
    public  void setInputType(String inputType) {
        this.inputType = inputType;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "inputDevice [" +
                "inputType=" + inputType +
                ", brand=" + brand + "]";
    }
}
