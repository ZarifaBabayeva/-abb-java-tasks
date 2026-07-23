/*Brauzer — upcasting
Brauzer ata class-ında ac() metodu olsun.
Chrome varisi bu metodu override edib öz cür davransın. İndi əsas hissədə dəyişəni ata tipində elan et,
amma içinə varis obyekti ver (Brauzer b = new Chrome();) və ac()-i çağır.
Dəyişənin tipi ata olsa da, hansı versiyanın işlədiyinə diqqət et.
 */


public class Main {
    public static void main(String[] args) {
        Brauzer b = new Chrome();
        b.ac();

    }
}

/*Burada 'b' dəyişəninin tipi 'Brauzer' olsa da, obyekt 'Chrome' olduğu üçün
 Runtime Polymorphism sayəsində 'Chrome' sinfinin 'ac()' metodu işləyəcək.
 */