import java.util.Scanner;

public class AsalSayiBulan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String button = input.nextLine();
        if (button.equals("get")){
            System.out.println("Asal Sayılar : 2");
            for (int i = 3; i <= 100; i+=2){

                System.out.println("Asal Sayılar : " +  i);

            }
        }
    }
}
