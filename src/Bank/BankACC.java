package Bank;
import java.util.LinkedList;


//    Write a Java program to create a class known as "BankAccount" with methods
//        called deposit() and withdraw(). Create a subclass called SavingsAccount that overrides the withdraw()
//        method to prevent withdrawals if the account balance falls below one hundred.


public class BankACC {
    String accountNumber;
    double balance;

    public BankACC (String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void  deposit(double amount){
        balance+=amount;
    }
    void  withdraw(double amount){
        if(balance>=amount){
            balance-=amount;
        }else{
            System.out.println("Insufficient balance");
        }
    }

    double getBalance(){
        return  balance;
    }
}