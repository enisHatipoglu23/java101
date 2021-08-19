import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Kaç sayı gireceksiniz : ");
        int sayac = input.nextInt();
        int min = 1;
        int max = 1;
        int num;

        for (int i = 1; i <= sayac; i++){
            System.out.println(i + ". Sayıyı giriniz : ");
            num = input.nextInt();
            if (num > max){
                max = num;
            }
            if (num < min){
                min = num;
            }

        }
        System.out.println("Max : " + max + "\nMin : " + min);
    }
}
