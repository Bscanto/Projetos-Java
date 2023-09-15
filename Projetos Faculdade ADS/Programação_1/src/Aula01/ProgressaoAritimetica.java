package Aula01;

import java.util.Scanner;

public class ProgressaoAritimetica {
    
    /* Implementar um programa que lê o primeiro valor e a razao
    e imprima:
    Os 10 seguintes valores de uma progressão aritmetica.
    */
    
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
       int valor, razao; // Declaração do valor da PA e da razão da PA
       int cont = 1;     // Contador dos 10 termos
     
        
         System.out.println(" Digite o primeiro termo: "); // Entrada do valor do primeiro termo
         valor = s.nextInt();
         System.out.println(" Digite a razao: ");  // Entrada do valor da razão
         razao = s.nextInt();
         
      
        while (cont <= 9) {
               cont++;
                      
               valor = valor + razao;
           
           System.out.println(" Termo " + cont + " = " + valor);
            
        }
     }
    
 }