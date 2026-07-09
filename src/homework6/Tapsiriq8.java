/*Bilet qiyməti
Kinoteatr bileti üçün yaş daxil et: 7-yə qədər pulsuz,
8-17 arası 3 AZN, 18-64 arası 7 AZN, 65+ 4 AZN. Ödəniləcək məbləği çap et.
Sonra istifadəçidən neçə bilet aldığını soruş və ümumi məbləği hesabla.
 */


package homework6;
import java.util.Scanner;

public class Tapsiriq8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age;
        while (true) {
            System.out.print("Enter visitor's age: ");
            if (!sc.hasNextInt()) {
                System.err.println("Error: Please enter a valid number for age!");
                sc.next();
                continue;
            }
            age = sc.nextInt();
            if (age < 0) {
                System.err.println("Error: Age cannot be negative!");
            } else {
                break;
            }
        }

        int ticketPrice;
        if (age <= 7) {
            ticketPrice = 0;
            System.out.println("Ticket Category: Child (Free)");
        } else if (age <= 17) {
            ticketPrice = 3;
            System.out.println("Ticket Category: Youth (3 AZN)");
        } else if (age <= 64) {
            ticketPrice = 7;
            System.out.println("Ticket Category: Adult (7 AZN)");
        } else {
            ticketPrice = 4;
            System.out.println("Ticket Category: Senior (4 AZN)");
        }

        int quantity;
        while (true) {
            System.out.print("How many tickets would you like to buy? ");
            if (!sc.hasNextInt()) {
                System.err.println("Error: Please enter a valid number for quantity!");
                sc.next();
                continue;
            }
            quantity = sc.nextInt();
            if (quantity < 1) {
                System.err.println("Error: Quantity must be at least 1!");
            } else {
                break;
            }
        }

        int totalCost = ticketPrice * quantity;

        System.out.println("\n    Order Summary     ");
        System.out.println("Price per ticket: " + ticketPrice + " AZN");
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Amount: " + totalCost + " AZN");
        System.out.println("                  ");

        sc.close();
    }
}