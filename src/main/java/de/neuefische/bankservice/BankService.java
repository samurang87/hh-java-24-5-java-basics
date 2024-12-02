/*
Create a class 'BankService' that manages a set of accounts.

Implement a method in BankService to open an account. It should only require a
customer as an argument and should return the new account number.
Implement a method in BankService to transfer a specific amount (as BigDecimal)
from one account number (as String) to another account number (as String).
* */

package de.neuefische.bankservice;


import java.math.BigDecimal;
import java.util.HashMap;

public class BankService {
    private final HashMap<String, Account> accounts;

    public BankService(){
        this.accounts = new HashMap<>();
    }

    public HashMap<String, Account> getAccounts() {
        return accounts;
    }

    public String openAccount(Client client) {
        String accountNumber = String.valueOf(client.hashCode());
        accounts.put(accountNumber, new Account(accountNumber, client));
        return accountNumber;
    }

    public void transferAmount(String fromAccount, String toAccount, BigDecimal amount) {
        this.accounts.get(fromAccount).withdraw(amount);
        this.accounts.get(toAccount).deposit(amount);
    }
}
