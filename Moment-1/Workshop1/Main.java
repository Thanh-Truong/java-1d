import java.util.*;

public class Main {

    public static class Variabler {
        public static void execute() {
            int antal1 = 10;
            int antal2 = antal1;
            System.out.println("antal1 = " + antal1);
            System.out.println("antal2 = " + antal2);

            int antalBocker;
            antalBocker = antal1 + antal2;
            System.out.println("antalet böcker = " + antalBocker);
        }
    }

    public static class AndraVariabel {
        public static void execute() {
            int n = 10;
            System.out.println("n = " + n);
            n = 20;
            System.out.println("n = " + n);
            n = 100;
            System.out.println("n= " + n);
            System.out.println();

            final int ANTAL = 50;
            System.out.println("ANTAL = " + ANTAL);
        }

        public static void extra_svar() {
            System.out.println("Man kan inte ändra variable ANTAL för ANTAL är en konstant.");
            System.out.println("Om man tar bort kommentarsmarkeringen, bilr det kompileringsfel");
        }
    }

    public static class Tal {
        public static void execute() {
            int n = 100;
            double x = 2.5000_00_0001;
            double y = n * x + 1000;
            System.out.println("y = " + y);
            x = 2.5E+3;
            y = x + 0.1 + 2E-2;
            System.out.println("y = " + y);
            System.out.println(0.0000001);
        }
    }

    public static class AndraTal {
        public static void execute() {
            long m = 5000000000L;
            // long n = 5000000000;
            System.out.println("m = " + m);
            // System.out.println(5000000000);
            float x = 2.5F;
            // float y = 2.5;
            System.out.println("x = " + x);
        }

        public static void extra_svar() {
            System.out.println("Det går inte att ta bort kommentarsmarkeringarna utan Java kompilator visade" +
                    " kompileringsfel.\nOrsaken är att de satserna saknar ett suffix");
        }
    }

    public static class Tecken {
        public static void execute() {
            char c1 = 'A';
            char c2 = 65;
            int n = 65;

            System.out.println(c1);
            System.out.println(c2);
            System.out.println(n);
            System.out.println();

            char c3 = '\\';
            char c4 = '\n';
            char c5 = 48;
            char c6 = 97;

            System.out.println(c3);
            System.out.println(c4);
            System.out.println(c5);
            System.out.println('\t');
            System.out.println(c6);
        }
    }

    public static class Teckenstrangar {
        public static void execute() {
            String s1 = "den 21 oktober";
            String s2 = " 2015";
            String s3 = s1 + s2;
            System.out.println(s3);

            char c = 'A';
            int n = 65;
            double d = 0.5;
            String s = "a" + c + n + " " + d;
            System.out.println(s);
        }
    }

    public static void skriv_ut_titel(final String ovning_typ, final int ovning_tal) {
        System.out.println("---------------------------------------------------------");
        System.out.println(String.format("%s övning %d:", ovning_typ, ovning_tal));
        System.out.println("---------------------------------------------------------");
    }

    public static void main(String[] args) {
        skriv_ut_titel("Variabler",  1);
        Variabler.execute();
        skriv_ut_titel("AndraVariabel",  2);
        AndraVariabel.execute();
        AndraVariabel.extra_svar();
        skriv_ut_titel("Datatyper",  1);
        Tal.execute();

        skriv_ut_titel("Datatyper",  2);
        AndraTal.execute();
        AndraTal.extra_svar();

        skriv_ut_titel("Datatyper",  3);
        Tecken.execute();

        skriv_ut_titel("Datatyper",  4);
        Teckenstrangar.execute();

        //Scanner scanner = new Scanner(System.in);
        System.out.println("ddddd  " + System.in.read());
    }
}
