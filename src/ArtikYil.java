import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        int yil;
        int artikYil;

        Scanner input = new Scanner(System.in);

        System.out.println("Yılı giriniz: ");
        yil = input.nextInt();

        artikYil = (yil % 4);

        if (artikYil == 0){
            System.out.println(yil + " Artık yıldır. ");
        }else{
            System.out.println(yil + " Artık yıl değildir.");
        }
    }
}
