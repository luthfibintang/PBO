/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan9;

/**
 *
 * @author luthf
 */
public class Faktorial {
    public void faktorial(int x){
        int result = 1;
        if(x < 2){
           result = 1; 
        } else{
            for(int i = 1; i <= x; i++){
            result *= i; 
            }
        }
        
        System.out.println(result);
    }
    
    public static void main(String[] args){
        Faktorial f = new Faktorial();
        
        f.faktorial(4);
        f.faktorial(5);
    }
}
