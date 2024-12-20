
abstract class BankAccount {
    protected double balance;

  
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    
    public double checkBalance() {
        return balance;
    }
}


class SavingsAccount extends BankAccount {
    
    public void deposit(double amount) {
      
        balance += amount;
        System.out.println("Amount deposited into Savings Account: " + amount);
    }

    
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Amount withdrawn from Savings Account: " + amount);
        } else {
            System.out.println("Insufficient balance in Savings Account");
        }
    }
}

class CurrentAccount extends BankAccount {
    
    public void deposit(double amount) {
      
        balance += amount;
        System.out.println("Amount deposited into Current Account: " + amount);
    }

    
    public void withdraw(double amount) {
        
        balance -= amount;
        System.out.println("Amount withdrawn from Current Account: " + amount);
    }
}


public class AccountAbs {
    public static void main(String[] args) {
        
        SavingsAccount savingsAcc = new SavingsAccount();
        CurrentAccount currentAcc = new CurrentAccount();

        
        savingsAcc.deposit(2000);
        savingsAcc.withdraw(500);

      
        currentAcc.deposit(3000);
        currentAcc.withdraw(1000);

       
        System.out.println("Savings Account Balance: " + savingsAcc.checkBalance());
        System.out.println("Current Account Balance: " + currentAcc.checkBalance());
    }
}
