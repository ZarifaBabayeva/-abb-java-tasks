/*Qiymətləndirmə hesabatı
1-dən 100-ə qədər bal alan tələbənin balını daxil et
Balı hərfi qiymətə çevir (90+ Əla, 70-89 Yaxşı, 50-69 Kafi, aşağı Qeyri-kafi)
və nəticəni "Bal: X → Qiymət: Y" formatında çap et.
*/

package homework6;
import java.util.Scanner;

public class Tapsiriq1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter your score (Type -1 to exit): ");

            if (!sc.hasNextInt()) {
                System.err.println("Error: Please enter a valid number!");
                System.out.println("                ");
                sc.next();
                continue;
            }

            int examScore = sc.nextInt();

            if (examScore == -1) {
                System.out.println("The program is over.");
                break;
            }

            String score;

            if (examScore >= 90 && examScore <= 100) {
                score = "Excellent";
            } else if (examScore >= 70 && examScore < 90) {
                score = "Good";
            } else if (examScore >= 50 && examScore < 70) {
                score = "Enough";
            } else if (examScore >= 0 && examScore < 50) {
                score = "Insufficient";
            } else {
                score = "Wrong score range (0-100)!";
            }

            System.out.println("Your exam score: " + examScore + " → Result: " + score);
            System.out.println("                                ");
        }

        sc.close();
    }
}