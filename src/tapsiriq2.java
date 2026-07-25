/*Kart sahibinin adı
Sinifdə String kartSahibi dəyişəni elan et. Kartın üzərindəki adın simvol sayını hesablayıb çap edən proqram yaz.
Dəyişən null olduqda proqram dayanmamalı, "Kart məlumatı tapılmadı" mesajı verilməlidir.
Nəticə necə olursa olsun, proqramın sonunda "Sessiya bağlandı" sətri mütləq çap olunmalıdır.
Proqramı iki halda yoxla: əvvəl dəyişənə null, sonra real ad mənimsədilmiş vəziyyətdə.
 */

public class tapsiriq2 {
    public static void main(String[] args) {
        String kartSahibi = null;

      //  String kartSahibi = "XXXX XXXXXX";

        try {
            int simvolSayi = kartSahibi.length();
            System.out.println("Kart sahibinin adının uzunluğu: " + simvolSayi);

            //int netice = 10 / 0;
          //  System.out.println(netice);

        } catch (NullPointerException e) {
            System.err.println("Kart məlumatı tapılmadı");

        } catch (Exception e) {
            System.err.println("Xəta baş verdi: " + e.getMessage());

        } finally {
            System.out.println("Sessiya bağlandı");
        }
    }
}