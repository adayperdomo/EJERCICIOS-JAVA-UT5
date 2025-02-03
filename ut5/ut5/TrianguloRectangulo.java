/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_practico.ut5;

/**
 *
 * @author Alumno
 */
public class TrianguloRectangulo {
    private int numero;
    
    public TrianguloRectangulo(int numero){
        this.numero = numero;
    }
    
    public void generarTriangulo(){
        for (int i = 0; i < numero; i++) {
            
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void main(String [] args){
        TrianguloRectangulo tri = new TrianguloRectangulo(6);
        tri.generarTriangulo();
    }
}
