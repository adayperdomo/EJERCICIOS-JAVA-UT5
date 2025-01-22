/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3;

/**
 *
 * @author Alumno
 */
public class Fibonacci {
    private int Terminos;
    public Fibonacci(int Terminos){
        this.Terminos = Terminos;
    }
    
    public void generarSecuencia(){
        int a = 0, b = 1;
        
        for (int i = 2; i < Terminos; i++) {
            int siguiente = a + b;
            System.out.println(" " + siguiente);
            a = b;
            b = siguiente;
        }
    }
    
    public static void main(String[] args){
        Fibonacci fibo = new Fibonacci(7);
        fibo.generarSecuencia();
    }
}
