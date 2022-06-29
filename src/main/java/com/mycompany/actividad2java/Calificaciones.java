package com.mycompany.actividad2java;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jakes
 */



      

public class Calificaciones {
     String Nombre = "";
        int[] calif = new int [5];
        
         public void setNombre(String pNombre){
            Scanner scanner = new Scanner (System.in);
             System.out.print("Nombre del estudiante: ");
             Nombre = scanner.nextLine();
                 
        }
         
            public void setCalificaciones(){
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Calificacion 1: ");
        calif[0] = scanner.nextInt();
        
        System.out.print("Calificacion 2: ");
        calif[1] = scanner.nextInt();
        
        System.out.print("Calificacion 3: ");
        calif[2] = scanner.nextInt();
        
        System.out.print("Calificacion 4: ");
        calif[3] = scanner.nextInt();
        
        System.out.print("Calificacion 5: ");
        calif[4] = scanner.nextInt();
        
          }  
        
        public double avgCalificaciones(){
            double promedio = 0;
            int suma = 0;
            
            for (int i=0; i<calif.length; i++){
                suma +=calif[1];
            }
            
            promedio = (suma/calif.length);
            
            System.out.println("Promedio final es: "+promedio);
            return promedio;
           
        }     
        
        public String Calificacion (double pPromedio){
        
            String nota = null;
            
            if (pPromedio>=91){
                 nota = "A";
            }
            else if (pPromedio>=81){
                 nota = "B";
            }
            else if (pPromedio>=71){
                 nota = "C";
            }
            else if (pPromedio>=61){
                 nota = "D";
            }    
            else if (pPromedio>=51){
                 nota = "E";
            }
            else if (pPromedio<=50){
                 nota = "F";
            }
            
            return nota;
        }
            
        public void imprime(double pPromedio, String pNota){
        
            System.out.println("Nombre del estudiante: "+Nombre);
            System.out.println("Calificacion 1: "+calif[0]);
            System.out.println("Calificacion 2: "+calif[1]);
            System.out.println("Calificacion 3: "+calif[2]);
            System.out.println("Calificacion 4: "+calif[3]);
            System.out.println("Calificacion 5: "+calif[4]);
            System.out.println("Promedio: "+pPromedio);
            System.out.println("Calificacion: "+pNota);
        }
        
        
    }

