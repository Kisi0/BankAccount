package Bank;

public class SavingsACC extends  BankACC {

    public SavingsACC (String accountNumber, double balance) {
        super(accountNumber, balance);
    }
//modifikimii i metodes me childs nese duam te bejme nje ndryshim tek metoda kryesore

    @Override
    void withdraw(double amount) {
        if(getBalance()-amount<100){
            System.out.println("Minimum balance $100 required!");
        }else{
            super.withdraw(amount);
        }
    }
}
