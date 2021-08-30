import java.util.Scanner;

public class MetotOlusturma {

    static void metot(){
        Scanner inp = new Scanner(System.in);
        System.out.println("n : ");
        int n = inp.nextInt();
        int result = 0;

       for (int i = n; i > 0; i-=5){
           System.out.print(i + " ");

       }
//YAPAMADIM.



    }

    public static void main(String[] args) {
        metot();
    }
}
