package bank;

public class Account {
    private String clientName;
    private Double balance;

    public Account() {
    }

    public Account(String clientName, Double balance) {
        this.clientName = clientName;
        this.balance = balance;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
