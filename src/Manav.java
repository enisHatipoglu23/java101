import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        double armutK = 2;
        double elmaK = 4;
        double domatesK = 1.5;
        double muzK = 1;
        double patlıcanK = 5;
        double price;
        double kilo;

        Scanner inp = new Scanner(System.in);
        System.out.println("kaç kilo armut? ");
        kilo = inp.nextDouble();


        System.out.println("kaç kilo elma? ");
        kilo = inp.nextDouble();


        System.out.println("kaç kilo domates? ");
        kilo = inp.nextDouble();


        System.out.println("kaç kilo muz? ");
        kilo = inp.nextDouble();


        System.out.println("kaç kilo patlıcan? ");
        kilo = inp.nextDouble();


        price = (kilo * armutK) + (kilo * domatesK) + (kilo * elmaK) + (kilo * muzK) + (kilo * patlıcanK);

        System.out.println("Total price is " + price);
        price = inp.nextDouble();


    }
}
