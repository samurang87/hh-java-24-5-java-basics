// Create a class 'Account' (not a record, should initially be mutable)
// with the properties Account Number (String), Account Balance (BigDecimal),
// and the associated customer.

// Implement a method to deposit money into the account.
// Implement a method to withdraw money from the account.

package de.neuefische.bankservice;

import java.math.BigDecimal;

public class Account {
    private String accountNumber;
    private BigDecimal accountBalance;
    private Client client;

    public Account(String accountNumber, Client client) {
        this.accountNumber = accountNumber;
        this.client = client;
        this.accountBalance = new BigDecimal("0.0");
    }

    public Account(String accountNumber, Client client, BigDecimal accountBalance) {
        this.accountNumber = accountNumber;
        this.client = client;
        this.accountBalance = accountBalance;
    }

    public BigDecimal deposit(BigDecimal amount) {
        this.accountBalance = this.accountBalance.add(amount);
        return this.accountBalance;
    }

    public BigDecimal withdraw(BigDecimal amount) {
        this.accountBalance = this.accountBalance.subtract(amount);
        return this.accountBalance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountBalance=" + accountBalance +
                ", client=" + client +
                '}';
    }
}
