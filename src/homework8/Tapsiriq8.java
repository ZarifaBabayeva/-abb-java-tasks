/*Ən böyük bal
int[] ballar = {67, 91, 54, 88, 73}; massivində ən böyük balı
for-each ilə tap və çap et. Başlanğıc dəyər kimi 0 yox,
massivin ilk elementini götür — dərsdə niyəsini danışdıq.
 */

package homework8;
public class Tapsiriq8 {
    public static void main(String[] args) {
        int[] ballar = {67, 91, 54, 88, 73};
        int max = ballar[0];

        for (int bal : ballar) {
            if (bal > max) {
                max = bal;
            }
        }

        System.out.println(max);
    }
}
