/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan9;

class Animal extends Exception {}
class Mammal extends Animal {} // Corrected the typo in the class name

public class Human {
    public static void main(String[] args){
        try{
            throw new Mammal();
        } catch(Mammal m){
            System.err.println("It is mammal");
        } catch(Animal a) {
            System.err.println("It is animal");
        }
    }
}

