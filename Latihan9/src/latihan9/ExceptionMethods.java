/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan9;

/**
 *
 * @author luthf
 */
public class ExceptionMethods {
    public static void main(String[] args){
        try{
            throw new Exception("My Execption");
        } catch (Exception e) {
            System.err.println("Caught Exception");
            System.err.println("getMessage() : " + e.getMessage());
            System.err.println("getLocalizedMessage()" + e.getLocalizedMessage());
            System.err.println("toString():" + e);
            System.err.println("printStackTrace():");
            e.printStackTrace();
        }
    }
}
