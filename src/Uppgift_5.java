import java.util.Scanner;

public class Uppgift_5 {
//    Ett skottår är ett år med 366 dagar i stället för 365, vart 4:e år tillkommer det en extra dag
//    i februari. Till exempel: https://www.kalender-365.se/skottar.html
//    Ett skottår kan beräknas så här: Årtal % 4 = 0 och årtal % 100 ≠ 0, eller årtal % 400 = 0.
//    Metoden leapYear tar emot (från Scanner) ett heltal som argument, och skriver ut ett
//    godtyckligt skottår.
//    Din uppgift: Skapa metoden leapYear.
//    Utskrift kan se ut så här:
//    run:
//    Mata in ett år: 2036
//            2036 är ett skottår (feburari har 29 dagar)
    private static boolean leapYear(int year){
        return (year %4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public static void main(){
        System.out.println("run:");
        Scanner in = new Scanner(System.in);

        System.out.print("Mata in ett år: ");
        int year = in.nextInt();
        if (leapYear(year)) {
            System.out.printf("%d är ett skottår (feburari har 29 dagar)", year);
        } else {
            System.out.printf("%d är inte ett skottår", year);
        }
    }
}
