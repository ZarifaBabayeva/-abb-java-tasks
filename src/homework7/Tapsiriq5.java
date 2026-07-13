/*Kriptovalyutanın artımı
Kriptovalyutanın ilkin qiyməti 1000 AZN, illik artım tempi 8%-dir.
Qiymət ilkin dəyərin iki qatına çatana qədər hər ilin sonundakı qiyməti
"İl X: Y AZN" formatında çap et, sonda ümumi neçə il çəkdiyini göstər.
 */


package homework7;
public class Tapsiriq5 {
    public static void main(String[] args) {

        double initialPrice = 1000.0;
        double currentPrice = initialPrice;
        double targetPrice = initialPrice * 2;
        double growthRate = 0.08;
        int yearCounter = 0;

        System.out.println("    Crypto Growth Simulation Started   ");
        System.out.println("Initial Price: " + initialPrice + " AZN");
        System.out.println("Target Price: " + targetPrice + " AZN");
        System.out.println("Annual Growth Rate: 8%\n");

        while (currentPrice < targetPrice) {
            yearCounter++;

            currentPrice += (currentPrice * growthRate);


            System.out.printf("Year %d: %.2f AZN\n", yearCounter, currentPrice);
        }

        System.out.println("\n              ");
        System.out.println("Simulation Completed!");
        System.out.println("Total time taken to double the value: " + yearCounter + " years.");
        System.out.println("Final Price: " + String.format("%.2f", currentPrice) + " AZN");
        System.out.println("                           ");

    }
}