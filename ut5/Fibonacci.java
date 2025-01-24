/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios.java.ut5;

/**
 *
 * @author Usuario
 */
public class Fibonacci {
    private int terminos;
    public Fibonacci(int terminos){
        this.terminos = terminos;
    }
    
    public void generarSecuencia(){
        int a = 0;
        int b = 1;
        for (int i = 2; i < terminos; i++) {
            int siguiente = a + b;
            a = b;
            b = siguiente;
            System.out.println(" " + siguiente);
        }
    }
    
    public static void main(String[] args){
        Fibonacci fibo = new Fibonacci(7);
        fibo.generarSecuencia();
    }
}
