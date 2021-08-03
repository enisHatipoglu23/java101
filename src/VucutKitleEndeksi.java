import java.util.Scanner;

public class VucutKitleEndeksi {
    public static void main(String[] args) {
        double weight;
        double height;
        double bodyIndex;

        Scanner inp = new Scanner(System.in);
        System.out.println("Weight: ");
        weight = inp.nextDouble();

        System.out.println("Height: ");
        height = inp.nextDouble();

        bodyIndex = weight / (height * height);
        System.out.println("Body index is " + bodyIndex);
        bodyIndex = inp.nextDouble();


    }
}
