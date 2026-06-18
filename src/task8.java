//Celsius → Fahrenheit

public class task8 {
    public static void main(String[] args) {

        int c1 = 100;
        double f_sehv = c1 * 9 / 5 + 32;
        System.out.println("Səhv hesablama (9/5 ilə): " + f_sehv);

        // 0°C üçün
        int c0 = 0;
        double f0 = c0 * 9.0 / 5 + 32;
        System.out.println("0°C -> Fahrenheit: " + f0);

        // 100°C üçün
        int c100 = 100;
        double f100 = c100 * 9.0 / 5 + 32;
        System.out.println("100°C -> Fahrenheit: " + f100);

        // 37°C üçün
        int c37 = 37;
        double f37 = c37 * 9.0 / 5 + 32;
        System.out.println("37°C -> Fahrenheit: " + f37);

    }
}