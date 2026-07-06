/*BMI Kateqoriyası
Scanner ilə çəki (kq) və boy (metrlə) alın. BMI-ni çəki / (boy * boy) düsturu ilə hesablayın. Nəticəyə görə kateqoriyanı çap edin:
18.5-dən az → "Arıq"
18.5-24.9 → "Normal"
25-29.9 → "Artıq çəkili"
30 və yuxarı → "Piylənmə"
 */


package Javahometask5;
import java.util.Scanner;
public class Tapsiriq13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight in kg : ");
        if (!sc.hasNextDouble()) {
            System.out.println("Error: Invalid input! Please enter a numeric value for weight.");
            return;
        }
        double userWeight = sc.nextDouble();

        System.out.print("Enter height in meters: ");
        if (!sc.hasNextDouble()) {
            System.out.println("Error: Invalid input! Please enter a numeric value for height.");
            return;
        }
        double userHeight = sc.nextDouble();

        System.out.println("            ");

        if (userWeight <= 0 || userHeight <= 0) {
            System.out.println("Result: Invalid input! Weight and height must be positive numbers.");
            return;
        }

        double calculatedBMI = userWeight / (userHeight * userHeight);

        System.out.printf("Your BMI: %.1f%n", calculatedBMI);

        if (calculatedBMI < 18.5) {
            System.out.println("Category: Underweight");
        } else if (calculatedBMI >= 18.5 && calculatedBMI <= 24.9) {
            System.out.println("Category: Normal");
        } else if (calculatedBMI >= 25 && calculatedBMI <= 29.9) {
            System.out.println("Category: Overweight");
        } else {
            System.out.println("Category: Obesity");
        }

        sc.close();
    }
}
