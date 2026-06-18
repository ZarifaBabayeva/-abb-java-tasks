// String Metodları Məşqi

public class task16 {
    public static void main(String[] args) {
        String metn = " Salam, ABB Bank! ";

        System.out.println("Uzunluq (boşluqla): " + metn.length());

        String bosluqsuzMetn = metn.trim();
        System.out.println("Uzunluq (trim-dən sonra): " + bosluqsuzMetn.length());

        System.out.println("Böyük hərflə: " + metn.toUpperCase());

        System.out.println("Kiçik hərflə: " + metn.toLowerCase());

        System.out.println("'ABB' var mı? " + metn.contains("ABB"));

        System.out.println("'bank' var mı? " + metn.contains("bank"));

        System.out.println("Əvəz etmə: " + metn.replace("Bank", "Kredit"));

        System.out.println("'Salam' ilə başlayır mı? " + bosluqsuzMetn.startsWith("Salam"));
    }
}