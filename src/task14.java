//Ədədin Xüsusiyyətlərini Tapın

public class task14 {
    public static void main(String[] args) {
        int n = 84;
        System.out.println(" Ədəd: " + n );

        boolean cutmu = (n % 2 == 0);
        boolean musbetdimi = (n > 0);
        boolean bolunur3 = (n % 3 == 0);
        boolean bolunur7 = (n % 7 == 0);
        boolean bolunur3ve7 = (n % 3 == 0) && (n % 7 == 0);
        boolean araliqdadir = (n > 10 && n < 100);

        System.out.println("Cütdür mü?              " + cutmu);
        System.out.println("Müsbətdir mi?           " + musbetdimi);
        System.out.println("3-ə bölünür mü?         " + bolunur3);
        System.out.println("7-yə bölünür mü?         " + bolunur7);
        System.out.println("Həm 3, həm 7-yə bölünür?   " + bolunur3ve7);
        System.out.println("10-100 aralığındadır?    " + araliqdadir);

        // n = 105
        n = 105;
        System.out.println("\n Ədəd: " + n);

        cutmu = (n % 2 == 0);
        musbetdimi = (n > 0);
        bolunur3 = (n % 3 == 0);
        bolunur7 = (n % 7 == 0);
        bolunur3ve7 = (n % 3 == 0) && (n % 7 == 0);
        araliqdadir = (n > 10 && n < 100);

        System.out.println("Cütdür mü?              " + cutmu);
        System.out.println("Müsbətdir mi?           " + musbetdimi);
        System.out.println("3-ə bölünür mü?         " + bolunur3);
        System.out.println("7-yə bölünür mü?         " + bolunur7);
        System.out.println("Həm 3, həm 7-yə bölünür?   " + bolunur3ve7);
        System.out.println("10-100 aralığındadır?    " + araliqdadir);
    }
}


//neticeler deyisdi