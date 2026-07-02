//Widening vs Narrowing

import java.util.Scanner;

public class Tapsiriq5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bir tam ədəd daxil edin (int): ");
        int tam = sc.nextInt();
        double a = tam; // int -> double (widening)
        System.out.println("Widening nəticəsi (double): " + a );

        System.out.print("Bir kəsr ədəd daxil edin (double): ");
        double kesr = sc.nextDouble();
        int b = (int) kesr; // double -> int (narrowing)
        System.out.println("Narrowing nəticəsi (int): " + b );

        /*
           Narrowing zamanı Java kəsr hissəni
           yuvarlaqlaşdırmır, sadəcə kəsib atır. Məsələn: 4.65454 -> 4 olur.
        */

        sc.close();
    }
}