package bank;

public class BankApp {

    private Account pierreJeanAccount;

    public BankApp() {
        this.pierreJeanAccount = new Account("pierre-jean", 100.0);
    }

    public Double withdrawsAmountFromClientAccount(String clientName, Double amount) {
        if (clientName.isEmpty()) {
            throw new RuntimeException("Empty client name is not allowed");
        }

        if(!clientName.equals(pierreJeanAccount.getClientName())){
            throw new RuntimeException();
        }

        return 0.0;
    }
}
