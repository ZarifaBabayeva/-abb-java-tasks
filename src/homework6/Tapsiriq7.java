/*Say təxmini oyunu
Kodda gizli bir ədəd (məs. int gizli = 42) təyin et.
İstifadəçi düzgün tapana qədər ədəd daxil etsin; hər cəhddən sonra
"Böyükdür", "Kiçikdir" və ya "Tapdın!" göstər, sonda neçə cəhd apardığını çap et.
 */

package homework6;
import java.util.Scanner;

public class Tapsiriq7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int secret = 67;
        int attempts = 0;
        int guess;

        System.out.println("     Welcome to the Number Guessing Game!   ");
        System.out.println("I have hidden a number between 1 and 100. Can you find it?");

        while (true) {
            System.out.print("Enter your guess: ");

            if (!sc.hasNextInt()) {
                System.err.println("Error: Please enter a valid number!");
                sc.next();
                continue;
            }

            guess = sc.nextInt();
            attempts++;

            if (guess < secret) {
                System.out.println(" Higher! ");
            } else if (guess > secret) {
                System.out.println(" Lower! ");
            } else {
                System.out.println("\n       ");
                System.out.println("Congratulations! You found it!");
                System.out.println("The secret number was: " + secret);
                System.out.println("Total attempts: " + attempts);
                System.out.println("                  ");
                break;
            }
        }

        sc.close();
    }
}