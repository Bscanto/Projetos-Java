
package Aula01_revisao;

import java.util.Arrays;
import java.util.Scanner;

/**
 Faça um programa que gere as seguintes matrizes
 */
public class exercicio2_matriz3 {
    
 public static int[][] gerarMatriz(int linhas, int colunas) {
    int[][] matriz = new int[linhas][colunas];
    int contador = 0;

    for (int i = 0; i < linhas; i++) {
        for (int j = 0; j < colunas; j++) {
            matriz[i][j] = j *(j*1);
        }
    }
    return gerarMatriz(linhas, colunas);
}
 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
       int matriz[ ][ ] = new int[3][7];
        
            System.out.println(matriz);
        } 
    }