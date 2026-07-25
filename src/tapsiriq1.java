/*Orta əməliyyat məbləği
Bankda bir müştərinin aylıq ümumi xərci sabit dəyər kimi verilir:
int umumiXerc = 1240;. Scanner ilə istifadəçidən əməliyyat sayı (tam ədəd) daxil al
və orta əməliyyat məbləğini hesabla (ümumi xərc ÷ əməliyyat sayı).
Hesablama try blokunda aparılmalıdır. Sıfıra bölmə halında proqram dayanmamalı —
konkret mesaj verilməlidir; hər hansı başqa xəta halında isə ümumi mesaj verilməlidir.
Proqramın ən sonunda "Hesabat tamamlandı" sətri çap olunmalıdır və bu sətir hər bir halda görünməlidir.
 */


import java.util.InputMismatchException;
import java.util.Scanner;

public class tapsiriq1
{
    public static void main(String[] args) {
        int umumiXerc = 1240;
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Əməliyyat sayını daxil edin: ");
            int emeliyyatSayi = scanner.nextInt();

            int ortaMebleg = umumiXerc / emeliyyatSayi;
            System.out.println("Orta əməliyyat məbləği: " + ortaMebleg);

        } catch (ArithmeticException e) {
            System.err.println("Xəta: Emeliyyat sayi sifir (0) ola bilmez.");
        } catch (InputMismatchException e) {
            System.err.println("Xəta: Zəhmət olmasa tam ədəd daxil edin.");
        } catch (Exception e) {
            System.err.println("Gözlənilməz bir xəta baş verdi.");
        } finally {
            System.out.println("Hesabat tamamlandı");

            scanner.close();
        }
    }
}