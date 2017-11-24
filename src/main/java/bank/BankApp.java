package bank;

public class BankApp {

    public Double withdrawsAmountFromClientAccount(String clientName, Double amount) {
        if (clientName.isEmpty()) {
            throw new RuntimeException("Empty client name is not allowed");
        }
        return 0.0;
    }
}
