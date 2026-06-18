//Bank Hesabı Məlumatları
//Müştərinin bank məlumatlarını 5 fərqli tipdə dəyişənə yazıb ekrana çap edin


 public class task1 {
    public static void main(String[] args) {
        String customerName = "Zarifa Babayeva";
        int accountNumber = 12345678;
        double balance = 10000.00;
        boolean isActive = true;
        String accountType = "yigimhesabi";

        System.out.println("Müştəri adı:     " + customerName);
        System.out.println("Hesab nömrəsi:   " + accountNumber);
        System.out.println("Balans:          " + balance);
        System.out.println("Hesab aktivdir:  " + isActive);
        System.out.println("Hesab növü:      " + accountType);
    }
}