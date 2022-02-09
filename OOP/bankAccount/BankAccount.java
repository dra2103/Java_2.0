
public class BankAccount{
    
    // ############################ Attributes ##########################
    private double checkingBalance;
    private double savingsBalance;
    private static double totalAmount; 
    private static int numberOfAccounts = 0;


    // ########################### Constructor ##########################
    public BankAccount(){
        this.checkingBalance = 0.0;
        this.savingsBalance = 0.0;
        numberOfAccounts ++;

    }

    // ####################### Deposit Money ########################
    public void depositMoney(String accountType, double cash){
        if (accountType == "checking"){
            this.checkingBalance += cash;
            this.totalAmount += cash;
        } 
        if
            (accountType == "savings"){
            this.savingsBalance += cash;
            this.totalAmount += cash;
            }
        }

    // ###################### Withdraw Money ##########################
    public void withdrawMoney(String accountType, double cash){
        if (accountType == "checking" && getCheckingBalance() >= cash){
            this.checkingBalance -= cash;
            this.totalAmount -= cash;
        } else if (accountType == "savings" && getSavingsBalance() >= cash){
            this.savingsBalance -= cash;
            this.totalAmount -= cash;
        } else {
            System.out.println("Insufficient funds");
        }
    }
    
    // ###################### Getters #############################

    public static double getTotalAmount(){
        return totalAmount;
    }

    public static int getNumberOfAccounts(){
        return numberOfAccounts;
    }

    public double getCheckingBalance(){
        return this.checkingBalance;
    }

    public double getSavingsBalance(){
        return this.savingsBalance;
    }
}