/*Hava statusu
Havanın temperaturunu (°C, tam ədəd) daxil et. Temperatura görə statusu təyin et:
25-dən yuxarı → İsti
15–25 → Mülayim
0–14 → Soyuq
0-dan aşağı → Şaxta
Nəticəni Temperatur: X°C → Status: Y formatında çap et.
 */

package homework7;
import java.util.Scanner;
public class Tapsiriq1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temperature = 0;
        boolean isValid = false;

        while (!isValid) {
            System.out.print("Please enter the air temperature (°C) as a whole number: ");

            if (sc.hasNextInt()) {
                temperature = sc.nextInt();
                isValid = true;
            } else {
                System.err.println("Error: Invalid input! Please enter a numeric value.");
                sc.next();
            }
        }

        String status = "";

        if (temperature > 25) {
            status = "hot";
        } else if (temperature >= 15 && temperature <= 25) {
            status = "mild";
        } else if (temperature >= 0 && temperature <= 14) {
            status = "cold";
        } else { // temperature < 0
            status = "frost";
        }

        System.out.println("Temperature: " + temperature + "°C → Result: " + status);

        sc.close();
    }
}