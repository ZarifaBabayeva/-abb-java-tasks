/*Bildiriş sistemi
Ata sinif Bildiris-də mesaj göndərən metod olsun.
EmailBildiris, SmsBildiris və PushBildiris varisləri həmin metodu öz kanalına uyğun yenidən yazsın.
Proqramda üç bildirişi ata tipli massivdə saxla və dövrə ilə hamısını göndər.
 */


package Polymorphism;
public class Bildiris {
    public void gonder(String mesaj) {
        System.out.println("Ümumi bildiriş: " + mesaj);
    }
}