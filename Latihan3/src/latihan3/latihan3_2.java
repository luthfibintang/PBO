/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan3;
import javax.swing.JOptionPane;
/**
 *
 * @author luthf
 */
public class latihan3_2 {
    public static void main(String[] args){
        int nilai_jualbarang, pendapatan = 0;
        nilai_jualbarang = Integer.parseInt(JOptionPane.showInputDialog("Masukan Jumlah Penjualan : "));
        if (nilai_jualbarang <= 2000000) {
            pendapatan = ((nilai_jualbarang*10/100)+ 100000);
        } else if (nilai_jualbarang > 2000000 && nilai_jualbarang <= 5000000){
            pendapatan = ((nilai_jualbarang*15/100)+ 200000);
        } else if (nilai_jualbarang > 5000000) {
            pendapatan = ((nilai_jualbarang*20/100)+ 300000);
        } else {
            System.out.println("Input tidak valid");
        }
        JOptionPane.showMessageDialog(null, "Jumlah pendapatan salesman adalah : " + pendapatan);
    }
}
