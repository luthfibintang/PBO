/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan11;
import javax.swing.*;
import java.awt.*;

public class CobaGUI extends JFrame{
    Button cb1 = new Button("Pilih A");
    Button cb2 = new Button("Pilih B");
    Button cb3 = new Button("Pilih C");
    CobaGUI(){
        setTitle("Program GUI Pertamaku");
        setLocation(200, 100);
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    void objek(){
        getContentPane().setLayout(null);
        getContentPane().setBackground(Color.GREEN);
        getContentPane().add(cb1);
        getContentPane().add(cb2);
        getContentPane().add(cb3);
        cb1.setBounds(30,90,150,20);
        cb2.setBounds(30, 120, 150, 20);
        cb3.setBounds(30,150,150,20);
        setVisible(true);
    }
    
    public static void main(String[] args){
        CobaGUI ZZ = new CobaGUI();
        ZZ.objek();
    }
}
