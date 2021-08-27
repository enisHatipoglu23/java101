import java.util.Scanner;

public class RecursiveFibonaci {
    static int fib(int num){
        if (num == 2 || num == 1){
            return 1;
        }
        return fib(num - 1) + fib(num - 2);
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Fibonacci series : " + fib(inp.nextInt()));

    }
}
