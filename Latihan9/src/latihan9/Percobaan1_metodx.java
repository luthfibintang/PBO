/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan9;

public class Percobaan1_metodx {
    public double luas_lingkaran(int diameter){
        int jari2= diameter/2;
        double luas = Math.PI * Math.pow(jari2, 2);
        return luas;
    }
    
    public void hitungLuasLingkaran(int jari2){
        double luas = Math.PI * Math.pow(jari2, 2);
        System.out.println(luas);
    }
    
    public void volumeTabung(double l, int t){
        double volume = l * t;
        System.out.println("Volume Tabung = " + volume);
    }
    
    public void volumeKerucut(double l, int t){
//        double divide = 1;
//        double divide2 = 3;
//        double divide3 = divide/divide2;
//        System.out.println(divide3);
        double volume = 0.33 * l * t;
        System.out.println("Volume Kerucut = " + volume);
    }
    
    public void volumeBola(double l, int jari2){
        double volume = (4/3) * Math.pow(jari2, 3);
        System.out.println("Volume Bola = " + volume);
    }
    
    public static void main(String[] args){
        // Menghitung luas Lingkaran
        Percobaan1_metodx mt = new Percobaan1_metodx();
        mt.hitungLuasLingkaran(10);
        
        System.out.println("Volume Tabung");
        Percobaan1_inputconsole ic = new Percobaan1_inputconsole();
        System.out.print("Jari - Jari : ");
        int jari2 = ic.readInt();
        System.out.print("Tinggi : ");
        int tinggi = ic.readInt();
        
        //Volume Tabung
        mt.volumeTabung(mt.luas_lingkaran(jari2), tinggi);
        
        // Volume Kerucut
        mt.volumeKerucut(mt.luas_lingkaran(jari2), tinggi);
        
        // Volume Bola
        mt.volumeBola(mt.luas_lingkaran(jari2), jari2);
         
        System.exit(0);
    }
}
