// String Müqayisəsi — == ilə .equals() fərqi

public class task17 {
    public static void main(String[] args) {
        String s1 = "test";
        String s2 = "test";
        String s3 = "TEST";

        // .equals() -> Məzmunu yoxlayır
        System.out.println(s1.equals(s2));            // true -> Çünki hər ikisi "test"-dir.
        System.out.println(s1.equals(s3));            // false -> Çünki biri kiçik, biri böyük hərflədir.
        System.out.println(s1.equalsIgnoreCase(s3));  // true -> Böyük/kiçik fərqinə baxmadan yoxlayır.
        System.out.println(s1.equals("  test  ".trim())); // true -> trim() boşluqları sildiyi üçün "test" qalır.

        // == -> Yaddaşdakı ünvanı (referansı) yoxlayır

        String s4 = new String("test");

        System.out.println(s1 == s2);               // true -> Niyə? Çünki Java "String Pool"da eyni data saxlanılır
        System.out.println(s1 == s4);               // false -> Niyə? Çünki 'new String' həmişə yaddaşda yenu yer açır.
    }
}
