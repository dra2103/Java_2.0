import java.util.ArrayList;

public class Order {
    // Memebr Variables
    private String name;
    private boolean ready;
    private ArrayList<Item>items;

    // ############## Constructors ####################
    public Order(){
        this.name = "guest";
        this.ready = false;
        this.items = new ArrayList<Item>();

    }

    // overload constructor
    public Order(String name){
        this.name = name;
        this.ready = false;
        this.items = new ArrayList<Item>();
    }

    //############### Setter and Getter #################

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public boolean getReady(){
        return this.ready;
    }

    public void setReady(boolean ready){
        this.ready = ready;
    }

    public ArrayList getItems(){
        return this.items;
    }

    public void setItems(ArrayList<Item> items){
        this.items = items;
    }

    // ################ Methods ####################

    public void addItem(Item item){
        this.items.add(item);
    }

    public String getStatusMessage(){
        if(this.ready == true){
            return "Your order is ready";
        } else{
            return "Thank you for waiting. Your order will be ready soon";
        }
    }

    public double getOrderTotal(){
        double total = 0.0;
        for (Item i: this.items){
            total += i.getPrice();
        }
        return total;
    }

    public void display(){
        System.out.printf("Customer name: %s\n", this.name);
        for(Item i : this.items){
            System.out.println(i.getName() + "- $" + i.getPrice());
        }
        System.out.println("Total is: $" + this.getOrderTotal());
    }

}