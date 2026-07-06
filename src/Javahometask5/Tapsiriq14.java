/*Ay Nömrəsindən Rüb (Quarter)
Scanner ilə ay nömrəsi alın (1-12)
Switch ilə hansı maliyyə rübünə aid olduğunu çap edin
(I rüb: 1-3, II rüb: 4-6, III rüb: 7-9, IV rüb: 10-12)
Fall-through istifadə edərək eyni rübə aid ayları qruplaşdırın
Yanlış ay üçün default-da xəbərdarlıq çap edin.
 */

package Javahometask5;
import  java.util.Scanner;
public class Tapsiriq14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month number (1-12): ");

        if (!sc.hasNextInt()) {
            System.out.println("Error: Invalid input! Please enter a number.");
            return;
        }

        int monthNumber = sc.nextInt();

        System.out.println("            ");

        switch (monthNumber) {
            case 1:
            case 2:
            case 3:
                System.out.println("Result: Quarter I ");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Result: Quarter II ");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Result: Quarter III ");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Result: Quarter IV ");
                break;
            default:
                System.out.println("Error: Invalid month number! Please enter a value between 1 and 12.");
                break;
        }

        sc.close();
}
}
