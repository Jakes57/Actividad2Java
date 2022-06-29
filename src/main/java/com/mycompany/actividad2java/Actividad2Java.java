/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.actividad2java;

import java.util.Scanner;



/**
 *
 * @author jakes
 */
public class Actividad2Java {
    
    
    public static void main(String[] args) {
    
        Calificaciones myCalificaciones = new Calificaciones();
        
          String pNombre = null;
        
        myCalificaciones.setNombre(pNombre);
        
        myCalificaciones.setCalificaciones();
        
        double promedio = myCalificaciones.avgCalificaciones();
       
        String nota = myCalificaciones.Calificacion(promedio);
        
        myCalificaciones.imprime(promedio, nota);
        
        
   
    }      
}  

          
     
    

    
    


    