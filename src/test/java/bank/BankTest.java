package bank;

import org.junit.Before;
import org.junit.Test;

public class BankTest {

    private BankApp bankApp;

    @Before
    public void setUp() {
        bankApp = new BankApp();
    }

    @Test(expected = RuntimeException.class)
    public final void whenEmptyClientNameIsUsedThenThrownException() {
        bankApp.withdrawsAmountFromClientAccount("", 10.0);
    }

}
