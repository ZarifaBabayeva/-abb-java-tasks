/*Telefon batareyası
Telefon sinfi yarat. Batareya faizi kənardan birbaşa dəyişdirilə bilməsin —
dəyər yalnız nəzarətli yolla təyin olunsun və yalnız 0–100 aralığı qəbul edilsin,
kənar dəyərdə xəta mesajı çap olunsun. Faizi oxumaq da mümkün olsun.
Proqramda bir neçə fərqli dəyərlə (düzgün və yanlış) yoxla və son vəziyyəti çap et.
 */

package Encapsulation;
public class Tapsiriq1 {
    private int batteryPercentage;

    public int getBatteryPercentage() {
        return batteryPercentage;
    }

    public void setBatteryPercentage(int batteryPercentage) {
        if (batteryPercentage >= 0 && batteryPercentage <= 100) {
            this.batteryPercentage = batteryPercentage;
        } else {
            System.out.println("Xəta: Yanlış batareya faizi (" + batteryPercentage + "). Dəyər 0-100 aralığında olmalıdır!");
        }
    }
}