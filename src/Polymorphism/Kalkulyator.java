/*Kalkulyator
Kalkulyator sinfində eyni adlı vurma metodunu üç fərqli formada yaz:
iki tam ədəd, üç tam ədəd və iki kəsr ədəd üçün. Proqramda hər üç variantı çağır və nəticələri çap et.

 */

package Polymorphism;
public class Kalkulyator {

    public int vurma(int a, int b) {
        return a * b;
    }

    public int vurma(int a, int b, int c) {
        return a * b * c;
    }

    public double vurma(double a, double b) {
        return a * b;
    }
}
