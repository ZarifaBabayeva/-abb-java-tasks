//Ad Formatla

public class task12 {
    public static void main(String[] args) {

        String tamAd = "nigar əliyeva";

        // 1. Boşluğun indeksi
        int bosluqIndeksi = tamAd.indexOf(" ");

        // 2. Ad hissəsini ayır, formatla (nigar -> Nigar)
        String adHissesi = tamAd.substring(0, bosluqIndeksi);
        String adFormatli = adHissesi.substring(0, 1).toUpperCase() + adHissesi.substring(1).toLowerCase();

        // 3. Soyad hissəsini ayır,formatla (əliyeva -> Əliyeva)
        String soyadHissesi = tamAd.substring(bosluqIndeksi + 1);
        String soyadFormatli = soyadHissesi.substring(0, 1).toUpperCase() + soyadHissesi.substring(1).toLowerCase();

        // 4. Baş hərfləri tap (N.Ə.)
        String basHerfler = adFormatli.substring(0, 1) + "." + soyadFormatli.substring(0, 1) + ".";

        System.out.println("Tam ad (formatlanmış): " + adFormatli + " " + soyadFormatli);
        System.out.println("Yalnız ad: " + adFormatli);
        System.out.println("Yalnız soyad: " + soyadFormatli);
        System.out.println("Baş hərflər: " + basHerfler);
        System.out.println("Böyük hərflə: " + tamAd.toUpperCase());
    }
}