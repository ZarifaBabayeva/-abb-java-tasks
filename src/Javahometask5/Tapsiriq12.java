/*Bilet Qiyməti
Scanner ilə yaş alın. Yaşa görə bilet qiymətini çap edin:
0-5 yaş → "Pulsuz"
6-17 yaş → "5 AZN"
18-64 yaş → "10 AZN"
65 və yuxarı → "3 AZN"
Mənfi ədəd daxil edilərsə "Yanlış yaş" çap edin.
 */

package Javahometask5;
import  java.util.Scanner;
public class Tapsiriq12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");

        if (!sc.hasNextInt()) {
            System.out.println("Error: Invalid input! Please enter a numeric value.");
            return;
        }

        int userAge = sc.nextInt();

        System.out.println("            ");

        if (userAge < 0 || userAge > 150) {
            System.out.println("Result: Invalid age!");
        } else if (userAge <= 5) {
            System.out.println("Result: Free");
        } else if (userAge <= 17) {
            System.out.println("Result: 5 AZN");
        } else if (userAge <= 64) {
            System.out.println("Result: 10 AZN");
        } else {
            System.out.println("Result: 3 AZN");
        }

        sc.close();
    }
}
