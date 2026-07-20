package Inheritance;
public class Hesab {
    private String ownerName;
    private double balance;

    public Hesab(String ownerName, double initialBalance) {
        this.ownerName = ownerName;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
            System.out.println("Xəta: Başlanğıc balans mənfi ola bilməz. 0 təyin edildi.");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println(amount + " AZN mədaxil edildi.");
        } else {
            System.out.println("Xəta: Mədaxil məbləği müsbət olmalıdır!");
        }
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }
}