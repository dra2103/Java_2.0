public class Cafe{
    public static void main(String [] args){
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage =", your order will be ready shortly";
        String readyMessage =", your order is ready";
        String displayTotalMessage = " Your total is $";

        double mochaPrice = 4.5;
        double dripCoffe = 3.5;
        double latte = 5.5;
        double cappuccino = 6.5;

        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        boolean isReadyOrder1 = true;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;

        System.out.println(generalGreeting + customer1);
        System.out.println(customer1 + pendingMessage);

        if(isReadyOrder4){
            System.out.println(customer4 + readyMessage + displayTotalMessage + cappuccino);
        }else {
            System.out.println(customer4 + pendingMessage);
        }

        System.out.println(customer2 + displayTotalMessage + latte*2);

        if(isReadyOrder2){
            System.out.println(customer2 + readyMessage);
        } else {
            System.out.println(customer2 + pendingMessage);
        }

        System.out.println(customer3 + displayTotalMessage + (latte-dripCoffe));

    }
}