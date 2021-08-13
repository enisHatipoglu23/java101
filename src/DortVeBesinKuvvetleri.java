import java.util.Scanner;

public class DortVeBesinKuvvetleri {
    public static void main(String[] args) {
        int num;

        Scanner input = new Scanner(System.in );

        System.out.println("num: ");
        num = input.nextInt();
        System.out.println("4'ün Kuvvetleri: ");

         for (int i = 1; i <= num; i *= 4){
             System.out.println("X::: " + i);
         }

        System.out.println("5'in Kuvvetleri: ");
        System.out.println("*************");
        for (int i = 1; i <= num; i *= 5){
            System.out.println("X::: " + i);
        }

    }
}
