import java.util.ArrayList;

public class TestOrders {
    // point of entry for the program
    public static void main(String[] args){


        Item item1 = new Item();
        item1.name = "mocha";
        item1.price = 3.5;

        Item item2 = new Item();
        item2.name = "latte";
        item2.price = 4.5;

        Item item3 = new Item();
        item3.name = "drip coffee";
        item3.price = 2.5;

        Item item4 = new Item();
        item4.name = "capuccino";
        item4.price = 5.5;

        

        Order order1 = new Order();
        order1.name = "Cindhuri";
        order1.ready = true;

        Order order2 = new Order();
        order2.name = "Jimmy";


        Order order3 = new Order();
        order3.name = "Noah";


        Order order4 = new Order();
        order4.name = "Sam";

        // thought it would give me an Error of some sort, gave me 0.0
        System.out.println(order1.total);

        // item1 to order 2
        order2.items.add(item1);
        order2.total += item1.price;

        // order3 ordered cappuccino
        order3.items.add(item4);
        order3.total += item4.price;

        //order4 added a latte
        order4.items.add(item2);
        order4.total += item2.price;

        //Cindhuri's order ready
        order1.ready = true;

        // Sam ordered more drinks - 2 lattes
        order4.items.add(item2);
        order4.items.add(item2);
        order4.total += item2.price *2;

        // Jimmys order is ready
        order2.ready = true;

        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);
        
        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Ready: %s\n", order2.ready);
        
        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Total: %s\n", order3.total);
        System.out.printf("Ready: %s\n", order3.ready);
        
        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Ready: %s\n", order4.ready);
    }
}