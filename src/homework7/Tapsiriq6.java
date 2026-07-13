/*Aviaşirkət kodu
İstifadəçi uçuş kodunun ilk 2 hərfini "AZ" kimi (dırnaqda göstərildiyi kimi) daxil edir.
Aşağıdakı uyğunluğa görə aviaşirkət adını çap et:
AZ → Azerbaijan Airlines
TK → Turkish Airlines
QR → Qatar Airways
Siyahıda olmayan kod üçün "Naməlum aviaşirkət" çap et.
 */

package homework7;
import java.util.Scanner;
public class Tapsiriq6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean keepRunning = true;

        System.out.println("    Airline Identification System     ");
        System.out.println("Type 'EXIT' to stop the program.");

        while (keepRunning) {
            System.out.print("\nPlease enter the airline code (e.g., AZ, TK, QR): ");
            String input = sc.nextLine().trim().toUpperCase();

            if (input.equals("EXIT")) {
                System.out.println("Exiting the system. Goodbye!");
                keepRunning = false;
                continue;
            }

            String airlineName;

            switch (input) {
                case "AZ":
                    airlineName = "Azerbaijan Airlines";
                    break;
                case "TK":
                    airlineName = "Turkish Airlines";
                    break;
                case "QR":
                    airlineName = "Qatar Airways";
                    break;
                default:
                    airlineName = "Unknown Airline";
                    break;
            }

            System.out.println("Airline Code: " + input);
            System.out.println("Result: " + airlineName);
        }

        sc.close();
    }
}