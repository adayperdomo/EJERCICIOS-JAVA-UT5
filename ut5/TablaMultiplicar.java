/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios.java.ut5;

/**
 *
 * @author Usuario
 */
public class TablaMultiplicar {
    private int numero;
    public TablaMultiplicar(int numero){
        this.numero = numero;
    }
    
    public void generarTabla(){
        for (int i = 1; i <=10; i++) {
            System.out.println(numero + "x" + i + "=" + (numero*i));
        }
    }
    
    public static void main(String[] args){
        TablaMultiplicar tab = new TablaMultiplicar(5);
        tab.generarTabla();
    }
}
