public class Main {
    public static void main(String[] args) {
        Depozit depozit = new Depozit(1000.0);
        depozit.balansGoster();
        depozit.faizHesabla();

        System.out.println("                   ");

        Kredit kredit = new Kredit(2000.0);
        kredit.balansGoster();
        kredit.faizHesabla();

        // Hesab class-ından obyekt yaratmağa çalışsaq:
        // Hesab h = new Hesab(500); // BU SƏTİR SƏHV VERƏCƏK (Compile-time error)
        // İzah: Abstract class-lar natamam olduğu üçün onlardan birbaşa obyekt yaratmaq olmaz.
    }
}
