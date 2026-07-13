/*Mağazanın həftəlik satışı
3 günün satış məbləğini (AZN) ardıcıl daxil et:
"1-ci günün satışı: ", "2-ci günün satışı: " və s. formatında sual verilsin.
Ümumi məbləği və orta günlük satışı (double) hesabla və çap et.
Orta satış 500 AZN-dən yuxarıdırsa "Həftə uğurludur", əks halda "Satışı artırmaq lazımdır" çap et.
 */

package homework7;
import java.util.Scanner;
public class Tapsiriq2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalSales = 0;
        int totalDays = 3;

        for (int i = 1; i <= totalDays; i++) {
            System.out.print("Day " + i + " sales amount: ");

            if (!sc.hasNextDouble()) {
                System.err.println("Error: Invalid input! Please enter a numeric amount.");
                sc.next();
                i--;
                continue;
            }

            double dailySale = sc.nextDouble();

            if (dailySale < 0) {
                System.err.println("Error: Sales amount cannot be negative.");
                i--;
                continue;
            }

            totalSales += dailySale;
        }

        double averageSales = totalSales / totalDays;

        System.out.println("\n    Sales Report    ");
        System.out.printf("Total amount: %.2f AZN\n", totalSales);
        System.out.printf("Daily average sales: %.2f AZN\n", averageSales);

        if (averageSales > 500) {
            System.out.println("Result: The week is successful");
        } else {
            System.out.println("Result: Need to increase sales");
        }

        sc.close();

    }
}