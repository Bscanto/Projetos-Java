
package Aula01_revisao;

import java.util.Arrays;
import java.util.Random;

/**
 Faça um programa que gere as seguintes matrizes
 */
public class exercicio2_matriz2 {
    public static void main(String[] args) {
            Random gerador = new Random();
            
            int linhas = 4;
            int colunas = 4;
            
            int A [][] = new int [linhas][colunas];
            int B [][] = new int [linhas][colunas];
           
            for (int i=0; i<linhas; i++)
                for (int j=0; j<colunas; j++){
                    A[i][j] = gerador.nextInt(10);
                    B[j][i] = A [j][i];  
            }
            System.out.println(" A : ");
            for ( int i=0; i<linhas; i++){
                System.out.println(Arrays.toString(A[i]));
            }
            System.out.println(" Matriz triangular Inferior :");
            for ( int i=0; i<linhas; i++){
                System.out.println(Arrays.toString(B[i]));
            }      
   }
}