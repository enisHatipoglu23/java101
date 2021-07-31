import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int math;
        int phisic;
        int chemia;
        int bio;
        int toplam;
        double ortalama;

        System.out.println("Your Math Result:");
        math = input.nextInt();

        System.out.println("Your Phisic Result:");
        phisic = input.nextInt();

        System.out.println("Your Chemia Result:");
        chemia = input.nextInt();

        System.out.println("Your Bio Result:");
        bio = input.nextInt();

        toplam = (math + phisic + chemia + bio);

        ortalama = toplam / 4 ;
        System.out.println("Your Result:" + ortalama);
        boolean kosul1 = ortalama >=60;
        System.out.println("Sonuc= " + (kosul1 == true ? "Passed. " : "FF"));

    }
}
