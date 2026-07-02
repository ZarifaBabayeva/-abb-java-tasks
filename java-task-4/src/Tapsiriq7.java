//Math.round() vs (int)

import java.util.Scanner;

public class Tapsiriq7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Müsbət ədəd testi
        System.out.print("Müsbət kəsr ədəd daxil edin (məs: 5.9): ");
        double musbet = sc.nextDouble();

        System.out.println("Müsbət üçün (int): " + (int)musbet);
        System.out.println("Müsbət üçün Math.round(): " + Math.round(musbet));


        // 2. Mənfi ədəd testi
        System.out.print("Mənfi kəsr ədəd daxil edin (məs: -9.8): ");
        double menfi = sc.nextDouble();

        System.out.println("Mənfi üçün (int): " + (int)menfi);
        System.out.println("Mənfi üçün Math.round(): " + Math.round(menfi));

        /*
           Müsbət ədədlər üçün:
           (int) casting: Kəsr hissəni atır, ədədi kiçildir
           Math.round(): Riyazi yuvarlayır, ədədi böyüdür

           Mənfi ədədlər üçün:
           (int) casting: Yenə kəsr hissəni atır və ədədi sıfıra doğru çəkir
           Math.round(): Riyazi qayda ilə ən yaxın tama aparır, ədəd kiçilir
        */

        sc.close();
    }
}