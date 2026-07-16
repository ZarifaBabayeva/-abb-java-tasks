/*Massivi doldur
8 xanalı boş int massivi yarat. Onu adi for ilə 10, 20, 30 … 80
dəyərləri ilə doldur. Sonra for-each ilə bütün elementləri
bir sətirdə, aralarında boşluq olmaqla çap et.
 */

package homework8;
public class Tapsiriq9 {
    public static void main(String[] args) {
        int[] massiv = new int[8];

        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = (i + 1) * 10;
        }

        for (int element : massiv) {
            System.out.print(element + " ");
        }
    }
}
