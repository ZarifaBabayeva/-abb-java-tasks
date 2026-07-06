/* Uyğun (Keçən) İl Yoxlaması
 Scanner ilə il ədədi alın (məs: 2024).
  Qayda: il 4-ə bölünürsə və 100-ə bölünmürsə → uyğun ildir.
  Amma il 400-ə bölünürsə → yenə də uyğun ildir.
  Nəticəni ternary operatordan istifadə edərək tək sətirdə çap edin:*/

package Javahometask5;
import java.util.Scanner;
public class Tapsiriq4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the year you want to check: ");

        if (!sc.hasNextInt()) {
            System.out.println("Error: Please enter correct format year!");
            return;
        }

        int enterYear = sc.nextInt();

        if (enterYear <= 0) {
            System.out.println("Error:Year must be a positive integer!");
            return;
        } else if (enterYear > 2100) {
            System.out.println("The entered year is too far in the future (Limit: 2100)");
            return;
        }


        String result = ((enterYear % 4 == 0 && enterYear % 100 != 0) || (enterYear % 400 == 0))
                ? "Result: " +  "Suitable year"
                : "Result: " + "Not a suitable year";

        System.out.println(result);

        sc.close();
    }
}