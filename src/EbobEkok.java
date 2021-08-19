import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("n1 : ");
        int n1 = input.nextInt();

        System.out.println("n2 : ");
        int n2 = input.nextInt();

        int ebob = 1;

        int i = 1;

        while (i <= n1){
            if (n1 % i == 0 && n2 % i == 0){
                ebob = i;
                System.out.println(i);

            }
            i++;

        }
        System.out.println("Ebob : " + ebob);
        System.out.println("*************");

        int ekok = 1;
        while (i <= (n1 * n2)){
            if (i % n1 == 0 && i % n2 == 0){
                System.out.println(i);
                ekok = i;
                break;
            }
            i++;
        }
        System.out.println("Ekok : " + ekok);
    }
}
