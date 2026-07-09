/*Faiz artımı
İlkin əmanət məbləği və illik faiz dərəcəsi ver.
Məbləğ ilkin dəyərin iki qatına çatana qədər hər il nə qədər olduğunu göstər və neçə il çəkdiyini çap et.
 */


package homework6;
import java.util.Scanner;

public class Tapsiriq5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double initialDeposit;
        while (true) {
            System.out.print("Enter initial deposit amount: ");
            if (!sc.hasNextDouble()) {
                System.err.println("Error: Please enter a valid number!");
                sc.next();
                continue;
            }
            initialDeposit = sc.nextDouble();
            if (initialDeposit <= 0) {
                System.err.println("Error: Deposit amount must be greater than 0!");
            } else {
                break;
            }
        }

        double interestRate;
        while (true) {
            System.out.print("Enter annual interest rate: ");
            if (!sc.hasNextDouble()) {
                System.err.println("Error: Please enter a valid number!");
                sc.next();
                continue;
            }
            interestRate = sc.nextDouble();
            if (interestRate <= 0) {
                System.err.println("Error: Interest rate must be greater than 0!");
            } else {
                break;
            }
        }

        double currentBalance = initialDeposit;
        double targetBalance = initialDeposit * 2;
        int years = 0;

        System.out.println("\n   Growth Tracking   ");
        System.out.printf("Starting Balance: %.2f | Target: %.2f\n", initialDeposit, targetBalance);
        System.out.println("               ");

        while (currentBalance < targetBalance) {
            years++;
            double interest = currentBalance * (interestRate / 100);
            currentBalance += interest;

            System.out.printf("Year %d: New Balance = %.2f\n", years, currentBalance);
        }

        System.out.println("                      ");
        System.out.println("Result: It took " + years + " years to double your deposit.");
        System.out.printf("Final Balance: %.2f\n", currentBalance);

        sc.close();
    }
}