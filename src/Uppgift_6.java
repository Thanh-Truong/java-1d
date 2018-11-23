public class Uppgift_6 {
//    En metod med namnet change tar emot en sträng av typen StringBuilder och ett tecken.
//    Metoden returnerar ingenting (en void-metod). Metoden ändrar argumentsträngar genom
//    att lägga till argumenttecknet till strängen.
//    I metoden main skapar en sträng av typen StringBuilder och ett tecken, och sedan
//    ändras strängen genom att metoden change anropas med strängen och tecknet som
//    argument. Visa strängar före och efter metodanropet.
//    Din uppgift: Skapa klassen Change, som består av metoden main och metoden change.
//    Utskriften kan se ut så här:
//    run:
//    Före metodanropet: Hemuppgifte
//    Efter metodanropet: Hemuppgifter
    public static class Change {
        private static void change(StringBuilder strBuilder, char tecken) {
            strBuilder.append(tecken);
        }

        public static void main() {
            System.out.println("run:");
            StringBuilder strBuilder = new StringBuilder("Hemuppgifte");
            System.out.printf("Före metodanropet: %s \n", strBuilder.toString());
            char tecken = 'r';
            change(strBuilder, tecken);
            System.out.printf("Efter metodanropet: %s \n", strBuilder.toString());
        }
    }

}

