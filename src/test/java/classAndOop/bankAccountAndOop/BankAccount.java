package classAndOop.bankAccountAndOop;

public abstract class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //для пополнения счета
    public void deposit(double amount) {
        balance += amount;
    }

    //Реализация метода withdraw(double amount) с проверкой на достаточность средств.
    public void withdraw(double amount) {
        if (balance >= amount) {
            setBalance(balance - amount);
        } else {
            System.out.print("Недостаточно средств, ваш баланс = " + balance);
        }
    }

    // добавляем 5% годовых к балансу
    public abstract void calculateInterest();
}
