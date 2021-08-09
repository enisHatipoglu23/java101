import java.util.Scanner;

public class UserEntry {
    public static void main(String[] args) {
        String userName;
        String password;
        int select;
        String nPassword;

        Scanner input = new Scanner(System.in);

        System.out.println("Username: ");
        userName = input.nextLine();

        System.out.println("Password: ");
        password = input.nextLine();

        System.out.println();

        if ((userName.equals("patika") && password.equals("java123"))){
            System.out.println("Giriş yapıldı. ");

        }else if (!userName.equals("patika") && !password.equals("java123")){
            System.out.println("Kullanıcı adı ve şifre yanlış. ");

        }else if (userName.equals("patika") && !password.equals("java123")){
            System.out.println("Şifre yanlış girildi. ");

            System.out.println("Şifrenizi mi unuttunuz? Yenilemek istiyorsanız seçiminizi yapınız." +
                    "\n1- Şifre değişimi\n2- Tekrar deneme");

            System.out.println("Selected: ");

            select = input.nextInt();

            switch (select){
                case 1:
                    Scanner in = new Scanner(System.in);
                    System.out.println("Yeni şifrenizi giriniz: ");
                    nPassword = in.nextLine();

                    if (nPassword.equals("java123")){
                        System.out.println("Bu şifre eski şifrenizle aynı farklı girin lütfen. ");
                        System.out.println("Şifre: ");
                        nPassword = in.nextLine();
                        break;
                    }else{

                        System.out.println("Şifre kullanılabilir. ");
                    }



                    System.out.println("Yeni şifreniz: " + nPassword);
                    break;

                case 2:
                    Scanner inp = new Scanner(System.in);
                    System.out.println("Password: ");

                    password = inp.nextLine();

                    if (password.equals("java123")){

                        System.out.println("Şifre doğru! ");
                        break;

                    }else if(!password.equals("java123")){

                        System.out.println("Şifre yine yanlış girildi. ");
                        System.out.println("Şifre: ");
                        password = inp.nextLine();
                        break;
                    }

            }

        }
    }
}
