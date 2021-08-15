import java.util.Scanner;

public class UsAlma {
    public static void main(String[] args) {
        int n;
        int k;


        Scanner input = new Scanner(System.in);
        System.out.println("Üssü alınacak sayı: ");
        n = input.nextInt();

        System.out.print("Üs olacak sayı: ");
        k = input.nextInt();
        int sonuc = 1;

        for (int i = 1; i <= k; i++){
            i = i * n;
            System.out.println("Sonuç: " + sonuc);

        }
    }
}
