package Aula06;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ProgramaçãoAula6 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int colunas = 6;
        int linhas = 3;
        Random rand = new Random();
        
        int m[ ][ ] = new int[linhas][colunas];

        for (int i=0; i<m.length; i++)
          for (int j=0; j<m[i].length; j++)
        m[i][j] = rand.nextInt(20);
        
        for (int i=0; i< m.length; i++)
        System.out.println(Arrays.toString(m[i]));
        
        System.out.println( Math.min( 10, 15) );
        
    }
    
}
