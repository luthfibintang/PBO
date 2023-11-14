/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan3;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author luthf
 */
public class Latihan3 {

    /**
     * @param args the command line arguments
     */
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
        System.out.println(value1 + ", " + value2 + ", " + value3 + "\n\n");
    }
    
}
