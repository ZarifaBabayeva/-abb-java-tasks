/*Ən yaxşı nəticə
Futbol matçında bir komandanın 5 oyunçusunun qol sayını ardıcıl daxil et.
Ən çox qol vuran oyunçunun nömrəsini (1-5) və qol sayını tap, çap et.
 */

package homework6;
import java.util.Scanner;

public class Tapsiriq4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxGoals = -1;
        int topScorerNumber = 0;
        int totalPlayers = 5;

        System.out.println("Enter the number of goals for 5 players:");

        for (int i = 1; i <= totalPlayers; i++) {
            System.out.print("Player " + i + " goals: ");

            if (!sc.hasNextInt()) {
                System.err.println("Error: Invalid input! Please enter a number.");
                sc.next();
                i--;
                continue;
            }

            int currentGoals = sc.nextInt();

            if (currentGoals < 0) {
                System.err.println("Error: Goals cannot be negative!");
                i--;
                continue;
            }

            if (currentGoals > maxGoals) {
                maxGoals = currentGoals;
                topScorerNumber = i;
            }
        }

        System.out.println("\n                       ");
        System.out.println("The top scorer is Player " + topScorerNumber);
        System.out.println("Number of goals: " + maxGoals);
        System.out.println("                         ");

        sc.close();
    }
}
