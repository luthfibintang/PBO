/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan3;
import java.util.Arrays;

/**
 *
 * @author luthf
 */
public class latihan3_3 {
    public static void main(String[] args) {
        String[] nama = {"Adi", "Budi", "Caca", "Deny"};
        Integer[] nilai = {70, 65, 90, 75};
        String[] grade = new String[nama.length];
        Integer nilai_terendah  = nilai[0];
        Integer nilai_tertinggi = nilai[0];
//        Looping untuk memasukan nilai kedalam array grade berdasarkan nilai sesuai index
        for(int i = 0; i < nama.length; i++){
          // Kondisi untuk mencari grade yang sesuai(pake ternary biar singkat)
            grade[i] = (nilai[i] >= 86) ? "A" :
                    (nilai[i] >= 76) ? "B+" :
                    (nilai[i] >= 66) ? "B" :
                    (nilai[i] >= 56) ? "C+" :
                    (nilai[i] >= 46) ? "C"   :
                    (nilai[i] >= 36) ? "D" : "E";
//            Cari value tertinggi dan terendah
            nilai_terendah = Math.min(nilai_terendah, nilai[i]);
            nilai_tertinggi = Math.max(nilai_tertinggi, nilai[i]);
        }
        
//        Print hasil ujian
        for(int i = 0; i < nama.length; i++){
            System.out.println(nama[i] + " : " + nilai[i] + " (" + grade[i] + ")");
        }
//        Print nilai terendah dan tertinggi
        System.out.println("Nilai Terendah: " + nilai_terendah + " Oleh " + nama[Arrays.asList(nilai).indexOf(nilai_terendah)]);
        System.out.println("Nilai Tertinggi: " + nilai_tertinggi + " Oleh " + nama[Arrays.asList(nilai).indexOf(nilai_tertinggi)]);
    }
}
