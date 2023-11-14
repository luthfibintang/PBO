/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan9;
import java.io.*;
/**
 *
 * @author luthf
 */
public class Latihan9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Latihan9().doTheWork();
    }
    
    public void doTheWork(){
        Object o = null;
        for (int i = 0; i<5; i++){
            try{
                o = makeObj(i);
            } catch(IllegalArgumentException e){
                System.err.println("Error : (" + e.getMessage() + ").");
                return;
            } finally {
                System.err.println("All Done");
                if(o == null){
                    System.exit(0);
                }
                System.out.println(o);
            }
        }
    }
    
    public Object makeObj(int type)
        throws IllegalArgumentException{
            if(type == 1)
                throw new IllegalArgumentException("Don't like type " + type);
            return new Object();
        }
    
}
