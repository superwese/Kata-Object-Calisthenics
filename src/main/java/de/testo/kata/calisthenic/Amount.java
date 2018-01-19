package de.testo.kata.calisthenic;

import java.math.BigDecimal;

public class Amount {
    private BigDecimal value;

    public Amount(String value ) {
        this.value = new BigDecimal(value);
    }

    public Amount(BigDecimal value) {
        this.value = value;
    }

    public Amount(Amount augend) {
        this.value = augend.value;
    }

    public Amount add(Amount augend) {
        return new Amount(value.add(augend.value));
    }

    public Amount subtract(Amount subtrahend) {
        return new Amount(value.subtract(subtrahend.value));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Amount amount = (Amount) o;

        return value != null ? value.equals(amount.value) : amount.value == null;
    }

    @Override
    public int hashCode() {
        return value != null ? value.hashCode() : 0;
    }

}
