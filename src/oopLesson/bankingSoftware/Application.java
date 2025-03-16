package oopLesson.bankingSoftware;

import oopLesson.bankingSoftware.model.Account;

public class Application {
    public static void main(String[] args) {
        Account savingAccount = new Account("Saving");

        savingAccount.deposit(10.1);
        savingAccount.showBalance();

        Account creditCardAccount  = new Account("CreditCard");
        creditCardAccount.showBalance();
    }
}
