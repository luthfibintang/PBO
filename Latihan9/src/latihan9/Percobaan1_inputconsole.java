/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan9;
import java.io.*;

public class Percobaan1_inputconsole {
    public static String readString(){
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        String string=" ";
        try{
            string = bfr.readLine();
        } catch(IOException ex){
            System.out.println(ex);
        } return string;
    }
    public static int readInt(){
        return Integer.parseInt(readString());
    }
    public static double readdouble(){
        return Double.parseDouble(readString());
    }
}
