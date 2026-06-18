//Sabitlər — Bank Limiti
//Bank sisteminin aşağıdakı sabit parametrlərini final ilə yaradıb ekrana çap edin:

public class task3 {
    public static void main(String[] args) {
        final int MIN_KREDIT_MEBLEGI = 300;
        final int MAX_KREDIT_MEBLEGI = 50000;
        final double ILLIK_STANDART_FAIZ = 10.9;
        final String BANKIN_QISA_ADI = "ABB";
        final int MAX_KREDIT_MUDDETI_AY = 60;

        System.out.println("Bank: " + BANKIN_QISA_ADI);
        System.out.println("Minimum kredit: " + MIN_KREDIT_MEBLEGI + " AZN");
        System.out.println("Maksimum kredit: " + MAX_KREDIT_MEBLEGI + " AZN");
        System.out.println("Standart faiz: " + ILLIK_STANDART_FAIZ + "%");
        System.out.println("Maksimum müddət: " + MAX_KREDIT_MUDDETI_AY + " ay");

        // Dəyəri dəyişməyə cəhd edək (Xəta verəcək)
         // MIN_KREDIT_MEBLEGI = 500;
        // Xəta mesajı: "Cannot assign a value to final variable 'MIN_KREDIT_MEBLEGI'
    }
}