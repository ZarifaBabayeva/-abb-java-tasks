/*Sadə Kalkulyator
 Analysis: Performs arithmetic operations using switch on a String operator.
 Includes edge-case handling for division by zero and invalid input validation.
*/

package Javahometask5;
import java.util.Scanner;
public class Tapsiriq6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        if (!sc.hasNextDouble()) {
            System.out.println("Error: Invalid numeric input!");
            return;
        }
        double firstNumber = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        String operator = sc.next();

        System.out.print("Enter second number: ");
        if (!sc.hasNextDouble()) {
            System.out.println("Error: Invalid numeric input!");
            return;
        }
        double secondNumber = sc.nextDouble();

        double result = 0;
        boolean isSuccess = true;

        switch (operator) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                if (secondNumber == 0) {
                    System.out.println("Error: Cannot divide by zero!");
                    isSuccess = false;
                } else {
                    result = firstNumber / secondNumber;
                }
                break;
            default:
                System.out.println("Error: Unknown operator symbol!");
                isSuccess = false;
        }

        if (isSuccess) {
            System.out.println("Calculation Result: " + firstNumber + " " + operator + " " + secondNumber + " = " + result);
        }

        sc.close();
    }
}
