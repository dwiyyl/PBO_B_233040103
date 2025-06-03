package Pertemuan14;
// Tugas 2
public class BankAccount {
    private final String accountNumber; // Nomor rekening tidak boleh berubah
    protected double balance; // Saldo bisa berubah

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public final void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance       : $" + balance);
    }
}
