import java.util.ArrayList;

public class TestBankAccount{
    // point of entry for program
    public static void main(String[] args){

        BankAccount account1 = new BankAccount();
        System.out.println(account1.getCheckingBalance());
        System.out.println(account1.getSavingsBalance());

        account1.depositMoney("checking", 1500.00);
        account1.depositMoney("savings", 2000.00);
        System.out.println(account1.getCheckingBalance());
        System.out.println(account1.getSavingsBalance());

        account1.withdrawMoney("checking", 500.00);
        account1.withdrawMoney("savings", 500.00);
        System.out.println(account1.getCheckingBalance());
        System.out.println(account1.getSavingsBalance());

        System.out.println(account1.getTotalAmount());
    
    }


}