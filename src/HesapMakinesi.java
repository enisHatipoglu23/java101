import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int n1;
        int n2;
        int choose;

        Scanner input = new Scanner(System.in);

        System.out.println("First num: ");
        n1 = input.nextInt();

        System.out.println("Second num: ");
        n2 = input.nextInt();

        System.out.println("1- +\n2- -\n3- x\n4- /");
        System.out.println("Selected: ");
        choose = input.nextInt();

        switch (choose){
            case 1:
                System.out.println("Sum: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Minus: " + (n1 - n2));
                break;
            case 3:
                System.out.println("***: " + (n1 * n2));
                break;
            case 4:
                System.out.println("///: " + (n1 / n2));
                break;
            default:
                System.out.println("Input a NUMBER please!");
        }
    }
}
