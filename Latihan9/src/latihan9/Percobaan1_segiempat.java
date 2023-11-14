/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan9;

public class Percobaan1_segiempat {
    public void segiempat(int panjang, int lebar){
        double luas;
        double keliling;
        luas = panjang * lebar;
        System.out.println("-----------------");
        System.out.println("Panjang Segi Empat = " + panjang);
        System.out.println("Lebar segi empat = " + lebar);
        System.out.println("Luas Segi Empat = " + luas);
    }
    
    public static void main(String args[]){
        Percobaan1_segiempat se = new Percobaan1_segiempat();
        se.segiempat(10,5);
    }
}
