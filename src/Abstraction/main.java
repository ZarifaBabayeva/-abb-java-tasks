package Abstraction;
public class main {
    public static void main(String[] args) {
        KofeMasini masin = new KofeMasini();

        System.out.println();

        System.out.println("[İstifadəçi]: 'Kofe hazırla' düyməsinə basdı.");
        masin.kofeHazirla();





        // TAPŞIRIQ 8: Bankomat
        System.out.println(" Tapşırıq 8: Bankomat Sistemi ");
        Bankomat atm = new Bankomat();

        System.out.println("[Test 1]: Balans daxilində məbləğ yoxlanılır");
        atm.pulCek(200.0);

        System.out.println("[Test 2]: Balansdan artıq məbləğ yoxlanılır");
        atm.pulCek(400.0);

        System.out.println("[Test 3]: Yanlış (mənfi) məbləğ yoxlanılır");
        atm.pulCek(-50.0);

        System.out.println("                                           ");

    }
}