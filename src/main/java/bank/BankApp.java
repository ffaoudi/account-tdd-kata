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
            throw new RuntimeException("No account is found for this client");
        }

        Account clientAccount = pierreJeanAccount;

        if(clientAccount.getBalance() < amount){
            throw new RuntimeException("Insufficient balance, your balance is: " + clientAccount.getBalance());
        }

        return 0.0;
    }
}
