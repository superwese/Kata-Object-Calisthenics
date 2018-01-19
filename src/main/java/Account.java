import java.math.BigDecimal;

public class Account {

    private Amount balance = new Amount(new BigDecimal(0));

    public Account() {

    }

    public Amount getBalance() {
        return balance;
    }

    public void deposit(Amount amount) throws AccountOverflowException {
        balance.add(amount);
    }

    public void withdraw(Amount amount) throws NotEnoughMoneyExeption {
        balance.subtract(amount);
    }
}
