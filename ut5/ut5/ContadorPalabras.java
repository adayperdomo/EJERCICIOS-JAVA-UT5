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
    
    public int ContarPalabras(){
        String cortar = texto.trim();
        int contador = 1;
        
        for (int i = 0; i < cortar.length() -1; i++) {
            if (cortar.charAt(i) == ' ' && cortar.charAt(i + 1) != ' ' ){
                contador += 1;
            }
        }
        return contador;
    }
    
    public static void main(String[] args){
        ContadorPalabras cont = new ContadorPalabras("Rodrigo no se calla la boca");
        System.out.println(cont.ContarPalabras());
    }
}
