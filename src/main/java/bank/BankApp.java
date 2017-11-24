package bank;

public class BankApp {

    public Double withdrawsAmountFromClientAccount(String clientName, Double amount) {
        if (clientName.isEmpty()) {
            throw new RuntimeException();
        }
        return 0.0;
    }
}
