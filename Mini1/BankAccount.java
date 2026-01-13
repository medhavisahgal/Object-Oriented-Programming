package Mini1;

import java.util.*;

class BankAccount {
    private int balance;
    private int pin;

    public BankAccount(int initialBalance, int pin) {
        this.balance = initialBalance;
        this.pin = pin;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean withdraw(int amount, int pin) {
        if (this.pin == pin && amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful");
            return true;
        } else {
            System.out.println("Withdrawal failed");
            return false;
        }
    }

    public int getBalance(int pin) {
        if (this.pin == pin) {
            return balance;
        } else {
            System.out.println("Incorrect PIN");
            return -1;
        }
    }

    public void changePin(int old_pin, int new_pin) {
        if (this.pin == old_pin) {
            this.pin = new_pin;
            System.out.println("PIN change successful");
        } else {
            System.out.println("Incorrect Old PIN. PIN change failed");
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Bank Account System");
        Scanner sc = new Scanner(System.in);
        BankAccount account = null;
        System.out.println("Are you a new user? (yes/no)");
        String userType = sc.nextLine();
        if (userType.equals("yes")) {
            System.out.println("Creating a new account");
            System.out.println("Enter initial deposit amount:");
            int initialDeposit = sc.nextInt();
            System.out.println("Set your 4-digit PIN:");
            int pin = sc.nextInt();
            account = new BankAccount(initialDeposit, pin);
            System.out.println("Account created successfully!");
        } else {
            System.out.println("Please enter your PIN to access your account:");
            int pin = sc.nextInt();
            // For now, we fake an existing account
            account = new BankAccount(0, pin);
            System.out.println("Access granted.");
        }
        // ===== MENU =====
        while (true) {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Change PIN");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Enter amount to deposit:");
                int amount = sc.nextInt();
                account.deposit(amount);
                System.out.println("Deposited successfully.");
            } else if (choice == 2) {
                System.out.println("Enter amount to withdraw:");
                int amount = sc.nextInt();
                System.out.println("Enter your PIN:");
                int enteredPin = sc.nextInt();
                account.withdraw(amount, enteredPin);
            } else if (choice == 3) {
                System.out.println("Enter your PIN:");
                int enteredPin = sc.nextInt();
                int balance = account.getBalance(enteredPin);
                if (balance != -1) {
                    System.out.println("Your balance is: " + balance);
                }
            } else if (choice == 4) {
                System.out.println("Enter old PIN:");
                int oldPin = sc.nextInt();
                System.out.println("Enter new PIN:");
                int newPin = sc.nextInt();
                account.changePin(oldPin, newPin);
            } else if (choice == 5) {
                System.out.println("Thank you for using the bank system!");
                break;
            } else {
                System.out.println("Invalid choice!");
            }
        }
        sc.close();
    }
}
