/*Vahid çevirici menyusu
İstifadəçiyə menyu göstər: 1) Metr → Fut, 2) Kiloqram → Funt, 3) Selsi → Fahrenheit, 0) Çıxış.
İstifadəçi seçim edir, 0-dan fərqli seçimdə 1 ədəd daxil edilir,
uyğun düsturla nəticə "Nəticə: X" formatında çap olunur — və menyu yenidən görünür.
İstifadəçi 0 seçdikdə "Çıxış edildi" çap edilib proqram bitir.
 */


package homework7;
import java.util.Scanner;
public class Tapsiriq9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isRunning = true;

        System.out.println("    Professional Unit Converter   ");

        while (isRunning) {
            System.out.println("\n        MENU       ");
            System.out.println("1) Meter → Foot");
            System.out.println("2) Kilogram → Pound");
            System.out.println("3) Celsius → Fahrenheit");
            System.out.println("0) Exit");
            System.out.print("Please select an option: ");

            if (!sc.hasNextInt()) {
                System.err.println("Error: Invalid option! Please enter a number from the menu.");
                sc.next();
                continue;
            }

            int choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("Exited successfully.");
                isRunning = false;
                continue;
            }

            if (choice >= 1 && choice <= 3) {
                System.out.print("Enter the value to convert: ");

                if (!sc.hasNextDouble()) {
                    System.err.println("Error: Invalid input! Please enter a numeric value.");
                    sc.next();
                    continue;
                }

                double inputVal = sc.nextDouble();
                double result = 0;

                switch (choice) {
                    case 1:
                        result = inputVal * 3.28084;
                        System.out.printf("Result: %.2f ft\n", result);
                        break;
                    case 2:
                        result = inputVal * 2.20462;
                        System.out.printf("Result: %.2f lbs\n", result);
                        break;
                    case 3:
                        result = (inputVal * 1.8) + 32;
                        System.out.printf("Result: %.2f °F\n", result);
                        break;
                }
            } else {
                System.err.println("Error: No such option in the menu. Try again.");
            }
        }

        sc.close();
    }
}