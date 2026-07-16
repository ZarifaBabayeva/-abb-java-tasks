/*Əsl kopya
int[] orijinal = {5, 10, 15, 20}; massivinin əsl kopyasını
adi for ilə yarat (int[] b = a; yazmaq olmaz!).
Sonra kopyanın 0-cı elementini 99 et və hər iki massivi çap et.
Orijinal massiv dəyişməməlidir.
 */

package homework8;
public class Tapsiriq11 {
    public static void main(String[] args) {
        int[] orijinal = {5, 10, 15, 20};
        int[] kopya = new int[orijinal.length];

        for (int i = 0; i < orijinal.length; i++) {
            kopya[i] = orijinal[i];
        }

        kopya[0] = 99;

        System.out.print("Orijinal: ");
        for (int x : orijinal) {
            System.out.print(x + " ");
        }
        System.out.println();

        System.out.print("Kopya: ");
        for (int x : kopya) {
            System.out.print(x + " ");
        }
    }
}
