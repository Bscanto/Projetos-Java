package Aula10;

import java.util.Random;
import java.util.Scanner;


/**
 Criar uma função que recebe um vetor e retorna a média aritmética
 */

public class Atividade1 {
  static double soma( int v[]){
     double soma = 0;
     double media = 0;
      for (int i=0; i<v.length;i++){
          soma = soma + v[i] ;
          }
      media = soma / v.length;
      return(media);
  }
         public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random gerador = new Random();
        
             System.out.println(" Digite o tamanho do vetor : ");
             int n = s.nextInt();
             int vetor[];
            
             vetor = new int [n];
             for( int i = 0; i<vetor.length; i++){
               vetor[i] = gerador.nextInt(20) ;
               System.out.println("vetor" + "[" + i + "]" + " = "+ vetor[i]);
               
               }
             
             System.out.print(" A media dos numeros é = ");
             System.out.println(soma(vetor));
                
         }
}