/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luthf
 */

public class mesinCuci {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++){
            System.out.println("deret angka ke-" + i);
        }
        for(int i = 1; i<= 50; i++){
            if(i%5 == 0){
                System.out.print(i + " ");
            }
        }
        for(int i= 1; i<=15; i++){
            if(i%2 == 1){
                System.out.print(i + " ");
            }
        }
        System.out.println("");
        for(int i = 2; i <= 17; i++){
            boolean prime = true;
            for(int j = 2; j < i; j++){
                if(i%j == 0){
                    prime = false;
                }
            }
            if(prime == true){
                System.out.print(i + " ");
            }
        }
        System.out.println("");
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            for(int j = i; j <= 5; j++){
                System.out.print(" ");
            }
            for(int j = i; j <= 5; j++){
                System.out.print(j);
            }
            System.out.println("");
        }
        System.out.println("");
        for(int i = 1; i <= 5; i++){
            for(int j = i; j <= 5; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for(int j = 1; j <= i-1; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(" ");
            }
            for(int j = 5; j >= i; j--){
                System.out.print("*");
            }
            for(int j = 4; j >= i; j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
