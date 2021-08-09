import java.util.Scanner;

public class LessonsPassing {
    public static void main(String[] args) {
        int mat;
        int fizik;
        int turkce;
        int kimya;
        int muzik;
        int ders;



        Scanner input = new Scanner(System.in);

        System.out.println("MAT: ");
        mat = input.nextInt();

        System.out.println("FIZIK: ");
        fizik = input.nextInt();

        System.out.println("TURKCE: ");
        turkce = input.nextInt();

        System.out.println("KIMYA: ");
        kimya = input.nextInt();

        System.out.println("MUZIK: ");
        muzik = input.nextInt();

        ders = 5;

        if (mat < 0 || mat > 100){
            mat = 0;
            ders--;
            System.out.println("Lütfen 0-100 arasında bir değer giriniz. ");
        }
        if (fizik < 0 || fizik > 100){
            fizik = 0;
            ders--;
            System.out.println("Lütfen 0-100 arasında bir değer giriniz. ");
        }
        if (turkce < 0 || turkce > 100){
            turkce = 0;
            ders--;
            System.out.println("Lütfen 0-100 arasında bir değer giriniz. ");
        }
        if (kimya < 0 || kimya > 100){
            kimya = 0;
            ders--;
            System.out.println("Lütfen 0-100 arasında bir değer giriniz. ");
        }
        if (muzik < 0 || muzik > 100){
            muzik = 0;
            ders--;
            System.out.println("Lütfen 0-100 arasında bir değer giriniz. ");
        }

        double ort = (mat + fizik + kimya + turkce + muzik) / 5;

        if(ort < 55){
            System.out.println("Sınıfta kaldın. " + ort);
        }else{
            System.out.println("Geçtin. " + ort
            );
        }


    }


}
