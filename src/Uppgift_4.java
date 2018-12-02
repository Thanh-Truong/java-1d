import java.io.IOException;
import java.util.Scanner;

public class Uppgift_4 {
    //    I Java lagrar man ett tecken genom att ange tecknets ordningsnummer (Unicode). Tecknet
//    A har ordningsnumret 65, a har 97 och 1 har 49. Metoden testChar tar emot ett tecken
//    och skriver ut information om tecknet. Se utskriften nedan. Unicode ska hämtas
//    automatiskt. Ditt program ska avslutas när man matar in -1.
//    Din uppgift: Skapa metoden testChar.
//    Utskriften kan se ut så här:
//    run:
//    Mata in ett input: A
//    A är en stor bokstav och har unicode 65
//    Mata in ett input: a
//    a är en lite bokstav och har unicode 97
//    Mata in ett input: -1
    private static char readChar() throws IOException {
        return (char) System.in.read();
    }

    // exit programmet om tecken '-' och sedan tecken '1' matas in
    private static boolean testExit(char tecken) throws IOException {
        if ('-' == tecken) {
            tecken = readChar();
            return (tecken == '1');
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        System.out.println("run:");

        while (true) {
            System.out.print("Mata in ett input: ");
            char tecken = readChar();
            if ('A' <= tecken && tecken <= 'Z') {
                System.out.printf("%c är en stor bokstav och har unicode %d", tecken, (int) tecken);
            } else if ('a' <= tecken && tecken <= 'z') {
                System.out.printf("%c är en lite bokstav och har unicode %d", tecken, (int) tecken);
            } else if (testExit(tecken)) {
                return;
            }
            System.in.read();
            System.out.println();
        }
    }
}
