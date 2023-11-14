/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan5;
import javax.swing.*;
/**
 *
 * @author luthf
 */
public class latihan5_2 {
    public static void main(String args[]){
        int data[] = new int[5];
        
        for(int i=0; i<data.length; i++){
            data[i] = Integer.parseInt(JOptionPane.showInputDialog("Masukan nilai index ke-" + i));
            System.out.println("Index ke-" + i + " adalah "+ data[i]);
        }
        //1 - 5
        int min = data[0]; // 1
        int max = data[0]; // 1
        
//        Cari nilai minimum & maximum
        for(int i = 0; i<data.length; i++){
            if(min > data[i]){
                min=data[i];
            }
            if(max < data[i]){
                max = data[i];
            }
        }
        
//        Output
        System.out.println("Nilai minimum dalam data adalah : "+ min);
        System.out.println("Nilai maximum dalam data adalah : "+ max);
    }
    
}
