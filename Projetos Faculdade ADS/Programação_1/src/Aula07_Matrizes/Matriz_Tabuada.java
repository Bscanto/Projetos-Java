package Aula07_Matrizes;

import java.util.Arrays;
import java.util.Random;

public class Matriz_Tabuada {
    public static void main(String[] args) {
            
           int A [][] = new int [9][9];
            Random gerador = new Random();
           
           
           for (int i = 0; i<A.length; i++)
               for (int j = 0; j<A.length; j++){
                 
                   A[i][j] = (i + 1) * (j + 1);
                   
                }
           
                 System.out.println(" Resultado : ");
                 for (int i=0; i<A.length;i++){
                     System.out.println(Arrays.toString(A[i]));
                   }
    }
}
                 
