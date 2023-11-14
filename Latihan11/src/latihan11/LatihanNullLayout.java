/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan11;
import java.awt.*;
import javax.swing.*;

public class LatihanNullLayout extends JFrame{
    Checkbox unta = new Checkbox("Nama kamu siapa");
    Checkbox kuda = new Checkbox("Nama kamu anton");
    Checkbox kuda2 = new Checkbox("Nama kamu wong"); 
    CheckboxGroup checkboxGroup = new CheckboxGroup();
    LatihanNullLayout(){
        super("PROGRAM MENGHITUNG ZAKAT");
        setLocation(200, 100);
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    void objek(){
        getContentPane().setLayout(null);
        getContentPane().add(unta);
        getContentPane().add(kuda);
        getContentPane().add(kuda2);
        unta.setBounds(30, 90, 150, 20);
        kuda.setBounds(30, 120, 150, 20);
        kuda2.setBounds(30, 150, 150, 20);
        setVisible(true);
    }
    
    public static void main(String args[]){
        LatihanNullLayout lnl = new LatihanNullLayout();
        lnl.objek();
    }
}
