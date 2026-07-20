package Polymorphism;

public class main {
    public static void main(String[] args) {
        Kalkulyator calc = new Kalkulyator();

        System.out.println("     Tapşırıq 5: Kalkulyator (Method Overloading)   ");
        System.out.println();

        int result1 = calc.vurma(10, 5);
        System.out.println("[Test 1]: İki tam ədədin hasili (10 * 5)");
        System.out.println("Nəticə: " + result1);
        System.out.println("                                          ");

        int result2 = calc.vurma(2, 4, 6);
        System.out.println("[Test 2]: Üç tam ədədin hasili (2 * 4 * 6)");
        System.out.println("Nəticə: " + result2);
        System.out.println("                                            ");

        double result3 = calc.vurma(2.5, 4.0);
        System.out.println("[Test 3]: İki kəsr ədədin hasili (2.5 * 4.0)");
        System.out.println("Nəticə: " + result3);

        System.out.println("                                             ");


//  TAPŞIRIQ 6: Bildiriş Sistemi
        System.out.println("      Tapşırıq 6: Bildiriş Sistemi (Polymorphism)   ");

        Bildiris[] bildirisler = new Bildiris[3];
        bildirisler[0] = new EmailBildiris();
        bildirisler[1] = new SmsBildiris();
        bildirisler[2] = new PushBildiris();

        String gonderilecekMesaj = "Təhlükəsizlik xəbərdarlığı: Hesabınıza yeni giriş aşkarlandı!";

        System.out.println("Göndərilən mesaj: " + gonderilecekMesaj);
        System.out.println("                                    ");

        for (int i = 0; i < bildirisler.length; i++) {
            System.out.print((i + 1) + ". ");
            bildirisler[i].gonder(gonderilecekMesaj);
        }

        System.out.println("                                       ");
    }
}