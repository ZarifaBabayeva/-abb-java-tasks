package Inheritance;
public class main {
    public static void main(String[] args) {
        System.out.println("    Şirkət İdarəetmə Sistemi  ");
        System.out.println();

        Menecer manager = new Menecer("Asim");
        System.out.println("[Menecer obyekti yoxlanılır]:");
        manager.introduce();
        manager.organizeMeeting();
        System.out.println("                              ");

        Developer dev = new Developer("Ayan");
        System.out.println("[Developer obyekti yoxlanılır]:");
        dev.introduce();
        dev.writeCode();
        System.out.println("                               ");




        //   4: Bank Hesabları
        System.out.println("    Tapşırıq 4: Əmanət Hesabı Sistemi   ");

        EmanetHesabi myAccount = new EmanetHesabi("Zərifə", 10000.0, 10.0);
        System.out.println("İlkin vəziyyət -> Sahibi: " + myAccount.getOwnerName() + ", Balans: " + myAccount.getBalance() + " AZN");

        System.out.println("[Addım 1]: Hesaba 500 AZN mədaxil edilir");
        myAccount.deposit(500.0);
        System.out.println("Cari balans: " + myAccount.getBalance() + " AZN");

        System.out.println("[Addım 2]: İllik faiz hesablanır");
        myAccount.applyInterest();

        System.out.println("[Nəticə]: Yekun balans: " + myAccount.getBalance() + " AZN");

        System.out.println("\n[Səhv yoxlaması]: Mənfi məbləğ mədaxil edilir (-100)");
        myAccount.deposit(-100);

        System.out.println("                                          ");
    }
}
