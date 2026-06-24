//Məntiqi Xətalar — Compiler Tutmaz

public class task8 {
    public static void main(String[] args) {

        int yas = 25;
        double gelir = 1200.0;
        boolean tarix = true;

        // Kredit şərti: yaş 21-65 (hər ikisi daxil), gəlir 800-dən çox, tarix true olmalı

        // dwzelis ->  yas >= 21 && yas <= 65
        // sebeb: evvelki "yas > 21" serti 21 yasli musterini unudurdu
        // 21 və 65 yasinda daxil olmasi ucun >= və <= operatorlari istifade et
        boolean yasUygun  = yas >= 21 && yas <= 65;


        boolean gelirUygun = gelir > 800;

        //dwzelis -> yasUygun && gelirUygun && tarix
        // sebeb -> kredit verilmesi ucun butun sertler eyni anda true olmali
        // evvelki kodda or istifadr olunub. burdan ise o neticeye gelinirki 7 yasli insan kredit ala biler
        boolean uygun = yasUygun && gelirUygun && tarix;

        System.out.println("Yaş uyğun:   " + yasUygun);
        System.out.println("Gəlir uyğun: " + gelirUygun);
        System.out.println("Kredit:      " + uygun);
    }
}
