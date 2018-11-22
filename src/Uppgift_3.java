import java.util.Scanner;

public class Uppgift_3 {
//    Metoden min tar emot två helttal och retunerar det mindre av dem. En annan metod min
//            (man överlagrar den metoden) tar emot två flyttal, och retunerar det mindre av dem.
//    Metoden main matar in två heltal, och bestämmer det mindre av dem via anropet till
//    metoden min. Man matar sedan två flyttal och bestämmer det mindre av dem via anropet
//    till metoden min. Tillslut visas resultaten.
//    Din uppgift: Skapa ett program som består av metoden main och två varianter av
//    metoden min.
//    Utskriften kan se ut så här:
//    run:
//    Mata in två hetal :
//            10
//            2
//    Det minsta talet är: 2
//    Mata in två flyttal :
//            1.3
//            0.1
//    Det minsta talet är: 0,100000
    
    private static int min(int a, int b) {
        return Math.min(a, b);
    }

    private static float min(float a, float b) {
        return Math.min(a, b);
    }

    public static void main() {
        System.out.println("run:");
        System.out.println("Mata in två hetal :");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.printf("Det minsta talet är: %d", min(a,b));
        System.out.println();

        System.out.println("Mata in två flyttal :");
        float c = in.nextFloat();
        float d = in.nextFloat();
        System.out.printf("Det minsta talet är: %f", min(c, d));
    }
}
