/*Günün əməliyyatları
ArrayList<Integer> yarat və gün ərzində edilən 5 əməliyyat məbləği əlavə et.
for-each dövrü ilə bütün məbləğlərin ümumi cəmini hesablayıb çap et. Sonra iş günü bağlanır —
siyahını tam təmizlə və siyahının boş olub-olmadığını yoxlayan metodun nəticəsini çap edərək boşaldığını göstər.
 */

import java.util.ArrayList;
import java.util.List;

public class tapsiriq6 {
    public static void main(String[] args) {
        List<Integer> emeliyyatlar = new ArrayList<>();
        emeliyyatlar.add(120);
        emeliyyatlar.add(250);
        emeliyyatlar.add(50);
        emeliyyatlar.add(400);
        emeliyyatlar.add(180);

        System.out.println("Gün ərzində edilən əməliyyatlar: " + emeliyyatlar);

        int umumiCem = 0;
        for (Integer meblegh : emeliyyatlar) {
            umumiCem += meblegh;
        }

        System.out.println("Bütün əməliyyatların cəmi: " + umumiCem + " AZN");

        emeliyyatlar.clear();
        System.err.println("İş günü bağlandı, siyahı təmizləndi.");

        boolean bosdurmu = emeliyyatlar.isEmpty();
        System.out.println("Siyahı boşdurmu? " + bosdurmu);
    }
}