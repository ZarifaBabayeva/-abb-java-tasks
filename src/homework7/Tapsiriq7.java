/*Seyfin kodu
Seyfin gizli kodu 275-dir (1–999 arasında).
İstifadəçi düzgün tapana qədər ədəd daxil etsin;
hər cəhddən sonra "Böyükdür", "Kiçikdir" və ya "Seyf açıldı!" çap et, sonda neçə cəhd apardığını göstər.
 */

package homework7;
import java.util.Scanner;
public class Tapsiriq7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int secretCode = 275;
        int userGuess = 0;
        int attempts = 0;

        System.out.println("     Secure Safe System    ");
        System.out.println("The safe is locked. Guess the 3-digit code (1-999) to open it.");

        while (userGuess != secretCode) {
            System.out.print("Enter your guess: ");

            if (!sc.hasNextInt()) {
                System.err.println("Error: Invalid input! Please enter a whole number.");
                sc.next();
                continue;
            }

            userGuess = sc.nextInt();
            attempts++;

            if (userGuess < secretCode) {
                System.out.println("Hint: Greater");
            } else if (userGuess > secretCode) {
                System.out.println("Hint: Smaller");
            } else {
                System.out.println("Success: Safe opened!");
            }
        }

        System.out.println("\n                  ");
        System.out.println("Mission Accomplished!");
        System.out.println("Total attempts made: " + attempts);
        System.out.println("               ");

        sc.close();
    }
}