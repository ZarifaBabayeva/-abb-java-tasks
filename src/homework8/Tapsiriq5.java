/*Elementləri çap et
int[] ededler = {4, 8, 15, 16, 23, 42};
massivinin bütün elementlərini for-each ilə hər birini
yeni sətirdə çap et. Sonda length istifadə edərək Element sayı: 6 çap et.
 */

package homework8;
public class Tapsiriq5 {
    public static void main(String[] args) {
        int[] ededler = {4, 8, 15, 16, 23, 42};

        for (int eded : ededler) {
            System.out.println(eded);
        }

        System.out.println("Element sayı: " + ededler.length);
    }
}
