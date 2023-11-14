/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan9;

/**
 *
 * @author luthf
 */
public class Percobaan1_bacaKonsol {
    public static void main(String args[]){
        System.out.print("data1 = ");
        Percobaan1_inputconsole ic = new Percobaan1_inputconsole();
        int data1 = ic.readInt();
        System.out.print("data2 = ");
        int data2 = ic.readInt();
        int data3 = data1+data2;
        System.out.println("data1 + data2 = " + data3);
    }
}
