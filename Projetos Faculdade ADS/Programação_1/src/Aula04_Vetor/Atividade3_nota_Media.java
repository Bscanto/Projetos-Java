
package Aula04_Vetor;

import java.util.Scanner;

/*
Faça um programa que lê 5 notas de um aluno e mostra na tela
    ▪ A média das notas.
    ▪ A menor nota.
*/
public class Atividade3_nota_Media {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        float maior = 0, menor = 0, media = 0, somanotas = 0;
        int i = 0;
        int notas[] = new int [5]; 
          
         for ( i = 0;i< 5; i++){
             
        System.out.println("Digite a nota na posição" + i + ":");
          notas[i] = s.nextInt();
          } 
         
         for ( i = 0;i < notas.length; i++){
             System.out.println(notas[i] + ",");
          }
        for ( i = 0;i < 5; i++){
            if (notas[i] < menor){
            menor = notas[i];
            somanotas += notas[i];
            }
              somanotas += notas[i];
        }
         
           media = somanotas / 5;
           
           System.out.println(" A menor nota é: " + menor);
           System.out.println(" A media das notas é: " + media);
        
        
    }
}
