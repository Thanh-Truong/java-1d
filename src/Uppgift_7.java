//    En tabell innehåller följande alfabet:
//    A B C D E
//    F G H I J
//    K L M N O
//    En instansmetod är en metod som har deklarerats utan ordet ”static”. Man måste skapa
//    objekt för att komma åt metoden. Instansmetoden reverse tar emot en två dimensionella
//    teckenvektorer (av typen char), och visa vektorns innehåll (alfabet) i omvänd på tre rader.
//    Din uppgift: Skapa ett program som består av metoden main och instansmetoden
//    reverse.
//    Utskriften ska se ut så här:
public class Uppgift_7 {

    private static class ReverseArray {
        // Metoden visar argumentteckenvektorer i omvänd
        public void reverse(char[][] teckens) {
            for (int i = 0; i < teckens.length; i++) {
                for (int j = teckens[i].length - 1; j >= 0; j--) {
                    System.out.printf("%c ", teckens[i][j]);
                }
                System.out.println();
            }
        }
    }

    public static void main(String []args) {
        ReverseArray revArray =   new ReverseArray();
        char[][] teckens =
                {{'A', 'B', 'C', 'D', 'E'},
                        {'F', 'G', 'H', 'I', 'J'},
                        {'K', 'L', 'M', 'N', 'O'}};
        revArray.reverse(teckens);
    }
}
