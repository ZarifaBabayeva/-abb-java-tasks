//Müştəri Kartı

public class task5 {
    public static void main(String[] args) {
        char bashErf = 'L';
        String tamAd = "Zarifa Babayeva";
        int yas = 28;
        double ayliqGelir = 5000.0;
        boolean isVip = true;
        int musteriKodu = 12345;

        System.out.println("Müştəri Kartı:");
        System.out.println("--------------------");
        System.out.println("Adın baş hərfi:  " + bashErf);
        System.out.println("Tam adı:         " + tamAd);
        System.out.println("Yaşı:            " + yas);
        System.out.println("Aylıq gəliri:    " + ayliqGelir + " AZN");
        System.out.println("VIP müştəri:     " + isVip);
        System.out.println("Müştəri kodu:    " + musteriKodu);
    }
}