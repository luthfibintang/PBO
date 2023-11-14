/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan5;

import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author luthf
 */
public class latihan5_3 {
    public static void main(String args[]){
        int jmlNimGanjil = Integer.parseInt(JOptionPane.showInputDialog("Masukan jumlah NIM ganjil yang akan diinput :"));
        int jmlNimGenap = Integer.parseInt(JOptionPane.showInputDialog("Masukan jumlah NIM genap yang akan diinput : "));
        int totalNim = jmlNimGanjil+jmlNimGenap;
        int nim[] = new int[totalNim];
        int i = 0;
        while (i < jmlNimGenap){
            int data = Integer.parseInt(JOptionPane.showInputDialog("masukan NIM dengan bilangan genap : " + i));
            if(data%2 == 0){
                nim[i] = data;
                i++;
            } else {
                JOptionPane.showMessageDialog(null, "NIM yang anda masukan adalah nim genap, silahkan masukan nim kembali");
            }
        }
        i=nim.length-jmlNimGenap;
        System.out.println(i);
         while (i < totalNim){
            Scanner input = new Scanner(System.in);
            System.out.print("Masukan NIM dengan bilangan ganjil : ");
            int data = input.nextInt();
            if(data%2 == 1){
                nim[i] = data;
                i++;
            } else {
                System.out.println("NIM yang anda masukan adalah nim genap, silahkan masukan nim kembali");
            } 
        }
         
//      Menampilkan nilai tertinggi dan terendah
        int min = nim[0], max = nim[0];
        for(int j = 0; j<nim.length; j++){
            if(min > nim[j]){
               min = nim[j];
            } else if (max < nim[j]){
                max = nim[j];
            }
        }
        int indexMin = 0, indexMax = 0;
        for(int j = 0; j<nim.length; j++){
            if(min == nim[j]){
                indexMin = j;
            } else if(max == nim[j]){
                indexMax = j;
            }
        }
        System.out.println("\nNIM terkecil adalah " + min + " dengan index " + indexMin);
        System.out.println("NIM terbesar adalah " + max + " dengan Index " + indexMax);
        
//       Mencari Rata-rata
        double ratarata = 0;
        for(int j=0; j<nim.length; j++){
            ratarata +=nim[j];
        }
        ratarata /= nim.length;
        System.out.println("\nRata-rata Nim adalah : " + ratarata);
//      Mengurutkan element secara ascending 
        for(int j = nim.length-1; j >= 1; j--){
            System.out.println(j);
            for(int k = 0; k < j; k++){
                if(nim[j] < nim[k]){
                    int temp = nim[j];
                    nim[j] = nim[k];
                    nim[k] = temp;
                }
            }
        }
        System.out.println("\nNIM :");
        for(int j = 0; j<nim.length; j++){
            System.out.println(j+1 + ". " + nim[j]);
        }
    }
}
