package Ejercicio20;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<AccountBank> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(AccountBank account) {
        accounts.add(account);
        System.out.println("Added new account with number " + account.getAccountNumber());
    }

    public AccountBank findAccount(String accountNumber) {
        for (AccountBank account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        System.out.println("Account not found.");
        return null;
    }

    public void transfer(String fromAccountNumber, String toAccountNumber, double amount) {
        AccountBank fromAccount = findAccount(fromAccountNumber);
        AccountBank toAccount = findAccount(toAccountNumber);

        if (fromAccount != null && toAccount != null) {
            fromAccount.transfer(toAccount, amount);
        } else {
            System.out.println("Transfer failed. One or both accounts not found.");
        }
    }

    public void showAllTransactionHistories() {
        System.out.println("Transaction histories for all accounts:");
        for (AccountBank account : accounts) {
            account.showTransactionHistory();
            System.out.println("---------------------------");
        }
    }
}
