import java.util.Scanner;

public class RecursiveAsal {
    static void asal() {
        Scanner inp = new Scanner(System.in);
        int number;
        int counter = 0;
        System.out.println("Sayı giriniz : ");
        number = inp.nextInt();
        for (int i = 2; i < number; i++){
            if (number == 2) System.out.println(number + " asaldır.");
            if (number % i == 0){
                System.out.println(number + " asal değildir. ");
                counter++;
                break;
            }
            if (counter == 0){
                System.out.println(number + " asaldır. ");
                break;
            }else{
                System.out.println(number + " asal değildir. ");
            }

        }

    }

    public static void main(String[] args) {
            asal();
    }
}
