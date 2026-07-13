/*Ən sürətli qaçışçı
3 qaçışçının məsafəni qət etmə vaxtını (saniyə) ardıcıl daxil et:
"1-ci qaçışçının vaxtı: " və s. Ən az vaxt sərf edən (ən sürətli) qaçışçının nömrəsini (1–3) və vaxtını tap, çap et.
 */


package homework7;
import java.util.Scanner;
public class Tapsiriq4  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double minTime = Double.MAX_VALUE;
        int winnerNumber = 0;
        int totalRunners = 3;

        System.out.println("    Race Results Entry System    ");

        for (int i = 1; i <= totalRunners; i++) {
            System.out.print("Runner " + i + "'s time (seconds): ");

            if (!sc.hasNextDouble()) {
                System.err.print("Error: Invalid input! Please enter a numeric value for time.");
                sc.next();
                i--;
                continue;
            }

            double currentTime = sc.nextDouble();

            if (currentTime <= 0) {
                System.err.println("Error: Time must be a positive number.");
                i--;
                continue;
            }

            if (currentTime < minTime) {
                minTime = currentTime;
                winnerNumber = i;
            }
        }

        System.out.println("\n           ");
        System.out.println("Fastest Runner Identified:");
        System.out.println("Runner Number: " + winnerNumber);
        System.out.printf("Completion Time: %.2f seconds\n", minTime);
        System.out.println("              ");

        sc.close();
    }
}