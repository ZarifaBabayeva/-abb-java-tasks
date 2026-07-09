/*Kassa qalığı
İlkin balans (double) ver.
İstifadəçidən ardıcıl əməliyyat məbləğləri al
(müsbət = mədaxil, mənfi = məxaric), 0 yazılanda dayan.
Hər əməliyyatdan sonra balansı yenilə və çap et; balans mənfiyə düşsə xəbərdarlıq göstər.
 */


package homework6;
import java.util.Scanner;

public class Tapsiriq3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter initial balance: ");

        while (!sc.hasNextDouble()) {
            System.err.println("Error:Please enter a number!");
            sc.next();
        }
        double balance = sc.nextDouble();

        System.out.println("Enter transactions (Positive for deposit, Negative for withdrawal, 0 to stop:");

        while (true) {
            System.out.print("Transaction amount: ");

            if (!sc.hasNextDouble()) {
                System.err.println("Error: Invalid input! Please enter a number!");
                sc.next();
                continue;
            }

            double transaction = sc.nextDouble();

            if (transaction == 0) {
                System.out.println("Process finished!");
                break;
            }

            balance += transaction;

            System.out.println("Updated balance:  " + balance);

            if (balance < 0) {
                System.err.println("WARNING: Negative balance! Current balance:  " + balance);
            }

            System.out.println("                          ");
        }

        System.out.println("Final account balance: " + balance);
        sc.close();
    }
}
