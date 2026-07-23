public abstract class Hesab {
    private double balans;

    public Hesab(double balans) {
        this.balans = balans;
    }

    public void balansGoster() {
        System.out.println("Cari balans: " + balans + " AZN");
    }

    public abstract void faizHesabla();

    public double getBalans() {
        return balans;
    }
}