/*VIP müştəri növbəsi
ArrayList<String> yarat və filialda növbə gözləyən 4 müştəri adı əlavə et.
Sonra bir VIP müştəri gəlir — o, növbənin başında dayanmalıdır (mövcud müştərilər yerini itirmədən geriyə sürüşür).
Konkret bir adın növbədə olub-olmadığını yoxlayıb nəticəni çap et. Növbədəki bir müştərinin adını başqa adla əvəz et.
Sonda siyahını adi for dövrü ilə "indeks: ad" formatında çap et.
 */

import java.util.ArrayList;
import java.util.List;

public class tapsiriq5 {
    public static void main(String[] args) {
        List<String> novbe = new ArrayList<>();

        novbe.add("Asim");
        novbe.add("Akif");
        novbe.add("Alim");
        novbe.add("Aysel");
        System.out.println("İlkin növbə: " + novbe);


        novbe.add(0, "VIP_XXxx");
        System.out.println("VIP gəldikdən sonra: " + novbe);

        String axtarilanAd = "Alim";
        if (novbe.contains(axtarilanAd)) {
            System.out.println(axtarilanAd + " növbədədir.");
        } else {
            System.out.println(axtarilanAd + " növbədə tapılmadı.");
        }


        novbe.set(2, "YYYyy");
        System.out.println("Ad əvəz edildikdən sonra: " + novbe);

        System.out.println("\n   Yekun Siyahı   ");
        for (int i = 0; i < novbe.size(); i++) {
            System.out.println(i + ": " + novbe.get(i));
        }
    }
}