/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author luthf
 */
public class cariGanjilGenap {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Masukan jumlah angka : ");
        int n = 0, ganjilCounter = 0, genapCounter = 0;
        try{
            n = Integer.parseInt(reader.readLine());
            for(int i = 0; i < n; i++){
                System.out.print("Masukan Angka ke-" + (i + 1) + " :");
                int number = Integer.parseInt(reader.readLine());
            }
        } catch(IOException e){
            System.out.println("Error");
        }
    }
}
