import java.util.*;

class BankAccount{
    protected double balance;
    public BankAccount(double initbal){
        balance = initbal;
    }
    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        balance -= amount;
    }
}

class SavingsAccount extends BankAccount{

    public SavingsAccount(double initbal){
        super(initbal);
    }
    @Override
    public void withdraw(double amount){
        if(balance-amount>=100){
            balance -= amount;
        }else{
            System.out.println("Withdrawal failed. Minimum balance of $100 must be maintained.");
        }
    }
}

public class bank_iob {
    public static void main(String[] args) {
       
                SavingsAccount sc = new SavingsAccount(200);
                sc.deposit(100);
                sc.withdraw(50); 
                sc.withdraw(100); 
                System.out.println("Current balance: $" + sc.balance);
            }
        }

