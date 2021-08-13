import java.util.Scanner;
import java.util.stream.IntStream;

public class UcVeDordeBolenOrt {
    public static void main(String[] args) {
        int num;
        int sum = 0;
        int ort;

        Scanner inp = new Scanner(System.in);

        System.out.println("sayı giriniz: ");
        num = inp.nextInt();

        for (int i = 1; i <= num; i++){
            if ((i % 4 == 0) && (i % 3 == 0)){
                sum += i;
                System.out.println("num: " + i);

            }
        }
        System.out.println("sum: " + sum);

    }
}
