import java.util.Scanner;

public class AlanHesaplama {
    public static void main(String[] args) {
        double birinci;
        double ikinci;
        double ucuncu;
        double cevre;
        double u;
        double alan;

        Scanner gir = new Scanner(System.in);

        System.out.println("1.Kenar: ");
        birinci = gir.nextDouble();

        System.out.println("2.Kenar: ");
        ikinci = gir.nextDouble();

        System.out.println("3.Kenar: ");
        ucuncu = gir.nextDouble();

        cevre = birinci + ikinci + ucuncu;
        u = cevre / 2;

        alan = Math.pow((u*(u-birinci)*(u-ikinci)*(u-ucuncu)), 0.5);
        System.out.println("Üçgenin alanı: " + alan);
    }
}
