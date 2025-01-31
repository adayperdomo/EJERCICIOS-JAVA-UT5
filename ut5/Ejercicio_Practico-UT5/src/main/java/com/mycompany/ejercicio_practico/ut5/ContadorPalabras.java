/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_practico.ut5;

/**
 *
 * @author Alumno
 */
public class ContadorPalabras {
    private String texto;
    public ContadorPalabras(String texto){
        this.texto = texto;
    }

    public int contarPalabras(){
        String[] palabras = texto.trim().split("\\s+");
        return palabras.length;
    }
    
    public static void main(String[] args){
        ContadorPalabras cont = new ContadorPalabras("Rodrigo no se calla la boca");
        System.out.println("El numero de palabras es: " + cont.contarPalabras());
    }
}

