package mundopc.sevice;

import mundopc.model.Computer;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final int idOrder;
    private final List<Computer> computers;
    private static int orderCounter;

    public Order(){
        computers = new ArrayList<>();
        idOrder = ++orderCounter;
    }

    public void addComputer(Computer computer){
        computers.add(computer);
    }

    public void showOrder(){
        System.out.println("Order: " + idOrder);
        System.out.println("Total computadoras: " + computers.size());
        computers.forEach(System.out::println);
    }
}
