package Aula01;

import java.util.Scanner;

public class ProgressaoGeometrica {
    
    /*
    Implementar um programa que lê o primeiro valor e a razão, e imprime
     os 5 seguintes valores de uma progressão geométrica.
    
    */
      public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
       int valor, razao; // Declaração do valor da PG e da razão da PG
       int cont = 1;     // Contador dos 10 termos
     
        
         System.out.println(" Digite o primeiro termo: "); // Entrada do valor do primeiro termo da PG
         valor = s.nextInt();
         System.out.println(" Digite a razao: ");  // Entrada do valor da razão
         razao = s.nextInt();
         
      
        while (cont <= 4) {
               cont++;
                      
               valor = valor * razao;
           
           System.out.println(" Termo " + cont + " = " + valor);
            
        }
     }
    
 }