/* Üç Ədəddən Ən Böyüyü
Scanner ilə 3 tam ədəd alın: a, b, c.
Ən böyük olanı tapıb çap edin (məs: "Ən böyük: 42")
Bonus: eyni zamanda ən kiçiyini də tapın.  */

package Javahometask5;
import java.sql.SQLOutput;
import java.util.Scanner;
 public class Tapsiriq2{
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         System.out.print("Enter first number: ");
         int firstNumber = sc.nextInt();

         System.out.print("Enter second number: ");
         int secondNumber = sc.nextInt();

         System.out.print("Enter third number: ");
         int thirdNumber = sc.nextInt();

         int Max;
         if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
             Max = firstNumber;
         } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
             Max = secondNumber;
         } else {
             Max = thirdNumber;
         }

         int Min;
         if (firstNumber <= secondNumber && firstNumber <= thirdNumber) {
             Min = firstNumber;
         } else if (secondNumber <= firstNumber && secondNumber <= thirdNumber) {
             Min = secondNumber;
         } else {
             Min = thirdNumber;
         }

         System.out.println("          ");
         System.out.println("Max number: " + Max);
         System.out.println("Min number: " + Min);

         sc.close();
     }
 }

