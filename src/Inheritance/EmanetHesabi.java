package Inheritance;
public class EmanetHesabi extends Hesab {
    private double interestRate;

    public EmanetHesabi(String ownerName, double balance, double interestRate) {
        super(ownerName, balance);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interest = getBalance() * (interestRate / 100);
        double newBalance = getBalance() + interest;
        setBalance(newBalance);
        System.out.println("Faiz tətbiq edildi: " + interestRate + "% (+" + interest + " AZN)");
    }
}