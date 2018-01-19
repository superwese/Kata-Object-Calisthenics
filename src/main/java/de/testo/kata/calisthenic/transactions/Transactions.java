package de.testo.kata.calisthenic.transactions;

import de.testo.kata.calisthenic.Account;
import de.testo.kata.calisthenic.Amount;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Transactions {

    private Set<Transaction> transactions = new HashSet<>();

    public int size() {
        return transactions.size();
    }

    public boolean isEmpty() {
        return transactions.isEmpty();
    }

    public boolean contains(Object o) {
        return transactions.contains(o);
    }

    public Iterator<Transaction> iterator() {
        return transactions.iterator();
    }

    public Object[] toArray() {
        return transactions.toArray();
    }

    public <T> T[] toArray(T[] ts) {
        return transactions.toArray(ts);
    }

    public boolean add(Transaction transaction) {
        return this.transactions.add(transaction);
    }

    public boolean remove(Object o) {
        return transactions.remove(o);
    }

    public boolean containsAll(Collection<?> collection) {
        return transactions.containsAll(collection);
    }

    public boolean addAll(Collection<? extends Transaction> collection) {
        return transactions.addAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        return transactions.retainAll(collection);
    }

    public boolean removeAll(Collection<?> collection) {
        return transactions.removeAll(collection);
    }

    public void clear() {
        transactions.clear();
    }

    @Override
    public boolean equals(Object o) {
        return transactions.equals(o);
    }

    @Override
    public int hashCode() {
        return transactions.hashCode();
    }

    public Spliterator<Transaction> spliterator() {
        return transactions.spliterator();
    }

    public boolean removeIf(Predicate<? super Transaction> predicate) {
        return transactions.removeIf(predicate);
    }

    public Stream<Transaction> stream() {
        return transactions.stream();
    }

    public Stream<Transaction> parallelStream() {
        return transactions.parallelStream();
    }

    public void forEach(Consumer<? super Transaction> consumer) {
        transactions.forEach(consumer);
    }

    public Amount getBalance() {
        Amount balance = Account.INITIAL_BALANCE;
        for (Transaction transaction : transactions) {
            balance = transaction.performOnBalance(balance);
        }
        return balance;
    }
}
