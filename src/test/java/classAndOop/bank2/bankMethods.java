package classAndOop.bank2;

public class bankMethods {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123", 300000.0);
        account.deposit(500);
        account.withdraw(300);

        System.out.println("Баланс: " + account.getBalance());

    }
}
