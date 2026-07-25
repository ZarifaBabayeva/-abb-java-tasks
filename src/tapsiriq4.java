/*Gündəlik limit
LimitKecildiException adlı öz exception class-ını yarat (checked olmalıdır).
nagdCixar(double meblegh) metodu yaz: gündəlik nağd çıxarma limiti 2000 AZN-dir,
məbləğ limitdən böyük olarsa metod bu xətanı atsın. Çağırış tərəfində limiti aşan çağırışda
proqram dayanmamalı və xətanın mesajı ekranda görünməlidir. Həm limitə uyğun, həm limiti aşan məbləğlə yoxla.
 */



class LimitKecildiException extends Exception {
    public LimitKecildiException(String message) {
        super(message);
    }
}

public class tapsiriq4 {
    public static void main(String[] args) {
        System.out.println("   1500 AZN çıxarılır");
        try {
            nagdCixar(1500.0);
        } catch (LimitKecildiException e) {
            System.err.println("Xəta: " + e.getMessage());
        }

        System.out.println();

        System.out.println("   2500 AZN çıxarılır    ");
        try {
            nagdCixar(2500.0);
        } catch (LimitKecildiException e) {
            System.err.println("Tutulan xəta: " + e.getMessage());
        }
    }

    public static void nagdCixar(double meblegh) throws LimitKecildiException {
        double gunlukLimit = 2000.0;

        if (meblegh > gunlukLimit) {
           throw new LimitKecildiException("Günlük nağd çıxarma limiti (2000 AZN) aşıldı!");
        }

        System.out.println("Nağd çıxarıldı: " + meblegh + " AZN");
    }
}