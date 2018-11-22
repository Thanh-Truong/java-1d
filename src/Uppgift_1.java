public class Uppgift_1 {
    // Uppgift 1 för betyg E
    // ------------------------
    // Skapa en tvådimensionell vektor som representerar de följande tabell med heltal:
    //        10 12 14 16 18 20
    //        11 13 15 17 19 21
    // Beräkna sedan medelvärdet av alla vektorns element. Avsluta med att visa vektorn och
    // dess medelvärde. Skapa motsvarande program.
    // Utskriften ska se ut så här:
    //
    public static void main() {
        int[][] tvådimensionel_array = {{10, 12, 14, 16, 18, 20},
                {11, 13, 15, 17, 19, 21}};

        System.out.println("run:");

        for (int[] row : tvådimensionel_array) {
            for (int item : row) {
                System.out.print(item);
                System.out.print(" ");
            }
            System.out.println();
        }
        // Beräkna medelvärdet av all vektorns element
        int sum, count;
        sum = count = 0;
        for (int[] row : tvådimensionel_array) {
            for (int item : row) {
                sum += item;
                count++;
            }
        }
        System.out.printf("Mdelvärdet: %.1f", sum * 1.0 / count);
    }
}
