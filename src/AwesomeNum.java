import java.util.Scanner;

public class AwesomeNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        int num = input.nextInt();
        int sum = 0;
        for (int i = 1; i < num; i++){
            if (num % i == 0){
                sum += i;
            }
        }
        if (sum == num){
            System.out.println(num + " mükemmel sayıdır. ");
        }else{
            System.out.println(num + " mükemmel sayı değildir.");
        }

    }


}
