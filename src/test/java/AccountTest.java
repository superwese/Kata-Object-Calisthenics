import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class AccountTest {

    @Test
    public void newAccountHasZeroBalance() throws Exception {
        Account account = new Account();
        Amount expected = new Amount("0");
        assertEquals(expected, account.getBalance() );
    }

    @Test
    public void depositIncreasesBalance() throws Exception {
        Account account = new Account();
        Amount expected = new Amount("2");
        account.deposit(new Amount("2"));
        assertEquals(expected, account.getBalance() );

    }

    @Test
    public void withdrawDecreasesBalance() throws Exception {
        Account account = new Account();
        Amount expected = new Amount("-10");
        account.withdraw(new Amount("10"));
        assertEquals(expected, account.getBalance() );

    }

    @Test
    public void depositAndWithDraw() throws Exception {
        Account account = new Account();
        Amount expected = new Amount("10.1");

        account.deposit(new Amount("20.2"));
        account.withdraw(new Amount("10.1"));

        assertEquals(expected, account.getBalance() );

    }

}