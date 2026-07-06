/* Gün Nömrəsindən Gün Adı
  Analysis: Using switch-case with intentional "fall-through" for weekend logic
   For cases 6 and 7, the program flows to print an additional "Weekend!" message
 */

package Javahometask5;
import java.util.Scanner;
public class Tapsiriq5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a day number (1-7): ");

        if (!sc.hasNextInt()) {
            System.out.println("Error: Please enter a valid integer number.");
            return;
        }

        int dayNumber = sc.nextInt();

        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
            case 7:
                if (dayNumber == 7) {
                    System.out.println("Sunday");
                }
                System.out.println("Happy Weekend!");
                break;
            default:
                System.out.println("Error: Invalid day number! Please enter a number between 1 and 7.");
        }

        sc.close();
    }
}
