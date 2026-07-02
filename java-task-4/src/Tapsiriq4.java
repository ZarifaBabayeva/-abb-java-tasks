//Dəyişənlərin Yerini Dəyişin (Swap)

import java.util.Scanner;

public class Tapsiriq4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Birinci ədədi daxil edin: ");
        int a = sc.nextInt();

        System.out.print("İkinci ədədi daxil edin: ");
        int b = sc.nextInt();

        System.out.println("\nYerdəyişmədən əvvəl: a = " + a + ", b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;


        System.out.println("Yerdəyişmədən sonra: a = " + a + ", b = " + b);

        sc.close();
    }
}
