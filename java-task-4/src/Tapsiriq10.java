//Tam Sistem — Sığorta Müraciəti

import java.util.Scanner;

public class Tapsiriq10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ad və Soyadınızı daxil edin: ");
        String adSoyad = sc.nextLine();

        System.out.print("Yaşınızı daxil edin: ");
        int yas = sc.nextInt();

        System.out.print("İllik gəlirinizi daxil edin (AZN): ");
        String gelirString = sc.next();

        double gelir = Double.parseDouble(gelirString);


        // Ad-Soyad boşluqla yazılıb və 5+ simvoldur?
        boolean adSoyadDuzdurmu = adSoyad.contains(" ") && adSoyad.length() >= 5;

        // Yaş 18–70 aralığındadır?
        boolean yasDuzdurmu = yas >= 18 && yas <= 70;

        // İllik gəlir >= 3000 AZN-dir?
        boolean gelirDuzdurmu = gelir >= 3000;

        // Son qərar (Hər üç şərt ödənməlidir)
        boolean muracietTesdiqlendi = adSoyadDuzdurmu && yasDuzdurmu && gelirDuzdurmu;

        // 4. printf ilə formatlanmış hesabat
        System.out.println("\n Sığorta Müraciəti Hesabatı ");
        System.out.printf("Müştəri: %s\n", adSoyad.toUpperCase()); // Böyük hərflə
        System.out.printf("İllik gəlir: %.2f AZN \n", gelir); // 2 ondalıq hissə ilə
        System.out.println("Ad/Soyad qaydaya uyğundur: " + adSoyadDuzdurmu);
        System.out.println("Yaş uyğundur: " + yasDuzdurmu);
        System.out.println("Gəlir uyğundur: " + gelirDuzdurmu);
        System.out.println("Yekun Qərar (Təsdiq): " + muracietTesdiqlendi);

        sc.close();
    }
}