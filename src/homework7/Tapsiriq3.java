/*Anbar stoku
Anbarın ilkin stoku 200 ədəddir.
İstifadəçidən ardıcıl əməliyyat sayları al (müsbət ədəd = mal gəlib, mənfi ədəd = mal satılıb),
0 daxil edildikdə dayan. Hər əməliyyatdan sonra yeni stoku "Yeni stok: X" formatında çap et.
 */


package homework7;
import java.util.Scanner;
public class Tapsiriq3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int currentStock = 200;

        System.out.println("   Warehouse Inventory System   ");
        System.out.println("Initial Stock: " + currentStock);
        System.out.println("Enter positive values for arrivals, negative for sales (Enter 0 to stop).");

        while (true) {
            System.out.print("Enter transaction amount: ");

            if (!sc.hasNextInt()) {
                System.err.println("Error: Invalid input! Please enter a whole number.");
                sc.next();
                continue;
            }

            int transaction = sc.nextInt();

            if (transaction == 0) {
                System.out.println("System stopped. Final inventory process completed.");
                break;
            }

            if (transaction < 0 && Math.abs(transaction) > currentStock) {
                System.err.println("Error: Not enough stock for this sale! Current stock: " + currentStock);
                continue;
            }

            currentStock += transaction;

            System.out.println("New stock: " + currentStock);
        }

        System.out.println("Inventory closed. Total items remaining: " + currentStock);

        sc.close();

    }
}