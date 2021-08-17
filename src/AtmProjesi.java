import java.sql.SQLOutput;
import java.util.Scanner;

public class AtmProjesi {
    public static void main(String[] args) {
        String userName;
        String password;
        int hak = 3;
        int balance = 2023;
        int select;



        while(hak > 0){
            Scanner input = new Scanner(System.in);
            System.out.println("Kullanıcı Adı : ");
            userName = input.nextLine();
            System.out.println("Parola : ");
            password = input.nextLine();

            if (userName.equals("ymrens") && password.equals("232631")){
                System.out.println("Giriş yaptınız . ");
                System.out.println("Merhaba Bankamatiğe Hoşgeldiniz. ");

                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz :P ");
                    System.out.println("1 - Para Çekme\n" + "2 - Para Yatırma\n" +
                            "3 - Bakiye Sorgulama\n" + "4 - Çıkış Yapma\n");
                    select = input.nextInt();

                    switch (select){
                        case 1:
                            System.out.println("Çekmek istediğiniz miktar : ");
                            int price = input.nextInt();
                            if (balance >= price){
                                System.out.println("Hesabınızdan çekilen miktar : " + price);
                                System.out.println("Para çekme işleminiz başarıyla tamamlandı. ");
                                balance -= price;
                                System.out.println("Kalan bakiyeniz : " + balance);
                            }else{
                                System.out.println("Maalesef bakiyeniz yeterli değil. ");
                            }
                            break;
                        case 2:

                            System.out.println("Yatırmak istediğiniz miktar : ");
                            int amount = input.nextInt();
                            System.out.println("Hesabınıza " + amount + " para yatırıldı. ");
                            balance += amount;
                            System.out.println("Para yatırma işleminiz başarıyla tamamlandı. ");
                            System.out.println("Bakiyeniz : " + balance);
                            break;

                        case 3:
                            System.out.println("Güncel bakiyeniz : " + balance);
                            break;

                        case 4:
                            System.out.println("GoodBye :))))))))))");
                            break;
                    }




                    /*
                    if (select == 1) {
                        System.out.println("Çekmek istediğiniz miktar : ");
                        int price = input.nextInt();
                        if (balance >= price){
                            System.out.println("Hesabınızdan çekilen miktar : " + price);
                            System.out.println("Para çekme işleminiz başarıyla tamamlandı. ");
                            balance -= price;
                            System.out.println("Kalan bakiyeniz : " + balance);
                        }else{
                            System.out.println("Maalesef bakiyeniz yeterli değil. ");
                        }

                    }
                    else if (select == 2){
                        System.out.println("Yatırmak istediğiniz miktar : ");
                        int amount = input.nextInt();
                        System.out.println("Hesabınıza" + amount + "para yatırıldı. ");
                        balance += amount;
                        System.out.println("Para yatırma işleminiz başarıyla tamamlandı. ");
                        System.out.println("Bakiyeniz : " + balance);
                    }

                    else if (select == 3){
                        System.out.println("Güncel bakiyeniz : " + balance);
                    }


                }while (select != 4);
                break;

                     */
            }else{
                hak--;
                System.out.println("Kullanıcı adınız veya şifreniz yanlış. Lütfen tekrar deneyiniz. Kalan hakkınız : " + hak);
            }if (hak == 0){
                System.out.println("Hesabınız bloke edilmiştir lütfen yetkili servisle iletişime geçiniz. ");
            }


        }


    }
}
