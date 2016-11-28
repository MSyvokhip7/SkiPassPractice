package ucu.edu.ua;

import ucu.edu.ua.parent.ClientNumOne;

import java.util.LinkedList;

/**
 * Created by TheOriginMS7 on 28.11.2016.
 */
public class Order {
    private LinkedList<SkipassProcess> items;

    public Order() {
        items = new LinkedList<>();
    }
    public void addItem(SkipassProcess item) {
        items.add(item);
    }

    public String proccessOrder() {
        if (items != null) {
            return "Your order was successful.";}
        else {
                return "Order unsuccessful";
            }
        }

    public static void main(String args[]){
        SkipassProcess skipassprocess = new SkipassProcess();
        ((SkipassProcess)skipassprocess).addClient(new ClientNumOne(1, false));

        System.out.println("Creating card with order... ");
        System.out.println(skipassprocess);

        Order myOrder = new Order();

        myOrder.addItem(skipassprocess);
        System.out.println("Creating order ...");
        System.out.println(myOrder.proccessOrder());
        System.out.println("Order complete successfully!");

    }
}
