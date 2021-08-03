import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        double km;
        double kmPrice = 2.20;
        double price;
        double openPrice = 10;
        double lowPrice = 20;

        Scanner gir = new Scanner(System.in);

        System.out.println("Kaç KM: ");
        km = gir.nextDouble();


        price = openPrice + (km * kmPrice);

        price = (price < 20) ? 20 : price;

        System.out.println("Ödenecek tutar: " + price);



    }
}
