//3 Rəqəmli Ədədi Parçala

import java.util.Scanner;

public class Tapsiriq3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("3 rəqəmli bir tam ədəd daxil edin: ");
        int sayi = sc.nextInt();

        int yuzler = sayi / 100;
        int onlar = (sayi % 100) / 10;
        int birler = sayi % 10;

        int cem = yuzler + onlar + birler;

        System.out.println("Yüzlüklər: " + yuzler);
        System.out.println("Onluqlar: " + onlar);
        System.out.println("Təkliklər : " + birler);
        System.out.println("Rəqəmlərin cəmi: " + cem);

        sc.close();
    }
}