/*HR — İşçi və Menecer
Bir şirkətin HR sistemini modelləşdir. İşçi adlı ata class yarat —
hər işçinin ad-ı var və bu, konstruktor vasitəsilə təyin olunur.
Menecer class-ı İşçi-dən miras alsın və əlavə olaraq komandaSayi xüsusiyyətinə malik olsun.
Menecerin konstruktoru həm ad, həm komanda sayını qəbul etsin və ata hissəni super vasitəsilə qursun.
Bir Menecer obyekti yaradıb məlumatlarını ekrana çıxar.
 */


public class Main {
    public static void main(String[] args) {
        Menecer menecer = new Menecer("Yunis bey", 10);

        menecer.melumatlariGoster();
    }
}