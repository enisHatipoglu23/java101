import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Basamak sayısı : ");
        int n = input.nextInt();


        for (int i = 1; i <= n; i++){
            for (int k = 1; k<=(n-i) ; k++){
                System.out.print("*");
            }
            for (int k = 1; k<=(n-i) ; k++){
                System.out.print(" ");
            }

            System.out.println();
        }

    }
}
