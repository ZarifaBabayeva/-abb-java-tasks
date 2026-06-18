// Müştəri Kredit Hesabatı

public class bonustask {
    public static void main(String[] args) {
        String adSoyad = "Zarifa Babayeva";
        int yas = 23;
        double ayliqGelir = 5000;
        double kreditMeblegi = 1.0;
        int muddetAy = 24;
        double illikFaiz = 12.0;
        boolean kreditTarixiYaxsidir = true;

        double umumiFaiz = kreditMeblegi * (illikFaiz / 100);
        double umumiBorc = kreditMeblegi + umumiFaiz;
        double ayliqOdenis = umumiBorc / muddetAy;
        double gelireNisbet = (ayliqOdenis / ayliqGelir) * 100;

        boolean yasSerti = (yas >= 21 && yas <= 65);
        boolean gelirSerti = (ayliqGelir > 800);
        boolean meblegSerti = (kreditMeblegi >= 300 && kreditMeblegi <= 50000);
        boolean nisbetSerti = (gelireNisbet < 40);

        boolean kreditTesdiqlenir = yasSerti && gelirSerti && meblegSerti && nisbetSerti && kreditTarixiYaxsidir;

        System.out.println("      MÜŞTƏRİ KREDİT HESABATI     ");

        String formatliAd = adSoyad.substring(0,1).toUpperCase() + adSoyad.substring(1,6) + " " +
                adSoyad.substring(7,8).toUpperCase() + adSoyad.substring(8);
        System.out.println("Müştəri:            " + formatliAd);
        System.out.println("Yaş:                " + yas);
        System.out.println("Aylıq Gəlir:        " + ayliqGelir + " AZN");

        System.out.println("\n Kredit Detalları ");
        System.out.println("Məbləğ:             " + kreditMeblegi + " AZN");
        System.out.println("Ümumi Faiz:         " + umumiFaiz + " AZN");
        System.out.println("Aylıq Ödəniş:       " + ayliqOdenis + " AZN");
        System.out.println("Gəlirə Nisbət:      %" + gelireNisbet);

        System.out.println("\n Yoxlamalar ");
        System.out.println("Yaş Uyğunluğu:      " + (yasSerti ? "HƏ" : "YOX"));
        System.out.println("Gəlir Uyğunluğu:    " + (gelirSerti ? "HƏ" : "YOX"));
        System.out.println("Məbləğ Uyğunluğu:   " + (meblegSerti ? "HƏ" : "YOX"));
        System.out.println("Təhlükəsiz Nisbət:  " + (nisbetSerti ? "Bəli (<40%)" : "Xeyr (>40%)"));

        System.out.println("\n");
        System.out.println("YEKUN QƏRAR:        " + (kreditTesdiqlenir ? "TƏSDİQLƏNDİ ✅" : "İMTİNA EDİLDİ ❌"));
    }
}
