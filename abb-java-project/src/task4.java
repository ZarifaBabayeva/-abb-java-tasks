//Swap — İki Dəyişənin Yerini Dəyiş

public class task4 {
    public static void main(String[] args) {
        int a = 15;
        int b = 40;

        // ilk öncə əvvəlki nəticəni yazırıq
        System.out.println("Əvvəl: a=" + a + ", b=" + b);

        // Swap (Dəyişmə) prosesi temp dəyişəni ilə:

        int temp = a;  // a-nın qiymətini dəyişməək üçün temp-ə mənimsədirik
        a = b;         // b-nin dəyərinidə a-a mənimsədirik
        b = temp;      //temp-də a-nın dəyəri vardl, indi onuda b-ə mənimsədirik

        // yerini dəyişdik
        System.out.println("Sonra: a=" + a + ", b=" + b);


    }
    }
