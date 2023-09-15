package Aula10;

import java.util.Random;
import java.util.Scanner;

/**
  Criar uma função que recebe 2 vetores e retorna a menor 
  soma entre 1 element de cada vetor
 */
public class Atividade3 {
  
    static int menor(int a[], int b[]){
        int menor1 = 75;
        int menor2 = 75;
        int soma = 0;
        
        for(int i = 0; i < a.length; i++){
           if(a[i] < menor1){
               menor1 = a[i];
           } 
           for(int j = 0; j < b.length; j++){
               if(b[j] < menor2){
                   menor2 = b[j];
               }
           }
        }
        soma = menor1 + menor2;
        System.out.println(" O 1° número menor do vetor 1 é: " + menor1);
        System.out.println("O 1° número menor do vetor 2 é: " + menor2);
        return soma;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random gerador = new Random();
        
       // int vetor [] = {25,12,45,69,45};
       // int vetor2 [] = {8,96,45,32,25};
        
       
        
             System.out.println(" Digite o tamanho do vetor : ");
             int n = s.nextInt();
             int vetor[];
            
             vetor = new int [n];
             for( int i = 0; i<vetor.length; i++){
               vetor[i] = gerador.nextInt(10) ;
               System.out.println("vetor" + "[" + i + "]" + " = "+ vetor[i]);
               
               }
   
             System.out.println(" Digite o tamanho do vetor : ");
              int m = s.nextInt();
                int vetor2 [] ;
      
            
             vetor2 = new int [m];
             for( int i = 0; i < vetor2.length; i++){
               vetor2 [i] = gerador.nextInt(10) ;
               System.out.println("vetor" + "[" + i + "]" + " = "+ vetor2[i]);
            
             }

        int menor2 = menor(vetor, vetor2);
       System.out.println(" A soma do 1° maior e do 2° menor eh: " + menor2);
    }
}
