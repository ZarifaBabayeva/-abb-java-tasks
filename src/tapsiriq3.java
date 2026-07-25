/*Köçürmə validasiyası
kocurmeEt(double meblegh) adlı metod yaz. Məbləğ sıfır və ya mənfi olarsa,
metod IllegalArgumentException atsın — xəta mesajı məbləğin niyə qəbul edilmədiyini bildirsin.
Yoxlamadan keçərsə, "Köçürüldü: " sözü və məbləğ çap olunsun. main metodunda metodu iki dəfə çağır —
bir dəfə müsbət, bir dəfə mənfi məbləğlə. Mənfi məbləğlə çağırışda proqram dayanmamalı və
atılan xətanın mesajı ekranda görünməlidir.
 */

public class tapsiriq3 {
    public static void main(String[] args) {
        System.out.println("    Birinci əməliyyat (+)    ");
        try {
            kocurmeEt(500);
        } catch (IllegalArgumentException e) {
            System.err.println("Xəta: " + e.getMessage());
        }

        System.out.println();

        System.out.println("   İkinci əməliyyat (-)   ");
        try {
            kocurmeEt(-100.0);
        } catch (IllegalArgumentException e) {
            System.err.println("Tutulan xəta: " + e.getMessage());
        }
    }

    public static void kocurmeEt(double meblegh) {
        if (meblegh <= 0) {
            throw new IllegalArgumentException("Köçürmə məbləği 0-dan böyük olmalıdır! Daxil edilən: " + meblegh);
        }

        System.out.println("Köçürüldü: " + meblegh);
    }
}