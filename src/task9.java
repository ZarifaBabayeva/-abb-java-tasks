//3 Rəqəmli Ədədi Parçala

public class task9 {
    public static void main(String[] args) {
        int sayi = 583;

        int yuzler = sayi / 100;
        int onlar = (sayi % 100) / 10;
        int birler = sayi % 10;

        int cem = yuzler + onlar + birler;

        System.out.println("Ədəd: " + sayi);
        System.out.println("Yüzlər: " + yuzler);
        System.out.println("Onlar:  " + onlar);
        System.out.println("Birlər: " + birler);
        System.out.println("Rəqəmlərin cəmi: " + cem);

        System.out.println("-------------------------");

        sayi = 907;
        yuzler = sayi / 100;
        onlar = (sayi % 100) / 10;
        birler = sayi % 10;
        cem = yuzler + onlar + birler;

        System.out.println("Ədəd: " + sayi);
        System.out.println("Yüzlər: " + yuzler);
        System.out.println("Onlar:  " + onlar);
        System.out.println("Birlər: " + birler);
        System.out.println("Rəqəmlərin cəmi: " + cem);
    }
}