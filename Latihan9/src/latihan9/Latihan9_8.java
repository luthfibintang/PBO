/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan9;

class MyThread extends Thread{
    public void run(){
        System.out.println("throwing in MyThread");
        throw new RuntimeException();
    }
}

public class Latihan9_8 {
    public static void main(String[] args){
        MyThread t = new MyThread();
        t.start();
        try{
            Thread.sleep(1000);
        } catch(Exception x){
            System.out.println("Caught it" + x);
        }
        System.out.println("Exiting main");
    }
}
