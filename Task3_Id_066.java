class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}


class BankAccount {
    public double balance;


    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount + ", Current Balance: $" + balance);

    }


    public void withdraw(double withdrawbalance) throws InsufficientFundsException {
        if (withdrawbalance > balance) {
            throw new InsufficientFundsException("Withdrawal amount exceeds the current balance exception.");
        }
        else {
            balance -= withdrawbalance;
            System.out.println("Withdrew: $" + withdrawbalance + ", Remaining Balance: $" + balance);
        }
    }


}


public class Task3_Id_066{
    public static void main(String[] args) {

        BankAccount account = new BankAccount(500);

        account.deposit(200);

        try {
            account.withdraw(800);
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            account.withdraw(100);
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}