/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author luthf
 */
public class latihan3_1 {
        public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int value1 = 0, value2 = 0, value3 = 0;
        try{
            System.out.println("Masukan Nilai Pertama : ");
            value1 = Integer.parseInt(reader.readLine());
            System.out.println("Masukan Nilai Kedua : ");
            value2 = Integer.parseInt(reader.readLine());
            System.out.println("Masukan Nilai Ketiga : ");
            value3 = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            System.out.println("Error");
        }
        System.out.println("Nilai yang dimasukan = " +value1 + ", " + value2 + ", " + value3);
        System.out.println("Nilai terbesar adalah = " + Math.max(value1, Math.max(value2, value3)));
        System.out.println("Nilai terkecil adalah = " +Math.min(value1, Math.min(value2, value3)));
    }
}
