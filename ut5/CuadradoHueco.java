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
        //Primera linea
        for (int i = 0; i < numero+2; i++) {
        System.out.print("*");
        }
        System.out.println(); //Salto de linea
        
        //lineas intermedias
        for (int i = 0; i <= numero-2; i++) {
        System.out.print("*");//primer asterisco
            for (int j = 0; j < numero; j++) {
            System.out.print(" ");//espacio en medio
        }
        System.out.print("*");//ultimo asterisco
        System.out.println();
        }
        for (int i = 0; i < numero+2; i++) {
        System.out.print("*");//ultimo asterisco y salto de linea
        }
        System.out.println();//salto de linea
    }
    
    public static void main(String[] args){
        CuadradoHueco cua = new CuadradoHueco(4);
        cua.dibujarCuadrado();
    }
}
