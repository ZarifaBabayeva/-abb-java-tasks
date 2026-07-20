/*Kofe maşını
KofeMasini sinfində istifadəçinin görəcəyi yeganə metod kofe hazırlamaq olsun.
Arxada su qızdırmaq, kofe tökmək və fincanı doldurmaq addımları gizli işləsin
və kənardan çağırıla bilməsin. Proqramda yalnız həmin bir metodu çağır.
 */


package Abstraction;
public class KofeMasini {
    public void kofeHazirla() {
        System.out.println("    Kofe hazırlama prosesi başladı   ");

        suQizdir();
        kofeTok();
        fincanDoldur();

        System.out.println("Nəticə: Kofeniz hazırdır! Nuş olsun.");
        System.out.println("                               ");
    }

    private void suQizdir() {
        System.out.println("[Addım 1]: Su 90 dərəcəyə qədər qızdırılır");
    }

    private void kofeTok() {
        System.out.println("[Addım 2]: Təzə üyüdülmüş kofe süzgəcə əlavə edilir");
    }

    private void fincanDoldur() {
        System.out.println("[Addım 3]: Hazır kofe fincana süzülür");
    }
}
