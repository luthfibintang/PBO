/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan11;
import java.awt.*;

public class LatihanFlowLayout extends Frame {
    public static void main(String args[]){
        LatihanFlowLayout fld = new LatihanFlowLayout();
        fld.setLayout(new FlowLayout());
        fld.add(new Button("ONE"));
        fld.add(new Button("TWO"));
        fld.add(new Button("Three"));
        fld.setSize(200, 200);
        fld.setVisible(true);
    }
}
