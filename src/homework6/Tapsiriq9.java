/*Sadə kalkulyator menyusu
İstifadəçiyə menyu göstər: 1) Cəm, 2) Fərq, 3) Hasil, 4) Bölmə, 0) Çıxış.
İstifadəçi seçim edir, 2 ədəd daxil edir, nəticəni görür — və menyu yenidən görünür.
İstifadəçi 0 seçənə qədər davam edir.
 */

package homework6;
import java.util.Scanner;

public class Tapsiriq9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n    Calculator Menu    ");
            System.out.println("1) Sum (+)");
            System.out.println("2) Difference (-)");
            System.out.println("3) Product (*)");
            System.out.println("4) Division (/)");
            System.out.println("0) Exit");
            System.out.print("Select an option: ");

            if (!sc.hasNextInt()) {
                System.err.println("Error: Please enter a menu number (0-4)!");
                sc.next();
                continue;
            }

            int choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }

            if (choice < 1 || choice > 4) {
                System.err.println("Error: Invalid selection! Please choose between 0 and 4.");
                continue;
            }

            double num1, num2;

            System.out.print("Enter first number: ");
            while (!sc.hasNextDouble()) {
                System.err.println("Error: Invalid input! Enter a number.");
                sc.next();
            }
            num1 = sc.nextDouble();

            System.out.print("Enter second number: ");
            while (!sc.hasNextDouble()) {
                System.err.println("Error: Invalid input! Enter a number.");
                sc.next();
            }
            num2 = sc.nextDouble();

            switch (choice) {
                case 1:
                    System.out.println("Result: " + num1 + " + " + num2 + " = " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Result: " + num1 + " - " + num2 + " = " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Result: " + num1 + " * " + num2 + " = " + (num1 * num2));
                    break;
                case 4:
                    if (num2 == 0) {
                        System.err.println("Error: Cannot divide by zero!");
                    } else {
                        System.out.printf("Result: %.2f / %.2f = %.2f\n", num1, num2, (num1 / num2));
                    }
                    break;
            }
            System.out.println("                ");
        }

        sc.close();
    }
}
