/*0-a qədər cəmlə
Scanner ilə istifadəçidən bir-bir ədədlər al.
İstifadəçi 0 daxil edənə qədər ədədləri cəmlə (0 özü cəmə daxil deyil).
Sonda cəmi Cəm: X formatında çap et. do-while dövrəsi istifadə olunmalıdır.
 */

package homework8;
import  java.util.Scanner;
public class Tapsiriq4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int number;

        do {
            number = sc.nextInt();
            sum += number;
        } while (number != 0);

        System.out.println("Cəm: " + sum);
        sc.close();
    }
}
