import java.util.ArrayList;
import java.util.Arrays;
public class CafeUtil {

    public int getStreakGoal(){
        int nums = 0;
        for (int i = 0; i <= 10; i++){
            nums += i;
        }
        return nums;
    }

    public double getOrderTotal(double[] prices){
        double sum = 0;
        for ( int i = 0; i < prices.length; i++){
        sum += prices[i];
    }
    return sum;
    }

    public void displayMenu(ArrayList<String>menuItems){
        for(int i = 0; i < menuItems.size(); i++){
            String item = menuItems.get(i);
            System.out.println(i + " " + item);
        }
    }

    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.printf("Hello, %s ", userName );
        System.out.println("There are " + customers.size() + " people in front of you");
        customers.add(userName);
    }
}