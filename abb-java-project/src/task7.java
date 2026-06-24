//Məntiqi Şərt Quruluşu

public class task7 {
    public static void main(String args[]) {

        // 1. Temperatur 36-dan çox, 37.5-dən azdır
        double temp = 36.8;
        boolean isNormalTemp = (temp > 36) && (temp < 37.5);
        System.out.println("Hərarət normaldır: " + isNormalTemp);

        // 2. Sürət 0-dan çox, 120-dən az VƏ YA yanacaq 0-dan çoxdur
        int suret = 95;
        int yanacaq = 0;
        boolean isMovingOrHasFuel = (suret > 0 && suret < 120) || (yanacaq > 0);
        System.out.println("Sürət və ya yanacaq uyğundur: " + isMovingOrHasFuel);

        // 3. Hesab aktiv deyil VƏ ya balans mənfidir
        boolean aktiv = false;
        double balans = -50.0;
        boolean accountAlert = !aktiv || (balans < 0);
        System.out.println("Hesabda problem var: " + accountAlert);

        // 4. Ad boş deyil (uzunluğu 0-dan çoxdur) VƏ yaş 18-dən böyükdür
        String ad = "Anar";
        int yas = 22;
        boolean isValidUser = (ad.length() > 0) && (yas > 18);
        System.out.println("İstifadəçi kriteriyalara uyğundur: " + isValidUser);
    }
}