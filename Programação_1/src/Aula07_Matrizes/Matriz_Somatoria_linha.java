package Aula07_Matrizes;

import java.util.Arrays;
import java.util.Random;

public class Matriz_Somatoria_linha {
/*
    ▪ Calcular o somatório de cada linha
    ▪ Encontrar o maior valor da matriz
    ▪ Contar quantos valores positivos tem na matriz
 */ 
    public static void main(String[] args) {
                    
                 
         int soma = 0;
         int maior = 0;
         int positivo = 0;
         int m[][] = new int [5][5];
          Random gerador = new Random();
         
         for (int i=0; i<m.length; i++){  
              soma = 0;
             for (int j=0; j<m[i].length; j++){
                 m[i][j] = gerador.nextInt(5) ;
                 soma +=  m[i][j];
                 
                 if (m[i][j] > maior) {
                     maior = m[i][j];
                 }
                 if (m[i][j] > 0)
                positivo ++;
                 
          
             }
             System.out.println(" A soma da linha " + i + " = " + soma ); 
              
         }
              for (int i=0; i<m.length; i++){
                System.out.println(Arrays.toString(m[i]));
                }
           System.out.println(" O maior valor da matrie é:" + maior);   
           System.out.println("Os quantidade de numeros positivos é :" + positivo);
    }
}
