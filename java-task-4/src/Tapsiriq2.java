//Kredit Hesabı

import java.util.Scanner;
public class Tapsiriq2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Kredit məbləğini daxil edin: ");
        double mebleg = sc.nextDouble();

        System.out.print("İllik faiz dərəcəsini daxil edin (% ilə): ");
        double faiz = sc.nextDouble();

        System.out.print("Kredit müddətini daxil edin (ay ilə): ");
        double muddet = sc.nextDouble();

        double umumiFaiz = mebleg * (faiz / 100);
        double umumiOdenis = mebleg + umumiFaiz;
        double ayliqOdenis = umumiOdenis / muddet;

        System.out.println("\n  Sizin kredit hesabatınız");
        System.out.println("Ümumi faiz məbləği: " + umumiFaiz);
        System.out.println("Ümumi ödəniş məbləği: " + umumiOdenis);
        System.out.println("Aylıq ödəniş: " + ayliqOdenis);

        sc.close();
    }
}