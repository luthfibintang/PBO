/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan9;
import javax.swing.JOptionPane;

public class Percobaan3 {
    public double luasPersegiPanjang(double p, double l){
        double luas = p * l;
        return luas;
    }
    
    public double luasSegitiga(double alas, double tinggi){
        double luas = 0.5 * alas * tinggi;
        return luas;
    }
    
    public double luasLingkaran(double diameter){
        double jari2 = diameter / 2;
        double luas = Math.PI * Math.pow(jari2, 2);
        return luas;
    }
    
    public static void main(String[] args){
        Percobaan3 main = new Percobaan3();
        // Luas Persegi Panjang
        JOptionPane.showMessageDialog(null, "Menghitung Luas Persegi Panjang");
        double panjang = Double.parseDouble(JOptionPane.showInputDialog("Input Panjang"));
        double lebar = Double.parseDouble(JOptionPane.showInputDialog("Input lebar"));
        JOptionPane.showMessageDialog(null, "Luas Persegi Panjang : " + main.luasPersegiPanjang(panjang, lebar));
        
        // Luas segitiga
        JOptionPane.showMessageDialog(null, "Menghitung Luas Segitiga");
        double alas = Double.parseDouble(JOptionPane.showInputDialog("Input Alas Segitiga"));
        double tinggi = Double.parseDouble(JOptionPane.showInputDialog("Input Tinggi Segitiga"));
        JOptionPane.showMessageDialog(null, "Luas Segitiga : " + main.luasSegitiga(alas, tinggi));
        
        JOptionPane.showMessageDialog(null, "Menghitung Luas Lingkaran");
        double diameter = Double.parseDouble(JOptionPane.showInputDialog("Input Diameter Lingkaran"));
        JOptionPane.showMessageDialog(null, "Luas Lingkaran : " + main.luasLingkaran(diameter));
        
        JOptionPane.showMessageDialog(null, "Thank u for using this app");
    }
}
