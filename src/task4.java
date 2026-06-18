//Xətalı Kodu Düzəldin


public class task4 {
    public static void main(String[] args) {

        int yas = 25;                   // Xəta 1: 'Int' yox, kiçik hərflə 'int' olmalıdır (primitive type).
        String sehir = "Baku";          // Xəta 2: String dəyərlər mütləq dırnaq (" ") içində yazılmalıdır.
        double kreditMeblegi = 5000;    // Xəta 3: Dəyişən adında boşluq olmaz (kreditMeblegi olmalı idi).
        boolean aktiv = true;           // Xəta 4: 'True' yox, kiçik hərflə 'true' yazılmalıdır.
        final int LIMIT = 100;
        // LIMIT = 200;                 // Xəta 5: 'final' dəyişən bir dəfə təyin edilir, dəyişdirilə bilməz.
        System.out.println(yas);        // Xəta 6: Sətrin sonu nöqtə (.) yox, nöqtə-vergül (;) ilə bitməlidir.

    }
}