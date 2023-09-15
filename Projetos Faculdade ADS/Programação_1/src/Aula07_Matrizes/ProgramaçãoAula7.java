package Aula07_Matrizes;

import java.util.Arrays;
import java.util.Random;

public class ProgramaçãoAula7 {

    public static void main(String[] args) {
       Random gerador = new Random();
       
       int colunas = 6;
       int linhas = 3;
        
       Random rand = new Random();
       
        int m[ ][ ] = new int[linhas][colunas];
// Gerando valores aleatórios para a matriz
        for (int i=0; i<m.length; i++)
        for (int j=0; j<m[i].length; j++)
        m[i][j] = rand.nextInt(20);
        
        for (int i=0; i< m.length; i++)
        System.out.println(Arrays.toString(m[i]));
        
        // Imprime menor valor
    System.out.println( Math.min(14,30) );

        
    }
    
}
