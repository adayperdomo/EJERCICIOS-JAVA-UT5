/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_practico.ut5;

/**
 *
 * @author Alumno
 */
public class AnioBisiesto {
    private int anio;
    public AnioBisiesto(int anio){
        this.anio = anio;
    }
    
    public void esBisiesto(){
        if (anio % 4 ==0) {
            System.out.println(anio + " Es un anio bisiesto");
        }else{
            System.out.println(anio + " No es anio bisiesto");
        }
    }
    
    public static void main(String[] args){
        AnioBisiesto anio = new AnioBisiesto(2025);
        anio.esBisiesto();
    }
}
