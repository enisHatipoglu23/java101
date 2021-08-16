import java.util.Scanner;

public class BasamakSayiToplam {




    public static void main(String[] args) {
        int sayi;
        int basDegeri;
        int basSum;
        int result = 0;
        int basamakNum = 0;


        Scanner input = new Scanner(System.in);

        System.out.println("Sayıyı Giriniz : ");
        sayi = input.nextInt();

        int tempSayi = sayi;

        while (tempSayi != 0) {
            tempSayi /= 10;
            basamakNum++;
        }

        tempSayi = sayi;
        while (tempSayi != 0) {
            basDegeri = tempSayi % 10;
            basSum = 0;
            basSum += basDegeri;
            result = result + basSum;
            tempSayi /= 10;

        }
        System.out.println("Sonuç : " + result);


    }
}

