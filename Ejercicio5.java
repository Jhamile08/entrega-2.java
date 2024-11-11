
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio5 implements Ejecutable{
    private int countNumber;
    private double balance;
    private String holder;
    private List<String> transactionHistory;

    public Ejercicio5() {
    }
    public Ejercicio5(int countNumber, double balance, String holder) {
        this.countNumber = countNumber;
        this.balance = balance;
        this.holder = holder;
        this.transactionHistory = new ArrayList<>();
    }
    public int getCountNumber() {
        return countNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getHolder() {
        return holder;
    }

    public void deposit(double quantity){
        if( quantity <= 0){
            System.out.println("the quantity to deposit can not be negative");
        } else {
            balance += quantity;
            transactionHistory.add("Deposit: $"+ quantity);
            System.out.println("Now, your balance are: "+ balance);
        }
    }

    public void withdraw(double quantity){
        if(quantity > balance){
            System.out.println("You don't have enough money for this withdraw");
        }else {
            balance -= quantity;
            transactionHistory.add("withdraw: $"+ quantity);
            System.out.println("withdraw succesful, your balance are: "+ balance);
        }
    }

    public void showTransactions(){
        System.out.println("---------- history ----------");
        for (String transaction : transactionHistory) {
            System.out.println(transaction);
        }
        System.out.println("------------------------------");
    }
    
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the account number: ");
        int accountNumber = scanner.nextInt();
        System.out.print("Enter the account holder's name: ");
        String holderName = scanner.next();
        System.out.print("Enter the initial balance: ");
        double initialBalance = scanner.nextDouble();
    
        // Create the bank account with the entered details
        Ejercicio5 account = new Ejercicio5(accountNumber, initialBalance, holderName);
    
        int option;
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Deposit money");
            System.out.println("2. Withdraw money");
            System.out.println("3. View transaction history");
            System.out.println("4. View total balance"); // New option
            System.out.println("5. Exit");
            System.out.print("Select an option: ");
            option = scanner.nextInt();
    
            switch (option) {
                case 1:
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.showTransactions();
                    break;
                case 4:
                    System.out.println("Total balance: $" + account.getBalance()); // Display total balance
                    break;
                case 5:
                    System.out.println("Exiting the menu.");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        } while (option != 5);
        
        scanner.close();
    }
    
    
}
