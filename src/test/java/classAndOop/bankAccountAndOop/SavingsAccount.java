package classAndOop.bankAccountAndOop;

public class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    // добавляем 5% годовых к балансу
    @Override
    public void calculateInterest() {
        double balance = getBalance();
        double persent = balance + balance * 0.05;
        setBalance(persent);
    }
}
