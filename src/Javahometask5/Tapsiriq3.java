/* İmtahan Qiymətləndirməsi
 Scanner ilə imtahan balını alın (0-100). Bala görə qiymət çap edin:
 */


package Javahometask5;
import java.util.Scanner;
public class Tapsiriq3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your exam score: ");
        int examScore = sc.nextInt();


        if (examScore < 0 || examScore > 100) {
            System.out.println("PLease, enter correct score! ");
        }

        else if (examScore >= 90) {
            System.out.println("Result: Excellent (5) ");
        } else if (examScore >= 80) {
            System.out.println("Result: Very good (4) ");
        } else if (examScore >= 70) {
            System.out.println("Result: Good (3) ");
        } else if (examScore >= 60) {
            System.out.println("Result: Enough (2) ");
        } else {
            System.out.println("Result: Insufficient (1) ");
        }

        sc.close();
    }
}
