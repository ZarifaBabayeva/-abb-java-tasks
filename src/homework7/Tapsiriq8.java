/*Muzey bileti
Muzey bileti üçün bir nəfərin yaşını daxil et: 0–6 pulsuz, 7–17 arası 2 AZN, 18–60 arası 5 AZN,
61+ 3 AZN. Bir bilet üçün qiyməti çap et. Sonra həmin istifadəçidən neçə bilet aldığını soruş (
bütün biletlər eyni yaş kateqoriyasınadır) və ümumi məbləği hesablayıb çap et.
 */


package homework7;
import java.util.Scanner;
public class Tapsiriq8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = -1;
        int ticketCount = -1;
        double pricePerTicket = 0;

        System.out.println("    Museum Electronic Ticket System     ");

        while (age < 0 || age > 120) {
            System.out.print("Please enter the visitor's age: ");
            if (sc.hasNextInt()) {
                age = sc.nextInt();
                if (age < 0 || age > 120) {
                    System.err.println("Error: Please enter a realistic age (0-120).");
                }
            } else {
                System.err.println("Error: Invalid input! Please enter a whole number.");
                sc.next();
            }
        }

        if (age >= 0 && age <= 6) {
            pricePerTicket = 0;
            System.out.println("Category: Children (Under 7)");
        } else if (age >= 7 && age <= 17) {
            pricePerTicket = 2;
            System.out.println("Category: Students (7-17)");
        } else if (age >= 18 && age <= 60) {
            pricePerTicket = 5;
            System.out.println("Category: Adults (18-60)");
        } else {
            pricePerTicket = 3;
            System.out.println("Category: Seniors (61+)");
        }

        System.out.println("Price per ticket: " + pricePerTicket + " AZN");

        while (ticketCount <= 0) {
            System.out.print("\nHow many tickets would you like to purchase? ");
            if (sc.hasNextInt()) {
                ticketCount = sc.nextInt();
                if (ticketCount <= 0) {
                    System.err.println("Error: Ticket quantity must be at least 1.");
                }
            } else {
                System.err.println("Error: Invalid input! Please enter a numeric value.");
                sc.next();
            }
        }

        double totalAmount = pricePerTicket * ticketCount;

        System.out.println("\n    Final Receipt    ");
        System.out.println("Age Category Price: " + pricePerTicket + " AZN");
        System.out.println("Quantity: " + ticketCount);
        System.out.println("Total Amount to Pay: " + totalAmount + " AZN");
        System.out.println("         ");

        sc.close();
    }
}