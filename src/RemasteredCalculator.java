import java.util.Scanner;

public class RemasteredCalculator {
    static void plus(){
        Scanner inp = new Scanner(System.in);
        int number;
        int result = 0;
        int i = 1;

        while (true){
            System.out.println(i++ + ". Sayı : ");
            number = inp.nextInt();
            if (number == 0){
                break;
            }
            result = result + number;
        }
        System.out.println("Result : " + result);
    }

    static void minus(){
        Scanner inp = new Scanner(System.in);
        System.out.println("Girilecek sayı : ");
        int counter = inp.nextInt();
        int number;
        int result = 0;

        for (int i = 1; i <= counter; i++){
            System.out.println(i + ". Sayı : ");
            number = inp.nextInt();
            if (i == 1){
                result += number;
                continue;
            }
            result -= number;
        }
        System.out.println("Result : " + result);
    }

    static void times(){
        Scanner inp = new Scanner(System.in);
        System.out.println("Kaç sayı : ");
        int counter = inp.nextInt();
        int number;
        int result = 1;
        int i = 1;

        while (i <= counter){
            System.out.println(i++ + ". Sayı : ");
            number = inp.nextInt();

            if (number == 1){
                break;
            }
            if (number == 0){
                result = 0;
                break;
            }
            result = result * number;
        }
        System.out.println("Result : " + result);
    }

    static void bolme(){
        Scanner inp = new Scanner(System.in);
        double number1, number2;
        double result = 0.0;

        System.out.println("Bölünen Sayı : ");
        number1 = inp.nextDouble();
        System.out.println("Bölen Sayı : ");
        number2 = inp.nextDouble();
        result = number1 / number2;
        System.out.println("Result : " + result);

    }

    static void modAlma(){
        Scanner inp = new Scanner(System.in);
        int number;
        int result = 1;
        System.out.println("Sayı : ");
        number = inp.nextInt();
        result = number % 10;
        System.out.println("Result : " + result);
    }

    static void dikAlanCevre(){
        Scanner inp = new Scanner(System.in);
        int birinciKenar, ikinciKenar, cevre, alan;
        System.out.println("1. Kenar : ");
        birinciKenar = inp.nextInt();
        System.out.println("2. Kenar : ");
        ikinciKenar = inp.nextInt();
        cevre = (birinciKenar * 2) + (ikinciKenar * 2);
        System.out.println("Dikdörtgenin Çevresi : " + cevre);
        alan = birinciKenar * ikinciKenar;
        System.out.println("Dikdörtgenin Alanı : " + alan);
    }

    static  void power(){
        Scanner inp = new Scanner(System.in);
        System.out.println("Taban : ");
        int base = inp.nextInt();

        System.out.println("Üs Değeri : ");
        int exponent = inp.nextInt();

        int result = 1;

        for (int i = 1; i <= exponent; i++){
            result = result * base;
        }
        System.out.println("Result : " + result);
    }

    static void factorial(){
        Scanner inp = new Scanner(System.in);
        System.out.println("Sayı girinz : ");
        int number = inp.nextInt();
        int result = 1;

        for (int i = 1; i <= number; i++){
            result *= i;
        }
        System.out.println("Result : " + result);
    }


    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int select = 0;


        do {
            System.out.println("1 - Toplama\n" +
                    "2 - Çıkarma\n" +
                    "3 - Çarpma\n" +
                    "4 - Bölme\n" +
                    "5 - Üs Alma\n"+
                    "6 - Mod Alma\n" +
                    "7 - Dikdörtgenin Alanı ve Çevresi\n" +
                    "8 - Faktoriyel Bulma");
            System.out.println("Seçim Yapınız : ");
            select = inp.nextInt();
            switch (select){
                case 1 :
                    plus();
                    break;

                case 2 :
                    minus();
                    break;

                case 3 :
                    times();
                    break;

                case 4 :
                    bolme();
                    break;

                case 5 :
                    power();
                    break;

                case 6 :
                    modAlma();
                    break;

                case 7 :
                    dikAlanCevre();
                    break;

                case 8 :
                    factorial();
                    break;

                default:
                    System.out.println("Wrong choice. ");
            }
        }while (select != 0);





    }
}
