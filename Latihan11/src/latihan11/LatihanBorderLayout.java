/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan11;
import java.awt.*;

public class LatihanBorderLayout extends Frame {
    public static void main(String[] args){
        LatihanBorderLayout lbl = new LatihanBorderLayout();
        lbl.setLayout(new BorderLayout(10,10));
        lbl.add(new Button("NORTH"), BorderLayout.NORTH);
        lbl.add(new Button("SOUTH"), BorderLayout.SOUTH );
        lbl.add(new Button("EAST"), BorderLayout.EAST);
        lbl.add(new Button("WEST"), BorderLayout.WEST);
        lbl.add(new Button("CENTER"), BorderLayout.CENTER);
        lbl.setSize(200,200);
        lbl.setVisible(true);
    }
}
