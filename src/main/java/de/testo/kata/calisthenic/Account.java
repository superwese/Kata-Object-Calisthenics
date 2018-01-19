package de.testo.kata.calisthenic;

import de.testo.kata.calisthenic.transactions.Credit;
import de.testo.kata.calisthenic.transactions.Debit;
import de.testo.kata.calisthenic.transactions.Transactions;

public class Account {

    public static final Amount INITIAL_BALANCE = new Amount("0");

    private Transactions transactions = new Transactions();

    public Account() {

    }

    public Amount getBalance() {
        return transactions.getBalance();
    }

    public void deposit(Amount amount) throws AccountOverflowException {
        transactions.add(new Debit(amount));
    }

    public void withdraw(Amount amount) throws NotEnoughMoneyExeption {
        transactions.add(new Credit(amount));
    }
}
