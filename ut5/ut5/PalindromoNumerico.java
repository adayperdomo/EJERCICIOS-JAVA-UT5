/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_practico.ut5;

/**
 *
 * @author Alumno
 */
public class PalindromoNumerico {
    private int numero;
    public PalindromoNumerico(int numero){
        this.numero = numero;
    }
    
    public boolean esPalindromo(){
        int original = numero;
        int inverso = 0; 
        while (original != 0) {
            int digito = original % 10; //último numero
            inverso = inverso * 10 + digito; //número inverso
            original /= 10; //elimina el último dígito
        }
        return numero == inverso;
    }
    
    public static void main(String[] args){
        PalindromoNumerico pal = new PalindromoNumerico(121);
        if (pal.esPalindromo()) {
            System.out.println("El numero es un palindromo");
        }else{
            System.out.println("El numero no es un palindromo");
        }
    }
}