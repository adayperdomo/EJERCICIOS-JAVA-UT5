/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios.java.ut5;

/**
 *
 * @author Usuario
 */
public class Piramide {
    private int numero;
    public Piramide(int numero){
        this.numero = numero;
    }
    
    public void dibujarPiramide(){
        for (int i = 1; i <= numero; i++) {
            
            for (int j = 0; j <= numero-i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (i*2-1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args){
        Piramide pira = new Piramide(6);
        pira.dibujarPiramide();
    }
}
