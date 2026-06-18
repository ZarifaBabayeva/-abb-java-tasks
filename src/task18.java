// Ad-Soyad Analizi


public class task18 {
    public static void main(String[] args) {
        String tamAd = "ZarifaBabayeva";

        System.out.println("Ümumi uzunluq: " + tamAd.length());

        System.out.println("İlk 5 hərf: " + tamAd.substring(0, 5));

        System.out.println("Boşluq varmı? " + tamAd.contains(" "));

        System.out.println("'Zarifa' ilə başlayırmı? " + tamAd.startsWith("Zarifa"));

        System.out.println("Böyük hərflə: " + tamAd.toUpperCase());

        String capitalizeAd = tamAd.substring(0, 1).toUpperCase() + tamAd.substring(1, 6) +
                tamAd.substring(6, 7).toUpperCase() + tamAd.substring(7);

        System.out.println("Formatlanmış ad: " + capitalizeAd);
    }
}