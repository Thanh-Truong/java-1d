import java.io.IOException;

public class Workshop2 {


    // -------------------------------------------------
    // Mata in data
    // -------------------------------------------------
    /**
    * ÖVNING 1
    *
    * Fråga:
    * ----------
    * Exekvera det här programmet flera gånger.
    * Mata in olika heltal vid olika exekveringar.
    * Vad händer om du tillför programmet:
    *   ett heltal vid den första inmatningen?
    *   två heltal vid den första inmatningen?
    *   tre heltal vid den första inmatningen?
    *   Vad händer om du trycker på returtangenten utan att ha matat
    *   in ett heltal?
    * ----------
    * Svar:
    * - Om jag tillför programmet ett hetal vid den första inmatningen,
    *  matar jag in ett heltal till. Sedan matar programmet ut heltalens
    *  summan.
    * - Om jag tillför programmet två heltal vid den första inmatningen,
    *   matar programmet ut heltalens summan direkt.
    * - Om jag tillför programmet tre heltal vid den första inmatningen,
    *   matar programmet ut heltalens summan direkt.
    *
    * Fråga:
    * -------------
    * Vad händer om du trycker på returtangenten utan att ha matat
    * in ett heltal?
    * -------------
    * Svar:
    * Programmet väntar fortfarande på att man matar in ett heltal
    * */
    public static class Inmatning1 {
        public static void execute() {
            java.util.Scanner in = new java.util.Scanner(System.in);
            System.out.print("ett heltal: ");
            int tal1 = in.nextInt();

            System.out.print("ett heltal: ");
            int tal2 = in.nextInt();

            int sum = tal1 + tal2;
            System.out.println("heltalens summa: " + sum);
        }
    }

    /**
     * ÖVNING 2
     *
     * -------------
     * Fråga:
     *
     * Exekvera det här programmet flera gånger.
     * Mata in olika heltal vid olika exekveringar
     * Vad händer om du tillför:
     *   två heltal till programmet och trycker på returtangenten?
     *   ett heltal till programmet och trycker på returtangenten?
     *   tre heltal till programmet och trycker på returtangenten?
     *
     * -------------
     * Svar:
     *    Om jag tillför två hetal till programmet och trycker på
     *    returntangenten, skriver programmet ut heltalens summan.
     *
     *    Om jag tillför ett heltal till programmet och trycker på
     *    returntangenten, väntar programmet på inmatningen
     *
     *    Om jag tillför tre heltal till programmet och trycker på
     *    returntangenten, skriver progammet ut summan av de två
     *    första heltalen.
     * */
    public static class Inmatning2 {
        public static void execute() {
            java.util.Scanner in = new java.util.Scanner(System.in);
            System.out.print("två heltal: ");
            int tal1 = in.nextInt();
            int tal2 = in.nextInt();

            int sum = tal1 + tal2;
            System.out.println("heltalens summa: " + sum);
        }
    }

    /**
     * Mata in tecken
     *
     * Övning 1
     *
     * Fråga:
     * -------------
     *  Exekvera det här programmet flera gånger. Mata in olika heltal
     *  vid olika exekveringar. Vilken utskrift skapas?
     *
     * Svar:
     * -------------
     *  Programmet skapar och skriver ut Unicode-koden av inmatade tecknet
     */
    public static class TeckenInmatning1 {
        public static void execute() throws IOException {
            System.out.print("ett tecken: ");
            int kod = System.in.read();
            System.out.println("det inmatade tecknets Unicode-kod: " + kod);
        }
    }

    /***
     * Övning 2
     *
     * Fråga:
     * --------------
     * Exekvera det här programmet flera gånger.
     * Mata in olika heltal vid olika exekveringar. Vilken utskrift skapas?
     *
     *
     * --------------
     * Svar:
     * Programmet skriver ut det inmatade teknet
     */
    public static class TeckenInmatning2 {
        public static void execute() throws IOException {
            System.out.print("ett tecken: ");
            char c = (char) System.in.read();
            System.out.println("det inmatade tecknet: " + c);
        }
    }

    /***
     * Övning 3
     *
     * Fråga:
     * ---------------
     * Exekvera det här programmet flera gånger.
     * Mata in olika heltal vid olika exekveringar. Vad händer om:
     *      ett tecken tillförs till programmet vid den första inmatningen?
     *      två tecken tillförs till programmet vid den första inmatningen?
     *      tre tecken tillförs till programmet vid den första inmatningen?
     * Vad händer om man bara trycker på returtangenten?
     *
     * Svar:
     * ----------------
     * - Ett tecken tillförs till programmet vid den första inmatningen,
     * väntar programmet på det andra tecken som du måste mata in.
     *
     * - Två tecken tillförs till programmet vid den första inmatningen
     * 
     *
     */
    public static class TeckenInmatning3 {
        public static void execute() throws IOException {
            System.out.print("ett tecken: ");
            char c1 = (char) System.in.read();

            System.out.print("ett tecken: ");
            char c1 = (char) System.in.read();

            System.out.println("tecken: " + c1 + c2);
        }
    }

    public static void main(String [] args) {
        try {
            //Inmatning1.execute();
            //Inmatning2.execute();
            //TeckenInmatning1.execute();
            TeckenInmatning2.execute();
        } catch (Exception e) {

        }

    }
}