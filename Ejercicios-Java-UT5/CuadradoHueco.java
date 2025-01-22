/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3;

/**
 *
 * @author Alumno
 */
public class CuadradoHueco {
    private int numero;
    public CuadradoHueco(int numero){
        this.numero = numero;
    }
    
    public void dibujarCuadrado(){
        for (int altura = 1; altura <= numero; altura++) {
            
            for (int espacio = 1; espacio <= (altura*2)-1; espacio++) {
                System.out.println(" ");
            }
            
            for (int linea = 1; linea <= numero; linea++) {
                System.out.println("-");
            }         
        }
    }
    
    public static void main(String[] args){
        CuadradoHueco cua = new CuadradoHueco(6);
        cua.dibujarCuadrado();
    }
}
