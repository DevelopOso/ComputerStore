package mundopc.model;

public class Mouse extends InputDevice {
    private final int idMouse;
    private static int counterMouse;

    public Mouse(String inputType, String brand) {
        super(inputType, brand);
        idMouse = ++counterMouse;
    }

    public int getIdMouse() {
        return idMouse;
    }

    @Override
    public String toString() {
        return "mouse [" +
                "idMouse=" + idMouse +
                ", ]" + super.toString();
    }
}
