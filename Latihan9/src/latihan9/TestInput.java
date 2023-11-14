/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan9;

class WrongInputException extends Exception {
    WrongInputException(String s){
        super(s);
    }
}

class Input {
    void method() throws WrongInputException{
        throw new WrongInputException("Wrong input");
    }
}

public class TestInput {
   public static void main(String[] args){
       try{
           new Input().method();
       } catch(WrongInputException wie){
           System.out.println(wie.getMessage());
       }
   } 
}
