import java.util.Scanner;

public class YildizlaUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Basamak sayısı : ");
        int n = input.nextInt();
        int g = input.nextInt();

        for (int i = 1; i <= n; i++){
            for (int k = 1; k <= (n - i); k++){
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i) - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int p = 1; p <= g; p++){
            for (int c = 1; c <= (g-p); c++){
                System.out.print(" ");
            }
            for (int f = 1; f <= (2*g) + 1; f++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
