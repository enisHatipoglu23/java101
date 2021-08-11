import java.util.Scanner;

public class Siralama {
    public static void main(String[] args) {
        int a;
        int b;
        int c;

        Scanner input = new Scanner(System.in);
        System.out.println("1.: ");
        a = input.nextInt();

        System.out.println("2.: ");
        b = input.nextInt();

        System.out.println("3.: ");
        c = input.nextInt();

        if((a > b) && (a > c)){
            if ((b > c)){
                System.out.println(c + " < " + b + " < " + a);
            }else if (c > b){
                System.out.println(b + " < " + c + " < " + a);
            }
        }else if ((b > c) && (b > a)){
            if (c > a){
                System.out.println(a + " < " + c + " < " + b);
            }else if (a > c){
                System.out.println(c + " < " + a + " < " + b);
            }
        }else if ((c > a) && (c > b)){
            if (a > b){
                System.out.println(b + " < " + a + " < " + c);
            }else if (b > a){
                System.out.println(a + " < " + b + " < " + c);
            }
        }


    }
}
