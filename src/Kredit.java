public class Kredit extends Hesab {

    public Kredit(double balans) {
        super(balans);
    }

    @Override
    public void faizHesabla() {
        double faiz = getBalans() * 0.15;
        System.out.println("Kredit hesabı üzrə illik faiz borcu: " + faiz + " AZN");
    }
}