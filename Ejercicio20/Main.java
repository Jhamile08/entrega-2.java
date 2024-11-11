package Ejercicio20;

public class Main {
    public static void main(String[] args) {
        // Create a bank
        Bank bank = new Bank();

        AccountBank account1 = new AccountBank("123456", 500.0);
        AccountBank account2 = new AccountBank("654321", 1000.0);
        bank.addAccount(account1);
        bank.addAccount(account2);

        account1.deposit(200);
        account2.withdraw(150);
        bank.transfer("123456", "654321", 100);
        bank.showAllTransactionHistories();
    }
}
