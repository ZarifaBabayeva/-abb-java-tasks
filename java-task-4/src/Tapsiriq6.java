//String ↔ Rəqəm Çevrilməsi

import java.util.Scanner;

public class Tapsiriq6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bir tam ədəd daxil edin (String formatında): ");
        String strEded = sc.next();

        int sayi = Integer.parseInt(strEded);

        int yeniSayi = sayi + 100;
        System.out.println("Ədədin üzərinə 100 gəldik: " + yeniSayi);

        String sonMetn = String.valueOf(yeniSayi);

        int uzunluq = sonMetn.length();

        System.out.println("Nəticənin String formatınd49a uzunluğu: " + uzunluq);

        sc.close();
    }
}