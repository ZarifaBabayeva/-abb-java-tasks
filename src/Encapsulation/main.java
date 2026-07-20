package Encapsulation;

public class main {
    public static void main(String[] args) {
        // TAPŞIRIQ 1: Telefon Batareyası
        Tapsiriq1 myPhone = new Tapsiriq1();

        System.out.println("   Telefon Batareya Sistemi Yoxlanılır   ");

        System.out.println("[Test 1]: 75% təyin edilir...");
        myPhone.setBatteryPercentage(75);
        System.out.println("Nəticə: Cari batareya səviyyəsi: " + myPhone.getBatteryPercentage() + "%");
        System.out.println("                                  ");

        System.out.println("[Test 2]: 120% təyin edilir...");
        myPhone.setBatteryPercentage(120);
        System.out.println("Nəticə: " + myPhone.getBatteryPercentage() + "%");
        System.out.println("                                  ");

        System.out.println("[Test 3]: -20% teyin edilir...");
        myPhone.setBatteryPercentage(-20);
        System.out.println("Nəticə: " + myPhone.getBatteryPercentage() + "%");
        System.out.println("                                   ");

        System.out.println("[Test 4]: 100% teyin edilir...");
        myPhone.setBatteryPercentage(100);
        System.out.println("Yekun batareya vƏziyyƏti: " + myPhone.getBatteryPercentage() + "%");

        System.out.println("                                 ");
        System.out.println("                                ");




        //  TAPŞIRIQ 2: Tələbə Balı
        Tapsiriq2 student = new Tapsiriq2();

        System.out.println("   Tələbə Qiymətləndirmə Sistemi   ");

        student.setName("Zərifə");
        student.setScore(97);

        System.out.println("[Test 1]: Düzgün məlumatlar çap olunur");
        System.out.println("Ad: " + student.getName() +
                ", Bal: " + student.getScore() +
                ", Qiymət: " + student.getGradeLetter());
        System.out.println("                                ");

        System.out.println("[Test 2]: Səhv bal (-5) daxil edilir");
        student.setScore(-5);
        System.out.println("Nəticə: Tələbənin balı dəyişmədi: " + student.getScore());

        System.out.println("                                ");

        System.out.println("[Test 3]: Səhv bal (150) daxil edilir");
        student.setScore(150);
        System.out.println("Nəticə: Bal dəyişmədi, son keçərli bal: " + student.getScore());

        System.out.println("                                ");
    }
}