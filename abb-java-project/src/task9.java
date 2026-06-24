//String Metodlarında Xəta

public class task9 {
    public static void main(String[] args) {

        String kod = "  abb-2024  ";

        // bosluqlari trimle kesmek lasimdir
        System.out.println("Düzgün uzunluq: " + kod.trim().length());

        // contains() case-sensitive-dir.
        // Hər ikisini eyni formata yeni kicik herflere getir ssonra yoxla
        System.out.println("Düzgün contains: " + kod.toLowerCase().contains("abb"));

        // stringleri muqayise etmek ucun equals istifade olunur
        // == operatoru ise obyektlərin yaddasdaki yerini muqayise edir, buna gorede stringler muqayisede yanlis netice verir
        System.out.println("Düzgün müqayisə: " + kod.trim().equals("abb-2024"));

        //bu kod ise dogrudur
        System.out.println("Doğru sətir: " + kod.toUpperCase().contains("ABB"));
    }
}