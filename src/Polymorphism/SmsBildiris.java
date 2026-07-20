package Polymorphism;
public class SmsBildiris extends Bildiris {
    @Override
    public void gonder(String mesaj) {
        System.out.println("[SMS]: '" + mesaj + "' - mətni mobil nömrəyə SMS olaraq göndərildi.");
    }
}