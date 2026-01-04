package classAndOop.bank2;

public class BankAccount {
    String accountNumber;
    double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //увеличивает баланс
    public void deposit(double amount) {
        balance += amount;
    }

    //уменьшает баланс (если средств достаточно)
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Недостаточно средств");
        }
    }

    //возвращает текущий баланс
    public double getBalance() {
        return balance;
    }
}
