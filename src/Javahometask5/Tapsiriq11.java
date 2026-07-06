/*Sait yoxsa Samit
Scanner ilə bir hərf (char) alın
Switch ilə yoxlayın: hərf a, e, i, o, u-dan (böyük və kiçik hərflə)
biridirsə "Sait", əks halda default-da "Samit" çap edin.
*/

package Javahometask5;
import java.util.Scanner;
public class Tapsiriq11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the letter: ");
        if (!sc.hasNext()) {
            System.out.println("Error: No input detected!");
            return;
        }

        String input = sc.next();

        if (input.length() != 1) {
            System.out.println("Error: Please enter only one character!");
            return;
        }

        char letter = input.charAt(0);

        if (!Character.isLetter(letter)) {
            System.out.println("Error: The character is not a valid letter!");
            return;
        }

        switch (letter) {
            case 'a': case 'A':
            case 'e': case 'E':
            case 'i': case 'I':
            case 'o': case 'O':
            case 'u': case 'U':
                System.out.println("Result: Vowel");
                break;
            default:
                System.out.println("Result: Consonant");
                break;
        }

        sc.close();
    }
}
