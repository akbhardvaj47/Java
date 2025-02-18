import java.util.Scanner;

class BankAccount {
    public void deposit(){
        System.out.println("Deposit Method of Bank Account");
    }
    public void withdraw(){
        System.out.println("withdraw Method of Bank Account");
    }
}
class SavingsAccount extends BankAccount{
    // int money=100;
    public void withdraw(int money){
        if(money<100){
        System.out.println("You have not sufficient balance in your Account");
        }else{
            System.out.println("Withdraw successfully...");
        }
    }
}
public class Bank{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Amount to withdraw");
        int money=scanner.nextInt();
        SavingsAccount obj=new SavingsAccount();
        obj.deposit();
        obj.withdraw(money);
    }
}