package OOP2;

class BankAccount {
    private String acc_no;
    private String name;
    private double balance;

    // setter method
    public void setData(String a, String n, double b) {
        acc_no = a;
        name = n;
        balance = b;
    }

    // getter method
    public String getAcc_no() {
        return acc_no;
    }

    public String getName() {
        return name;
    }

    // readonly access of balance
    public double getBalance() {
        return balance;
    }

    // controlled access through method
    public void deposit(double amt) {
        if (amt > 0) {
            balance += amt;
            System.out.println("Amount Deposited Successfully");
        } else {
            System.out.println("Invalid Amount");
        }
    }

    public void withdraw(double amt) {
        if (amt > 0 && amt <= balance) {
            balance -= amt;
            System.out.println("Amount Withdrawn Successfully");
            System.out.println("Available Balance: " + balance);
        } else {
            System.out.println("Invalid Amount");
        }
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        acc1.setData("123456", "Alice", 1000.0);
        System.out.println("Account No: " + acc1.getAcc_no());
        System.out.println("Account Holder: " + acc1.getName());
        System.out.println("Initial Balance: " + acc1.getBalance());
        acc1.deposit(500);
        acc1.withdraw(300);
        acc1.withdraw(1500); // Invalid withdrawal
    }
}