/*Nömrə doğrulaması
İstifadəçidən mobil nömrə formatında ədəd
(məs. kod hissəsi 050, 051, 055, 070, 077, 099-dan biri olmalıdır)
daxil almağı simulyasiya et: kodu daxil et, uyğun operatoru (Bakcell, Azercell, Nar) çap et,
uyğun deyilsə "Naməlum operator" yaz.
 */

package homework6;
import java.util.Scanner;

public class Tapsiriq6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter mobile prefix or type 'exit' to stop: ");
            String prefix = sc.next();

            if (prefix.equalsIgnoreCase("exit")) {
                System.out.println("Program finished.");
                break;
            }

            String operator;

            switch (prefix) {
                case "050":
                case "051":
                case "010":
                    operator = "Azercell";
                    break;
                case "055":
                case "099":
                    operator = "Bakcell";
                    break;
                case "070":
                case "077":
                    operator = "Nar";
                    break;
                default:
                    operator = "Unknown operator";
                    break;
            }

            if (operator.equals("Unknown operator")) {
                System.err.println("Result: " + operator);
            } else {
                System.out.println("Result: " + operator);
            }

            System.out.println("                    ");
        }

        sc.close();
    }
}