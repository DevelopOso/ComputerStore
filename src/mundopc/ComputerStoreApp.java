package mundopc;

import mundopc.model.Computer;
import mundopc.model.Keyboard;
import mundopc.model.Monitor;
import mundopc.model.Mouse;
import mundopc.sevice.Order;

public class ComputerStoreApp {

    public  static void main(String[] args) {

        Mouse firstMouse = new Mouse("Bluetooth", "Lenovo");
        //System.out.println(firstMouse);
        Keyboard firstKeyboard = new Keyboard("Bluetooth", "Lenovo");
        //System.out.println(firstKeyboard);
        Monitor firstMonitor = new Monitor("Bluetooth", 27);
        //System.out.println(firstMonitor);

        Computer firstComputer = new Computer("Computador Lenovo", firstMonitor, firstKeyboard, firstMouse);
        //System.out.println(firstComputer);

        Mouse secondMouse = new Mouse("USB", "Dell");
        Keyboard secondKeyboard = new Keyboard("USB", "Dell");
        Monitor secondMonitor = new Monitor("USB", 24);
        Computer secondComputer = new Computer("Computador Dell", secondMonitor, secondKeyboard, secondMouse);

        Order firstOrder = new Order();
        firstOrder.addComputer(firstComputer);
        firstOrder.addComputer(secondComputer);
        firstOrder.showOrder();

        Monitor thirdMonitor = new Monitor("WIFI", 30);
        Keyboard thirdKeyboard = new Keyboard("WIFI", "Mac");
        Mouse thirdMouse = new Mouse("WIFI", "Mac");
        Computer thirdComputer = new Computer("Computador Mac", thirdMonitor, thirdKeyboard, thirdMouse);

        Order secondOrder = new  Order();
        secondOrder.addComputer(thirdComputer);
        secondOrder.showOrder();
    }
}
