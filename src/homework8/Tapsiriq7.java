/*Cüt ədədləri say
int[] ededler = {7, 12, 5, 20, 33, 46, 9};
massivində neçə cüt ədəd olduğunu tap və Cüt ədədlərin sayı:
X formatında çap et. for-each dövrəsi istifadə olunmalıdır.
 */

package homework8;
public class Tapsiriq7 {
    public static void main(String[] args) {
        int[] ededler = {7, 12, 5, 20, 33, 46, 9};
        int count = 0;

        for (int eded : ededler) {
            if (eded % 2 == 0) {
                count++;
            }
        }

        System.out.println("Cüt ədədlərin sayı: " + count);
    }
}
