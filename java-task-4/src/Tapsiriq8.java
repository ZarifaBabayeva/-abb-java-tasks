//Celsius → Fahrenheit

import java.util.Scanner;

public class Tapsiriq8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Celsius dərəcəsini daxil edin: ");
        int c = sc.nextInt();

        double f1 = c * 9 / 5 + 32;

        double f2 = c * 9.0 / 5 + 32;

        System.out.println("Yanlış hesablama (9/5 ilə): " + f1);
        System.out.println("Doğru hesablama (9.0/5 ilə): " + f2);

        /*

           Java-da 9/5 yazdıqda hər iki ədəd int olduğu üçün nəticə 1 olur, kəsri itirir
           9.0/5 yazdıqda isə nəticə double (1.8) olur və hesablama dəqiq aparılır
        */

        sc.close();
    }
}