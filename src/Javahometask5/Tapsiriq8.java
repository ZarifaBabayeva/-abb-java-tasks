/* Üçbucaq Növü
Scanner ilə üç tərəf uzunluğu alın (a, b, c).
Əvvəlcə üçbucağın mümkün olub-olmadığını yoxlayın
(hər tərəf digər ikisinin cəmindən kiçik olmalıdır).
Mümkündürsə, növünü müəyyən edin:
 */

package Javahometask5;
import java.util.Scanner;
public class Tapsiriq8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of side A: ");
        if (!sc.hasNextDouble()) {
            System.out.println("Error: Invalid input!");
            return;
        }
        double sideA = sc.nextDouble();

        System.out.print("Enter length of side B: ");
        if (!sc.hasNextDouble()) {
            System.out.println("Error: Invalid input!");
            return;
        }
        double sideB = sc.nextDouble();

        System.out.print("Enter length of side C: ");
        if (!sc.hasNextDouble()) {
            System.out.println("Error: Invalid input!");
            return;
        }
        double sideC = sc.nextDouble();

        System.out.println("            ");

        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            System.out.println("Triangle sides must be positive numbers!");
        }

        else if ((sideA + sideB <= sideC) || (sideA + sideC <= sideB) || (sideB + sideC <= sideA)) {
            System.out.println("Result: Such a triangle does not exist! (Triangle Inequality Violation)");
        } else {
            if (sideA == sideB && sideB == sideC) {
                System.out.println("Result: Equilateral triangle");
            } else if (sideA == sideB || sideB == sideC || sideA == sideC) {
                System.out.println("Result: Isosceles triangle");
            } else {
                System.out.println("Result: Scalene triangle");
            }
        }

        sc.close();
    }
}