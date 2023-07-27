package Aula03_vetor;

import java.util.Scanner;

/*
Implementar um algoritmo que lê 5 valores do teclado,
coloca eles na ordem de entrada no vetor, 
e mostra eles na ordem em que foram inseridos.
Parte 2: mostre os valores na ordem inversa de que foram inseridos

*/
public class Exercicio2 {
     public static void main(String[] args) {
        Scanner s = new Scanner (System.in); //método Scanner para entrada de dados]
        
          int quantidade = 5;
                
         String elementos   = "Valores fornecidos na ordem são >> ";
         String saidafinal  ;
         String inverso    = " Valores fornecidos inverso são >> ";
        
            int array[] = new int[quantidade];
            
               System.out.println(" Digite 5 valores.");
               
               for(int i = 0;i < quantidade;i ++){
            
           
               System.out.println("Entre com os valores" + (i+1));
               array[i]  = s.nextInt();
            
                elementos =  elementos + " - " + array[i];
               }
                 for(int i = 0;i < quantidade;i ++){
                 }
        
                    saidafinal = "Numero de elementos >> "   + quantidade + "\n";
                    saidafinal = saidafinal + elementos    + "\n";
                            
                      System.out.println("Resultado: " +saidafinal);
              
                    // saída de dados
                   for(int i = array.length-1; i >= 0; i--){
                   System.out.println(inverso + " - " + array[i]);
                    }
     
     }
}
