/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan9;
import java.util.*;

public class Percobaan2 {
    public void sigma(double x, int iterasi){
        int result = 0;
        for(int i = 1; i <= iterasi; i++){
            result += x + 2*i;
        }
        System.out.println(result);
    }
    public static void main(String[] args){
        Percobaan2 main = new Percobaan2();
        Scanner input = new Scanner(System.in);
        System.out.print("Input nilai x : ");
        int x = input.nextInt();
        System.out.print("Input jumlah iterasi (n) : ");
        int n = input.nextInt();
        main.sigma(x, n);
    }
}
