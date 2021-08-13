import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        int n;
        int r;
        int comb;
        int nF = 1;
        int rF = 1;
        int nrF = 1;


        Scanner inp = new Scanner(System.in);
        System.out.println("n: ");
        n= inp.nextInt();
        System.out.println("r: ");
        r= inp.nextInt();



        for (int i = 1; i <= n; i++){

            nF = nF * i;

        }
        for (int i = 1; i <= r; i++){

            rF = rF * i;
        }
        for (int i = 1; i <= (n-r); i++){

            nrF = nrF * i;
        }
        comb = nF / (rF * (nrF));
        System.out.println("Combination: " + comb);


    }
}
