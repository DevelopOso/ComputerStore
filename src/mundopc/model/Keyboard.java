package mundopc.model;

public class Keyboard extends  InputDevice {
    private final int idKeyboard;
    private static int counterKeyboard;

    public Keyboard(String inputType, String brand) {
        super(inputType, brand);
        this.idKeyboard = ++counterKeyboard;
    }

    public int getIdKeyboard() {
        return idKeyboard;
    }

    @Override
    public String toString() {
        return "keyboard [" +
                "idKeyboard=" + idKeyboard +
                ", ]" + super.toString();
    }
}
