/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan9;

/**
 *
 * @author luthf
 */

// Menangani Pengecekan exceptions
public class Latihan9_4 {
    public static void main(String args[]){
        try{
            throw new Exception("Throwing an exception");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
