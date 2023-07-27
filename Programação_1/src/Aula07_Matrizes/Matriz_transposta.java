package Aula07_Matrizes;

import java.util.Arrays;
import java.util.Random;


public class Matriz_transposta {
    /*
    ▪ Faça um programa que calcule a matriz transposta
    */
    
    public static void main(String[] args) {
        Random gerador = new Random();
    
     int linhas = 4;
            int colunas = 4;
            
            int A [][] = new int [linhas][colunas];
            int B [][] = new int [linhas][colunas];
            
            for (int i=0; i<linhas; i++)
                for (int j=0; j<colunas; j++){
                    A[i][j] = gerador.nextInt(10);
                    B[j][i] = A [i] [j];
            }
            System.out.println(" A : ");
            for ( int i=0; i<linhas; i++){
                System.out.println(Arrays.toString(A[i]));
            }
            System.out.println(" B :");
            for ( int i=0; i<linhas; i++){
                System.out.println(Arrays.toString(B[i]));
            }
    }
}
