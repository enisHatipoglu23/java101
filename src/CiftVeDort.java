import java.util.Scanner;

public class CiftVeDort {
    public static void main(String[] args) {
        int num;
        int sum = 0;

        Scanner inp = new Scanner(System.in);

        do {
            System.out.println("Num: ");
            num = inp.nextInt();
            if ((num % 2 == 0)){
                sum += num;
                System.out.println("sum: " + sum);
            }

            if (num == 000){
                break;
            }
        }
        while ((num % 2 == 0));

        System.out.println("sum: " + sum);





    }
}
