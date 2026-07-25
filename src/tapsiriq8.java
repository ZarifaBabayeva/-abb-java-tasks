/*Filial hesabatı
HashMap<String, Integer> yarat: filial adı → günlük müştəri sayı.
4 filial əlavə et və cüt sayını çap et. Dövr ilə hər cütü "filial → say" formatında çap et.
Filiallardan biri bağlanır — onu bazadan sil və cüt sayını yenidən çap edərək dəyişikliyi göstər.
 */

import java.util.HashMap;
import java.util.Map;

public class tapsiriq8 {
    public static void main(String[] args) {
        Map<String, Integer> filiallar = new HashMap<>();

        filiallar.put("Mərkəz Filialı", 250);
        filiallar.put("Yasamal Filialı", 120);
        filiallar.put("Nərimanov Filialı", 180);
        filiallar.put("Gənclik Filialı", 300);

        System.out.println("İlkin cüt sayı: " + filiallar.size());


        System.out.println("\n   Filial Hesabatı   ");
        for (Map.Entry<String, Integer> entry : filiallar.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        String silinenFilial = "Yasamal Filialı";
        filiallar.remove(silinenFilial);
        System.out.println("\n" + silinenFilial + " bağlandı və bazadan silindi.");

        System.out.println("Yenilənmiş cüt sayı: " + filiallar.size());

        System.out.println("Yekun bazası: " + filiallar);
    }
}