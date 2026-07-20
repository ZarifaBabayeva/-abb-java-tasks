package Polymorphism;
public class PushBildiris extends Bildiris {
    @Override
    public void gonder(String mesaj) {
        System.out.println("[Push]: '" + mesaj + "' - mətni tətbiq bildirişi kimi ekrana çıxdı.");
    }
}