package bank;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

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

    @Test
    public final void whenEmptyClientNameIsUsedThenThrownExceptionWithMessage() {
        RuntimeException exception = null;
        try {
            bankApp.withdrawsAmountFromClientAccount("", 10.0);
        } catch (RuntimeException e){
            exception = e;
        }

        assertNotNull(exception);
        assertEquals("Empty client name is not allowed", exception.getMessage());
    }

    @Test(expected = RuntimeException.class)
    public final void whenNoAccountForClientNameThenThrownException(){
        bankApp.withdrawsAmountFromClientAccount("test", 10.0);
    }

    @Test
    public final void whenNoAccountForClientNameThenThrownExceptionWithMessage(){
        RuntimeException exception = null;
        try {
            bankApp.withdrawsAmountFromClientAccount("test", 10.0);
        } catch (RuntimeException e){
            exception = e;
        }

        assertNotNull(exception);
        assertEquals("No account is found for this client", exception.getMessage());
    }

    @Test(expected = RuntimeException.class)
    public final void whenAccountExistWithInsufficientBalanceThenThrownException(){
        bankApp.withdrawsAmountFromClientAccount("jean-pierre", 110.0);
    }

    @Test
    public final void whenAccountExistWithInsufficientBalanceThenThrownExceptionWithMessage(){
        RuntimeException exception = null;
        try {
            bankApp.withdrawsAmountFromClientAccount("pierre-jean", 110.0);
        } catch (RuntimeException e){
            exception = e;
        }

        assertNotNull(exception);
        assertEquals("Insufficient balance, your balance is: 100.0", exception.getMessage());
    }

    @Test
    public final void whenAccountExistWithSufficientBalanceThenWithdraw(){
        assertEquals(100.0 - 10.0, bankApp.withdrawsAmountFromClientAccount("pierre-jean", 10.0), 0);
    }

    @Test(expected = RuntimeException.class)
    public final void whenAccountExistWithInsufficientBalanceForMultipleWithdrawThenThrownException(){
        assertEquals(100.0 - 10.0, bankApp.withdrawsAmountFromClientAccount("pierre-jean", 10.0), 0);
        assertEquals(100.0 - 10.0 - 50.0, bankApp.withdrawsAmountFromClientAccount("pierre-jean", 50.0), 0);
        bankApp.withdrawsAmountFromClientAccount("pierre-jean", 50.0);
    }

    @Test
    public final void whenAccountExistWithSufficientBalanceForMultipleWithdrawThenWithdraws(){
        assertEquals(100.0 - 10.0, bankApp.withdrawsAmountFromClientAccount("pierre-jean", 10.0), 0);
        assertEquals(100.0 - 10.0 - 50.0, bankApp.withdrawsAmountFromClientAccount("pierre-jean", 50.0), 0);
        assertEquals(100.0 - 10.0 - 50.0 - 30.0, bankApp.withdrawsAmountFromClientAccount("pierre-jean", 30.0), 0);
    }

    @Test(expected = RuntimeException.class)
    public final void whenAccountExistWithSufficientBalanceAndNegativeAmountThenThrownException(){
        bankApp.withdrawsAmountFromClientAccount("pierre-jean", -10.0);
    }

    @Test
    public final void whenAccountExistWithSufficientBalanceAndNegativeAmountThenThrownExceptionWithMessage(){
        RuntimeException exception = null;
        try {
            bankApp.withdrawsAmountFromClientAccount("pierre-jean", -10.0);
        } catch (RuntimeException e){
            exception = e;
        }

        assertNotNull(exception);
        assertEquals("Negative amount is not allowed", exception.getMessage());
    }
}
