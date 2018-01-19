package de.testo.kata.calisthenic.transactions;

import de.testo.kata.calisthenic.Amount;

public class Debit extends Transaction {

    public Debit(Amount amount) {
        super(amount);
    }

    @Override
    Amount performOnBalance(Amount balance) {
        balance.add(this.amount);
        return balance;
    }
}
