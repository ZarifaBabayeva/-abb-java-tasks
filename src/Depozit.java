public class Depozit extends Hesab {

    public Depozit(double balans) {
        super(balans);
    }

    @Override
    public void faizHesabla() {
        double faiz = getBalans() * 0.05;
        System.out.println("Depozit hesabı üzrə illik qazanc: " + faiz + " AZN");
    }
}