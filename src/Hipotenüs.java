import java.util.Scanner;

public class Hipotenüs {
    public static void main(String[] args) {
        double a;
        double b;
        double cHipotenus;

        Scanner gir = new Scanner(System.in);
        System.out.println("A: ");
        a = gir.nextDouble();

        System.out.println("B: ");
        b = gir.nextDouble();

        cHipotenus =  Math.pow((a*a + b*b), 0.5);
        System.out.println("Hipotenüs: " + cHipotenus);


    }
}
