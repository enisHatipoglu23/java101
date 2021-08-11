import java.util.Scanner;

public class ChineeseZodiaq {
    public static void main(String[] args) {
        int birthDate;
        int cinZodyagı;

        Scanner input = new Scanner(System.in);

        System.out.println("Doğum yılını giriniz: ");
        birthDate = input.nextInt();

        cinZodyagı = birthDate % 12;

        if(cinZodyagı == 0){
            System.out.println("Çin zodyağı burcunuz 'Maymun' ");
        }else if (cinZodyagı == 1){
            System.out.println("Çin zodyağı burcunuz 'Horoz' ");
        }else if (cinZodyagı == 2) {
            System.out.println("Çin zodyağı burcunuz 'Köpek' ");
        }
        else if (cinZodyagı == 3) {
            System.out.println("Çin zodyağı burcunuz 'Domuz' ");
        }
        else if (cinZodyagı == 4) {
            System.out.println("Çin zodyağı burcunuz 'Fare' ");
        }
        else if (cinZodyagı == 5) {
            System.out.println("Çin zodyağı burcunuz 'Öküz' ");
        }
        else if (cinZodyagı == 6) {
            System.out.println("Çin zodyağı burcunuz 'Kaplan' ");
        }
        else if (cinZodyagı == 7) {
            System.out.println("Çin zodyağı burcunuz 'Tavşan' ");
        }
        else if (cinZodyagı == 8) {
            System.out.println("Çin zodyağı burcunuz 'Ejderha' ");
        }
        else if (cinZodyagı == 9) {
            System.out.println("Çin zodyağı burcunuz 'Yılan' ");
        }
        else if (cinZodyagı == 10) {
            System.out.println("Çin zodyağı burcunuz 'At' ");
        }
        else if (cinZodyagı == 11) {
            System.out.println("Çin zodyağı burcunuz 'Koyun' ");
        }
    }
}
