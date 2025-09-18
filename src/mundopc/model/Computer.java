package mundopc.model;

public class Computer {
    private final int idComputer;
    private String name;
    private Monitor monitor;
    private Keyboard keyboard;
    private Mouse mouse;
    private static int computerCounter = 0;

    public Computer(){
        this.idComputer = ++computerCounter;
    }

    public Computer(String name, Monitor monitor, Keyboard keyboard, Mouse mouse) {
        this();
        this.name = name;
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

    public int getIdComputer() {
        return idComputer;
    }

    public String getName() {
        return name;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "idComputer=" + idComputer +
                ", name='" + name + '\'' +
                ", \n monitor=" + monitor +
                ", \n keyboard=" + keyboard +
                ", \n mouse=" + mouse +
                '}';
    }
}
