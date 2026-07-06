//Ay Nömrəsindən Fəsil
//Scanner ilə ay nömrəsi alın (1-12). Switch ilə hansı fəsilə aid olduğunu çap edin:

package Javahometask5;
import java.util.Scanner;
public class Tapsiriq9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a month number (1-12): ");

        if (!sc.hasNextInt()) {
            System.out.println("Error: Please enter a valid integer for the month.");
            return;
        }

        int monthNumber = sc.nextInt();

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Season: Winter");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("Season: Spring");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println("Season: Summer");
                break;

            case 9:
            case 10:
            case 11:
                System.out.println("Season: Autumn");
                break;

            default:
                System.out.println("Error: Invalid month number! Please enter a value between 1 and 12.");
        }

        sc.close();
    }
}
