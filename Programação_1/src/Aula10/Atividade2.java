package Aula10;

import java.util.Random;
import java.util.Scanner;

/**
 Criar uma função que recebe 2 vetores e retorna a menor soma entre 1 element de cada
vetor.
 */

public class Atividade2 {
         public static int soma( int[] v){
     int soma = 0;
     int maior1 = 0;
     int maior2 =0 ;
      for (int i=0; i < v.length; i++){
          if (v[i] > maior1) {
           maior2 = maior1;
           maior1 = v[i];
           }
               else if ( v[i] > maior2){
                 maior2 = v[i];
                }
          
      }
             System.out.println(" O 1° Maior é: " + maior1);
             System.out.println(" O 2° Maior é: " + maior2);
             
             soma = maior1 + maior2;
      return(soma);
  }
       public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random gerador = new Random();
        
             System.out.println(" Digite o tamanho do vetor : ");
             int n = s.nextInt();
             int vetor[];
            
             vetor = new int [n];
             for( int i = 0; i<vetor.length; i++){
               vetor[i] = gerador.nextInt(10) ;
               System.out.println("vetor" + "[" + i + "]" + " = "+ vetor[i]);
               
               }
          
        System.out.println(" A soma do 1° maior e do 2° maior eh: " + soma(vetor));
         }
}
  