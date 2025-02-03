/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_practico.ut5;

/**
 *
 * @author Alumno
 */
public class NumeroPerfecto {
    private int numero;
    public NumeroPerfecto(int numero){
        this.numero = numero;
    }
    
    public boolean esPerfecto(){
        int suma = 0;
        for (int i = 1; i <= numero/2; i++) {
            if (numero % i == 0) {
                suma += i;
            }
        }
        return suma == numero;
    }
    
    public static void main(String[] args){
        NumeroPerfecto tipo = new NumeroPerfecto(28);
        System.out.println("El numero es perfecto: "+ tipo.esPerfecto());
    }  
}
