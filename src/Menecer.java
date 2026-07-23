public class Menecer extends Isci {
    private int komandaSayi;

    public Menecer(String ad, int komandaSayi) {
        super(ad);
        this.komandaSayi = komandaSayi;
    }

    public int getKomandaSayi() {
        return komandaSayi;
    }

    public void melumatlariGoster() {
        System.out.println("Menecerin adı: " + getAd());
        System.out.println("Komanda sayı: " + komandaSayi);
    }
}