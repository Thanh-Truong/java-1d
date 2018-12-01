import java.util.Scanner;

public class Uppgift_2 {
    // Uppgift 2 för betyg E
    // ------------------------------
    //  Metoden heltal tar emot två heltal, och skriver ut alla heltal mellan de angivna heltalen
    //  (inklusive dessa heltal).
    //  I metoden main matas två heltal in (med stigande ordning), och metoden heltal anropas med
    //  de inmatade värdena som argument.
    //  Utskriften kan se ut så här:
    //  Mata in två heltal:
    //  1
    //  20
    //  1 2 3  4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
    // Skapa ett program som består av metoden main och metoden heltal.
    public static void heltal(int start, int end) {
        for (int i = start; i <= end ; i++) {
            System.out.printf("%d ", i);
        }
	System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Mata in två hetal:");
        Scanner in = new Scanner(System.in);
        int start = in.nextInt();
        int end = in.nextInt();
        if (start > end) {
            System.out.println("Två hetal skulle vara i stigande ordning !");
        } else {
            heltal(start, end);
        }
    }
}
