/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan9;

/**
 *
 * @author luthf
 */
public class NeverCaught {
    static void f(){
        throw new RuntimeException("From f()");
    }
    
    static void g(){
        f();
    }
    
    public static void main(String[] args){
        g();
    }
}
