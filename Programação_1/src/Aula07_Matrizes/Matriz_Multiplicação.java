package Aula07_Matrizes;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Matriz_Multiplicação {
    public static void main(String[] args) {
         Scanner entrada = new Scanner (System.in);
         Random gerador = new Random();
         
         int linhas = 2;
         int colunas = 2;
         int matrizA [][] = new int [linhas][colunas];
         
         int linhas2 = 2;
         int colunas2 = 2;
         int matrizB [][] = new int [linhas2][colunas2];
          
           for (int i = 0; i<linhas; i++){
               for (int j = 0; j<colunas; j++){
                   System.out.print(" Digite um valor da matriz A:");
                   matrizA[i][j] = entrada.nextInt();
               }
           }
                 System.out.println("");
               
                 for (int i = 0; i<linhas2; i++){
                      for (int j = 0; j<colunas2; j++){
                         System.out.print(" Digite um valor da matriz B:");
                         matrizB[i][j] = entrada.nextInt();
                      }
                 }
                 
                         for (int i = 0; i<linhas; i++){
                             for (int j = 0; j<colunas; j++){
                             System.out.println(matrizA[i][j]);
                             }
                         }
                             System.out.println("");
            
                                  for (int i = 0; i<linhas2; i++){
                                       for (int j = 0; j<colunas2; j++){
                                       System.out.println(matrizB[i][j]);
                   
                                        }
                                     }
             
                                           if ( matrizA[0].length == matrizA.length){
                 
                                               int[][] matrizC = new int [linhas][colunas2];
                                               
                                                     for (int i = 0; i<linhas; i++){
                                                        for (int j = 0; j<colunas2; j++){
                                                            for (int k = 0; k < linhas2; k++){
                                                             matrizC[i][j] += matrizA[i][k] * matrizB[k][j];
                                                            }
                                                        }
                                                     }
                                                        System.out.println("");
                                                        
                                                        
                                                            for (int i = 0; i<linhas; i++){
                                                                for (int j = 0; j<colunas2; j++){
                                                                    System.out.print(matrizC[i][j]+ " ");
                                                                }
                                                            }
                                           }else{
                                               System.out.println(" nâo é possivel de realizar a multiplicação. ");
                                           }
             
             
    }
}
