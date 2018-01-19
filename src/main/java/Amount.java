import java.math.BigDecimal;
import java.util.Currency;

public class Amount {
    private BigDecimal value;

    public Amount(String value ) {
        this.value = new BigDecimal(value);
    }

    public Amount(BigDecimal value) {
        this.value = value;
    }

    public void add(Amount augend) {
        value = value.add(augend.value);

    }

    //Synchronize?
    public void subtract(Amount subtrahend) {
        value = value.subtract(subtrahend.value);
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
