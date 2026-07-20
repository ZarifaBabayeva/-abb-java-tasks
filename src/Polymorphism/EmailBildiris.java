package Polymorphism;
public class EmailBildiris extends Bildiris {
    @Override
    public void gonder(String mesaj) {
        System.out.println("[E-mail]: '" + mesaj + "' - mətni poçt ünvanına göndərildi.");
    }
}