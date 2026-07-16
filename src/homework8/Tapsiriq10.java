/*Min və indeksi
int[] ballar = {45, 78, 92, 30, 65, 88}; massivində
ən kiçik balı və onun indeksini tap, çap et.
Düşün: indeks lazımdırsa, hansı dövrəni seçməlisən?
 */


package homework8;
public class Tapsiriq10 {
    public static void main(String[] args) {
        int[] ballar = {45, 78, 92, 30, 65, 88};
        int min = ballar[0];
        int minIndex = 0;

        for (int i = 1; i < ballar.length; i++) {
            if (ballar[i] < min) {
                min = ballar[i];
                minIndex = i;
            }
        }

        System.out.println("Ən kiçik bal: " + min);
        System.out.println("İndeksi: " + minIndex);
    }
}

// for-each ancaq elementləri verir
// əgər "neçənci yerdə durub" (indeks) sualını axtarırıqsa adi for istifadə olunur
