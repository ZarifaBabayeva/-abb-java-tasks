/* Kredit Qərarı
Scanner ilə yaş (int), aylıq gəlir (double) və kredit məbləği (double) alın. Şərtlər:
Yaş 21-65 aralığında olmalı
Gəlir 800-dən çox olmalı
Məbləğ 300-50000 aralığında olmalı
 */

package Javahometask5;
import java.util.Scanner;
public class Tapsiriq7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        if (!sc.hasNextInt()) {
            System.out.println("Error: Age must be a number!");
            return;
        }
        int age = sc.nextInt();

        System.out.print("Enter your monthly income: ");
        if (!sc.hasNextDouble()) {
            System.out.println("Error: Income must be a numeric value!");
            return;
        }
        double income = sc.nextDouble();

        System.out.print("Enter requested loan amount: ");
        if (!sc.hasNextDouble()) {
            System.out.println("Error: Amount must be a numeric value!");
            return;
        }
        double amount = sc.nextDouble();

        System.out.println("            ");

        if (age < 21 || age > 65) {
            System.out.println("Rejected: Age is not suitable (Must be between 21 and 65).");
        }
        else if (income <= 800) {
            System.out.println("Rejected: Income is too low (Must be greater than 800).");
        }
        else if (amount < 300 || amount > 50000) {
            System.out.println("Rejected: Loan amount is out of range (Must be between 300 and 50000).");
        }
        else {
            System.out.println("APPROVED: Your loan request has been granted.");
            System.out.print("     ");
            System.out.println("Your credit form: ");

            System.out.print("Please, enter loan term in months : ");
            if (!sc.hasNextInt()) {
                System.out.println("Error: Loan term must be a number!");
                return;
            }
            int term = sc.nextInt();

            double interestRate = 18.0;

            double totalInterest = amount * (interestRate / 100);
            double totalPayment = amount + totalInterest;
            double monthlyInstallment = totalPayment / term;

            System.out.println("\n  Your Loan Report  ");
            System.out.println("Interest Rate: " + interestRate + "%");
            System.out.println("Total Interest Amount: " + totalInterest + " AZN");
            System.out.println("Total Repayment Amount: " + totalPayment + " AZN");
            System.out.println("Monthly Installment: " + Math.round(monthlyInstallment * 100.0) / 100.0 + " AZN");
        }

        }

    }

