package OOPs02;


// Encapsulated class
class BankAccount {
    private double balance; // Private variable (data hiding)

    // Constructor
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Getter method to access private balance
    public double getBalance() {
        return balance;
    }

    // Setter method to modify balance safely
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
}

// Main class to interact with encapsulated data
public class Encapsulation_19 {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(5000);

        System.out.println("Current Balance: " + myAccount.getBalance());
        myAccount.deposit(1000);
        System.out.println("Updated Balance: " + myAccount.getBalance());
    }
}

