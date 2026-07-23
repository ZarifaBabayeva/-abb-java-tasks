public class Servis implements Loglana {

    @Override
    public void log(String mesaj) {
        System.out.println("Log qeydi: " + mesaj);
    }

    public void melumatGoster() {
        System.out.println("Servis işlək vəziyyətdədir.");
    }
}