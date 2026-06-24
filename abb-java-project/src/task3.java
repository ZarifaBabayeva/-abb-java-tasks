//Nəticəni Söylə

public class task3 {
    public static void main(String[] args) {
        int     a = 8,  b = 3;
        boolean p = true, q = false;
        String  s = "QA";

        System.out.println(a + b);           // 11
        System.out.println(a - b * 2);      // 2
        System.out.println(a / b);           // 2
        System.out.println(a % b);           // 2
        System.out.println(p && q);          // false (and operatoru: hər ikisi true -> true versin)
        System.out.println(p || q);          // true  (or operatoru: biri true olsa bəs)
        System.out.println(!p && !q);        // false (!p = false, !q = true. false && true = false)
        System.out.println(a > 5 || b > 5);  // true  (8 > 5 true-dur. true || false = true)
        System.out.println(s + a + b);       // QA83  QA+8+3 stringin içinə ədəd girəndə string olmalıdı
        System.out.println(a + b + s);       // 11QA  (8+3) + QA  ədədin üzərinə string gələndə ədəd toplanır sonra string


        // Java-da əməliyyatlar soldan sağa hesablanr
        //       s + a + b -> String + int -> QA83
        // a + b + s -> burda isə ilk gələn ədəddir , ədədlər toplanır sonra stringlə birlə.ir 11QA

    }
}
