/*Bildiriş zənciri
Bir bildiriş sistemi qur. Bildiriş ata class-ında gonder() metodu olsun
(ümumi bir mesaj çap etsin). EmailBildiris class-ı Bildiriş-dən miras alıб gonder()-i override etsin —
amma öz işini görməzdən əvvəl ata versiyasını super.gonder() ilə çağırsın,
sonra öz email-ə aid əlavəsini etsin. Daha sonra TeciliEmailBildiris class-ını
EmailBildiris-dən miras aldır (çoxsəviyyəli) və eyni məntiqlə bir addım da genişləndir.
Hər üç səviyyədən obyekt yaradıб nəticəni müşahidə et.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("   1. Səviyyə (Ata)   ");
        Bildiris b1 = new Bildiris();
        b1.gonder();

        System.out.println("\n   2. Səviyyə (Email)  ");
        EmailBildiris b2 = new EmailBildiris();
        b2.gonder();

        System.out.println("\n   3. Səviyyə (Təcili Email)   ");
        TeciliEmailBildiris b3 = new TeciliEmailBildiris();
        b3.gonder();
    }
}