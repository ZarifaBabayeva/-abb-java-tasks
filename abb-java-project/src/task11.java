//Parol Yoxlaması


public class task11 {
    public static void main(String[] args) {

        String parol = "Abb@2024";

        // 1. Uzunluğu 8-dən çoxdur?
        // "Abb@2024" 8 simvoldur ona gorede 8 > 8 false verecek
        boolean uzunUygun = parol.length() > 8;

        // 2. "@" simvolu var mı?
        boolean xarakterVar = parol.contains("@");

        // 3. Böyük hərfə çevirdikdə "ABB" ilə başlayırmı?
        boolean abbIleBaslayir = parol.toUpperCase().startsWith("ABB");

        // 4. Rəqəm var mı — "2024" hissəsi mövcuddur?
        boolean reqemVar = parol.contains("2024");

        // 5. Parol güclüdür mi? (Bütün şərtlər true olmalıdır)
        boolean gucluParol = uzunUygun && xarakterVar && abbIleBaslayir && reqemVar;

        System.out.println("1. Uzunluq 8-dən çoxdur: " + uzunUygun);
        System.out.println("2. '@' simvolu var: " + xarakterVar);
        System.out.println("3. 'ABB' ilə başlayır: " + abbIleBaslayir);
        System.out.println("4. '2024' rəqəmi var: " + reqemVar);
        System.out.println("5. Parol güclüdür: " + gucluParol);
    }
}