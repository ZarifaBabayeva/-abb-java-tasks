//Kredit Uyğunluğu — 3 Müştəri

public class task13 {
    public static void main(String[] args) {

        int yas1 = 34; double gelir1 = 1500; int mebleg1 = 10000; boolean tarix1 = true;
        boolean uygun1 = (yas1 >= 21 && yas1 <= 65) && (gelir1 > 800) &&
                (mebleg1 >= 300 && mebleg1 <= 50000) && (tarix1);

        int yas2 = 19; double gelir2 = 950; int mebleg2 = 3000; boolean tarix2 = true;
        boolean uygun2 = (yas2 >= 21 && yas2 <= 65) && (gelir2 > 800) &&
                (mebleg2 >= 300 && mebleg2 <= 50000) && (tarix2);

        int yas3 = 45; double gelir3 = 750; int mebleg3 = 7000; boolean tarix3 = false;
        boolean uygun3 = (yas3 >= 21 && yas3 <= 65) && (gelir3 > 800) &&
                (mebleg3 >= 300 && mebleg3 <= 50000) && (tarix3);

        System.out.println("Müştəri 1 kredit ala bilərmi? -> " + (uygun1 ? "Bəli (Kredit verilsin)" : "Xeyr (İmtina)"));
        System.out.println("Müştəri 2 kredit ala bilərmi? -> " + (uygun2 ? "Bəli (Kredit verilsin)" : "Xeyr (İmtina)"));
        System.out.println("Müştəri 3 kredit ala bilərmi? -> " + (uygun3 ? "Bəli (Kredit verilsin)" : "Xeyr (İmtina)"));
    }
}
