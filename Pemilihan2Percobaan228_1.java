import java.util.Scanner;

public class Pemilihan2Percobaan228 {
    public static void main(String[] args) {
        Scanner input28 = new Scanner(System.in);
        System.out.println("Masukkan sudut 1 :");
        System.out.println("Masukkan sudut 2 :");
        System.out.println("Masukkan sudut 3 :");
        float sudut1 = input28.nextFloat();
        float sudut2 = input28.nextFloat();
        float sudut3 = input28.nextFloat();
        float totalSudut;
        totalSudut = sudut1 + sudut2 + sudut3;
        if (totalSudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90)){
               System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            }else if ((sudut1 == 60) && (sudut2 == 60) && (sudut3 == 60)) {
                System.out.println("Segitiga tersebut adalah segitiga sama kaki");
            } else if ((sudut1 == sudut3) || (sudut2 == sudut1) || (sudut3 == sudut2)) {
                System.out.println("Segitiga tersebut merupakan segitiga sama sisi");
            } else {
                System.out.println("Segitiga tersebut adalah segitiga sembrang");
            }
        } else {
            System.out.println("Bukan Segitiga");
        }
    }
           
}