import java.util.Scanner;

public class RecursivePower {
    static void power(){
        Scanner inp = new Scanner(System.in);



            System.out.println("Base : ");
            int base = inp.nextInt();
            System.out.println("Exponend : ");
            int exponend = inp.nextInt();
            int result = 1;
            for (int i = 1; i <= exponend; i++){
                if (exponend == 0){
                    result = 1;
                }
                result = result * base;
            }

        System.out.println("Result : " + result);

    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        power();
    }
}
