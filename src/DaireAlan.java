import java.util.Scanner;

public class DaireAlan {
    public static void main(String[] args) {
        double pi = 3.14;
        double r;
        double square;
        double centralAngle;
        double result;


        Scanner inp = new Scanner(System.in);
        System.out.println("r: ");
        r = inp.nextDouble();

        System.out.println("Central Angle: ");
        centralAngle = inp.nextDouble();

        square = pi * Math.pow(r , 2);
        result = (square * centralAngle) / 360;
        System.out.println("Result: " + result);
        result = inp.nextDouble();




    }
}
