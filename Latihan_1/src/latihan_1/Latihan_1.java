/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan_1;
import java.util.Scanner;
/**
 *
 * @author luthf
 */
public class Latihan_1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Nama : Azisya Luthfi Bintang");
        System.out.println("Gender : Man");
        System.out.println("Alamat : Far");
        System.out.println("Tanggal Lahir : between 1 and 31\n");
        
        System.out.print("Nama Buah : \n");
        System.out.print("1. Manggis\n");
        System.out.print("2. Semangka\n");
        System.out.print("3. Durian\n");
        System.out.print("4. Salak\n\n");
        
        // Menghitung rata-rata
        int x = 27, y = 30, z = 60;
        float fl = (x+y+z)/3;
        String str = String.valueOf((x+y+z)/3); 
        System.out.println("Rata rata dalam float = " + fl );
        System.out.println("Rata rata dalam string = " + str + "\n");
        
        
        // MEnghitung gaji bersih
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan gaji kotor : ");
        double gajiKotor = input.nextDouble();
        
        float pajak = (float) (10.0/100.0);
        System.out.println(pajak);
        double potongan = pajak*gajiKotor;
        System.out.println("test : " + potongan);
        double gajiBersih = gajiKotor-potongan;
        System.out.println("Gaji Bersih Anda adalah : " + gajiBersih + "\n");
        
        // Tabungan gaji pak Sholeh
        int biayaHaji = 50000000;
        int dp = 10000000;
        int cicilan = (biayaHaji-dp)/23;
        System.out.println("Cicilan selama 2 tahun adalah " + cicilan + " Perbulan\n");
        
        // Menghitung aritmatika dengan pangkat
        int ansA = (int) Math.pow(2, 8) + (int) Math.pow(4, 4);
        System.out.println("2^8 + 4^4 = " + ansA);
        int ansB = (int) Math.pow(2, 2) + (int) Math.pow(4, 1) / (int) Math.pow(2, 2);
        System.out.println("2^2 + 4^1 / 2^2 = " + ansB);
        
    }
    
}
