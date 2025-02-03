/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_practico.ut5;

/**
 *
 * @author Alumno
 */
public class CapicuaRango {
    private int limiteInferior;
    private int limiteSuperior;
    
    public CapicuaRango(int limiteInferior, int limiteSuperior){
        this.limiteInferior = limiteInferior;
        this.limiteSuperior = limiteSuperior;
    }
    
    public void mostrarCapicuas(){
        for (int i = limiteInferior; i <= limiteSuperior; i++) {
            int numeroOriginal = i;
            int numeroReverso = 0;
            int aux = i;  //Variable auxiliar para procesar el numero
            
            //Invertir el numero aritmeticamente
            while (aux > 0) {
                numeroReverso = numeroReverso * 10 + (aux % 10);
                aux /= 10;
            }
            
            // Si el número original es igual al número reverso, es capicúa
            if (numeroOriginal == numeroReverso) {
                System.out.println(i);
            }
        }
    }
    
    public static void main(String[] args){
        CapicuaRango capi = new CapicuaRango(10, 200);
        capi.mostrarCapicuas();
    }
}
