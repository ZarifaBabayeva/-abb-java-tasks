/*Müsbət ədəd yoxlaması
Scanner ilə istifadəçidən ədəd al.
Ədəd müsbət (0-dan böyük) olana qədər Yenidən daxil edin: yazıb təkrar soruş.
Müsbət ədəd daxil edildikdə Qəbul edildi: X çap et. do-while istifadə et
— ədəd ən azı bir dəfə soruşulmalıdır.
 */

package homework8;
import java.util.Scanner;
public class Tapsiriq3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.print("Ədəd daxil edin: ");
        do {
            number = sc.nextInt();
            if (number <= 0) {
                System.out.print("Yenidən daxil edin: ");
            }
        } while (number <= 0);

        System.out.println("Qəbul edildi: " + number);
        sc.close();
    }
}
