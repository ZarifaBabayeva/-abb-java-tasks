/*Tələbə balı
Telebe sinfində tələbənin adı və imtahan balı gizli saxlanılsın.
Bal yalnız 0–100 aralığında qəbul edilsin. Balı oxuyan hissə balla yanaşı hərfi qiyməti də qaytarsın
(90+ Əla, 70–89 Yaxşı, 50–69 Kafi, aşağı Qeyri-kafi).
Proqramda tələbə yarat və nəticəni "Ad: X, Bal: Y, Qiymət: Z" formatında çap et.
 */



package Encapsulation;
public class Tapsiriq2 {
    private String name;
    private int score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if (score >= 0 && score <= 100) {
            this.score = score;
        } else {
            System.out.println("Xəta: Yanlış bal daxil edilib (" + score + "). Bal 0-100 aralığında olmalıdır.");
        }
    }

    public String getGradeLetter() {
        if (score >= 90) {
            return "Əla";
        } else if (score >= 70) {
            return "Yaxşı";
        } else if (score >= 50) {
            return "Kafi";
        } else {
            return "Qeyri-kafi";
        }
    }
}