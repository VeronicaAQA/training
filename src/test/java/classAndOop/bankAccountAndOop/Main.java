package classAndOop.bankAccountAndOop;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        SavingsAccount accountOne = new SavingsAccount("0001", 34000.2);
        CheckingAccount accountTwo = new CheckingAccount("0002", 50220.5);
        CheckingAccount accountThree = new CheckingAccount("0003", 290220.52);

        BankAccount[] accounts = { accountOne, accountTwo, accountThree };
        for (BankAccount acc : accounts) {
            acc.deposit(5000.0);
            acc.withdraw(2300);
            acc.calculateInterest();
            System.out.println("balance " + acc.getBalance());
        }
    }
}
