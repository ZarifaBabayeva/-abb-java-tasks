//Kodu Oxu — Nəticəni Tap

public class task15 {
    public static void main(String[] args) {
        int a = 10, b = 3;
        boolean x = true, y = false;
        String s = "Java";

        System.out.println(a + b * 2);        // Nəticə: 16

        System.out.println(a / b);            // Nəticə: 3

        System.out.println(a % b);            // Nəticə: 1

        System.out.println(x && !y);           // Nəticə: true

        System.out.println(!x || y);           // Nəticə: false

        System.out.println(a > 5 && b < 5);   // Nəticə: true

        System.out.println(s + a);             // Nəticə: Java10

        System.out.println("3" + 4);           // Nəticə: 34

        System.out.println(3 + 4 + "!");      // Nəticə: 7!

        System.out.println("!" + 3 + 4);      // Nəticə: !34
    }
}