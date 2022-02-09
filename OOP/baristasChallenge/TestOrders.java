import java.util.ArrayList;

public class TestOrders {
    // point of entry for the program
    public static void main(String[] args){

        Item item1 = new Item ("Drip coffee", 3.5);
        Item item2 = new Item ("Latte", 4.5);
        Item item3 = new Item ("cappucino", 5.5);
        Item item4 = new Item ("Mocha", 6.5);
        
        // 2 unspecified orders
        Order order1 = new Order();
        Order order2 = new Order();
        System.out.println(order1.getName());
        System.out.println(order2.getName());

        order1.setReady(true);
        System.out.println(order1.getStatusMessage());

        // 3 with names
        Order order3 = new Order("Bob");
        Order order4 = new Order("Carl");
        Order order5 = new Order("Nancy");

        System.out.println(order3.getName());
        System.out.println(order4.getName());
        System.out.println(order5.getName());


        // addItem method used 2 times on each order
        order1.addItem(item2);
        order1.addItem(item3);
        order2.addItem(item1);
        order2.addItem(item4);
        order3.addItem(item2);
        order3.addItem(item3);
        order4.addItem(item4);
        order4.addItem(item3);


        // getStatusMessage funcinality
        order1.setReady(false);
        order2.setReady(true);
        System.out.println(order1.getStatusMessage());
        System.out.println(order2.getStatusMessage());

        // getOrderTotal
        System.out.println(order2.getOrderTotal());
        System.out.println(order3.getOrderTotal());

        // display
        order1.display();
        order2.display();
        order3.display();
        order4.display();

    }
}