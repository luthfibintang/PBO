/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan5;

/**
 *
 * @author luthf
 */
public class ArrayDinamis {
    public static void main(String args[]){
        double[] contoh = new double[30];
        for (int i=0; i<30; i++)
            contoh[i]=100.0 * Math.random();
        double ratarata = 0.0;
        for(int i=0; i<30;i++){
            ratarata += contoh[i];
        }
        ratarata /=30;
        System.out.println("Mean 30 bilangna random : "+ratarata);
    }
}
