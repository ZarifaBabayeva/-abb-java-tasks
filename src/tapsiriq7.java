/*Müştəri kodu ilə axtarış
HashMap<String, String> yarat: müştəri kodu → müştəri adı.
4 cüt əlavə et. Scanner ilə istifadəçidən bir müştəri kodu daxil al:
kod bazada varsa, həmin müştərinin adını tapıb çap et; yoxdursa, "Belə müştəri tapılmadı" mesajı ver.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class tapsiriq7 {
    public static void main(String[] args) {
        Map<String, String> musteriBazasi = new HashMap<>();

        musteriBazasi.put("A101", "Elgün Məmmədov");
        musteriBazasi.put("B202", "İnara Aslanova");
        musteriBazasi.put("C303", "Murad Seyidov");
        musteriBazasi.put("D404", "Aysel Mustafayeva");


        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Axtarmaq istədiyiniz müştəri kodunu daxil edin: ");
            String axtarilanKod = scanner.nextLine();

            if (musteriBazasi.containsKey(axtarilanKod)) {
                String ad = musteriBazasi.get(axtarilanKod);
                System.out.println("Müştəri adı: " + ad);
            } else {
                System.err.println("Belə müştəri tapılmadı");
            }
        } catch (Exception e) {
            System.err.println("Xəta baş verdi: " + e.getMessage());
        }
    }
}