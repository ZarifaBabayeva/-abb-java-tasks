//Həqiqi Bölmə — Orta Hesab

public class task5 {
    public static void main(String[] args) {
        int bal1 = 78;
        int bal2 = 91;
        int bal3 = 84;

        /*
           yanlış yol
           double yanlisOrta = (bal1 + bal2 + bal3) / 3;
           Bu yol ona görə yanlışdır ki, bal1, bal2, bal3 və 3 rəqəminin hər biri int-dir.
           Java-da int / int əməliyyatının nəticəsi həmişə int olmalıdı
           Cəm 253 edir, 253 / 3 böldükdə = 84
           Sonra bu 84-ü double-a mənimsətdiyimiz üçün nəticə 84.0 olur.
           Burda da bizə dəqiq nəticə verməmiş olur
        */

        // dwzgwn yol
        // bölmə zamanı double istifadə olunsa, nəticə dəqiq verilər

        //1ci üsul- rəqəmi 3.0 kimi yaz
        double orta1 = (bal1 + bal2 + bal3) / 3.0;

        //2ci üsul (double) cast (tip çevrilməsi) istifadə et
        double orta2 = (double) (bal1 + bal2 + bal3) / 3;

        System.out.println("Tələbələrin orta balı: " + orta1);
    }
}