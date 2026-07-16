/*Vurma cədvəli
2-nin vurma cədvəlini 1-dən 10-a qədər 2 x 1 = 2 formatında çap et. do-while dövrəsi istifadə olunmalıdır.
 */

package homework8;
public class Tapsiriq2 {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println("2 x " + i + " = " + (2 * i));
            i++;
        } while (i <= 10);
    }
}