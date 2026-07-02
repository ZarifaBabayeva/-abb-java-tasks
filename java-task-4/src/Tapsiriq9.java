//Email Yoxlanışı

import java.util.Scanner;

public class Tapsiriq9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Email ünvanınızı daxil edin: ");
        String email = sc.next();


        // "@" simvolu varmı?
        boolean atVarmi = email.contains("@");

        // "." simvolu varmı?
        boolean noqteVarmi = email.contains(".");

        //"@"-dən əvvəl ən azı 2 simvol varmı?
        boolean uzunluqDuzdurmu = email.indexOf("@") >= 2;

        System.out.println("\n Email Yoxlanışı ");
        System.out.println("\"@\" işarəsi var: " + atVarmi);
        System.out.println("\".\" işarəsi var: " + noqteVarmi);
        System.out.println("\"@\"-dən əvvəl 2+ simvol var: " + uzunluqDuzdurmu);

        sc.close();
    }
}
