package com.pluarlsight;

import com.plualsight.finance.IValuable;

public class FinanceApplication {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("123", "pam", 12500);
        IValuable account2 = new BankAccount("456", "Gary", 1500);

        account1.deposit(100);
        account2


    }
}
