//Cümlə Analizi

public class task13 {
    public static void main(String[] args) {

        String metn = " Java proqramlaşdırma dili çox güclüdür! ";

        // 1. Trim-dən əvvəl və sonra uzunluq
        int evvelkiUzunluq = metn.length();
        String trimOlunmus = metn.trim();
        int sonrakiUzunluq = trimOlunmus.length();
        System.out.println("Trim-dən əvvəl uzunluq: " + evvelkiUzunluq);
        System.out.println("Trim-dən sonra uzunluq: " + sonrakiUzunluq);
        System.out.println("Fərq: " + (evvelkiUzunluq - sonrakiUzunluq) + " (Kənardakı boşluqların sayı)");

        // 2. "Java" sözü varmı? (Case-sensitive və Case-insensitive yoxlama)
        boolean javaVar = metn.contains("Java");
        boolean javaBoyukVar = metn.toUpperCase().contains("JAVA");
        System.out.println("'Java' sözü varmı?: " + javaVar);
        System.out.println("Böyük hərflə 'JAVA' varmı?: " + javaBoyukVar);

        // 3. "proqramlaşdırma" sözünü "programming" ilə əvəz etmək
        String yeniMetn = metn.replace("proqramlaşdırma", "programming");
        System.out.println("Əvəz edilmiş mətn: " + yeniMetn.trim());

        // 4. İlk 4 hərf (Trim edilmiş mətndən götürürük ki, boşluğu saymasın)
        String ilkDordHeft = trimOlunmus.substring(0, 4);
        System.out.println("İlk 4 hərf: " + ilkDordHeft);

        // 5. "!" işarəsi varmı?
        boolean nidaVar = metn.contains("!");
        System.out.println("'!' işarəsi varmı?: " + nidaVar);

        // 6. Bütün mətn kiçik hərflə və trim edilmiş şəkildə
        System.out.println("Formatlanmış mətn: " + metn.trim().toLowerCase());
    }
}
