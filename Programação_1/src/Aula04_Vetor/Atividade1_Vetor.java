package Aula04_Vetor;

import java.util.Arrays;
import java.util.Scanner;

public class Atividade1_Vetor {
    
    /*
    Faça um programa que leia 10 números e gere um novo vetor onde
      ▪ Posições pares terão seu valor multiplicado por 2.
      ▪ Posições ímpares não terão o valor modificado.
    */
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
    
        int tam = 10;
        int  vetor1 [] = new int [tam];
        
         for ( int i = 0; i < tam; i++){
          
          System.out.println(" Digite os 10 numeros : ");
          vetor1 [i] = s.nextInt();
          
          if ( vetor1[i] % 2 == 0)
              vetor1 [i] = vetor1[i] * 2;
          
          else if ( vetor1[i] % 2 == 1)
              vetor1 [i] = vetor1 [i] * 1;
          
          System.out.println(Arrays.toString(vetor1));
      }
          
   }
}