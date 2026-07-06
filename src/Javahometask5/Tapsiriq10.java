/*Bank Menyusu
Aşağıdakı menyunu çap edin və istifadəçidən seçim (1-4) alın:
1 - Balans yoxla
2 - Pul yatır
3 - Pul çıxar
4 - Çıxış
 */

package Javahometask5;
import java.util.Scanner;
public class Tapsiriq10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("      WELCOME TO ABB BANK    ");
        System.out.println("1 - Check Balance");
        System.out.println("2 - Deposit Money");
        System.out.println("3 - Withdraw Money");
        System.out.println("4 - Exit");
        System.out.println("                             ");
        System.out.print("Please select an option (1-4): ");

        if (!sc.hasNextInt()) {
            System.out.println("Error: Invalid input! Please enter a number between 1 and 4.");
            return;
        }

        int userChoice = sc.nextInt();

        switch (userChoice) {
            case 1:
                System.out.println("Menu Status: Accessing Balance...");
                System.out.println("Your current balance is: 1250.00 AZN");
                break;
            case 2:
                System.out.println("Menu Status: Preparing Deposit...");
                System.out.println("Please insert your cash into the ATM.");
                break;
            case 3:
                System.out.println("Menu Status: Preparing Withdrawal...");
                System.out.println("Please enter the amount you wish to withdraw.");
                break;
            case 4:
                System.out.println("Exiting the system... Thank you for choosing our bank!");
                break;
            default:
                System.out.println("Error: Invalid choice! Please select a valid menu option (1-4).");
        }

        sc.close();
    }
}
