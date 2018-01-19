package de.testo.kata.calisthenic.transactions;

import de.testo.kata.calisthenic.Amount;

public class Credit extends Transaction {

    public Credit(Amount amount) {
        super(amount);
    }

    @Override
    Amount performOnBalance(Amount balance) {
        balance.subtract(this.amount);
        return balance;
    }
}
