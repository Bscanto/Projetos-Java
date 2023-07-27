package Aula06;

import static java.lang.Math.min;
import java.util.Arrays;
import java.util.Random;


public class Exercicio3_Minimo_matriz {
    /*
    imprimir matrim min de (A+B)
    */

   public static void main(String[] args) {
        Random gerador = new Random();
        
        int linhas = 3;
        int colunas = 2;
        int A[][] = new int[linhas][colunas];
        int B[][] = new int[linhas][colunas];
        int Min[][] = new int[linhas][colunas];
        
        for (int i=0;i<linhas;i++)
            for (int j=0;j<colunas;j++){
                A[i][j] = gerador.nextInt(20);
                B[i][j] = gerador.nextInt(20);
                
                if (A[i][j] < B[i][j]){
                   Min[i][j] = A[i][j];
                }
                 else{
                  Min[i][j] = B[i][j];
                 }
            }
               System.out.println("A:");
               for (int i=0;i<linhas;i++)
               System.out.println(Arrays.toString(A[i]));
        
               System.out.println("=========");
        
              System.out.println("B:");
              for (int i=0;i<linhas;i++)
              System.out.println(Arrays.toString(B[i]));
        
              System.out.println("=========");
                
               System.out.println(" O minimo da matriz  é : ");
               for (int i=0;i<linhas;i++)
               System.out.println(Arrays.toString(Min[i]));
    }
}
