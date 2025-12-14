package classAndOop.bank;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //увеличивает баланс
    private void deposit(double amount) {
        balance += amount;
    }

    //уменьшает баланс (если средств достаточно)
    public void withdraw(double amount) {
        if (balance >=amount){
        balance -= amount;}
        else {
            System.out.println("Недостаточно средств");
        }
    }

    //возвращает текущий баланс
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("12345", 1000.0);
        account.deposit(500);
        account.withdraw(300);
        System.out.println("Баланс: " + account.getBalance());

    }

}
