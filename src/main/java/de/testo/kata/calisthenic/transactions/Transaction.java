package de.testo.kata.calisthenic.transactions;

import de.testo.kata.calisthenic.Amount;

import java.util.Date;

abstract class Transaction {

    Amount amount;

    Date date;

    public Transaction(Amount amount) {
        this.amount = amount;
        this.date = new Date();
    }

    abstract Amount performOnBalance(Amount balance);


}
