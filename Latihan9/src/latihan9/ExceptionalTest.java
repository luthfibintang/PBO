/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan9;

import java.util.*;

public class ExceptionalTest {
   public static void main(String args[]){
       int count = 1000000;
       Stack s = new Stack();
       System.out.println("Testing for empty Stack");
       long s1 = System.currentTimeMillis();
       for(int i = 0; i<= count; i++)
           if(!s.empty())
               s.pop();
       long s2 = System.currentTimeMillis();
       
       System.out.println((s2 - s1) + " MilliSeconds");
       System.out.println("Catching EmptyStackException");
       s1 = System.currentTimeMillis();
       for(int i =0; i <= count; i++){
           try{
               s.pop();
           } catch(EmptyStackException e){}
       }
       s2 = System.currentTimeMillis();
       System.out.println((s2 -s1) + " MilliSeconds");
   } 
}
