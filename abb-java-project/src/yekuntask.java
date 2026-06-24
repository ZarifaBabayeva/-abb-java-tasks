public class yekuntask {
    public static void main(String[] args) {

        final int MIN_YAS = 18;
        final int MIN_PAROL_UZUNLUGU = 8;
        final double MIN_GELIR = 500.0;

        String ad = "Zarifa";
        int yas = 23;
        double gelir = 5000;
        String parol = "abb-qa-2026!";
        String email = "quality@abbtech.az";


        // Ad boş deyil (uzunluğu > 0)
        boolean adDolu = ad.trim().length() > 0;

        //Yaş minimum yaşdan böyük və ya bərabərdir (>= 18)
        boolean yasUygun = yas >= MIN_YAS;

        //Gəlir minimum gəlirdən çoxdur (> 500)
        boolean gelirUygun = gelir > MIN_GELIR;

        //Parol minimum uzunluğu ödəyir (>= 8)
        boolean parolUygun = parol.length() >= MIN_PAROL_UZUNLUGU;

        // Elektron poçtda "@" işarəsi var
        boolean emailUygun = email.contains("@");

        // Qeydiyyat uğurludur? (bütün yoxlamalar true olmalı)
        boolean qeydiyyatUgurlu = adDolu && yasUygun && gelirUygun && parolUygun && emailUygun;


        String adFormatli = ad.substring(0, 1).toUpperCase() + ad.substring(1).toLowerCase();

        System.out.println("İstifadəçi: " + adFormatli);
        System.out.println("1. Ad daxil edilib:     " + adDolu);
        System.out.println("2. Yaş kriteriyası:     " + yasUygun);
        System.out.println("3. Gəlir kriteriyası:   " + gelirUygun);
        System.out.println("4. Parol təhlükəsizliyi: " + parolUygun);
        System.out.println("5. Email formatı:       " + emailUygun);
        System.out.println("YEKUN QEYDİYYAT STATUSU: " + (qeydiyyatUgurlu ? "UĞURLU ✅" : "UĞURSUZ ❌"));


        // final deyerleri yoxla
         //MIN_YAS = 21;
        //MIN_PAROL_UZUNLUGU=5;
        //MIN_GELIR=200;
    }
}