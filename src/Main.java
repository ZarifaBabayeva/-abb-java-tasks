/*Sənəd — abstract + konstruktor
Sened adlı abstract class-ında baslik xüsusiyyəti və onu təyin edən konstruktor olsun,
həmçinin bir abstract metod — capEt(). PDFSened və WordSened varisləri həm ata konstruktorunu super ilə çağırsın,
həm də capEt()-i tamamlasın. Hər iki varisdən obyekt yaradıб çap et — abstract class-ın
konstruktorunun necə işlədiyini izlə.
 */



public class Main {
    public static void main(String[] args) {
        PDFSened pdf = new PDFSened("Texniki Tapşırıq");
        pdf.capEt();

        System.out.println("                     ");

        WordSened word = new WordSened("Diplom İşi");
        word.capEt();




        /*
          Abstract class-dan obyekt yaradıla bilməsə də, onun konstruktoru
          alt sinif obyekti (məs: new PDFSened()) yaradılan zaman ilk olaraq çağırılır.
         super(baslik) vasitəsilə ortaq xüsusiyyətlər (baslik) ata sinifdə tənzimlənir.
         */
    }
}