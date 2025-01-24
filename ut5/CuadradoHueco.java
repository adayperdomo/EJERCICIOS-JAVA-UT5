/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios.java.ut5;

/**
 *
 * @author Usuario
 */
public class CuadradoHueco {
    private int numero;
    public CuadradoHueco(int numero){
        this.numero = numero;
    }
    
    public void dibujarCuadrado(){
        for (int i = 1; i <= numero; i++) {
            
            for (int j = 1; j <= numero; j++) {
                if (i == 1 || i == numero) {
                    System.out.print("-");
                }else{
                    if (j == 1 || j == numero) {
                        System.out.print("-");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        CuadradoHueco cuad = new CuadradoHueco(6);
        cuad.dibujarCuadrado();
    }
}
