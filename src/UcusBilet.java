import java.util.Scanner;

public class UcusBilet {
    public static void main(String[] args) {
        int km;
        int type;
        int age;
        double tutar;

        Scanner input = new Scanner(System.in);

        System.out.println("Mesafeyi giriniz(KM): ");
        km = input.nextInt();
        if (km >= 1 && km < 100000){
            System.out.println(km);
        }else{
            System.out.println("Hatalı veri girişi yaptınız.Lütfen tekrar deneyiniz.");
            km = input.nextInt();

        }

        System.out.println("Yaşınız: ");
        age = input.nextInt();
        if (age >= 1 && age <= 200){
            System.out.println(age);
        }else{
            System.out.println("Hatalı veri girişi yaptınız.Lütfen tekrar deneyiniz.");
            age = input.nextInt();
            return;
        }

        System.out.println("1 --- TEK YÖN ");
        System.out.println("2 --- GİDİŞ-DÖNÜŞ ");
        type = input.nextInt();
        if (type == 1 && type == 2){
            System.out.println(type);
            if (type == 2){
                tutar = km * 0.10 - (km * 0.10 * 0.20);
                System.out.println("Indirimli fiyat: " + tutar);
            }
        }else if (type != 1 && type != 2){
            System.out.println("Hatalı veri girişi yaptınız.");

        }



        if (age < 12){
            if (type == 2){
                tutar = km * 0.10 * 0.5 - (km * 0.10 * 0.20);
                System.out.println("Gidiş-Dönüş ve Yaş indirimli Fiyat: " + tutar);
            }else if (type == 1){
                tutar = km * 0.10 * 0.5;
                System.out.println("Yaş İndirimli fiyat: " + tutar);
            }
        }else if (age >= 12 && age < 24){
            if (type == 2){          //km * 0.10 - (km * 0.10 * 0.10) - (km * 0.10 -(km * 0.10 * 0.10)) * 0.20
                tutar = km * 0.10 - (km * 0.10 * 0.10) - (km * 0.10 -(km * 0.10 * 0.10)) * 0.20;
                System.out.println("Gidiş-Dönüş ve Yaş indirimli Fiyat: " + tutar);
            }else if (type == 1){
                tutar = km * 0.10 - (km * 0.10 * 0.10);
                System.out.println("Yaş İndirimli fiyat: " + tutar);
            }
        }else if (age > 24 && age < 60){
            if (type == 2){
                tutar = km * 0.10 - (km * 0.10 * 0.20);
                System.out.println("Gidiş-Dönüş ve Yaş indirimli Fiyat: " + tutar);
            }else if (type == 1){
                tutar = km * 0.10;
                System.out.println("Fiyat: " + tutar);
            }
        }else if (age >= 60){
            if (type == 2){
                tutar =km * 0.10 - (km * 0.10 * 0.30) - (km * 0.10 - (km * 0.10 * 0.30)) * 0.20;
                System.out.println("Gidiş-Dönüş ve Yaş indirimli Fiyat: " + tutar);
            }else if (type == 1){
                tutar = km * 0.10 - (km * 0.10 * 0.30);
                System.out.println("İndirimli fiyat: " + tutar);
            }



        }





    }
}
