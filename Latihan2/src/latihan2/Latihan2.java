/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan2;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author luthf
 */
public class Latihan2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        String str = "Hello World";
        String anotherString = "hello world";
        Object objStr = str;
        System.out.println( str.compareTo(anotherString) );
        System.out.println( str.compareToIgnoreCase(anotherString) );
        System.out.println(str.compareTo(objStr.toString()));
        
        String strOrig = "Hello world ,Hello Reader";
        int lastIndex = strOrig.lastIndexOf("Hello");
        if(lastIndex == - 1){
        System.out.println("Hello not found");
        }else{
        System.out.println("Last occurrence of Hello is at index "+ lastIndex);
        }
    }
    
    
}

class Typetester {
    void printType(byte x) {
        System.out.println(x + " is an byte");
    }
    void printType(int x) {
        System.out.println(x + " is an int");
    }
    void printType(float x) {
        System.out.println(x + " is an float");
    }
    void printType(double x) {
        System.out.println(x + " is an double");
    }
    void printType(char x) {
        System.out.println(x + " is an char");
    }
}
