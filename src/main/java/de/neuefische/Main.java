package de.neuefische;

import de.neuefische.bankservice.BankService;
import de.neuefische.bankservice.Client;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BankService bankService = new BankService();

        Client client1 = new Client("Max", "Mustermann", 1);
        Client client2 = new Client("John", "Doe", 2);

        String account1 = bankService.openAccount(client1);
        bankService.getAccounts().get(account1).deposit(new BigDecimal("2000.0"));


        String account2 = bankService.openAccount(client2);
        bankService.getAccounts().get(account2).deposit(new BigDecimal("1000.0"));

        bankService.transferAmount(account1, account2, new BigDecimal("500.0"));

        System.out.println(bankService.getAccounts().get(account1));
        System.out.println(bankService.getAccounts().get(account2));
    }
    }
