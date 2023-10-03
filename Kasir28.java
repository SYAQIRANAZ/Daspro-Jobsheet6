import java.util.Scanner;

public class Kasir28 {
    public static void main(String[] args) {
        int total, diskon, bayar;
        String kartu;
        Scanner sc = new Scanner (System.in);
        System.out.println("Apakah pelanggan mempunyai kartu anggota (y atau t)?");
        kartu = sc.nextLine();
        System.out.println("Berapa total harga barang belanjaan? Rp");
        total = sc.nextInt();
        if (kartu.equals("y")) {
            if (total > 200000) {
                diskon = 50000;
            } else {
                diskon = 15000;
            }
        } else { 
            if (total > 150000) {
                diskon = 5000;
            } else {
                diskon = 0;
            }
        }
        bayar = total - diskon;
        System.out.println("Total baran yang dibayar: Rp" +bayar);
    }
}