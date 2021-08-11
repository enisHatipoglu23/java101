import java.util.Scanner;

public class SıcaklıkEtkinlik {
    public static void main(String[] args) {
        int heat;
        Scanner input = new Scanner(System.in);
        System.out.println("Sıcaklık: ");
        heat = input.nextInt();

        if(heat < 5){
            System.out.println("Kayak etkinliği sizin için uygun olabilir. ");
        }
        if ((heat >= 5) && (heat < 15)){
            System.out.println("Sinemaya gitmek uygun olabilir. ");
        }
        if ((heat >= 10) && (heat < 25)){
            System.out.println("Pikniğe gitmek uygundur. ");
        }
        if (heat >= 25){
            System.out.println("Yüzmeye gitmek en ideal seçenektir. ");
        }
    }
}
