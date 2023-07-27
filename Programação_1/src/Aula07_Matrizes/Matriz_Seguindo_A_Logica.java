package Aula07_Matrizes;

import java.util.Arrays;
import java.util.Random;

public class Matriz_Seguindo_A_Logica {
    /*
    ▪ Gerar uma matriz aleatória cujos valores seguem a seguinte lógica:
        ▪ 𝑀 [𝑖] [𝑗] = 2∗𝑖 + 7∗𝑗 − 2 se 𝑖 < 𝑗
        ▪ 𝑀 [𝑖] [𝑗] = 3∗𝑖² − 1 se 𝑖 = 𝑗
        ▪ 𝑀 [𝑖] [𝑗] = 4∗𝑖³ − 5∗𝑗2 + 1 se 𝑖 > 𝑗
    */
    public static void main(String[] args) {
        Random gose = new Random();
        int linhas = 5;
        int colunas = 5;
        
        int M[][] = new int [linhas][colunas];
       
        for (int i=0; i<linhas; i++)
             for (int j=0; j<colunas; j++){
                 M[i][j] = gose.nextInt(10) ;
              
                    
                 if (i < j)
                    M[i][j] = (2*i) + (7 * j);
                
                 
                 else if (i == j)
                    M[i][j] = 3 * (i^2) -1;
                 
                 
                 else if (i > j)
                     M[i][j]= (4 * (i^3)) - (5 * (j^2));
                 
             }    
            for (int i = 0; i< linhas; i++)
            System.out.println(Arrays.toString(M[i]));
            
           
    }
}