/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_practico.ut5;

/**
 *
 * @author Alumno
 */
public class NumerosAmistosos {
    private int num1;
    private int num2;
    
    public NumerosAmistosos(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public boolean sonAmistosos(){
        int sumaDivisores1 = 0;
        int sumaDivisores2 = 0;
        
        for (int i = 1; i <= num1 / 2; i++){
            if (num1 % i == 0) {
                sumaDivisores1 += i;
            }
        }
        
        for (int i = 1; i <= num2 / 2; i++) {
            if (num2 % i == 0) {
                sumaDivisores2 += i;

            }
        }
        return sumaDivisores1 == num2 && sumaDivisores2 == num1;
    }
    
    public static void main(String[] args){
        NumerosAmistosos num = new NumerosAmistosos(220, 284);
        if (num.sonAmistosos()) {
            System.out.println("Son amistosos");
        }else{
            System.out.println("No son amistosos");
        }
    }
}
