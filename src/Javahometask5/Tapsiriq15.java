/*Parol Gücü Yoxlaması
Scanner ilə parol (String) alın və uzunluğunu .length() ilə tapın. Qaydalar:
Uzunluq 6-dan azdırsa → "Zəif"
Uzunluq 6-9 arasıdırsa → "Orta"
Uzunluq 10 və çoxdursa → "Güclü"
Bonus: parol boşdursa (uzunluq 0) ayrıca "Parol boş ola bilməz" çap edin.
 */

package Javahometask5;
import java.util.Scanner;
public class Tapsiriq15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your password: ");

        String userPassword = sc.nextLine();
        int passwordLength = userPassword.length();

        System.out.println("            ");

        if (passwordLength == 0) {
            System.out.println("Result: Password cannot be empty! ");
        } else if (passwordLength < 6) {
            System.out.println("Result: Weak ");
        } else if (passwordLength >= 6 && passwordLength <= 9) {
            System.out.println("Result: Medium ");
        } else {
            System.out.println("Result: Strong ");
        }

        sc.close();
    }
}
