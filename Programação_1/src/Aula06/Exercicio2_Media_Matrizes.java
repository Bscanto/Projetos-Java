package Aula06;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercicio2_Media_Matrizes {
    /*
    Criar Duas matrizes e mostrar a soma delas A + b = C
    */

   public static void main(String[] args) {
        Random gerador = new Random();
        
        int linhas = 3;
        int colunas = 2;
        int A[][] = new int[linhas][colunas];
        int B[][] = new int[linhas][colunas];
        int C[][] = new int[linhas][colunas];
        double Media[][] = new double[linhas][colunas];
        
        for (int i=0;i<linhas;i++)
            for (int j=0;j<colunas;j++){
                A[i][j] = gerador.nextInt(20);
                B[i][j] = gerador.nextInt(20);
                C[i][j] = gerador.nextInt(20);
                Media[i][j] = ( A[i][j] + B[i][j] + C[i][j] ) /3.0;
              
            }
        System.out.println("A:");
        for (int i=0;i<linhas;i++)
            System.out.println(Arrays.toString(A[i]));
        
        System.out.println("=========");
        
        System.out.println("B:");
        for (int i=0;i<linhas;i++)
            System.out.println(Arrays.toString(B[i]));
        
        System.out.println("=========");
        
        System.out.println("C:");
        for (int i=0;i<linhas;i++)
            System.out.println(Arrays.toString(C[i]));
        
        System.out.println(" A média das Matrizes é : ");
        for (int i=0;i<linhas;i++)
            System.out.println(Arrays.toString(Media[i]));
    }
}