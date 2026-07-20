/*Bankomat
Bankomat sinfində balans gizli saxlanılsın. İstifadəçinin görəcəyi yeganə metod pul çəkmək olsun —
məbləği o qəbul etsin, yoxlama isə arxada gizli metodda getsin: balans kifayət etmirsə imtina mesajı,
edirsə çəkilən məbləğ və qalıq çap olunsun. Proqramda bir uğursuz və bir uğurlu çəkim et.
 */


package Abstraction;
public class Bankomat {
    private double balans = 500.0;

    public void pulCek(double mebleg) {
        System.out.println("[Bankomat]: " + mebleg + " AZN çəkilməsi üçün müraciət olundu.");

        if (balansKifayyetEdirmi(mebleg)) {
            emeliyyatiTamamla(mebleg);
        } else {
            System.out.println("Nəticə: İmtina! Hesabınızda kifayət qədər vəsait yoxdur.");
            System.out.println("Cari balans: " + balans + " AZN");
        }
        System.out.println("                                   ");
    }

    private boolean balansKifayyetEdirmi(double mebleg) {
        return mebleg <= balans && mebleg > 0;
    }

    private void emeliyyatiTamamla(double mebleg) {
        balans -= mebleg;
        System.out.println("Nəticə: Uğurlu əməliyyat.");
        System.out.println("Çəkilən məbləğ: " + mebleg + " AZN");
        System.out.println("Qalıq balans: " + balans + " AZN");
    }
}