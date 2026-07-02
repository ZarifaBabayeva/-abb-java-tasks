//Dörd Əməliyyat + Qalıq

import java.util.Scanner;
public class Tapsiriq1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Birinci tam ədədi daxil edin: ");
        int a = sc.nextInt();

        System.out.print("İkinci tam ədədi daxil edin: ");
        int b = sc.nextInt();

        int toplama = a + b;
        int cixma = a - b;
        int vurma = a * b;
        int bolme = a / b;
        int qaliq = a % b;

        System.out.println("Toplama: " + toplama);
        System.out.println("Çıxma: " + cixma);
        System.out.println("Vurma: " + vurma);
        System.out.println("Bölmə: " + bolme);
        System.out.println("Qalıq: " + qaliq);

        /* 
          Java-da int/int olarsa, qalıq hissə nəzərə alınmır. Ona görədə, əgər bölünən və bölən 21/4 olarsa
          cavab 5,25 deyil, 5 olar
        */

        sc.close();
    }
}