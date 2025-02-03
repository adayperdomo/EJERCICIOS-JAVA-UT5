/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_practico.ut5;

/**
 *
 * @author Alumno
 */
public class SumaDigitos {
    private int numero;
    public SumaDigitos(int numero){
        this.numero = numero;
    }
    
    public int calcularSuma(){
        int suma = 0;
        while (numero > 0) {
            suma += numero%10;
            numero /= 10;
        }
        return suma;
    }
    
    public static void main(String[] args){
        SumaDigitos sum = new SumaDigitos(1119);
        System.out.println("La suma del numero da: "+ sum.calcularSuma());
    }
}