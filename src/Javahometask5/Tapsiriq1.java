/* Cüt/Tək və İşarə
Scanner ilə bir tam ədəd alın.
Ədədin cüt yoxsa tək olduğunu çap edin.
Ədədin müsbət, mənfi yoxsa sıfır olduğunu çap edin. */

package Javahometask5;
import java.util.Scanner;
public class Tapsiriq1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please, enter number: ");
        int daxilEdilenEded = scanner.nextInt();

        if (daxilEdilenEded == 0) {
            System.out.println("Is the number odd or even? -> The number entered is zero");
        } else if (daxilEdilenEded % 2 == 0) {
            System.out.println("Is the number odd or even? -> The number is even");
        } else {
            System.out.println("Is the number odd or even? -> The number is odd");
        }


        if (daxilEdilenEded > 0) {
            System.out.println("Is the number positive, negative, or 0? -> The number is positive");
        } else if (daxilEdilenEded < 0) {
            System.out.println("Is the number positive, negative, or 0? -> The number is negative");
        } else {
            System.out.println("Is the number positive, negative, or 0? -> The entered number is zero");
        }

        scanner.close();
    }
}