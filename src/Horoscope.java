import java.util.Scanner;

public class Horoscope {
    public static void main(String[] args) {
        int month;
        int day;

        Scanner input = new Scanner(System.in);

        System.out.println("Month: ");
        month = input.nextInt();

        System.out.println("Day: ");
        day = input.nextInt();

        if (month == 3){
            if(day >= 21 && day <= 31){
                System.out.println("Your Horoscope is: ARIES");
            }else if (day >=1 && day <= 20) {
                System.out.println("Your Horoscope is: PISCES");
            }
        }
        if (month == 4){
            if(day >= 1 && day <= 19){
                System.out.println("Your Horoscope is: ARIES");
            }else if (day >=20 && day <= 31) {
                System.out.println("Your Horoscope is: TAURUS");
            }
        }
        if (month == 5){
            if(day >= 1 && day <= 20){
                System.out.println("Your Horoscope is: TAURUS");
            }else if (day >=21 && day <= 31) {
                System.out.println("Your Horoscope is: GEMINI");
            }
        }
        if (month == 6){
            if(day >= 1 && day <= 20){
                System.out.println("Your Horoscope is: GEMINI");
            }else if (day >=21 && day <= 31) {
                System.out.println("Your Horoscope is: CANCER");
            }
        }
        if (month == 7){
            if(day >= 1 && day <= 22){
                System.out.println("Your Horoscope is: CANCER");
            }else if (day >=23 && day <= 31) {
                System.out.println("Your Horoscope is: LEO");
            }
        }
        if (month == 8) {
            if (day >= 1 && day <= 22) {
                System.out.println("Your Horoscope is: LEO");
            } else if (day >= 23 && day <= 31) {
                System.out.println("Your Horoscope is: VIRGO");
            }
        }
        if (month == 9) {
            if (day >= 1 && day <= 22) {
                System.out.println("Your Horoscope is: VIRGO");
            } else if (day >= 23 && day <= 31) {
                System.out.println("Your Horoscope is: LIBRA");
            }
        }
        if (month == 10) {
            if (day >= 1 && day <= 22) {
                System.out.println("Your Horoscope is: LIBRA");
            } else if (day >= 23 && day <= 31) {
                System.out.println("Your Horoscope is: SCORPIO");
            }
        }
        if (month == 11) {
            if (day >= 1 && day <= 21) {
                System.out.println("Your Horoscope is: SCORPIO");
            } else if (day >= 22 && day <= 31) {
                System.out.println("Your Horoscope is: SAGITTARIUS");
            }
        }
        if (month == 12) {
            if (day >= 1 && day <= 21) {
                System.out.println("Your Horoscope is: SAGITTARIUS");
            } else if (day >= 22 && day <= 31) {
                System.out.println("Your Horoscope is: CAPRICORN");
            }
        }
        if (month == 1) {
            if (day >= 1 && day <= 19) {
                System.out.println("Your Horoscope is: CAPRICORN");
            } else if (day >= 20 && day <= 31) {
                System.out.println("Your Horoscope is: AQUARIUS");
            }
        }
        if (month == 2) {
            if (day >= 1 && day <= 18) {
                System.out.println("Your Horoscope is: AQUARIUS");
            } else if (day >= 19 && day <= 31) {
                System.out.println("Your Horoscope is: PISCES");
            }
        }


    }
}
