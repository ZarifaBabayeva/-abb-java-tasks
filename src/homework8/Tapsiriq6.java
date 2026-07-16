/*Salamlaşma
String[] adlar = {"Aysel", "Murad", "Leyla", "Tural"};
massivindəki hər ad üçün Salam, AD! formatında mesaj çap et.
for-each istifadə olunmalıdır.
 */

package homework8;
public class Tapsiriq6 {
    public static void main(String[] args) {
        String[] adlar = {"Aysel", "Murad", "Leyla", "Tural"};

        for (String ad : adlar) {
            System.out.println("Salam, " + ad + "!");
        }
    }
}
