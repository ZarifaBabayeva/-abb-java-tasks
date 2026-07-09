/*Sinifin orta balı
10 tələbənin balını ardıcıl daxil et
(məs. Scanner ilə bir-bir soruşaraq), cəmini və orta balını hesabla.
Orta bal 70-dən yuxarıdırsa "Sinif uğurludur", aşağıdırsa "Əlavə işə ehtiyac var" çap et.
 */

package homework6;
import java.util.Scanner;

public class Tapsiriq2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        int totalStudents = 10;

        System.out.println("Enter the scores of 10 students:");

        for (int i = 1; i <= totalStudents; i++) {
            System.out.print(i + ". student's score: ");

            if (!sc.hasNextInt()) {
                System.err.println("Error: Please enter a number!");
                sc.next();
                i--;
                continue;
            }

            int score = sc.nextInt();

            if (score < 0 || score > 100) {
                System.err.println("Error:The score should be between 0-100!");
                i--;
                continue;
            }

            sum += score;
        }

        double average = sum / totalStudents;
        System.out.println("\n                      ");
        System.out.println("total summa: " + sum);
        System.out.println("average score: " + average);

        if (average > 70) {
            System.out.println("Result: The class is successful :) ");
        } else {
            System.out.println("Result: Additional work is needed :( ");
        }

        sc.close();
    }
}