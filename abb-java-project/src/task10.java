//int/double Tələsi

public class task10 {
    public static void main(String[] args) {

        int mebleg = 5000;
        int faiz = 15;


       // double faizMeblegi = mebleg * faiz / 100;
        // bu kod istifade etsek 5050 mebleg teyin etsek hesablama sehv olar


        // 100-ü 100.0 kimi yazırıq ki, əməliyyat double olaraq aparılsın
        double faizMeblegi = (double) mebleg * faiz / 100;

        System.out.println("Faiz məbləği: " + faizMeblegi);
    }
}
