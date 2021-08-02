import java.util.Scanner;

public class Kdv {
    public static void main(String[] args) {
        double fiyat;
        double kdv;
        double kdv018 = 0.18;
        double kdv08 = 0.8;
        double kdvliFiyat;

        Scanner gir = new Scanner(System.in);
        System.out.println("Fiyat: ");
        fiyat = gir.nextDouble();

        boolean kosul1 = fiyat >= 0;
        boolean kosul2 = fiyat <= 1000;
        boolean result = kosul1 && kosul2;

        kdv = result ? kdv018 : kdv08;
        kdvliFiyat = fiyat + (kdv * fiyat);
        System.out.println("Kdvli fiyat: " + kdvliFiyat);


    }

}
