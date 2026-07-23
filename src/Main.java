/*İki ayrı interface yarat: Yuklene (yukle()) və Endirile (endir()).
FaylMenecer class-ı hər iki interface-i eyni anda implements etsin (vergüllə) və
hər iki metodu da tamamlasın. FaylMenecer obyekti yaradıб həm yukle(), həm endir() metodlarını çağır.
Bir class-ın niyə birdən çox interface qəbul edə bildiyini düşün.
 */



public class Main {
    public static void main(String[] args) {
        FaylMenecer fm = new FaylMenecer();

        fm.yukle("proyekt_kodlari.zip");
        fm.endir("ders_materiali.pdf");




        /*Javada bir sinif birdən çox class-dan miras ala bilmir (Diamond Problem-ə görə).
          Lakin interface-lər metod gövdəsi saxlamadığı üçün (default istisna olmaqla),
          bir sinif çoxlu sayda interface-i implements edə bilər.
          Bu, sinfə fərqli-fərqli "bacarıqlar" (capabilities) qazandırmaq üçün istifadə olunur.
         */
    }
}